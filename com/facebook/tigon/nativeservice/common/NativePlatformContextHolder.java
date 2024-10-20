package com.facebook.tigon.nativeservice.common;

import X.0fH;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1G2;
import X.1HN;
import X.1Pf;
import X.2Ao;
import X.2Fm;
import X.C00241ai;
import X.C00j;
import X.C06w;
import X.C06z;
import X.C0il;
import X.C0s8;
import X.C15h;
import X.C20g;
import X.C21x;
import X.C29s;
import X.C3j6;
import X.InterfaceC00281am;
import com.facebook.jni.HybridData;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.proxygen.NetworkStatusMonitor;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: NativePlatformContextHolder.class */
public final class NativePlatformContextHolder implements C20g, 1HN {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(NativePlatformContextHolder.class, "sharedPrefs", "getSharedPrefs()Lcom/facebook/prefs/shared/FbSharedPreferences;", 0), new C06w(NativePlatformContextHolder.class, "serverConfig", "getServerConfig()Lcom/facebook/config/server/ServerConfig;", 0), new C06w(NativePlatformContextHolder.class, "ligerHttpClientProvider", "getLigerHttpClientProvider()Lcom/facebook/liger/LigerHttpClientProvider;", 0)};
    public static final 2Fm Companion = new Object();
    public final C15h carrierMonitorProvider;
    public final C15h httpConfigProvider;
    public final 1Br ligerHttpClientProvider$delegate;
    public 2Ao mCarrierMonitor;
    public InterfaceC00281am mHttpConfig;
    public final HybridData mHybridData;
    public NetworkStatusMonitor mNetworkStatusMonitor;
    public C00241ai mServerConfig;
    public final 1Br serverConfig$delegate;
    public final 1Br sharedPrefs$delegate = 1Bq.A00(33013);
    public final C15h isAppBackgrounded = new C3j6(18);

    public NativePlatformContextHolder() {
        C3j6 c3j6 = new C3j6(17);
        this.httpConfigProvider = c3j6;
        this.serverConfig$delegate = 1Bq.A00(83592);
        C3j6 c3j62 = new C3j6(16);
        this.carrierMonitorProvider = c3j62;
        Object obj = c3j6.get();
        11T.A0A(obj);
        this.mHttpConfig = (InterfaceC00281am) obj;
        this.mServerConfig = (C00241ai) this.serverConfig$delegate.A00.get();
        Object obj2 = c3j62.get();
        11T.A0A(obj2);
        this.mCarrierMonitor = (2Ao) obj2;
        this.ligerHttpClientProvider$delegate = 1Bq.A00(67742);
        C00j.A05("NativePlatformContextHolder.init", -1215822009);
        try {
            try {
                C0il.A0B("liger");
                C0il.A0B("tigonnativeservice");
                this.mNetworkStatusMonitor = ((C29s) ((C21x) this.ligerHttpClientProvider$delegate.A00.get())).A00;
            } catch (UnsatisfiedLinkError e) {
                0fH.A0r("NativePlatformContext", "Failed to load Liger:", e);
            }
            String[] Ai5 = this.mHttpConfig.Ai5();
            String A01 = ((C00241ai) this.serverConfig$delegate.A00.get()).A05.A01();
            11T.A0A(A01);
            NetworkStatusMonitor networkStatusMonitor = this.mNetworkStatusMonitor;
            Object obj3 = this.isAppBackgrounded.get();
            11T.A0D(obj3);
            boolean z = ((Boolean) obj3).booleanValue() ? false : true;
            11T.A0D(Ai5);
            HashSet hashSet = new HashSet(C0s8.A14(Arrays.copyOf(Ai5, Ai5.length)));
            C00j.A05("Companion.tracedInitHybrid", -1071030255);
            try {
                HybridData initHybrid = initHybrid(networkStatusMonitor, z, A01, hashSet);
                C00j.A01(-1709259550);
                this.mHybridData = initHybrid;
                HashSet hashSet2 = new HashSet();
                hashSet2.add(1Pf.A0a);
                ((FbSharedPreferences) this.sharedPrefs$delegate.A00.get()).CcW(this, hashSet2);
                onCellLocationChanged();
                Set set = this.mCarrierMonitor.A0C;
                synchronized (set) {
                    try {
                        set.add(this);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                C00j.A01(724420341);
            } catch (Throwable th2) {
                th = th2;
                C00j.A01(610325232);
            }
        } catch (Throwable th3) {
            C00j.A01(976030661);
            throw th3;
        }
    }

    public static final native HybridData initHybrid(NetworkStatusMonitor networkStatusMonitor, boolean z, String str, Set set);

    private final native void updateAppState(boolean z, String str);

    private final native void updateCarrierParameters(String str, String str2, String str3);

    private final native void updateConnectionType(String str);

    private final native void updateDomains(Set set);

    public final void onBackgroundAppJob() {
        String A01 = this.mServerConfig.A05.A01();
        11T.A0A(A01);
        String AX7 = this.mHttpConfig.AX7();
        if (AX7 != null) {
            A01 = AX7;
        }
        updateAppState(false, A01);
    }

    @Override // X.C20g
    public void onCellLocationChanged() {
        C00j.A05("NativePlatformContextHolder.onCellLocationChanged", 1208195986);
        try {
            2Ao r0 = this.mCarrierMonitor;
            2Ao.A00(r0);
            String str = r0.A0J;
            11T.A0A(str);
            2Ao r02 = this.mCarrierMonitor;
            2Ao.A00(r02);
            String str2 = r02.A0L;
            11T.A0A(str2);
            2Ao r03 = this.mCarrierMonitor;
            2Ao.A00(r03);
            String str3 = r03.A0K;
            11T.A0A(str3);
            updateCarrierParameters(str, str2, str3);
            C00j.A01(-59732461);
        } catch (Throwable th) {
            C00j.A01(208074181);
            throw th;
        }
    }

    public final void onForegroundAppJob() {
        String A01 = this.mServerConfig.A05.A01();
        11T.A0A(A01);
        updateAppState(true, A01);
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        11T.A0F(r303, 1);
        if (11T.A0O(1Pf.A0a, r303)) {
            String[] Ai5 = this.mHttpConfig.Ai5();
            0fH.A0g(Arrays.toString(Ai5), "NativePlatformContext", "Domain changed to %s");
            11T.A0D(Ai5);
            updateDomains(new HashSet(C0s8.A14(Arrays.copyOf(Ai5, Ai5.length))));
        }
    }
}
