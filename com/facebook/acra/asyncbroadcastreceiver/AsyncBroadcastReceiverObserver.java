package com.facebook.acra.asyncbroadcastreceiver;

import X.11T;
import X.AnonymousClass001;
import android.content.BroadcastReceiver;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: AsyncBroadcastReceiverObserver.class */
public final class AsyncBroadcastReceiverObserver {
    public static final String ACTIVE_RECEIVERS = "active_receivers";
    public static final String ACTIVE_RECEIVERS_COUNT = "active_receivers_count";
    public static final String BROADCAST_UPTIME_MS = "broadcast_uptime_ms";
    public static final String CURRENT_UPTIME_MS = "current_uptime_ms";
    public static final String PENDING_RESULT = "pending_result";
    public static final String RECEIVER = "receiver";
    public static final String RECEIVER_CLASS = "receiver_class";
    public static final AsyncBroadcastReceiverObserver INSTANCE = new Object();
    public static final ConcurrentHashMap activeReceivers = new ConcurrentHashMap();

    private final JSONObject blame(BroadcastReceiver broadcastReceiver, BroadcastReceiver.PendingResult pendingResult) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BROADCAST_UPTIME_MS, SystemClock.uptimeMillis());
            jSONObject.put(RECEIVER_CLASS, broadcastReceiver.getClass());
            jSONObject.put(RECEIVER, broadcastReceiver.toString());
            jSONObject.put(PENDING_RESULT, pendingResult.toString());
            return jSONObject;
        } catch (JSONException e) {
            try {
                jSONObject.put("error", e.toString());
                return jSONObject;
            } catch (JSONException unused) {
                throw AnonymousClass001.A0U("error");
            }
        }
    }

    public static final String blameActiveReceivers() {
        ConcurrentHashMap concurrentHashMap = activeReceivers;
        if (concurrentHashMap.isEmpty()) {
            return null;
        }
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put(CURRENT_UPTIME_MS, SystemClock.uptimeMillis());
            A12.put(ACTIVE_RECEIVERS_COUNT, concurrentHashMap.size());
            JSONArray jSONArray = new JSONArray();
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            A12.put(ACTIVE_RECEIVERS, jSONArray);
            return A12.toString();
        } catch (JSONException unused) {
            return CURRENT_UPTIME_MS.toString();
        }
    }

    public static final void clear() {
        activeReceivers.clear();
    }

    public static final void finish(BroadcastReceiver.PendingResult pendingResult) {
        11T.A0F(pendingResult, 0);
        activeReceivers.remove(pendingResult);
    }

    public static final void goAsync(BroadcastReceiver broadcastReceiver, BroadcastReceiver.PendingResult pendingResult) {
        11T.A0F(broadcastReceiver, 0);
        11T.A0F(pendingResult, 1);
        activeReceivers.put(pendingResult, INSTANCE.blame(broadcastReceiver, pendingResult));
    }
}
