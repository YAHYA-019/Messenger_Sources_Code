package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFC;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkMonitorMessage.class */
public final class LinkMonitorMessage extends KJb implements MJ3 {
    public static final LinkMonitorMessage DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PING_FIELD_NUMBER = 1;
    public static final int PONG_FIELD_NUMBER = 2;
    public int payloadCase_ = 0;
    public Object payload_;

    static {
        LinkMonitorMessage linkMonitorMessage = new LinkMonitorMessage();
        DEFAULT_INSTANCE = linkMonitorMessage;
        KJb.A0A(linkMonitorMessage, LinkMonitorMessage.class);
    }

    public static KFC newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkMonitorMessage parseFrom(ByteBuffer byteBuffer) {
        return (LinkMonitorMessage) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002\u0001��\u0001\u0002\u0002������\u0001<��\u0002<��", new Object[]{"payload_", "payloadCase_", LinkMonitorPing.class, LinkMonitorPong.class});
            case 3:
                return new LinkMonitorMessage();
            case 4:
                return new KFC();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkMonitorMessage.class) {
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
