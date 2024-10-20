package com.facebook.storage.ionic.fbapps;

import X.1BK;
import X.1BQ;
import X.2Jq;
import X.2yD;
import X.3hI;
import X.4rT;
import X.AnonymousClass001;
import X.C00i;
import X.C1tc;
import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: IonicFBAppConnection.class */
public final class IonicFBAppConnection {
    public 4rT A00;
    public final long A01;
    public final C00i A02;
    public final C00i A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final C00i A07 = new 1BQ(33053);
    public final C00i A08;

    public IonicFBAppConnection() {
        long j;
        1BQ r0 = new 1BQ(16968);
        this.A08 = r0;
        this.A02 = new 1BQ(16511);
        this.A03 = new 1BQ(16634);
        Context A00 = FbInjector.A00();
        this.A04 = new ArrayList();
        this.A05 = new ArrayList();
        this.A00 = new 4rT(A00);
        C00i c00i = ((2Jq) r0.get()).A00;
        boolean AZk = ((2yD) c00i.get()).AZk(36314064451935740L);
        long Auy = ((2yD) c00i.get()).Auy(36595539428772539L);
        if (AZk && Auy > 0 && new Random().nextInt() % Auy == 0) {
            this.A06 = true;
            j = 1BK.A0N(c00i).Auy(36595539428575930L);
        } else {
            j = 0;
        }
        this.A01 = j;
    }

    public static void A00(IonicFBAppConnection ionicFBAppConnection) {
        ArrayList A0s = AnonymousClass001.A0s();
        List list = ionicFBAppConnection.A05;
        synchronized (list) {
            A0s.addAll(list);
            list.clear();
        }
        List list2 = ionicFBAppConnection.A04;
        synchronized (list2) {
            A0s.addAll(list2);
            list2.clear();
        }
        if (A0s.size() > 0) {
            1BK.A1E(ionicFBAppConnection.A07).execute(new 3hI(ionicFBAppConnection, A0s));
        }
    }

    public void onAppForeground() {
        if (this.A06) {
            C1tc.A02 = 1BK.A0N(((2Jq) this.A08.get()).A00).Auy(36595539428838076L);
            C1tc.A00 = this;
            C1tc.A03 = true;
            A00(this);
        }
    }
}
