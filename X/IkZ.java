package X;

import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener;
import com.meta.hera.engine.device.Device;
import com.meta.hera.engine.device.DevicePeripheralState;
import java.util.List;

/* loaded from: IkZ.class */
public final class IkZ implements IHeraCallEngineStateListener.IDeviceStateListener {
    public final /* synthetic */ HeraMessengerPluginImplementation A00;

    public IkZ(HeraMessengerPluginImplementation heraMessengerPluginImplementation) {
        this.A00 = heraMessengerPluginImplementation;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.IDeviceStateListener
    public void onDeviceStateChanged(List list) {
        11T.A0F(list, 0);
        Device device = (Device) 0QD.A0E(list);
        DevicePeripheralState devicePeripheralState = device != null ? device.peripheralStateCase_ == 6 ? (DevicePeripheralState) device.peripheralState_ : DevicePeripheralState.DEFAULT_INSTANCE : null;
        JN7 jn7 = this.A00.A03;
        if (jn7 != null) {
            jn7.Co8(devicePeripheralState);
        }
        0fH.A0j("Hera.MsgrPluginImpl", AnonymousClass001.A0Z(devicePeripheralState, "Device state changed: ", AnonymousClass001.A0k()));
    }
}
