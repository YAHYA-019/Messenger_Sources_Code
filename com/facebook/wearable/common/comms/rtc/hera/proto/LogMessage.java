package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFF;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LogMessage.class */
public final class LogMessage extends KJb implements MJ3 {
    public static final int CALL_EVENT_MESSAGE_FIELD_NUMBER = 3;
    public static final int CONSOLE_MESSAGE_FIELD_NUMBER = 2;
    public static final LogMessage DEFAULT_INSTANCE;
    public static final int LOG_TYPE_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public int logType_;
    public int payloadCase_ = 0;
    public Object payload_;

    static {
        LogMessage logMessage = new LogMessage();
        DEFAULT_INSTANCE = logMessage;
        KJb.A0A(logMessage, LogMessage.class);
    }

    public static KFF newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LogMessage parseFrom(ByteBuffer byteBuffer) {
        return (LogMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003\u0001��\u0001\u0003\u0003������\u0001\f\u0002<��\u0003<��", new Object[]{"payload_", "payloadCase_", "logType_", ConsoleMessage.class, CallEventMessage.class});
            case 3:
                return new LogMessage();
            case 4:
                return new KFF();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LogMessage.class) {
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
