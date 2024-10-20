package com.oculus.atc;

import X.AnonymousClass001;
import X.KGr;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: SoftApCredentials.class */
public final class SoftApCredentials extends KJb implements MJ3 {
    public static final SoftApCredentials DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public static final int SSID_FIELD_NUMBER = 1;
    public String ssid_ = "";
    public String password_ = "";

    static {
        SoftApCredentials softApCredentials = new SoftApCredentials();
        DEFAULT_INSTANCE = softApCredentials;
        KJb.A0A(softApCredentials, SoftApCredentials.class);
    }

    public static KGr newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static SoftApCredentials parseFrom(ByteBuffer byteBuffer) {
        return (SoftApCredentials) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002Ȉ", new Object[]{"ssid_", "password_"});
            case 3:
                return new SoftApCredentials();
            case 4:
                return new KGr();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (SoftApCredentials.class) {
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
