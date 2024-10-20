package com.facebook.rtc.fbwebrtc;

import X.0S2;
import X.11T;
import X.1Br;
import X.1Du;
import X.1SG;
import X.C1xf;
import X.GOo;
import X.IRF;
import X.JDJ;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.rtc.incall.activity.InCallActivity;

/* loaded from: WebrtcUiHandler$activityLifecycleCallbacks$1.class */
public final class WebrtcUiHandler$activityLifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ IRF A00;

    public WebrtcUiHandler$activityLifecycleCallbacks$1(IRF irf) {
        this.A00 = irf;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        11T.A0F(activity, 0);
        if ((activity instanceof C1xf) && ((C1xf) activity).Ac6() == 0S2.A0N) {
            return;
        }
        IRF irf = this.A00;
        if (1Br.A07(irf.A15).AZk(36311251251956414L) && (activity instanceof InCallActivity)) {
            MessagingPerformanceLogger.A0G((MessagingPerformanceLogger) 1Br.A0B(irf.A0z), "join_video_chat");
            synchronized (1Br.A0B(irf.A11)) {
            }
            synchronized (1Br.A0B(irf.A14)) {
            }
            synchronized (1Br.A0B(irf.A12)) {
            }
            synchronized (1Br.A0B(irf.A13)) {
            }
            ((1SG) 1Br.A0B(irf.A17)).A0i("join_rtc_call");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        11T.A0F(activity, 0);
        if (!((activity instanceof C1xf) && ((C1xf) activity).Ac6() == 0S2.A0N) && (activity instanceof JDJ)) {
            IRF irf = this.A00;
            irf.A0H = true;
            1Du A0l = GOo.A0l(irf);
            while (A0l.hasNext()) {
                11T.A0A(A0l.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        11T.A0F(activity, 0);
        if (!((activity instanceof C1xf) && ((C1xf) activity).Ac6() == 0S2.A0N) && (activity instanceof JDJ)) {
            IRF irf = this.A00;
            irf.A0H = false;
            1Du A0l = GOo.A0l(irf);
            while (A0l.hasNext()) {
                11T.A0A(A0l.next());
            }
        }
    }
}
