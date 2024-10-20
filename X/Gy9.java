package X;

import com.facebook.rsys.transport.gen.SignalingTransportCallback;

/* loaded from: Gy9.class */
public final class Gy9 extends SignalingTransportCallback {
    @Override // com.facebook.rsys.transport.gen.SignalingTransportCallback
    public void sendFailureCallback() {
        4zI.A03.A07("MetaAiRsysDelegate", "Pregen join request send failure", AnonymousClass001.A1Z());
    }

    @Override // com.facebook.rsys.transport.gen.SignalingTransportCallback
    public void sendSuccessCallback() {
        4zI.A03.A07("MetaAiRsysDelegate", "Pregen join request send success", AnonymousClass001.A1Z());
    }
}
