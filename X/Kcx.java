package X;

import com.meta.hera.engine.device.DeviceActions$RegisterDevice;
import com.meta.hera.engine.device.DeviceActions$SearchDevices;
import com.meta.hera.engine.device.DeviceActions$UnregisterDevice;
import com.meta.hera.engine.device.DeviceActions$UpdatePeripheralState;

/* loaded from: Kcx.class */
public abstract class Kcx {
    public static final Ku0 A01 = new Ku0(DeviceActions$RegisterDevice.DEFAULT_INSTANCE, "DeviceActions.RegisterDevice");
    public static final Ku0 A03 = new Ku0(DeviceActions$UnregisterDevice.DEFAULT_INSTANCE, "DeviceActions.UnregisterDevice");
    public static final Ku0 A02 = new Ku0(DeviceActions$SearchDevices.DEFAULT_INSTANCE, "DeviceActions.SearchDevices");
    public static final Ku0 A00 = new Ku0(DeviceActions$UpdatePeripheralState.DEFAULT_INSTANCE, "DeviceActions.UpdatePeripheralState");
}
