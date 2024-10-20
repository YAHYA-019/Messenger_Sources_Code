package com.facebook.rtcactivity.interfaces;

/* loaded from: RtcActivityCancelReason.class */
public enum RtcActivityCancelReason {
    UNKNOWN,
    VIDEO_OFF,
    INTERACTIVE_EFFECT_OFF;

    public static RtcActivityCancelReason convertFromString(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 0) {
            if (hashCode != 15018814) {
                if (hashCode == 1333279659 && str.equals("video_off")) {
                    return VIDEO_OFF;
                }
            } else if (str.equals("interactive_effect_off")) {
                return INTERACTIVE_EFFECT_OFF;
            }
        }
        return UNKNOWN;
    }
}
