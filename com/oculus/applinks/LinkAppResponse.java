package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGH;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkAppResponse.class */
public final class LinkAppResponse extends KJb implements MJ3 {
    public static final LinkAppResponse DEFAULT_INSTANCE;
    public static final int DEVICEPUBLICKEY_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public Lj5 devicePublicKey_ = Lj5.A00;
    public int error_;
    public int nonce_;

    static {
        LinkAppResponse linkAppResponse = new LinkAppResponse();
        DEFAULT_INSTANCE = linkAppResponse;
        KJb.A0A(linkAppResponse, LinkAppResponse.class);
    }

    public static KGH newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkAppResponse parseFrom(ByteBuffer byteBuffer) {
        return (LinkAppResponse) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003������\u0001\u000b\u0002\f\u0003\n", new Object[]{"nonce_", "error_", "devicePublicKey_"});
            case 3:
                return new LinkAppResponse();
            case 4:
                return new KGH();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkAppResponse.class) {
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
