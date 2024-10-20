package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KE9;
import X.KFd;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: Field.class */
public final class Field extends KJb implements MJ3 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    public static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    public static volatile MGg PARSER;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    public int cardinality_;
    public int kind_;
    public int number_;
    public int oneofIndex_;
    public boolean packed_;
    public String name_ = "";
    public String typeUrl_ = "";
    public MRR options_ = KE9.A02;
    public String jsonName_ = "";
    public String defaultValue_ = "";

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        KJb.A0A(field, Field.class);
    }

    public static KFd newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Field parseFrom(ByteBuffer byteBuffer) {
        return (Field) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\n����\u0001\u000b\n��\u0001��\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 3:
                return new Field();
            case 4:
                return new KFd();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Field.class) {
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
