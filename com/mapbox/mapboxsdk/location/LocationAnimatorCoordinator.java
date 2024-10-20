package com.mapbox.mapboxsdk.location;

import X.7zM;
import X.AnonymousClass001;
import X.DKC;
import X.GOn;
import X.JR0;
import android.animation.ValueAnimator;
import android.location.Location;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.animation.LinearInterpolator;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.MapboxAnimator;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Projection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: LocationAnimatorCoordinator.class */
public final class LocationAnimatorCoordinator {
    public static final String TAG = "Mbgl-LocationAnimatorCoordinator";
    public boolean accuracyAnimationEnabled;
    public final MapboxAnimatorProvider animatorProvider;
    public final MapboxAnimatorSetProvider animatorSetProvider;
    public boolean compassAnimationEnabled;
    public float durationMultiplier;
    public Location previousLocation;
    public final Projection projection;
    public final SparseArray animatorArray = DKC.A0E();
    public float previousAccuracyRadius = -1.0f;
    public float previousCompassBearing = -1.0f;
    public long locationUpdateTimestamp = -1;
    public int maxAnimationFps = (-1) >>> 1;
    public final SparseArray listeners = DKC.A0E();

    public LocationAnimatorCoordinator(Projection projection, MapboxAnimatorSetProvider mapboxAnimatorSetProvider, MapboxAnimatorProvider mapboxAnimatorProvider) {
        this.projection = projection;
        this.animatorProvider = mapboxAnimatorProvider;
        this.animatorSetProvider = mapboxAnimatorSetProvider;
    }

    private void cancelAnimator(int i) {
        ValueAnimator valueAnimator = (ValueAnimator) this.animatorArray.get(i);
        if (valueAnimator != null) {
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            this.animatorArray.put(i, null);
        }
    }

    private float checkGpsNorth(boolean z, float f) {
        if (z) {
            f = 0.0f;
        }
        return f;
    }

    private void createNewCameraAdapterAnimator(int i, float f, float f2, MapboxMap.CancelableCallback cancelableCallback) {
        cancelAnimator(i);
        MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener = (MapboxAnimator.AnimationsValueChangeListener) this.listeners.get(i);
        if (animationsValueChangeListener != null) {
            this.animatorArray.put(i, new MapboxCameraAnimatorAdapter(Float.valueOf(f), Float.valueOf(f2), animationsValueChangeListener, cancelableCallback));
        }
    }

    private void createNewFloatAnimator(int i, float f, float f2) {
        cancelAnimator(i);
        MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener = (MapboxAnimator.AnimationsValueChangeListener) this.listeners.get(i);
        if (animationsValueChangeListener != null) {
            this.animatorArray.put(i, new MapboxAnimator(Float.valueOf(f), Float.valueOf(f2), animationsValueChangeListener, this.maxAnimationFps));
        }
    }

    private void createNewLatLngAnimator(int i, LatLng latLng, LatLng latLng2) {
        cancelAnimator(i);
        MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener = (MapboxAnimator.AnimationsValueChangeListener) this.listeners.get(i);
        if (animationsValueChangeListener != null) {
            this.animatorArray.put(i, new MapboxAnimator(latLng, latLng2, animationsValueChangeListener, this.maxAnimationFps));
        }
    }

    private long getAnimationDuration() {
        long j = this.locationUpdateTimestamp;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.locationUpdateTimestamp = elapsedRealtime;
        long j2 = 0;
        if (j != 0) {
            j2 = ((float) (elapsedRealtime - j)) * this.durationMultiplier;
        }
        return Math.min(j2, 2000L);
    }

    private float getPreviousAccuracyRadius() {
        ValueAnimator valueAnimator = (ValueAnimator) this.animatorArray.get(6);
        return valueAnimator != null ? JR0.A01(valueAnimator) : this.previousAccuracyRadius;
    }

    private float getPreviousLayerCompassBearing() {
        ValueAnimator valueAnimator = (ValueAnimator) this.animatorArray.get(3);
        return valueAnimator != null ? JR0.A01(valueAnimator) : this.previousCompassBearing;
    }

