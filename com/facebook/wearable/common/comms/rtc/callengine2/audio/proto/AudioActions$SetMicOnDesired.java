package com.facebook.wearable.common.comms.rtc.callengine2.audio.proto;

import X.AnonymousClass001;
import X.KEJ;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: AudioActions$SetMicOnDesired.class */
public final class AudioActions$SetMicOnDesired extends KJb implements MJ3 {
    public static final int CALL_ID_FIELD_NUMBER = 1;
    public static final AudioActions$SetMicOnDesired DEFAULT_INSTANCE;
    public static final int MIC_ON_DESIRED_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public String callId_ = "";
    public boolean micOnDesired_;

    static {
        AudioActions$SetMicOnDesired audioActions$SetMicOnDesired = new AudioActions$SetMicOnDesired();
        DEFAULT_INSTANCE = audioActions$SetMicOnDesired;
        KJb.A0A(audioActions$SetMicOnDesired, AudioActions$SetMicOnDesired.class);
    }

    public static KEJ newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static AudioActions$SetMicOnDesired parseFrom(ByteBuffer byteBuffer) {
        return (AudioActions$SetMicOnDesired) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002\u0007", new Object[]{"callId_", "micOnDesired_"});
            case 3:
                return new AudioActions$SetMicOnDesired();
            case 4:
                return new KEJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (AudioActions$SetMicOnDesired.class) {
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
