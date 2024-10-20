package com.facebook.wearable.common.comms.hera.host.applinks;

import X.0DV;
import X.0DY;
import X.0Pz;
import X.0fH;
import X.11T;
import X.1BK;
import X.2aI;
import X.2aK;
import X.7zO;
import X.7zR;
import X.7zS;
import X.AnonymousClass001;
import X.C0Bd;
import X.C2a2;
import X.G9E;
import X.GAV;
import X.KLm;
import X.KXb;
import X.KYu;
import X.KYx;
import X.KtJ;
import X.KwG;
import X.Kzi;
import X.LAJ;
import X.MFk;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import com.facebook.wearable.common.comms.hera.shared.p000native.NativeManagedBufferPool;
import com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos;
import com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool;
import com.facebook.wearable.datax.LocalChannel;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AppLinksDevice.class */
public final class AppLinksDevice {
    public static final Companion Companion = new Object();
    public static final int INCOMING_BUFFER_POOL_MAX_SIZE = 20;
    public static final int INCOMING_BUFFER_POOL_MIN_SIZE = 5;
    public static final long INCOMING_BUFFER_POOL_POLL_TIMEOUT_MS = 10;
    public static final int MESSAGE_TYPE_REGISTRATION = 52986;
    public static final int MESSAGE_TYPE_REGULAR = 0;
    public static final long RETRY_DELAY_MS = 500;
    public static final String RFCOMM_UUID = "8B0D2687-42A4-44CB-9436-FBA3B9B96DE2";
    public static final String TAG = "Hera.AppLinksDevice";
    public final UUID appLinkUUID;
    public final BluetoothManager bluetoothManager;
    public LocalChannel channel;
    public final AppLinksDeviceConfig config;
    public final 2aI coroutineScope;
    public final Integer dataXServiceId;
    public LAJ device;
    public final MFk inQueue;
    public final NativeManagedBufferPool incomingBufferPool;
    public final AtomicBoolean isStarted;
    public final int localNodeId;
    public final Function2 onDebugStats;
    public final C0Bd onRemoteAvailability;
    public Integer remoteNodeId;
    public C2a2 retryJob;
    public LocalChannel snamChannel;
    public BluetoothSocket socket;

