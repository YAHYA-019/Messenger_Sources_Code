package com.mapbox.mapboxsdk.maps;

import X.AnonymousClass001;
import X.DKC;
import X.JQz;
import X.KK2;
import X.KK3;
import X.KK5;
import X.KK6;
import X.LCT;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.MapStrictMode;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.PolygonOptions;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.location.LocationComponent;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.Style;
import com.mapbox.mapboxsdk.offline.OfflineRegionDefinition;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import java.util.Iterator;
import java.util.List;

/* loaded from: MapboxMap.class */
public final class MapboxMap {
    public static final String TAG = "Mbgl-MapboxMap";
    public AnnotationManager annotationManager;
    public final List awaitingStyleGetters = AnonymousClass001.A0s();
    public final CameraChangeDispatcher cameraChangeDispatcher;
    public boolean debugActive;
    public final List developerAnimationStartedListeners;
    public LocationComponent locationComponent;
    public final NativeMap nativeMapView;
    public OnFpsChangedListener onFpsChangedListener;
    public final OnGesturesManagerInteractionListener onGesturesManagerInteractionListener;
    public final Projection projection;
    public Style style;
    public Style.OnStyleLoaded styleLoadedCallback;
    public final Transform transform;
    public final UiSettings uiSettings;

    /* loaded from: MapboxMap$CancelableCallback.class */
    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    /* loaded from: MapboxMap$InfoWindowAdapter.class */
    public interface InfoWindowAdapter {
        View getInfoWindow(Marker marker);
    }

    /* loaded from: MapboxMap$OnCameraIdleListener.class */
    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    /* loaded from: MapboxMap$OnCameraMoveCanceledListener.class */
    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    /* loaded from: MapboxMap$OnCameraMoveListener.class */
    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    /* loaded from: MapboxMap$OnCameraMoveStartedListener.class */
    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 3;
        public static final int REASON_API_GESTURE = 1;
        public static final int REASON_DEVELOPER_ANIMATION = 2;

