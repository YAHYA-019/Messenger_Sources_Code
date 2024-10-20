package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.11T;
import X.C0ra;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* loaded from: IManagedByteBufferPool.class */
public interface IManagedByteBufferPool {

    /* loaded from: IManagedByteBufferPool$IBuffer.class */
    public abstract class IBuffer implements AutoCloseable {
        @Override // java.lang.AutoCloseable
        public void close() {
            dispose();
        }

        public final Object consume(Function1 function1) {
            11T.A0F(function1, 0);
            try {
                Object invoke = function1.invoke(getBuffer());
                close();
                return invoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        close();
                        throw th2;
                    } catch (Throwable th3) {
                        C0ra.A01(th, th3);
                        throw th2;
                    }
                }
            }
        }

        public abstract void dispose();

        public abstract ByteBuffer getBuffer();

        public abstract int getLimit();

        public abstract void setLimit(int i);
    }

    IBuffer poll(long j);

    IBuffer poll(long j, TimeUnit timeUnit);
}
