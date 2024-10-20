package X;

import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.litecamera.LiteCameraProxy;
import com.facebook.rsys.rtc.RSVideoFrame;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: J6c.class */
public final class J6c implements VideoSink {
    public final /* synthetic */ LiteCameraProxy A00;

    public J6c(LiteCameraProxy liteCameraProxy) {
        this.A00 = liteCameraProxy;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        LiteCameraProxy liteCameraProxy = this.A00;
        CameraApi cameraApi = liteCameraProxy.A03;
        if (cameraApi == null || !liteCameraProxy.A09) {
            return;
        }
        cameraApi.handleFrame(new RSVideoFrame(videoFrame, true, -1));
    }
}
