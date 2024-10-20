package com.facebook.wearable.common.comms.rtc.callengine2.audio.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KEL;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: AudioState.class */
public final class AudioState extends KJb implements MJ3 {
    public static final AudioState DEFAULT_INSTANCE;
    public static final int MIC_STATES_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public MRR micStates_ = KE9.A02;

    static {
        AudioState audioState = new AudioState();
        DEFAULT_INSTANCE = audioState;
        KJb.A0A(audioState, AudioState.class);
    }

    public static KEL newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static AudioState parseFrom(ByteBuffer byteBuffer) {
        return (AudioState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"micStates_", MicState.class});
            case 3:
                return new AudioState();
            case 4:
                return new KEL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (AudioState.class) {
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
