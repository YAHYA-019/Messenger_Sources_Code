package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFP;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: VideoStreamControlMessage.class */
public final class VideoStreamControlMessage extends KJb implements MJ3 {
    public static final VideoStreamControlMessage DEFAULT_INSTANCE;
    public static final int END_REQUEST_FIELD_NUMBER = 3;
    public static final int KEY_FRAME_REQUEST_FIELD_NUMBER = 5;
    public static volatile MGg PARSER;
    public static final int RECEIVER_REPORT_FIELD_NUMBER = 4;
    public static final int START_REQUEST_FIELD_NUMBER = 2;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public int payloadCase_ = 0;
    public Object payload_;
    public int streamId_;

    static {
        VideoStreamControlMessage videoStreamControlMessage = new VideoStreamControlMessage();
        DEFAULT_INSTANCE = videoStreamControlMessage;
        KJb.A0A(videoStreamControlMessage, VideoStreamControlMessage.class);
    }

    public static KFP newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static VideoStreamControlMessage parseFrom(ByteBuffer byteBuffer) {
        return (VideoStreamControlMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0005\u0001��\u0001\u0005\u0005������\u0001\u000b\u0002<��\u0003<��\u0004<��\u0005<��", new Object[]{"payload_", "payloadCase_", "streamId_", StartVideoRequest.class, EndVideoRequest.class, MediaReceiverReport.class, KeyFrameRequest.class});
            case 3:
                return new VideoStreamControlMessage();
            case 4:
                return new KFP();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (VideoStreamControlMessage.class) {
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
