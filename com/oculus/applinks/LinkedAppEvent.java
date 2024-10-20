package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGK;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkedAppEvent.class */
public final class LinkedAppEvent extends KJb implements MJ3 {
    public static final int CONNECTED_FIELD_NUMBER = 10;
    public static final LinkedAppEvent DEFAULT_INSTANCE;
    public static final int DISCONNECTED_FIELD_NUMBER = 11;
    public static volatile MGg PARSER;
    public int eventCase_ = 0;
    public Object event_;

    static {
        LinkedAppEvent linkedAppEvent = new LinkedAppEvent();
        DEFAULT_INSTANCE = linkedAppEvent;
        KJb.A0A(linkedAppEvent, LinkedAppEvent.class);
    }

    public static KGK newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkedAppEvent parseFrom(ByteBuffer byteBuffer) {
        return (LinkedAppEvent) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002\u0001��\n\u000b\u0002������\n<��\u000b<��", new Object[]{"event_", "eventCase_", LinkedAppConnectedEvent.class, LinkedAppDisconnectedEvent.class});
            case 3:
                return new LinkedAppEvent();
            case 4:
                return new KGK();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkedAppEvent.class) {
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
