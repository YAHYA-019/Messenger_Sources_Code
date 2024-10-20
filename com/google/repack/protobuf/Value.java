package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KFt;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Value.class */
public final class Value extends KJb implements MJ3 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    public static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    public int kindCase_ = 0;
    public Object kind_;

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        KJb.A0A(value, Value.class);
    }

    public static KFt newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Value parseFrom(ByteBuffer byteBuffer) {
        return (Value) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0006\u0001��\u0001\u0006\u0006������\u0001?��\u00023��\u0003Ȼ��\u0004:��\u0005<��\u0006<��", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 3:
                return new Value();
            case 4:
                return new KFt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Value.class) {
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
