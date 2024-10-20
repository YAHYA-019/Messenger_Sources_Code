package com.facebook.rtcactivity.interfaces;

/* loaded from: RtcActivityType.class */
public enum RtcActivityType {
    UNKNOWN,
    ALOHA_MUSIC,
    ALOHA_INSTANT_GAME,
    ALOHA_RTC_GAME,
    ALOHA_STORYTIME,
    ALOHA_AR_MUSIC,
    ALOHA_PHOTOBOOTH,
    ALOHA_PING_PONG,
    ALOHA_CAPTURE,
    SNAPSHOT,
    EFFECT,
    TALK_SNAPSHOT,
    TEST;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public static RtcActivityType convertFromString(String str) {
        switch (str.hashCode()) {
            case -2097179444:
                if (str.equals("aloha_pingpong")) {
                    return ALOHA_PING_PONG;
                }
                return UNKNOWN;
            case -2056510606:
                if (str.equals("aloha_rtc_game")) {
                    return ALOHA_RTC_GAME;
                }
                return UNKNOWN;
            case -1436969725:
                if (str.equals("aloha_music")) {
                    return ALOHA_MUSIC;
                }
                return UNKNOWN;
            case -1306084975:
                if (str.equals("effect")) {
                    return EFFECT;
                }
                return UNKNOWN;
            case -625350926:
                if (str.equals("aloha_instant_game")) {
                    return ALOHA_INSTANT_GAME;
                }
                return UNKNOWN;
            case 3556498:
                if (str.equals("test")) {
                    return TEST;
                }
                return UNKNOWN;
            case 284874180:
                if (str.equals("snapshot")) {
                    return SNAPSHOT;
                }
                return UNKNOWN;
            case 799291641:
                if (str.equals("aloha_ar_music")) {
                    return ALOHA_AR_MUSIC;
                }
                return UNKNOWN;
            case 1112533158:
                if (str.equals("aloha_photobooth")) {
                    return ALOHA_PHOTOBOOTH;
                }
                return UNKNOWN;
            case 1191456420:
                if (str.equals("aloha_capture")) {
                    return ALOHA_CAPTURE;
                }
                return UNKNOWN;
            case 1478770982:
                if (str.equals("kTLKRTCSnapshotActivityType")) {
                    return TALK_SNAPSHOT;
                }
                return UNKNOWN;
            case 1486475552:
                if (str.equals("aloha_storytime")) {
                    return ALOHA_STORYTIME;
                }
                return UNKNOWN;
            default:
                return UNKNOWN;
        }
    }
}
