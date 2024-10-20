package X;

import java.util.Arrays;

/* loaded from: Kyd.class */
public abstract class Kyd {
    public static final KwV A00;
    public static final KwV A01;
    public static final Class A02;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.KwV] */
    static {
        Class<?> cls;
        KwV kwV = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        A02 = cls;
        try {
            Class<?> cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            if (cls2 != null) {
                kwV = (KwV) JQy.A0n(cls2);
            }
        } catch (Throwable unused2) {
        }
        A00 = kwV;
        A01 = new Object();
    }

    /* JADX WARN: Type inference failed for: r303v2, types: [java.lang.Object, X.LAl] */
    public static void A00(Object obj, Object obj2) {
        K5Q k5q = (K5Q) obj;
        LAl lAl = k5q.zzc;
        LAl lAl2 = ((K5Q) obj2).zzc;
        LAl lAl3 = LAl.A04;
        LAl lAl4 = lAl;
        if (!lAl3.equals(lAl2)) {
            if (lAl3.equals(lAl)) {
                int i = lAl.A00 + lAl2.A00;
                int[] copyOf = Arrays.copyOf(lAl.A02, i);
                System.arraycopy(lAl2.A02, 0, copyOf, lAl.A00, lAl2.A00);
                Object[] copyOf2 = Arrays.copyOf(lAl.A03, i);
                System.arraycopy(lAl2.A03, 0, copyOf2, lAl.A00, lAl2.A00);
                ?? obj3 = new Object();
                ((LAl) obj3).A00 = i;
                ((LAl) obj3).A02 = copyOf;
                ((LAl) obj3).A03 = copyOf2;
                ((LAl) obj3).A01 = true;
                lAl4 = obj3;
            } else {
                lAl4 = lAl;
                if (!lAl2.equals(lAl3)) {
                    if (!lAl.A01) {
                        throw AnonymousClass001.A0p();
                    }
                    int i2 = lAl.A00 + lAl2.A00;
                    LAl.A01(lAl, i2);
                    System.arraycopy(lAl2.A02, 0, lAl.A02, lAl.A00, lAl2.A00);
                    System.arraycopy(lAl2.A03, 0, lAl.A03, lAl.A00, lAl2.A00);
                    lAl.A00 = i2;
                    lAl4 = lAl;
                }
            }
        }
        k5q.zzc = lAl4;
    }
}
