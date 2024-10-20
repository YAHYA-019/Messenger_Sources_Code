package X;

import android.app.Activity;
import android.app.ActivityThread;
import android.app.Instrumentation;
import android.os.BaseBundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.MessageQueue;
import com.facebook.acra.constants.ActionId;
import com.facebook.smartcapture.logging.SCEventNames;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: X.04z, reason: invalid class name */
/* loaded from: 04z.class */
public final class C04z {
    public static boolean A0W;
    public static C04z A0X;
    public static final Object A0Y = new Object();
    public static volatile boolean A0Z;
    public static volatile boolean A0a;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0E;
    public Handler A0G;
    public Class A0H;
    public Class A0I;
    public Field A0J;
    public Field A0K;
    public Field A0L;
    public Field A0M;
    public Method A0N;
    public Method A0O;
    public ArrayList A0P;
    public boolean A0R;
    public boolean A0S;
    public final ArrayList A0T = new ArrayList();
    public final ArrayList A0U = new ArrayList();
    public final ArrayList A0V = new ArrayList();
    public int A0C = 0;
    public int A0F = 0;
    public int A0D = 0;
    public boolean A0Q = false;

    public static int A00(Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        obj.getClass();
        return ((Number) obj).intValue();
    }

    public static int A01(Class cls, String str, int i) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            if (obj != null) {
                i = ((Number) obj).intValue();
            }
            return i;
        } catch (NoSuchFieldException unused) {
            return i;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:X.04z) from 0x0016: SPUT (r302v3 ?? I:X.04z) A[Catch: all -> 0x001d] X.04z.A0X X.04z
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
    public static X.C04z A02() {
        /*
            java.lang.Class<X.04z> r0 = X.C04z.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            X.04z r0 = X.C04z.A0X     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            X.04z r0 = new X.04z     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            X.C04z.A0X = r0     // Catch: java.lang.Throwable -> L1d
        L19:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L1d:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04z.A02():X.04z");
    }

    public void A03(0XW r302) {
        boolean z;
        boolean z2;
        try {
            Field declaredField = Message.class.getDeclaredField("flags");
            0uP.A04 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = Message.class.getDeclaredField("target");
            0uP.A06 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = Message.class.getDeclaredField(SCEventNames.Params.STEP_CHANGE_NEXT);
            0uP.A05 = declaredField3;
            declaredField3.setAccessible(true);
            Method declaredMethod = Message.class.getDeclaredMethod("markInUse", new Class[0]);
            0uP.A08 = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = MessageQueue.class.getDeclaredMethod(SCEventNames.Params.STEP_CHANGE_NEXT, new Class[0]);
            0uP.A07 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Field declaredField4 = MessageQueue.class.getDeclaredField("mMessages");
            0uP.A03 = declaredField4;
            declaredField4.setAccessible(true);
            0uP.A09 = true;
            this.A0G = 0KK.A00();
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
        boolean z3 = false;
        if (!r302.ANR()) {
            ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
            Instrumentation instrumentation = currentActivityThread.getInstrumentation();
            if (instrumentation == null) {
                android.util.Log.w("SplashHacks", "not using instrumented startup: ActivityThread has no instrumentation");
            } else {
                String processName = currentActivityThread.getProcessName();
                if (processName == null || processName.indexOf(58) == -1) {
                    try {
                        Field declaredField5 = ActivityThread.class.getDeclaredField("mBoundApplication");
                        declaredField5.setAccessible(true);
                        Class<?> cls = instrumentation.getClass();
                        if (cls != Instrumentation.class) {
                            String name = cls.getName();
                            if (name.equals("io.selendroid.server.LightweightInstrumentation")) {
                                BaseBundle baseBundle = (BaseBundle) AnonymousClass002.A0J(declaredField5.get(currentActivityThread), Class.forName("android.app.ActivityThread$AppBindData"), "instrumentationArgs");
                                if (baseBundle == null || "yes".equals(baseBundle.getString("want_splash"))) {
                                    z2 = true;
                                } else {
                                    android.util.Log.w("SplashHacks", "not using instrumented startup: selendroid test does not want splash screen");
                                }
                            } else {
                                android.util.Log.w("SplashHacks", 0Pz.A0W("not using instrumented startup: custom unknown Instrumentation in place: ", name));
                            }
                        } else {
                            z2 = false;
                        }
                        Class superclass = Instrumentation.class.getSuperclass();
                        if (superclass != Object.class) {
                            android.util.Log.w("SplashHacks", 0Pz.A0W("not using instrumented startup: Instrumentation has unknown superclass ", superclass == null ? "null" : superclass.getName()));
                        } else {
                            0XY r0 = new 0XY(z2 ? instrumentation : null, r302);
                            for (Field field : Instrumentation.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                field.set(r0, field.get(instrumentation));
                            }
                            Field declaredField6 = ActivityThread.class.getDeclaredField("mInstrumentation");
                            declaredField6.setAccessible(true);
                            declaredField6.set(currentActivityThread, r0);
                            z3 = true;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        android.util.Log.w("SplashHacks", "failed installing custom Instrumentation", e);
                    }
                }
            }
        }
        if (this.A0G != null && z3) {
            try {
                String processName2 = ActivityThread.currentActivityThread().getProcessName();
                if (processName2 == null || processName2.indexOf(58) == -1) {
                    Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                    Field declaredField7 = cls2.getDeclaredField("token");
                    declaredField7.setAccessible(true);
                    this.A0K = declaredField7;
                    Field declaredField8 = cls2.getDeclaredField("activityInfo");
                    declaredField8.setAccessible(true);
                    this.A0J = declaredField8;
                    Field declaredField9 = Activity.class.getDeclaredField("mToken");
                    declaredField9.setAccessible(true);
                    this.A0L = declaredField9;
                    Method declaredMethod3 = ActivityThread.class.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                    declaredMethod3.setAccessible(true);
                    this.A0N = declaredMethod3;
                    Class<?> cls3 = Class.forName("android.app.servertransaction.LaunchActivityItem");
                    this.A0I = cls3;
                    Field declaredField10 = cls3.getDeclaredField("mInfo");
                    declaredField10.setAccessible(true);
                    this.A0M = declaredField10;
                    Class<?> cls4 = Class.forName("android.app.servertransaction.ClientTransaction");
                    this.A0H = cls4;
                    Method declaredMethod4 = cls4.getDeclaredMethod("getCallbacks", new Class[0]);
                    declaredMethod4.setAccessible(true);
                    this.A0O = declaredMethod4;
                    Class<?> cls5 = Class.forName("android.app.ActivityThread$H");
                    this.A00 = A00(cls5, "BIND_SERVICE");
                    this.A01 = A00(cls5, "CREATE_SERVICE");
                    this.A02 = A01(cls5, "DUMP_PROVIDER", -1);
                    this.A03 = A00(cls5, "EXIT_APPLICATION");
                    this.A04 = A01(cls5, "INSTALL_PROVIDER", -1);
                    this.A05 = A01(cls5, "EXECUTE_TRANSACTION", ActionId.FAIL_FILE_TOO_LARGE);
                    this.A07 = A01(cls5, "RELAUNCH_ACTIVITY", ActionId.OFFLINE);
                    this.A06 = A00(cls5, "RECEIVER");
                    this.A08 = A00(cls5, "REMOVE_PROVIDER");
                    this.A09 = A00(cls5, "SERVICE_ARGS");
                    this.A0A = A00(cls5, "STOP_SERVICE");
                    this.A0B = A00(cls5, "UNBIND_SERVICE");
                    android.util.Log.i("SplashHacks", "using nonodex init: ASSUMING DIRECT CONTROL");
                    z = true;
                } else {
                    z = false;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | NullPointerException e2) {
                android.util.Log.w("SplashHacks", "error initializing nonodex", e2);
                z = false;
            }
            A0a = z;
        }
        if (A0a) {
            this.A0S = true;
        }
        new 0XT(r302, this).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x025d, code lost:
    
        r327 = r317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x028e, code lost:
    
        X.0uP.A04.set(r317, java.lang.Integer.valueOf(((java.lang.Integer) X.0uP.A04.get(r317)).intValue() & (-2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x029c, code lost:
    
        X.0uP.A05.set(r317, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a2, code lost:
    
        if (r318 != null) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02bf, code lost:
    
        X.0uP.A05.set(r318, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0488, code lost:
    
        r306 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x048a, code lost:
    
        r306 = X.AnonymousClass001.A0J(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0514, code lost:
    
        throw r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02ae, code lost:
    
        X.0uP.A03.set(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0509, code lost:
    
        r306 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x050b, code lost:
    
        r306 = X.AnonymousClass001.A0J(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0494, code lost:
    
        r306 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0496, code lost:
    
        r306 = X.AnonymousClass001.A0J(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04a0, code lost:
    
        r306 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04a2, code lost:
    
        r306 = X.AnonymousClass001.A0J(r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04ac, code lost:
    
        r306 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04ae, code lost:
    
        r306 = X.AnonymousClass001.A0J(r306);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04(X.0XW r302) {
        /*
            Method dump skipped, instructions count: 1417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04z.A04(X.0XW):void");
    }
}
