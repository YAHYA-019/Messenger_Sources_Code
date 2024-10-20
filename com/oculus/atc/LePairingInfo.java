package com.oculus.atc;

import X.AnonymousClass001;
import X.KGa;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: LePairingInfo.class */
public final class LePairingInfo extends KJb implements MJ3 {
    public static final int APPEARANCE_FIELD_NUMBER = 1;
    public static final LePairingInfo DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public int appearance_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.oculus.atc.LePairingInfo, X.KJb] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, LePairingInfo.class);
    }

    public static KGa newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static LePairingInfo parseFrom(ByteBuffer byteBuffer) {
        return (LePairingInfo) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001\u000b", new Object[]{"appearance_"});
            case 3:
                return new KJb();
            case 4:
                return new KGa();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (LePairingInfo.class) {
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
