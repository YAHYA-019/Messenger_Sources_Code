package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KFp;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Timestamp.class */
public final class Timestamp extends KJb implements MJ3 {
    public static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public static final int SECONDS_FIELD_NUMBER = 1;
    public int nanos_;
    public long seconds_;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KJb, com.google.repack.protobuf.Timestamp] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, Timestamp.class);
    }

    public static KFp newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) {
        return (Timestamp) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new KJb();
            case 4:
                return new KFp();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Timestamp.class) {
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
