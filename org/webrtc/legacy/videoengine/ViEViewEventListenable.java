package org.webrtc.legacy.videoengine;

/* loaded from: ViEViewEventListenable.class */
public interface ViEViewEventListenable {
    void setOneShotDrawListener(OneShotDrawListener oneShotDrawListener);

    void setOneShotReDrawListener(OneShotReDrawListener oneShotReDrawListener);

    void setVideoSizeChangedListener(VideoSizeChangedListener videoSizeChangedListener);
}
