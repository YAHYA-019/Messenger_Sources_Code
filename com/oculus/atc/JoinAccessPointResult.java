package com.oculus.atc;

import X.AnonymousClass001;
import X.KE9;
import X.KGX;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: JoinAccessPointResult.class */
public final class JoinAccessPointResult extends KJb implements MJ3 {
    public static final int ADDRESSES_FIELD_NUMBER = 2;
    public static final JoinAccessPointResult DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PORT_NUMBER_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    public MRR addresses_ = KE9.A02;
    public int portNumber_;
    public int status_;

    static {
        JoinAccessPointResult joinAccessPointResult = new JoinAccessPointResult();
        DEFAULT_INSTANCE = joinAccessPointResult;
        KJb.A0A(joinAccessPointResult, JoinAccessPointResult.class);
    }

    public static KGX newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static JoinAccessPointResult parseFrom(ByteBuffer byteBuffer) {
        return (JoinAccessPointResult) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003��\u0001��\u0001\f\u0002\u001b\u0003\u000b", new Object[]{"status_", "addresses_", NetworkAddress.class, "portNumber_"});
            case 3:
                return new JoinAccessPointResult();
            case 4:
                return new KGX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (JoinAccessPointResult.class) {
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
