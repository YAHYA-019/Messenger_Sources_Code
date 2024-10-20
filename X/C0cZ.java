package X;

import android.os.Build;
import com.facebook.common.hiddenapis.exempt.HiddenApis$TestGetCallingClassClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: X.0cZ */
/* loaded from: 0cZ.class */
public final class C0cZ {
    public static int A01 = 254;
    public static Method A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public static boolean A06;
    public static boolean A07;
    public static boolean A08;
    public static boolean A09;
    public static boolean A0A;
    public static boolean A0B;
    public static boolean A0C;
    public static volatile C0sA A0I;
    public static volatile boolean A0J;
    public final ClassLoader A00 = A0E;
    public static final 0KO A0D = new 0KO("HiddenApis");
    public static final Object A0H = AnonymousClass001.A0R();
    public static final ClassLoader A0E = C0cZ.class.getClassLoader();
    public static final Object A0F = AnonymousClass001.A0R();
    public static final java.util.Map A0G = AnonymousClass001.A0u();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v2 ??, still in use, count: 3, list:
          (r304v2 ??) from 0x0055: PHI (r304v1 ??) = (r304v0 ??), (r304v2 ??) binds: [B:13:0x001d, B:31:0x0051] A[DONT_GENERATE, DONT_INLINE]
          (r304v2 ?? I:X.0sA) from 0x0040: INVOKE (r0v20 ?? I:boolean) = (r304v2 ?? I:X.0sA) VIRTUAL call: X.0sA.A04():boolean A[Catch: all -> 0x0059, MD:():boolean (m)]
          (r304v2 ?? I:X.0sA) from 0x0052: SPUT (r304v2 ?? I:X.0sA) A[Catch: all -> 0x0059] X.0cZ.A0I X.0sA
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static X.C0sA A00() {
        /*
            boolean r0 = X.C0cZ.A0J
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L5e
            X.0sA r0 = X.C0cZ.A0I
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L12
            r0 = r302
            return r0
        L12:
            java.lang.Object r0 = X.C0cZ.A0H
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            X.0sA r0 = X.C0cZ.A0I     // Catch: java.lang.Throwable -> L59
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L55
            int r0 = X.C0cZ.A01     // Catch: java.lang.Throwable -> L59
            r305 = r0
            r0 = r305
            if (r0 >= 0) goto L2d
            r0 = 0
            r305 = r0
        L2d:
            r0 = 1
            r306 = r0
            boolean r0 = X.C0cZ.A03     // Catch: java.lang.Throwable -> L59
            r301 = r0
            X.0sA r0 = new X.0sA     // Catch: java.lang.Throwable -> L59
            r304 = r0
            r0 = r304
            r1 = r305
            r2 = r301
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L59
            r0 = r304
            boolean r0 = r0.A04()     // Catch: java.lang.Throwable -> L59
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L51
            r0 = r306
            X.C0cZ.A0J = r0     // Catch: java.lang.Throwable -> L59
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            r0 = 0
            return r0
        L51:
            r0 = r304
            X.C0cZ.A0I = r0     // Catch: java.lang.Throwable -> L59
        L55:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            r0 = r304
            return r0
        L59:
            r302 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L59
            r0 = r302
            throw r0
        L5e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0cZ.A00():X.0sA");
    }

    public static C0cZ A01(C0cZ c0cZ, int i, boolean z) {
        0KO r307;
        Object[] A1b;
        String str;
        if (c0cZ == null) {
            C0sA c0sA = A0I;
            if (c0sA != null) {
                c0sA.A02 = z;
            }
            A03 = z;
            int i2 = A01;
            if (i2 >= 0) {
                if (i != -4 && i >= 0 && i != i2) {
                    r307 = A0D;
                    A1b = AnonymousClass001.A1b(Integer.valueOf(i), i2);
                    str = "The given target sdk version %s is different than the cached sdk version %d";
                    r307.A06(str, A1b);
                }
                c0cZ = new C0cZ();
            } else if (i != -4) {
                A01 = i;
                c0cZ = new C0cZ();
            } else {
                r307 = A0D;
                A1b = new Object[0];
                str = "TargetSdkVersion is not set yet, so cannot rely on cached value";
                r307.A06(str, A1b);
                c0cZ = new C0cZ();
            }
        }
        return c0cZ;
    }

    public static Class A03(0cX r301, ClassLoader classLoader, String str) {
        C0sA A00;
        classLoader.getClass();
        if (r301 == null) {
            r301 = 0cX.A01;
        }
        try {
            return A04(r301, classLoader, str);
        } catch (ClassNotFoundException e) {
            if (!A0G(r301)) {
                02W.A05(r301.maybeHidden);
                boolean z = false;
                if (!A0J && (A00 = A00()) != null) {
                    z = A0F(A00, str);
                }
                if (z) {
                    return Class.forName(str, true, classLoader);
                }
            }
            throw e;
        }
    }

    public static Class A04(0cX r301, ClassLoader classLoader, String str) {
        Exception exc;
        if (A00() != null && AnonymousClass001.A1T(C0sA.A0A)) {
            int i = !A0H(r301, str) ? 1 : 0;
            ClassNotFoundException classNotFoundException = null;
            int i2 = i ^ 1;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < 2) {
                    int i5 = (i2 + i4) % 2;
                    if (i5 != 0) {
                        return Class.forName(str, true, classLoader);
                    }
                    try {
                        Method method = C0sA.A09;
                        if (method != null) {
                            exc = null;
                            try {
                                Class cls = (Class) method.invoke(null, str, true, classLoader);
                                if (cls != null) {
                                    return cls;
                                }
                            } catch (Exception e) {
                                e = e;
                                exc = e;
                                while (e != null) {
                                    if (e instanceof ClassNotFoundException) {
                                        break;
                                    }
                                    e = e.getCause();
                                }
                            }
                        } else {
                            return Class.forName(str, true, classLoader);
                        }
                    } catch (ClassNotFoundException e2) {
                        0KO r0 = A0D;
                        Object[] objArr = {str, i5 % 2 != 0 ? "normal" : "internal Reflect"};
                        if (0KO.A02) {
                            0KO.A02(r0.A01, "Could not load class %s from %s forName.", e2, objArr, 3, 2);
                        }
                        if (i5 == 1) {
                            classNotFoundException = e2;
                        }
                        i3 = i4 + 1;
                    }
                } else {
                    0KO r02 = A0D;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = str;
                    if (classNotFoundException != null) {
                        objArr2[1] = i != 0 ? "" : "NOT ";
                        r02.A09(classNotFoundException, "Could not find class %s (can%s be hidden)", objArr2);
                        throw classNotFoundException;
                    }
                    objArr2[1] = i != 0 ? "" : "NOT ";
                    r02.A07("Internal with forName and also could not find class %s (can%s be hidden)", objArr2);
                }
            }
        }
        return Class.forName(str, true, classLoader);
        new ClassNotFoundException(String.format("Class %s could not be found with given class loader. Error: %s", str, exc != null ? exc.getMessage() : "None found"));
        throw e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0251, code lost:
    
        if (r310 != null) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ae, code lost:
    
        r0 = r307.getDeclaringClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02b5, code lost:
    
        r0 = java.util.Arrays.toString(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02be, code lost:
    
        if (r312 == null) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c1, code lost:
    
        r314 = X.AnonymousClass001.A0X(r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02d2, code lost:
    
        if (r312 == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02d5, code lost:
    
        r310 = r312.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0311, code lost:
    
        new java.lang.InstantiationException(java.lang.String.format("Could not construct a new instance for %s with ( %s ). Error msg from %s: %s", r0, r0, r314, r310));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02df, code lost:
    
        r310 = "None found";
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02cb, code lost:
    
        r314 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00f5, code lost:
    
        if (r307 != null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x012d, code lost:
    
        r0 = java.util.Arrays.toString(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0136, code lost:
    
        if (r316 == null) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0139, code lost:
    
        r310 = r316.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0168, code lost:
    
        new java.lang.NoSuchMethodException(java.lang.String.format("Constructor for %s ( %s ) could not be found. Error msg: %s", r0, r0, r310));
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0172, code lost:
    
        throw r314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0175, code lost:
    
        r310 = "None found";
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0201 A[Catch: Exception -> 0x036b, TRY_ENTER, TryCatch #3 {Exception -> 0x036b, blocks: (B:3:0x0002, B:4:0x0005, B:9:0x0018, B:12:0x0029, B:13:0x0030, B:15:0x003b, B:18:0x004e, B:20:0x0055, B:22:0x0066, B:24:0x006f, B:26:0x0074, B:29:0x0081, B:32:0x008b, B:33:0x0092, B:36:0x009c, B:37:0x00a2, B:43:0x00b8, B:45:0x00c0, B:159:0x012d, B:162:0x0139, B:163:0x0140, B:165:0x015a, B:166:0x0161, B:168:0x0168, B:170:0x016f, B:171:0x0172, B:53:0x0103, B:57:0x019f, B:59:0x01a4, B:64:0x01b6, B:69:0x01cc, B:70:0x01d3, B:72:0x01de, B:75:0x01ea, B:77:0x01f2, B:78:0x01f7, B:81:0x0201, B:82:0x0207, B:88:0x021d, B:90:0x0225, B:107:0x02ae, B:108:0x02b5, B:111:0x02c1, B:114:0x02d5, B:115:0x02e3, B:117:0x0303, B:118:0x030a, B:120:0x0311, B:122:0x0318, B:123:0x031b, B:98:0x0260, B:139:0x02a4, B:146:0x031e, B:148:0x0326, B:97:0x0259, B:150:0x032c, B:181:0x0123, B:185:0x017c, B:187:0x0184, B:190:0x018f, B:52:0x00fc, B:192:0x0191, B:194:0x0334, B:197:0x0340, B:201:0x0355, B:202:0x035e, B:204:0x0363, B:206:0x035d, B:102:0x0239, B:104:0x0248), top: B:2:0x0002, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object A05(java.lang.Class r301, java.lang.Object... r302) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0cZ.A05(java.lang.Class, java.lang.Object[]):java.lang.Object");
    }

    public static String A06(Object obj) {
        return obj != null ? "found" : "NOT found";
    }

    public static Field A07(0cX r301, Class cls, Class cls2, String str) {
        C0sA A00;
        Throwable th;
        if (r301 == null) {
            r301 = 0cX.A01;
        }
        cls.getClass();
        try {
            boolean z = true;
            if (A03 && !A0J && r301 != null) {
                z = r301.maybeNotHidden;
            }
            C0sA A002 = A00();
            Method method = C0sA.A0C;
            if (AnonymousClass001.A1T(method) && A002 != null) {
                String name = cls.getName();
                if (!A0H(r301, name)) {
                    Exception e = null;
                    try {
                        if (str == null) {
                            throw null;
                        }
                        if (method == null) {
                            return cls.getDeclaredField(str);
                        }
                        try {
                            Field field = (Field) method.invoke(cls, str);
                            if (field != null) {
                                return field;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            Throwable th2 = e;
                            while (true) {
                                th = th2;
                                if (th == null) {
                                    break;
                                }
                                if (th instanceof NoSuchFieldException) {
                                    break;
                                }
                                th2 = th.getCause();
                            }
                        }
                        new NoSuchFieldException(String.format("Method %s.%s ( %s ) could not be found. Error msg: %s", name, str, e != null ? e.getMessage() : "None found"));
                        throw th;
                    } catch (NoSuchFieldException e3) {
                        e3.getMessage();
                        if (!z) {
                            throw e3;
                        }
                    }
                }
            }
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e4) {
            if (!A0G(r301)) {
                02W.A05(r301.maybeHidden);
                if (!A0J && (A00 = A00()) != null) {
                    StringBuilder A0o = AnonymousClass001.A0o(C0sA.A00(cls));
                    A0o.append("->");
                    if (str != null) {
                        A0o.append(str);
                        A0o.append(':');
                        if (cls2 != null) {
                            A0o.append(C0sA.A01(cls2));
                        }
                    }
                    String obj = A0o.toString();
                    if (obj != null) {
                        C0sA.A03(A00, obj);
                    }
                }
            }
            throw e4;
        }
    }

    public static Method A08() {
        boolean callAndCheckVMStackGetStackClass2;
        boolean z = A04;
        Method method = A02;
        if (!z) {
            try {
                try {
                    0cX r0 = 0cX.A00;
                    method = A0A(r0, A04(r0, A0E, "dalvik.system.VMStack"), "getStackClass2", new Class[0], false);
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    A02 = method;
                } catch (Exception e) {
                    A0D.A07("Could not get VMStack.getStackClass2. Error %s: %s", new Object[]{e.getClass(), e.getMessage()});
                    method = null;
                }
            } finally {
                A04 = true;
            }
        }
        if (method == null) {
            return null;
        }
        boolean z2 = A08;
        boolean z3 = A0C;
        if (!z2) {
            callAndCheckVMStackGetStackClass2 = HiddenApis$TestGetCallingClassClass.callAndCheckVMStackGetStackClass2(method);
            z3 = callAndCheckVMStackGetStackClass2;
            A0C = z3;
            A08 = true;
        }
        if (z3) {
            return method;
        }
        return null;
    }

    public static Method A09(0cX r301, Class cls, Class cls2, String str, Class... clsArr) {
        if (r301 == null) {
            r301 = 0cX.A01;
        }
        cls.getClass();
        try {
            boolean z = true;
            if (A03 && !A0J && r301 != null) {
                z = r301.maybeNotHidden;
            }
            return A0A(r301, cls, str, clsArr, z);
        } catch (NoSuchMethodException e) {
            if (!A0G(r301)) {
                02W.A05(r301.maybeHidden);
                A0I(cls, cls2, str, clsArr);
            }
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r310 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r0 = java.util.Arrays.toString(r304);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        if (r306 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        r310 = r306.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        new java.lang.NoSuchMethodException(java.lang.String.format("Method %s.%s ( %s ) could not be found. Error msg: %s", r0, r303, r0, r310));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        r310 = "None found";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Method A0A(X.0cX r301, java.lang.Class r302, java.lang.String r303, java.lang.Class[] r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0cZ.A0A(X.0cX, java.lang.Class, java.lang.String, java.lang.Class[], boolean):java.lang.reflect.Method");
    }

    public static void A0B(Object obj, Throwable th) {
        A0D.A0C(th, "%s: Cannot call sun.reflect.Reflection.getCallerClass on this platform", new Object[]{obj});
    }

    public static boolean A0C() {
        boolean z = A05;
        boolean z2 = A09;
        if (!z) {
            z2 = HiddenApis$TestGetCallingClassClass.testJdkInternalReflectGetCallingClass();
            A09 = z2;
            A05 = true;
        }
        return z2;
    }

    public static boolean A0D() {
        boolean z;
        if (33 <= Build.VERSION.SDK_INT) {
            z = false;
        } else {
            boolean z2 = A06;
            z = A0A;
            if (!z2) {
                boolean testSunReflectGetCallingClass = HiddenApis$TestGetCallingClassClass.testSunReflectGetCallingClass();
                A0A = testSunReflectGetCallingClass;
                A06 = true;
                return testSunReflectGetCallingClass;
            }
        }
        return z;
    }

    public static boolean A0E() {
        boolean z = A07;
        boolean z2 = A0B;
        if (!z) {
            z2 = HiddenApis$TestGetCallingClassClass.testVMStackGetCallingClassLoader();
            A0B = z2;
            A07 = true;
        }
        return z2;
    }

    public static boolean A0F(C0sA c0sA, String str) {
        java.util.Map map;
        Boolean bool;
        Object obj = A0F;
        synchronized (obj) {
            map = A0G;
            bool = (Boolean) map.get(str);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {0Pz.A0L(new String[]{str}[0].replace('.', '/'), 'L', ';')};
        android.util.Log.d("ApiBlockListExemption", String.format("Exempting classes %s", Arrays.toString(strArr)));
        boolean A032 = C0sA.A03(c0sA, strArr);
        synchronized (obj) {
            map.put(str, Boolean.valueOf(A032));
        }
        return false;
    }

    public static boolean A0G(0cX r301) {
        boolean z = true;
        if (A03 && !A0J && r301 != null) {
            z = !r301.maybeHidden;
        }
        return z;
    }

    public static boolean A0H(0cX r301, String str) {
        if (!str.contains("com.facebook")) {
            return false;
        }
        if (r301 == null || r301.equals(0cX.A00)) {
            return true;
        }
        return !r301.maybeNotHidden && r301.maybeHidden;
    }

    public static boolean A0I(Class cls, Class cls2, String str, Class... clsArr) {
        C0sA A00;
        if (A0J || (A00 = A00()) == null) {
            return false;
        }
        StringBuilder A0o = AnonymousClass001.A0o(C0sA.A00(cls));
        A0o.append("->");
        A0o.append(str);
        A0o.append('(');
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= clsArr.length) {
                break;
            }
            A0o.append(C0sA.A01(clsArr[i2]));
            i = i2 + 1;
        }
        if (cls2 != null) {
            A0o.append(')');
            A0o.append(C0sA.A01(cls2));
        }
        String obj = A0o.toString();
        if (obj != null) {
            C0sA.A03(A00, obj);
        }
        Arrays.toString(clsArr);
        return false;
    }

    private Class A0M(String str, ClassLoader classLoader) {
        return A03(null, classLoader, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0017, code lost:
    
        if (r307 != null) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class A0J(X.0cX r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0cZ.A0J(X.0cX, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0017, code lost:
    
        if (r307 != null) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class A0K(X.0cX r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0cZ.A0K(X.0cX, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0016, code lost:
    
        if (r306 != null) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Class] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class A0L(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0cZ.A0L(java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x001c, code lost:
    
        if (r309 != null) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a A[Catch: Exception -> 0x021d, TRY_ENTER, TryCatch #10 {Exception -> 0x021d, blocks: (B:68:0x016b, B:72:0x018a, B:73:0x018f, B:77:0x0199, B:82:0x01b5, B:84:0x01bc, B:90:0x01de, B:96:0x01f4, B:98:0x0200, B:99:0x0207, B:101:0x020e, B:103:0x0215, B:106:0x0218, B:118:0x0176), top: B:67:0x016b, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0N(java.lang.String r302, java.lang.Object[] r303, java.lang.String... r304) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0cZ.A0N(java.lang.String, java.lang.Object[], java.lang.String[]):java.lang.Object");
    }

    public Field A0O(0cX r302, Class cls, String str) {
        0cX r0 = r302;
        try {
            0cX A072 = A07(r0, cls, null, str);
            if (A072 != null) {
                r0 = A072;
                r0.setAccessible(true);
            }
            return A072;
        } catch (NoSuchFieldException unused) {
            r0.getMessage();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class forName(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0cZ.forName(java.lang.String):java.lang.Class");
    }
}
