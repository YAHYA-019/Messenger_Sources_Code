package com.meta.hera.engine.device;

import X.AnonymousClass001;
import X.KFy;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: DeviceActions$UpdatePeripheralState.class */
public final class DeviceActions$UpdatePeripheralState extends KJb implements MJ3 {
    public static final DeviceActions$UpdatePeripheralState DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int DEVICE_PERIPHERAL_STATE_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public static final int PHONE_PERIPHERAL_STATE_FIELD_NUMBER = 3;
    public Object delta_;
    public int deltaCase_ = 0;
    public String deviceId_ = "";

    static {
        DeviceActions$UpdatePeripheralState deviceActions$UpdatePeripheralState = new DeviceActions$UpdatePeripheralState();
        DEFAULT_INSTANCE = deviceActions$UpdatePeripheralState;
        KJb.A0A(deviceActions$UpdatePeripheralState, DeviceActions$UpdatePeripheralState.class);
    }

    public static KFy newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static DeviceActions$UpdatePeripheralState parseFrom(ByteBuffer byteBuffer) {
        return (DeviceActions$UpdatePeripheralState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003\u0001��\u0001\u0003\u0003������\u0001Ȉ\u0002<��\u0003<��", new Object[]{"delta_", "deltaCase_", "deviceId_", DevicePeripheralState.class, PhonePeripheralState.class});
            case 3:
                return new DeviceActions$UpdatePeripheralState();
            case 4:
                return new KFy();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (DeviceActions$UpdatePeripheralState.class) {
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
