package com.facebook.common.appchoreographer;

import X.0FQ;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Fb;
import X.1Od;
import X.1UG;
import X.3Ds;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.Q5G;
import X.SEj;
import android.os.Looper;
import com.google.common.base.Preconditions;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: USLTaskInstrumentation.class */
public final class USLTaskInstrumentation implements 1Fb {
    public final C00i A06 = 1BQ.A02(16634);
    public final C00i A01 = 1BQ.A02(16616);
    public final C00i A03 = 1BQ.A02(84488);
    public final C00i A02 = 1BQ.A02(16662);
    public boolean A00 = true;
    public final Set A05 = AnonymousClass001.A0v();
    public final Object A04 = new Object();

    public static final USLTaskInstrumentation A00() {
        return new USLTaskInstrumentation();
    }

    public static void A01(1UG r301, Enum r302, Object obj, boolean z, boolean z2) {
        r301.A7R(AbstractC00603o4.A00(309), 0FQ.A01(obj));
        r301.A6H("task_priority", Long.valueOf(r302.ordinal()));
        r301.A5H("is_scheduled_on_ui_thread", Boolean.valueOf(z));
        r301.A5H("is_scheduled_when_app_backgrounded", Boolean.valueOf(z2));
    }

    public static void A02(3Ds r301, USLTaskInstrumentation uSLTaskInstrumentation, Object obj, String str, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4) {
        1UG A08 = 1BK.A08(1BK.A07(uSLTaskInstrumentation.A06), "android_app_choreographer");
        if (A08.isSampled()) {
            C00j.A05("USLTaskInstrumentation.logExecutedEventNow.isSampled", 855159072);
            try {
                A08.A7R("event_type", "task_executed");
                A08.A7R("task_description", str);
                A01(A08, r301, obj, z, z2);
                A08.A5H("is_executed_on_ui_thread", Boolean.valueOf(z3));
                A08.A5H("is_executed_when_app_backgrounded", Boolean.valueOf(z4));
                A08.A6H("wait_duration", Long.valueOf(j2 - j));
                A08.A6H("execute_duration", Long.valueOf(j3 - j2));
                A08.BZL();
                C00j.A01(-1005453887);
            } catch (Throwable th) {
                C00j.A01(-672262348);
                throw th;
            }
        }
    }

    public static void A03(3Ds r301, USLTaskInstrumentation uSLTaskInstrumentation, Object obj, String str, boolean z, boolean z2) {
        1UG A08 = 1BK.A08(1BK.A07(uSLTaskInstrumentation.A06), "android_app_choreographer");
        if (A08.isSampled()) {
            C00j.A05("USLTaskInstrumentation.logScheduledEventNow.isSampled", 875492745);
            try {
                A08.A7R("event_type", "task_scheduled");
                A08.A7R("task_description", str);
                A01(A08, r301, obj, z, z2);
                A08.BZL();
                C00j.A01(-674904932);
            } catch (Throwable th) {
                C00j.A01(-1048140785);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Callable AJx(3Ds r302, Runnable runnable, String str, String str2, Callable callable, int i) {
        long A09 = 1BL.A09(this.A03);
        boolean A1W = AnonymousClass001.A1W(Looper.myLooper(), Looper.getMainLooper());
        boolean A0E = ((1Od) this.A01.get()).A0E();
        Runnable runnable2 = callable;
        if (runnable != null) {
            runnable2 = runnable;
        }
        Preconditions.checkNotNull(runnable2, "Must set exactly one of a runnable and a callable!");
        synchronized (this.A04) {
            if (this.A00) {
                this.A05.add(new SEj(r302, this, runnable2, str, A1W, A0E));
            } else {
                A03(r302, this, runnable2, str, A1W, A0E);
            }
        }
        return new Q5G(r302, this, runnable2, runnable, str2, str, callable, A09, A1W, A0E);
    }
}
