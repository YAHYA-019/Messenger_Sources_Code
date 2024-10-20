package com.meta.hera.engine.device;

import X.AnonymousClass001;
import X.KFu;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Device.class */
public final class Device extends KJb implements MJ3 {
    public static final Device DEFAULT_INSTANCE;
    public static final int DEVICE_PERIPHERAL_STATE_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LAST_HEARTBEAT_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile MGg PARSER;
    public static final int PHONE_PERIPHERAL_STATE_FIELD_NUMBER = 7;
    public static final int ROLE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 4;
    public int bitField0_;
    public long lastHeartbeatTimestampMs_;
    public Object peripheralState_;
    public int role_;
    public int status_;
    public int peripheralStateCase_ = 0;
    public String id_ = "";
    public String name_ = "";

    static {
        Device device = new Device();
        DEFAULT_INSTANCE = device;
        KJb.A0A(device, Device.class);
    }

    public static KFu newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Device parseFrom(ByteBuffer byteBuffer) {
        return (Device) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0007\u0001\u0001\u0001\u0007\u0007������\u0001Ȉ\u0002\f\u0003ለ��\u0004\f\u0005\u0003\u0006<��\u0007<��", new Object[]{"peripheralState_", "peripheralStateCase_", "bitField0_", "id_", "role_", "name_", "status_", "lastHeartbeatTimestampMs_", DevicePeripheralState.class, PhonePeripheralState.class});
            case 3:
                return new Device();
            case 4:
                return new KFu();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Device.class) {
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
