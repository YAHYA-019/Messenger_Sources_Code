package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEW;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CallCoreActions$SetIncomingCallDecision.class */
public final class CallCoreActions$SetIncomingCallDecision extends KJb implements MJ3 {
    public static final int CALL_ID_FIELD_NUMBER = 1;
    public static final int DECISION_WITH_VIDEO_OVERRIDE_FIELD_NUMBER = 2;
    public static final CallCoreActions$SetIncomingCallDecision DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public String callId_ = "";
    public IncomingCallDecisionWithVideoOverride decisionWithVideoOverride_;

    static {
        CallCoreActions$SetIncomingCallDecision callCoreActions$SetIncomingCallDecision = new CallCoreActions$SetIncomingCallDecision();
        DEFAULT_INSTANCE = callCoreActions$SetIncomingCallDecision;
        KJb.A0A(callCoreActions$SetIncomingCallDecision, CallCoreActions$SetIncomingCallDecision.class);
    }

    public static KEW newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallCoreActions$SetIncomingCallDecision parseFrom(ByteBuffer byteBuffer) {
        return (CallCoreActions$SetIncomingCallDecision) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002\t", new Object[]{"callId_", "decisionWithVideoOverride_"});
            case 3:
                return new CallCoreActions$SetIncomingCallDecision();
            case 4:
                return new KEW();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallCoreActions$SetIncomingCallDecision.class) {
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
