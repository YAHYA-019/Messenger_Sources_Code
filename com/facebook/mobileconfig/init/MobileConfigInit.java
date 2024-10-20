package com.facebook.mobileconfig.init;

import X.0CV;
import X.0S2;
import X.0SY;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bv;
import X.1By;
import X.1C3;
import X.1CJ;
import X.1CL;
import X.1CO;
import X.1CP;
import X.1CT;
import X.1Cd;
import X.1EK;
import X.1FF;
import X.1G0;
import X.1G2;
import X.1G9;
import X.1GD;
import X.1LF;
import X.1Pf;
import X.1R7;
import X.1RA;
import X.1Rw;
import X.2yD;
import X.2yL;
import X.2yN;
import X.3Gw;
import X.3jD;
import X.4rM;
import X.AbstractC09394pz;
import X.C00i;
import X.C05334di;
import X.C0jy;
import X.C0k1;
import X.C0mj;
import X.C15h;
import X.C3Nr;
import X.R1b;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.dextricks.Constants;
import com.facebook.inject.FbInjector;
import com.facebook.mobileconfig.MobileConfigDependenciesInFBApps;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.init.MobileConfigInit;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: MobileConfigInit.class */
public class MobileConfigInit {
    public static final String CONSISTENCY_LOGGING_INTERVAL_GK_BOOTSTRAP_NAME = "consistencyLoggingInterval";
    public static final Class TAG = MobileConfigInit.class;
    public final C00i mViewerContextProvider = new 1BV(83431);
    public final C00i mFbSharedPreferencesProvider = new 1BQ(33013);
    public final C00i mMobileConfigInitUtils = new 1BQ(16400);
    public final C00i mMobileConfig = new 1BQ(16385);
    public final C00i mSessionLessMobileConfig = new 1BQ(16386);
    public final C00i mIdleExecutorProvider = new 1BQ(33053);
    public final C15h mContextProvider = new 3jD(this, 51);
    public final C00i mScheduledExecutorService = new 1BQ(16464);
    public final C15h mAuthedTigonServiceProvider = new 3jD(this, 52);
    public final C00i mAdminIdInit = new 1BV(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
    public final C00i mDomainResolver = new 1BQ(33072);

    public static final MobileConfigInit _UL__ULSEP_com_facebook_mobileconfig_init_MobileConfigInit_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new MobileConfigInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void accessEpTestConfigs() {
        ((2yD) this.mMobileConfig.get()).Auy(36600779288614101L);
        ((2yD) this.mMobileConfig.get()).Auy(36600783583581398L);
        ((2yD) this.mMobileConfig.get()).Auy(36600787878548695L);
        ((2yD) this.mMobileConfig.get()).Auy(36600792173515992L);
        ((2yD) this.mMobileConfig.get()).Ai7(37156638251090164L);
        ((2yD) this.mMobileConfig.get()).Ai7(37156367668216008L);
        double Ai7 = ((2yD) this.mMobileConfig.get()).Ai7(37156676905795830L);
        0fH.A05(TAG, Double.valueOf(((2yD) this.mMobileConfig.get()).Ai7(37156685495730423L)), Double.valueOf(Ai7), Double.valueOf(((2yD) this.mMobileConfig.get()).Ai7(37156694085665016L)), "Read Test Emergency Push Configs: foreground: %f, background: %f, force refresh: %f");
        if (Math.random() < 0.5d) {
            ((2yD) this.mMobileConfig.get()).Ai7(37156642546057461L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.3Nr] */
    private void logCacheValues(1Cd r302) {
        1LF r0 = (1LF) 1Bi.A03(100239);
        final FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        1G9 r02 = 1G0.A0B;
        11T.A0B(r02);
        final 1G2 A03 = r0.A03(r02, "mc_sessioned_test_cache", true);
        2yN r03 = new 2yN((C3Nr) new Object(fbSharedPreferences, A03) { // from class: X.3Nr
            public final FbSharedPreferences A00;
            public final 1G2 A01;

            {
                1BL.A1F(fbSharedPreferences, A03);
                this.A00 = fbSharedPreferences;
                this.A01 = A03;
            }

            public String A00(String str) {
                11T.A0F(str, 0);
                String BD0 = this.A00.BD0(1G3.A01(this.A01, str));
                if (BD0 != null) {
                    return BD0;
                }
                return null;
            }
        });
        ArrayList arrayList = new ArrayList(Arrays.asList(new 2yL("MC.mobileconfig_cache_test_sessionbased_init.bool_1", 36327022368151463L), new 2yL("MC.mobileconfig_cache_test_sessionbased_init.string_1", 36889972321683301L), new 2yL("MC.mobileconfig_cache_test_sessionbased_init.int_1", 36608497344913390L)));
        0SY r04 = C0mj.A00;
        Integer num = 0S2.A0u;
        1GD A01 = 1GD.A01(new 1GD());
        A01.A03 = true;
        3Gw.A00(A01, r302, r03, r04, num, arrayList, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logTestExposures() {
        ((2yD) this.mMobileConfig.get()).AZk(36311573370833935L);
        ((2yD) this.mMobileConfig.get()).AZk(36311942738022147L);
        ((2yD) this.mMobileConfig.get()).BCy(36874892691702189L);
        ((2yD) this.mMobileConfig.get()).AZk(36314189005922047L);
        ((2yD) this.mMobileConfig.get()).Auy(36595663982758657L);
        ((2yD) this.mMobileConfig.get()).Ai7(37158613936111967L);
        ((2yD) this.mMobileConfig.get()).BCy(36877138959532813L);
        ((2yD) this.mMobileConfig.get()).AZk(36314193300889344L);
        ((2yD) this.mMobileConfig.get()).Auy(36595668277725954L);
        ((2yD) this.mMobileConfig.get()).Ai7(37158618231079264L);
        ((2yD) this.mMobileConfig.get()).BCy(36877143254500110L);
        ((2yD) this.mMobileConfig.get()).AZk(36314197595856641L);
        ((2yD) this.mMobileConfig.get()).Auy(36595672572693251L);
        ((2yD) this.mMobileConfig.get()).Ai7(37158622526046561L);
        ((2yD) this.mMobileConfig.get()).BCy(36877147549467407L);
        ((2yD) this.mMobileConfig.get()).AZk(36314223365660448L);
        ((2yD) this.mMobileConfig.get()).Auy(36595698342431494L);
        ((2yD) this.mMobileConfig.get()).BCy(36877173319205649L);
        ((2yD) this.mMobileConfig.get()).AZk(36314227660627745L);
        ((2yD) this.mMobileConfig.get()).Auy(36595702637398791L);
        ((2yD) this.mMobileConfig.get()).BCy(36877177614172946L);
        ((2yD) this.mMobileConfig.get()).AZk(36314231955595042L);
        ((2yD) this.mMobileConfig.get()).Auy(36595706932366088L);
        ((2yD) this.mMobileConfig.get()).BCy(36877181909140243L);
        ((2yD) this.mMobileConfig.get()).AZk(36314236250562339L);
        ((2yD) this.mMobileConfig.get()).Auy(36595711227333385L);
        ((2yD) this.mMobileConfig.get()).BCy(36877186204107540L);
        ((2yD) this.mMobileConfig.get()).AZk(36314240545529636L);
        ((2yD) this.mMobileConfig.get()).Auy(36595715522300682L);
        ((2yD) this.mMobileConfig.get()).BCy(36877190499074837L);
        ((2yD) this.mMobileConfig.get()).AZk(36314219070693151L);
        ((2yD) this.mMobileConfig.get()).Auy(36595694047464197L);
        ((2yD) this.mMobileConfig.get()).BCy(36877169024238352L);
    }

    private boolean runPostInit(1Cd r302, boolean z) {
        boolean isValid = r302.AvS().isValid();
        if (z) {
            1FF.A00(r302, this, "SessionBased");
        }
        0fH.A09(TAG, Boolean.valueOf(isValid), "MobileConfig enabled : %s");
        if (isValid) {
            schedulePostInitTasks();
        }
        return isValid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsistencyLoggingInterval() {
        C0k1.A01(FbInjector.A00(), CONSISTENCY_LOGGING_INTERVAL_GK_BOOTSTRAP_NAME, (int) ((2yD) this.mMobileConfig.get()).Auy(36592704750158778L));
    }

    private void temporarySEVWorkaroundToAddValueSourceLoggingOfOrcaEvents() {
    }

    public 1CL createMobileConfigManagerHolder(String str) {
        MobileConfigManagerHolderImpl A00;
        synchronized (this) {
            A00 = ((1C3) this.mMobileConfigInitUtils.get()).A00(str, 2);
        }
        return A00;
    }

    public void forceE2EConfigFetch() {
        1FF.A00((1Cd) 1By.A01.A01(), this, "SessionBased");
    }

    public void init() {
        mobileConfigInit();
        forceE2EConfigFetch();
        mobileConfigLaterInit();
    }

    public boolean initNetwork(1CL r302) {
        MobileConfigManagerHolderImpl A00 = 1CJ.A00(r302);
        if (A00 == null || A00.isNetworkServiceSet()) {
            return false;
        }
        if (MobileConfigDependenciesInFBApps.setNetworkServiceInternal(A00, ((C05334di) this.mAuthedTigonServiceProvider.get()).A00(), true)) {
            A00.SET_NETWORK_SERVICE_SIGNAL.countDown();
        }
        Object obj = this.mDomainResolver.get();
        String BD0 = ((FbSharedPreferences) this.mFbSharedPreferencesProvider.get()).BD0(1Pf.A0a);
        11T.A0F(obj, 1);
        if (BD0 == null) {
            return true;
        }
        String A0W = 0CV.A0W(0CV.A0W(BD0, "facebook.com", ""), "facebook.com", "");
        int length = A0W.length();
        if (length != 0) {
            int i = length - 1;
            if (A0W.charAt(i) == '.') {
                A0W = A0W.substring(0, i);
                11T.A0A(A0W);
            }
        }
        0fH.A08(R1b.class, A0W, A00.setSandboxURL(A0W) ? "Succeed to set the sandbox : %s" : "Failed to set sandbox : %s");
        return true;
    }

    /* renamed from: lambda$mobileConfigLaterInit$0$com-facebook-mobileconfig-init-MobileConfigInit, reason: not valid java name */
    public /* synthetic */ void m8574x64b04206() {
        1Cd r0 = (1Cd) 1By.A01.A01();
        if (shouldEnableMobileConfig((ViewerContext) this.mViewerContextProvider.get())) {
            r0.A0I();
        }
        logCacheValues(r0);
        runPostInit(r0, false);
    }

    public void login(String str) {
        synchronized (this) {
            if (shouldEnableMobileConfig(str)) {
                1Cd A00 = AbstractC09394pz.A00((1CP) this.mMobileConfig.get());
                if (A00 != null) {
                    1CL AvS = A00.AvS();
                    A00.A0I();
                    initNetwork(AvS);
                    0fH.A09(TAG, Boolean.valueOf(AvS.isValid()), "Initialized MobileConfigManager after login - valid: %s");
                }
                1Bv r0 = (1Bv) this.mAdminIdInit.get();
                synchronized (r0) {
                    if (1Bv.A01(r0, str)) {
                        1Cd A002 = AbstractC09394pz.A00((1CP) r0.A04.get());
                        if (A002 != null) {
                            1CL AvS2 = A002.AvS();
                            A002.A0I();
                            r0.A02(AvS2);
                            0fH.A09(1Bv.class, Boolean.valueOf(AvS2.isValid()), "Initialized AdminId MobileConfigManager after login - valid: %s");
                            0fH.A0D(1Bv.class, "Updating AdminId MobileConfig");
                            0fH.A09(1Bv.class, Boolean.valueOf(AvS2.tryUpdateConfigsSynchronously(MobileConfigSessionlessInit.SYNC_UPDATE_WAIT_TIME_MS)), "AdminId MobileConfig update result %s");
                        }
                    }
                }
            }
        }
    }

    public void logout(boolean z) {
        synchronized (this) {
            0fH.A0D(TAG, "Switching to MobileConfigManagerHolderNoop");
            1Cd A00 = AbstractC09394pz.A00((1CP) this.mMobileConfig.get());
            if (A00 != null) {
                A00.A0K(new 1CT());
            }
            if (!z) {
                1Bv r0 = (1Bv) this.mAdminIdInit.get();
                synchronized (r0) {
                    0fH.A0D(1Bv.class, "Switching AdminId to MobileConfigManagerHolderNoop");
                    1Cd A002 = AbstractC09394pz.A00((1CP) r0.A04.get());
                    if (A002 != null) {
                        A002.A0K(new 1CT());
                    }
                }
            }
        }
    }

    public void mobileConfigInit() {
        short s = 2;
        try {
            0SY r0 = C0mj.A00;
            r0.markerStart(13631491);
            1Cd r02 = (1Cd) 1By.A01.A00();
            if (shouldEnableMobileConfig((ViewerContext) this.mViewerContextProvider.get())) {
                r02.A0L(true);
            }
            boolean isValid = r02.AvS().isValid();
            logCacheValues(r02);
            if (!isValid) {
                s = 3;
            }
            r0.markerEnd(13631491, s);
        } catch (Throwable th) {
            0SY r03 = C0mj.A00;
            if (0 == 0) {
                s = 3;
            }
            r03.markerEnd(13631491, s);
            throw th;
        }
    }

    public void mobileConfigLaterInit() {
        ((Executor) this.mIdleExecutorProvider.get()).execute(new 1RA(this));
    }

    public void mobileConfigStableSpecifierTranslationInit() {
        0SY r0 = C0mj.A00;
        r0.markerStart(13644570);
        if (((2yD) this.mSessionLessMobileConfig.get()).AZk(18297458329587277L)) {
            long j = 63;
            1BK.A0N(this.mMobileConfig).Auy(1Rw.A01((int) ((36592704750158778L >>> 48) & j), 18948096 + 1Rw.A00(36592704750158778L), 0, (int) ((36592704750158778L >>> 54) & j), true, false, false));
        }
        r0.markerEnd(13644570, (short) 2);
    }

    public void schedulePostInitTasks() {
        1EK.A09("MobileConfigInit", 357833938572702L);
        try {
            ((1R7) this.mIdleExecutorProvider.get()).execute(C0jy.A02(new 4rM(this), "MobileConfigInit", 0));
        } finally {
            1EK.A03();
        }
    }

    public void setAndScheduleEpConfigAccess() {
        if (((2yD) this.mMobileConfig.get()).AZk(2342162309230638969L)) {
            ((ScheduledExecutorService) this.mScheduledExecutorService.get()).scheduleWithFixedDelay(C0jy.A02(new Runnable() { // from class: X.3fh
                public static final String __redex_internal_original_name = "MobileConfigInit$3";

                @Override // java.lang.Runnable
                public void run() {
                    MobileConfigInit.this.accessEpTestConfigs();
                }
            }, "MobileConfigInit", 0), 1L, 30, TimeUnit.MINUTES);
        }
    }

    public boolean shouldEnableMobileConfig(ViewerContext viewerContext) {
        if (viewerContext != null) {
            return shouldEnableMobileConfig(viewerContext.mUserId);
        }
        return false;
    }

    public boolean shouldEnableMobileConfig(String str) {
        Context A00 = FbInjector.A00();
        boolean z = false;
        if (2 != A00.getPackageManager().getComponentEnabledSetting(new ComponentName(A00, (Class<?>) MobileConfigEnableReceiver.class)) && str != null && !str.isEmpty() && !str.equals(ConstantsKt.CAMERA_ID_FRONT)) {
            z = true;
        }
        return z;
    }

    public void updateMobileConfigManagerHolderIfNecessary(ViewerContext viewerContext) {
        synchronized (this) {
            if (viewerContext != null) {
                if (shouldEnableMobileConfig(viewerContext.mUserId)) {
                    1Cd A00 = AbstractC09394pz.A00((1CO) ((1C3) this.mMobileConfigInitUtils.get()).A03.get());
                    if (A00 != null) {
                        A00.A0I();
                    }
                }
            }
        }
    }

    public boolean updateMobileConfigManagerHolderIfNecessary() {
        0fH.A0B(TAG, "Method not Implemented: updateMobileConfigManagerHolderIfNecessary");
        return false;
    }
}
