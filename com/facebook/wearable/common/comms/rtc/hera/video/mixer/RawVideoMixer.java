package com.facebook.wearable.common.comms.rtc.hera.video.mixer;

import X.04S;
import X.0DR;
import X.0Ds;
import X.11T;
import X.4dB;
import X.4dH;
import X.GTP;
import X.I6K;
import X.J80;
import X.JDZ;
import X.JDd;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource;
import com.facebook.wearable.common.comms.rtc.hera.util.LogKt;
import com.facebook.wearable.common.comms.rtc.hera.video.util.RawVideoFrameDistributor;

/* loaded from: RawVideoMixer.class */
public final class RawVideoMixer implements IRawVideoSource, JDZ {
    public int A00;
    public GTP A01;
    public final JDd A02;
    public final RawVideoFrameDistributor A03;
    public final 4dH A04;

    public RawVideoMixer(JDd jDd) {
        11T.A0F(jDd, 1);
        this.A02 = jDd;
        this.A03 = new RawVideoFrameDistributor(jDd, true);
        this.A04 = new 4dB();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (((X.AIZ) r303).A06 != 2) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A00(int r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.rtc.hera.video.mixer.RawVideoMixer.A00(int, X.0DR):java.lang.Object");
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void addOutput(IRawVideoSource.Output output) {
        11T.A0F(output, 0);
        this.A03.addOutput(output);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object release(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.rtc.hera.video.mixer.RawVideoMixer.release(X.0DR):java.lang.Object");
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void releaseBlocking() {
        I6K.releaseBlocking(this);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void removeOutput(IRawVideoSource.Output output) {
        11T.A0F(output, 0);
        this.A03.removeOutput(output);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public Object start(0DR r302) {
        Object A00 = LogKt.A00("Hera.RawVideoMixer", "start()", r302, new start.2(this, (0DR) null));
        if (A00 != 0Ds.A02) {
            A00 = 04S.A00;
        }
        return A00;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void startBlocking() {
        I6K.startBlocking(this);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public Object stop(0DR r302) {
        Object A00 = LogKt.A00("Hera.RawVideoMixer", "stop()", r302, new J80(this, null, 2));
        if (A00 != 0Ds.A02) {
            A00 = 04S.A00;
        }
        return A00;
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource
    public void stopBlocking() {
        I6K.stopBlocking(this);
    }
}
