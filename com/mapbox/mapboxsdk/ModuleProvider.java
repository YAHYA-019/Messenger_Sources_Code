package com.mapbox.mapboxsdk;

import com.mapbox.mapboxsdk.http.HttpRequest;
import com.mapbox.mapboxsdk.maps.TelemetryDefinition;

/* loaded from: ModuleProvider.class */
public interface ModuleProvider {
    HttpRequest createHttpRequest();

    LibraryLoaderProvider createLibraryLoaderProvider();

    TelemetryDefinition obtainTelemetry();
}
