package com.oculus.atc;

import X.AnonymousClass001;
import X.KGk;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.Lj5;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: SetManifestAuthorityKey.class */
public final class SetManifestAuthorityKey extends KJb implements MJ3 {
    public static final int AUTHORITY_PUB_KEY_FIELD_NUMBER = 1;
    public static final SetManifestAuthorityKey DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public Lj5 authorityPubKey_ = Lj5.A00;

    static {
        SetManifestAuthorityKey setManifestAuthorityKey = new SetManifestAuthorityKey();
        DEFAULT_INSTANCE = setManifestAuthorityKey;
        KJb.A0A(setManifestAuthorityKey, SetManifestAuthorityKey.class);
    }

    public static KGk newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static SetManifestAuthorityKey parseFrom(ByteBuffer byteBuffer) {
        return (SetManifestAuthorityKey) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001\n", new Object[]{"authorityPubKey_"});
            case 3:
                return new SetManifestAuthorityKey();
            case 4:
                return new KGk();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (SetManifestAuthorityKey.class) {
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
