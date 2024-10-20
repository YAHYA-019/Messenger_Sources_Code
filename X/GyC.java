package X;

import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rsys.transport.gen.SignalingTransportSink;
import com.facebook.rsys.transport.gen.StatusUpdate;
import com.facebook.webrtc.signaling.WebrtcSignalingMessageInterface;

/* loaded from: GyC.class */
public final class GyC extends SignalingTransportProxy {
    public HoZ A00;
    public boolean A01;
    public final 1Br A02;
    public final WebrtcSignalingMessageInterface A03;
    public final Object A04;

    public GyC(WebrtcSignalingMessageInterface webrtcSignalingMessageInterface) {
        11T.A0F(webrtcSignalingMessageInterface, 1);
        this.A03 = webrtcSignalingMessageInterface;
        this.A02 = 1Bq.A00(66430);
        this.A04 = AnonymousClass001.A0R();
    }

    @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
    public void onStatusUpdate(StatusUpdate statusUpdate) {
        11T.A0F(statusUpdate, 0);
        this.A03.onStatusUpdate(statusUpdate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b0, code lost:
    
        if (r319 == null) goto L18;
     */
    @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendSignalingMessage(com.facebook.rsys.transport.gen.SignalingMessage r302, com.facebook.rsys.transport.gen.SignalingTransportCallback r303, com.facebook.rsys.transport.gen.SignalingTransportCallbackExt r304, int r305) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GyC.sendSignalingMessage(com.facebook.rsys.transport.gen.SignalingMessage, com.facebook.rsys.transport.gen.SignalingTransportCallback, com.facebook.rsys.transport.gen.SignalingTransportCallbackExt, int):void");
    }

    @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
    public void setSink(SignalingTransportSink signalingTransportSink) {
        11T.A0F(signalingTransportSink, 0);
        synchronized (this.A04) {
            this.A00 = new HoZ(signalingTransportSink, this.A01);
        }
    }
}
