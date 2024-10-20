package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KF9;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: EndVideoRequest.class */
public final class EndVideoRequest extends KJb implements MJ3 {
    public static final EndVideoRequest DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int REQUEST_NONCE_FIELD_NUMBER = 1;
    public int bitField0_;
    public int requestNonce_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.wearable.common.comms.rtc.hera.proto.EndVideoRequest, X.KJb] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, EndVideoRequest.class);
    }

    public static KF9 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static EndVideoRequest parseFrom(ByteBuffer byteBuffer) {
        return (EndVideoRequest) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001��\u0001\u0001\u0001\u0001������\u0001ဋ��", new Object[]{"bitField0_", "requestNonce_"});
            case 3:
                return new KJb();
            case 4:
                return new KF9();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (EndVideoRequest.class) {
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
