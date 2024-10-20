package com.facebook.yoga;

import X.0Pz;
import X.1BJ;

/* loaded from: YogaLogLevel.class */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    public final int mIntValue;

    YogaLogLevel(int i) {
        this.mIntValue = i;
    }

    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return WARN;
        }
        if (i == 2) {
            return INFO;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 4) {
            return VERBOSE;
        }
        if (i == 5) {
            return FATAL;
        }
        throw 0Pz.A04(1BJ.A00(28), i);
    }
}
