package com.facebook.wearable.common.comms.rtc.callengine2.audio.proto;

import X.AnonymousClass001;
import X.KEK;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: AudioActions$UpdateDefaultAudioStreamState.class */
public final class AudioActions$UpdateDefaultAudioStreamState extends KJb implements MJ3 {
    public static final int CALL_ID_FIELD_NUMBER = 1;
    public static final AudioActions$UpdateDefaultAudioStreamState DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int STATE_FIELD_NUMBER = 2;
    public String callId_ = "";
    public int state_;

    static {
        AudioActions$UpdateDefaultAudioStreamState audioActions$UpdateDefaultAudioStreamState = new AudioActions$UpdateDefaultAudioStreamState();
        DEFAULT_INSTANCE = audioActions$UpdateDefaultAudioStreamState;
        KJb.A0A(audioActions$UpdateDefaultAudioStreamState, AudioActions$UpdateDefaultAudioStreamState.class);
    }

    public static KEK newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static AudioActions$UpdateDefaultAudioStreamState parseFrom(ByteBuffer byteBuffer) {
        return (AudioActions$UpdateDefaultAudioStreamState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002\f", new Object[]{"callId_", "state_"});
            case 3:
                return new AudioActions$UpdateDefaultAudioStreamState();
            case 4:
                return new KEK();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (AudioActions$UpdateDefaultAudioStreamState.class) {
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
