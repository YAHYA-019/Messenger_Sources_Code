package com.facebook.wearable.common.comms.hera.host.applinks;

import X.0Pz;
import X.0fH;
import X.11T;
import X.1BK;
import X.2aI;
import X.2aK;
import X.4YV;
import X.7zN;
import X.7zT;
import X.AbstractC00603o4;
import X.C2a2;
import X.MFk;
import X.MK9;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.facebook.acra.constants.ActionId;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AppLinksTransportProvider.class */
public final class AppLinksTransportProvider implements MK9 {
    public static final Companion Companion = new Object();
    public static final int MAX_BYTES_PER_DATAX_BUFFER = 16383;
    public final Context applicationContext;
    public final 2aI coroutineScope;
    public final Integer dataXServiceId;
    public final Map deviceDebugStats;
    public MFk inQueue;
    public volatile String initStats;
    public final LinkedDeviceManager linkedDeviceManager;
    public final Map linkedDevices;
    public final int localNodeId;
    public final Function1 onDeviceDiscoveredListener;
    public final Function1 onDeviceGoneListener;
    public Function2 onRemoteAvailability;
    public volatile C2a2 pendingStopJob;
    public final Map remoteNodeIdToLinkedDevices;
    public final long stopDelayMs;

    /* loaded from: AppLinksTransportProvider$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AppLinksTransportProvider(Context context, 2aI r303, int i, LinkedDeviceManager linkedDeviceManager, Integer num, long j) {
        7zT.A1T(context, r303, linkedDeviceManager);
        this.coroutineScope = r303;
        this.localNodeId = i;
        this.linkedDeviceManager = linkedDeviceManager;
        this.dataXServiceId = num;
        this.stopDelayMs = j;
        Context applicationContext = context.getApplicationContext();
        11T.A0A(applicationContext);
        this.applicationContext = applicationContext;
        this.initStats = "Pending Initialization";
        this.linkedDevices = 1BK.A1C();
        this.remoteNodeIdToLinkedDevices = 1BK.A1C();
        this.deviceDebugStats = 1BK.A1C();
        this.onDeviceDiscoveredListener = new AppLinksTransportProvider$onDeviceDiscoveredListener$1(this);
        this.onDeviceGoneListener = new AppLinksTransportProvider$onDeviceGoneListener$1(this);
    }

    public /* synthetic */ AppLinksTransportProvider(Context context, 2aI r303, int i, LinkedDeviceManager linkedDeviceManager, Integer num, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r303, i, linkedDeviceManager, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? 0L : j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BluetoothManager getBluetoothManager() {
        Object systemService = this.applicationContext.getSystemService(AbstractC00603o4.A00(ActionId.APP_WILL_ENTER_FOREGROUND));
        11T.A0I(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        return (BluetoothManager) systemService;
    }

    public final String getDebugStats() {
        String A0t;
        String str = this.linkedDeviceManager.debugStat;
        if (str == null) {
            str = this.initStats;
        }
        synchronized (this.deviceDebugStats) {
            A0t = 4YV.A0t("\n", this.deviceDebugStats.entrySet(), AppLinksTransportProvider$getDebugStats$1$1.INSTANCE);
        }
        return 0Pz.A0Y(str, A0t, '\n');
    }

    public int getMtu() {
        return 16383;
    }

    @Override // X.MK9
    public void init(MFk mFk, Function2 function2) {
        11T.A0H(mFk, function2);
        this.inQueue = mFk;
        this.onRemoteAvailability = function2;
        this.initStats = "Initializing...";
    }

    @Override // X.MK9
    public boolean start() {
        C2a2 c2a2 = this.pendingStopJob;
        if (c2a2 != null) {
            0fH.A0j(AppLinksTransportProviderKt.TAG, "Canceling pending stop job.");
            c2a2.AE0(null);
            this.pendingStopJob = null;
            return true;
        }
        this.initStats = "Started. Awaiting device discovery...";
        if (this.inQueue == null) {
            throw 1BK.A0g();
        }
        this.linkedDeviceManager.addOnDeviceDiscoveredListener(this.onDeviceDiscoveredListener);
        this.linkedDeviceManager.addOnDeviceGoneListener(this.onDeviceGoneListener);
        return true;
    }

    @Override // X.MK9
    public void stop() {
        this.pendingStopJob = 2aK.A04(new AppLinksTransportProvider$stop$1(this, null), this.coroutineScope);
    }

    @Override // X.MK9
    public void write(int i, int i2, ByteBuffer byteBuffer, int i3) {
        11T.A0F(byteBuffer, 2);
        synchronized (this.remoteNodeIdToLinkedDevices) {
            AppLinksDevice appLinksDevice = (AppLinksDevice) 7zN.A0r(this.remoteNodeIdToLinkedDevices, i3);
            if (appLinksDevice == null) {
                0fH.A0k(AppLinksTransportProviderKt.TAG, 0Pz.A0o("Message with type ", " and size ", " dropped: No linked device found.", i, i2));
            } else {
                appLinksDevice.write(i, i2, byteBuffer);
            }
        }
    }
}
