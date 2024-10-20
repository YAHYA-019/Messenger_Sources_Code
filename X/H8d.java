package X;

import com.facebook.messaging.wearable.callengine.RsysBridge;
import com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioProxy;

/* loaded from: H8d.class */
public final class H8d extends FeatureAudioProxy {
    public final /* synthetic */ RsysBridge A00;

    public H8d(RsysBridge rsysBridge) {
        this.A00 = rsysBridge;
    }

    @Override // com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioProxy
    public void setMicOn2(String str, boolean z) {
        RsysBridge rsysBridge = this.A00;
        4YV.A11(rsysBridge.A0A).execute(new IxL(rsysBridge, z));
    }
}
