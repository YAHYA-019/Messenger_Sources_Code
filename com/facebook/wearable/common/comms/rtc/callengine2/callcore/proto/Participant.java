package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEf;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: Participant.class */
public final class Participant extends KJb implements MJ3 {
    public static final Participant DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_SELF_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public static final int PHONE_NUMBER_FIELD_NUMBER = 5;
    public static final int PROFILE_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 6;
    public int bitField0_;
    public boolean isSelf_;
    public int state_;
    public String id_ = "";
    public String name_ = "";
    public String profileImageUrl_ = "";
    public String phoneNumber_ = "";

    static {
        Participant participant = new Participant();
        DEFAULT_INSTANCE = participant;
        KJb.A0A(participant, Participant.class);
    }

    public static KEf newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static Participant parseFrom(ByteBuffer byteBuffer) {
        return (Participant) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0006��\u0001\u0001\u0006\u0006������\u0001Ȉ\u0002ለ��\u0003ለ\u0001\u0004\u0007\u0005ለ\u0002\u0006\f", new Object[]{"bitField0_", "id_", "name_", "profileImageUrl_", "isSelf_", "phoneNumber_", "state_"});
            case 3:
                return new Participant();
            case 4:
                return new KEf();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (Participant.class) {
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
