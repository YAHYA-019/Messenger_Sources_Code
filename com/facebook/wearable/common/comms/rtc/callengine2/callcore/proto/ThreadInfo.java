package com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto;

import X.AnonymousClass001;
import X.KEg;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: ThreadInfo.class */
public final class ThreadInfo extends KJb implements MJ3 {
    public static final ThreadInfo DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int THREAD_IMAGE_URL_FIELD_NUMBER = 2;
    public int bitField0_;
    public String id_ = "";
    public String name_ = "";
    public String threadImageUrl_ = "";

    static {
        ThreadInfo threadInfo = new ThreadInfo();
        DEFAULT_INSTANCE = threadInfo;
        KJb.A0A(threadInfo, ThreadInfo.class);
    }

    public static KEg newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static ThreadInfo parseFrom(ByteBuffer byteBuffer) {
        return (ThreadInfo) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003��\u0001\u0001\u0003\u0003������\u0001ለ\u0001\u0002ለ\u0002\u0003ለ��", new Object[]{"bitField0_", "name_", "threadImageUrl_", "id_"});
            case 3:
                return new ThreadInfo();
            case 4:
                return new KEg();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (ThreadInfo.class) {
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
