package com.mapbox.mapboxsdk.maps;

import X.7zO;
import X.AnonymousClass001;
import X.JQx;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextUtils;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.LibraryLoader;
import com.mapbox.mapboxsdk.MapStrictMode;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.ProjectedMeters;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.TransitionOptions;
import com.mapbox.mapboxsdk.style.light.Light;
import com.mapbox.mapboxsdk.style.sources.Source;
import com.mapbox.mapboxsdk.utils.BitmapUtils;
import java.util.Arrays;
import java.util.List;

/* loaded from: NativeMapView.class */
public final class NativeMapView implements NativeMap {
    public static final String TAG = "Mbgl-NativeMapView";
    public boolean destroyed;
    public final FileSource fileSource;
    public final MapRenderer mapRenderer;
    public long nativePtr;
    public final float pixelRatio;
    public MapboxMap.SnapshotReadyCallback snapshotReadyCallback;
    public StateCallback stateCallback;
    public final Thread thread;
    public ViewCallback viewCallback;

    /* renamed from: com.mapbox.mapboxsdk.maps.NativeMapView$1, reason: invalid class name */
    /* loaded from: NativeMapView$1.class */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ MapboxMap.OnFpsChangedListener val$listener;

        public AnonymousClass1(MapboxMap.OnFpsChangedListener onFpsChangedListener, Handler handler) {
            this.val$listener = onFpsChangedListener;
            this.val$handler = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapboxMap.OnFpsChangedListener onFpsChangedListener = this.val$listener;
            NativeMapView nativeMapView = NativeMapView.this;
            String str = NativeMapView.TAG;
            nativeMapView.mapRenderer.onFpsChangedListener = onFpsChangedListener != null ? new MapboxMap.OnFpsChangedListener() { // from class: com.mapbox.mapboxsdk.maps.NativeMapView.1.1
                @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnFpsChangedListener
                public void onFpsChanged(final double d) {
                    AnonymousClass1.this.val$handler.post(new Runnable() { // from class: com.mapbox.mapboxsdk.maps.NativeMapView.1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1.this.val$listener.onFpsChanged(d);
                        }
                    });
                }
            } : null;
        }
    }

    /* loaded from: NativeMapView$StateCallback.class */
    public interface StateCallback extends StyleCallback {
        void onCameraDidChange(boolean z);

        void onCameraIsChanging();

        void onCameraWillChange(boolean z);

        boolean onCanRemoveUnusedStyleImage(String str);

        void onDidBecomeIdle();

        void onDidFailLoadingMap(String str);

        void onDidFinishLoadingMap();

        void onDidFinishRenderingFrame(boolean z);

        void onDidFinishRenderingMap(boolean z);

        void onSourceChanged(String str);

        void onStyleImageMissing(String str);

        void onWillStartRenderingFrame();

        void onWillStartRenderingMap();
    }

    /* loaded from: NativeMapView$StyleCallback.class */
    public interface StyleCallback {
        void onDidFinishLoadingStyle();

        void onWillStartLoadingMap();
    }

    /* loaded from: NativeMapView$ViewCallback.class */
    public interface ViewCallback {
        Bitmap getViewContent();
    }

    static {
        LibraryLoader.load();
    }

    public NativeMapView(Context context, float f, boolean z, ViewCallback viewCallback, StateCallback stateCallback, MapRenderer mapRenderer) {
        this.destroyed = false;
        this.nativePtr = 0L;
        this.mapRenderer = mapRenderer;
        this.viewCallback = viewCallback;
        FileSource fileSource = FileSource.getInstance(context);
        this.fileSource = fileSource;
        this.pixelRatio = f;
        this.thread = Thread.currentThread();
        this.stateCallback = stateCallback;
        nativeInitialize(this, fileSource, mapRenderer, f, z);
    }

    public NativeMapView(Context context, boolean z, ViewCallback viewCallback, StateCallback stateCallback, MapRenderer mapRenderer) {
        this(context, 7zO.A0I(context).density, z, viewCallback, stateCallback, mapRenderer);
    }

    private boolean checkState(String str) {
        if (this.thread != Thread.currentThread()) {
            throw new RuntimeException(String.format("Map interactions should happen on the UI thread. Method invoked from wrong thread is %s.", str));
        }
        if (this.destroyed && !TextUtils.isEmpty(str)) {
            String format = String.format("You're calling `%s` after the `MapView` was destroyed, were you invoking it after `onDestroy()`?", str);
            Logger.e(TAG, format);
            MapStrictMode.strictModeViolation(format);
        }
        return this.destroyed;
    }

    private native void nativeAddAnnotationIcon(String str, int i, int i2, float f, byte[] bArr);

    private native void nativeAddImage(String str, Bitmap bitmap, float f, boolean z);

    private native void nativeAddImages(Image[] imageArr);

    private native void nativeAddLayer(long j, String str);

    private native void nativeAddLayerAbove(long j, String str);

    private native void nativeAddLayerAt(long j, int i);

    private native long[] nativeAddMarkers(Marker[] markerArr);

    private native long[] nativeAddPolygons(Polygon[] polygonArr);

    private native long[] nativeAddPolylines(Polyline[] polylineArr);

    private native void nativeAddSource(Source source, long j);

    private native void nativeCancelTransitions();

    private native void nativeCycleDebugOptions();

    private native void nativeDestroy();

    private native void nativeEaseTo(double d, double d2, double d3, long j, double d4, double d5, boolean z);

    private native void nativeFlyTo(double d, double d2, double d3, long j, double d4, double d5);

    private native double nativeGetBearing();

    private native CameraPosition nativeGetCameraForGeometry(Geometry geometry, double d, double d2, double d3, double d4, double d5, double d6);

    private native CameraPosition nativeGetCameraForLatLngBounds(LatLngBounds latLngBounds, double d, double d2, double d3, double d4, double d5, double d6);

    private native CameraPosition nativeGetCameraPosition();

    private native float[] nativeGetContentPadding();

    private native boolean nativeGetDebug();

    private native Bitmap nativeGetImage(String str);

    private native LatLng nativeGetLatLng();

    private native Layer nativeGetLayer(String str);

    private native Layer[] nativeGetLayers();

    private native Light nativeGetLight();

    private native double nativeGetMaxZoom();

    private native double nativeGetMetersPerPixelAtLatitude(double d, double d2);

    private native double nativeGetMinZoom();

    private native double nativeGetPitch();

    private native boolean nativeGetPrefetchTiles();

    private native Source nativeGetSource(String str);

    private native Source[] nativeGetSources();

    private native String nativeGetStyleJson();

    private native String nativeGetStyleUrl();

    private native double nativeGetTopOffsetPixelsForAnnotationSymbol(String str);

    private native long nativeGetTransitionDelay();

    private native long nativeGetTransitionDuration();

    private native TransitionOptions nativeGetTransitionOptions();

    private native double nativeGetZoom();

    private native void nativeInitialize(NativeMapView nativeMapView, FileSource fileSource, MapRenderer mapRenderer, float f, boolean z);

    private native boolean nativeIsFullyLoaded();

    private native void nativeJumpTo(double d, double d2, double d3, double d4, double d5);

    private native LatLng nativeLatLngForPixel(float f, float f2);

    private native LatLng nativeLatLngForProjectedMeters(double d, double d2);

    private native void nativeMoveBy(double d, double d2, long j);

    private native void nativeOnLowMemory();

    private native PointF nativePixelForLatLng(double d, double d2);

    private native ProjectedMeters nativeProjectedMetersForLatLng(double d, double d2);

    private native long[] nativeQueryPointAnnotations(RectF rectF);

    private native Feature[] nativeQueryRenderedFeaturesForBox(float f, float f2, float f3, float f4, String[] strArr, Object[] objArr);

    private native Feature[] nativeQueryRenderedFeaturesForPoint(float f, float f2, String[] strArr, Object[] objArr);

    private native long[] nativeQueryShapeAnnotations(RectF rectF);

    private native void nativeRemoveAnnotationIcon(String str);

    private native void nativeRemoveAnnotations(long[] jArr);

    private native void nativeRemoveImage(String str);

    private native boolean nativeRemoveLayer(long j);

    private native boolean nativeRemoveLayerAt(int i);

    private native boolean nativeRemoveSource(Source source, long j);

    private native void nativeResetNorth();

    private native void nativeResetPosition();

    private native void nativeResetZoom();

    private native void nativeResizeView(int i, int i2);

    private native void nativeRotateBy(double d, double d2, double d3, double d4, long j);

    private native void nativeSetBearing(double d, long j);

    private native void nativeSetBearingXY(double d, double d2, double d3, long j);

    private native void nativeSetContentPadding(float f, float f2, float f3, float f4);

    private native void nativeSetDebug(boolean z);

    private native void nativeSetGestureInProgress(boolean z);

    private native void nativeSetLatLng(double d, double d2, long j);

    private native void nativeSetLatLngBounds(LatLngBounds latLngBounds);

    private native void nativeSetMaxZoom(double d);

    private native void nativeSetMinZoom(double d);

    private native void nativeSetPitch(double d, long j);

    private native void nativeSetPrefetchTiles(boolean z);

    private native void nativeSetReachability(boolean z);

    private native void nativeSetStyleJson(String str);

    private native void nativeSetStyleUrl(String str);

    private native void nativeSetTransitionDelay(long j);

    private native void nativeSetTransitionDuration(long j);

    private native void nativeSetTransitionOptions(TransitionOptions transitionOptions);

    private native void nativeSetVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d, long j);

    private native void nativeSetZoom(double d, double d2, double d3, long j);

    private native void nativeTakeSnapshot();

    private native void nativeUpdateMarker(long j, double d, double d2, String str);

    private native void nativeUpdatePolygon(long j, Polygon polygon);

    private native void nativeUpdatePolyline(long j, Polyline polyline);

    private void onCameraDidChange(boolean z) {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onCameraDidChange(z);
        }
    }

    private void onCameraIsChanging() {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onCameraIsChanging();
        }
    }

    private void onCameraWillChange(boolean z) {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onCameraWillChange(z);
        }
    }

    private boolean onCanRemoveUnusedStyleImage(String str) {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            return stateCallback.onCanRemoveUnusedStyleImage(str);
        }
        return true;
    }

    private void onDidBecomeIdle() {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onDidBecomeIdle();
        }
    }

    private void onDidFailLoadingMap(String str) {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onDidFailLoadingMap(str);
        }
    }

    private void onDidFinishLoadingMap() {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onDidFinishLoadingMap();
        }
    }

    private void onDidFinishLoadingStyle() {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onDidFinishLoadingStyle();
        }
    }

    private void onDidFinishRenderingFrame(boolean z) {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onDidFinishRenderingFrame(z);
        }
    }

    private void onDidFinishRenderingMap(boolean z) {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onDidFinishRenderingMap(z);
        }
    }

    private void onSourceChanged(String str) {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onSourceChanged(str);
        }
    }

    private void onStyleImageMissing(String str) {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onStyleImageMissing(str);
        }
    }

    private void onWillStartLoadingMap() {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onWillStartLoadingMap();
        }
    }

    private void onWillStartRenderingFrame() {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onWillStartRenderingFrame();
        }
    }

    private void onWillStartRenderingMap() {
        StateCallback stateCallback = this.stateCallback;
        if (stateCallback != null) {
            stateCallback.onWillStartRenderingMap();
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void addAnnotationIcon(String str, int i, int i2, float f, byte[] bArr) {
        if (checkState("addAnnotationIcon")) {
            return;
        }
        nativeAddAnnotationIcon(str, i, i2, f, bArr);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void addImages(Image[] imageArr) {
        if (checkState("addImages")) {
            return;
        }
        nativeAddImages(imageArr);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void addLayer(Layer layer) {
        if (checkState("addLayer")) {
            return;
        }
        nativeAddLayer(layer.nativePtr, null);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void addLayerAbove(Layer layer, String str) {
        if (checkState("addLayerAbove")) {
            return;
        }
        nativeAddLayerAbove(layer.nativePtr, str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void addLayerAt(Layer layer, int i) {
        if (checkState("addLayerAt")) {
            return;
        }
        nativeAddLayerAt(layer.nativePtr, i);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void addLayerBelow(Layer layer, String str) {
        if (checkState("addLayerBelow")) {
            return;
        }
        nativeAddLayer(layer.nativePtr, str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public long addMarker(Marker marker) {
        if (checkState("addMarker")) {
            return 0L;
        }
        return nativeAddMarkers(new Marker[]{marker})[0];
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public long[] addMarkers(List list) {
        return checkState("addMarkers") ? new long[0] : nativeAddMarkers((Marker[]) list.toArray(new Marker[list.size()]));
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public long addPolygon(Polygon polygon) {
        if (checkState("addPolygon")) {
            return 0L;
        }
        return nativeAddPolygons(new Polygon[]{polygon})[0];
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public long[] addPolygons(List list) {
        return checkState("addPolygons") ? new long[0] : nativeAddPolygons((Polygon[]) list.toArray(new Polygon[list.size()]));
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public long addPolyline(Polyline polyline) {
        if (checkState("addPolyline")) {
            return 0L;
        }
        return nativeAddPolylines(new Polyline[]{polyline})[0];
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public long[] addPolylines(List list) {
        return checkState("addPolylines") ? new long[0] : nativeAddPolylines((Polyline[]) list.toArray(new Polyline[list.size()]));
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void addSnapshotCallback(MapboxMap.SnapshotReadyCallback snapshotReadyCallback) {
        if (checkState("addSnapshotCallback")) {
            return;
        }
        this.snapshotReadyCallback = snapshotReadyCallback;
        nativeTakeSnapshot();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void addSource(Source source) {
        if (checkState("addSource")) {
            return;
        }
        nativeAddSource(source, source.nativePtr);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void cancelTransitions() {
        if (checkState("cancelTransitions")) {
            return;
        }
        nativeCancelTransitions();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void cycleDebugOptions() {
        if (checkState("cycleDebugOptions")) {
            return;
        }
        nativeCycleDebugOptions();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void destroy() {
        this.destroyed = true;
        this.viewCallback = null;
        nativeDestroy();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void easeTo(LatLng latLng, double d, double d2, double d3, long j, boolean z) {
        if (checkState("easeTo")) {
            return;
        }
        nativeEaseTo(d2, latLng.latitude, latLng.longitude, j, d3, d, z);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void flyTo(LatLng latLng, double d, double d2, double d3, long j) {
        if (checkState("flyTo")) {
            return;
        }
        nativeFlyTo(d2, latLng.latitude, latLng.longitude, j, d3, d);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public double getBearing() {
        if (checkState("getBearing")) {
            return 0.0d;
        }
        return nativeGetBearing();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public CameraPosition getCameraForGeometry(Geometry geometry, int[] iArr, double d, double d2) {
        if (checkState("getCameraForGeometry")) {
            return null;
        }
        float f = iArr[1];
        float f2 = this.pixelRatio;
        return nativeGetCameraForGeometry(geometry, f / f2, JQx.A0M(iArr) / f2, iArr[3] / f2, iArr[2] / f2, d, d2);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public CameraPosition getCameraForLatLngBounds(LatLngBounds latLngBounds, int[] iArr, double d, double d2) {
        if (checkState("getCameraForLatLngBounds")) {
            return null;
        }
        float f = iArr[1];
        float f2 = this.pixelRatio;
        return nativeGetCameraForLatLngBounds(latLngBounds, f / f2, JQx.A0M(iArr) / f2, iArr[3] / f2, iArr[2] / f2, d, d2);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public CameraPosition getCameraPosition() {
        return checkState("getCameraValues") ? new CameraPosition.Builder().build() : nativeGetCameraPosition();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public float[] getContentPadding() {
        if (checkState("getContentPadding")) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        float[] nativeGetContentPadding = nativeGetContentPadding();
        float f = nativeGetContentPadding[1];
        float f2 = this.pixelRatio;
        return new float[]{f * f2, nativeGetContentPadding[0] * f2, nativeGetContentPadding[3] * f2, nativeGetContentPadding[2] * f2};
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public boolean getDebug() {
        if (checkState("getDebug")) {
            return false;
        }
        return nativeGetDebug();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public RectF getDensityDependantRectangle(RectF rectF) {
        float f = rectF.left;
        float f2 = this.pixelRatio;
        return new RectF(f / f2, rectF.top / f2, rectF.right / f2, rectF.bottom / f2);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public Bitmap getImage(String str) {
        if (checkState("getImage")) {
            return null;
        }
        return nativeGetImage(str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public LatLng getLatLng() {
        return checkState("") ? new LatLng() : nativeGetLatLng();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public Layer getLayer(String str) {
        if (checkState("getLayer")) {
            return null;
        }
        return nativeGetLayer(str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public List getLayers() {
        return checkState("getLayers") ? AnonymousClass001.A0s() : Arrays.asList(nativeGetLayers());
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public Light getLight() {
        if (checkState("getLight")) {
            return null;
        }
        return nativeGetLight();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public double getMaxZoom() {
        if (checkState("getMaxZoom")) {
            return 0.0d;
        }
        return nativeGetMaxZoom();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public double getMetersPerPixelAtLatitude(double d) {
        if (checkState("getMetersPerPixelAtLatitude")) {
            return 0.0d;
        }
        return nativeGetMetersPerPixelAtLatitude(d, getZoom()) / this.pixelRatio;
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public double getMinZoom() {
        if (checkState("getMinZoom")) {
            return 0.0d;
        }
        return nativeGetMinZoom();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public long getNativePtr() {
        return this.nativePtr;
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public double getPitch() {
        if (checkState("getPitch")) {
            return 0.0d;
        }
        return nativeGetPitch();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public float getPixelRatio() {
        return this.pixelRatio;
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public boolean getPrefetchTiles() {
        if (checkState("getPrefetchTiles")) {
            return false;
        }
        return nativeGetPrefetchTiles();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public Source getSource(String str) {
        if (checkState("getSource")) {
            return null;
        }
        return nativeGetSource(str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public List getSources() {
        return checkState("getSources") ? AnonymousClass001.A0s() : Arrays.asList(nativeGetSources());
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public String getStyleJson() {
        return checkState("getStyleJson") ? "" : nativeGetStyleJson();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public String getStyleUri() {
        return checkState("getStyleUri") ? "" : nativeGetStyleUrl();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public double getTopOffsetPixelsForAnnotationSymbol(String str) {
        if (checkState("getTopOffsetPixelsForAnnotationSymbol")) {
            return 0.0d;
        }
        return nativeGetTopOffsetPixelsForAnnotationSymbol(str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public TransitionOptions getTransitionOptions() {
        return nativeGetTransitionOptions();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public double getZoom() {
        if (checkState("getZoom")) {
            return 0.0d;
        }
        return nativeGetZoom();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public boolean isDestroyed() {
        return this.destroyed;
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public boolean isFullyLoaded() {
        if (checkState("isFullyLoaded")) {
            return false;
        }
        return nativeIsFullyLoaded();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void jumpTo(LatLng latLng, double d, double d2, double d3) {
        if (checkState("jumpTo")) {
            return;
        }
        nativeJumpTo(d3, latLng.latitude, latLng.longitude, d2, d);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public LatLng latLngForPixel(PointF pointF) {
        if (checkState("latLngForPixel")) {
            return new LatLng();
        }
        float f = pointF.x;
        float f2 = this.pixelRatio;
        return nativeLatLngForPixel(f / f2, pointF.y / f2);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public LatLng latLngForProjectedMeters(ProjectedMeters projectedMeters) {
        return checkState("latLngForProjectedMeters") ? new LatLng() : nativeLatLngForProjectedMeters(projectedMeters.northing, projectedMeters.easting);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void moveBy(double d, double d2, long j) {
        if (checkState("moveBy")) {
            return;
        }
        double d3 = this.pixelRatio;
        nativeMoveBy(d / d3, d2 / d3, j);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void onLowMemory() {
        if (checkState("onLowMemory")) {
            return;
        }
        nativeOnLowMemory();
    }

    public void onSnapshotReady(Bitmap bitmap) {
        if (checkState("OnSnapshotReady")) {
            return;
        }
        try {
            MapboxMap.SnapshotReadyCallback snapshotReadyCallback = this.snapshotReadyCallback;
            if (snapshotReadyCallback == null || bitmap == null) {
                return;
            }
            ViewCallback viewCallback = this.viewCallback;
            if (viewCallback == null) {
                snapshotReadyCallback.onSnapshotReady(bitmap);
                return;
            }
            Bitmap viewContent = viewCallback.getViewContent();
            if (viewContent != null) {
                this.snapshotReadyCallback.onSnapshotReady(BitmapUtils.mergeBitmap(bitmap, viewContent));
            }
        } catch (Throwable th) {
            Logger.e(TAG, "Exception in onSnapshotReady", th);
            throw th;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public PointF pixelForLatLng(LatLng latLng) {
        if (checkState("pixelForLatLng")) {
            return new PointF();
        }
        PointF nativePixelForLatLng = nativePixelForLatLng(latLng.latitude, latLng.longitude);
        float f = nativePixelForLatLng.x;
        float f2 = this.pixelRatio;
        nativePixelForLatLng.set(f * f2, nativePixelForLatLng.y * f2);
        return nativePixelForLatLng;
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public ProjectedMeters projectedMetersForLatLng(LatLng latLng) {
        if (checkState("projectedMetersForLatLng")) {
            return null;
        }
        return nativeProjectedMetersForLatLng(latLng.latitude, latLng.longitude);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public long[] queryPointAnnotations(RectF rectF) {
        return checkState("queryPointAnnotations") ? new long[0] : nativeQueryPointAnnotations(rectF);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public List queryRenderedFeatures(PointF pointF, String[] strArr, Expression expression) {
        if (!checkState("queryRenderedFeatures")) {
            float f = pointF.x;
            float f2 = this.pixelRatio;
            Feature[] nativeQueryRenderedFeaturesForPoint = nativeQueryRenderedFeaturesForPoint(f / f2, pointF.y / f2, strArr, expression != null ? expression.toArray() : null);
            if (nativeQueryRenderedFeaturesForPoint != null) {
                return Arrays.asList(nativeQueryRenderedFeaturesForPoint);
            }
        }
        return AnonymousClass001.A0s();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public List queryRenderedFeatures(RectF rectF, String[] strArr, Expression expression) {
        if (!checkState("queryRenderedFeatures")) {
            float f = rectF.left;
            float f2 = this.pixelRatio;
            Feature[] nativeQueryRenderedFeaturesForBox = nativeQueryRenderedFeaturesForBox(f / f2, rectF.top / f2, rectF.right / f2, rectF.bottom / f2, strArr, expression != null ? expression.toArray() : null);
            if (nativeQueryRenderedFeaturesForBox != null) {
                return Arrays.asList(nativeQueryRenderedFeaturesForBox);
            }
        }
        return AnonymousClass001.A0s();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public long[] queryShapeAnnotations(RectF rectF) {
        return checkState("queryShapeAnnotations") ? new long[0] : nativeQueryShapeAnnotations(rectF);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void removeAnnotation(long j) {
        if (checkState("removeAnnotation")) {
            return;
        }
        removeAnnotations(new long[]{j});
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void removeAnnotationIcon(String str) {
        if (checkState("removeAnnotationIcon")) {
            return;
        }
        nativeRemoveAnnotationIcon(str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void removeAnnotations(long[] jArr) {
        if (checkState("removeAnnotations")) {
            return;
        }
        nativeRemoveAnnotations(jArr);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void removeImage(String str) {
        if (checkState("removeImage")) {
            return;
        }
        nativeRemoveImage(str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public boolean removeLayer(Layer layer) {
        if (checkState("removeLayer")) {
            return false;
        }
        return nativeRemoveLayer(layer.nativePtr);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public boolean removeLayer(String str) {
        Layer layer;
        boolean z = false;
        if (!checkState("removeLayer") && (layer = getLayer(str)) != null) {
            z = removeLayer(layer);
        }
        return z;
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public boolean removeLayerAt(int i) {
        if (checkState("removeLayerAt")) {
            return false;
        }
        return nativeRemoveLayerAt(i);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public boolean removeSource(Source source) {
        if (checkState("removeSource")) {
            return false;
        }
        return nativeRemoveSource(source, source.nativePtr);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public boolean removeSource(String str) {
        Source source;
        boolean z = false;
        if (!checkState("removeSource") && (source = getSource(str)) != null) {
            z = removeSource(source);
        }
        return z;
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void resetNorth() {
        if (checkState("resetNorth")) {
            return;
        }
        nativeResetNorth();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void resetPosition() {
        if (checkState("resetPosition")) {
            return;
        }
        nativeResetPosition();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void resetZoom() {
        if (checkState("resetZoom")) {
            return;
        }
        nativeResetZoom();
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void resizeView(int i, int i2) {
        if (checkState("resizeView")) {
            return;
        }
        float f = this.pixelRatio;
        int ceil = (int) Math.ceil(i / f);
        int ceil2 = (int) Math.ceil(i2 / f);
        if (ceil < 0) {
            throw AnonymousClass001.A0L("width cannot be negative.");
        }
        if (ceil2 < 0) {
            throw AnonymousClass001.A0L("height cannot be negative.");
        }
        char c = (char) (-1);
        if (ceil > c) {
            Logger.e(TAG, String.format("Device returned an out of range width size, capping value at 65535 instead of %s", AnonymousClass001.A1a(ceil)));
            ceil = (char) (-1);
        }
        if (ceil2 > c) {
            Logger.e(TAG, String.format("Device returned an out of range height size, capping value at 65535 instead of %s", AnonymousClass001.A1a(ceil2)));
            ceil2 = (char) (-1);
        }
        nativeResizeView(ceil, ceil2);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void rotateBy(double d, double d2, double d3, double d4, long j) {
        if (checkState("rotateBy")) {
            return;
        }
        double d5 = this.pixelRatio;
        nativeRotateBy(d / d5, d2 / d5, d3, d4, j);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setApiBaseUrl(String str) {
        if (checkState("setApiBaseUrl")) {
            return;
        }
        this.fileSource.setApiBaseUrl(str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setBearing(double d, double d2, double d3, long j) {
        if (checkState("setBearing")) {
            return;
        }
        double d4 = this.pixelRatio;
        nativeSetBearingXY(d, d2 / d4, d3 / d4, j);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setBearing(double d, long j) {
        if (checkState("setBearing")) {
            return;
        }
        nativeSetBearing(d, j);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setContentPadding(float[] fArr) {
        if (checkState("setContentPadding")) {
            return;
        }
        float f = fArr[1];
        float f2 = this.pixelRatio;
        nativeSetContentPadding(f / f2, fArr[0] / f2, fArr[3] / f2, fArr[2] / f2);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setDebug(boolean z) {
        if (checkState("setDebug")) {
            return;
        }
        nativeSetDebug(z);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setGestureInProgress(boolean z) {
        if (checkState("setGestureInProgress")) {
            return;
        }
        nativeSetGestureInProgress(z);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setLatLng(LatLng latLng, long j) {
        if (checkState("setLatLng")) {
            return;
        }
        nativeSetLatLng(latLng.latitude, latLng.longitude, j);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setLatLngBounds(LatLngBounds latLngBounds) {
        if (checkState("setLatLngBounds")) {
            return;
        }
        nativeSetLatLngBounds(latLngBounds);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setMaxZoom(double d) {
        if (checkState("setMaxZoom")) {
            return;
        }
        nativeSetMaxZoom(d);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setMinZoom(double d) {
        if (checkState("setMinZoom")) {
            return;
        }
        nativeSetMinZoom(d);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setOnFpsChangedListener(MapboxMap.OnFpsChangedListener onFpsChangedListener) {
        this.mapRenderer.queueEvent(new AnonymousClass1(onFpsChangedListener, new Handler()));
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setPitch(double d, long j) {
        if (checkState("setPitch")) {
            return;
        }
        nativeSetPitch(d, j);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setPrefetchTiles(boolean z) {
        if (checkState("setPrefetchTiles")) {
            return;
        }
        nativeSetPrefetchTiles(z);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setReachability(boolean z) {
        if (checkState("setReachability")) {
            return;
        }
        nativeSetReachability(z);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setStyleJson(String str) {
        if (checkState("setStyleJson")) {
            return;
        }
        nativeSetStyleJson(str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setStyleUri(String str) {
        if (checkState("setStyleUri")) {
            return;
        }
        nativeSetStyleUrl(str);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setTransitionOptions(TransitionOptions transitionOptions) {
        nativeSetTransitionOptions(transitionOptions);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d, long j) {
        if (checkState("setVisibleCoordinateBounds")) {
            return;
        }
        nativeSetVisibleCoordinateBounds(latLngArr, rectF, d, j);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void setZoom(double d, PointF pointF, long j) {
        if (checkState("setZoom")) {
            return;
        }
        float f = pointF.x;
        float f2 = this.pixelRatio;
        nativeSetZoom(d, f / f2, pointF.y / f2, j);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void updateMarker(Marker marker) {
        if (checkState("updateMarker")) {
            return;
        }
        LatLng position = marker.getPosition();
        nativeUpdateMarker(marker.getId(), position.latitude, position.longitude, marker.getIcon().getId());
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void updatePolygon(Polygon polygon) {
        if (checkState("updatePolygon")) {
            return;
        }
        nativeUpdatePolygon(polygon.getId(), polygon);
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMap
    public void updatePolyline(Polyline polyline) {
        if (checkState("updatePolyline")) {
            return;
        }
        nativeUpdatePolyline(polyline.getId(), polyline);
    }
}
