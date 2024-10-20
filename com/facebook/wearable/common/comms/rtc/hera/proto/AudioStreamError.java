package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KF2;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: AudioStreamError.class */
public final class AudioStreamError extends KJb implements MJ3 {
    public static final AudioStreamError DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public int error_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.wearable.common.comms.rtc.hera.proto.AudioStreamError, X.KJb] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, AudioStreamError.class);
    }

    public static KF2 newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static AudioStreamError parseFrom(ByteBuffer byteBuffer) {
        return (AudioStreamError) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0001����\u0001\u0001\u0001������\u0001\f", new Object[]{"error_"});
            case 3:
                return new KJb();
            case 4:
                return new KF2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (AudioStreamError.class) {
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
