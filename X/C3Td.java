package X;

import android.app.ActivityThread;
import android.os.Build;
import com.facebook.common.hiddenapis2.ApiExemption;
import java.lang.reflect.Field;

/* renamed from: X.3Td, reason: invalid class name */
/* loaded from: 3Td.class */
public final class C3Td {
    public static Field A00;
    public static Field A01;
    public static RIK A02;
    public static C3Td A03;
    public static final C00i A04;
    public static final boolean A05;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        A05 = z;
        A04 = new C00y(new C3j8(0));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v8 ??, still in use, count: 2, list:
          (r303v8 ??) from 0x0065: PHI (r303v3 ??) = (r303v2 ??), (r303v8 ??) binds: [B:25:0x0055, B:30:0x0062] A[DONT_GENERATE, DONT_INLINE]
          (r303v8 ?? I:X.RIK) from 0x0062: SPUT (r303v8 ?? I:X.RIK) A[Catch: all -> 0x0088] X.3Td.A02 X.RIK
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
    public static android.app.Activity A00() {
        /*
            android.app.ActivityThread r0 = android.app.ActivityThread.currentActivityThread()
            r301 = r0
            r0 = r301
            if (r0 == 0) goto La2
            java.lang.Class<android.app.ActivityThread> r0 = android.app.ActivityThread.class
            r302 = r0
            java.lang.String r0 = "mActivities"
            r303 = r0
            r0 = r302
            r1 = r303
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L88
            r302 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = r304
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L88
            r0 = r302
            r1 = r301
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L88
            r302 = r0
            r0 = r302
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L88
            r302 = r0
            r0 = r302
            if (r0 == 0) goto La2
            r0 = r302
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L88
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La2
            r0 = r302
            java.util.Iterator r0 = X.1BK.A1A(r0)     // Catch: java.lang.Throwable -> L88
            r301 = r0
        L3a:
            r0 = r301
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L88
            r304 = r0
            r0 = r304
            if (r0 == 0) goto La2
            r0 = r301
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L88
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3a
            X.RIK r0 = X.C3Td.A02     // Catch: java.lang.Throwable -> L88
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L65
            X.RIK r0 = new X.RIK     // Catch: java.lang.Throwable -> L88
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L88
            r0 = r303
            X.C3Td.A02 = r0     // Catch: java.lang.Throwable -> L88
        L65:
            r0 = r303
            java.lang.reflect.Field r0 = r0.A01     // Catch: java.lang.Throwable -> L88
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.Throwable -> L88
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3a
            X.RIK r0 = X.C3Td.A02     // Catch: java.lang.Throwable -> L88
            r303 = r0
            r0 = r303
            java.lang.reflect.Field r0 = r0.A00     // Catch: java.lang.Throwable -> L88
            r303 = r0
            r0 = r303
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L88
            r303 = r0
            r0 = r303
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L88
            return r0
        L88:
            r301 = move-exception
            X.1Dw r0 = X.1Dw.A00()
            java.lang.String r1 = "RefActivityThread.getCurrentActivity"
            X.047 r0 = r0.A01(r1)
            r303 = r0
            r0 = r303
            r1 = r301
            X.047 r0 = r0.Cmr(r1)
            r0 = r303
            r0.report()
            r0 = 0
            return r0
        La2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Td.A00():android.app.Activity");
    }

    /* JADX WARN: Type inference failed for: r302v2, types: [X.3Td, java.lang.Object] */
    public static C3Td A01() {
        02W.A07(AnonymousClass001.A1V(A04.get()), "Check isSupported() before call get() or use getOrNull() instead");
        C3Td c3Td = A03;
        C3Td c3Td2 = c3Td;
        if (c3Td == null) {
            ?? obj = new Object();
            A03 = obj;
            c3Td2 = obj;
        }
        return c3Td2;
    }

    public static /* synthetic */ Boolean A02() {
        Field declaredField;
        try {
            if (ApiExemption.removeRestriction_DO_NOT_USE() && !AnonymousClass001.A1V(1Dw.A00().A01.get())) {
                ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
                if (Build.VERSION.SDK_INT < 29) {
                    Field declaredField2 = ActivityThread.class.getDeclaredField(AnonymousClass000.A00(207));
                    A00 = declaredField2;
                    declaredField2.setAccessible(true);
                    Object obj = A00.get(currentActivityThread);
                    if (obj != null) {
                        declaredField = obj.getClass().getDeclaredField("mLastProcessState");
                        A01 = declaredField;
                    }
                    return true;
                }
                declaredField = ActivityThread.class.getDeclaredField("mLastProcessState");
                A01 = declaredField;
                declaredField.setAccessible(true);
                return true;
            }
            return false;
        } catch (Throwable th) {
            AnonymousClass047 A012 = 1Dw.A00().A01("RefActivityThread.ensureInit");
            A012.Cmr(th);
            A012.report();
            return false;
        }
    }

    public boolean A03() {
        int i = -1;
        if (A01 != null) {
            try {
                ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
                if (Build.VERSION.SDK_INT >= 29) {
                    i = A01.getInt(currentActivityThread);
                } else {
                    Field field = A00;
                    if (field != null) {
                        i = A01.getInt(field.get(currentActivityThread));
                    }
                }
            } catch (Throwable th) {
                AnonymousClass047 A012 = 1Dw.A00().A01("RefActivityThread.readCurrentProcesState");
                A012.Cmr(th);
                A012.report();
            }
        }
        boolean z = true;
        int i2 = 2;
        if (A05) {
            if (i != 2) {
                i2 = 3;
            }
            return z;
        }
        if (i != i2) {
            z = false;
        }
        return z;
    }
}
