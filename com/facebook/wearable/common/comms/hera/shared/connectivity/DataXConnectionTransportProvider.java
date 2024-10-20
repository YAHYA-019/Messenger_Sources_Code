package com.facebook.wearable.common.comms.hera.shared.connectivity;

import X.0Pz;
import X.0Q8;
import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.KLm;
import X.Kzi;
import X.MFk;
import X.MK9;
import android.util.Log;
import com.facebook.wearable.common.comms.hera.shared.p000native.NativeManagedBufferPool;
import com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool;
import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: DataXConnectionTransportProvider.class */
public final class DataXConnectionTransportProvider implements MK9 {
    public static final Companion Companion = new Object();
    public static final int INCOMING_BUFFER_POOL_MAX_SIZE = 20;
    public static final int INCOMING_BUFFER_POOL_MIN_SIZE = 5;
    public static final long INCOMING_BUFFER_POOL_POLL_TIMEOUT_MS = 10;
    public static final int MAX_BYTES_PER_DATAX_BUFFER = 16383;
    public static final int MESSAGE_TYPE_REGISTRATION = 52986;
    public static final int MESSAGE_TYPE_REGULAR = 0;
    public static final String TAG = "Hera.DataXConnectionTP";
    public LocalChannel channel;
    public final Connection connection;
    public MFk inQueue;
    public final NativeManagedBufferPool incomingBufferPool;
    public final int localNodeId;
    public final Function1 onError;
    public Function2 onRemoteAvailability;
    public Integer remoteNodeId;
    public final int serviceId;

    /* loaded from: DataXConnectionTransportProvider$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DataXConnectionTransportProvider(Connection connection, int i, int i2, Function1 function1) {
        1BK.A1K(connection, 1, function1);
        this.connection = connection;
        this.serviceId = i;
        this.localNodeId = i2;
        this.onError = function1;
        this.incomingBufferPool = new NativeManagedBufferPool(5, 20, 16383);
    }

    private final IManagedByteBufferPool.IBuffer convertBuffer(ByteBuffer byteBuffer) {
        IManagedByteBufferPool.IBuffer poll = this.incomingBufferPool.poll(10, TimeUnit.MILLISECONDS);
        if (poll == null) {
            Log.w(TAG, "Dropping incoming packet due to buffer starvation.");
            return null;
        }
        ByteBuffer buffer = poll.getBuffer();
        buffer.put(byteBuffer);
        buffer.flip();
        poll.setLimit(buffer.limit());
        return poll;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleIncomingBuffer(Kzi kzi) {
        String str;
        int i = kzi.A01;
        if (i == 0) {
            ByteBuffer byteBuffer = kzi.A00;
            if (byteBuffer == null) {
                return;
            }
            Integer num = this.remoteNodeId;
            if (num != null) {
                IManagedByteBufferPool.IBuffer convertBuffer = convertBuffer(byteBuffer);
                if (convertBuffer != null) {
                    MFk mFk = this.inQueue;
                    if (mFk == null) {
                        11T.A0L("inQueue");
                        throw 0Q8.createAndThrow();
                    }
                    ByteBuffer byteBuffer2 = kzi.A00;
                    mFk.send(0, convertBuffer, byteBuffer2 != null ? byteBuffer2.limit() : 0, num.intValue(), 0);
                    return;
                }
                return;
            }
            str = "Dropped message due to missing remoteNodeId";
        } else {
            if (i == 52986) {
                handleRegistrationResponse(kzi);
                return;
            }
            str = 0Pz.A0T("Unhandled message type: ", i);
        }
        Log.w(TAG, str);
    }

    private final void handleRegistrationResponse(Kzi kzi) {
        Log.v(TAG, "Received registration message");
        ByteBuffer byteBuffer = kzi.A00;
        if (byteBuffer == null || byteBuffer.limit() != 4) {
            Log.w(TAG, "Invalid registration message received");
            this.onError.invoke(AnonymousClass001.A0N("Invalid registration message received"));
            return;
        }
        ByteBuffer byteBuffer2 = kzi.A00;
        byte[] bArr = new byte[byteBuffer2 != null ? byteBuffer2.limit() : 0];
        ByteBuffer byteBuffer3 = kzi.A00;
        if (byteBuffer3 != null) {
            byteBuffer3.get(bArr);
        }
        int intValue = new BigInteger(bArr).intValue();
        Log.v(TAG, 0Pz.A0T("Remote node id: ", intValue));
        Integer valueOf = Integer.valueOf(intValue);
        this.remoteNodeId = valueOf;
        Function2 function2 = this.onRemoteAvailability;
        if (function2 == null) {
            11T.A0L("onRemoteAvailability");
            throw 0Q8.createAndThrow();
        }
        function2.invoke(valueOf, AnonymousClass001.A0K());
    }

    private final void sendRegistration(LocalChannel localChannel) {
        Log.d(TAG, "Sending registration message");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        allocateDirect.putInt(this.localNodeId);
        allocateDirect.flip();
        localChannel.send(new Kzi(52986, allocateDirect));
    }

    public int getMtu() {
        return 16383;
    }

    @Override // X.MK9
    public void init(MFk mFk, Function2 function2) {
        11T.A0H(mFk, function2);
        this.inQueue = mFk;
        this.onRemoteAvailability = function2;
    }

    @Override // X.MK9
    public boolean start() {
        LocalChannel localChannel = new LocalChannel(this.connection, this.serviceId);
        localChannel.onReceived = new DataXConnectionTransportProvider$start$channel$1$1(this);
        localChannel.onError = new DataXConnectionTransportProvider$start$channel$1$2(this);
        localChannel.onClosed = new DataXConnectionTransportProvider$start$channel$1$3(this);
        this.channel = localChannel;
        sendRegistration(localChannel);
        return true;
    }

    @Override // X.MK9
    public void stop() {
        LocalChannel localChannel = this.channel;
        if (localChannel != null) {
            localChannel.close();
        }
        this.channel = null;
    }

    @Override // X.MK9
    public void write(int i, int i2, ByteBuffer byteBuffer, int i3) {
        11T.A0F(byteBuffer, 2);
        LocalChannel localChannel = this.channel;
        if (localChannel == null) {
            Log.w(TAG, 0Pz.A0o("Message with type ", " and size ", " dropped: No channel found.", i, i2));
            return;
        }
        try {
            localChannel.send(new Kzi(0, byteBuffer));
        } catch (KLm e) {
            Log.e(TAG, 0Pz.A0o("Failed to send message with type ", " and size ", " due to DataX error", i, i2), e);
            this.onError.invoke(e);
        }
    }
}
