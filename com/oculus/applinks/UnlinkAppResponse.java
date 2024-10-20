package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGM;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: UnlinkAppResponse.class */
public final class UnlinkAppResponse extends KJb implements MJ3 {
    public static final UnlinkAppResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public int error_;
    public int nonce_;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KJb, com.oculus.applinks.UnlinkAppResponse] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, UnlinkAppResponse.class);
    }

    public static KGM newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static UnlinkAppResponse parseFrom(ByteBuffer byteBuffer) {
        return (UnlinkAppResponse) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\u000b\u0002\f", new Object[]{"nonce_", "error_"});
            case 3:
                return new KJb();
            case 4:
                return new KGM();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (UnlinkAppResponse.class) {
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
