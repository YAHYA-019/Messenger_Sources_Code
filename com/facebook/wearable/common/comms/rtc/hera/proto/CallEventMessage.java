package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KF5;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: CallEventMessage.class */
public final class CallEventMessage extends KJb implements MJ3 {
    public static final int CALL_EVENT_FIELD_NUMBER = 2;
    public static final int CALL_EVENT_REASON_FIELD_NUMBER = 3;
    public static final int CALL_EVENT_SUBREASON_FIELD_NUMBER = 4;
    public static final CallEventMessage DEFAULT_INSTANCE;
    public static final int IMMUTABLE_DEVICE_INFO_FIELD_NUMBER = 6;
    public static final int LOG_SEQUENCE_FIELD_NUMBER = 1;
    public static final int MUTABLE_DEVICE_INFO_FIELD_NUMBER = 5;
    public static volatile MGg PARSER;
    public String callEventReason_ = "";
    public String callEventSubreason_ = "";
    public int callEvent_;
    public ImmutableDeviceInfoMessage immutableDeviceInfo_;
    public int logSequence_;
    public MutableDeviceInfoMessage mutableDeviceInfo_;

    static {
        CallEventMessage callEventMessage = new CallEventMessage();
        DEFAULT_INSTANCE = callEventMessage;
        KJb.A0A(callEventMessage, CallEventMessage.class);
    }

    public static KF5 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static CallEventMessage parseFrom(ByteBuffer byteBuffer) {
        return (CallEventMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0006����\u0001\u0006\u0006������\u0001\u000b\u0002\f\u0003Ȉ\u0004Ȉ\u0005\t\u0006\t", new Object[]{"logSequence_", "callEvent_", "callEventReason_", "callEventSubreason_", "mutableDeviceInfo_", "immutableDeviceInfo_"});
            case 3:
                return new CallEventMessage();
            case 4:
                return new KF5();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (CallEventMessage.class) {
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