    private float getPreviousLayerGpsBearing() {
        ValueAnimator valueAnimator = (ValueAnimator) this.animatorArray.get(2);
        return valueAnimator != null ? JR0.A01(valueAnimator) : this.previousLocation.getBearing();
    }

    private LatLng getPreviousLayerLatLng() {
        ValueAnimator valueAnimator = (ValueAnimator) this.animatorArray.get(0);
        return valueAnimator != null ? (LatLng) valueAnimator.getAnimatedValue() : new LatLng(this.previousLocation);
    }

    private void playAnimators(long j, int... iArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                this.animatorSetProvider.startAnimation(A0s, new LinearInterpolator(), j);
                return;
            }
            Object obj = this.animatorArray.get(iArr[i2]);
            if (obj != null) {
                A0s.add(obj);
            }
            i = i2 + 1;
        }
    }

    private void resetCameraCompassAnimation(CameraPosition cameraPosition) {
        MapboxAnimator mapboxAnimator = (MapboxAnimator) this.animatorArray.get(5);
        if (mapboxAnimator != null) {
            float A00 = 7zM.A00(mapboxAnimator.target);
            float f = (float) cameraPosition.bearing;
            createNewFloatAnimator(5, f, Utils.shortestRotation(A00, f));
        }
    }

    private void resetCameraGpsBearingAnimation(CameraPosition cameraPosition, boolean z) {
        MapboxAnimator mapboxAnimator = (MapboxAnimator) this.animatorArray.get(4);
        if (mapboxAnimator != null) {
            float A00 = 7zM.A00(mapboxAnimator.target);
            if (z) {
                A00 = 0.0f;
            }
            float f = (float) cameraPosition.bearing;
            createNewFloatAnimator(4, f, Utils.shortestRotation(A00, f));
        }
    }

    private boolean resetCameraLatLngAnimation(CameraPosition cameraPosition) {
        MapboxAnimator mapboxAnimator = (MapboxAnimator) this.animatorArray.get(1);
        if (mapboxAnimator == null) {
            return false;
        }
        LatLng latLng = (LatLng) mapboxAnimator.target;
        LatLng latLng2 = cameraPosition.target;
        createNewLatLngAnimator(1, latLng2, latLng);
        return Utils.immediateAnimation(this.projection, latLng2, latLng);
    }

    private boolean resetCameraLocationAnimations(CameraPosition cameraPosition, boolean z) {
        resetCameraGpsBearingAnimation(cameraPosition, z);
        return resetCameraLatLngAnimation(cameraPosition);
    }

    private void updateAccuracyAnimators(float f, float f2) {
        createNewFloatAnimator(6, f2, f);
    }

    private void updateCameraAnimators(LatLng latLng, float f, LatLng latLng2, float f2) {
        createNewLatLngAnimator(1, latLng, latLng2);
        createNewFloatAnimator(4, f, Utils.shortestRotation(f2, f));
    }

    private void updateCompassAnimators(float f, float f2, float f3) {
        createNewFloatAnimator(3, f2, Utils.shortestRotation(f, f2));
        createNewFloatAnimator(5, f3, Utils.shortestRotation(f, f3));
    }

    private void updateLayerAnimators(LatLng latLng, LatLng latLng2, float f, float f2) {
        createNewLatLngAnimator(0, latLng, latLng2);
        float f3 = ((f % 360.0f) + 360.0f) % 360.0f;
        createNewFloatAnimator(2, f3, Utils.shortestRotation(f2, f3));
    }

    private void updateTiltAnimator(float f, float f2, MapboxMap.CancelableCallback cancelableCallback) {
        createNewCameraAdapterAnimator(8, f2, f, cancelableCallback);
    }

    private void updateZoomAnimator(float f, float f2, MapboxMap.CancelableCallback cancelableCallback) {
        createNewCameraAdapterAnimator(7, f2, f, cancelableCallback);
    }

    public void cancelAllAnimations() {
        int i = 0;
        while (true) {
            int i2 = i;
            SparseArray sparseArray = this.animatorArray;
            if (i2 >= sparseArray.size()) {
                return;
            }
            cancelAnimator(sparseArray.keyAt(i2));
            i = i2 + 1;
        }
    }

    public void cancelTiltAnimation() {
        cancelAnimator(8);
    }

    public void cancelZoomAnimation() {
        cancelAnimator(7);
    }

    public void feedNewAccuracyRadius(float f, boolean z) {
        if (this.previousAccuracyRadius < 0.0f) {
            this.previousAccuracyRadius = f;
        }
        updateAccuracyAnimators(f, getPreviousAccuracyRadius());
        playAnimators((z || !this.accuracyAnimationEnabled) ? 0L : 250L, 6);
        this.previousAccuracyRadius = f;
    }

    public void feedNewCompassBearing(float f, CameraPosition cameraPosition) {
        if (this.previousCompassBearing < 0.0f) {
            this.previousCompassBearing = f;
        }
        updateCompassAnimators(f, getPreviousLayerCompassBearing(), (float) cameraPosition.bearing);
        long j = this.compassAnimationEnabled ? 500L : 0L;
        int[] A1b = GOn.A1b();
        A1b[0] = 3;
        A1b[1] = 5;
        playAnimators(j, A1b);
        this.previousCompassBearing = f;
    }

    public void feedNewLocation(Location location, CameraPosition cameraPosition, boolean z) {
        if (this.previousLocation == null) {
            this.previousLocation = location;
            this.locationUpdateTimestamp = SystemClock.elapsedRealtime() - 750;
        }
        LatLng previousLayerLatLng = getPreviousLayerLatLng();
        float previousLayerGpsBearing = getPreviousLayerGpsBearing();
        LatLng latLng = cameraPosition.target;
        float f = (float) cameraPosition.bearing;
        LatLng latLng2 = new LatLng(location);
        float bearing = location.getBearing();
        float bearing2 = location.getBearing();
        if (z) {
            bearing2 = 0.0f;
        }
        updateLayerAnimators(previousLayerLatLng, latLng2, previousLayerGpsBearing, bearing);
        updateCameraAnimators(latLng, f, latLng2, bearing2);
        playAnimators((Utils.immediateAnimation(this.projection, latLng, latLng2) || Utils.immediateAnimation(this.projection, previousLayerLatLng, latLng2)) ? 0L : getAnimationDuration(), 0, 2, 1, 4);
        this.previousLocation = location;
    }

    public void feedNewTilt(double d, CameraPosition cameraPosition, long j, MapboxMap.CancelableCallback cancelableCallback) {
        updateTiltAnimator((float) d, (float) cameraPosition.tilt, cancelableCallback);
        playAnimators(j, 8);
    }

    public void feedNewZoomLevel(double d, CameraPosition cameraPosition, long j, MapboxMap.CancelableCallback cancelableCallback) {
        updateZoomAnimator((float) d, (float) cameraPosition.zoom, cancelableCallback);
        playAnimators(j, 7);
    }

    public void resetAllCameraAnimations(CameraPosition cameraPosition, boolean z) {
        resetCameraCompassAnimation(cameraPosition);
        resetCameraGpsBearingAnimation(cameraPosition, z);
        long j = resetCameraLatLngAnimation(cameraPosition) ? 0L : 750L;
        int[] A1b = GOn.A1b();
        A1b[0] = 1;
        A1b[1] = 4;
        playAnimators(j, A1b);
    }

    public void setAccuracyAnimationEnabled(boolean z) {
        this.accuracyAnimationEnabled = z;
    }

    public void setCompassAnimationEnabled(boolean z) {
        this.compassAnimationEnabled = z;
    }

    public void setMaxAnimationFps(int i) {
        if (i <= 0) {
            Logger.e(TAG, "Max animation FPS cannot be less or equal to 0.");
        } else {
            this.maxAnimationFps = i;
        }
    }

    public void setTrackingAnimationDurationMultiplier(float f) {
        this.durationMultiplier = f;
    }

    public void updateAnimatorListenerHolders(Set set) {
        this.listeners.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnimatorListenerHolder animatorListenerHolder = (AnimatorListenerHolder) it.next();
            this.listeners.append(animatorListenerHolder.animatorType, animatorListenerHolder.listener);
        }
    }
}
