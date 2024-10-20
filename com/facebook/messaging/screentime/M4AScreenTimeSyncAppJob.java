package com.facebook.messaging.screentime;

import X.07S;
import X.0QD;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bq;
import X.1Br;
import X.1Fv;
import X.1G1;
import X.1Kd;
import X.1Lo;
import X.2Jd;
import X.4YV;
import X.4gW;
import X.4gZ;
import X.54A;
import X.54B;
import X.54C;
import X.54F;
import X.54G;
import X.5Dh;
import X.5Dj;
import X.ABm;
import X.AeR;
import X.AnonymousClass549;
import X.C01643sd;
import X.C1A3;
import X.C4g0;
import X.C7eg;
import X.C7p0;
import X.DKB;
import X.JAg;
import X.Jt0;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.screentime.M4AScreenTimeSyncAppJob;
import com.facebook.rsys.call.gen.CallModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: M4AScreenTimeSyncAppJob.class */
public final class M4AScreenTimeSyncAppJob {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final C4g0 A03;
    public final Runnable A04;
    public final AtomicReference A05;

    public M4AScreenTimeSyncAppJob() {
        this(0);
        this.A00 = 1Bq.A00(16465);
        this.A02 = 1Bq.A00(16456);
        this.A01 = 1Bq.A00(66351);
        this.A03 = new C4g0(this);
    }

    public M4AScreenTimeSyncAppJob(int i) {
        this.A05 = new AtomicReference();
        this.A04 = new Runnable() { // from class: X.4fz
            public static final String __redex_internal_original_name = "ScreenTimeAppJob$runnable$1";

            @Override // java.lang.Runnable
            public void run() {
                54G A00;
                boolean z;
                M4AScreenTimeSyncAppJob m4AScreenTimeSyncAppJob = M4AScreenTimeSyncAppJob.this;
                AnonymousClass549 A04 = m4AScreenTimeSyncAppJob.A04();
                if (A04 == null || (A00 = A04.A00()) == null) {
                    return;
                }
                0fH.A0l("M4AScreenTimeSyncAppJob", "onPeriod");
                M4AScreenTimeSyncAppJob.A02(A04, AnonymousClass001.A1W(ProcessLifecycleOwner.newInstance.getLifecycle().getCurrentState(), Lifecycle.State.RESUMED), false);
                try {
                    C4g0 c4g0 = m4AScreenTimeSyncAppJob.A03;
                    8LW A01 = A04.A05.A01();
                    CallModel callModel = A01 != null ? (CallModel) A01.A00(CallModel.class) : null;
                    z = false;
                    if (callModel == null) {
                        0fH.A0l("M4AScreenTimeSyncAppJob", "Call model is null");
                    } else if (callModel.inCallState == 7) {
                        z = true;
                    }
                    c4g0.A00.set(z);
                } catch (Exception e) {
                    0fH.A0z("M4AScreenTimeSyncAppJob", "isVoipCallActive: Failed to get call state", e, new Object[]{e});
                    z = m4AScreenTimeSyncAppJob.A03.A00.get();
                }
                M4AScreenTimeSyncAppJob.A03(A04, z, false);
                long A06 = 4YU.A06(A04.A00.A01.now());
                54F r0 = A04.A06;
                long j = A06 - r0.A09.get();
                long j2 = A06 - r0.A08.get();
                long j3 = A00.A02;
                if (j >= j3 && j2 >= A00.A03) {
                    String str = j2 < j ? "RETRY" : "REGULAR";
                    0fH.A0l("M4AScreenTimeSyncAppJob", "onPeriod: sync started");
                    m4AScreenTimeSyncAppJob.A07(A04, str);
                    return;
                }
                Long valueOf = Long.valueOf(j);
                Long valueOf2 = Long.valueOf(j3);
                Long valueOf3 = Long.valueOf(j2);
                Long valueOf4 = Long.valueOf(A00.A03);
                if (0fH.A01.BTv(4)) {
                    0fH.A0l("M4AScreenTimeSyncAppJob", StringFormatUtil.formatStrLocaleSafe("onPeriod: too soon to sync, timeSinceSuccess %d (needed %d), timeSinceAttempt %d (needed %d)", valueOf, valueOf2, valueOf3, valueOf4));
                }
            }
        };
    }

