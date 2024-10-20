package com.facebook.systrace;

import X.0WN;
import X.0XO;
import X.0Y2;
import X.0Y5;
import X.0YE;
import X.0YF;
import X.0YO;
import X.0Ya;
import X.0Yf;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0k4;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Systrace.class */
public abstract class Systrace {
    public static long A00;
    public static final ThreadLocal A01;
    public static final AtomicInteger A02;
    public static final String[][] A03;

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.String[], java.lang.String[][]] */
    static {
        0XO r0 = 0YE.A02;
        if (0WN.A03) {
            Method method = 0WN.A02;
            C0k4.A00(method);
            0WN.A00(method, new Object[]{true});
        }
        0YE.A02(false, false);
        0YO r02 = 0YO.$redex_init_class;
        A02 = new AtomicInteger();
        A01 = new 0Ya();
        A03 = new String[]{new String[]{"com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onActivate", "com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onDeactivate"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerEnd"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsEnd"}};
    }

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            0YF.A00();
        }
    }

    public static void A01(long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            0YF.A00();
        }
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeEndSection();
            } else {
                0Y2.A00("E");
            }
        }
    }

    public static void A02(long j, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            0YF.A00();
        }
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeBeginSection(str);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 r0 = new 0Y5('B');
            r0.A01(Process.myPid());
            r0.A03(str);
            0Y2.A00(r0.toString());
        }
    }

    public static void A03(long j, String str, int i) {
        A00();
        if (A0E(j)) {
            TraceDirect.asyncTraceBegin(str, i, 0L);
        }
    }

    public static void A04(long j, String str, int i) {
        A00();
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeEndAsyncFlow(str, i);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 A002 = 0Y5.A00(str, 'f');
            A002.A01(i);
            AnonymousClass001.A16(A002);
        }
    }

    public static void A05(long j, String str, int i) {
        A00();
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceEnd(str, i, 0L);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 A002 = 0Y5.A00(str, 'F');
            AnonymousClass002.A0S(A002, (0L > 0L ? 1 : (0L == 0L ? 0 : -1)), 0L);
            A002.A01(i);
            AnonymousClass001.A16(A002);
        }
    }

    public static void A06(long j, String str, int i) {
        A00();
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeStartAsyncFlow(str, i);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 A002 = 0Y5.A00(str, 's');
            A002.A01(i);
            AnonymousClass001.A16(A002);
        }
    }

    public static void A07(String str) {
        A00();
        if (A0E(1L)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeTraceCounter(str, 1000);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 A002 = 0Y5.A00(str, 'C');
            A002.A01(1000);
            AnonymousClass001.A16(A002);
        }
    }

    public static void A08(String str, int i, long j) {
        A00();
        if (A0E(4)) {
            TraceDirect.asyncTraceBegin(str, i, 0Yf.A00(j));
        }
    }

    public static void A09(String str, int i, long j) {
        A00();
        if (A0E(4)) {
            long A002 = 0Yf.A00(j);
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceEnd(str, i, A002);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 A003 = 0Y5.A00(str, 'F');
            AnonymousClass002.A0S(A003, (A002 > 0L ? 1 : (A002 == 0L ? 0 : -1)), A002);
            A003.A01(i);
            AnonymousClass001.A16(A003);
        }
    }

    public static void A0A(String str, int i, String str2) {
        A00();
        if (A0E(8)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceStageBegin(str, i, 0L, str2);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 A002 = 0Y5.A00(str, 'T');
            AnonymousClass002.A0S(A002, (0L > 0L ? 1 : (0L == 0L ? 0 : -1)), 0L);
            A002.A01(i);
            A002.A03(str2);
            AnonymousClass001.A16(A002);
        }
    }

    public static void A0B(String str, int i, String str2) {
        A00();
        if (A0E(4)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceRename(str, str2, i);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 A002 = 0Y5.A00(str, 'F');
            A002.A02("<M>");
            A002.A01(i);
            A002.A03(str2);
            AnonymousClass001.A16(A002);
        }
    }

    public static void A0C(String str, int i, String str2) {
        A00();
        if (A0E(64)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeTraceMetadata(str, str2, i);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 A002 = 0Y5.A00(str, 'M');
            A002.A01(i);
            A002.A03(str2);
            AnonymousClass001.A16(A002);
        }
    }

    public static void A0D(String str, String str2, int i, long j, long j2) {
        A00();
        if (A0E(j)) {
            long A002 = 0Yf.A00(j2);
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceStageBegin(str, i, A002, str2);
                return;
            }
            FileOutputStream fileOutputStream = 0Y2.A00;
            0Y5 A003 = 0Y5.A00(str, 'T');
            AnonymousClass002.A0S(A003, (A002 > 0L ? 1 : (A002 == 0L ? 0 : -1)), A002);
            A003.A01(i);
            A003.A03(str2);
            AnonymousClass001.A16(A003);
        }
    }

    public static boolean A0E(long j) {
        if ((j & 0YE.A03) != 0 || (A00 & j) != 0) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 29 || !Trace.isEnabled()) {
            return false;
        }
        return j == ((long) 4) || j == 274877906944L;
    }
}
