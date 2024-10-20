package X;

import java.util.Comparator;

/* loaded from: Kxe.class */
public final class Kxe {
    public static final Comparator A00;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(String.valueOf(Kxe.class.getName()).concat("$UnsafeComparator")).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = KPs.A01;
        }
        A00 = comparator;
    }
}
