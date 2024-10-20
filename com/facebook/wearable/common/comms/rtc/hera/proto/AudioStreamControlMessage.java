package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KF0;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: AudioStreamControlMessage.class */
public final class AudioStreamControlMessage extends KJb implements MJ3 {
    public static final AudioStreamControlMessage DEFAULT_INSTANCE;
    public static final int END_REQUEST_FIELD_NUMBER = 3;
    public static volatile MGg PARSER;
    public static final int START_REQUEST_FIELD_NUMBER = 2;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public int payloadCase_ = 0;
    public Object payload_;
    public int streamId_;

    static {
        AudioStreamControlMessage audioStreamControlMessage = new AudioStreamControlMessage();
        DEFAULT_INSTANCE = audioStreamControlMessage;
        KJb.A0A(audioStreamControlMessage, AudioStreamControlMessage.class);
    }

    public static KF0 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static AudioStreamControlMessage parseFrom(ByteBuffer byteBuffer) {
        return (AudioStreamControlMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003\u0001��\u0001\u0003\u0003������\u0001\u000b\u0002<��\u0003<��", new Object[]{"payload_", "payloadCase_", "streamId_", StartAudioRequest.class, EndAudioRequest.class});
            case 3:
                return new AudioStreamControlMessage();
            case 4:
                return new KF0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (AudioStreamControlMessage.class) {
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
