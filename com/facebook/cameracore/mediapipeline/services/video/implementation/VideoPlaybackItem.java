package com.facebook.cameracore.mediapipeline.services.video.implementation;

import X.DKC;
import X.GOn;
import X.Hfk;
import X.HsT;
import X.I8U;
import X.Iou;
import X.Iov;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.opengl.Matrix;
import android.view.Surface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: VideoPlaybackItem.class */
public class VideoPlaybackItem implements MediaPlayer.OnCompletionListener, SurfaceTexture.OnFrameAvailableListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    public final AtomicInteger mAvailableFrames;
    public final ExecutorService mBackgroundThread;
    public int mCompletedCount;
    public final Context mContext;
    public final AtomicBoolean mHasError;
    public boolean mIsLooping;
    public volatile boolean mIsPrepared;
    public int mLoopedCount;
    public final MediaPlayer mMediaPlayer;
    public final boolean mRedirectAllowed;
    public final float[] mSMatrix;
    public volatile boolean mStartRequested;
    public Surface mSurface;
    public SurfaceTexture mSurfaceTexture;
    public HsT mTexture;
    public final VideoFrame mVideoFrame = new Object();
    public final String mVideoUri;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.cameracore.mediapipeline.services.video.implementation.VideoFrame, java.lang.Object] */
    public VideoPlaybackItem(Context context, String str, boolean z, ExecutorService executorService) {
        float[] A1a = GOn.A1a();
        this.mSMatrix = A1a;
        this.mIsPrepared = false;
        this.mStartRequested = false;
        this.mLoopedCount = 0;
        this.mCompletedCount = 0;
        this.mContext = context;
        this.mVideoUri = str;
        this.mRedirectAllowed = z;
        this.mAvailableFrames = GOn.A1K(0);
        this.mHasError = DKC.A1E(false);
        this.mBackgroundThread = executorService;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.setOnErrorListener(this);
        Matrix.setIdentityM(A1a, 0);
    }

    public int getCompletedCount() {
        return this.mCompletedCount;
    }

    public int getDuration() {
        return this.mMediaPlayer.getDuration();
    }

    public boolean getHasError() {
        return this.mHasError.getAndSet(false);
    }

    public boolean getIsPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    public int getLoopedCount() {
        return this.mLoopedCount;
    }

    public boolean getLooping() {
        return this.mIsLooping;
    }

    public int getPosition() {
        return this.mMediaPlayer.getCurrentPosition();
    }

    public VideoFrame getVideoFrameIfAvailable() {
        int i = 0;
        int andSet = this.mAvailableFrames.getAndSet(0);
        if (andSet <= 0 || this.mSurface == null || this.mTexture == null || this.mSurfaceTexture == null) {
            return null;
        }
        do {
            this.mSurfaceTexture.updateTexImage();
            i++;
        } while (i < andSet);
        this.mSurfaceTexture.getTransformMatrix(this.mSMatrix);
        VideoFrame videoFrame = this.mVideoFrame;
        HsT hsT = this.mTexture;
        int i2 = hsT.A00;
        int i3 = hsT.A01;
        float[] fArr = this.mSMatrix;
        Hfk hfk = hsT.A02;
        int i4 = hfk.A01;
        int i5 = hfk.A00;
        long currentPosition = this.mMediaPlayer.getCurrentPosition();
        videoFrame.textureHandler = i2;
        videoFrame.textureTarget = i3;
        videoFrame.transformationMatrix = fArr;
        videoFrame.width = i4;
        videoFrame.height = i5;
        videoFrame.presentationTimestamp = currentPosition;
        return this.mVideoFrame;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (!this.mIsLooping) {
            this.mCompletedCount++;
            return;
        }
        this.mLoopedCount++;
        try {
            mediaPlayer.start();
        } catch (IllegalStateException unused) {
            this.mHasError.set(true);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.mHasError.set(true);
        return false;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mAvailableFrames.incrementAndGet();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mMediaPlayer.setLooping(false);
        I8U i8u = new I8U("VideoPlaybackItem");
        i8u.A03 = 36197;
        i8u.A04 = this.mMediaPlayer.getVideoWidth();
        i8u.A02 = this.mMediaPlayer.getVideoHeight();
        HsT hsT = new HsT(i8u);
        this.mTexture = hsT;
        SurfaceTexture surfaceTexture = new SurfaceTexture(hsT.A00);
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        Surface surface = new Surface(this.mSurfaceTexture);
        this.mSurface = surface;
        this.mMediaPlayer.setSurface(surface);
        this.mIsPrepared = true;
        if (this.mStartRequested) {
            try {
                this.mMediaPlayer.start();
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
            }
        }
    }

    public void pause() {
        this.mStartRequested = false;
        try {
            this.mMediaPlayer.pause();
        } catch (IllegalStateException unused) {
            this.mHasError.set(true);
        }
    }

    public void prepare() {
        this.mBackgroundThread.execute(new Iou(this));
    }

    public void resume() {
        this.mStartRequested = true;
        if (this.mIsPrepared) {
            try {
                this.mMediaPlayer.start();
            } catch (IllegalStateException unused) {
                this.mHasError.set(true);
            }
        }
    }

    public void seek(int i) {
        this.mMediaPlayer.seekTo(i, 3);
    }

    public void setLooping(boolean z) {
        this.mIsLooping = z;
    }

    public void setVolume(float f, float f2) {
        this.mMediaPlayer.setVolume(f, f2);
    }

    public void teardown() {
        if (this.mBackgroundThread.isShutdown()) {
            return;
        }
        this.mBackgroundThread.execute(new Iov(this));
    }
}
