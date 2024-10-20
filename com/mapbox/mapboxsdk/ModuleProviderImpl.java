package com.mapbox.mapboxsdk;

import com.mapbox.mapboxsdk.http.HttpRequest;
import com.mapbox.mapboxsdk.maps.TelemetryDefinition;
import com.mapbox.mapboxsdk.module.http.HttpRequestImpl;

/* loaded from: ModuleProviderImpl.class */
public class ModuleProviderImpl implements ModuleProvider {
    @Override // com.mapbox.mapboxsdk.ModuleProvider
    public HttpRequest createHttpRequest() {
        return new HttpRequestImpl();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.mapboxsdk.LibraryLoaderProvider, java.lang.Object] */
    @Override // com.mapbox.mapboxsdk.ModuleProvider
    public LibraryLoaderProvider createLibraryLoaderProvider() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.mapbox.mapboxsdk.maps.TelemetryDefinition] */
    @Override // com.mapbox.mapboxsdk.ModuleProvider
    public TelemetryDefinition obtainTelemetry() {
        return new Object();
    }
}
