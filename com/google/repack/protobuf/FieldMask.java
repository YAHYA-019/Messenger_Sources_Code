package com.google.repack.protobuf;

import X.AnonymousClass001;
import X.KE9;
import X.KFe;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: FieldMask.class */
public final class FieldMask extends KJb implements MJ3 {
    public static final FieldMask DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PATHS_FIELD_NUMBER = 1;
    public MRR paths_ = KE9.A02;

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        KJb.A0A(fieldMask, FieldMask.class);
    }

    public static KFe newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) {
        return (FieldMask) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001��\u0001��\u0001Ț", new Object[]{"paths_"});
            case 3:
                return new FieldMask();
            case 4:
                return new KFe();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (FieldMask.class) {
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
