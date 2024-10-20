package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEe;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: IncomingCallDecisionWithVideoOverride.class */
public final class IncomingCallDecisionWithVideoOverride extends KJb implements MJ3 {
    public static final int CALL_ID_FIELD_NUMBER = 1;
    public static final int DECISION_FIELD_NUMBER = 2;
    public static final IncomingCallDecisionWithVideoOverride DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int START_WITH_VIDEO_OVERRIDE_FIELD_NUMBER = 3;
    public int bitField0_;
    public String callId_ = "";
    public int decision_;
    public boolean startWithVideoOverride_;

    static {
        IncomingCallDecisionWithVideoOverride incomingCallDecisionWithVideoOverride = new IncomingCallDecisionWithVideoOverride();
        DEFAULT_INSTANCE = incomingCallDecisionWithVideoOverride;
        KJb.A0A(incomingCallDecisionWithVideoOverride, IncomingCallDecisionWithVideoOverride.class);
    }

    public static KEe newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static IncomingCallDecisionWithVideoOverride parseFrom(ByteBuffer byteBuffer) {
        return (IncomingCallDecisionWithVideoOverride) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003��\u0001\u0001\u0003\u0003������\u0001Ȉ\u0002\f\u0003ဇ��", new Object[]{"bitField0_", "callId_", "decision_", "startWithVideoOverride_"});
            case 3:
                return new IncomingCallDecisionWithVideoOverride();
            case 4:
                return new KEe();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (IncomingCallDecisionWithVideoOverride.class) {
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
