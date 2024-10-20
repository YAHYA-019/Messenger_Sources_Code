package X;

import org.webrtc.legacy.SurfaceTextureHelper;

/* loaded from: J6d.class */
public final class J6d implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    public final /* synthetic */ IRK A00;

    public J6d(IRK irk) {
        this.A00 = irk;
    }

    @Override // org.webrtc.legacy.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        11T.A0F(fArr, 1);
        IRK irk = this.A00;
        HuS huS = irk.A0H;
        huS.A03("countOnTextureFrameAvailable");
        JMb jMb = irk.A07;
        if (jMb == null) {
            huS.A03("countOnTextureFrameAvailableNullCaptureSink");
        } else {
            huS.A03("countOnCapturedFrameTex");
            jMb.onCapturedFrameTex(irk.A01, irk.A00, fArr, i, j, ((I9a) irk.A0K.get()).A01.AZk(36312733012005869L));
        }
    }
}
