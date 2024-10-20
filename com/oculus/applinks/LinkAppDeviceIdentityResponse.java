package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGB;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkAppDeviceIdentityResponse.class */
public final class LinkAppDeviceIdentityResponse extends KJb implements MJ3 {
    public static final LinkAppDeviceIdentityResponse DEFAULT_INSTANCE;
    public static final int DEVICEPUBLICKEY_FIELD_NUMBER = 4;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int SERVICEUUID_FIELD_NUMBER = 3;
    public Lj5 devicePublicKey_;
    public int error_;
    public int nonce_;
    public Lj5 serviceUUID_;

    static {
        LinkAppDeviceIdentityResponse linkAppDeviceIdentityResponse = new LinkAppDeviceIdentityResponse();
        DEFAULT_INSTANCE = linkAppDeviceIdentityResponse;
        KJb.A0A(linkAppDeviceIdentityResponse, LinkAppDeviceIdentityResponse.class);
    }

    public LinkAppDeviceIdentityResponse() {
        Lj5 lj5 = Lj5.A00;
        this.serviceUUID_ = lj5;
        this.devicePublicKey_ = lj5;
    }

    public static KGB newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkAppDeviceIdentityResponse parseFrom(ByteBuffer byteBuffer) {
        return (LinkAppDeviceIdentityResponse) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004����\u0001\u0004\u0004������\u0001\u000b\u0002\f\u0003\n\u0004\n", new Object[]{"nonce_", "error_", "serviceUUID_", "devicePublicKey_"});
            case 3:
                return new LinkAppDeviceIdentityResponse();
            case 4:
                return new KGB();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkAppDeviceIdentityResponse.class) {
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
