package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KF3;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: AudioStreamInfo.class */
public final class AudioStreamInfo extends KJb implements MJ3 {
    public static final int BUFFER_DURATION_MS_FIELD_NUMBER = 5;
    public static final int CHANNELS_FIELD_NUMBER = 4;
    public static final AudioStreamInfo DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int RTP_ID_FIELD_NUMBER = 1;
    public static final int RTP_INFO_FIELD_NUMBER = 2;
    public static final int SAMPLE_RATE_FIELD_NUMBER = 3;
    public int bufferDurationMs_;
    public int channels_;
    public RtpStreamIdentifier rtpId_;
    public RtpStreamInfo rtpInfo_;
    public int sampleRate_;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KJb, com.facebook.wearable.common.comms.rtc.hera.proto.AudioStreamInfo] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, AudioStreamInfo.class);
    }

    public static KF3 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static AudioStreamInfo parseFrom(ByteBuffer byteBuffer) {
        return (AudioStreamInfo) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0005����\u0001\u0005\u0005������\u0001\t\u0002\t\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"rtpId_", "rtpInfo_", "sampleRate_", "channels_", "bufferDurationMs_"});
            case 3:
                return new KJb();
            case 4:
                return new KF3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (AudioStreamInfo.class) {
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
