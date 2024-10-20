package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFO;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: VideoCapability.class */
public final class VideoCapability extends KJb implements MJ3 {
    public static final VideoCapability DEFAULT_INSTANCE;
    public static final int MAX_BITRATE_FIELD_NUMBER = 3;
    public static final int MAX_PIXELS_FIELD_NUMBER = 2;
    public static final int MIME_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public int bitField0_;
    public int maxBitrate_;
    public int maxPixels_;
    public String mime_ = "";

    static {
        VideoCapability videoCapability = new VideoCapability();
        DEFAULT_INSTANCE = videoCapability;
        KJb.A0A(videoCapability, VideoCapability.class);
    }

    public static KFO newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static VideoCapability parseFrom(ByteBuffer byteBuffer) {
        return (VideoCapability) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0003��\u0001\u0001\u0003\u0003������\u0001Ȉ\u0002ဋ��\u0003ဋ\u0001", new Object[]{"bitField0_", "mime_", "maxPixels_", "maxBitrate_"});
            case 3:
                return new VideoCapability();
            case 4:
                return new KFO();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (VideoCapability.class) {
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
