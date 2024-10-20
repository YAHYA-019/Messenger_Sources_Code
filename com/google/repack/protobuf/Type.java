package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KE9;
import X.KFq;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: Type.class */
public final class Type extends KJb implements MJ3 {
    public static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static volatile MGg PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    public MRR fields_;
    public String name_ = "";
    public MRR oneofs_;
    public MRR options_;
    public SourceContext sourceContext_;
    public int syntax_;

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        KJb.A0A(type, Type.class);
    }

    public Type() {
        KE9 ke9 = KE9.A02;
        this.fields_ = ke9;
        this.oneofs_ = ke9;
        this.options_ = ke9;
    }

    public static KFq newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Type parseFrom(ByteBuffer byteBuffer) {
        return (Type) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0006����\u0001\u0006\u0006��\u0003��\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            case 3:
                return new Type();
            case 4:
                return new KFq();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Type.class) {
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
