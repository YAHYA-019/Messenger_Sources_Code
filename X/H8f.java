package X;

import com.facebook.messaging.wearable.callengine.RsysBridge;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraInfraProxy;

/* loaded from: H8f.class */
public final class H8f extends FeatureCameraInfraProxy {
    public final /* synthetic */ RsysBridge A00;

    public H8f(RsysBridge rsysBridge) {
        this.A00 = rsysBridge;
    }

    @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraInfraProxy
    public void setCameraAccess2(String str, boolean z) {
        11T.A0F(str, 0);
        setCameraOn2(str, null, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        if (r309 == null) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0Je, java.lang.Object] */
    @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraInfraProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCameraOn2(java.lang.String r302, java.lang.String r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8f.setCameraOn2(java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
