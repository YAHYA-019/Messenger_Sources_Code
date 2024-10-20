package com.oculus.atc;

import X.AnonymousClass001;
import X.KGN;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CreateSoftApNetwork.class */
public final class CreateSoftApNetwork extends KJb implements MJ3 {
    public static final int BANDWIDTH_FIELD_NUMBER = 9;
    public static final int BAND_FIELD_NUMBER = 3;
    public static final int CHANNEL_FIELD_NUMBER = 4;
    public static final int COUNTRYCODE_FIELD_NUMBER = 6;
    public static final int CREDENTIALS_FIELD_NUMBER = 8;
    public static final CreateSoftApNetwork DEFAULT_INSTANCE;
    public static final int HIDDEN_FIELD_NUMBER = 5;
    public static volatile MGg PARSER;
    public static final int UUID_FIELD_NUMBER = 7;
    public int band_;
    public int bandwidth_;
    public int channel_;
    public SoftApCredentials credentials_;
    public boolean hidden_;
    public String countryCode_ = "";
    public Lj5 uuid_ = Lj5.A00;

    static {
        CreateSoftApNetwork createSoftApNetwork = new CreateSoftApNetwork();
        DEFAULT_INSTANCE = createSoftApNetwork;
        KJb.A0A(createSoftApNetwork, CreateSoftApNetwork.class);
    }

    public static KGN newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CreateSoftApNetwork parseFrom(ByteBuffer byteBuffer) {
        return (CreateSoftApNetwork) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0007����\u0003\t\u0007������\u0003\f\u0004\u000b\u0005\u0007\u0006Ȉ\u0007\n\b\t\t\f", new Object[]{"band_", "channel_", "hidden_", "countryCode_", "uuid_", "credentials_", "bandwidth_"});
            case 3:
                return new CreateSoftApNetwork();
            case 4:
                return new KGN();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CreateSoftApNetwork.class) {
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