    /* loaded from: AppLinksDevice$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: AppLinksDevice$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:10:0x0022
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos$CompanionDeviceErrorCode[] r0 = com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos.CompanionDeviceErrorCode.values()
                r301 = r0
                r0 = r301
                int r0 = r0.length
                r302 = r0
                r0 = r302
                int[] r0 = new int[r0]
                r303 = r0
                com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos$CompanionDeviceErrorCode r0 = com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos.CompanionDeviceErrorCode.Success     // Catch: java.lang.NoSuchFieldError -> L22
                r301 = r0
                r0 = r301
                r1 = r303
                X.DKD.A1M(r0, r1)     // Catch: java.lang.NoSuchFieldError -> L22
            L14:
                com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos$CompanionDeviceErrorCode r0 = com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos.CompanionDeviceErrorCode.AppAlreadyStarted     // Catch: java.lang.NoSuchFieldError -> L22 java.lang.NoSuchFieldError -> L26
                r301 = r0
                r0 = r301
                r1 = r303
                X.DKD.A1N(r0, r1)     // Catch: java.lang.NoSuchFieldError -> L26
            L1d:
                r0 = r303
                com.facebook.wearable.common.comms.hera.host.applinks.AppLinksDevice.WhenMappings.$EnumSwitchMapping$0 = r0
                return
            L22:
                goto L14
            L26:
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.host.applinks.AppLinksDevice.WhenMappings.m10241clinit():void");
        }
    }

    public AppLinksDevice(int i, UUID uuid, AppLinksDeviceConfig appLinksDeviceConfig, Integer num, 2aI r306, int i2, MFk mFk, BluetoothManager bluetoothManager, Function2 function2, C0Bd c0Bd) {
        7zR.A1O(uuid, appLinksDeviceConfig);
        11T.A0F(r306, 5);
        7zS.A18(7, mFk, bluetoothManager, function2);
        11T.A0F(c0Bd, 10);
        this.appLinkUUID = uuid;
        this.config = appLinksDeviceConfig;
        this.dataXServiceId = num;
        this.coroutineScope = r306;
        this.localNodeId = i2;
        this.inQueue = mFk;
        this.bluetoothManager = bluetoothManager;
        this.onDebugStats = function2;
        this.onRemoteAvailability = c0Bd;
        this.incomingBufferPool = new NativeManagedBufferPool(5, 20, i);
        this.isStarted = 7zO.A15();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IManagedByteBufferPool.IBuffer convertBuffer(ByteBuffer byteBuffer) {
        IManagedByteBufferPool.IBuffer poll = this.incomingBufferPool.poll(10, TimeUnit.MILLISECONDS);
        if (poll == null) {
            0fH.A0n(TAG, "Dropping incoming packet due to buffer starvation.");
            return null;
        }
        ByteBuffer buffer = poll.getBuffer();
        buffer.put(byteBuffer);
        buffer.flip();
        poll.setLimit(buffer.limit());
        return poll;
    }

    private final BluetoothSocket createSocketForBTC() {
        String str = this.config.BtcAddress;
        if (str != null) {
            BluetoothAdapter adapter = this.bluetoothManager.getAdapter();
            if (!adapter.isEnabled()) {
                throw AnonymousClass001.A0N("Bluetooth is not enabled.  Cannot attempt to establish RFCOMM socket connection");
            }
            0fH.A0j(TAG, 0Pz.A0v("Attempting to connect to remote device ", this.config.deviceName, " at ...", 0DY.A0m(str, 6)));
            BluetoothSocket createRfcommSocketToServiceRecord = adapter.getRemoteDevice(str).createRfcommSocketToServiceRecord(UUID.fromString(RFCOMM_UUID));
            if (createRfcommSocketToServiceRecord != null) {
                0fH.A0j(TAG, "Connecting to bluetooth socket...");
                createRfcommSocketToServiceRecord.connect();
                createRfcommSocketToServiceRecord.getOutputStream().write(KwG.A01(this.appLinkUUID));
                return createRfcommSocketToServiceRecord;
            }
        }
        throw AnonymousClass001.A0T("Unable to connect to BT socket over RFCOMM");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLinkedDeviceReady() {
        if (this.config.deviceType.getRequireSnam()) {
            startSnamChannel();
        } else {
            startDataXChannel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRegistrationResponse(Kzi kzi) {
        0fH.A0j(TAG, "Received registration message");
        ByteBuffer byteBuffer = kzi.A00;
        if (byteBuffer == null || byteBuffer.limit() != 4) {
            this.onDebugStats.invoke("Invalid registraion message", this);
            0fH.A0k(TAG, "Invalid registration message received");
            teardownAndMaybeScheduleRetry("Invalid reg msg");
            return;
        }
        ByteBuffer byteBuffer2 = kzi.A00;
        byte[] bArr = new byte[byteBuffer2 != null ? byteBuffer2.limit() : 0];
        ByteBuffer byteBuffer3 = kzi.A00;
        if (byteBuffer3 != null) {
            byteBuffer3.get(bArr);
        }
        int intValue = new BigInteger(bArr).intValue();
        0fH.A0j(TAG, 0Pz.A0T("Remote node id: ", intValue));
        Integer valueOf = Integer.valueOf(intValue);
        this.remoteNodeId = valueOf;
        this.onRemoteAvailability.invoke(valueOf, AnonymousClass001.A0K(), this);
        this.onDebugStats.invoke("Link ready", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSnamResponse(Kzi kzi) {
        String A0W;
        0fH.A0j(TAG, "[SNAM] handleSnamResponse");
        ByteBuffer byteBuffer = kzi.A00;
        if (byteBuffer == null) {
            0fH.A0j(TAG, "[SNAM] handleSnamResponse: No bytes found");
            A0W = "SNAM No bytes";
        } else {
            int i = kzi.A01;
            if (i != 2001) {
                if (i == 2003) {
                    String name = SnAppManagerProtos.INSTANCE.parseAppStopResponse(byteBuffer).name();
                    1BK.A1Q("[SNAM] Stop App Response: ", name, TAG);
                    this.onDebugStats.invoke(0Pz.A0W("SNAM Stop App Response: ", name), this);
                    return;
                }
                return;
            }
            SnAppManagerProtos.CompanionDeviceErrorCode parseAppStartResponse = SnAppManagerProtos.INSTANCE.parseAppStartResponse(byteBuffer);
            String name2 = parseAppStartResponse.name();
            1BK.A1Q("[SNAM] Start App Response: ", name2, TAG);
            int ordinal = parseAppStartResponse.ordinal();
            if (ordinal == 2 || ordinal == 13) {
                startDataXChannel();
                return;
            }
            A0W = 0Pz.A0W("SNAM Start App Error: ", name2);
        }
        teardownAndMaybeScheduleRetry(A0W);
    }

    private final void sendRegistration() {
        0fH.A0j(TAG, "Sending registration message");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        allocateDirect.putInt(this.localNodeId);
        allocateDirect.flip();
        LocalChannel localChannel = this.channel;
        if (localChannel != null) {
            localChannel.send(new Kzi(52986, allocateDirect));
        } else {
            0fH.A0k(TAG, "Not sending registration: No channel found.");
            teardownAndMaybeScheduleRetry("Missing DataX channel");
        }
    }

    private final void sendSnamStartOrStopSignal(LocalChannel localChannel, boolean z) {
        SnAppManagerProtos snAppManagerProtos = SnAppManagerProtos.INSTANCE;
        localChannel.send(new Kzi(snAppManagerProtos.getAppControlRequestMessageType(z), snAppManagerProtos.createAppControlRequest(z, 29)));
    }

    private final void startDataXChannel() {
        LAJ laj = this.device;
        if (laj == null) {
            0fH.A0k(TAG, "Not opening channel: No device found.");
            teardownAndMaybeScheduleRetry("Missing device");
            return;
        }
        this.onDebugStats.invoke("Opening DataX channel", this);
        Integer num = this.dataXServiceId;
        int intValue = num != null ? num.intValue() : 42001;
        0fH.A0l(TAG, 0Pz.A0T("[DataX] Opening channel to service: ", intValue));
        LocalChannel localChannel = new LocalChannel(laj.A09.A00.A07, intValue);
        localChannel.onClosed = new AppLinksDevice$startDataXChannel$channel$1$1(this);
        localChannel.onReceived = new AppLinksDevice$startDataXChannel$channel$1$2(this);
        localChannel.onError = new AppLinksDevice$startDataXChannel$channel$1$3(this);
        this.channel = localChannel;
        this.onDebugStats.invoke("DataX channel opened", this);
        sendRegistration();
    }

    private final void startSnamChannel() {
        this.onDebugStats.invoke("Opending SNAM channel", this);
        LAJ laj = this.device;
        if (laj == null) {
            0fH.A0k(TAG, "Not opening SNAM channel: No device found.");
            teardownAndMaybeScheduleRetry("SNAM Missing device");
            return;
        }
        LocalChannel localChannel = new LocalChannel(laj.A09.A00.A07, 28);
        localChannel.onClosed = new AppLinksDevice$startSnamChannel$channel$1$1(this);
        localChannel.onReceived = new AppLinksDevice$startSnamChannel$channel$1$2(this);
        localChannel.onError = new AppLinksDevice$startSnamChannel$channel$1$3(this);
        this.snamChannel = localChannel;
        this.onDebugStats.invoke("SNAM channel opened", this);
        sendSnamStartOrStopSignal(localChannel, true);
    }

    private final void teardown() {
        try {
            LocalChannel localChannel = this.channel;
            if (localChannel != null) {
                localChannel.close();
            }
        } catch (Throwable th) {
            new 0DV(th);
        }
        this.channel = null;
        try {
            LocalChannel localChannel2 = this.snamChannel;
            if (localChannel2 != null) {
                localChannel2.close();
            }
        } catch (Throwable th2) {
            new 0DV(th2);
        }
        this.channel = null;
        LAJ laj = this.device;
        if (laj != null) {
            LAJ.A02(laj, GAV.A00);
        }
        try {
            BluetoothSocket bluetoothSocket = this.socket;
            if (bluetoothSocket != null) {
                bluetoothSocket.close();
            }
        } catch (Throwable th3) {
            new 0DV(th3);
        }
        this.socket = null;
        C2a2 c2a2 = this.retryJob;
        if (c2a2 != null) {
            c2a2.AE0(null);
        }
        this.retryJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void teardownAndMaybeScheduleRetry(String str) {
        String str2;
        teardown();
        if (this.isStarted.get()) {
            C2a2 c2a2 = this.retryJob;
            if (c2a2 != null) {
                c2a2.AE0(null);
            }
            this.retryJob = 2aK.A04(new AppLinksDevice$teardownAndMaybeScheduleRetry$1(this, null), this.coroutineScope);
            this.onDebugStats.invoke(0Pz.A0W("Scheduled retry: ", str), this);
            str2 = "Scheduled retry in 500ms";
        } else {
            str2 = "Not scheduling retry. Not started (or already stopped).";
        }
        0fH.A0l(TAG, str2);
    }

    public final UUID getAppLinkUUID() {
        return this.appLinkUUID;
    }

    public final AppLinksDeviceConfig getConfig() {
        return this.config;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.KYu] */
    public final void startConnection() {
        this.isStarted.set(true);
        this.onDebugStats.invoke("Connecting to linked device...", this);
        try {
            BluetoothSocket createSocketForBTC = createSocketForBTC();
            this.socket = createSocketForBTC;
            UUID uuid = this.config.serviceUUID;
            AppLinksDevice$startConnection$1 appLinksDevice$startConnection$1 = new AppLinksDevice$startConnection$1(this);
            AppLinksDevice$startConnection$2 appLinksDevice$startConnection$2 = AppLinksDevice$startConnection$2.INSTANCE;
            AppLinksDevice$startConnection$3 appLinksDevice$startConnection$3 = new AppLinksDevice$startConnection$3(this);
            LAJ laj = new LAJ((KYu) new Object(), uuid, appLinksDevice$startConnection$1, appLinksDevice$startConnection$2, AppLinksDevice$startConnection$4.INSTANCE, appLinksDevice$startConnection$3);
            0fH.A0j(TAG, "[SOCKET_CONNECTION]: Open linked device...");
            KtJ ktJ = this.config.linkSecurity;
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Opening device (");
            A0k.append(createSocketForBTC.getRemoteDevice());
            A0k.append(") link ");
            KYx.A00("lam:LinkedDevice", AnonymousClass001.A0a(laj.A0B, A0k));
            laj.A0A.add(new G9E(createSocketForBTC, 9));
            if (ktJ == null) {
                throw AnonymousClass001.A0N("invalid security configuration");
            }
            laj.A03(KXb.A00(createSocketForBTC), ktJ);
            this.device = laj;
        } catch (Exception e) {
            0fH.A0r(TAG, "Failed to create socket for BTC", e);
            teardownAndMaybeScheduleRetry(0Pz.A1B("BTC Socket Fail: ", e));
        }
    }

    public final void stop() {
        this.isStarted.set(false);
        teardown();
    }

    public final void write(int i, int i2, ByteBuffer byteBuffer) {
        11T.A0F(byteBuffer, 2);
        LocalChannel localChannel = this.channel;
        if (localChannel == null) {
            0fH.A0k(TAG, 0Pz.A0o("Message with type ", " and size ", " dropped: No channel found.", i, i2));
            return;
        }
        try {
            localChannel.send(new Kzi(0, byteBuffer));
        } catch (KLm e) {
            0fH.A0r(TAG, 0Pz.A0o("Failed to send message with type ", " and size ", " due to DataX error", i, i2), e);
            teardownAndMaybeScheduleRetry(0Pz.A1B("DataX Proto Error: ", e));
        }
    }
}
