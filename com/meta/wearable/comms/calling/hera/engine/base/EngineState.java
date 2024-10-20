package com.meta.wearable.comms.calling.hera.engine.base;

import X.AnonymousClass001;
import X.KE9;
import X.KG3;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: EngineState.class */
public final class EngineState extends KJb implements MJ3 {
    public static final EngineState DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int MODULE_STATES_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public Metadata metadata_;
    public MRR moduleStates_ = KE9.A02;

    static {
        EngineState engineState = new EngineState();
        DEFAULT_INSTANCE = engineState;
        KJb.A0A(engineState, EngineState.class);
    }

    public static KG3 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static EngineState parseFrom(ByteBuffer byteBuffer) {
        return (EngineState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002��\u0001��\u0001\u001b\u0002\t", new Object[]{"moduleStates_", Any.class, "metadata_"});
            case 3:
                return new EngineState();
            case 4:
                return new KG3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (EngineState.class) {
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
