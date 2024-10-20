package com.facebook.device;

import X.0S2;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Bn;
import X.1Du;
import X.1Gz;
import X.1HH;
import X.1HN;
import X.1I0;
import X.1Pi;
import X.1pU;
import X.AnonymousClass000;
import X.AnonymousClass023;
import X.C00i;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.google.common.collect.MapMakerInternalMap;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

/* loaded from: DeviceConditionHelper.class */
public final class DeviceConditionHelper {
    public 1Gz A00;
    public 1HN A01;
    public ConcurrentMap A02;
    public boolean A03;
    public long A04;
    public Intent A05;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final Context A0A;
    public final C00i A0B;
    public volatile Integer A0D;
    public final C00i A06 = FbInjector.A00;
    public final C00i A0C = new 1BQ(16687);

    public DeviceConditionHelper() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A0A = context;
        this.A09 = new 1HH(context, 100180);
        this.A0B = new 1BQ(99390);
        this.A08 = new 1BQ(33013);
        this.A07 = new 1BQ(16511);
        this.A0D = 0S2.A0C;
        this.A04 = 0L;
        1pU r0 = new 1pU();
        r0.A02(MapMakerInternalMap.Strength.A01);
        this.A02 = r0.A00();
    }

    public static Intent A00(DeviceConditionHelper deviceConditionHelper) {
        Intent intent;
        if (deviceConditionHelper.A05 == null || 1BL.A08(deviceConditionHelper.A0B) - deviceConditionHelper.A04 > LocationComponentOptions.STALE_STATE_DELAY_MS) {
            intent = null;
            try {
                Intent A00 = AnonymousClass023.A00(null, 1BK.A04(deviceConditionHelper.A06).getApplicationContext(), new IntentFilter(AnonymousClass000.A00(42)));
                if (A00 == null) {
                    return null;
                }
                deviceConditionHelper.A05 = A00;
                deviceConditionHelper.A04 = 1BL.A08(deviceConditionHelper.A0B);
            } catch (SecurityException unused) {
            }
        }
        intent = deviceConditionHelper.A05;
        return intent;
    }

    public static void A01(DeviceConditionHelper deviceConditionHelper, Integer num) {
        if (deviceConditionHelper.A0D != num) {
            deviceConditionHelper.A0D = num;
            1I0 r0 = new 1I0(4);
            synchronized (deviceConditionHelper) {
                Iterator it = deviceConditionHelper.A02.keySet().iterator();
                while (it.hasNext()) {
                    r0.A05((1Pi) it.next());
                }
            }
            1Du it2 = r0.A07().iterator();
            while (it2.hasNext()) {
                ((1Pi) it2.next()).CV8(deviceConditionHelper);
            }
        }
    }

    public NetworkInfo A02() {
        return ((FbNetworkManager) this.A0C.get()).A0A();
    }

    public boolean A03(boolean z) {
        boolean z2 = false;
        if (!this.A03) {
            if (z || this.A0D == 0S2.A0C) {
                NetworkInfo A02 = A02();
                A01(this, (A02 == null || A02.getType() != 1) ? 0S2.A01 : A02.isConnected() ? 0S2.A00 : 0S2.A0C);
            }
            if (this.A0D == 0S2.A00) {
                z2 = true;
            }
        }
        return z2;
    }
}