        void onCameraMoveStarted(int i);
    }

    /* loaded from: MapboxMap$OnCompassAnimationListener.class */
    public interface OnCompassAnimationListener {
        void onCompassAnimation();

        void onCompassAnimationFinished();
    }

    /* loaded from: MapboxMap$OnDeveloperAnimationListener.class */
    public interface OnDeveloperAnimationListener {
        void onDeveloperAnimationStarted();
    }

    /* loaded from: MapboxMap$OnFlingListener.class */
    public interface OnFlingListener {
        void onFling();
    }

    /* loaded from: MapboxMap$OnFpsChangedListener.class */
    public interface OnFpsChangedListener {
        void onFpsChanged(double d);
    }

    /* loaded from: MapboxMap$OnGesturesManagerInteractionListener.class */
    public interface OnGesturesManagerInteractionListener {
        void cancelAllVelocityAnimations();

        LCT getGesturesManager();

        void onAddFlingListener(OnFlingListener onFlingListener);

        void onAddMapClickListener(OnMapClickListener onMapClickListener);

        void onAddMapDoubleClickListener(OnMapDoubleClickListener onMapDoubleClickListener);

        void onAddMapLongClickListener(OnMapLongClickListener onMapLongClickListener);

        void onAddMoveListener(OnMoveListener onMoveListener);

        void onAddRotateListener(OnRotateListener onRotateListener);

        void onAddScaleListener(OnScaleListener onScaleListener);

        void onAddShoveListener(OnShoveListener onShoveListener);

        void onRemoveFlingListener(OnFlingListener onFlingListener);

        void onRemoveMapClickListener(OnMapClickListener onMapClickListener);

        void onRemoveMapDoubleClickListener(OnMapDoubleClickListener onMapDoubleClickListener);

        void onRemoveMapLongClickListener(OnMapLongClickListener onMapLongClickListener);

        void onRemoveMoveListener(OnMoveListener onMoveListener);

        void onRemoveRotateListener(OnRotateListener onRotateListener);

        void onRemoveScaleListener(OnScaleListener onScaleListener);

        void onRemoveShoveListener(OnShoveListener onShoveListener);

        void setGesturesManager(LCT lct, boolean z, boolean z2);
    }

    /* loaded from: MapboxMap$OnInfoWindowClickListener.class */
    public interface OnInfoWindowClickListener {
        boolean onInfoWindowClick(Marker marker);
    }

    /* loaded from: MapboxMap$OnInfoWindowCloseListener.class */
    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(Marker marker);
    }

    /* loaded from: MapboxMap$OnInfoWindowLongClickListener.class */
    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(Marker marker);
    }

    /* loaded from: MapboxMap$OnMapClickListener.class */
    public interface OnMapClickListener {
        boolean onMapClick(LatLng latLng);
    }

    /* loaded from: MapboxMap$OnMapDoubleClickListener.class */
    public interface OnMapDoubleClickListener {
        boolean onMapDoubleClick(LatLng latLng);
    }

    /* loaded from: MapboxMap$OnMapLongClickListener.class */
    public interface OnMapLongClickListener {
        boolean onMapLongClick(LatLng latLng);
    }

    /* loaded from: MapboxMap$OnMarkerClickListener.class */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    /* loaded from: MapboxMap$OnMoveListener.class */
    public interface OnMoveListener {
        void onMove(KK6 kk6);

        void onMoveBegin(KK6 kk6);

        void onMoveEnd(KK6 kk6);
    }

    /* loaded from: MapboxMap$OnPolygonClickListener.class */
    public interface OnPolygonClickListener {
        void onPolygonClick(Polygon polygon);
    }

    /* loaded from: MapboxMap$OnPolylineClickListener.class */
    public interface OnPolylineClickListener {
        void onPolylineClick(Polyline polyline);
    }

    /* loaded from: MapboxMap$OnRotateListener.class */
    public interface OnRotateListener {
        void onRotate(KK2 kk2);

        void onRotateBegin(KK2 kk2);

        void onRotateEnd(KK2 kk2);
    }

    /* loaded from: MapboxMap$OnScaleListener.class */
    public interface OnScaleListener {
        void onScale(KK5 kk5);

        void onScaleBegin(KK5 kk5);

        void onScaleEnd(KK5 kk5);
    }

    /* loaded from: MapboxMap$OnShoveListener.class */
    public interface OnShoveListener {
        void onShove(KK3 kk3);

        void onShoveBegin(KK3 kk3);

        void onShoveEnd(KK3 kk3);
    }

    /* loaded from: MapboxMap$SnapshotReadyCallback.class */
    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    public MapboxMap(NativeMap nativeMap, Transform transform, UiSettings uiSettings, Projection projection, OnGesturesManagerInteractionListener onGesturesManagerInteractionListener, CameraChangeDispatcher cameraChangeDispatcher, List list) {
        this.nativeMapView = nativeMap;
        this.uiSettings = uiSettings;
        this.projection = projection;
        this.transform = transform;
        this.onGesturesManagerInteractionListener = onGesturesManagerInteractionListener;
        this.cameraChangeDispatcher = cameraChangeDispatcher;
        this.developerAnimationStartedListeners = list;
    }

    private void notifyDeveloperAnimationListeners() {
        Iterator it = this.developerAnimationStartedListeners.iterator();
        while (it.hasNext()) {
            ((OnDeveloperAnimationListener) it.next()).onDeveloperAnimationStarted();
        }
    }

    private void setApiBaseUrl(MapboxMapOptions mapboxMapOptions) {
        String str = mapboxMapOptions.apiBaseUri;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.nativeMapView.setApiBaseUrl(str);
    }

    private void setPrefetchesTiles(MapboxMapOptions mapboxMapOptions) {
        setPrefetchesTiles(mapboxMapOptions.prefetchesTiles);
    }

    public Marker addMarker(BaseMarkerOptions baseMarkerOptions) {
        return this.annotationManager.addMarker(baseMarkerOptions, this);
    }

    public Marker addMarker(MarkerOptions markerOptions) {
        return this.annotationManager.addMarker(markerOptions, this);
    }

    public List addMarkers(List list) {
        return this.annotationManager.markers.addBy(list, this);
    }

    public void addOnCameraIdleListener(OnCameraIdleListener onCameraIdleListener) {
        this.cameraChangeDispatcher.addOnCameraIdleListener(onCameraIdleListener);
    }

    public void addOnCameraMoveCancelListener(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.cameraChangeDispatcher.addOnCameraMoveCancelListener(onCameraMoveCanceledListener);
    }

    public void addOnCameraMoveListener(OnCameraMoveListener onCameraMoveListener) {
        this.cameraChangeDispatcher.addOnCameraMoveListener(onCameraMoveListener);
    }

    public void addOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.cameraChangeDispatcher.addOnCameraMoveStartedListener(onCameraMoveStartedListener);
    }

    public void addOnFlingListener(OnFlingListener onFlingListener) {
        this.onGesturesManagerInteractionListener.onAddFlingListener(onFlingListener);
    }

    public void addOnMapClickListener(OnMapClickListener onMapClickListener) {
        this.onGesturesManagerInteractionListener.onAddMapClickListener(onMapClickListener);
    }

    public void addOnMapDoubleClickListener(OnMapDoubleClickListener onMapDoubleClickListener) {
        this.onGesturesManagerInteractionListener.onAddMapDoubleClickListener(onMapDoubleClickListener);
    }

    public void addOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        this.onGesturesManagerInteractionListener.onAddMapLongClickListener(onMapLongClickListener);
    }

    public void addOnMoveListener(OnMoveListener onMoveListener) {
        this.onGesturesManagerInteractionListener.onAddMoveListener(onMoveListener);
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.onGesturesManagerInteractionListener.onAddRotateListener(onRotateListener);
    }

    public void addOnScaleListener(OnScaleListener onScaleListener) {
        this.onGesturesManagerInteractionListener.onAddScaleListener(onScaleListener);
    }

    public void addOnShoveListener(OnShoveListener onShoveListener) {
        this.onGesturesManagerInteractionListener.onAddShoveListener(onShoveListener);
    }

    public Polygon addPolygon(PolygonOptions polygonOptions) {
        return this.annotationManager.addPolygon(polygonOptions, this);
    }

    public List addPolygons(List list) {
        return this.annotationManager.polygons.addBy(list, this);
    }

    public Polyline addPolyline(PolylineOptions polylineOptions) {
        return this.annotationManager.addPolyline(polylineOptions, this);
    }

    public List addPolylines(List list) {
        return this.annotationManager.polylines.addBy(list, this);
    }

    public final void animateCamera(CameraUpdate cameraUpdate) {
        animateCamera(cameraUpdate, 300, null);
    }

    public final void animateCamera(CameraUpdate cameraUpdate, int i) {
        animateCamera(cameraUpdate, i, null);
    }

    public final void animateCamera(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        if (i <= 0) {
            throw AnonymousClass001.A0L("Null duration passed into animateCamera");
        }
        notifyDeveloperAnimationListeners();
        this.transform.animateCamera(this, cameraUpdate, i, cancelableCallback);
    }

    public final void animateCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        animateCamera(cameraUpdate, 300, cancelableCallback);
    }

    public void cancelAllVelocityAnimations() {
        this.onGesturesManagerInteractionListener.cancelAllVelocityAnimations();
    }

    public void cancelTransitions() {
        this.transform.cancelTransitions();
    }

    public void clear() {
        this.annotationManager.removeAnnotations();
    }

    public void cycleDebugOptions() {
        this.nativeMapView.cycleDebugOptions();
        this.debugActive = this.nativeMapView.getDebug();
    }

    public void deselectMarker(Marker marker) {
        this.annotationManager.deselectMarker(marker);
    }

    public void deselectMarkers() {
        this.annotationManager.deselectMarkers();
    }

    public final void easeCamera(CameraUpdate cameraUpdate) {
        easeCamera(cameraUpdate, 300);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i) {
        easeCamera(cameraUpdate, i, (CancelableCallback) null);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        easeCamera(cameraUpdate, i, true, cancelableCallback);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i, boolean z) {
        easeCamera(cameraUpdate, i, z, null);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i, boolean z, CancelableCallback cancelableCallback) {
        if (i <= 0) {
            throw AnonymousClass001.A0L("Null duration passed into easeCamera");
        }
        notifyDeveloperAnimationListeners();
        this.transform.easeCamera(this, cameraUpdate, i, z, cancelableCallback);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        easeCamera(cameraUpdate, 300, cancelableCallback);
    }

    public Annotation getAnnotation(long j) {
        return this.annotationManager.getAnnotation(j);
    }

    public List getAnnotations() {
        return this.annotationManager.annotations.obtainAll();
    }

    public CameraPosition getCameraForGeometry(Geometry geometry) {
        return getCameraForGeometry(geometry, new int[]{0, 0, 0, 0});
    }

    public CameraPosition getCameraForGeometry(Geometry geometry, double d, double d2) {
        return getCameraForGeometry(geometry, new int[]{0, 0, 0, 0}, d, d2);
    }

    public CameraPosition getCameraForGeometry(Geometry geometry, int[] iArr) {
        return getCameraForGeometry(geometry, iArr, this.transform.getBearing(), this.transform.nativeMap.getPitch());
    }

    public CameraPosition getCameraForGeometry(Geometry geometry, int[] iArr, double d, double d2) {
        return this.nativeMapView.getCameraForGeometry(geometry, iArr, d, d2);
    }

    public CameraPosition getCameraForLatLngBounds(LatLngBounds latLngBounds) {
        return getCameraForLatLngBounds(latLngBounds, new int[]{0, 0, 0, 0});
    }

    public CameraPosition getCameraForLatLngBounds(LatLngBounds latLngBounds, double d, double d2) {
        return this.nativeMapView.getCameraForLatLngBounds(latLngBounds, new int[]{0, 0, 0, 0}, d, d2);
    }

    public CameraPosition getCameraForLatLngBounds(LatLngBounds latLngBounds, int[] iArr) {
        return this.nativeMapView.getCameraForLatLngBounds(latLngBounds, iArr, this.transform.nativeMap.getBearing(), this.transform.nativeMap.getPitch());
    }

    public CameraPosition getCameraForLatLngBounds(LatLngBounds latLngBounds, int[] iArr, double d, double d2) {
        return this.nativeMapView.getCameraForLatLngBounds(latLngBounds, iArr, d, d2);
    }

    public final CameraPosition getCameraPosition() {
        return JQz.A0Z(this);
    }

    public LCT getGesturesManager() {
        return this.onGesturesManagerInteractionListener.getGesturesManager();
    }

    public float getHeight() {
        return DKC.A03(this.projection.mapView);
    }

    public InfoWindowAdapter getInfoWindowAdapter() {
        return this.annotationManager.infoWindowManager.infoWindowAdapter;
    }

    public LocationComponent getLocationComponent() {
        return this.locationComponent;
    }

    public List getMarkers() {
        return this.annotationManager.markers.obtainAll();
    }

    public double getMaxZoomLevel() {
        return this.transform.nativeMap.getMaxZoom();
    }

    public double getMinZoomLevel() {
        return this.transform.nativeMap.getMinZoom();
    }

    public long getNativeMapPtr() {
        return this.nativeMapView.getNativePtr();
    }

    public OnFpsChangedListener getOnFpsChangedListener() {
        return this.onFpsChangedListener;
    }

    public OnInfoWindowClickListener getOnInfoWindowClickListener() {
        return this.annotationManager.infoWindowManager.onInfoWindowClickListener;
    }

    public OnInfoWindowCloseListener getOnInfoWindowCloseListener() {
        return this.annotationManager.infoWindowManager.onInfoWindowCloseListener;
    }

    public OnInfoWindowLongClickListener getOnInfoWindowLongClickListener() {
        return this.annotationManager.infoWindowManager.onInfoWindowLongClickListener;
    }

    public int[] getPadding() {
        return this.projection.contentPadding;
    }

    public List getPolygons() {
        return this.annotationManager.polygons.obtainAll();
    }

    public List getPolylines() {
        return this.annotationManager.polylines.obtainAll();
    }

    public boolean getPrefetchesTiles() {
        return this.nativeMapView.getPrefetchTiles();
    }

    public Projection getProjection() {
        return this.projection;
    }

    public List getSelectedMarkers() {
        return this.annotationManager.selectedMarkers;
    }

    public Style getStyle() {
        Style style = this.style;
        if (style == null || !style.fullyLoaded) {
            style = null;
        }
        return style;
    }

    public void getStyle(Style.OnStyleLoaded onStyleLoaded) {
        Style style = this.style;
        if (style == null || !style.fullyLoaded) {
            this.awaitingStyleGetters.add(onStyleLoaded);
        } else {
            onStyleLoaded.onStyleLoaded(style);
        }
    }

    public Transform getTransform() {
        return this.transform;
    }

    public UiSettings getUiSettings() {
        return this.uiSettings;
    }

    public float getWidth() {
        return DKC.A02(this.projection.mapView);
    }

    public void initialise(Context context, MapboxMapOptions mapboxMapOptions) {
        this.transform.initialise(this, mapboxMapOptions);
        this.uiSettings.initialise(context, mapboxMapOptions);
        setDebugActive(mapboxMapOptions.debugActive);
        setApiBaseUrl(mapboxMapOptions);
        setPrefetchesTiles(mapboxMapOptions);
    }

    public void injectAnnotationManager(AnnotationManager annotationManager) {
        annotationManager.mapboxMap = this;
        this.annotationManager = annotationManager;
    }

    public void injectLocationComponent(LocationComponent locationComponent) {
        this.locationComponent = locationComponent;
    }

    public boolean isAllowConcurrentMultipleOpenInfoWindows() {
        return this.annotationManager.infoWindowManager.allowConcurrentMultipleInfoWindows;
    }

    public boolean isDebugActive() {
        return this.debugActive;
    }

    public final void moveCamera(CameraUpdate cameraUpdate) {
        moveCamera(cameraUpdate, null);
    }

    public final void moveCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        notifyDeveloperAnimationListeners();
        this.transform.moveCamera(this, cameraUpdate, cancelableCallback);
    }

    public void notifyStyleLoaded() {
        if (this.nativeMapView.isDestroyed()) {
            return;
        }
        Style style = this.style;
        if (style != null) {
            style.onDidFinishLoadingStyle();
            this.locationComponent.onFinishLoadingStyle();
            Style.OnStyleLoaded onStyleLoaded = this.styleLoadedCallback;
            if (onStyleLoaded != null) {
                onStyleLoaded.onStyleLoaded(this.style);
            }
            Iterator it = this.awaitingStyleGetters.iterator();
            while (it.hasNext()) {
                ((Style.OnStyleLoaded) it.next()).onStyleLoaded(this.style);
            }
        } else {
            MapStrictMode.strictModeViolation("No style to provide.");
        }
        this.styleLoadedCallback = null;
        this.awaitingStyleGetters.clear();
    }

    public void onDestroy() {
        Style style = this.style;
        if (style != null) {
            style.clear();
        }
        this.cameraChangeDispatcher.onDestroy();
    }

    public void onFailLoadingStyle() {
        this.styleLoadedCallback = null;
    }

    public void onFinishLoadingStyle() {
        notifyStyleLoaded();
    }

    public void onPostMapReady() {
        this.transform.invalidateCameraPosition();
    }

    public void onPreMapReady() {
        this.transform.invalidateCameraPosition();
        this.annotationManager.reloadMarkers();
        this.annotationManager.adjustTopOffsetPixels(this);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        CameraPosition cameraPosition = (CameraPosition) bundle.getParcelable(MapboxConstants.STATE_CAMERA_POSITION);
        this.uiSettings.onRestoreInstanceState(bundle);
        if (cameraPosition != null) {
            moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(cameraPosition).build()), null);
        }
        this.nativeMapView.setDebug(bundle.getBoolean(MapboxConstants.STATE_DEBUG_ACTIVE));
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable(MapboxConstants.STATE_CAMERA_POSITION, JQz.A0Z(this));
        bundle.putBoolean(MapboxConstants.STATE_DEBUG_ACTIVE, this.debugActive);
        this.uiSettings.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.locationComponent.onStart();
    }

    public void onStop() {
        this.locationComponent.onStop();
    }

    public void onUpdateFullyRendered() {
        CameraPosition invalidateCameraPosition = this.transform.invalidateCameraPosition();
        if (invalidateCameraPosition != null) {
            this.uiSettings.update(invalidateCameraPosition);
        }
    }

    public void onUpdateRegionChange() {
        this.annotationManager.update();
    }

    public List queryRenderedFeatures(PointF pointF, Expression expression, String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(pointF, strArr, expression);
    }

    public List queryRenderedFeatures(PointF pointF, String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(pointF, strArr, (Expression) null);
    }

    public List queryRenderedFeatures(RectF rectF, Expression expression, String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(rectF, strArr, expression);
    }

    public List queryRenderedFeatures(RectF rectF, String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(rectF, strArr, (Expression) null);
    }

    public void removeAnnotation(long j) {
        this.annotationManager.removeAnnotation(j);
    }

    public void removeAnnotation(Annotation annotation) {
        this.annotationManager.removeAnnotation(annotation);
    }

    public void removeAnnotations() {
        this.annotationManager.removeAnnotations();
    }

    public void removeAnnotations(List list) {
        this.annotationManager.removeAnnotations(list);
    }

    public void removeMarker(Marker marker) {
        this.annotationManager.removeAnnotation((Annotation) marker);
    }

    public void removeOnCameraIdleListener(OnCameraIdleListener onCameraIdleListener) {
        this.cameraChangeDispatcher.removeOnCameraIdleListener(onCameraIdleListener);
    }

    public void removeOnCameraMoveCancelListener(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.cameraChangeDispatcher.removeOnCameraMoveCancelListener(onCameraMoveCanceledListener);
    }

    public void removeOnCameraMoveListener(OnCameraMoveListener onCameraMoveListener) {
        this.cameraChangeDispatcher.removeOnCameraMoveListener(onCameraMoveListener);
    }

    public void removeOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.cameraChangeDispatcher.removeOnCameraMoveStartedListener(onCameraMoveStartedListener);
    }

    public void removeOnFlingListener(OnFlingListener onFlingListener) {
        this.onGesturesManagerInteractionListener.onRemoveFlingListener(onFlingListener);
    }

    public void removeOnMapClickListener(OnMapClickListener onMapClickListener) {
        this.onGesturesManagerInteractionListener.onRemoveMapClickListener(onMapClickListener);
    }

    public void removeOnMapDoubleClickListener(OnMapDoubleClickListener onMapDoubleClickListener) {
        this.onGesturesManagerInteractionListener.onRemoveMapDoubleClickListener(onMapDoubleClickListener);
    }

    public void removeOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        this.onGesturesManagerInteractionListener.onRemoveMapLongClickListener(onMapLongClickListener);
    }

    public void removeOnMoveListener(OnMoveListener onMoveListener) {
        this.onGesturesManagerInteractionListener.onRemoveMoveListener(onMoveListener);
    }

    public void removeOnRotateListener(OnRotateListener onRotateListener) {
        this.onGesturesManagerInteractionListener.onRemoveRotateListener(onRotateListener);
    }

    public void removeOnScaleListener(OnScaleListener onScaleListener) {
        this.onGesturesManagerInteractionListener.onRemoveScaleListener(onScaleListener);
    }

    public void removeOnShoveListener(OnShoveListener onShoveListener) {
        this.onGesturesManagerInteractionListener.onRemoveShoveListener(onShoveListener);
    }

    public void removePolygon(Polygon polygon) {
        this.annotationManager.removeAnnotation((Annotation) polygon);
    }

    public void removePolyline(Polyline polyline) {
        this.annotationManager.removeAnnotation((Annotation) polyline);
    }

    public void resetNorth() {
        notifyDeveloperAnimationListeners();
        this.transform.resetNorth();
    }

    public void scrollBy(float f, float f2) {
        scrollBy(f, f2, 0L);
    }

    public void scrollBy(float f, float f2, long j) {
        notifyDeveloperAnimationListeners();
        this.nativeMapView.moveBy(f, f2, j);
    }

    public void selectMarker(Marker marker) {
        if (marker == null) {
            Logger.w(TAG, "marker was null, so just returning");
        } else {
            this.annotationManager.selectMarker(marker);
        }
    }

    public void setAllowConcurrentMultipleOpenInfoWindows(boolean z) {
        this.annotationManager.infoWindowManager.allowConcurrentMultipleInfoWindows = z;
    }

    public void setCameraPosition(CameraPosition cameraPosition) {
        moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), null);
    }

    public void setDebugActive(boolean z) {
        this.debugActive = z;
        this.nativeMapView.setDebug(z);
    }

    public void setFocalBearing(double d, float f, float f2, long j) {
        notifyDeveloperAnimationListeners();
        this.transform.setBearing(d, f, f2, j);
    }

    public void setGesturesManager(LCT lct, boolean z, boolean z2) {
        this.onGesturesManagerInteractionListener.setGesturesManager(lct, z, z2);
    }

    public void setInfoWindowAdapter(InfoWindowAdapter infoWindowAdapter) {
        this.annotationManager.infoWindowManager.infoWindowAdapter = infoWindowAdapter;
    }

    public void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.nativeMapView.setLatLngBounds(latLngBounds);
    }

    public void setMaxZoomPreference(double d) {
        this.transform.setMaxZoom(d);
    }

    public void setMinZoomPreference(double d) {
        this.transform.setMinZoom(d);
    }

    public void setOfflineRegionDefinition(OfflineRegionDefinition offlineRegionDefinition) {
        setOfflineRegionDefinition(offlineRegionDefinition, null);
    }

    public void setOfflineRegionDefinition(OfflineRegionDefinition offlineRegionDefinition, Style.OnStyleLoaded onStyleLoaded) {
        double minZoom = offlineRegionDefinition.getMinZoom();
        double maxZoom = offlineRegionDefinition.getMaxZoom();
        moveCamera(new CameraUpdateFactory.CameraPositionUpdate(-1.0d, offlineRegionDefinition.getBounds().getCenter(), -1.0d, minZoom), null);
        setMinZoomPreference(minZoom);
        setMaxZoomPreference(maxZoom);
        Style.Builder builder = new Style.Builder();
        builder.styleUri = offlineRegionDefinition.getStyleURL();
        setStyle(builder, onStyleLoaded);
    }

    public void setOnFpsChangedListener(OnFpsChangedListener onFpsChangedListener) {
        this.onFpsChangedListener = onFpsChangedListener;
        this.nativeMapView.setOnFpsChangedListener(onFpsChangedListener);
    }

    public void setOnInfoWindowClickListener(OnInfoWindowClickListener onInfoWindowClickListener) {
        this.annotationManager.infoWindowManager.onInfoWindowClickListener = onInfoWindowClickListener;
    }

    public void setOnInfoWindowCloseListener(OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.annotationManager.infoWindowManager.onInfoWindowCloseListener = onInfoWindowCloseListener;
    }

    public void setOnInfoWindowLongClickListener(OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.annotationManager.infoWindowManager.onInfoWindowLongClickListener = onInfoWindowLongClickListener;
    }

    public void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        this.annotationManager.onMarkerClickListener = onMarkerClickListener;
    }

    public void setOnPolygonClickListener(OnPolygonClickListener onPolygonClickListener) {
        this.annotationManager.onPolygonClickListener = onPolygonClickListener;
    }

    public void setOnPolylineClickListener(OnPolylineClickListener onPolylineClickListener) {
        this.annotationManager.onPolylineClickListener = onPolylineClickListener;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.projection.setContentPadding(new int[]{i, i2, i3, i4});
        this.uiSettings.invalidate();
    }

    public void setPrefetchesTiles(boolean z) {
        this.nativeMapView.setPrefetchTiles(z);
    }

    public void setStyle(Style.Builder builder) {
        setStyle(builder, (Style.OnStyleLoaded) null);
    }

    public void setStyle(Style.Builder builder, Style.OnStyleLoaded onStyleLoaded) {
        this.styleLoadedCallback = onStyleLoaded;
        this.locationComponent.onStartLoadingMap();
        Style style = this.style;
        if (style != null) {
            style.clear();
        }
        this.style = new Style(builder, this.nativeMapView);
        if (!TextUtils.isEmpty(builder.styleUri)) {
            this.nativeMapView.setStyleUri(builder.styleUri);
        } else {
            this.nativeMapView.setStyleJson(!TextUtils.isEmpty(builder.styleJson) ? builder.styleJson : "{}");
        }
    }

    public void setStyle(String str) {
        setStyle(str, (Style.OnStyleLoaded) null);
    }

    public void setStyle(String str, Style.OnStyleLoaded onStyleLoaded) {
        Style.Builder builder = new Style.Builder();
        builder.styleUri = str;
        setStyle(builder, onStyleLoaded);
    }

    public void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
        this.nativeMapView.addSnapshotCallback(snapshotReadyCallback);
    }

    public void updateMarker(Marker marker) {
        this.annotationManager.updateMarker(marker, this);
    }

    public void updatePolygon(Polygon polygon) {
        this.annotationManager.updatePolygon(polygon);
    }

    public void updatePolyline(Polyline polyline) {
        this.annotationManager.updatePolyline(polyline);
    }
}
