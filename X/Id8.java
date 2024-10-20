package X;

import com.facebook.rsys.litecamera.LiteCameraProxy;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;

/* loaded from: Id8.class */
public final class Id8 implements JG4 {
    public final /* synthetic */ LiteCameraProxy A00;

    public Id8(LiteCameraProxy liteCameraProxy) {
        this.A00 = liteCameraProxy;
    }

    @Override // X.JG4
    public void CAR(int i, int i2, int i3, int i4, boolean z) {
        LiteCameraProxy liteCameraProxy = this.A00;
        float f = i / i2;
        0fH.A0a(Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), "LiteCameraProxy", "onOutputSizeChanged width=%d height=%d ratio=%f");
        if (f >= 0.85f || liteCameraProxy.A08) {
            liteCameraProxy.A0B.A02(i, i2);
        } else {
            liteCameraProxy.A0B.A02(384, HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_HEIGHT);
        }
    }
}
