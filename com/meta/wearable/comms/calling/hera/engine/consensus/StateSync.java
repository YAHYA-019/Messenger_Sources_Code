package com.meta.wearable.comms.calling.hera.engine.consensus;

import X.AnonymousClass001;
import X.KG7;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: StateSync.class */
public final class StateSync extends KJb implements MJ3 {
    public static final int DATA_FIELD_NUMBER = 3;
    public static final StateSync DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int RESET_FIELD_NUMBER = 2;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 1;
    public Lj5 data_ = Lj5.A00;
    public boolean reset_;
    public int sequenceNumber_;

    static {
        StateSync stateSync = new StateSync();
        DEFAULT_INSTANCE = stateSync;
        KJb.A0A(stateSync, StateSync.class);
    }

    public static KG7 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static StateSync parseFrom(ByteBuffer byteBuffer) {
        return (StateSync) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003������\u0001\u000b\u0002\u0007\u0003\n", new Object[]{"sequenceNumber_", "reset_", "data_"});
            case 3:
                return new StateSync();
            case 4:
                return new KG7();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (StateSync.class) {
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
