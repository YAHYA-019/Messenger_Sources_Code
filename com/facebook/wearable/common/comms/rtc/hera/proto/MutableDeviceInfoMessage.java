package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFH;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: MutableDeviceInfoMessage.class */
public final class MutableDeviceInfoMessage extends KJb implements MJ3 {
    public static final int ARCI_SESSION_ID_FIELD_NUMBER = 6;
    public static final int BATTERY_PERCENTAGE_FIELD_NUMBER = 1;
    public static final int CALL_DEVICE_STATE_FIELD_NUMBER = 2;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 3;
    public static final MutableDeviceInfoMessage DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int ROLE_FIELD_NUMBER = 7;
    public static final int THERMAL_STATE_FIELD_NUMBER = 4;
    public static final int TIME_SYNC_FIELD_NUMBER = 5;
    public int batteryPercentage_;
    public int role_;
    public String callDeviceState_ = "";
    public String connectionType_ = "";
    public String thermalState_ = "";
    public String timeSync_ = "";
    public String arciSessionId_ = "";

    static {
        MutableDeviceInfoMessage mutableDeviceInfoMessage = new MutableDeviceInfoMessage();
        DEFAULT_INSTANCE = mutableDeviceInfoMessage;
        KJb.A0A(mutableDeviceInfoMessage, MutableDeviceInfoMessage.class);
    }

    public static KFH newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static MutableDeviceInfoMessage parseFrom(ByteBuffer byteBuffer) {
        return (MutableDeviceInfoMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0007����\u0001\u0007\u0007������\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f", new Object[]{"batteryPercentage_", "callDeviceState_", "connectionType_", "thermalState_", "timeSync_", "arciSessionId_", "role_"});
            case 3:
                return new MutableDeviceInfoMessage();
            case 4:
                return new KFH();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (MutableDeviceInfoMessage.class) {
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
