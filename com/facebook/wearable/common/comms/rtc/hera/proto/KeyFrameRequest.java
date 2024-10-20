package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFB;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: KeyFrameRequest.class */
public final class KeyFrameRequest extends KJb implements MJ3 {
    public static final KeyFrameRequest DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int REQUEST_NONCE_FIELD_NUMBER = 1;
    public int requestNonce_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.wearable.common.comms.rtc.hera.proto.KeyFrameRequest, X.KJb] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, KeyFrameRequest.class);
    }

    public static KFB newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static KeyFrameRequest parseFrom(ByteBuffer byteBuffer) {
        return (KeyFrameRequest) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001\u000b", new Object[]{"requestNonce_"});
            case 3:
                return new KJb();
            case 4:
                return new KFB();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (KeyFrameRequest.class) {
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
