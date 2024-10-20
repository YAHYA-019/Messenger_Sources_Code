package com.facebook.zero.rewritenative;

import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.1G2;
import X.1GD;
import X.1Gw;
import X.1HH;
import X.1HN;
import X.1I7;
import X.1IJ;
import X.1Ky;
import X.1P9;
import X.1vL;
import X.1vQ;
import X.2BR;
import X.2Br;
import X.2Bs;
import X.2Bx;
import X.2C1;
import X.2CG;
import X.2CH;
import X.2CS;
import X.2CT;
import X.2Go;
import X.2yD;
import X.3cG;
import X.AnonymousClass304;
import X.C00i;
import X.C0il;
import X.C1Gu;
import X.C2Bu;
import X.C35r;
import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.http.common.BootstrapRequestName;
import com.facebook.inject.FbInjector;
import com.facebook.jni.HybridData;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.tigon.interceptors.RequestInterceptor;
import com.facebook.zero.common.ZeroUrlRewriteRule;
import com.facebook.zero.zerobalance.ping.ZeroBalancePingController;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: ZeroNativeRequestInterceptor.class */
public class ZeroNativeRequestInterceptor extends RequestInterceptor implements 1vQ, 1HN, 2Br, 2Bs {
    public static final ZeroNativeRequestInterceptor $redex_init_class = null;
    public final C00i dialtoneController;
    public final FbSharedPreferences fbSharedPreferences;
    public final C00i gkListeners;
    public final C00i gkListenersSessionless;
    public final C00i gqlConfigObserver;
    public Context injectedContext;
    public final C00i mExperimentConfigObserver;
    public final C00i mExperimentProvider;
    public 1Gw mGKListener;
    public final C00i mGkStore;
    public final C00i mGkStoreSessionless;
    public ImmutableSet mLastFeatures;
    public ImmutableList mLastRewriteRules;
    public final C00i mLocalBroadcastManager;
    public final C00i mMobileConfig;
    public final C2Bu mRuleObserver;
    public final Object mRulesChangedLock;
    public final C00i mUnknownStateManager;
    public final C00i mZeroBalancePingController;
    public final 2BR mZeroTokenManager = (2BR) 1Bi.A03(16923);
    public final C00i sessionlessMC;

    static {
        C0il.A0B("rewritenativeinterceptor");
    }

