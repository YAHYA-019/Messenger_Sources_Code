package X;

import android.graphics.Point;
import org.webrtc.legacy.SurfaceTextureHelper;

/* loaded from: J6e.class */
public final class J6e implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    public final /* synthetic */ IRn A00;

    public J6e(IRn iRn) {
        this.A00 = iRn;
    }

    @Override // org.webrtc.legacy.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public final void onTextureFrameAvailable(int i, float[] fArr, long j) {
        11T.A0F(fArr, 1);
        IRn iRn = this.A00;
        if (iRn.A08()) {
            SurfaceTextureHelper surfaceTextureHelper = iRn.A0C;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.returnTextureFrame();
            }
        } else {
            iRn.A09 = new C2607Giw(i, fArr, j);
            JMb jMb = iRn.A0B;
            if (jMb != null) {
                Point point = iRn.A05;
                if (point == null) {
                    11T.A0L("size");
                    throw 0Q8.createAndThrow();
                }
                jMb.onCapturedFrameTex(point.x, point.y, fArr, i, j, true);
            }
        }
        iRn.A02 = 1Br.A01(iRn.A0H);
    }
}
