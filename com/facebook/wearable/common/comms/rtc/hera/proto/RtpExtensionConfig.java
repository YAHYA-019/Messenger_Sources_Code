package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFJ;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: RtpExtensionConfig.class */
public final class RtpExtensionConfig extends KJb implements MJ3 {
    public static final RtpExtensionConfig DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int TYPE_FIELD_NUMBER = 2;
    public int id_;
    public int type_;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KJb, com.facebook.wearable.common.comms.rtc.hera.proto.RtpExtensionConfig] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, RtpExtensionConfig.class);
    }

    public static KFJ newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static RtpExtensionConfig parseFrom(ByteBuffer byteBuffer) {
        return (RtpExtensionConfig) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\u000b\u0002\f", new Object[]{"id_", "type_"});
            case 3:
                return new KJb();
            case 4:
                return new KFJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (RtpExtensionConfig.class) {
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