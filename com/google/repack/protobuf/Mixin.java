package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KFk;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Mixin.class */
public final class Mixin extends KJb implements MJ3 {
    public static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int ROOT_FIELD_NUMBER = 2;
    public String name_ = "";
    public String root_ = "";

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        KJb.A0A(mixin, Mixin.class);
    }

    public static KFk newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) {
        return (Mixin) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 3:
                return new Mixin();
            case 4:
                return new KFk();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Mixin.class) {
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
