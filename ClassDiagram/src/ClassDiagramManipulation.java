import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import ClassDiagram.*;
import ClassDiagram.Class;

public class ClassDiagramManipulation {
	
	// reference directe sur le type void pour faciliter les transformations
	private VoidType voidRef;

	public void sauverModele(String uri, EObject root) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			resource.getContents().add(root);
			resource.save(null);
		} catch (Exception e) {
			System.err.println("ERREUR sauvegarde du mod�le : "+e);
			e.printStackTrace();
		}
	}

	public Resource chargerModele(String uri, EPackage pack) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(pack);
			java.util.Map options = new java.util.HashMap();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			resource.load(options);
		}
		catch(Exception e) {
			System.err.println("ERREUR chargement du modele : "+e);
			e.printStackTrace();
		}
		return resource;
	}

	public ModelBase getModelBase(String modelFile) {
		Resource resource = chargerModele(modelFile, ClassDiagramPackage.eINSTANCE);
		if (resource == null) {
			System.err.println(" Erreur de chargement du modele");
			return null;
		}

		TreeIterator<EObject> it = resource.getAllContents();

		ModelBase base = null;
		while(it.hasNext()) {
			EObject obj = (EObject) it.next();
			if (obj instanceof ModelBase) {
				base = (ModelBase) obj;
				break;
			}
		}
		return base;
	}

	
	public void printModel(ModelBase model) {
	    for (ClassDiagram.Class cl : model.getAllClasses()) {
	        System.out.println("**** Class " + cl.getName());
	        System.out.println("-- attributes :");
	        for (Attribute att : cl.getAttributes()) {
	            System.out.println("    " + att.getName() + " : " + att.getType().getName());
	        }
	        System.out.println("-- methods :");
	        for (Method met : cl.getMethods()) {
	            StringBuilder methodStr = new StringBuilder();
	            methodStr.append("    ");
	            methodStr.append(met.getReturnType().getName());
	            methodStr.append(" ");
	            methodStr.append(met.getName());
	            methodStr.append(" ( ");
	            for (int i = 0; i < met.getParamTypes().size(); i++) {
	                if (i > 0) {
	                    methodStr.append(", ");
	                }
	                methodStr.append(met.getParamNames().get(i));
	                methodStr.append(" : ");
	                methodStr.append(met.getParamTypes().get(i).getName());
	            }
	            methodStr.append(" )");
	            System.out.println(methodStr.toString());
	        }
	        System.out.println("-- interfaces :");
	        for (Interface interf : cl.getInterfaces()) {
	            System.out.println("    " + interf.getName());
	        }
	    }
	    for (Interface interf : model.getAllInterfaces()) {
	        System.out.println("**** Interface " + interf.getName());
	        System.out.println("-- methods :");
	        for (Method met : interf.getMethods()) {
	            StringBuilder methodStr = new StringBuilder();
	            methodStr.append("    ");
	            methodStr.append(met.getReturnType().getName());
	            methodStr.append(" ");
	            methodStr.append(met.getName());
	            methodStr.append(" ( ");
	            for (int i = 0; i < met.getParamTypes().size(); i++) {
	                if (i > 0) {
	                    methodStr.append(", ");
	                }
	                methodStr.append(met.getParamNames().get(i));
	                methodStr.append(" : ");
	                methodStr.append(met.getParamTypes().get(i).getName());
	            }
	            methodStr.append(" )");
	            System.out.println(methodStr.toString());
	        }
	        System.out.println("-- implemented by :");
	        for (ClassDiagram.Class cl : interf.getImplementedBy()) {
	            System.out.println("    " + cl.getName());
	        }
	    }
	    System.out.println("**** Associations");
	    for (Association assoc : model.getAllAssociations()) {
	        if (assoc.getEnds().size() == 2) {
	            AssociationEnd end1 = assoc.getEnds().get(0);
	            AssociationEnd end2 = assoc.getEnds().get(1);
	            System.out.println("-- " + end1.get_class().getName() + " [ " + end1.getName() + " , " +
	                             end1.getLowerBound() + ".." + (end1.getUpperBound() == -1 ? "*" : end1.getUpperBound()) +
	                             " ] <-> " + end2.get_class().getName() + " [ " + end2.getName() + " , " +
	                             end2.getLowerBound() + ".." + (end2.getUpperBound() == -1 ? "*" : end2.getUpperBound()) + " ]");
	        }
	    }
	}
	
	public void createInterface(ModelBase model) {
		for (ClassDiagram.Class cl : model.getAllClasses()) {
			Interface interf = ClassDiagramFactory.eINSTANCE.createInterface();
			interf.setName("I" + cl.getName());
			cl.getInterfaces().add(interf);
			for (Method met : cl.getMethods()) {
				if(!isAccessor(met, cl)) {
					interf.getMethods().add(met);
				}
			}
	    }
	}
	
	private boolean isAccessor(Method method, ClassDiagram.Class cls) {
        String methodName = method.getName();
        if (methodName.startsWith("get") && method.getParamTypes().isEmpty()) {
            String attributeName = methodName.substring(3).toLowerCase();
            return hasAttributeWithName(cls, attributeName);
        }
        if (methodName.startsWith("set") && method.getParamTypes().size() == 1) {
            String attributeName = methodName.substring(3).toLowerCase();
            return hasAttributeWithName(cls, attributeName);
        }
        return false;
    }
	
	private boolean hasAttributeWithName(ClassDiagram.Class cls, String attributeName) {
        for (Attribute attr : cls.getAttributes()) {
            if (attr.getName().toLowerCase().equals(attributeName)) {
                return true;
            }
        }
        return false;
    }
	
	
	public boolean isGetter(Attribute att, Method met) {		
		if (met.getName().length() <= 4) return false;
		String nomCherche = "get"+att.getName().substring(0,1).toUpperCase()+att.getName().substring(1, att.getName().length());
		if (! met.getName().equals(nomCherche)) return false;
		if (met.getParamTypes().size() != 0 ) return false;
		if (met.getReturnType() != att.getType()) return false;
		return true;
	}
	
	public boolean isSetter(Attribute att, Method met) {
		if (met.getName().length() <= 4) return false;
		String nomCherche = "set"+att.getName().substring(0,1).toUpperCase()+att.getName().substring(1, att.getName().length());
		if (! met.getName().equals(nomCherche)) return false;
		if (met.getParamTypes().size() != 1 ) return false;
		if (met.getParamTypes().get(0) != att.getType()) return false;
		if (met.getReturnType() != this.voidRef) return false;
		return true;
	}
	
	public void addGetter(Attribute att) {
		Method met = ClassDiagramFactory.eINSTANCE.createMethod();
		met.setName("get"+att.getName().substring(0,1).toUpperCase()+att.getName().substring(1, att.getName().length()));
		met.setReturnType(att.getType());
		met.setOwner(att.getOwner());
	}

	public void addSetter(Attribute att) {
		Method met = ClassDiagramFactory.eINSTANCE.createMethod();
		met.setName("set"+att.getName().substring(0,1).toUpperCase()+att.getName().substring(1, att.getName().length()));
		met.getParamTypes().add(att.getType());
		met.getParamNames().add("value");
		met.setReturnType(this.voidRef);
		met.setOwner(att.getOwner());
	}
	
	
	public void addAccessors(ModelBase model) {
		
		for (ClassDiagram.Class cl : model.getAllClasses()) {
			for (Attribute att : cl.getAttributes()) {
				if (cl.getMethods().stream().noneMatch(m -> isGetter(att,m))) addGetter(att);
				if (cl.getMethods().stream().noneMatch(m -> isSetter(att,m))) addSetter(att);
			}
		}
	}
	
	public void removeAssociation(ModelBase model) {
        List<Association> associationsToRemove = new ArrayList<>(model.getAllAssociations());
        for (Association association : associationsToRemove) {
            AssociationEnd end1 = association.getEnds().get(0);
            AssociationEnd end2 = association.getEnds().get(1);
            
            createAttribute(end1.get_class(), end2.get_class(), 
                          end2.getName(), end2.getLowerBound(), end2.getUpperBound());
                          
            createAttribute(end2.get_class(), end1.get_class(),
                          end1.getName(), end1.getLowerBound(), end1.getUpperBound());
        }
        model.getAllAssociations().clear();
    }
    
    private void createAttribute(Class owner, Class type, String name, int lowerBound, int upperBound) {
        Attribute attribute = ClassDiagramFactory.eINSTANCE.createAttribute();
        attribute.setName(name);
        attribute.setType(type);
        attribute.setOwner(owner);
        if(upperBound == -1) {
            attribute.setMultiplicity(0);
        } else {
            attribute.setMultiplicity(upperBound);
        }
        
        owner.getAttributes().add(attribute);
    }

	
	
	
	public static void main(String argv[]) {

		ClassDiagramManipulation cdm = new ClassDiagramManipulation();

		System.out.println(" Chargement du modele\n");

		ModelBase model = cdm.getModelBase("model/Banque.xmi");
		
		cdm.voidRef = model.getVoidT();

		cdm.printModel(model);
		
		System.out.println("\n Ajout des accesseurs\n");
		cdm.addAccessors(model);

		cdm.printModel(model);

		System.out.println("\n Sauvegarde du modele");
		cdm.sauverModele("model/BanqueJava.xmi", model);
	}
}