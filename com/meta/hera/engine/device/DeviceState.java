package com.meta.hera.engine.device;

import X.AnonymousClass001;
import X.KE9;
import X.KG0;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: DeviceState.class */
public final class DeviceState extends KJb implements MJ3 {
    public static final DeviceState DEFAULT_INSTANCE;
    public static final int DEVICES_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int SEARCH_REQUEST_ID_FIELD_NUMBER = 2;
    public MRR devices_ = KE9.A02;
    public int searchRequestId_;

    static {
        DeviceState deviceState = new DeviceState();
        DEFAULT_INSTANCE = deviceState;
        KJb.A0A(deviceState, DeviceState.class);
    }

    public static KG0 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static DeviceState parseFrom(ByteBuffer byteBuffer) {
        return (DeviceState) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002��\u0001��\u0001\u001b\u0002\u000b", new Object[]{"devices_", Device.class, "searchRequestId_"});
            case 3:
                return new DeviceState();
            case 4:
                return new KG0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (DeviceState.class) {
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
