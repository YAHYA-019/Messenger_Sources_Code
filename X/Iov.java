package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.services.video.implementation.VideoPlaybackItem;

/* loaded from: Iov.class */
public final class Iov implements Runnable {
    public static final String __redex_internal_original_name = "VideoPlaybackItem$2";
    public final /* synthetic */ VideoPlaybackItem A00;

    public Iov(VideoPlaybackItem videoPlaybackItem) {
        this.A00 = videoPlaybackItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        VideoPlaybackItem videoPlaybackItem = this.A00;
        if (videoPlaybackItem.mIsPrepared) {
            videoPlaybackItem.mIsPrepared = false;
            try {
                videoPlaybackItem.mMediaPlayer.stop();
            } catch (IllegalStateException unused) {
            }
        }
        videoPlaybackItem.mMediaPlayer.release();
        videoPlaybackItem.mAvailableFrames.set(0);
        Surface surface = videoPlaybackItem.mSurface;
        if (surface != null) {
            surface.release();
            videoPlaybackItem.mSurface = null;
        }
        SurfaceTexture surfaceTexture = videoPlaybackItem.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            videoPlaybackItem.mSurfaceTexture = null;
        }
        HsT hsT = videoPlaybackItem.mTexture;
        if (hsT != null) {
            hsT.A01();
            videoPlaybackItem.mTexture = null;
        }
    }
}
