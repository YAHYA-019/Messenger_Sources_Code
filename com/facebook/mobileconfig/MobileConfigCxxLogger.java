package com.facebook.mobileconfig;

import java.util.Map;

/* loaded from: MobileConfigCxxLogger.class */
public interface MobileConfigCxxLogger {
    void logCounter(String str, int i);

    void logEvent(String str, Map map);

    void logEventImmediately(String str, Map map);
}
