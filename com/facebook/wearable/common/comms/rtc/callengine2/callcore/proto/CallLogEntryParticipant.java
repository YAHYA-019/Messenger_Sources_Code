package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEb;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CallLogEntryParticipant.class */
public final class CallLogEntryParticipant extends KJb implements MJ3 {
    public static final CallLogEntryParticipant DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_SELF_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public String id_ = "";
    public boolean isSelf_;

    static {
        CallLogEntryParticipant callLogEntryParticipant = new CallLogEntryParticipant();
        DEFAULT_INSTANCE = callLogEntryParticipant;
        KJb.A0A(callLogEntryParticipant, CallLogEntryParticipant.class);
    }

    public static KEb newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallLogEntryParticipant parseFrom(ByteBuffer byteBuffer) {
        return (CallLogEntryParticipant) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002\u0007", new Object[]{"id_", "isSelf_"});
            case 3:
                return new CallLogEntryParticipant();
            case 4:
                return new KEb();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallLogEntryParticipant.class) {
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
