package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KF7;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CoordinationMessage.class */
public final class CoordinationMessage extends KJb implements MJ3 {
    public static final CoordinationMessage DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    public Lj5 payload_ = Lj5.A00;
    public int type_;

    static {
        CoordinationMessage coordinationMessage = new CoordinationMessage();
        DEFAULT_INSTANCE = coordinationMessage;
        KJb.A0A(coordinationMessage, CoordinationMessage.class);
    }

    public static KF7 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CoordinationMessage parseFrom(ByteBuffer byteBuffer) {
        return (CoordinationMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\u000b\u0002\n", new Object[]{"type_", "payload_"});
            case 3:
                return new CoordinationMessage();
            case 4:
                return new KF7();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CoordinationMessage.class) {
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
