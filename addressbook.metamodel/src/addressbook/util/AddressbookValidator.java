/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package addressbook.util;

import addressbook.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see addressbook.AddressbookPackage
 * @generated
 */
public class AddressbookValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AddressbookValidator INSTANCE = new AddressbookValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "addressbook";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressbookValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return AddressbookPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case AddressbookPackage.ADDRESS_BOOK:
				return validateAddressBook((AddressBook)value, diagnostics, context);
			case AddressbookPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case AddressbookPackage.CONTACT:
				return validateContact((Contact)value, diagnostics, context);
			case AddressbookPackage.CONTACT_TYPE_ENUM:
				return validateCONTACT_TYPE_ENUM((CONTACT_TYPE_ENUM)value, diagnostics, context);
			case AddressbookPackage.STRING_ARRAY:
				return validateStringArray((String[])value, diagnostics, context);
			case AddressbookPackage.AGE_INT:
				return validateAgeInt(((Integer)value).intValue(), diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressBook(AddressBook addressBook, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(addressBook, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact(Contact contact, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(contact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTACT_TYPE_ENUM(CONTACT_TYPE_ENUM contacT_TYPE_ENUM, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringArray(String[] stringArray, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeInt(int ageInt, DiagnosticChain diagnostics, Map context) {
		boolean result = validateAgeInt_Min(ageInt, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeInt_Max(ageInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAgeInt_Min
	 */
	public static final int AGE_INT__MIN__VALUE = 25;

	/**
	 * Validates the Min constraint of '<em>Age Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeInt_Min(int ageInt, DiagnosticChain diagnostics, Map context) {
		boolean result = ageInt >= AGE_INT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(AddressbookPackage.Literals.AGE_INT, new Integer(ageInt), new Integer(AGE_INT__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAgeInt_Max
	 */
	public static final int AGE_INT__MAX__VALUE = 100;
	//AddressbookValidator
	/**
	 * Validates the Max constraint of '<em>Age Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeInt_Max(int ageInt, DiagnosticChain diagnostics, Map context) {
		boolean result = ageInt <= AGE_INT__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(AddressbookPackage.Literals.AGE_INT, new Integer(ageInt), new Integer(AGE_INT__MAX__VALUE), true, diagnostics, context);
		return result;
	}

} //AddressbookValidator
