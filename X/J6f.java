package X;

import org.webrtc.legacy.SurfaceTextureHelper;

/* loaded from: J6f.class */
public final class J6f implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    public JMb A00;
    public final /* synthetic */ C2461Ge3 A01;

    public J6f(C2461Ge3 c2461Ge3, JMb jMb) {
        this.A01 = c2461Ge3;
        this.A00 = jMb;
    }

    @Override // org.webrtc.legacy.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        JMb jMb = this.A00;
        C2461Ge3 c2461Ge3 = this.A01;
        jMb.onCapturedFrameTex(c2461Ge3.A07, c2461Ge3.A06, fArr, i, j, c2461Ge3.A0P);
    }
}
