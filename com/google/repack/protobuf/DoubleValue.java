package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KFY;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: DoubleValue.class */
public final class DoubleValue extends KJb implements MJ3 {
    public static final DoubleValue DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    public double value_;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KJb, com.google.repack.protobuf.DoubleValue] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, DoubleValue.class);
    }

    public static KFY newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) {
        return (DoubleValue) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001��", new Object[]{"value_"});
            case 3:
                return new KJb();
            case 4:
                return new KFY();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (DoubleValue.class) {
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
