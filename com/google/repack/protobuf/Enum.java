package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KE9;
import X.KFb;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: Enum.class */
public final class Enum extends KJb implements MJ3 {
    public static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile MGg PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    public MRR enumvalue_;
    public String name_ = "";
    public MRR options_;
    public SourceContext sourceContext_;
    public int syntax_;

    static {
        Enum r0 = new Enum();
        DEFAULT_INSTANCE = r0;
        KJb.A0A(r0, Enum.class);
    }

    public Enum() {
        KE9 ke9 = KE9.A02;
        this.enumvalue_ = ke9;
        this.options_ = ke9;
    }

    public static KFb newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) {
        return (Enum) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0005����\u0001\u0005\u0005��\u0002��\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            case 3:
                return new Enum();
            case 4:
                return new KFb();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Enum.class) {
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
