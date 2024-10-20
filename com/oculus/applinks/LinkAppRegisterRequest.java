package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGE;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkAppRegisterRequest.class */
public final class LinkAppRegisterRequest extends KJb implements MJ3 {
    public static final int APPPUBLICKEY_FIELD_NUMBER = 2;
    public static final LinkAppRegisterRequest DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public Lj5 appPublicKey_ = Lj5.A00;
    public int nonce_;

    static {
        LinkAppRegisterRequest linkAppRegisterRequest = new LinkAppRegisterRequest();
        DEFAULT_INSTANCE = linkAppRegisterRequest;
        KJb.A0A(linkAppRegisterRequest, LinkAppRegisterRequest.class);
    }

    public static KGE newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkAppRegisterRequest parseFrom(ByteBuffer byteBuffer) {
        return (LinkAppRegisterRequest) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\u000b\u0002\n", new Object[]{"nonce_", "appPublicKey_"});
            case 3:
                return new LinkAppRegisterRequest();
            case 4:
                return new KGE();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkAppRegisterRequest.class) {
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
