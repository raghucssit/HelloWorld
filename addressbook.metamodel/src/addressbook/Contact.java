/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package addressbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link addressbook.Contact#getName <em>Name</em>}</li>
 *   <li>{@link addressbook.Contact#getAddress <em>Address</em>}</li>
 *   <li>{@link addressbook.Contact#getContactType <em>Contact Type</em>}</li>
 *   <li>{@link addressbook.Contact#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see addressbook.AddressbookPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see addressbook.AddressbookPackage#getContact_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link addressbook.Contact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see addressbook.AddressbookPackage#getContact_Address()
	 * @model required="true"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link addressbook.Contact#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Contact Type</b></em>' attribute.
	 * The literals are from the enumeration {@link addressbook.CONTACT_TYPE_ENUM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Type</em>' attribute.
	 * @see addressbook.CONTACT_TYPE_ENUM
	 * @see #setContactType(CONTACT_TYPE_ENUM)
	 * @see addressbook.AddressbookPackage#getContact_ContactType()
	 * @model
	 * @generated
	 */
	CONTACT_TYPE_ENUM getContactType();

	/**
	 * Sets the value of the '{@link addressbook.Contact#getContactType <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Type</em>' attribute.
	 * @see addressbook.CONTACT_TYPE_ENUM
	 * @see #getContactType()
	 * @generated
	 */
	void setContactType(CONTACT_TYPE_ENUM value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see addressbook.AddressbookPackage#getContact_Age()
	 * @model dataType="addressbook.AgeInt"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link addressbook.Contact#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

} // Contact
