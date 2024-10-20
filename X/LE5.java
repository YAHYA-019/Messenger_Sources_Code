package X;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* loaded from: LE5.class */
public final class LE5 {
    public static final long A00;
    public static final long A01;
    public static final L5X A02;
    public static final Unsafe A03 = A04();
    public static final boolean A04;
    public static final boolean A05;
    public static final boolean A06;
    public static final boolean A07;
    public static final boolean A08;
    public static final Class A09;

    static {
        Class cls = KcK.A00;
        A09 = cls;
        A07 = A09(Long.TYPE);
        boolean A092 = A09(Integer.TYPE);
        A06 = A092;
        Unsafe unsafe = A03;
        KJh kJh = null;
        if (unsafe != null) {
            if (cls == null || KcK.A01) {
                kJh = new KJi(unsafe);
            } else if (A07) {
                kJh = new KJh(unsafe);
            } else if (A092) {
                kJh = new KJg(unsafe);
            }
        }
        A02 = kJh;
        A05 = kJh == null ? false : kJh.A0K();
        L5X l5x = A02;
        A04 = l5x == null ? false : l5x.A0J();
        A01 = A01(byte[].class);
        A01(boolean[].class);
        boolean z = A04;
        if (z) {
            l5x.A0A(boolean[].class);
        }
        A01(int[].class);
        if (z) {
            l5x.A0A(int[].class);
        }
        A01(long[].class);
        if (z) {
            l5x.A0A(long[].class);
        }
        A01(float[].class);
        if (z) {
            l5x.A0A(float[].class);
        }
        A01(double[].class);
        if (z) {
            l5x.A0A(double[].class);
        }
        A01(Object[].class);
        if (z) {
            l5x.A0A(Object[].class);
        }
        Field A032 = A03();
        A00 = (A032 == null || l5x == null) ? -1 : l5x.A08(A032);
        A08 = AnonymousClass001.A1W(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN);
    }

    public static byte A00(byte[] bArr, long j) {
        return A02.A02(bArr, A01 + j);
    }

    public static int A01(Class cls) {
        if (A04) {
            return A02.A05(cls);
        }
        return -1;
    }

    public static Object A02(Class cls) {
        try {
            return A03.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (X.KcK.A01 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Field A03() {
        /*
            java.lang.Class r0 = X.KcK.A00
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L12
            boolean r0 = X.KcK.A01
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L16
        L12:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L16:
            r0 = r303
            if (r0 == 0) goto L36
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            r304 = r0
            java.lang.String r0 = "effectiveDirectAddress"
            r301 = r0
            r0 = r304
            r1 = r301
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L2a
            r305 = r0
            goto L2e
        L2a:
            r0 = 0
            r305 = r0
        L2e:
            r0 = r305
            if (r0 == 0) goto L36
            r0 = r305
            return r0
        L36:
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            r304 = r0
            java.lang.String r0 = "address"
            r301 = r0
            r0 = r304
            r1 = r301
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L46
            r305 = r0
            goto L4a
        L46:
            r0 = 0
            r305 = r0
        L4a:
            r0 = r305
            if (r0 == 0) goto L61
            r0 = r305
            java.lang.Class r0 = r0.getType()
            r304 = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r301 = r0
            r0 = r304
            r1 = r301
            if (r0 != r1) goto L61
            r0 = r305
            return r0
        L61:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE5.A03():java.lang.reflect.Field");
    }

    public static Unsafe A04() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Lry());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void A05(Object obj, long j, int i) {
        A02.A0E(obj, j, i);
    }

    public static void A06(Object obj, long j, Object obj2) {
        A02.A0G(obj, j, obj2);
    }

    public static void A07(Throwable th) {
        JQx.A15(LE5.class).log(Level.WARNING, AnonymousClass001.A0Z(th, "platform method missing - proto runtime falling back to safer methods: ", AnonymousClass001.A0k()));
    }

    public static void A08(byte[] bArr, byte b, long j) {
        A02.A0B(bArr, A01 + j, b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (X.KcK.A01 != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A09(java.lang.Class r301) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LE5.A09(java.lang.Class):boolean");
    }
}
