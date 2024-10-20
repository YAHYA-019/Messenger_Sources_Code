package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGJ;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkedAppDisconnectedEvent.class */
public final class LinkedAppDisconnectedEvent extends KJb implements MJ3 {
    public static final LinkedAppDisconnectedEvent DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int SERVICEUUID_FIELD_NUMBER = 1;
    public Lj5 serviceUUID_ = Lj5.A00;

    static {
        LinkedAppDisconnectedEvent linkedAppDisconnectedEvent = new LinkedAppDisconnectedEvent();
        DEFAULT_INSTANCE = linkedAppDisconnectedEvent;
        KJb.A0A(linkedAppDisconnectedEvent, LinkedAppDisconnectedEvent.class);
    }

    public static KGJ newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkedAppDisconnectedEvent parseFrom(ByteBuffer byteBuffer) {
        return (LinkedAppDisconnectedEvent) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001\n", new Object[]{"serviceUUID_"});
            case 3:
                return new LinkedAppDisconnectedEvent();
            case 4:
                return new KGJ();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkedAppDisconnectedEvent.class) {
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
