package X;

import com.facebook.messaging.wearable.callengine.RsysBridge;

/* loaded from: J0t.class */
public final class J0t implements Runnable {
    public static final String __redex_internal_original_name = "RsysBridge$cameraInfraProxyImpl$1$setCameraOn2$1$1";
    public final /* synthetic */ RsysBridge A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public J0t(RsysBridge rsysBridge, String str, String str2) {
        this.A00 = rsysBridge;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RsysBridge rsysBridge = this.A00;
        boolean A1O = AnonymousClass001.A1O(0Em.A00(7zL.A09(), "android.permission.CAMERA"));
        0fH.A0n("RsysBridge", 0Pz.A1C("camera on permission result ", A1O));
        if (A1O) {
            0fH.A0n("RsysBridge", "camera on permission granted");
        } else {
            0fH.A0n("RsysBridge", "camera on permission not granted, activate camera failed, camera may not turn on");
            rsysBridge.A03.invoke(this.A01, this.A02);
        }
    }
}
