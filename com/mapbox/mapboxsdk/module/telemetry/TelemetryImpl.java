package com.mapbox.mapboxsdk.module.telemetry;

import android.os.Bundle;
import com.mapbox.mapboxsdk.maps.TelemetryDefinition;
import com.mapbox.mapboxsdk.offline.OfflineRegionDefinition;

/* loaded from: TelemetryImpl.class */
public class TelemetryImpl implements TelemetryDefinition {
    @Override // com.mapbox.mapboxsdk.maps.TelemetryDefinition
    public void onAppUserTurnstileEvent() {
    }

    @Override // com.mapbox.mapboxsdk.maps.TelemetryDefinition
    public void onCreateOfflineRegion(OfflineRegionDefinition offlineRegionDefinition) {
    }

    @Override // com.mapbox.mapboxsdk.maps.TelemetryDefinition
    public void onGestureInteraction(String str, double d, double d2, double d3) {
    }

    @Override // com.mapbox.mapboxsdk.maps.TelemetryDefinition
    public void onPerformanceEvent(Bundle bundle) {
    }

    @Override // com.mapbox.mapboxsdk.maps.TelemetryDefinition
    public void setDebugLoggingEnabled(boolean z) {
    }

    @Override // com.mapbox.mapboxsdk.maps.TelemetryDefinition
    public boolean setSessionIdRotationInterval(int i) {
        return false;
    }

    @Override // com.mapbox.mapboxsdk.maps.TelemetryDefinition
    public void setUserTelemetryRequestState(boolean z) {
    }
}
