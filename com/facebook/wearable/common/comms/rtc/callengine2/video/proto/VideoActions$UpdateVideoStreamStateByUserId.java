package com.facebook.wearable.common.comms.rtc.callengine2.video.proto;

import X.AnonymousClass001;
import X.KEv;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: VideoActions$UpdateVideoStreamStateByUserId.class */
public final class VideoActions$UpdateVideoStreamStateByUserId extends KJb implements MJ3 {
    public static final int ARBITRARY_CALL_ID_FIELD_NUMBER = 1;
    public static final VideoActions$UpdateVideoStreamStateByUserId DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int USER_ID_FIELD_NUMBER = 2;
    public static final int VIDEO_STREAM_STATE_FIELD_NUMBER = 3;
    public String arbitraryCallId_ = "";
    public String userId_ = "";
    public int videoStreamState_;

    static {
        VideoActions$UpdateVideoStreamStateByUserId videoActions$UpdateVideoStreamStateByUserId = new VideoActions$UpdateVideoStreamStateByUserId();
        DEFAULT_INSTANCE = videoActions$UpdateVideoStreamStateByUserId;
        KJb.A0A(videoActions$UpdateVideoStreamStateByUserId, VideoActions$UpdateVideoStreamStateByUserId.class);
    }

    public static KEv newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static VideoActions$UpdateVideoStreamStateByUserId parseFrom(ByteBuffer byteBuffer) {
        return (VideoActions$UpdateVideoStreamStateByUserId) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003������\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"arbitraryCallId_", "userId_", "videoStreamState_"});
            case 3:
                return new VideoActions$UpdateVideoStreamStateByUserId();
            case 4:
                return new KEv();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (VideoActions$UpdateVideoStreamStateByUserId.class) {
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
