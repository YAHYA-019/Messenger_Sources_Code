package com.facebook.mobileconfig.init;

import X.0SY;
import X.0fH;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1By;
import X.1CJ;
import X.1CL;
import X.1Cd;
import X.1EK;
import X.1FF;
import X.1R7;
import X.1RZ;
import X.2yD;
import X.C00i;
import X.C0jy;
import X.C0mj;
import X.C10214sr;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.init.MobileConfigSessionlessInit;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: MobileConfigSessionlessInit.class */
public class MobileConfigSessionlessInit {
    public static final int SYNC_UPDATE_WAIT_TIME_MS = 3000;
    public static final Class TAG = MobileConfigSessionlessInit.class;
    public final C00i mSessionlessMobileConfig = new 1BQ(16386);
    public final C00i mIdleExecutorProvider = new 1BQ(33053);
    public final C00i mExecutorService = new 1BQ(16449);
    public final C00i mScheduleFirstSessionlessFetchInIdleThread = new 1BV(49329);

    public static final MobileConfigSessionlessInit _UL__ULSEP_com_facebook_mobileconfig_init_MobileConfigSessionlessInit_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new MobileConfigSessionlessInit();
    }

    private void logTestExposures() {
        ((2yD) this.mSessionlessMobileConfig.get()).AZk(2324147438274753608L);
        ((2yD) this.mSessionlessMobileConfig.get()).BCy(18868392626750632L);
    }

    private boolean runPostInit(1Cd r302, boolean z) {
        1CL AvS = r302.AvS();
        boolean isValid = AvS.isValid();
        scheduleFirstUpdate(AvS);
        if (z) {
            1FF.A00(r302, (MobileConfigInit) null, "Sessionless");
        }
        0fH.A09(TAG, Boolean.valueOf(isValid), "Sessionless MobileConfig enabled : %s");
        if (isValid) {
            logTestExposures();
        }
        return isValid;
    }

    private void scheduleFirstUpdate(1CL r302) {
        final MobileConfigManagerHolderImpl A00 = 1CJ.A00(r302);
        if (A00 == null || !A00.isFetchNeeded() || !A00.syncFetchReason().equals("FreshInstall")) {
            C10214sr.A00().A00.countDown();
            return;
        }
        1EK.A09("MobileConfigSessionlessInit", 357833938572702L);
        try {
            Runnable A02 = C0jy.A02(new Runnable() { // from class: X.3h7
                public static final String __redex_internal_original_name = "MobileConfigSessionlessInit$1";

                @Override // java.lang.Runnable
                public void run() {
                    Class cls = MobileConfigSessionlessInit.TAG;
                    0fH.A0C(cls, "Sessionless MobileConfig first update started");
                    0fH.A08(cls, Boolean.valueOf(A00.tryUpdateConfigsSynchronously(MobileConfigSessionlessInit.SYNC_UPDATE_WAIT_TIME_MS)), "Sessionless MobileConfig first update success: %s");
                    C10214sr.A00().A00.countDown();
                }
            }, "MobileConfigSessionlessInit", 0);
            if (((Boolean) this.mScheduleFirstSessionlessFetchInIdleThread.get()).booleanValue()) {
                ((1R7) this.mIdleExecutorProvider.get()).execute(A02);
            } else {
                ((ExecutorService) this.mExecutorService.get()).execute(A02);
            }
        } finally {
            1EK.A03();
        }
    }

    public void forceE2ESessionlessConfigFetch() {
        1FF.A00((1Cd) 1By.A02.A01(), (MobileConfigInit) null, "Sessionless");
    }

    public void init() {
        mobileConfigSessionlessInit();
        forceE2ESessionlessConfigFetch();
        mobileConfigSessionlessLaterInit();
    }

    /* renamed from: lambda$mobileConfigSessionlessLaterInit$0$com-facebook-mobileconfig-init-MobileConfigSessionlessInit, reason: not valid java name */
    public /* synthetic */ void m8575x4fe18056() {
        1Cd r0 = (1Cd) 1By.A02.A01();
        r0.A0I();
        runPostInit(r0, false);
    }

    public void mobileConfigSessionlessInit() {
        short s = 3;
        try {
            0SY r0 = C0mj.A00;
            r0.markerStart(13631492);
            1Cd r02 = (1Cd) 1By.A02.A00();
            r02.A0L(true);
            if (r02.AvS().isValid()) {
                s = 2;
            }
            r0.markerEnd(13631492, s);
        } catch (Throwable th) {
            C0mj.A00.markerEnd(13631492, (short) 3);
            throw th;
        }
    }

    public void mobileConfigSessionlessLaterInit() {
        ((Executor) this.mIdleExecutorProvider.get()).execute(new 1RZ(this));
    }
}
