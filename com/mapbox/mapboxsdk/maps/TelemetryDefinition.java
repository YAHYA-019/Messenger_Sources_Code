package com.mapbox.mapboxsdk.maps;

import android.os.Bundle;
import com.mapbox.mapboxsdk.offline.OfflineRegionDefinition;

/* loaded from: TelemetryDefinition.class */
public interface TelemetryDefinition {
    void onAppUserTurnstileEvent();

    void onCreateOfflineRegion(OfflineRegionDefinition offlineRegionDefinition);

    void onGestureInteraction(String str, double d, double d2, double d3);

    void onPerformanceEvent(Bundle bundle);

    void setDebugLoggingEnabled(boolean z);

    boolean setSessionIdRotationInterval(int i);

    void setUserTelemetryRequestState(boolean z);
}
