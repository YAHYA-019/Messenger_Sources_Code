package X;

import com.facebook.webrtc.lite.SignalMessageProcessingInfo;
import com.google.common.collect.ImmutableMap;

/* loaded from: J35.class */
public final class J35 implements Runnable {
    public static final String __redex_internal_original_name = "RtcSignalingLauncherImpl$onMultiwayMessageInternal$isOfferCallback$1$onSuccess$1";
    public final /* synthetic */ IDU A00;
    public final /* synthetic */ HAo A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ byte[] A04;

    public J35(IDU idu, HAo hAo, Boolean bool, Long l, byte[] bArr) {
        this.A00 = idu;
        this.A04 = bArr;
        this.A01 = hAo;
        this.A03 = l;
        this.A02 = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IDU idu = this.A00;
        ImmutableMap immutableMap = IDU.A0G;
        I2l i2l = (I2l) 1Br.A0B(idu.A07);
        byte[] bArr = this.A04;
        HAo hAo = this.A01;
        SignalMessageProcessingInfo A00 = i2l.A00(hAo, this.A03, bArr);
        if (!this.A02.booleanValue() || A00 == null) {
            return;
        }
        IDU.A00(idu, A00, hAo);
    }
}