    /* JADX WARN: Type inference failed for: r304v4, types: [X.2CT, java.lang.Object] */
    public ZeroNativeRequestInterceptor() {
        1BQ r0 = new 1BQ(16385);
        this.mMobileConfig = r0;
        this.sessionlessMC = new 1BQ(16386);
        this.fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        1BQ r02 = new 1BQ(16930);
        this.mUnknownStateManager = r02;
        this.mRuleObserver = (C2Bu) 1Bi.A03(16929);
        this.mGkStore = new 1BQ(131252);
        this.mGkStoreSessionless = new 1BV(131260);
        this.gkListeners = new 1BV(65844);
        this.gkListenersSessionless = new 1BV(65845);
        this.gqlConfigObserver = new 1BQ(16937);
        1BQ r03 = new 1BQ(99939);
        this.dialtoneController = r03;
        1BV r04 = new 1BV(67192);
        this.mExperimentProvider = r04;
        this.mExperimentConfigObserver = new 1BQ(16938);
        Context A00 = FbInjector.A00();
        this.injectedContext = A00;
        1HH r05 = new 1HH(A00, 65728);
        this.mLocalBroadcastManager = r05;
        1BQ r06 = new 1BQ(16931);
        this.mZeroBalancePingController = r06;
        this.mRulesChangedLock = new Object();
        this.mLastFeatures = null;
        this.mLastRewriteRules = null;
        r04.get();
        boolean AZl = ((2yD) this.mMobileConfig.get()).AZl(2342157601946542148L, false);
        boolean AZl2 = ((2yD) this.mMobileConfig.get()).AZl(36314631387553873L, true);
        this.mHybridData = initHybrid(AZl, ((2yD) this.mMobileConfig.get()).AZl(36314597027815493L, true), ((2yD) this.sessionlessMC.get()).AZl(18300262942842969L, true), ((1vL) r03.get()).A0S(), ((1vL) r03.get()).A0T(), ((2Bx) r02.get()).A02(), AnonymousClass304.A04.A01(), ((1vL) r03.get()).A0D(), ((1vL) r03.get()).A0C(), ((1vL) r03.get()).A0B(), ((2yD) r0.get()).AZk(36327048138020786L));
        if (AZl2) {
            setDefaultBootstrapRequests(BootstrapRequestName.A00);
        }
        r04.get();
        2CH A002 = ((2CG) this.gqlConfigObserver.get()).A00();
        updateConfig(true, A002.A01, A002.A02, A002.A00, A002.A03);
        2CS r07 = (2CS) this.mExperimentConfigObserver.get();
        2CT r304 = r07.A00;
        2CT r3042 = r304;
        if (r304 == null) {
            2yD r08 = (2yD) r07.A02.get();
            ?? obj = new Object();
            1GD A01 = 1GD.A01(new 1GD());
            A01.A02 = true;
            ((2CT) obj).A00 = r08.AZr(A01, 36320867680009992L);
            1GD A012 = 1GD.A01(new 1GD());
            A012.A02 = true;
            ((2CT) obj).A01 = r08.AZr(A012, 36320867680075529L);
            r07.A00 = obj;
            r3042 = obj;
        }
        updateExperimentConfig(r3042.A00, r3042.A01);
        this.mGKListener = new C35r(this, 1);
        ((C1Gu) this.gkListeners.get()).A00(this.mGKListener, 64);
        ((C1Gu) this.gkListeners.get()).A00(this.mGKListener, 94);
        ((C1Gu) this.gkListenersSessionless.get()).A00(this.mGKListener, ActionId.RTMP_CONNECTION_FAILED);
        ((C1Gu) this.gkListeners.get()).A00(this.mGKListener, 90);
        ((2CG) this.gqlConfigObserver.get()).A00 = this;
        ((1vL) this.dialtoneController.get()).A0R(this);
        ((2Bx) this.mUnknownStateManager.get()).A01.add(this);
        ((2CS) this.mExperimentConfigObserver.get()).A01 = this;
        1Ky r09 = (1Ky) 1Bn.A0A(98565);
        this.fbSharedPreferences.CcV(this, (1G2) r09.A0I.getValue());
        this.fbSharedPreferences.CcV(this, (1G2) r09.A0J.getValue());
        1P9 r010 = new 1P9((1I7) r05.get());
        r010.A05(new 3cG(this, 30), "com.facebook.zero.ZERO_RATING_STATE_CHANGED");
        r010.A02().A00();
        ((ZeroBalancePingController) r06.get()).A0D.add(this);
    }

