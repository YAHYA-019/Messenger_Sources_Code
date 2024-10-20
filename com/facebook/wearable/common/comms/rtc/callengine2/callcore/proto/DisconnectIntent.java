package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEd;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: DisconnectIntent.class */
public final class DisconnectIntent extends KJb implements MJ3 {
    public static final DisconnectIntent DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int SUB_REASON_FIELD_NUMBER = 2;
    public int bitField0_;
    public int reason_;
    public String subReason_ = "";

    static {
        DisconnectIntent disconnectIntent = new DisconnectIntent();
        DEFAULT_INSTANCE = disconnectIntent;
        KJb.A0A(disconnectIntent, DisconnectIntent.class);
    }

    public static KEd newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static DisconnectIntent parseFrom(ByteBuffer byteBuffer) {
        return (DisconnectIntent) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002��\u0001\u0001\u0002\u0002������\u0001\f\u0002ለ��", new Object[]{"bitField0_", "reason_", "subReason_"});
            case 3:
                return new DisconnectIntent();
            case 4:
                return new KEd();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (DisconnectIntent.class) {
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
