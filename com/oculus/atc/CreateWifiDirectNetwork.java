package com.oculus.atc;

import X.AnonymousClass001;
import X.KGO;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CreateWifiDirectNetwork.class */
public final class CreateWifiDirectNetwork extends KJb implements MJ3 {
    public static final int BAND_FIELD_NUMBER = 1;
    public static final CreateWifiDirectNetwork DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int UUID_FIELD_NUMBER = 2;
    public int band_;
    public Lj5 uuid_ = Lj5.A00;

    static {
        CreateWifiDirectNetwork createWifiDirectNetwork = new CreateWifiDirectNetwork();
        DEFAULT_INSTANCE = createWifiDirectNetwork;
        KJb.A0A(createWifiDirectNetwork, CreateWifiDirectNetwork.class);
    }

    public static KGO newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CreateWifiDirectNetwork parseFrom(ByteBuffer byteBuffer) {
        return (CreateWifiDirectNetwork) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\f\u0002\n", new Object[]{"band_", "uuid_"});
            case 3:
                return new CreateWifiDirectNetwork();
            case 4:
                return new KGO();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CreateWifiDirectNetwork.class) {
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
