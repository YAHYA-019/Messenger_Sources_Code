package com.facebook.common.netchecker;

import X.1Bi;
import X.1Bn;
import X.1EK;
import X.1G0;
import X.1G2;
import X.1Hv;
import X.1I7;
import X.1hM;
import X.5GP;
import X.C0dr;
import X.C0et;
import X.C0jy;
import X.C1m1;
import X.C1og;
import X.C45g;
import X.C45j;
import android.content.Intent;
import android.net.NetworkInfo;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: NetChecker.class */
public final class NetChecker {
    public static final ListenableFuture A0D = 1hM.A01;
    public 1G2 A00;
    public 1G2 A01;
    public final 1I7 A02;
    public final C45g A03;
    public final FbNetworkManager A04;
    public final C0dr A05;
    public final C0et A06;
    public final FbSharedPreferences A07;
    public final C1m1 A08;
    public final ScheduledExecutorService A09;
    public volatile long A0A;
    public volatile C45j A0B;
    public volatile Future A0C;

    public NetChecker() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16464);
        C0dr c0dr = (C0dr) 1Bi.A03(84488);
        C45g c45g = (C45g) 1Bn.A0A(32904);
        1I7 r0 = (1I7) 1Hv.A02(FbInjector.A00(), 65728);
        FbNetworkManager fbNetworkManager = (FbNetworkManager) 1Bi.A03(16687);
        C1m1 c1m1 = (C1m1) 1Bi.A03(16782);
        C0et c0et = (C0et) 1Bi.A03(83604);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        this.A09 = scheduledExecutorService;
        this.A05 = c0dr;
        this.A03 = c45g;
        this.A02 = r0;
        this.A04 = fbNetworkManager;
        this.A08 = c1m1;
        this.A0B = C45j.NOT_CHECKED;
        this.A0C = A0D;
        this.A06 = c0et;
        this.A07 = fbSharedPreferences;
        1G2 r02 = 1G0.A04;
        this.A00 = r02.A0D("netchecker/").A0D("last_not_captive_portal_network_name");
        this.A01 = r02.A0D("netchecker/").A0D("last_not_captive_portal_time");
    }

    public static void A00(C45j c45j, NetChecker netChecker) {
        synchronized (netChecker) {
            C45j c45j2 = netChecker.A0B;
            netChecker.A0B = c45j;
            if (netChecker.A0B != c45j2) {
                netChecker.A02.CkS(new Intent("com.facebook.common.netchecker.ACTION_NETCHECK_STATE_CHANGED").putExtra("state", netChecker.A0B.name()));
            }
        }
    }

    public static void A01(NetChecker netChecker, C1og c1og) {
        if (c1og == C1og.CHANNEL_CONNECTED) {
            netChecker.A0A = netChecker.A05.now();
            A00(C45j.NOT_CAPTIVE_PORTAL, netChecker);
            netChecker.A0C.cancel(true);
            netChecker.A0C = A0D;
        }
    }

    public void A02() {
        synchronized (this) {
            if (this.A06 == C0et.A0P) {
                FbNetworkManager fbNetworkManager = this.A04;
                NetworkInfo A0A = fbNetworkManager.A0A();
                if (A0A != null && A0A.getType() == 1) {
                    1EK.A09("NetChecker", 881081412356415L);
                    try {
                        this.A0C = this.A09.schedule(C0jy.A02(new 5GP(this, fbNetworkManager.A09()), "NetChecker", 0), 10000L, TimeUnit.MILLISECONDS);
                        1EK.A03();
                    } finally {
                    }
                }
            }
        }
    }

    public void A03() {
        synchronized (this) {
            this.A0C.cancel(true);
            this.A0C = A0D;
            this.A0A = 0L;
            A00(C45j.NOT_CHECKED, this);
        }
    }
}
