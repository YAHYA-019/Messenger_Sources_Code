package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KF4;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: AudioStreamStatusMessage.class */
public final class AudioStreamStatusMessage extends KJb implements MJ3 {
    public static final AudioStreamStatusMessage DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 4;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int INFO_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public static final int REQUEST_NONCE_FIELD_NUMBER = 1;
    public int payloadCase_ = 0;
    public Object payload_;
    public int requestNonce_;

    static {
        AudioStreamStatusMessage audioStreamStatusMessage = new AudioStreamStatusMessage();
        DEFAULT_INSTANCE = audioStreamStatusMessage;
        KJb.A0A(audioStreamStatusMessage, AudioStreamStatusMessage.class);
    }

    public static KF4 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static AudioStreamStatusMessage parseFrom(ByteBuffer byteBuffer) {
        return (AudioStreamStatusMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004\u0001��\u0001\u0004\u0004������\u0001\u000b\u0002<��\u0003<��\u0004<��", new Object[]{"payload_", "payloadCase_", "requestNonce_", AudioStreamInfo.class, AudioStreamError.class, AudioStreamEnd.class});
            case 3:
                return new AudioStreamStatusMessage();
            case 4:
                return new KF4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (AudioStreamStatusMessage.class) {
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
