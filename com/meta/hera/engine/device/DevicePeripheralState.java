package com.meta.hera.engine.device;

import X.AnonymousClass001;
import X.KFz;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: DevicePeripheralState.class */
public final class DevicePeripheralState extends KJb implements MJ3 {
    public static final DevicePeripheralState DEFAULT_INSTANCE;
    public static final int DEVICE_BATTERY_STATE_FIELD_NUMBER = 4;
    public static final int DEVICE_CAMERA_ERROR_STATE_FIELD_NUMBER = 6;
    public static final int DEVICE_PEAK_POWER_STATE_FIELD_NUMBER = 5;
    public static final int DEVICE_THERMAL_STATE_FIELD_NUMBER = 3;
    public static final int GLASSES_HINGE_STATE_FIELD_NUMBER = 1;
    public static final int GLASSES_MOUNT_STATE_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public int bitField0_;
    public int deviceBatteryState_;
    public int deviceCameraErrorState_;
    public int devicePeakPowerState_;
    public int deviceThermalState_;
    public int glassesHingeState_;
    public int glassesMountState_;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KJb, com.meta.hera.engine.device.DevicePeripheralState] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, DevicePeripheralState.class);
    }

    public static KFz newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static DevicePeripheralState parseFrom(ByteBuffer byteBuffer) {
        return (DevicePeripheralState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
    }

    public final Object dynamicMethod(KMJ kmj, Object obj, Object obj2) {
        Object obj3;
        MGg mGg;
        switch (kmj.ordinal()) {
            case 0:
                obj3 = (byte) 1;
                break;
            case 1:
                return null;
            case 2:
                return KJb.A05(DEFAULT_INSTANCE, "��\u0006��\u0001\u0001\u0006\u0006������\u0001ဌ��\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"bitField0_", "glassesHingeState_", "glassesMountState_", "deviceThermalState_", "deviceBatteryState_", "devicePeakPowerState_", "deviceCameraErrorState_"});
            case 3:
                return new KJb();
            case 4:
                return new KFz();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (DevicePeripheralState.class) {
                        mGg = PARSER;
                        if (mGg == null) {
                            L9l l9l = Lgf.A01;
                            mGg = KJb.A00(DEFAULT_INSTANCE);
                            PARSER = mGg;
                        }
                    }
                    return mGg;
                }
                break;
            default:
                throw AnonymousClass001.A0p();
        }
        return obj3;
    }
}
