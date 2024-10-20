package com.facebook.wearable.common.comms.rtc.hera.proto;

import X.AnonymousClass001;
import X.KE9;
import X.KFL;
import X.KJb;
import X.KMJ;
import X.L9l;
import X.Lgf;
import X.MGg;
import X.MJ3;
import X.MRR;
import java.nio.ByteBuffer;

/* loaded from: RtpStreamInfo.class */
public final class RtpStreamInfo extends KJb implements MJ3 {
    public static final int CLOCKRATE_HZ_FIELD_NUMBER = 2;
    public static final RtpStreamInfo DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 4;
    public static final int MIME_FIELD_NUMBER = 1;
    public static volatile MGg PARSER;
    public static final int RECEIVER_REPORT_INTERVAL_MS_FIELD_NUMBER = 3;
    public int bitField0_;
    public int clockrateHz_;
    public int receiverReportIntervalMs_;
    public String mime_ = "";
    public MRR extensions_ = KE9.A02;

    static {
        RtpStreamInfo rtpStreamInfo = new RtpStreamInfo();
        DEFAULT_INSTANCE = rtpStreamInfo;
        KJb.A0A(rtpStreamInfo, RtpStreamInfo.class);
    }

    public static KFL newBuilder() {
        return DEFAULT_INSTANCE.A0D();
    }

    public static RtpStreamInfo parseFrom(ByteBuffer byteBuffer) {
        return (RtpStreamInfo) KJb.A03(DEFAULT_INSTANCE, byteBuffer);
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
                return KJb.A05(DEFAULT_INSTANCE, "��\u0004��\u0001\u0001\u0004\u0004��\u0001��\u0001Ȉ\u0002\u000b\u0003ဋ��\u0004\u001b", new Object[]{"bitField0_", "mime_", "clockrateHz_", "receiverReportIntervalMs_", "extensions_", RtpExtensionConfig.class});
            case 3:
                return new RtpStreamInfo();
            case 4:
                return new KFL();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                obj3 = PARSER;
                if (obj3 == null) {
                    synchronized (RtpStreamInfo.class) {
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
