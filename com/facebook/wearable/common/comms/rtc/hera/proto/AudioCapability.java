package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KEz;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: AudioCapability.class */
public final class AudioCapability extends KJb implements MJ3 {
    public static final AudioCapability DEFAULT_INSTANCE;
    public static final int MAX_CHANNELS_FIELD_NUMBER = 3;
    public static final int MAX_SAMPLE_RATE_FIELD_NUMBER = 2;
    public static final int MIME_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public int maxChannels_;
    public int maxSampleRate_;
    public String mime_ = "";

    static {
        AudioCapability audioCapability = new AudioCapability();
        DEFAULT_INSTANCE = audioCapability;
        KJb.A0A(audioCapability, AudioCapability.class);
    }

    public static KEz newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static AudioCapability parseFrom(ByteBuffer byteBuffer) {
        return (AudioCapability) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003������\u0001Ȉ\u0002\u000b\u0003\u000b", new Object[]{"mime_", "maxSampleRate_", "maxChannels_"});
            case 3:
                return new AudioCapability();
            case 4:
                return new KEz();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (AudioCapability.class) {
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
