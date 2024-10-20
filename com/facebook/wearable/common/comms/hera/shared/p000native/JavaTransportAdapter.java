package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.04S;
import X.0Be;
import X.11T;
import X.AnonymousClass001;
import X.C00m;
import X.C00q;
import X.C0ra;
import X.JR2;
import X.MFk;
import X.MK9;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.wearable.common.comms.hera.shared.p000native.NativeManagedBufferPool;
import com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader;
import com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool;
import com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: JavaTransportAdapter.class */
public final class JavaTransportAdapter implements INativeTransportProvider {
    public static final Companion Companion = new Object();
    public static final String TAG = "Hera.JavaTransAdapter";
    public final HybridData mHybridData;
    public final MK9 transport;

    /* renamed from: com.facebook.wearable.common.comms.hera.shared.native.JavaTransportAdapter$1, reason: invalid class name */
    /* loaded from: JavaTransportAdapter$1.class */
    public final class AnonymousClass1 extends C00q implements Function2 {
        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(AnonymousClass001.A03(obj), AnonymousClass001.A1V(obj2));
            return 04S.A00;
        }

        public final void invoke(int i, boolean z) {
            JavaTransportAdapter.this.onRemoteAvailability(i, z);
        }
    }

    /* loaded from: JavaTransportAdapter$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: JavaTransportAdapter$MessageQueueToNativeAdapter.class */
    public final class MessageQueueToNativeAdapter implements MFk {
        public MessageQueueToNativeAdapter() {
        }

        public void clear() {
        }

        public 0Be getCallback() {
            throw AnonymousClass001.A0p();
        }

        @Override // X.MFk
        public void send(int i, Object obj, int i2, int i3, int i4) {
            11T.A0F(obj, 1);
            if (!(obj instanceof NativeManagedBufferPool.NativeManagedBuffer)) {
                if (obj instanceof IManagedByteBufferPool.IBuffer) {
                    JavaTransportAdapter.this.onIncomingBuffer(i3, (IManagedByteBufferPool.IBuffer) obj);
                    return;
                } else {
                    Log.e(JavaTransportAdapter.TAG, "Unsupported buffer type. Dropped.");
                    return;
                }
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                JavaTransportAdapter.this.onIncomingBuffer(i3, (IManagedByteBufferPool.IBuffer) obj);
                if (autoCloseable != null) {
                    autoCloseable.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (autoCloseable != null) {
                        try {
                            autoCloseable.close();
                            throw th2;
                        } catch (Throwable th3) {
                            C0ra.A01(th, th3);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            }
        }

        public void setCallback(0Be r302) {
            throw AnonymousClass001.A0p();
        }
    }

    public JavaTransportAdapter(C00m c00m) {
        11T.A0F(c00m, 1);
        HeraNativeLoader.load();
        MK9 mk9 = (MK9) c00m.invoke();
        this.transport = mk9;
        mk9.init(new MessageQueueToNativeAdapter(), new AnonymousClass1());
        this.mHybridData = initHybrid(16383);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void onIncomingBuffer(int i, IManagedByteBufferPool.IBuffer iBuffer);

    private final void onOutgoingBuffer(int i, IManagedByteBufferPool.IBuffer iBuffer) {
        iBuffer.consume(new JavaTransportAdapter$onOutgoingBuffer$1(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void onRemoteAvailability(int i, boolean z);

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public String getIdentifier() {
        return JR2.A0U(this);
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public boolean start() {
        return this.transport.start();
    }

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.INativeTransportProvider
    public void stop() {
        this.transport.stop();
    }
}
