package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KET;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CallCoreActions$FulfillPreCheck.class */
public final class CallCoreActions$FulfillPreCheck extends KJb implements MJ3 {
    public static final int CALL_ID_FIELD_NUMBER = 1;
    public static final CallCoreActions$FulfillPreCheck DEFAULT_INSTANCE;
    public static final int FEATURE_KEY_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public String callId_ = "";
    public String featureKey_ = "";

    static {
        CallCoreActions$FulfillPreCheck callCoreActions$FulfillPreCheck = new CallCoreActions$FulfillPreCheck();
        DEFAULT_INSTANCE = callCoreActions$FulfillPreCheck;
        KJb.A0A(callCoreActions$FulfillPreCheck, CallCoreActions$FulfillPreCheck.class);
    }

    public static KET newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallCoreActions$FulfillPreCheck parseFrom(ByteBuffer byteBuffer) {
        return (CallCoreActions$FulfillPreCheck) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002Ȉ", new Object[]{"callId_", "featureKey_"});
            case 3:
                return new CallCoreActions$FulfillPreCheck();
            case 4:
                return new KET();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallCoreActions$FulfillPreCheck.class) {
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