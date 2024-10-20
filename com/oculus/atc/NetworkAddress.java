package com.oculus.atc;

import X.AnonymousClass001;
import X.KGh;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: NetworkAddress.class */
public final class NetworkAddress extends KJb implements MJ3 {
    public static final int ADDRESS_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    public static final NetworkAddress DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PREFIX_LENGTH_FIELD_NUMBER = 2;
    public int addressType_;
    public Lj5 data_ = Lj5.A00;
    public int prefixLength_;

    static {
        NetworkAddress networkAddress = new NetworkAddress();
        DEFAULT_INSTANCE = networkAddress;
        KJb.A0A(networkAddress, NetworkAddress.class);
    }

    public static KGh newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static NetworkAddress parseFrom(ByteBuffer byteBuffer) {
        return (NetworkAddress) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return new NetworkAddress();
            case 4:
                return new KGh();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (NetworkAddress.class) {
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
