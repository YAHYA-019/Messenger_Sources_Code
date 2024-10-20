package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KEZ;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: CallIntent.class */
public final class CallIntent extends KJb implements MJ3 {
    public static final CallIntent DEFAULT_INSTANCE;
    public static final int IS_GROUP_FIELD_NUMBER = 5;
    public static volatile MGg PARSER;
    public static final int PARTICIPANTS_FIELD_NUMBER = 2;
    public static final int SELF_ID_FIELD_NUMBER = 1;
    public static final int START_WITH_VIDEO_FIELD_NUMBER = 3;
    public static final int THREAD_ID_FIELD_NUMBER = 7;
    public static final int TRIGGER_FIELD_NUMBER = 6;
    public static final int USE_ENCRYPTION_FIELD_NUMBER = 4;
    public int bitField0_;
    public boolean isGroup_;
    public boolean startWithVideo_;
    public boolean useEncryption_;
    public String selfId_ = "";
    public MRR participants_ = KE9.A02;
    public String threadId_ = "";
    public String trigger_ = "";

    static {
        CallIntent callIntent = new CallIntent();
        DEFAULT_INSTANCE = callIntent;
        KJb.A0A(callIntent, CallIntent.class);
    }

    public static KEZ newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallIntent parseFrom(ByteBuffer byteBuffer) {
        return (CallIntent) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0007��\u0001\u0001\u0007\u0007��\u0001��\u0001Ȉ\u0002\u001b\u0003\u0007\u0004\u0007\u0005\u0007\u0006Ȉ\u0007ለ��", new Object[]{"bitField0_", "selfId_", "participants_", Participant.class, "startWithVideo_", "useEncryption_", "isGroup_", "trigger_", "threadId_"});
            case 3:
                return new CallIntent();
            case 4:
                return new KEZ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallIntent.class) {
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
