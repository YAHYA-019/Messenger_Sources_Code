package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.11T;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: NativeManagedBufferPool.class */
public final class NativeManagedBufferPool implements IManagedByteBufferPool {
    public HybridData mHybridData;

    /* loaded from: NativeManagedBufferPool$NativeManagedBuffer.class */
    public final class NativeManagedBuffer extends IManagedByteBufferPool.IBuffer {
        public final ByteBuffer buffer;
        public final HybridData mHybridData;

        public NativeManagedBuffer(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool.IBuffer
        public native void dispose();

        @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool.IBuffer
        public native ByteBuffer getBuffer();

        @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool.IBuffer
        public native int getLimit();

        @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool.IBuffer
        public native void setLimit(int i);
    }

    public NativeManagedBufferPool() {
        HeraNativeLoader.load();
    }

    public NativeManagedBufferPool(int i, int i2, int i3) {
        this();
        this.mHybridData = initHybrid(i, i2, i3);
    }

    public NativeManagedBufferPool(HybridData hybridData) {
        this();
        this.mHybridData = hybridData;
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i, int i2, int i3);

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool
    public native IManagedByteBufferPool.IBuffer poll(long j);

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool
    public IManagedByteBufferPool.IBuffer poll(long j, TimeUnit timeUnit) {
        11T.A0F(timeUnit, 1);
        return poll(timeUnit.toMillis(j));
    }
}
