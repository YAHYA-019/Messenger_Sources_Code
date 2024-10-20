package com.facebook.rsys.rtc;

import X.GOn;
import com.facebook.simplejni.NativeHolder;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.RefCounted;
import org.webrtc.VideoFrame;

/* loaded from: RSVideoFrame.class */
public class RSVideoFrame implements RefCounted {
    public final NativeHolder mNativeHolder;
    public final AtomicInteger refCount = GOn.A1K(1);

    public RSVideoFrame(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public RSVideoFrame(VideoFrame videoFrame, boolean z, int i) {
        this.mNativeHolder = initNativeHolder(videoFrame, z, i);
    }

    public static native NativeHolder initNativeHolder(VideoFrame videoFrame, boolean z, int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RSVideoFrame)) {
            return false;
        }
        return getVideoFrame().buffer.equals(((RSVideoFrame) obj).getVideoFrame().buffer);
    }

    public native VideoFrame getVideoFrame();

    public native void onFrameReadyToRender();

    public native void onFrameRendered();

    public native void registerFrameRenderedCallback();

    @Override // org.webrtc.RefCounted
    public void release() {
        if (this.refCount.decrementAndGet() == 0) {
            NativeHolder nativeHolder = this.mNativeHolder;
            synchronized (nativeHolder) {
                nativeHolder.mDestructor.destruct();
            }
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }
}
