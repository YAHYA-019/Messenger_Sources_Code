package com.oculus.atc;

import X.AnonymousClass001;
import X.KGW;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: JoinAccessPoint.class */
public final class JoinAccessPoint extends KJb implements MJ3 {
    public static final int BANDWIDTH_FIELD_NUMBER = 4;
    public static final JoinAccessPoint DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PASSPHRASE_FIELD_NUMBER = 2;
    public static final int SSID_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 3;
    public int bandwidth_;
    public String ssid_ = "";
    public String passphrase_ = "";
    public Lj5 uuid_ = Lj5.A00;

    static {
        JoinAccessPoint joinAccessPoint = new JoinAccessPoint();
        DEFAULT_INSTANCE = joinAccessPoint;
        KJb.A0A(joinAccessPoint, JoinAccessPoint.class);
    }

    public static KGW newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static JoinAccessPoint parseFrom(ByteBuffer byteBuffer) {
        return (JoinAccessPoint) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004����\u0001\u0004\u0004������\u0001Ȉ\u0002Ȉ\u0003\n\u0004\f", new Object[]{"ssid_", "passphrase_", "uuid_", "bandwidth_"});
            case 3:
                return new JoinAccessPoint();
            case 4:
                return new KGW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (JoinAccessPoint.class) {
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
