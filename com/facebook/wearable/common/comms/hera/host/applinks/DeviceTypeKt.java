package com.facebook.wearable.common.comms.hera.host.applinks;

import X.11T;
import X.Ktr;

/* loaded from: DeviceTypeKt.class */
public abstract class DeviceTypeKt {
    public static final DeviceType getDeviceType(Ktr ktr) {
        DeviceType deviceType;
        11T.A0F(ktr, 0);
        DeviceType[] values = DeviceType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                deviceType = null;
                break;
            }
            deviceType = values[i2];
            if (11T.A0O(deviceType.getDeviceName(), ktr.A05)) {
                break;
            }
            i = i2 + 1;
        }
        return deviceType;
    }
}
