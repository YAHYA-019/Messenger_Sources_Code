package com.oculus.atc;

import X.AnonymousClass001;
import X.KE9;
import X.KGi;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: RequestEncryption.class */
public final class RequestEncryption extends KJb implements MJ3 {
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    public static final RequestEncryption DEFAULT_INSTANCE;
    public static final int ELLIPTICCURVE_FIELD_NUMBER = 3;
    public static final int KEYHINT_FIELD_NUMBER = 5;
    public static volatile MGg PARSER;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SUPPORTEDPARAMETERS_FIELD_NUMBER = 4;
    public Lj5 challenge_;
    public MRR keyHint_;
    public int keyTypeCase_ = 0;
    public Object keyType_;
    public Lj5 publicKey_;
    public int supportedParameters_;

    static {
        RequestEncryption requestEncryption = new RequestEncryption();
        DEFAULT_INSTANCE = requestEncryption;
        KJb.A0A(requestEncryption, RequestEncryption.class);
    }

    public RequestEncryption() {
        Lj5 lj5 = Lj5.A00;
        this.publicKey_ = lj5;
        this.challenge_ = lj5;
        this.keyHint_ = KE9.A02;
    }

    public static KGi newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static RequestEncryption parseFrom(ByteBuffer byteBuffer) {
        return (RequestEncryption) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0005\u0001��\u0001\u0005\u0005��\u0001��\u0001\n\u0002\n\u0003?��\u0004\u000b\u0005\u001c", new Object[]{"keyType_", "keyTypeCase_", "publicKey_", "challenge_", "supportedParameters_", "keyHint_"});
            case 3:
                return new RequestEncryption();
            case 4:
                return new KGi();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (RequestEncryption.class) {
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
