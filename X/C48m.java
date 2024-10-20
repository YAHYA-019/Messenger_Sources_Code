package X;

import android.util.SparseArray;

/* renamed from: X.48m, reason: invalid class name */
/* loaded from: 48m.class */
public final class C48m {
    public Object A00;
    public final SparseArray A01 = new SparseArray(8);
    public final 1hH A02;

    public C48m(1hH r302) {
        this.A02 = r302;
    }

    public static Object A00(C48m c48m, int i) {
        int i2;
        String str;
        Object obj = c48m.A00;
        if (obj == null) {
            throw AnonymousClass001.A0Q("Attempting to use visitor without destination");
        }
        switch (i) {
            case 1:
                i2 = 0;
                str = "string";
                break;
            case 2:
            case 3:
                i2 = 1;
                str = "int";
                break;
            case 4:
                i2 = 7;
                str = "string_array";
                break;
            case 5:
            default:
                i2 = 6;
                str = "int_array";
                break;
            case 6:
                i2 = 4;
                str = "double";
                break;
            case 7:
                i2 = 5;
                str = "double_array";
                break;
            case 8:
                i2 = 2;
                str = "bool";
                break;
            case 9:
                i2 = 3;
                str = "bool_array";
                break;
        }
        SparseArray sparseArray = c48m.A01;
        Object obj2 = sparseArray.get(i2);
        if (obj2 == null) {
            obj2 = ((07S) obj).A0D(str);
            sparseArray.put(i2, obj2);
        }
        return obj2;
    }

    public void A01(String str, String str2, int i) {
        if (str2 != null) {
            try {
                switch (i) {
                    case 1:
                        07S.A00((07S) A00(this, i), str2, str);
                        return;
                    case 2:
                        07S.A00((07S) A00(this, i), Integer.valueOf(Integer.parseInt(str2)), str);
                        return;
                    case 3:
                        07S.A00((07S) A00(this, i), Long.valueOf(Long.parseLong(str2)), str);
                        return;
                    case 4:
                        this.A02.A03(A00(this, i), str, str2.split(",,,"));
                        return;
                    case 5:
                    case 10:
                        this.A02.A02(A00(this, i), str, str2.split(",,,"));
                        return;
                    case 6:
                        07S.A00((07S) A00(this, i), Double.valueOf(Double.parseDouble(str2)), str);
                        return;
                    case 7:
                        this.A02.A01(A00(this, i), str, str2.split(",,,"));
                        return;
                    case 8:
                        07S.A00((07S) A00(this, i), Boolean.valueOf(Boolean.parseBoolean(str2)), str);
                        return;
                    case 9:
                        this.A02.A00(A00(this, i), str, str2.split(",,,"));
                        return;
                    default:
                        throw 0Pz.A04("Unsupported type: ", i);
                }
            } catch (NumberFormatException e) {
                android.util.Log.w("QPL", "Failed to parse int annotation", e);
            }
        }
    }
}
