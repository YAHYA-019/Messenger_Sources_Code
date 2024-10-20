package com.meta.wearable.comms.calling.hera.engine.base;

import X.AnonymousClass001;
import X.KG4;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Metadata.class */
public final class Metadata extends KJb implements MJ3 {
    public static final Metadata DEFAULT_INSTANCE;
    public static final int MONOTONIC_TIMESTAMP_MS_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public static final int REALTIME_TIMESTAMP_MS_FIELD_NUMBER = 1;
    public long monotonicTimestampMs_;
    public long realtimeTimestampMs_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.meta.wearable.comms.calling.hera.engine.base.Metadata, X.KJb] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, Metadata.class);
    }

    public static KG4 newBuilder() {
        return (KG4) DEFAULT_INSTANCE.A0D();
    }

    public static Metadata parseFrom(ByteBuffer byteBuffer) {
        return (Metadata) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\u0002\u0002\u0002", new Object[]{"realtimeTimestampMs_", "monotonicTimestampMs_"});
            case 3:
                return new KJb();
            case 4:
                return new KG4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Metadata.class) {
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
