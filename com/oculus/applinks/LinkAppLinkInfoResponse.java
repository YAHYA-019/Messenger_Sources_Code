package com.oculus.applinks;

import X.AnonymousClass001;
import X.KE9;
import X.KGD;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: LinkAppLinkInfoResponse.class */
public final class LinkAppLinkInfoResponse extends KJb implements MJ3 {
    public static final int ADDRESSES_FIELD_NUMBER = 3;
    public static final int BUILDFLAVOR_FIELD_NUMBER = 8;
    public static final LinkAppLinkInfoResponse DEFAULT_INSTANCE;
    public static final int DEVICEIMAGEASSETURI_FIELD_NUMBER = 6;
    public static final int DEVICEMODELNAME_FIELD_NUMBER = 7;
    public static final int DEVICENAME_FIELD_NUMBER = 9;
    public static final int DEVICESERIAL_FIELD_NUMBER = 5;
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int FIRMWAREVERSION_FIELD_NUMBER = 4;
    public static final int HARDWARETYPE_FIELD_NUMBER = 10;
    public static final int MACADDRESS_FIELD_NUMBER = 11;
    public static final int NONCE_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public MRR addresses_ = KE9.A02;
    public Lj5 buildFlavor_;
    public Lj5 deviceImageAssetURI_;
    public Lj5 deviceModelName_;
    public Lj5 deviceName_;
    public Lj5 deviceSerial_;
    public int error_;
    public Lj5 firmwareVersion_;
    public Lj5 hardwareType_;
    public Lj5 macAddress_;
    public int nonce_;

    static {
        LinkAppLinkInfoResponse linkAppLinkInfoResponse = new LinkAppLinkInfoResponse();
        DEFAULT_INSTANCE = linkAppLinkInfoResponse;
        KJb.A0A(linkAppLinkInfoResponse, LinkAppLinkInfoResponse.class);
    }

    public LinkAppLinkInfoResponse() {
        Lj5 lj5 = Lj5.A00;
        this.firmwareVersion_ = lj5;
        this.deviceSerial_ = lj5;
        this.deviceImageAssetURI_ = lj5;
        this.deviceModelName_ = lj5;
        this.buildFlavor_ = lj5;
        this.deviceName_ = lj5;
        this.hardwareType_ = lj5;
        this.macAddress_ = lj5;
    }

    public static KGD newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkAppLinkInfoResponse parseFrom(ByteBuffer byteBuffer) {
        return (LinkAppLinkInfoResponse) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u000b����\u0001\u000b\u000b��\u0001��\u0001\u000b\u0002\f\u0003\u001b\u0004\n\u0005\n\u0006\n\u0007\n\b\n\t\n\n\n\u000b\n", new Object[]{"nonce_", "error_", "addresses_", LinkAddress.class, "firmwareVersion_", "deviceSerial_", "deviceImageAssetURI_", "deviceModelName_", "buildFlavor_", "deviceName_", "hardwareType_", "macAddress_"});
            case 3:
                return new LinkAppLinkInfoResponse();
            case 4:
                return new KGD();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkAppLinkInfoResponse.class) {
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
