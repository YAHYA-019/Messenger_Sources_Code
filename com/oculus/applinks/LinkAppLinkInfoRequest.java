package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGC;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkAppLinkInfoRequest.class */
public final class LinkAppLinkInfoRequest extends KJb implements MJ3 {
    public static final LinkAppLinkInfoRequest DEFAULT_INSTANCE;
    public static final int LINKTYPE_FIELD_NUMBER = 3;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int REQUESTTYPE_FIELD_NUMBER = 4;
    public static final int SERVICEUUID_FIELD_NUMBER = 2;
    public int linkType_;
    public int nonce_;
    public int requestType_;
    public Lj5 serviceUUID_ = Lj5.A00;

    static {
        LinkAppLinkInfoRequest linkAppLinkInfoRequest = new LinkAppLinkInfoRequest();
        DEFAULT_INSTANCE = linkAppLinkInfoRequest;
        KJb.A0A(linkAppLinkInfoRequest, LinkAppLinkInfoRequest.class);
    }

    public static KGC newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkAppLinkInfoRequest parseFrom(ByteBuffer byteBuffer) {
        return (LinkAppLinkInfoRequest) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004����\u0001\u0004\u0004������\u0001\u000b\u0002\n\u0003\f\u0004\f", new Object[]{"nonce_", "serviceUUID_", "linkType_", "requestType_"});
            case 3:
                return new LinkAppLinkInfoRequest();
            case 4:
                return new KGC();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkAppLinkInfoRequest.class) {
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
