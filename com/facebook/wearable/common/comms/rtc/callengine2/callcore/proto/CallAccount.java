package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEO;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CallAccount.class */
public final class CallAccount extends KJb implements MJ3 {
    public static final CallAccount DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int SERVICE_FIELD_NUMBER = 1;
    public static final int USER_ID_FIELD_NUMBER = 2;
    public int bitField0_;
    public int service_;
    public String userId_ = "";

    static {
        CallAccount callAccount = new CallAccount();
        DEFAULT_INSTANCE = callAccount;
        KJb.A0A(callAccount, CallAccount.class);
    }

    public static KEO newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallAccount parseFrom(ByteBuffer byteBuffer) {
        return (CallAccount) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002��\u0001\u0001\u0002\u0002������\u0001\f\u0002ለ��", new Object[]{"bitField0_", "service_", "userId_"});
            case 3:
                return new CallAccount();
            case 4:
                return new KEO();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallAccount.class) {
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
