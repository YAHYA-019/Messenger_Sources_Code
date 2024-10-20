package X;

import android.graphics.Matrix;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import org.webrtc.VideoFrame;
import org.webrtc.legacy.SurfaceTextureHelper;

/* loaded from: J2b.class */
public final class J2b implements Runnable {
    public static final String __redex_internal_original_name = "RsysScreenShareViewCoordMediaCaptureSink$onCapturedFrameTex$frameRunnable$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ IlF A03;
    public final /* synthetic */ float[] A04;

    public J2b(IlF ilF, float[] fArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = fArr;
        this.A03 = ilF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScreenShareApi B98;
        int i = this.A02;
        int i2 = this.A00;
        VideoFrame.TextureBuffer.Type type = VideoFrame.TextureBuffer.Type.OES;
        int i3 = this.A01;
        Matrix A00 = Hw8.A00(this.A04);
        IlF ilF = this.A03;
        VideoFrame videoFrame = new VideoFrame(new J6b(A00, ((SurfaceTextureHelper) ilF.A03.getValue()).handler, new J6Q((Runnable) ilF.A02.getValue()), type, (Hhy) ilF.A04.getValue(), i, i2, i, i2, i3), 0, 0L);
        RSVideoFrame rSVideoFrame = new RSVideoFrame(videoFrame, true, 1);
        1Br.A0C(ilF.A01);
        Ia1 A0d = GOq.A0d();
        if (A0d != null && (B98 = A0d.A02.B98()) != null) {
            B98.handleFrame(rSVideoFrame, false);
        }
        videoFrame.release();
    }
}
