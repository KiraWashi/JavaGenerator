/**
 */
package ClassDiagram.provider;


import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Expression;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ClassDiagram.Expression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionItemProvider extends ExpressionElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOperatorPropertyDescriptor(object);
			add_namePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Expression_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Expression_operator_feature", "_UI_Expression_type"),
				 ClassDiagramPackage.Literals.EXPRESSION__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void add_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Expression__name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Expression__name_feature", "_UI_Expression_type"),
				 ClassDiagramPackage.Literals.EXPRESSION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ClassDiagramPackage.Literals.EXPRESSION__LEFT);
			childrenFeatures.add(ClassDiagramPackage.Literals.EXPRESSION__RIGHT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Expression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Expression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Expression)object).get_name();
		return label == null || label.length() == 0 ?
			getString("_UI_Expression_type") :
			getString("_UI_Expression_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Expression.class)) {
			case ClassDiagramPackage.EXPRESSION__OPERATOR:
			case ClassDiagramPackage.EXPRESSION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ClassDiagramPackage.EXPRESSION__LEFT:
			case ClassDiagramPackage.EXPRESSION__RIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__LEFT,
				 ClassDiagramFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__LEFT,
				 ClassDiagramFactory.eINSTANCE.createBooleanData()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__LEFT,
				 ClassDiagramFactory.eINSTANCE.createIntegerData()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__LEFT,
				 ClassDiagramFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__LEFT,
				 ClassDiagramFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__LEFT,
				 ClassDiagramFactory.eINSTANCE.createParameterReference()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__RIGHT,
				 ClassDiagramFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__RIGHT,
				 ClassDiagramFactory.eINSTANCE.createBooleanData()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__RIGHT,
				 ClassDiagramFactory.eINSTANCE.createIntegerData()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__RIGHT,
				 ClassDiagramFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__RIGHT,
				 ClassDiagramFactory.eINSTANCE.createAttributeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ClassDiagramPackage.Literals.EXPRESSION__RIGHT,
				 ClassDiagramFactory.eINSTANCE.createParameterReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ClassDiagramPackage.Literals.EXPRESSION__LEFT ||
			childFeature == ClassDiagramPackage.Literals.EXPRESSION__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
