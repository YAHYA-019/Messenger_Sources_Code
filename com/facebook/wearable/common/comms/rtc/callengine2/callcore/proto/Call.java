package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KEN;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: Call.class */
public final class Call extends KJb implements MJ3 {
    public static final Call DEFAULT_INSTANCE;
    public static final int DISCONNECT_STATE_FIELD_NUMBER = 12;
    public static final int END_CALL_REQUEST_FIELD_NUMBER = 11;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int INCOMING_CALL_DECISION_FIELD_NUMBER = 8;
    public static final int INTENT_FIELD_NUMBER = 5;
    public static final int IN_CALL_STATE_FIELD_NUMBER = 9;
    public static volatile MGg PARSER;
    public static final int PARTICIPANTS_FIELD_NUMBER = 10;
    public static final int REMOTE_ID_FIELD_NUMBER = 3;
    public static final int ROLE_FIELD_NUMBER = 4;
    public static final int SERVICE_FIELD_NUMBER = 1;
    public static final int START_TIMESTAMP_MS_FIELD_NUMBER = 13;
    public static final int STATE_FIELD_NUMBER = 7;
    public static final int THREAD_INFO_FIELD_NUMBER = 6;
    public int bitField0_;
    public DisconnectIntent disconnectState_;
    public DisconnectIntent endCallRequest_;
    public int inCallState_;
    public int incomingCallDecision_;
    public CallIntent intent_;
    public int role_;
    public int service_;
    public long startTimestampMs_;
    public int state_;
    public ThreadInfo threadInfo_;
    public String id_ = "";
    public String remoteId_ = "";
    public MRR participants_ = KE9.A02;

    static {
        Call call = new Call();
        DEFAULT_INSTANCE = call;
        KJb.A0A(call, Call.class);
    }

    public static KEN newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Call parseFrom(ByteBuffer byteBuffer) {
        return (Call) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\r��\u0001\u0001\r\r��\u0001��\u0001\f\u0002Ȉ\u0003ለ��\u0004\f\u0005\t\u0006\t\u0007\f\b\f\t\f\n\u001b\u000b\t\f\t\rစ\u0001", new Object[]{"bitField0_", "service_", "id_", "remoteId_", "role_", "intent_", "threadInfo_", "state_", "incomingCallDecision_", "inCallState_", "participants_", Participant.class, "endCallRequest_", "disconnectState_", "startTimestampMs_"});
            case 3:
                return new Call();
            case 4:
                return new KEN();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Call.class) {
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
