package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEV;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CallCoreActions$RemoveCallFromList.class */
public final class CallCoreActions$RemoveCallFromList extends KJb implements MJ3 {
    public static final int CALL_ID_FIELD_NUMBER = 1;
    public static final CallCoreActions$RemoveCallFromList DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public String callId_ = "";

    static {
        CallCoreActions$RemoveCallFromList callCoreActions$RemoveCallFromList = new CallCoreActions$RemoveCallFromList();
        DEFAULT_INSTANCE = callCoreActions$RemoveCallFromList;
        KJb.A0A(callCoreActions$RemoveCallFromList, CallCoreActions$RemoveCallFromList.class);
    }

    public static KEV newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallCoreActions$RemoveCallFromList parseFrom(ByteBuffer byteBuffer) {
        return (CallCoreActions$RemoveCallFromList) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001Ȉ", new Object[]{"callId_"});
            case 3:
                return new CallCoreActions$RemoveCallFromList();
            case 4:
                return new KEV();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallCoreActions$RemoveCallFromList.class) {
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
