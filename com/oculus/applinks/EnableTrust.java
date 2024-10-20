package com.oculus.applinks;

import X.AnonymousClass001;
import X.KG8;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: EnableTrust.class */
public final class EnableTrust extends KJb implements MJ3 {
    public static final EnableTrust DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int SIGNATURE_FIELD_NUMBER = 2;
    public Lj5 identifier_;
    public Lj5 signature_;

    static {
        EnableTrust enableTrust = new EnableTrust();
        DEFAULT_INSTANCE = enableTrust;
        KJb.A0A(enableTrust, EnableTrust.class);
    }

    public EnableTrust() {
        Lj5 lj5 = Lj5.A00;
        this.identifier_ = lj5;
        this.signature_ = lj5;
    }

    public static KG8 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static EnableTrust parseFrom(ByteBuffer byteBuffer) {
        return (EnableTrust) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\n\u0002\n", new Object[]{"identifier_", "signature_"});
            case 3:
                return new EnableTrust();
            case 4:
                return new KG8();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (EnableTrust.class) {
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
