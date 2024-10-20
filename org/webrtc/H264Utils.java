package org.webrtc;

import X.AnonymousClass001;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.HashMap;
import java.util.Map;

/* loaded from: H264Utils.class */
public class H264Utils {
    public static VideoCodecInfo A00;
    public static VideoCodecInfo A01;

    static {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(VideoCodecInfo.H264_FMTP_LEVEL_ASYMMETRY_ALLOWED, ConstantsKt.CAMERA_ID_BACK);
        A0u.put(VideoCodecInfo.H264_FMTP_PACKETIZATION_MODE, ConstantsKt.CAMERA_ID_BACK);
        A0u.put(VideoCodecInfo.H264_FMTP_PROFILE_LEVEL_ID, VideoCodecInfo.H264_CONSTRAINED_BASELINE_3_1);
        A00 = new VideoCodecInfo("H264", A0u);
        HashMap A0u2 = AnonymousClass001.A0u();
        A0u2.put(VideoCodecInfo.H264_FMTP_LEVEL_ASYMMETRY_ALLOWED, ConstantsKt.CAMERA_ID_BACK);
        A0u2.put(VideoCodecInfo.H264_FMTP_PACKETIZATION_MODE, ConstantsKt.CAMERA_ID_BACK);
        A0u2.put(VideoCodecInfo.H264_FMTP_PROFILE_LEVEL_ID, VideoCodecInfo.H264_CONSTRAINED_HIGH_3_1);
        A01 = new VideoCodecInfo("H264", A0u2);
    }

    public static native boolean nativeIsSameH264Profile(Map map, Map map2);
}