    public static 2Jd A00(Iterator it) {
        Jt0 jt0 = (Jt0) it.next();
        2Jd r0 = new 2Jd(88);
        r0.A09(DKB.A00(31), String.valueOf(jt0.A04));
        r0.A09("end_timestamp", String.valueOf(jt0.A02));
        r0.A09("start_mtime", String.valueOf(jt0.A03));
        r0.A09("end_mtime", String.valueOf(jt0.A01));
        return r0;
    }

    public static final void A01(54A r301, M4AScreenTimeSyncAppJob m4AScreenTimeSyncAppJob) {
        54G A00 = r301.A00();
        if (A00 != null) {
            AtomicReference atomicReference = m4AScreenTimeSyncAppJob.A05;
            C7p0 c7p0 = (C7p0) atomicReference.get();
            if (c7p0 == null || c7p0.A00 != r301.hashCode()) {
                synchronized (m4AScreenTimeSyncAppJob) {
                    C7p0 c7p02 = (C7p0) atomicReference.get();
                    if (c7p02 != null) {
                        if (c7p02.A00 == r301.hashCode()) {
                            return;
                        } else {
                            c7p02.A01.cancel(false);
                        }
                    }
                    ScheduledFuture<?> scheduleAtFixedRate = ((ScheduledExecutorService) 1Br.A0B(m4AScreenTimeSyncAppJob.A00)).scheduleAtFixedRate(m4AScreenTimeSyncAppJob.A04, 0L, A00.A00, TimeUnit.SECONDS);
                    11T.A0A(scheduleAtFixedRate);
                    atomicReference.set(new C7p0(scheduleAtFixedRate, r301.hashCode()));
                    0fH.A0l("M4AScreenTimeSyncAppJob", "Scheduled runnable");
                }
            }
        }
    }

    public static final void A02(54A r301, boolean z, boolean z2) {
        54G A00 = r301.A00();
        if (A00 == null || !A00.A06) {
            return;
        }
        try {
            ((AnonymousClass549) r301).A01.A02(z, z2);
        } catch (Exception e) {
            0fH.A0s("M4AScreenTimeSyncAppJob", "notifyForegroundedState: Failed to notify app state", e);
        }
    }

    public static final void A03(54A r301, boolean z, boolean z2) {
        54G A00 = r301.A00();
        if (A00 == null || !A00.A06) {
            return;
        }
        try {
            0fH.A0h(Boolean.valueOf(z), "M4AScreenTimeSyncAppJob", "notifyVoipState: %b");
            ((AnonymousClass549) r301).A02.A02(z, z2);
        } catch (Exception e) {
            0fH.A0s("M4AScreenTimeSyncAppJob", "notifyVoipState: Failed to notify app state", e);
        }
    }

    public final AnonymousClass549 A04() {
        String str;
        String str2;
        1G1 A04 = ((1Fv) this.A01.A00.get()).A04();
        if (A04.A07) {
            str = "M4AScreenTimeSyncAppJob";
            str2 = "getEnabledScreenTimeSession: User logged out";
        } else {
            AnonymousClass549 anonymousClass549 = (AnonymousClass549) 1Lo.A04((Context) null, A04, (1BY) null, 131113);
            str = "M4AScreenTimeSyncAppJob";
            if (anonymousClass549.A00() != null) {
                0fH.A0j(str, "getEnabledScreenTimeSession: Screen time enabled");
                return anonymousClass549;
            }
            str2 = "getEnabledScreenTimeSession: Screen time disabled";
        }
        0fH.A0j(str, str2);
        return null;
    }

