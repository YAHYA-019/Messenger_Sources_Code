package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KFG;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import java.nio.ByteBuffer;

/* loaded from: MediaReceiverReport.class */
public final class MediaReceiverReport extends KJb implements MJ3 {
    public static final int AVG_BITRATE_BPS_FIELD_NUMBER = 1;
    public static final MediaReceiverReport DEFAULT_INSTANCE;
    public static final int LAST_RECEIVED_AT_FIELD_NUMBER = 3;
    public static final int LAST_RECEIVED_RTP_SEQ_FIELD_NUMBER = 2;
    public static volatile MGg PARSER;
    public static final int PKT_LOST_FIELD_NUMBER = 4;
    public int avgBitrateBps_;
    public int bitField0_;
    public int lastReceivedAt_;
    public int lastReceivedRtpSeq_;
    public int pktLost_;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KJb, com.facebook.wearable.common.comms.rtc.hera.proto.MediaReceiverReport] */
    static {
        ?? kJb = new KJb();
        DEFAULT_INSTANCE = kJb;
        KJb.A0A((KJb) kJb, MediaReceiverReport.class);
    }

    public static KFG newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static MediaReceiverReport parseFrom(ByteBuffer byteBuffer) {
        return (MediaReceiverReport) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004��\u0001\u0001\u0004\u0004������\u0001ဋ��\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "avgBitrateBps_", "lastReceivedRtpSeq_", "lastReceivedAt_", "pktLost_"});
            case 3:
                return new KJb();
            case 4:
                return new KFG();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (MediaReceiverReport.class) {
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
