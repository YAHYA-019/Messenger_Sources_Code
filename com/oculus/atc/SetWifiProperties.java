package com.oculus.atc;

import X.AnonymousClass001;
import X.KGm;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: SetWifiProperties.class */
public final class SetWifiProperties extends KJb implements MJ3 {
    public static final int COUNTRYCODE_FIELD_NUMBER = 1;
    public static final SetWifiProperties DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public String countryCode_ = "";

    static {
        SetWifiProperties setWifiProperties = new SetWifiProperties();
        DEFAULT_INSTANCE = setWifiProperties;
        KJb.A0A(setWifiProperties, SetWifiProperties.class);
    }

    public static KGm newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static SetWifiProperties parseFrom(ByteBuffer byteBuffer) {
        return (SetWifiProperties) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001Ȉ", new Object[]{"countryCode_"});
            case 3:
                return new SetWifiProperties();
            case 4:
                return new KGm();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (SetWifiProperties.class) {
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
