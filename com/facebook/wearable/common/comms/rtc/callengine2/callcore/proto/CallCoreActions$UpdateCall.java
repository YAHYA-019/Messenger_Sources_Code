package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEX;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CallCoreActions$UpdateCall.class */
public final class CallCoreActions$UpdateCall extends KJb implements MJ3 {
    public static final int ARBITRARY_CALL_ID_FIELD_NUMBER = 2;
    public static final CallCoreActions$UpdateCall DEFAULT_INSTANCE;
    public static final int DELTA_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 3;
    public int bitField0_;
    public CallCoreActions$CallDelta delta_;
    public String arbitraryCallId_ = "";
    public String participantId_ = "";

    static {
        CallCoreActions$UpdateCall callCoreActions$UpdateCall = new CallCoreActions$UpdateCall();
        DEFAULT_INSTANCE = callCoreActions$UpdateCall;
        KJb.A0A(callCoreActions$UpdateCall, CallCoreActions$UpdateCall.class);
    }

    public static KEX newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallCoreActions$UpdateCall parseFrom(ByteBuffer byteBuffer) {
        return (CallCoreActions$UpdateCall) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003��\u0001\u0001\u0003\u0003������\u0001\t\u0002ለ��\u0003ለ\u0001", new Object[]{"bitField0_", "delta_", "arbitraryCallId_", "participantId_"});
            case 3:
                return new CallCoreActions$UpdateCall();
            case 4:
                return new KEX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallCoreActions$UpdateCall.class) {
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
