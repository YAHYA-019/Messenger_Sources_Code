package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFS;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: VideoStreamInfo.class */
public final class VideoStreamInfo extends KJb implements MJ3 {
    public static final VideoStreamInfo DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static volatile MGg PARSER;
    public static final int RTP_ID_FIELD_NUMBER = 1;
    public static final int RTP_INFO_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 3;
    public int height_;
    public RtpStreamIdentifier rtpId_;
    public RtpStreamInfo rtpInfo_;
    public int width_;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KJb, com.facebook.wearable.common.comms.rtc.hera.proto.VideoStreamInfo] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, VideoStreamInfo.class);
    }

    public static KFS newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static VideoStreamInfo parseFrom(ByteBuffer byteBuffer) {
        return (VideoStreamInfo) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004����\u0001\u0004\u0004������\u0001\t\u0002\t\u0003\u000b\u0004\u000b", new Object[]{"rtpId_", "rtpInfo_", "width_", "height_"});
            case 3:
                return new KJb();
            case 4:
                return new KFS();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (VideoStreamInfo.class) {
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
