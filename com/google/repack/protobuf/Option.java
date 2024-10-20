package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KFl;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Option.class */
public final class Option extends KJb implements MJ3 {
    public static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int VALUE_FIELD_NUMBER = 2;
    public String name_ = "";
    public Any value_;

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        KJb.A0A(option, Option.class);
    }

    public static KFl newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Option parseFrom(ByteBuffer byteBuffer) {
        return (Option) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 3:
                return new Option();
            case 4:
                return new KFl();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Option.class) {
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
