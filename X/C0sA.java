package X;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0sA, reason: invalid class name */
/* loaded from: 0sA.class */
public final class C0sA {
    public static Class A05;
    public static Method A06;
    public static boolean A07;
    public static boolean A08;
    public static final Method A09;
    public static final Method A0A;
    public static final Method A0B;
    public static final Method A0C;
    public static final Method A0D;
    public static final Method A0E;
    public static final boolean A0F = AnonymousClass001.A1R(Build.VERSION.SDK_INT, 30);
    public static final boolean A0G;
    public static final boolean A0H;
    public static final Method A0I;
    public static final java.util.Map A0J;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final List A04;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d1  */
    static {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0sA.m163clinit():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (X.C0sA.A0G != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0sA(int r302, boolean r303) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = 0
            r304 = r0
            r0 = r301
            r1 = 0
            r0.A02 = r1
            boolean r0 = X.C0sA.A0F
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L24
            boolean r0 = X.C0sA.A0G
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L27
        L24:
            r0 = 1
            r305 = r0
        L27:
            r0 = r301
            r1 = r305
            r0.A01 = r1
            boolean r0 = X.C0sA.A0G
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A00 = r1
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r301
            r1 = r304
            r0.A04 = r1
            r0 = r301
            r1 = r302
            r0.A03 = r1
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r301
            java.lang.String r0 = X.AnonymousClass001.A0Y(r0)
            r307 = r0
            r0 = r302
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r308 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r305 = r0
            r0 = r305
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r309 = r0
            r0 = r303
            if (r0 == 0) goto L98
            java.lang.String r0 = ""
            r304 = r0
        L6e:
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = r0; r3 = r1; 
            r4 = 0
            r5 = r307
            r3[r4] = r5
            r3 = 1
            r4 = r308
            r2[r3] = r4
            r2 = 2
            r3 = r309
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = r304
            r1[r2] = r3
            r309 = r0
            java.lang.String r0 = "Creating %s for target sdk version %d [OS: %d] we will%s try to enable hidden api access if needed."
            r1 = r309
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r309 = r0
            java.lang.String r0 = "ApiBlockListExemption"
            r1 = r309
            int r0 = android.util.Log.d(r0, r1)
            return
        L98:
            java.lang.String r0 = " NOT"
            r304 = r0
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0sA.<init>(int, boolean):void");
    }

    public static String A00(Class cls) {
        String name;
        String str;
        Class<?> enclosingClass = cls.getEnclosingClass();
        if (enclosingClass != null) {
            name = enclosingClass.getName();
            str = cls.getSimpleName();
        } else {
            name = cls.getName();
            str = null;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('L');
        A0k.append(name.replace('.', '/'));
        if (str != null) {
            A0k.append('$');
            A0k.append(str);
        }
        return AnonymousClass001.A0g(A0k, ';');
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r302 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A01(java.lang.Class r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L5e
            java.lang.Class r0 = java.lang.Void.TYPE
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L16
            java.lang.String r0 = "V"
            return r0
        L16:
            r0 = r301
            boolean r0 = r0.isArray()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L36
            r0 = r301
            java.lang.Class r0 = r0.getComponentType()
            r301 = r0
            java.lang.String r0 = "["
            r304 = r0
            r0 = r301
            if (r0 != 0) goto L39
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r302 = r0
            r0 = r302
            r0.<init>()
            r0 = r302
            throw r0
        L36:
            java.lang.String r0 = ""
            r304 = r0
        L39:
            r0 = r301
            boolean r0 = r0.isPrimitive()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L56
            java.util.Map r0 = X.C0sA.A0J
            r302 = r0
            r0 = r301
            r1 = r302
            java.lang.String r0 = X.AnonymousClass001.A0b(r0, r1)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L56
        L50:
            r0 = r304
            r1 = r302
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            return r0
        L56:
            r0 = r301
            java.lang.String r0 = A00(r0)
            r302 = r0
            goto L50
        L5e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r302 = r0
            r0 = r302
            r0.<init>()
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0sA.A01(java.lang.Class):java.lang.String");
    }

    public static Method A02(Class cls, String str, Class... clsArr) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            return declaredMethod;
        } catch (Exception e) {
            android.util.Log.d("ApiBlockListExemption", String.format("Could not get %s.%s (%s)", cls, str, Arrays.toString(clsArr)), e);
            return null;
        }
    }

    public static boolean A03(C0sA c0sA, String... strArr) {
        if (c0sA.A04()) {
            AnonymousClass001.A1F("Exemption of %s is not supported", "ApiBlockListExemption", new Object[]{Arrays.toString(strArr)});
            return false;
        }
        android.util.Log.d("ApiBlockListExemption", String.format("Cannot exempt these hiddden apis: %s", Arrays.toString(strArr)));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04() {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0sA.A04():boolean");
    }
}
