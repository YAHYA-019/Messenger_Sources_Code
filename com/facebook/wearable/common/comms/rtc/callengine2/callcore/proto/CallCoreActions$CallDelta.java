package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KER;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: CallCoreActions$CallDelta.class */
public final class CallCoreActions$CallDelta extends KJb implements MJ3 {
    public static final CallCoreActions$CallDelta DEFAULT_INSTANCE;
    public static final int DISCONNECT_STATE_FIELD_NUMBER = 9;
    public static final int END_CALL_REQUEST_FIELD_NUMBER = 8;
    public static final int HAS_PARTICIPANTS_FIELD_NUMBER = 11;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INCOMING_CALL_DECISION_FIELD_NUMBER = 7;
    public static final int IN_CALL_STATE_FIELD_NUMBER = 6;
    public static volatile MGg PARSER;
    public static final int PARTICIPANTS_FIELD_NUMBER = 5;
    public static final int REMOTE_ID_FIELD_NUMBER = 2;
    public static final int START_WITH_VIDEO_FIELD_NUMBER = 10;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int THREAD_INFO_FIELD_NUMBER = 3;
    public int bitField0_;
    public DisconnectIntent disconnectState_;
    public DisconnectIntent endCallRequest_;
    public boolean hasParticipants_;
    public int inCallState_;
    public int incomingCallDecision_;
    public boolean startWithVideo_;
    public int state_;
    public ThreadInfo threadInfo_;
    public String id_ = "";
    public String remoteId_ = "";
    public MRR participants_ = KE9.A02;

    static {
        CallCoreActions$CallDelta callCoreActions$CallDelta = new CallCoreActions$CallDelta();
        DEFAULT_INSTANCE = callCoreActions$CallDelta;
        KJb.A0A(callCoreActions$CallDelta, CallCoreActions$CallDelta.class);
    }

    public static KER newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallCoreActions$CallDelta parseFrom(ByteBuffer byteBuffer) {
        return (CallCoreActions$CallDelta) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u000b��\u0001\u0001\u000b\u000b��\u0001��\u0001Ȉ\u0002ለ��\u0003ဉ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ဌ\u0003\u0007ဌ\u0004\bဉ\u0005\tဉ\u0006\nဇ\u0007\u000b\u0007", new Object[]{"bitField0_", "id_", "remoteId_", "threadInfo_", "state_", "participants_", Participant.class, "inCallState_", "incomingCallDecision_", "endCallRequest_", "disconnectState_", "startWithVideo_", "hasParticipants_"});
            case 3:
                return new CallCoreActions$CallDelta();
            case 4:
                return new KER();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallCoreActions$CallDelta.class) {
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
