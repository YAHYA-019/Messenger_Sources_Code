package com.facebook.messaging.model.attachment;

/* loaded from: EphemeralMediaState.class */
public enum EphemeralMediaState {
    UNKNOWN,
    PERMANENT,
    UNSEEN,
    SEEN,
    REPLAYED,
    EXPIRED;

    public static final EphemeralMediaState[] A00 = values();

    public static EphemeralMediaState A00(String str) {
        EphemeralMediaState ephemeralMediaState;
        EphemeralMediaState[] ephemeralMediaStateArr = A00;
        int length = ephemeralMediaStateArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                ephemeralMediaState = UNKNOWN;
                break;
            }
            ephemeralMediaState = ephemeralMediaStateArr[i2];
            if (ephemeralMediaState.name().equalsIgnoreCase(str)) {
                break;
            }
            i = i2 + 1;
        }
        return ephemeralMediaState;
    }
}
