package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KF6;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: ConsoleMessage.class */
public final class ConsoleMessage extends KJb implements MJ3 {
    public static final ConsoleMessage DEFAULT_INSTANCE;
    public static final int LOG_LEVEL_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public int logLevel_;
    public String message_ = "";

    static {
        ConsoleMessage consoleMessage = new ConsoleMessage();
        DEFAULT_INSTANCE = consoleMessage;
        KJb.A0A(consoleMessage, ConsoleMessage.class);
    }

    public static KF6 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static ConsoleMessage parseFrom(ByteBuffer byteBuffer) {
        return (ConsoleMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001\f\u0002Ȉ", new Object[]{"logLevel_", "message_"});
            case 3:
                return new ConsoleMessage();
            case 4:
                return new KF6();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (ConsoleMessage.class) {
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
