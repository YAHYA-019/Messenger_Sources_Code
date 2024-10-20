package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0iM, reason: invalid class name */
/* loaded from: 0iM.class */
public final class C0iM implements C0iO {
    public int A00;
    public boolean A01;
    public final 0gK A02;
    public final 0jH A03;
    public final C15h A04;

    public C0iM(0gK r302, 0jH r303, C15h c15h, int i, boolean z) {
        this.A03 = r303;
        this.A02 = r302;
        this.A04 = c15h;
        this.A01 = z;
        this.A00 = i;
    }

    public static void A00(C0gx c0gx, final C0iM c0iM, int i) {
        C0qh A00 = C0qh.A00();
        if (i > 0) {
            C0qh.A01(C0g6.A16, A00, i);
        }
        C0qh.A01(C0g6.A1X, A00, System.currentTimeMillis() / 1000);
        if (C0iz.A03) {
            A00.A02(C0g6.A0C, true);
        }
        A00.A05(C0g6.A4Q, String.valueOf(c0gx.A01));
        int i2 = C0gp.A01;
        if (i2 == 2 || C0gp.A00()) {
            0gK r0 = c0iM.A02;
            C0gq c0gq = C0gq.CRITICAL_REPORT;
            r0.A0E(c0gq, c0iM);
            r0.A09(A00, c0gq, c0iM);
            r0.A0D(c0gq, c0iM);
            return;
        }
        if (i2 == 1) {
            0gK r02 = c0iM.A02;
            C0gq c0gq2 = C0gq.CRITICAL_REPORT;
            r02.A0E(c0gq2, c0iM);
            r02.A09(A00, c0gq2, c0iM);
            Executors.newScheduledThreadPool(1).schedule(new Runnable() { // from class: X.0ic
                public static final String __redex_internal_original_name = "JavaAppDeathEarlyDetector$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    C0iM c0iM2 = C0iM.this;
                    if (0gK.A0K.contains("JavaAppDeathDetector")) {
                        return;
                    }
                    c0iM2.A02.A0D(C0gq.CRITICAL_REPORT, c0iM2);
                }
            }, 1200L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // X.C0iO
    public /* synthetic */ int getHealthEventSamplingRate() {
        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
    }

    @Override // X.C0iO
    public /* synthetic */ C0l0 getLimiter() {
        return null;
    }

    @Override // X.C0iO
    public 0iP getName() {
        return 0iP.A0F;
    }

    @Override // X.C0iO
    public void start() {
        int i;
        final C0gx c0gx = (C0gx) this.A04.get();
        if (c0gx.A06) {
            if (C0iz.A03 || c0gx.A05) {
                i = 1;
            } else if (!this.A01) {
                i = this.A00;
                if (i <= 0) {
                    i = 0;
                }
            }
            if (C0gy.A01(C0gz.JAVA, c0gx.A01)) {
                0jH.A0A = 0iP.A0F;
                C0iw.A00("JavaAppDeathEarlyDetector", Collections.singletonMap("detected", ConstantsKt.CAMERA_ID_BACK));
                if (C0gp.A01 != 4 || c0gx.A05) {
                    A00(c0gx, this, i);
                    return;
                } else {
                    final int i2 = i;
                    0gK.A0H = new Runnable() { // from class: X.0ia
                        public static final String __redex_internal_original_name = "JavaAppDeathEarlyDetector$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C0iM.A00(c0gx, this, i2);
                        }
                    };
                    return;
                }
            }
        }
        C0iw.A00("JavaAppDeathEarlyDetector", Collections.singletonMap("detected", ConstantsKt.CAMERA_ID_FRONT));
    }
}
