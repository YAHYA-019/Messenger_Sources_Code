package X;

import com.facebook.cameracore.mediapipeline.services.video.implementation.VideoPlaybackItem;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: Iou.class */
public final class Iou implements Runnable {
    public static final String __redex_internal_original_name = "VideoPlaybackItem$1";
    public final /* synthetic */ VideoPlaybackItem A00;

    public Iou(VideoPlaybackItem videoPlaybackItem) {
        this.A00 = videoPlaybackItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            VideoPlaybackItem videoPlaybackItem = this.A00;
            String str = videoPlaybackItem.mVideoUri;
            if (str.startsWith("/")) {
                videoPlaybackItem.mMediaPlayer.setDataSource(str);
            } else {
                HashMap A0u = AnonymousClass001.A0u();
                if (!videoPlaybackItem.mRedirectAllowed) {
                    A0u.put("android-allow-cross-domain-redirect", ConstantsKt.CAMERA_ID_FRONT);
                }
                videoPlaybackItem.mMediaPlayer.setDataSource(videoPlaybackItem.mContext, C0A2.A03(videoPlaybackItem.mVideoUri), A0u);
            }
            videoPlaybackItem.mMediaPlayer.setOnPreparedListener(videoPlaybackItem);
            videoPlaybackItem.mMediaPlayer.setOnCompletionListener(videoPlaybackItem);
            videoPlaybackItem.mMediaPlayer.setVolume(0.0f, 0.0f);
            videoPlaybackItem.mMediaPlayer.prepareAsync();
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException unused) {
            this.A00.mHasError.set(true);
        }
    }
}
