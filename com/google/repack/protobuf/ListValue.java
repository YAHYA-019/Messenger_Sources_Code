package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KE9;
import X.KFi;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: ListValue.class */
public final class ListValue extends KJb implements MJ3 {
    public static final ListValue DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    public MRR values_ = KE9.A02;

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        KJb.A0A(listValue, ListValue.class);
    }

    public static KFi newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) {
        return (ListValue) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"values_", Value.class});
            case 3:
                return new ListValue();
            case 4:
                return new KFi();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (ListValue.class) {
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
