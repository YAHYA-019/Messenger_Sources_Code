package X;

import java.util.Arrays;

/* loaded from: Kyg.class */
public abstract class Kyg {
    public static final L1D A00;
    public static final L1D A01;
    public static final Class A02;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.L1D, java.lang.Object] */
    static {
        Class<?> cls;
        L1D l1d;
        Class<?> cls2;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        A02 = cls;
        try {
            cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            l1d = (L1D) JQy.A0n(cls2);
            A00 = l1d;
            A01 = new Object();
        }
        l1d = null;
        A00 = l1d;
        A01 = new Object();
    }

    /* JADX WARN: Type inference failed for: r303v2, types: [java.lang.Object, X.L8w] */
    public static void A00(Object obj, Object obj2) {
        KDF kdf = (KDF) obj;
        L8w l8w = kdf.unknownFields;
        L8w l8w2 = ((KDF) obj2).unknownFields;
        L8w l8w3 = L8w.A05;
        L8w l8w4 = l8w;
        if (!l8w3.equals(l8w2)) {
            if (l8w3.equals(l8w)) {
                int i = l8w.A00 + l8w2.A00;
                int[] copyOf = Arrays.copyOf(l8w.A03, i);
                System.arraycopy(l8w2.A03, 0, copyOf, l8w.A00, l8w2.A00);
                Object[] copyOf2 = Arrays.copyOf(l8w.A04, i);
                System.arraycopy(l8w2.A04, 0, copyOf2, l8w.A00, l8w2.A00);
                ?? obj3 = new Object();
                obj3.A01 = -1;
                obj3.A00 = i;
                obj3.A03 = copyOf;
                obj3.A04 = copyOf2;
                obj3.A02 = true;
                l8w4 = obj3;
            } else {
                l8w4 = l8w;
                if (!l8w2.equals(l8w3)) {
                    if (!l8w.A02) {
                        throw AnonymousClass001.A0p();
                    }
                    int i2 = l8w.A00 + l8w2.A00;
                    L8w.A00(l8w, i2);
                    System.arraycopy(l8w2.A03, 0, l8w.A03, l8w.A00, l8w2.A00);
                    System.arraycopy(l8w2.A04, 0, l8w.A04, l8w.A00, l8w2.A00);
                    l8w.A00 = i2;
                    l8w4 = l8w;
                }
            }
        }
        kdf.unknownFields = l8w4;
    }
}
