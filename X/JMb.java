package X;

import com.facebook.webrtc.cameraviewcoordinator.RtcCameraViewCoordinator;
import org.webrtc.legacy.SurfaceTextureHelper;
import org.webrtc.legacy.videoengine.ARGBBuffer;
import org.webrtc.legacy.videoengine.NV21Buffer;
import org.webrtc.legacy.videoengine.YUV420888Buffer;

/* loaded from: JMb.class */
public interface JMb {
    SurfaceTextureHelper getSurfaceTextureHelper();

    boolean hasSharedGlContext();

    void onCapturedFrameARGB(ARGBBuffer aRGBBuffer, int i, int i2);

    void onCapturedFrameNV21(NV21Buffer nV21Buffer);

    void onCapturedFrameTex(int i, int i2, float[] fArr, int i3, long j, boolean z);

    void onCapturedFrameYUV(YUV420888Buffer yUV420888Buffer);

    void setCamera(RtcCameraViewCoordinator rtcCameraViewCoordinator);
}
