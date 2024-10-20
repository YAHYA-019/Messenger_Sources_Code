package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KFM;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: StartAudioRequest.class */
public final class StartAudioRequest extends KJb implements MJ3 {
    public static final int CAPABILITIES_FIELD_NUMBER = 3;
    public static final StartAudioRequest DEFAULT_INSTANCE;
    public static volatile MGg PARSER;
    public static final int PROTOCOL_VERSION_FIELD_NUMBER = 1;
    public static final int REQUEST_NONCE_FIELD_NUMBER = 2;
    public static final int RTP_FIELD_NUMBER = 4;
    public MRR capabilities_ = KE9.A02;
    public int protocolVersion_;
    public int requestNonce_;
    public RtpConfig rtp_;

    static {
        StartAudioRequest startAudioRequest = new StartAudioRequest();
        DEFAULT_INSTANCE = startAudioRequest;
        KJb.A0A(startAudioRequest, StartAudioRequest.class);
    }

    public static KFM newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static StartAudioRequest parseFrom(ByteBuffer byteBuffer) {
        return (StartAudioRequest) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004����\u0001\u0004\u0004��\u0001��\u0001\u000b\u0002\u000b\u0003\u001b\u0004\t", new Object[]{"protocolVersion_", "requestNonce_", "capabilities_", AudioCapability.class, "rtp_"});
            case 3:
                return new StartAudioRequest();
            case 4:
                return new KFM();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (StartAudioRequest.class) {
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
