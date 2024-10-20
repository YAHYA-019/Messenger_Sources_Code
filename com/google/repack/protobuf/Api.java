package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KE9;
import X.KFV;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: Api.class */
public final class Api extends KJb implements MJ3 {
    public static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static volatile MGg PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    public MRR methods_;
    public MRR mixins_;
    public String name_ = "";
    public MRR options_;
    public SourceContext sourceContext_;
    public int syntax_;
    public String version_;

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        KJb.A0A(api, Api.class);
    }

    public Api() {
        KE9 ke9 = KE9.A02;
        this.methods_ = ke9;
        this.options_ = ke9;
        this.version_ = "";
        this.mixins_ = ke9;
    }

    public static KFV newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Api parseFrom(ByteBuffer byteBuffer) {
        return (Api) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0007����\u0001\u0007\u0007��\u0003��\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 3:
                return new Api();
            case 4:
                return new KFV();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Api.class) {
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
