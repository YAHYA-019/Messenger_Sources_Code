package com.oculus.atc;

import X.AnonymousClass001;
import X.KGR;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: DestroyWifiDirectNetwork.class */
public final class DestroyWifiDirectNetwork extends KJb implements MJ3 {
    public static final DestroyWifiDirectNetwork DEFAULT_INSTANCE;
    public static volatile MGg PARSER;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.oculus.atc.DestroyWifiDirectNetwork, X.KJb] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, DestroyWifiDirectNetwork.class);
    }

    public static KGR newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static DestroyWifiDirectNetwork parseFrom(ByteBuffer byteBuffer) {
        return (DestroyWifiDirectNetwork) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "����", (Object[]) null);
            case 3:
                return new KJb();
            case 4:
                return new KGR();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (DestroyWifiDirectNetwork.class) {
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
