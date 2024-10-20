package X;

import com.facebook.breakpad.BreakpadManager;
import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0o2, reason: invalid class name */
/* loaded from: 0o2.class */
public final class C0o2 implements C0ha {
    public final int A00;
    public final Object A01;

    public C0o2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C0ha
    public Integer Ayi() {
        switch (this.A00) {
            case 0:
                return 0S2.A1G;
            case 1:
                return 0S2.A0a;
            default:
                return 0S2.A0i;
        }
    }

    @Override // X.C0ha
    public Integer BKe() {
        return 2 - this.A00 != 0 ? 0S2.A01 : 0S2.A0C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0ha
    public void BOm(final C0hg c0hg) {
        String str;
        int i;
        Object[] objArr;
        int i2;
        switch (this.A00) {
            case 0:
                0iP r0 = 0jH.A0A;
                if (r0 == 0iP.A04) {
                    str = "anr";
                } else if (r0 == 0iP.A0M) {
                    str = "native_crash";
                } else if (r0 != 0iP.A0V) {
                    return;
                } else {
                    str = "ufad";
                }
                ExecutorService A01 = 0hE.A01();
                final 0RH r02 = (0RH) this.A01;
                final String str2 = str;
                A01.execute(new Runnable() { // from class: X.0i3
                    public static final String __redex_internal_original_name = "BlackBoxConfig$1$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        0GV.A00(C0hg.this, str2);
                    }
                });
                return;
            case 1:
                if (!BreakpadManager.isActive()) {
                    0fH.A0n("lacrima", "Breakpad was not active when NativeAslConfig.libInit called.");
                }
                0T9.A02("AppStateLoggerNative.initializeNativeCrashReporting", 1803144814);
                try {
                    0jH A07 = c0hg.A07();
                    synchronized (0Di.class) {
                        File file = A07.A05;
                        0RZ.A02(file);
                        boolean z = 0Di.A00 ? 0Di.A01 : false;
                        boolean A1N = AnonymousClass001.A1N(c0hg.A09() ? 1 : 0);
                        if (!AppStateLoggerNative.sAppStateLoggerNativeInited) {
                            String path = AnonymousClass001.A0D(file, "native_state.txt").getPath();
                            String path2 = AnonymousClass001.A0D(file, "anr_state.txt").getPath();
                            String path3 = AnonymousClass001.A0D(file, "dump_state.txt").getPath();
                            C0il.A0B("appstatelogger2");
                            0T9.A02("registerWithNativeCrashHandler", 1201023782);
                            try {
                                AppStateLoggerNative.registerWithNativeCrashHandler(path, path2, path3, "", false);
                                0T9.A00(-1614600094);
                                0T9.A02("registerStreamWithBreakpad", -899159286);
                                try {
                                    AppStateLoggerNative.registerStreamWithBreakpad();
                                    0T9.A00(1338176473);
                                    0T9.A02("registerOomHandler", -1905257659);
                                    try {
                                        AppStateLoggerNative.registerOomHandler();
                                        0T9.A00(-2147142813);
                                        if (A1N) {
                                            0T9.A02("registerSelfSigkill", 125594497);
                                            try {
                                                AppStateLoggerNative.sSelfSignalFunctionsSuccessfullyHooked = AppStateLoggerNative.registerSelfSigkillHandlers();
                                                if (0cQ.A01() != null) {
                                                    Runnable runnable = new Runnable() { // from class: X.00E
                                                        public static final String __redex_internal_original_name = "AppStateLoggerNative$1";

                                                        @Override // java.lang.Runnable
                                                        public void run() {
                                                            AppStateLoggerNative.selfSigkillWithoutUpdatingAppStateLogStatus();
                                                        }
                                                    };
                                                    0cQ.A04 = runnable;
                                                    objArr = 00F.class;
                                                    synchronized (objArr) {
                                                        try {
                                                            00F.A00 = runnable;
                                                        } finally {
                                                            Object[] objArr2 = objArr;
                                                        }
                                                    }
                                                    0cQ.A03(new 00G(), 100);
                                                }
                                                if (C0ft.A04 != null) {
                                                    0jV r03 = C0g6.A9O;
                                                    objArr = AppStateLoggerNative.class;
                                                    synchronized (objArr) {
                                                        i2 = AppStateLoggerNative.sSelfSignalFunctionsSuccessfullyHooked;
                                                    }
                                                    C0F8.A00.A02(r03, C0gq.CRITICAL_REPORT, Integer.toString(i2));
                                                }
                                                0T9.A00(513980915);
                                            } catch (Throwable th) {
                                                th = th;
                                                i = -672223899;
                                                0T9.A00(i);
                                                throw th;
                                            }
                                        }
                                        synchronized (AppStateLoggerNative.class) {
                                            try {
                                                AppStateLoggerNative.appInForeground(z, z);
                                                AppStateLoggerNative.sAppStateLoggerNativeInited = true;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i = 568220524;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    i = 2046067049;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                i = 424821497;
                            }
                        }
                    }
                    0T9.A00(1552781847);
                    return;
                } catch (Throwable th6) {
                    0T9.A00(-1055772912);
                    throw th6;
                }
            default:
                11T.A0F(c0hg, 0);
                0gK A06 = c0hg.A06();
                11T.A0A(A06);
                0jH r04 = A06.A02;
                File file2 = r04.A05;
                0RZ.A02(file2);
                11T.A0A(file2);
                02M A00 = 02M.A00();
                Lock lock = A00.A05;
                lock.lock();
                try {
                    A00.A00 = file2;
                    int i3 = 0;
                    for (C04G c04g : A00.A04.keySet()) {
                        int i4 = i3 + 1;
                        c04g.BPS(file2, String.valueOf(i3));
                        i3 = i4;
                    }
                    lock.unlock();
                    String str3 = r04.A07;
                    11T.A0A(str3);
                    File[] A04 = r04.A04(str3);
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (File file3 : A04) {
                        if (!11T.A0O(file3.getAbsolutePath(), file2.getAbsolutePath())) {
                            A0s.add(file3);
                        }
                    }
                    ArrayList A1E = C1A3.A1E(A0s);
                    Iterator it = A0s.iterator();
                    while (it.hasNext()) {
                        File file4 = (File) it.next();
                        C0gx A002 = C0gx.A00(r04, false);
                        A1E.add(new 07B(file4, A002.A03() ? 0S2.A01 : 0S2.A00, A002.A01(), A002.A05));
                    }
                    try {
                        02M A003 = 02M.A00();
                        07B[] r05 = (07B[]) A1E.toArray(new 07B[0]);
                        A003.A03((07B[]) Arrays.copyOf(r05, r05.length));
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                } catch (Throwable th7) {
                    lock.unlock();
                    throw th7;
                }
        }
    }
}
