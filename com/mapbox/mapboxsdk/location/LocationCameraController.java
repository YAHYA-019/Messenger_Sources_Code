package com.mapbox.mapboxsdk.location;

import X.AnonymousClass001;
import X.JQz;
import X.JR0;
import X.KK2;
import X.KK6;
import X.KK8;
import X.LCT;
import android.content.Context;
import android.location.Location;
import android.view.MotionEvent;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.MapboxAnimator;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Transform;
import java.util.HashSet;
import java.util.Set;

/* loaded from: LocationCameraController.class */
public final class LocationCameraController {
    public boolean adjustFocalPoint;
    public int cameraMode;
    public final LCT initialGesturesManager;
    public final OnCameraTrackingChangedListener internalCameraTrackingChangedListener;
    public final LCT internalGesturesManager;
    public boolean isTransitioning;
    public final MapboxMap mapboxMap;
    public final KK6 moveGestureDetector;
    public final OnCameraMoveInvalidateListener onCameraMoveInvalidateListener;
    public LocationComponentOptions options;
    public final Transform transform;
    public final MapboxAnimator.AnimationsValueChangeListener latLngValueListener = new MapboxAnimator.AnimationsValueChangeListener() { // from class: com.mapbox.mapboxsdk.location.LocationCameraController.2
        @Override // com.mapbox.mapboxsdk.location.MapboxAnimator.AnimationsValueChangeListener
        public void onNewAnimationValue(LatLng latLng) {
            LocationCameraController.this.setLatLng(latLng);
        }
    };
    public final MapboxAnimator.AnimationsValueChangeListener gpsBearingValueListener = new MapboxAnimator.AnimationsValueChangeListener() { // from class: com.mapbox.mapboxsdk.location.LocationCameraController.3
        @Override // com.mapbox.mapboxsdk.location.MapboxAnimator.AnimationsValueChangeListener
        public void onNewAnimationValue(Float f) {
            LocationCameraController locationCameraController = LocationCameraController.this;
            if (locationCameraController.cameraMode == 36 && JQz.A0Z(locationCameraController.mapboxMap).bearing == 0.0d) {
                return;
            }
            LocationCameraController.this.setBearing(f.floatValue());
        }
    };
    public final MapboxAnimator.AnimationsValueChangeListener compassBearingValueListener = new MapboxAnimator.AnimationsValueChangeListener() { // from class: com.mapbox.mapboxsdk.location.LocationCameraController.4
        @Override // com.mapbox.mapboxsdk.location.MapboxAnimator.AnimationsValueChangeListener
        public void onNewAnimationValue(Float f) {
            LocationCameraController locationCameraController = LocationCameraController.this;
            int i = locationCameraController.cameraMode;
            if (i == 32 || i == 16) {
                locationCameraController.setBearing(f.floatValue());
            }
        }
    };
    public final MapboxAnimator.AnimationsValueChangeListener zoomValueListener = new MapboxAnimator.AnimationsValueChangeListener() { // from class: com.mapbox.mapboxsdk.location.LocationCameraController.5
        @Override // com.mapbox.mapboxsdk.location.MapboxAnimator.AnimationsValueChangeListener
        public void onNewAnimationValue(Float f) {
            LocationCameraController.this.setZoom(f.floatValue());
        }
    };
    public final MapboxAnimator.AnimationsValueChangeListener tiltValueListener = new MapboxAnimator.AnimationsValueChangeListener() { // from class: com.mapbox.mapboxsdk.location.LocationCameraController.6
        @Override // com.mapbox.mapboxsdk.location.MapboxAnimator.AnimationsValueChangeListener
        public void onNewAnimationValue(Float f) {
            LocationCameraController.this.setTilt(f.floatValue());
        }
    };
    public MapboxMap.OnMoveListener onMoveListener = new MapboxMap.OnMoveListener() { // from class: com.mapbox.mapboxsdk.location.LocationCameraController.7
        public boolean interrupt;

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnMoveListener
        public void onMove(KK6 kk6) {
            if (!this.interrupt) {
                LocationCameraController locationCameraController = LocationCameraController.this;
                if (!locationCameraController.isLocationTracking() && !locationCameraController.isBearingTracking()) {
                    return;
                } else {
                    locationCameraController.setCameraMode(8);
                }
            }
            kk6.A09();
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnMoveListener
        public void onMoveBegin(KK6 kk6) {
            if (LocationCameraController.this.options.trackingGesturesManagement && ((KK8) kk6).A04.size() > 1) {
                float f = kk6.A00;
                LocationCameraController locationCameraController = LocationCameraController.this;
                float f2 = locationCameraController.options.trackingMultiFingerMoveThreshold;
                if (f != f2 && locationCameraController.isLocationTracking()) {
                    kk6.A00 = f2;
                    this.interrupt = true;
                    return;
                }
            }
            LocationCameraController.this.setCameraMode(8);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnMoveListener
        public void onMoveEnd(KK6 kk6) {
            LocationCameraController locationCameraController = LocationCameraController.this;
            LocationComponentOptions locationComponentOptions = locationCameraController.options;
            if (locationComponentOptions.trackingGesturesManagement && !this.interrupt && locationCameraController.isLocationTracking()) {
                kk6.A00 = locationComponentOptions.trackingInitialMoveThreshold;
            }
            this.interrupt = false;
        }
    };
    public MapboxMap.OnRotateListener onRotateListener = new MapboxMap.OnRotateListener() { // from class: com.mapbox.mapboxsdk.location.LocationCameraController.8
        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnRotateListener
        public void onRotate(KK2 kk2) {
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnRotateListener
        public void onRotateBegin(KK2 kk2) {
            LocationCameraController locationCameraController = LocationCameraController.this;
            if (locationCameraController.isBearingTracking()) {
                locationCameraController.setCameraMode(8);
            }
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnRotateListener
        public void onRotateEnd(KK2 kk2) {
        }
    };
    public MapboxMap.OnFlingListener onFlingListener = new MapboxMap.OnFlingListener() { // from class: com.mapbox.mapboxsdk.location.LocationCameraController.9
        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnFlingListener
        public void onFling() {
            LocationCameraController.this.setCameraMode(8);
        }
    };

    /* loaded from: LocationCameraController$LocationGesturesManager.class */
    public class LocationGesturesManager extends LCT {
        public LocationGesturesManager(Context context) {
            super(context, true);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null && motionEvent.getActionMasked() == 1) {
                LocationCameraController.this.adjustGesturesThresholds();
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public LocationCameraController(Context context, MapboxMap mapboxMap, Transform transform, OnCameraTrackingChangedListener onCameraTrackingChangedListener, LocationComponentOptions locationComponentOptions, OnCameraMoveInvalidateListener onCameraMoveInvalidateListener) {
        this.mapboxMap = mapboxMap;
        this.transform = transform;
        this.initialGesturesManager = mapboxMap.onGesturesManagerInteractionListener.getGesturesManager();
        LocationGesturesManager locationGesturesManager = new LocationGesturesManager(context);
        this.internalGesturesManager = locationGesturesManager;
        this.moveGestureDetector = ((LCT) locationGesturesManager).moveGestureDetector;
        mapboxMap.addOnRotateListener(this.onRotateListener);
        mapboxMap.addOnFlingListener(this.onFlingListener);
        mapboxMap.addOnMoveListener(this.onMoveListener);
        this.internalCameraTrackingChangedListener = onCameraTrackingChangedListener;
        this.onCameraMoveInvalidateListener = onCameraMoveInvalidateListener;
        initializeOptions(locationComponentOptions);
    }

    public LocationCameraController(MapboxMap mapboxMap, Transform transform, KK6 kk6, OnCameraTrackingChangedListener onCameraTrackingChangedListener, OnCameraMoveInvalidateListener onCameraMoveInvalidateListener, LCT lct, LCT lct2) {
        this.mapboxMap = mapboxMap;
        this.transform = transform;
        this.moveGestureDetector = kk6;
        this.internalCameraTrackingChangedListener = onCameraTrackingChangedListener;
        this.onCameraMoveInvalidateListener = onCameraMoveInvalidateListener;
        this.internalGesturesManager = lct2;
        this.initialGesturesManager = lct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustGesturesThresholds() {
        KK6 kk6;
        float f;
        LocationComponentOptions locationComponentOptions = this.options;
        if (locationComponentOptions.trackingGesturesManagement) {
            if (isLocationTracking()) {
                this.adjustFocalPoint = true;
                kk6 = this.moveGestureDetector;
                f = locationComponentOptions.trackingInitialMoveThreshold;
            } else {
                kk6 = this.moveGestureDetector;
                f = 0.0f;
            }
            kk6.A00 = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r0 == 36) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isBearingTracking() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.cameraMode
            r302 = r0
            r0 = 16
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2f
            r0 = 32
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2f
            r0 = 22
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2f
            r0 = 34
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2f
            r0 = 36
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L31
        L2f:
            r0 = 1
            r303 = r0
        L31:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.location.LocationCameraController.isBearingTracking():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r0 == 22) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isLocationBearingTracking() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.cameraMode
            r302 = r0
            r0 = 34
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1f
            r0 = 36
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1f
            r0 = 22
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L21
        L1f:
            r0 = 1
            r303 = r0
        L21:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.location.LocationCameraController.isLocationBearingTracking():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r0 == 36) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isLocationTracking() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.cameraMode
            r302 = r0
            r0 = 24
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L27
            r0 = 32
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L27
            r0 = 34
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L27
            r0 = 36
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L29
        L27:
            r0 = 1
            r303 = r0
        L29:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.location.LocationCameraController.isLocationTracking():boolean");
    }

    private void notifyCameraTrackingChangeListener(boolean z) {
        this.internalCameraTrackingChangedListener.onCameraTrackingChanged(this.cameraMode);
        if (!z || isLocationTracking()) {
            return;
        }
        this.mapboxMap.uiSettings.setFocalPoint(null);
        this.internalCameraTrackingChangedListener.onCameraTrackingDismissed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBearing(float f) {
        if (this.isTransitioning) {
            return;
        }
        this.transform.moveCamera(this.mapboxMap, CameraUpdateFactory.bearingTo(f), null);
        this.onCameraMoveInvalidateListener.onInvalidateCameraMove();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatLng(LatLng latLng) {
        if (this.isTransitioning) {
            return;
        }
        this.transform.moveCamera(this.mapboxMap, CameraUpdateFactory.newLatLng(latLng), null);
        this.onCameraMoveInvalidateListener.onInvalidateCameraMove();
        if (this.adjustFocalPoint) {
            this.mapboxMap.uiSettings.setFocalPoint(this.mapboxMap.projection.nativeMapView.pixelForLatLng(latLng));
            this.adjustFocalPoint = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTilt(float f) {
        if (this.isTransitioning) {
            return;
        }
        this.transform.moveCamera(this.mapboxMap, CameraUpdateFactory.tiltTo(f), null);
        this.onCameraMoveInvalidateListener.onInvalidateCameraMove();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoom(float f) {
        if (this.isTransitioning) {
            return;
        }
        this.transform.moveCamera(this.mapboxMap, new CameraUpdateFactory.ZoomUpdate(3, f), null);
        this.onCameraMoveInvalidateListener.onInvalidateCameraMove();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void transitionToCurrentLocation(boolean r302, android.location.Location r303, long r304, java.lang.Double r306, java.lang.Double r307, java.lang.Double r308, final com.mapbox.mapboxsdk.location.OnLocationCameraTransitionListener r309) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.location.LocationCameraController.transitionToCurrentLocation(boolean, android.location.Location, long, java.lang.Double, java.lang.Double, java.lang.Double, com.mapbox.mapboxsdk.location.OnLocationCameraTransitionListener):void");
    }

    public Set getAnimationListeners() {
        HashSet A0v = AnonymousClass001.A0v();
        if (isLocationTracking()) {
            JR0.A1A(this.latLngValueListener, A0v, 1);
        }
        if (isLocationBearingTracking()) {
            JR0.A1A(this.gpsBearingValueListener, A0v, 4);
        }
        if (isConsumingCompass()) {
            JR0.A1A(this.compassBearingValueListener, A0v, 5);
        }
        JR0.A1A(this.zoomValueListener, A0v, 7);
        JR0.A1A(this.tiltValueListener, A0v, 8);
        return A0v;
    }

    public int getCameraMode() {
        return this.cameraMode;
    }

    public void initializeOptions(LocationComponentOptions locationComponentOptions) {
        this.options = locationComponentOptions;
        boolean z = locationComponentOptions.trackingGesturesManagement;
        LCT gesturesManager = this.mapboxMap.onGesturesManagerInteractionListener.getGesturesManager();
        if (z) {
            LCT lct = this.internalGesturesManager;
            if (gesturesManager != lct) {
                this.mapboxMap.setGesturesManager(lct, true, true);
            }
            adjustGesturesThresholds();
            return;
        }
        LCT lct2 = this.initialGesturesManager;
        if (gesturesManager != lct2) {
            this.mapboxMap.setGesturesManager(lct2, true, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0 == 16) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isConsumingCompass() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.cameraMode
            r302 = r0
            r0 = 32
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L17
            r0 = 16
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L19
        L17:
            r0 = 1
            r303 = r0
        L19:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.location.LocationCameraController.isConsumingCompass():boolean");
    }

    public boolean isTransitioning() {
        return this.isTransitioning;
    }

    public void setCameraMode(int i) {
        setCameraMode(i, null, 750L, null, null, null, null);
    }

    public void setCameraMode(int i, Location location, long j, Double d, Double d2, Double d3, OnLocationCameraTransitionListener onLocationCameraTransitionListener) {
        boolean isLocationTracking = isLocationTracking();
        this.cameraMode = i;
        if (i != 8) {
            this.mapboxMap.cancelTransitions();
        }
        adjustGesturesThresholds();
        notifyCameraTrackingChangeListener(isLocationTracking);
        transitionToCurrentLocation(isLocationTracking, location, j, d, d2, d3, onLocationCameraTransitionListener);
    }
}
