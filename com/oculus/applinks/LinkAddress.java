package com.oculus.applinks;

import X.AnonymousClass001;
import X.KG9;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkAddress.class */
public final class LinkAddress extends KJb implements MJ3 {
    public static final int ADDRESS_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    public static final LinkAddress DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PREFIX_LENGTH_FIELD_NUMBER = 2;
    public int addressType_;
    public Lj5 data_ = Lj5.A00;
    public int prefixLength_;

    static {
        LinkAddress linkAddress = new LinkAddress();
        DEFAULT_INSTANCE = linkAddress;
        KJb.A0A(linkAddress, LinkAddress.class);
    }

    public static KG9 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkAddress parseFrom(ByteBuffer byteBuffer) {
        return (LinkAddress) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003������\u0001\f\u0002\u000b\u0003\n", new Object[]{"addressType_", "prefixLength_", "data_"});
            case 3:
                return new LinkAddress();
            case 4:
                return new KG9();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkAddress.class) {
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
