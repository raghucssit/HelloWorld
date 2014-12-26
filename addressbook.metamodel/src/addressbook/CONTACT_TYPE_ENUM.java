/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package addressbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CONTACT TYPE ENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see addressbook.AddressbookPackage#getCONTACT_TYPE_ENUM()
 * @model
 * @generated
 */
public final class CONTACT_TYPE_ENUM extends AbstractEnumerator {
	/**
	 * The '<em><b>FRIENDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRIENDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRIENDS_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRIENDS = 0;

	/**
	 * The '<em><b>RELATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELATIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE = 1;

	/**
	 * The '<em><b>OFFICIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFFICIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFFICIAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFFICIAL = 2;

	/**
	 * The '<em><b>FRIENDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRIENDS
	 * @generated
	 * @ordered
	 */
	public static final CONTACT_TYPE_ENUM FRIENDS_LITERAL = new CONTACT_TYPE_ENUM(FRIENDS, "FRIENDS", "FRIENDS");

	/**
	 * The '<em><b>RELATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE
	 * @generated
	 * @ordered
	 */
	public static final CONTACT_TYPE_ENUM RELATIVE_LITERAL = new CONTACT_TYPE_ENUM(RELATIVE, "RELATIVE", "RELATIVE");

	/**
	 * The '<em><b>OFFICIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFICIAL
	 * @generated
	 * @ordered
	 */
	public static final CONTACT_TYPE_ENUM OFFICIAL_LITERAL = new CONTACT_TYPE_ENUM(OFFICIAL, "OFFICIAL", "OFFICIAL");

	/**
	 * An array of all the '<em><b>CONTACT TYPE ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CONTACT_TYPE_ENUM[] VALUES_ARRAY =
		new CONTACT_TYPE_ENUM[] {
			FRIENDS_LITERAL,
			RELATIVE_LITERAL,
			OFFICIAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>CONTACT TYPE ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CONTACT TYPE ENUM</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CONTACT_TYPE_ENUM get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CONTACT_TYPE_ENUM result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CONTACT TYPE ENUM</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CONTACT_TYPE_ENUM getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CONTACT_TYPE_ENUM result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CONTACT TYPE ENUM</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CONTACT_TYPE_ENUM get(int value) {
		switch (value) {
			case FRIENDS: return FRIENDS_LITERAL;
			case RELATIVE: return RELATIVE_LITERAL;
			case OFFICIAL: return OFFICIAL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CONTACT_TYPE_ENUM(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CONTACT_TYPE_ENUM
