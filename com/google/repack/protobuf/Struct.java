package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KFo;
import X.KJb;
import X.KMJ;
import X.KbK;
import X.L9l;
import X.Lgf;
import X.Lyh;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Struct.class */
public final class Struct extends KJb implements MJ3 {
    public static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public Lyh fields_ = Lyh.A00;

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        KJb.A0A(struct, Struct.class);
    }

    public static KFo newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) {
        return (Struct) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001\u0001����\u00012", new Object[]{"fields_", KbK.A00});
            case 3:
                return new Struct();
            case 4:
                return new KFo();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Struct.class) {
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
