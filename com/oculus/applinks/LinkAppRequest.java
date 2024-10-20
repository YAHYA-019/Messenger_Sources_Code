package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGG;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkAppRequest.class */
public final class LinkAppRequest extends KJb implements MJ3 {
    public static final int APPPUBLICKEY_FIELD_NUMBER = 3;
    public static final int BUNDLEIDENTIFIER_FIELD_NUMBER = 4;
    public static final LinkAppRequest DEFAULT_INSTANCE;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int SERVICEUUID_FIELD_NUMBER = 2;
    public Lj5 appPublicKey_;
    public String bundleIdentifier_;
    public int nonce_;
    public Lj5 serviceUUID_;

    static {
        LinkAppRequest linkAppRequest = new LinkAppRequest();
        DEFAULT_INSTANCE = linkAppRequest;
        KJb.A0A(linkAppRequest, LinkAppRequest.class);
    }

    public LinkAppRequest() {
        Lj5 lj5 = Lj5.A00;
        this.serviceUUID_ = lj5;
        this.appPublicKey_ = lj5;
        this.bundleIdentifier_ = "";
    }

    public static KGG newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkAppRequest parseFrom(ByteBuffer byteBuffer) {
        return (LinkAppRequest) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004����\u0001\u0004\u0004������\u0001\u000b\u0002\n\u0003\n\u0004Ȉ", new Object[]{"nonce_", "serviceUUID_", "appPublicKey_", "bundleIdentifier_"});
            case 3:
                return new LinkAppRequest();
            case 4:
                return new KGG();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkAppRequest.class) {
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
