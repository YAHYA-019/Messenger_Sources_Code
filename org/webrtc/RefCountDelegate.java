package org.webrtc;

import X.GOn;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: RefCountDelegate.class */
public class RefCountDelegate implements RefCounted {
    public final AtomicInteger refCount = GOn.A1K(1);
    public final Runnable releaseCallback;

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
            return;
        }
        runnable.run();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }
}
