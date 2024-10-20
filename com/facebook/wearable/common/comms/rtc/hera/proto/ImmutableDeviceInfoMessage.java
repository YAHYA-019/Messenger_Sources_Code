package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFA;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: ImmutableDeviceInfoMessage.class */
public final class ImmutableDeviceInfoMessage extends KJb implements MJ3 {
    public static final int APP_BUILD_NUMBER_FIELD_NUMBER = 1;
    public static final int APP_PACKAGE_FIELD_NUMBER = 3;
    public static final int APP_VERSION_FIELD_NUMBER = 2;
    public static final int CALL_ENGINE_VERSION_FIELD_NUMBER = 4;
    public static final ImmutableDeviceInfoMessage DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 5;
    public static final int DEVICE_SERIAL_FIELD_NUMBER = 6;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 7;
    public static final int IS_E2E_TEST_FIELD_NUMBER = 8;
    public static final int OS_BUILD_FLAVOR_FIELD_NUMBER = 10;
    public static final int OS_BUILD_NUM_FIELD_NUMBER = 9;
    public static volatile MGg PARSER;
    public static final int SOC_VERSION_FIELD_NUMBER = 12;
    public int callEngineVersion_;
    public boolean isE2ETest_;
    public String appBuildNumber_ = "";
    public String appVersion_ = "";
    public String appPackage_ = "";
    public String deviceId_ = "";
    public String deviceSerial_ = "";
    public String deviceType_ = "";
    public String osBuildNum_ = "";
    public String osBuildFlavor_ = "";
    public String socVersion_ = "";

    static {
        ImmutableDeviceInfoMessage immutableDeviceInfoMessage = new ImmutableDeviceInfoMessage();
        DEFAULT_INSTANCE = immutableDeviceInfoMessage;
        KJb.A0A(immutableDeviceInfoMessage, ImmutableDeviceInfoMessage.class);
    }

    public static KFA newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static ImmutableDeviceInfoMessage parseFrom(ByteBuffer byteBuffer) {
        return (ImmutableDeviceInfoMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u000b����\u0001\f\u000b������\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\tȈ\nȈ\fȈ", new Object[]{"appBuildNumber_", "appVersion_", "appPackage_", "callEngineVersion_", "deviceId_", "deviceSerial_", "deviceType_", "isE2ETest_", "osBuildNum_", "osBuildFlavor_", "socVersion_"});
            case 3:
                return new ImmutableDeviceInfoMessage();
            case 4:
                return new KFA();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (ImmutableDeviceInfoMessage.class) {
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
