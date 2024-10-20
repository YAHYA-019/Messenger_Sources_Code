package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KEa;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: CallLogEntry.class */
public final class CallLogEntry extends KJb implements MJ3 {
    public static final CallLogEntry DEFAULT_INSTANCE;
    public static final int IS_VIDEO_FIELD_NUMBER = 3;
    public static volatile MGg PARSER;
    public static final int PARTICIPANTS_FIELD_NUMBER = 4;
    public static final int SERVICE_FIELD_NUMBER = 1;
    public static final int THREAD_ID_FIELD_NUMBER = 2;
    public int bitField0_;
    public boolean isVideo_;
    public int service_;
    public String threadId_ = "";
    public MRR participants_ = KE9.A02;

    static {
        CallLogEntry callLogEntry = new CallLogEntry();
        DEFAULT_INSTANCE = callLogEntry;
        KJb.A0A(callLogEntry, CallLogEntry.class);
    }

    public static KEa newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallLogEntry parseFrom(ByteBuffer byteBuffer) {
        return (CallLogEntry) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004��\u0001\u0001\u0004\u0004��\u0001��\u0001\f\u0002ለ��\u0003\u0007\u0004\u001b", new Object[]{"bitField0_", "service_", "threadId_", "isVideo_", "participants_", CallLogEntryParticipant.class});
            case 3:
                return new CallLogEntry();
            case 4:
                return new KEa();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallLogEntry.class) {
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
