package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0s8, reason: invalid class name */
/* loaded from: 0s8.class */
public abstract class C0s8 extends C13m {
    public static final int A0z(Comparable comparable, List list, int i) {
        int i2;
        int i3 = 0;
        A19(list.size(), i);
        int i4 = i - 1;
        while (true) {
            if (i3 > i4) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + i4) >>> 1;
            int A00 = 0DX.A00((Comparable) list.get(i2), comparable);
            if (A00 >= 0) {
                if (A00 <= 0) {
                    break;
                }
                i4 = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
        }
        return i2;
    }

    public static final ArrayList A10(Object... objArr) {
        11T.A0F(objArr, 0);
        return objArr.length == 0 ? AnonymousClass001.A0s() : new ArrayList((Collection) new 08B(objArr, true));
    }

    public static final ArrayList A11(Object... objArr) {
        return new ArrayList((Collection) new 08B(objArr, true));
    }

    public static final List A12(Object obj) {
        if (obj == null) {
            return C0ty.A00;
        }
        List singletonList = Collections.singletonList(obj);
        11T.A0A(singletonList);
        return singletonList;
    }

    public static final List A13(List list) {
        int size = list.size();
        if (size == 0) {
            return C0ty.A00;
        }
        if (size == 1) {
            list = 11T.A03(list.get(0));
        }
        return list;
    }

    public static final List A14(Object... objArr) {
        11T.A0F(objArr, 0);
        if (objArr.length <= 0) {
            return C0ty.A00;
        }
        List asList = Arrays.asList(objArr);
        11T.A0A(asList);
        return asList;
    }

    public static final List A15(Object... objArr) {
        11T.A0F(objArr, 0);
        return 02L.A08(objArr);
    }

    public static final 07E A16(Collection collection) {
        11T.A0F(collection, 0);
        return new 07E(0, collection.size() - 1);
    }

    public static final void A17() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void A18() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void A19(int i, int i2) {
        if (0 > i2) {
            StringBuilder A1D = 0Pz.A1D("fromIndex (", ") is greater than toIndex (", 0);
            A1D.append(i2);
            throw AnonymousClass001.A0L(AnonymousClass001.A0d(").", A1D));
        }
        if (i2 <= i) {
            return;
        }
        StringBuilder A1D2 = 0Pz.A1D("toIndex (", ") is greater than size (", i2);
        A1D2.append(i);
        throw new IndexOutOfBoundsException(AnonymousClass001.A0d(").", A1D2));
    }
}
