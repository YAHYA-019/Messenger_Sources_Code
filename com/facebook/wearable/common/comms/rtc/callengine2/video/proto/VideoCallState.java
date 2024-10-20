package com.facebook.wearable.common.comms.rtc.callengine2.video.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KEx;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: VideoCallState.class */
public final class VideoCallState extends KJb implements MJ3 {
    public static final int CALL_ID_FIELD_NUMBER = 1;
    public static final VideoCallState DEFAULT_INSTANCE;
    public static final int MITIGATED_FIELD_NUMBER = 3;
    public static volatile MGg PARSER;
    public static final int PARTICIPANT_STATES_FIELD_NUMBER = 2;
    public boolean mitigated_;
    public String callId_ = "";
    public MRR participantStates_ = KE9.A02;

    static {
        VideoCallState videoCallState = new VideoCallState();
        DEFAULT_INSTANCE = videoCallState;
        KJb.A0A(videoCallState, VideoCallState.class);
    }

    public static KEx newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static VideoCallState parseFrom(ByteBuffer byteBuffer) {
        return (VideoCallState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003��\u0001��\u0001Ȉ\u0002\u001b\u0003\u0007", new Object[]{"callId_", "participantStates_", VideoCallParticipantState.class, "mitigated_"});
            case 3:
                return new VideoCallState();
            case 4:
                return new KEx();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (VideoCallState.class) {
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
