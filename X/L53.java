package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: L53.class */
public abstract class L53 {
    public final boolean A00;
    public static final L53 A06 = new C3049JhI(5);
    public static final L53 A09 = new C3049JhI(8);
    public static final L53 A05 = new C3049JhI(4);
    public static final L53 A08 = new C3049JhI(7);
    public static final L53 A07 = new C3049JhI(6);
    public static final L53 A04 = new C3049JhI(3);
    public static final L53 A03 = new C3049JhI(2);
    public static final L53 A02 = new C3049JhI(1);
    public static final L53 A01 = new C3049JhI(0);
    public static final L53 A0B = new C3049JhI(10);
    public static final L53 A0A = new C3049JhI(9);

    public L53(boolean z) {
        this.A00 = z;
    }

    public Object A00(Bundle bundle, String str) {
        Object obj;
        String A00;
        if (this instanceof JhM) {
            11T.A0H(bundle, str);
            return bundle.get(str);
        }
        if (this instanceof C3051JhL) {
            11T.A0H(bundle, str);
            return bundle.get(str);
        }
        if (this instanceof JhK) {
            11T.A0H(bundle, str);
            return bundle.get(str);
        }
        if (this instanceof C3050JhJ) {
            11T.A0H(bundle, str);
            return bundle.get(str);
        }
        switch (((C3049JhI) this).A00) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 6:
            case 9:
            case 10:
                11T.A0H(bundle, str);
                return bundle.get(str);
            case 3:
                11T.A0H(bundle, str);
                obj = bundle.get(str);
                A00 = "null cannot be cast to non-null type kotlin.Float";
                break;
            case 5:
            case 8:
                11T.A0H(bundle, str);
                obj = bundle.get(str);
                A00 = "null cannot be cast to non-null type kotlin.Int";
                break;
            case 7:
                11T.A0H(bundle, str);
                obj = bundle.get(str);
                A00 = DKB.A00(5);
                break;
            default:
                return null;
        }
        11T.A0I(obj, A00);
        return obj;
    }

    public Object A01(String str) {
        boolean z;
        Object obj;
        if (this instanceof C3051JhL) {
            throw AnonymousClass001.A0q("Arrays don't support default values.");
        }
        if (this instanceof JhK) {
            throw AnonymousClass001.A0q("Parcelables don't support default values.");
        }
        if (this instanceof C3050JhJ) {
            throw AnonymousClass001.A0q("Arrays don't support default values.");
        }
        if (this instanceof JhM) {
            JhM jhM = (JhM) this;
            if (!(jhM instanceof C3048JhH)) {
                throw AnonymousClass001.A0q("Serializables don't support default values.");
            }
            11T.A0F(str, 0);
            Class cls = ((C3048JhH) jhM).A00;
            Object[] enumConstants = cls.getEnumConstants();
            11T.A0A(enumConstants);
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i2];
                String name = ((Enum) obj).name();
                if (name != null && name.equalsIgnoreCase(str)) {
                    break;
                }
                i = i2 + 1;
            }
            Enum r0 = (Enum) obj;
            if (r0 != null) {
                return r0;
            }
            throw AnonymousClass001.A0L(0Pz.A0w("Enum value ", str, " not found for type ", cls.getName(), '.'));
        }
        switch (((C3049JhI) this).A00) {
            case 0:
                11T.A0F(str, 0);
                return new boolean[]{AnonymousClass001.A1V(A02.A01(str))};
            case 1:
                11T.A0F(str, 0);
                if (str.equals("true")) {
                    z = true;
                } else {
                    if (!str.equals("false")) {
                        throw AnonymousClass001.A0L("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                11T.A0F(str, 0);
                return new float[]{7zM.A00(A04.A01(str))};
            case 3:
                11T.A0F(str, 0);
                return Float.valueOf(Float.parseFloat(str));
            case 4:
                11T.A0F(str, 0);
                return new int[]{AnonymousClass001.A03(A06.A01(str))};
            case 5:
            case 8:
                11T.A0F(str, 0);
                return Integer.valueOf(0CV.A0b(str, "0x", false) ? Integer.parseInt(DKC.A19(str, 2), 16) : Integer.parseInt(str));
            case 6:
                11T.A0F(str, 0);
                return new long[]{AnonymousClass001.A05(A08.A01(str))};
            case 7:
                11T.A0F(str, 0);
                String A1C = 0CV.A0Z(str, "L", false) ? 7zM.A1C(0, str.length() - 1, str) : str;
                return Long.valueOf(0CV.A0b(str, "0x", false) ? Long.parseLong(DKC.A19(A1C, 2), 16) : Long.parseLong(A1C));
            case 9:
                11T.A0F(str, 0);
                return new String[]{str};
            case 10:
                11T.A0F(str, 0);
                if (str.equals("null")) {
                    str = null;
                }
                return str;
            default:
                return null;
        }
    }

    public String A02() {
        Class cls;
        if (this instanceof C3051JhL) {
            cls = ((C3051JhL) this).A00;
        } else if (this instanceof JhK) {
            cls = ((JhK) this).A00;
        } else if (this instanceof C3050JhJ) {
            cls = ((C3050JhJ) this).A00;
        } else {
            if (!(this instanceof JhM)) {
                switch (((C3049JhI) this).A00) {
                    case 0:
                        return "boolean[]";
                    case 1:
                        return "boolean";
                    case 2:
                        return "float[]";
                    case 3:
                        return "float";
                    case 4:
                        return "integer[]";
                    case 5:
                        return "integer";
                    case 6:
                        return "long[]";
                    case 7:
                        return "long";
                    case 8:
                        return "reference";
                    case 9:
                        return "string[]";
                    case 10:
                        return "string";
                    default:
                        return null;
                }
            }
            JhM jhM = (JhM) this;
            cls = jhM instanceof C3048JhH ? ((C3048JhH) jhM).A00 : jhM.A00;
        }
        String name = cls.getName();
        11T.A0A(name);
        return name;
    }

    public void A03(Bundle bundle, Object obj, String str) {
        if (this instanceof JhM) {
            Serializable serializable = (Serializable) obj;
            7zT.A1S(bundle, str, serializable);
            ((JhM) this).A00.cast(serializable);
            bundle.putSerializable(str, serializable);
            return;
        }
        if (this instanceof C3051JhL) {
            Object obj2 = (Serializable[]) obj;
            11T.A0H(bundle, str);
            ((C3051JhL) this).A00.cast(obj2);
            bundle.putSerializable(str, (Serializable) obj2);
            return;
        }
        if (this instanceof JhK) {
            11T.A0H(bundle, str);
            ((JhK) this).A00.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
                return;
            } else {
                if (obj instanceof Serializable) {
                    bundle.putSerializable(str, (Serializable) obj);
                    return;
                }
                return;
            }
        }
        if (this instanceof C3050JhJ) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            11T.A0H(bundle, str);
            ((C3050JhJ) this).A00.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
            return;
        }
        switch (((C3049JhI) this).A00) {
            case 0:
                11T.A0H(bundle, str);
                bundle.putBooleanArray(str, (boolean[]) obj);
                return;
            case 1:
                boolean A1V = AnonymousClass001.A1V(obj);
                11T.A0H(bundle, str);
                bundle.putBoolean(str, A1V);
                return;
            case 2:
                11T.A0H(bundle, str);
                bundle.putFloatArray(str, (float[]) obj);
                return;
            case 3:
                float A00 = 7zM.A00(obj);
                11T.A0H(bundle, str);
                bundle.putFloat(str, A00);
                return;
            case 4:
                11T.A0H(bundle, str);
                bundle.putIntArray(str, (int[]) obj);
                return;
            case 5:
            case 8:
                int A032 = AnonymousClass001.A03(obj);
                11T.A0H(bundle, str);
                bundle.putInt(str, A032);
                return;
            case 6:
                11T.A0H(bundle, str);
                bundle.putLongArray(str, (long[]) obj);
                return;
            case 7:
                long A052 = AnonymousClass001.A05(obj);
                11T.A0H(bundle, str);
                bundle.putLong(str, A052);
                return;
            case 9:
                11T.A0H(bundle, str);
                bundle.putStringArray(str, (String[]) obj);
                return;
            case 10:
                11T.A0H(bundle, str);
                bundle.putString(str, (String) obj);
                return;
            default:
                return;
        }
    }

    public String toString() {
        return A02();
    }
}
