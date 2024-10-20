package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGF;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkAppRegisterResponse.class */
public final class LinkAppRegisterResponse extends KJb implements MJ3 {
    public static final LinkAppRegisterResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int SERVICEUUID_FIELD_NUMBER = 3;
    public int error_;
    public int nonce_;
    public Lj5 serviceUUID_ = Lj5.A00;

    static {
        LinkAppRegisterResponse linkAppRegisterResponse = new LinkAppRegisterResponse();
        DEFAULT_INSTANCE = linkAppRegisterResponse;
        KJb.A0A(linkAppRegisterResponse, LinkAppRegisterResponse.class);
    }

    public static KGF newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkAppRegisterResponse parseFrom(ByteBuffer byteBuffer) {
        return (LinkAppRegisterResponse) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003������\u0001\u000b\u0002\f\u0003\n", new Object[]{"nonce_", "error_", "serviceUUID_"});
            case 3:
                return new LinkAppRegisterResponse();
            case 4:
                return new KGF();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkAppRegisterResponse.class) {
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
