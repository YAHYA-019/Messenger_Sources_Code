package com.meta.hera.engine.device;

import X.AnonymousClass001;
import X.KFx;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: DeviceActions$UnregisterDevice.class */
public final class DeviceActions$UnregisterDevice extends KJb implements MJ3 {
    public static final DeviceActions$UnregisterDevice DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public String deviceId_ = "";

    static {
        DeviceActions$UnregisterDevice deviceActions$UnregisterDevice = new DeviceActions$UnregisterDevice();
        DEFAULT_INSTANCE = deviceActions$UnregisterDevice;
        KJb.A0A(deviceActions$UnregisterDevice, DeviceActions$UnregisterDevice.class);
    }

    public static KFx newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static DeviceActions$UnregisterDevice parseFrom(ByteBuffer byteBuffer) {
        return (DeviceActions$UnregisterDevice) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001Ȉ", new Object[]{"deviceId_"});
            case 3:
                return new DeviceActions$UnregisterDevice();
            case 4:
                return new KFx();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (DeviceActions$UnregisterDevice.class) {
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