    public static ZeroNativeDataBuilder generateBuilder(Set set, List list) {
        ZeroNativeDataBuilder zeroNativeDataBuilder = new ZeroNativeDataBuilder();
        ArrayList arrayList = new ArrayList();
        arrayList.add("^(https?)://api\\.([0-9a-zA-Z\\.-]*)?facebook\\.com\\/method\\/mobile\\.zeroBalanceDetection");
        arrayList.add("^(https?)://([0-9a-zA-Z\\.-]*)?facebook\\.com\\/zero\\/balance\\/pixel/");
        int size = arrayList.size();
        int[] iArr = new int[size];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = zeroNativeDataBuilder.mFlatBufferBuilder.A04((String) it.next());
            i++;
        }
        1IJ r0 = zeroNativeDataBuilder.mFlatBufferBuilder;
        r0.A0D(4, size, 4);
        int i2 = size;
        while (true) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                break;
            }
            r0.A07(iArr[i3]);
            i2 = i3;
        }
        zeroNativeDataBuilder.mWhitelistVector = r0.A03();
        if (list != null) {
            int size2 = list.size();
            int[] iArr2 = new int[size2];
            Iterator it2 = list.iterator();
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (!it2.hasNext()) {
                    break;
                }
                ZeroUrlRewriteRule zeroUrlRewriteRule = (ZeroUrlRewriteRule) it2.next();
                1IJ r02 = zeroNativeDataBuilder.mFlatBufferBuilder;
                int A04 = r02.A04(zeroUrlRewriteRule.A02);
                int A042 = zeroNativeDataBuilder.mFlatBufferBuilder.A04(zeroUrlRewriteRule.A03);
                int A043 = zeroNativeDataBuilder.mFlatBufferBuilder.A04(zeroUrlRewriteRule.A00);
                r02.A09(3);
                r02.A0B(2, A043);
                r02.A0B(1, A042);
                r02.A0B(0, A04);
                iArr2[i5] = r02.A02();
                i4 = i5 + 1;
            }
            1IJ r03 = zeroNativeDataBuilder.mFlatBufferBuilder;
            r03.A0D(4, size2, 4);
            int i6 = size2;
            while (true) {
                int i7 = i6 - 1;
                if (i7 < 0) {
                    break;
                }
                r03.A07(iArr2[i7]);
                i6 = i7;
            }
            zeroNativeDataBuilder.mRuleVector = r03.A03();
        }
        if (set != null) {
            int size3 = set.size();
            int[] iArr3 = new int[size3];
            Iterator it3 = set.iterator();
            int i8 = 0;
            while (it3.hasNext()) {
                iArr3[i8] = zeroNativeDataBuilder.mFlatBufferBuilder.A04((String) it3.next());
                i8++;
            }
            1IJ r04 = zeroNativeDataBuilder.mFlatBufferBuilder;
            r04.A0D(4, size3, 4);
            int i9 = size3;
            while (true) {
                int i10 = i9 - 1;
                if (i10 < 0) {
                    break;
                }
                r04.A07(iArr3[i10]);
                i9 = i10;
            }
            zeroNativeDataBuilder.mFeaturesVector = r04.A03();
        }
        zeroNativeDataBuilder.buildNative();
        return zeroNativeDataBuilder;
    }

    private native HybridData initHybrid(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, String str2, String str3, boolean z8);

    private ZeroNativeDataBuilder lazyLoadBuilder(boolean z) {
        if (!z) {
            this.mExperimentProvider.get();
            this.mRuleObserver.A00 = this;
            return generateBuilder(this.mZeroTokenManager.A0B(), this.mZeroTokenManager.A0A());
        }
        synchronized (this.mRulesChangedLock) {
            this.mRuleObserver.A00 = this;
            rulesChanged(this.mZeroTokenManager.A0A());
        }
        return null;
    }

    public void onAfterDialtoneStateChanged(boolean z, Context context) {
        setDialtoneEnabled(z);
    }

    public void onBeforeDialtoneStateChanged(boolean z) {
    }

    public void onDetectionFinished(2C1 r302, String str, Context context) {
        setZeroBalanceState(r302.logEvent);
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        setShouldSimulateZeroBalance(AnonymousClass304.A04.A01());
    }

    public void onUpdateUnknownState(boolean z, String str, boolean z2) {
        setIsAppInUnknownState(z, z2);
    }

    public void rulesChanged(ImmutableList immutableList) {
        ImmutableSet A0B = this.mZeroTokenManager.A0B();
        if (!((2yD) this.mMobileConfig.get()).AZk(36327048137955249L)) {
            setData(generateBuilder(A0B, immutableList));
            return;
        }
        synchronized (this.mRulesChangedLock) {
            if (!2Go.A00(this.mLastFeatures, A0B) || !2Go.A00(this.mLastRewriteRules, immutableList)) {
                this.mLastFeatures = A0B;
                this.mLastRewriteRules = immutableList;
                setData(generateBuilder(A0B, immutableList));
            }
        }
    }

    public native void setData(ZeroNativeDataBuilder zeroNativeDataBuilder);

    public native void setDefaultBootstrapRequests(Set set);

    public native void setDialtoneEnabled(boolean z);

    public native void setIsAppInUnknownState(boolean z, boolean z2);

    public native void setShouldSimulateZeroBalance(boolean z);

    public native void setUseBackupRewriteRules(boolean z);

    public native void setUseSessionlessBackupRewriteRules(boolean z);

    public native void setZeroBalanceState(String str);

    public native void setZeroRatingEnabled(boolean z);

    public native void setZeroRatingStateMetadata(boolean z, String str, String str2);

    public native void updateConfig(boolean z, String str, String str2, String str3, String str4);

    public native void updateExperimentConfig(boolean z, boolean z2);
}
