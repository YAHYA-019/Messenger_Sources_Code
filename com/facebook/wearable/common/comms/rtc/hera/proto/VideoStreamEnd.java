package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFQ;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: VideoStreamEnd.class */
public final class VideoStreamEnd extends KJb implements MJ3 {
    public static final VideoStreamEnd DEFAULT_INSTANCE;
    public static final int EOS_FRAME_RTP_SEQ_ID_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public static final int RTP_ID_FIELD_NUMBER = 1;
    public int eosFrameRtpSeqId_;
    public RtpStreamIdentifier rtpId_;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KJb, com.facebook.wearable.common.comms.rtc.hera.proto.VideoStreamEnd] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, VideoStreamEnd.class);
    }

    public static KFQ newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static VideoStreamEnd parseFrom(ByteBuffer byteBuffer) {
        return (VideoStreamEnd) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\t\u0002\u000b", new Object[]{"rtpId_", "eosFrameRtpSeqId_"});
            case 3:
                return new KJb();
            case 4:
                return new KFQ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (VideoStreamEnd.class) {
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
