package com.oculus.atc;

import X.AnonymousClass001;
import X.KGt;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: SwitchLink.class */
public final class SwitchLink extends KJb implements MJ3 {
    public static final SwitchLink DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int TARGET_FIELD_NUMBER = 1;
    public Lj5 target_ = Lj5.A00;

    static {
        SwitchLink switchLink = new SwitchLink();
        DEFAULT_INSTANCE = switchLink;
        KJb.A0A(switchLink, SwitchLink.class);
    }

    public static KGt newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static SwitchLink parseFrom(ByteBuffer byteBuffer) {
        return (SwitchLink) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001\n", new Object[]{"target_"});
            case 3:
                return new SwitchLink();
            case 4:
                return new KGt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (SwitchLink.class) {
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
