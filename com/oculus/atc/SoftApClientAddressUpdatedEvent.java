package com.oculus.atc;

import X.AnonymousClass001;
import X.KE9;
import X.KGo;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: SoftApClientAddressUpdatedEvent.class */
public final class SoftApClientAddressUpdatedEvent extends KJb implements MJ3 {
    public static final int ADDRESSES_FIELD_NUMBER = 1;
    public static final SoftApClientAddressUpdatedEvent DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public MRR addresses_ = KE9.A02;

    static {
        SoftApClientAddressUpdatedEvent softApClientAddressUpdatedEvent = new SoftApClientAddressUpdatedEvent();
        DEFAULT_INSTANCE = softApClientAddressUpdatedEvent;
        KJb.A0A(softApClientAddressUpdatedEvent, SoftApClientAddressUpdatedEvent.class);
    }

    public static KGo newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static SoftApClientAddressUpdatedEvent parseFrom(ByteBuffer byteBuffer) {
        return (SoftApClientAddressUpdatedEvent) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"addresses_", NetworkAddress.class});
            case 3:
                return new SoftApClientAddressUpdatedEvent();
            case 4:
                return new KGo();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (SoftApClientAddressUpdatedEvent.class) {
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
