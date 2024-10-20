package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0DE;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.0Pz;
import X.0Q8;
import X.0fH;
import X.11T;
import X.2aI;
import X.2aK;
import X.7zO;
import X.AnonymousClass001;
import X.C00q;
import X.MFk;
import android.bluetooth.BluetoothManager;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: AppLinksTransportProvider$onDeviceDiscoveredListener$1.class */
public final class AppLinksTransportProvider$onDeviceDiscoveredListener$1 extends C00q implements Function1 {
    public final /* synthetic */ AppLinksTransportProvider this$0;

    /* renamed from: com.facebook.wearable.common.comms.hera.host.applinks.AppLinksTransportProvider$onDeviceDiscoveredListener$1$1, reason: invalid class name */
    /* loaded from: AppLinksTransportProvider$onDeviceDiscoveredListener$1$1.class */
    public final class AnonymousClass1 extends 0DO implements Function2 {
        public final /* synthetic */ AppLinksDevice $device;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppLinksDevice appLinksDevice, 0DR r303) {
            super(2, r303);
            this.$device = appLinksDevice;
        }

        public final 0DR create(Object obj, 0DR r303) {
            return new AnonymousClass1(this.$device, r303);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(2aI r302, 0DR r303) {
            return new AnonymousClass1(this.$device, r303).invokeSuspend(04S.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
            this.$device.startConnection();
            return 04S.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksTransportProvider$onDeviceDiscoveredListener$1(AppLinksTransportProvider appLinksTransportProvider) {
        super(1);
        this.this$0 = appLinksTransportProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AppLinksDeviceConfig) obj);
        return 04S.A00;
    }

    public final void invoke(AppLinksDeviceConfig appLinksDeviceConfig) {
        BluetoothManager bluetoothManager;
        0fH.A0l(AppLinksTransportProviderKt.TAG, AnonymousClass001.A0Z(appLinksDeviceConfig, "Got discovered device from LDM: ", 7zO.A0x(appLinksDeviceConfig, 0)));
        if (this.this$0.linkedDevices.containsKey(appLinksDeviceConfig.BtcAddress)) {
            0fH.A0l(AppLinksTransportProviderKt.TAG, 0Pz.A0W("Ignored discovered device, device already exists: ", appLinksDeviceConfig.BtcAddress));
            return;
        }
        UUID uuid = appLinksDeviceConfig.serviceUUID;
        AppLinksTransportProvider appLinksTransportProvider = this.this$0;
        Integer num = appLinksTransportProvider.dataXServiceId;
        2aI r0 = appLinksTransportProvider.coroutineScope;
        int i = appLinksTransportProvider.localNodeId;
        MFk mFk = appLinksTransportProvider.inQueue;
        if (mFk == null) {
            11T.A0L("inQueue");
            throw 0Q8.createAndThrow();
        }
        bluetoothManager = appLinksTransportProvider.getBluetoothManager();
        AppLinksTransportProvider appLinksTransportProvider2 = this.this$0;
        AppLinksDevice appLinksDevice = new AppLinksDevice(16383, uuid, appLinksDeviceConfig, num, r0, i, mFk, bluetoothManager, new AppLinksTransportProvider$onDeviceDiscoveredListener$1$device$1(appLinksTransportProvider2), new AppLinksTransportProvider$onDeviceDiscoveredListener$1$device$2(appLinksTransportProvider2));
        this.this$0.linkedDevices.put(appLinksDeviceConfig.BtcAddress, appLinksDevice);
        2aK.A03((Integer) null, (0DE) null, new AnonymousClass1(appLinksDevice, null), this.this$0.coroutineScope, 3);
    }
}
