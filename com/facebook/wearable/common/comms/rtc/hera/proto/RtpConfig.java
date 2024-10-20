package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KE7;
import X.KFI;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.LgZ;
import X.Lgf;
import X.MDi;
import X.MGg;
import X.MJ3;
import X.MQp;
import java.nio.ByteBuffer;

/* loaded from: RtpConfig.class */
public final class RtpConfig extends KJb implements MJ3 {
    public static final RtpConfig DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final MDi extensions_converter_ = new LgZ();
    public int extensionsMemoizedSerializedSize;
    public MQp extensions_ = KE7.A02;

    static {
        RtpConfig rtpConfig = new RtpConfig();
        DEFAULT_INSTANCE = rtpConfig;
        KJb.A0A(rtpConfig, RtpConfig.class);
    }

    public static KFI newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static RtpConfig parseFrom(ByteBuffer byteBuffer) {
        return (RtpConfig) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001��\u0001��\u0001,", new Object[]{"extensions_"});
            case 3:
                return new RtpConfig();
            case 4:
                return new KFI();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (RtpConfig.class) {
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
