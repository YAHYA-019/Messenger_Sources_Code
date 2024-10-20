package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KFX;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: BytesValue.class */
public final class BytesValue extends KJb implements MJ3 {
    public static final BytesValue DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    public Lj5 value_ = Lj5.A00;

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        KJb.A0A(bytesValue, BytesValue.class);
    }

    public static KFX newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) {
        return (BytesValue) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001\n", new Object[]{"value_"});
            case 3:
                return new BytesValue();
            case 4:
                return new KFX();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (BytesValue.class) {
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
