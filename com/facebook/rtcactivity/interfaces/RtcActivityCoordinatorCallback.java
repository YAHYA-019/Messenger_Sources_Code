package com.facebook.rtcactivity.interfaces;

import java.util.Map;

/* loaded from: RtcActivityCoordinatorCallback.class */
public interface RtcActivityCoordinatorCallback {
    void onReceivedRequestCancelActivityStart(String str, RtcActivityType rtcActivityType, RtcActivityCancelReason rtcActivityCancelReason);

    void onReceivedRequestStartActivity(String str, RtcActivityType rtcActivityType, Version version, String str2, Map map);
}
