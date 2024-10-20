package com.facebook.wearable.common.comms.rtc.callengine2.video.proto;

import X.AnonymousClass001;
import X.KEt;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: VideoActions$SetVideoMitigated.class */
public final class VideoActions$SetVideoMitigated extends KJb implements MJ3 {
    public static final int ARBITRARY_CALL_ID_FIELD_NUMBER = 1;
    public static final VideoActions$SetVideoMitigated DEFAULT_INSTANCE;
    public static final int MITIGATED_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public String arbitraryCallId_ = "";
    public boolean mitigated_;

    static {
        VideoActions$SetVideoMitigated videoActions$SetVideoMitigated = new VideoActions$SetVideoMitigated();
        DEFAULT_INSTANCE = videoActions$SetVideoMitigated;
        KJb.A0A(videoActions$SetVideoMitigated, VideoActions$SetVideoMitigated.class);
    }

    public static KEt newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static VideoActions$SetVideoMitigated parseFrom(ByteBuffer byteBuffer) {
        return (VideoActions$SetVideoMitigated) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0002����\u0001\u0002\u0002������\u0001Ȉ\u0002\u0007", new Object[]{"arbitraryCallId_", "mitigated_"});
            case 3:
                return new VideoActions$SetVideoMitigated();
            case 4:
                return new KEt();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (VideoActions$SetVideoMitigated.class) {
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
