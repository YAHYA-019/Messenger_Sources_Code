package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KFN;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: StartVideoRequest.class */
public final class StartVideoRequest extends KJb implements MJ3 {
    public static final int CAPABILITIES_FIELD_NUMBER = 6;
    public static final StartVideoRequest DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PREFERRED_FPS_FIELD_NUMBER = 4;
    public static final int PREFERRED_HEIGHT_FIELD_NUMBER = 2;
    public static final int PREFERRED_INIT_BITRATE_FIELD_NUMBER = 3;
    public static final int PREFERRED_I_FRAME_INTERVAL_FIELD_NUMBER = 5;
    public static final int PREFERRED_WIDTH_FIELD_NUMBER = 1;
    public static final int PROTOCOL_VERSION_FIELD_NUMBER = 7;
    public static final int REQUEST_NONCE_FIELD_NUMBER = 8;
    public static final int RTP_FIELD_NUMBER = 9;
    public int bitField0_;
    public MRR capabilities_ = KE9.A02;
    public int preferredFps_;
    public int preferredHeight_;
    public int preferredIFrameInterval_;
    public int preferredInitBitrate_;
    public int preferredWidth_;
    public int protocolVersion_;
    public int requestNonce_;
    public RtpConfig rtp_;

    static {
        StartVideoRequest startVideoRequest = new StartVideoRequest();
        DEFAULT_INSTANCE = startVideoRequest;
        KJb.A0A(startVideoRequest, StartVideoRequest.class);
    }

    public static KFN newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static StartVideoRequest parseFrom(ByteBuffer byteBuffer) {
        return (StartVideoRequest) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\t��\u0001\u0001\t\t��\u0001��\u0001\u000b\u0002\u000b\u0003ဋ��\u0004ဋ\u0001\u0005ဋ\u0002\u0006\u001b\u0007\u000b\b\u000b\t\t", new Object[]{"bitField0_", "preferredWidth_", "preferredHeight_", "preferredInitBitrate_", "preferredFps_", "preferredIFrameInterval_", "capabilities_", VideoCapability.class, "protocolVersion_", "requestNonce_", "rtp_"});
            case 3:
                return new StartVideoRequest();
            case 4:
                return new KFN();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (StartVideoRequest.class) {
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