    public final void A05() {
        try {
            if (4gW.A01.get()) {
                return;
            }
            4gW.A02.set(this);
            ((ExecutorService) this.A02.A00.get()).execute(new 4gZ(this));
        } catch (Exception e) {
            0fH.A0r("M4AScreenTimeSyncAppJob", "Failed to register observer", e);
        }
    }

    public /* bridge */ /* synthetic */ void A06(54A r302) {
        AnonymousClass549 anonymousClass549 = (AnonymousClass549) r302;
        11T.A0F(anonymousClass549, 0);
        try {
            AtomicBoolean atomicBoolean = anonymousClass549.A07;
            if (atomicBoolean.get()) {
                return;
            }
            synchronized (this) {
                if (atomicBoolean.get()) {
                    return;
                }
                anonymousClass549.A05.A02(this.A03, JAg.A00, true);
                atomicBoolean.set(true);
                0fH.A0l("M4AScreenTimeSyncAppJob", "Registered rtc listener for session");
            }
        } catch (Exception e) {
            0fH.A0r("M4AScreenTimeSyncAppJob", "Failed to register rtc listener", e);
        }
    }

    public final void A07(54A r302, String str) {
        try {
            if (r302.A00() != null) {
                54F r0 = ((AnonymousClass549) r302).A06;
                try {
                    54B r02 = r0.A01;
                    long now = r02.A00.now() / 1000;
                    long offset = TimeZone.getDefault().getOffset(1000 * now) / 60000;
                    long now2 = r02.A01.now() / 1000;
                    54C r03 = r0.A02;
                    List A01 = r03.A01();
                    54C r04 = r0.A03;
                    List A012 = r04.A01();
                    if (A01.isEmpty() && A012.isEmpty()) {
                        0fH.A0l("M4AScreenTimeApi", "Skipping empty sync");
                        return;
                    }
                    2Jd r05 = new 2Jd(89);
                    r05.A09("device_id", r0.A04.A02());
                    r05.A09("device_timestamp", String.valueOf(now));
                    r05.A09("device_timezone_offset", String.valueOf(offset));
                    r05.A09("device_mtime", String.valueOf(now2));
                    r05.A09("session_id", r0.A06);
                    List A013 = r03.A01();
                    ArrayList A1E = C1A3.A1E(A013);
                    Iterator it = A013.iterator();
                    while (it.hasNext()) {
                        2Jd A00 = A00(it);
                        A00.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "FOREGROUND");
                        A1E.add(A00);
                    }
                    List A014 = r04.A01();
                    ArrayList A1E2 = C1A3.A1E(A014);
                    Iterator it2 = A014.iterator();
                    while (it2.hasNext()) {
                        2Jd A002 = A00(it2);
                        A002.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "VOIP");
                        A1E2.add(A002);
                    }
                    r05.A0A("intervals", 0QD.A0O(A1E2, A1E));
                    r0.A08.set(now2);
                    GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
                    07S A02 = GraphQlCallInput.A02.A02();
                    A02.A0H(r05.A03(), "m4a_intervals_payload");
                    07S.A00(A02, str, "trigger_reason");
                    4YV.A1A(A02, graphQlQueryParamSet, "data");
                    5Dh A003 = 5Dh.A00(graphQlQueryParamSet, new C01643sd(C7eg.class, "M4AScreenTimeSyncMutation", null, "data", "fbandroid", -1240501028, 384, 403219668L, 403219668L, false, true));
                    A003.A00 = r0.A00.BKF();
                    0fH.A01(4, "M4AScreenTimeApi", "Executing request");
                    1Kd.A0F(new ABm(r0, now2, 2), AeR.A01(r0.A05.A08(A003, 5Dj.A01)), r0.A07);
                } catch (Exception e) {
                    0fH.A0r("M4AScreenTimeApi", "Error in sync", e);
                }
            }
        } catch (Exception e2) {
            0fH.A0s("M4AScreenTimeSyncAppJob", "syncNow: Failed to sync", e2);
        }
    }
}
