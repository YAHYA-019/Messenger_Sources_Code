package com.facebook.secure.intentlogger;

import X.1Bi;
import X.1GD;
import X.1Nq;
import X.2yD;
import X.C00i;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: BumpUpLogEndpointMobileConfigListener.class */
public final class BumpUpLogEndpointMobileConfigListener implements 1Nq {
    public Set A00 = null;
    public final C00i A01 = 1Bi.A00(16385);

    public static final BumpUpLogEndpointMobileConfigListener A00() {
        return new BumpUpLogEndpointMobileConfigListener();
    }

    public static String A01(BumpUpLogEndpointMobileConfigListener bumpUpLogEndpointMobileConfigListener) {
        return ((2yD) bumpUpLogEndpointMobileConfigListener.A01.get()).BCy(36875231993922001L);
    }

    public static void A02(BumpUpLogEndpointMobileConfigListener bumpUpLogEndpointMobileConfigListener, String str) {
        synchronized (bumpUpLogEndpointMobileConfigListener) {
            bumpUpLogEndpointMobileConfigListener.A00 = new HashSet(Arrays.asList(str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1)));
        }
    }

    public Set A03() {
        Set set;
        synchronized (this) {
            set = this.A00;
        }
        return set;
    }

    public int Adi() {
        return 15679;
    }

    public void BqJ(int i) {
        A02(this, ((2yD) this.A01.get()).BDB(1GD.A05, 36875231993922001L));
    }
}
