package com.oculus.atc;

import X.AnonymousClass001;
import X.KGT;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: EnableEncryption.class */
public final class EnableEncryption extends KJb implements MJ3 {
    public static final int BASE_FIELD_NUMBER = 4;
    public static final EnableEncryption DEFAULT_INSTANCE;
    public static final int IV_FIELD_NUMBER = 3;
    public static final int PARAMETERS_FIELD_NUMBER = 5;
    public static volatile MGg PARSER;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SEED_FIELD_NUMBER = 2;
    public int base_;
    public Lj5 iv_;
    public int parameters_;
    public Lj5 publicKey_;
    public Lj5 seed_;

    static {
        EnableEncryption enableEncryption = new EnableEncryption();
        DEFAULT_INSTANCE = enableEncryption;
        KJb.A0A(enableEncryption, EnableEncryption.class);
    }

    public EnableEncryption() {
        Lj5 lj5 = Lj5.A00;
        this.publicKey_ = lj5;
        this.seed_ = lj5;
        this.iv_ = lj5;
    }

    public static KGT newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static EnableEncryption parseFrom(ByteBuffer byteBuffer) {
        return (EnableEncryption) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0005����\u0001\u0005\u0005������\u0001\n\u0002\n\u0003\n\u0004\u000b\u0005\u000b", new Object[]{"publicKey_", "seed_", "iv_", "base_", "parameters_"});
            case 3:
                return new EnableEncryption();
            case 4:
                return new KGT();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (EnableEncryption.class) {
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
