package com.facebook.wearable.common.comms.rtc.callengine2.video.proto;

import X.AnonymousClass001;
import X.KEw;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: VideoCallParticipantState.class */
public final class VideoCallParticipantState extends KJb implements MJ3 {
    public static final VideoCallParticipantState DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 1;
    public static final int VIDEO_STATE_FIELD_NUMBER = 2;
    public String participantId_ = "";
    public int videoState_;

    static {
        VideoCallParticipantState videoCallParticipantState = new VideoCallParticipantState();
        DEFAULT_INSTANCE = videoCallParticipantState;
        KJb.A0A(videoCallParticipantState, VideoCallParticipantState.class);
    }

    public static KEw newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static VideoCallParticipantState parseFrom(ByteBuffer byteBuffer) {
        return (VideoCallParticipantState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002\f", new Object[]{"participantId_", "videoState_"});
            case 3:
                return new VideoCallParticipantState();
            case 4:
                return new KEw();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (VideoCallParticipantState.class) {
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
