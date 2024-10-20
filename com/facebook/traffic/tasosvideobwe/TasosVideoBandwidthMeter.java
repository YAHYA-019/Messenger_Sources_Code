package com.facebook.traffic.tasosvideobwe;

import X.11T;
import X.1BL;
import X.5LD;
import X.5LV;
import X.5LW;
import X.5Lf;
import X.5M1;
import X.5M2;
import X.5M5;
import X.5M6;
import X.5M8;
import X.5M9;
import X.6Y6;
import android.os.Handler;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* loaded from: TasosVideoBandwidthMeter.class */
public final class TasosVideoBandwidthMeter implements 5M2 {
    public final 5M1 clientBandwidthMeter;

    public TasosVideoBandwidthMeter(5LD r302, AbrContextAwareConfiguration abrContextAwareConfiguration) {
        1BL.A1F(r302, abrContextAwareConfiguration);
        this.clientBandwidthMeter = new 5M1(r302, abrContextAwareConfiguration);
    }

    public void addEventListener(Handler handler, 6Y6 r303) {
        11T.A0H(handler, r303);
    }

    public int getAvailableSamples() {
        return this.clientBandwidthMeter.getAvailableSamples();
    }

    public /* bridge */ /* synthetic */ 5Lf getBandwidthEstimate() {
        return this.clientBandwidthMeter.A00();
    }

    /* renamed from: getBandwidthEstimate, reason: collision with other method in class */
    public VideoBandwidthEstimate m10097getBandwidthEstimate() {
        return this.clientBandwidthMeter.A00();
    }

    public long getBitrateEstimate() {
        return this.clientBandwidthMeter.getBitrateEstimate();
    }

    public 5M5 getInbandBandwidthEstimate(String str, String str2) {
        11T.A0H(str, str2);
        5LD r0 = this.clientBandwidthMeter.A05;
        5M5 r305 = r0 == null ? 5M1.A06 : new 5M5(r0.AqN(str, str2));
        11T.A0A(r305);
        return r305;
    }

    public final long getLastResponseSizeInBytes() {
        long j;
        5M1 r0 = this.clientBandwidthMeter;
        synchronized (r0) {
            5LV r02 = r0.A03;
            synchronized (r02) {
                j = ((5LW) r02).A03;
            }
        }
        return j;
    }

    public final long getLastResponseTTLBInMs() {
        long j;
        5M1 r0 = this.clientBandwidthMeter;
        synchronized (r0) {
            5LV r02 = r0.A03;
            synchronized (r02) {
                j = ((5LW) r02).A05;
            }
        }
        return j;
    }

    public /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    public 5M8 getTransferListener() {
        5M6 r0 = this.clientBandwidthMeter.A01;
        11T.A0A(r0);
        return r0;
    }

    /* renamed from: getTransferListener, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ 5M9 m10099getTransferListener() {
        5M6 r0 = this.clientBandwidthMeter.A01;
        11T.A0A(r0);
        return r0;
    }

    public void removeEventListener(6Y6 r302) {
        11T.A0F(r302, 0);
    }

    public final void setEventListener(6Y6 r302) {
        11T.A0F(r302, 0);
        this.clientBandwidthMeter.A02 = r302;
    }
}
