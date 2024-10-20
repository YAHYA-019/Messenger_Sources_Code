package com.facebook.wearable.common.comms.rtc.hera.video.util;

import X.11T;
import X.7zT;
import X.AbstractC2326GOr;
import X.JDd;
import X.RSd;
import X.S9j;
import android.view.Surface;
import com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool;
import com.facebook.wearable.common.comms.rtc.hera.intf.IRawVideoSource;
import com.facebook.wearable.common.comms.rtc.hera.video.core.JavaI420Buffer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SurfaceI420Renderer.class */
public final class SurfaceI420Renderer {
    public IRawVideoSource.Output currentOutput;
    public final RawVideoFrameDistributor frameDistributor;
    public Surface surface;

    public SurfaceI420Renderer() {
        this(null);
    }

    public SurfaceI420Renderer(JDd jDd) {
        this.frameDistributor = new RawVideoFrameDistributor(jDd, false);
    }

    public /* synthetic */ SurfaceI420Renderer(JDd jDd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jDd);
    }

    public final Surface getSurface() {
        return this.surface;
    }

    public final void onFrame(int i, int i2, IManagedByteBufferPool.IBuffer iBuffer, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, long j) {
        7zT.A1U(iBuffer, byteBuffer, byteBuffer2);
        11T.A0F(byteBuffer3, 5);
        RSd rSd = new RSd(JavaI420Buffer.A00(new S9j(iBuffer), byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5), i6);
        this.frameDistributor.A03(rSd);
        rSd.A01.release();
    }

    public final void release() {
        AbstractC2326GOr.A1N(this, 37);
    }

    public final void setSurface(Surface surface) {
        if (11T.A0O(this.surface, surface)) {
            return;
        }
        IRawVideoSource.Output output = this.currentOutput;
        if (output != null) {
            this.frameDistributor.removeOutput(output);
        }
        this.currentOutput = null;
        if (surface != null) {
            IRawVideoSource.SurfaceOutput surfaceOutput = new IRawVideoSource.SurfaceOutput(surface);
            this.frameDistributor.addOutput(surfaceOutput);
            this.currentOutput = surfaceOutput;
        }
        this.surface = surface;
    }

    public final void start() {
        AbstractC2326GOr.A1N(this, 38);
    }

    public final void stop() {
        AbstractC2326GOr.A1N(this, 39);
    }
}
