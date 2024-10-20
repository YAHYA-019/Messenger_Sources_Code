package X;

import com.facebook.messaging.wearable.callengine.RsysBridge;
import com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.Call;
import com.meta.wearable.comms.calling.hera.engine.base.EngineErrno;
import com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreProxy;

/* loaded from: H8i.class */
public final class H8i extends FeatureCoreProxy {
    public final /* synthetic */ RsysBridge A00;

    public H8i(RsysBridge rsysBridge) {
        this.A00 = rsysBridge;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r0 == 200) goto L6;
     */
    @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void acceptIncomingCall2(com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.Call r302) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8i.acceptIncomingCall2(com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.Call):void");
    }

    @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreProxy
    public void endCall2(Call call) {
        0fH.A0l("RsysBridge", "endCall2");
        RsysBridge rsysBridge = this.A00;
        ((Hrj) 1Br.A0B(rsysBridge.A06)).A01(rsysBridge.A05, "Call ended by user from smart glasses");
    }

    @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreProxy
    public EngineErrno startOutgoingCall(Call call) {
        11T.A0F(call, 0);
        return (EngineErrno) 44X.A00(0DL.A00, new AJX(call, this.A00, (0DR) null, 6));
    }
}
