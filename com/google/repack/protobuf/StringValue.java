package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KFn;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: StringValue.class */
public final class StringValue extends KJb implements MJ3 {
    public static final StringValue DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    public String value_ = "";

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        KJb.A0A(stringValue, StringValue.class);
    }

    public static KFn newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) {
        return (StringValue) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001Ȉ", new Object[]{"value_"});
            case 3:
                return new StringValue();
            case 4:
                return new KFn();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (StringValue.class) {
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
