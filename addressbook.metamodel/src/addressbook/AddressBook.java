/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package addressbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link addressbook.AddressBook#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see addressbook.AddressbookPackage#getAddressBook()
 * @model
 * @generated
 */
public interface AddressBook extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link addressbook.Group}.
	 * It is bidirectional and its opposite is '{@link addressbook.Group#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see addressbook.AddressbookPackage#getAddressBook_Groups()
	 * @see addressbook.Group#getParent
	 * @model type="addressbook.Group" opposite="parent" containment="true" keys="name"
	 * @generated
	 */
	EList getGroups();

} // AddressBook
