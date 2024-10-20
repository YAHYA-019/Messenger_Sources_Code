package com.facebook.papaya.client.platform;

import X.0Pz;
import X.Ltv;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: PlatformThreadUtil.class */
public class PlatformThreadUtil {
    public static ScheduledExecutorService createExecutor(String str) {
        if (str.equals("scheduling_thread")) {
            return Executors.newSingleThreadScheduledExecutor(new Ltv(1));
        }
        if (str.equals("random_thread")) {
            return Executors.newScheduledThreadPool(5, new Ltv(2));
        }
        throw 0Pz.A05("No executor for type ", str);
    }
}
