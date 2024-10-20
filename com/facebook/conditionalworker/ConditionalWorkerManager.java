package com.facebook.conditionalworker;

import X.0Fc;
import X.1BK;
import X.1BQ;
import X.1Bi;
import X.1R7;
import X.2yD;
import X.4AZ;
import X.52O;
import X.C00i;
import X.C0dr;
import X.C4A5;
import X.C4A7;
import X.DKB;
import android.content.Context;
import android.content.Intent;
import com.facebook.inject.FbInjector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: ConditionalWorkerManager.class */
public final class ConditionalWorkerManager implements 52O {
    public final Context A00;
    public final Intent A01;
    public final C4A7 A02;
    public final 1R7 A03;
    public final C0dr A04;
    public final 4AZ A05;
    public final C4A5 A06;
    public final C00i A07;
    public final ConcurrentHashMap A08;

    public ConditionalWorkerManager() {
        Context A00 = FbInjector.A00();
        C4A5 c4a5 = (C4A5) 1Bi.A03(32927);
        C4A7 c4a7 = (C4A7) 1Bi.A03(32928);
        1R7 r0 = (1R7) 1Bi.A03(33053);
        1BQ r02 = new 1BQ(16511);
        4AZ r03 = (4AZ) 1Bi.A03(32934);
        C0dr c0dr = (C0dr) 1Bi.A03(84489);
        this.A00 = A00;
        this.A06 = c4a5;
        this.A02 = c4a7;
        this.A01 = new Intent(A00, (Class<?>) ConditionalWorkerService.class);
        this.A03 = r0;
        this.A07 = r02;
        this.A05 = r03;
        this.A08 = new ConcurrentHashMap();
        this.A04 = c0dr;
    }

    public static boolean A00(ConditionalWorkerManager conditionalWorkerManager, String str) {
        ConcurrentHashMap concurrentHashMap = conditionalWorkerManager.A08;
        Number number = (Number) concurrentHashMap.get(str);
        if (number != null) {
            if (conditionalWorkerManager.A04.now() - number.longValue() <= TimeUnit.SECONDS.toMillis(((2yD) conditionalWorkerManager.A05.A00.get()).Auy(36591837169909886L))) {
                return false;
            }
        }
        concurrentHashMap.put(str, Long.valueOf(conditionalWorkerManager.A04.now()));
        return true;
    }

    public void A01(String str) {
        try {
            Intent intent = this.A01;
            intent.putExtra("service_start_reason", str);
            0Fc.A00(this.A00, intent, ConditionalWorkerService.class);
        } catch (Exception e) {
            1BK.A09(this.A07).softReport(DKB.A00(212), "Starting service failure", e);
        }
    }

    public void Bky() {
    }

    public void CD4(Intent intent) {
        boolean A04 = this.A02.A04(15);
        if (intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED") || A04 || !A00(this, "CHARGING_BATTERY_HIGH")) {
            return;
        }
        A01("on_power_state_changed");
    }
}
