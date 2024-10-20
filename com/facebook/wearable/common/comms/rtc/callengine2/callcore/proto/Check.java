package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEc;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Check.class */
public final class Check extends KJb implements MJ3 {
    public static final int CALL_ID_FIELD_NUMBER = 1;
    public static final int CHECKED_FIELD_NUMBER = 3;
    public static final Check DEFAULT_INSTANCE;
    public static final int FEATURE_KEY_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public boolean checked_;
    public String callId_ = "";
    public String featureKey_ = "";

    static {
        Check check = new Check();
        DEFAULT_INSTANCE = check;
        KJb.A0A(check, Check.class);
    }

    public static KEc newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Check parseFrom(ByteBuffer byteBuffer) {
        return (Check) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003����\u0001\u0003\u0003������\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"callId_", "featureKey_", "checked_"});
            case 3:
                return new Check();
            case 4:
                return new KEc();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Check.class) {
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
