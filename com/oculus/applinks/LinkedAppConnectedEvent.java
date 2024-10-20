package com.oculus.applinks;

import X.AnonymousClass001;
import X.KGI;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LinkedAppConnectedEvent.class */
public final class LinkedAppConnectedEvent extends KJb implements MJ3 {
    public static final LinkedAppConnectedEvent DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int SERVICEUUID_FIELD_NUMBER = 1;
    public Lj5 serviceUUID_ = Lj5.A00;

    static {
        LinkedAppConnectedEvent linkedAppConnectedEvent = new LinkedAppConnectedEvent();
        DEFAULT_INSTANCE = linkedAppConnectedEvent;
        KJb.A0A(linkedAppConnectedEvent, LinkedAppConnectedEvent.class);
    }

    public static KGI newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LinkedAppConnectedEvent parseFrom(ByteBuffer byteBuffer) {
        return (LinkedAppConnectedEvent) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return new LinkedAppConnectedEvent();
            case 4:
                return new KGI();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LinkedAppConnectedEvent.class) {
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
