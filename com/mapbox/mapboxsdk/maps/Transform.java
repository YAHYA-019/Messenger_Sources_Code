package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.os.Handler;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.util.Arrays;

/* loaded from: Transform.class */
public final class Transform implements MapView.OnCameraDidChangeListener {
    public static final String TAG = "Mbgl-Transform";
    public MapboxMap.CancelableCallback cameraCancelableCallback;
    public CameraChangeDispatcher cameraChangeDispatcher;
    public CameraPosition cameraPosition;
    public final MapView mapView;
    public final NativeMap nativeMap;
    public float[] padding;
    public final Handler handler = new Handler();
    public final MapView.OnCameraDidChangeListener moveByChangeListener = new MapView.OnCameraDidChangeListener() { // from class: com.mapbox.mapboxsdk.maps.Transform.1
        @Override // com.mapbox.mapboxsdk.maps.MapView.OnCameraDidChangeListener
        public void onCameraDidChange(boolean z) {
            if (z) {
                Transform.this.cameraChangeDispatcher.onCameraIdle();
                Transform.this.mapView.removeOnCameraDidChangeListener(this);
            }
        }
    };

    public Transform(MapView mapView, NativeMap nativeMap, CameraChangeDispatcher cameraChangeDispatcher) {
        this.mapView = mapView;
        this.nativeMap = nativeMap;
        this.cameraChangeDispatcher = cameraChangeDispatcher;
    }

    private boolean isValidCameraPosition(CameraPosition cameraPosition) {
        if (cameraPosition != null) {
            return (cameraPosition.equals(this.cameraPosition) && Arrays.equals(this.padding, this.nativeMap.getContentPadding())) ? false : true;
        }
        return false;
    }

    public final void animateCamera(MapboxMap mapboxMap, CameraUpdate cameraUpdate, int i, MapboxMap.CancelableCallback cancelableCallback) {
        CameraPosition cameraPosition = cameraUpdate.getCameraPosition(mapboxMap);
        if (isValidCameraPosition(cameraPosition)) {
            cancelTransitions();
            this.cameraChangeDispatcher.onCameraMoveStarted(3);
            if (cancelableCallback != null) {
                this.cameraCancelableCallback = cancelableCallback;
            }
            this.mapView.addOnCameraDidChangeListener(this);
            this.nativeMap.flyTo(cameraPosition.target, cameraPosition.zoom, cameraPosition.bearing, cameraPosition.tilt, i);
        }
    }

    public void cancelTransitions() {
        this.cameraChangeDispatcher.onCameraMoveCanceled();
        final MapboxMap.CancelableCallback cancelableCallback = this.cameraCancelableCallback;
        if (cancelableCallback != null) {
            this.cameraChangeDispatcher.onCameraIdle();
            this.cameraCancelableCallback = null;
            this.handler.post(new Runnable() { // from class: com.mapbox.mapboxsdk.maps.Transform.4
                @Override // java.lang.Runnable
                public void run() {
                    cancelableCallback.onCancel();
                }
            });
        }
        this.nativeMap.cancelTransitions();
        this.cameraChangeDispatcher.onCameraIdle();
    }

    public final void easeCamera(MapboxMap mapboxMap, CameraUpdate cameraUpdate, int i, boolean z, MapboxMap.CancelableCallback cancelableCallback) {
        CameraPosition cameraPosition = cameraUpdate.getCameraPosition(mapboxMap);
        if (isValidCameraPosition(cameraPosition)) {
            cancelTransitions();
            this.cameraChangeDispatcher.onCameraMoveStarted(3);
            if (cancelableCallback != null) {
                this.cameraCancelableCallback = cancelableCallback;
            }
            this.mapView.addOnCameraDidChangeListener(this);
            this.nativeMap.easeTo(cameraPosition.target, cameraPosition.zoom, cameraPosition.bearing, cameraPosition.tilt, i, z);
        }
    }

    public double getBearing() {
        double d;
        double d2 = -this.nativeMap.getBearing();
        while (true) {
            d = d2;
            if (d <= 360.0d) {
                break;
            }
            d2 = d - 360.0d;
        }
        while (d < 0.0d) {
            d += 360.0d;
        }
        return d;
    }

    public final CameraPosition getCameraPosition() {
        CameraPosition cameraPosition = this.cameraPosition;
        if (cameraPosition == null) {
            cameraPosition = invalidateCameraPosition();
            this.cameraPosition = cameraPosition;
        }
        return cameraPosition;
    }

    public LatLng getCenterCoordinate() {
        return this.nativeMap.getLatLng();
    }

    public LatLng getLatLng() {
        return this.nativeMap.getLatLng();
    }

    public double getMaxZoom() {
        return this.nativeMap.getMaxZoom();
    }

    public double getMinZoom() {
        return this.nativeMap.getMinZoom();
    }

    public double getRawBearing() {
        return this.nativeMap.getBearing();
    }

    public double getRawZoom() {
        return this.nativeMap.getZoom();
    }

    public double getTilt() {
        return this.nativeMap.getPitch();
    }

    public void initialise(MapboxMap mapboxMap, MapboxMapOptions mapboxMapOptions) {
        CameraPosition cameraPosition = mapboxMapOptions.cameraPosition;
        if (cameraPosition != null && !cameraPosition.equals(CameraPosition.DEFAULT)) {
            moveCamera(mapboxMap, CameraUpdateFactory.newCameraPosition(cameraPosition), null);
        }
        setMinZoom(mapboxMapOptions.minZoom);
        setMaxZoom(mapboxMapOptions.maxZoom);
    }

    public CameraPosition invalidateCameraPosition() {
        NativeMap nativeMap = this.nativeMap;
        if (nativeMap != null) {
            CameraPosition cameraPosition = nativeMap.getCameraPosition();
            if (isValidCameraPosition(cameraPosition)) {
                this.cameraChangeDispatcher.onCameraMove();
            }
            this.cameraPosition = cameraPosition;
            this.padding = this.nativeMap.getContentPadding();
        }
        return this.cameraPosition;
    }

    public void moveBy(double d, double d2, long j) {
        if (j > 0) {
            this.mapView.addOnCameraDidChangeListener(this.moveByChangeListener);
        }
        this.nativeMap.moveBy(d, d2, j);
    }

    public final void moveCamera(MapboxMap mapboxMap, CameraUpdate cameraUpdate, final MapboxMap.CancelableCallback cancelableCallback) {
        CameraPosition cameraPosition = cameraUpdate.getCameraPosition(mapboxMap);
        if (isValidCameraPosition(cameraPosition)) {
            cancelTransitions();
            this.cameraChangeDispatcher.onCameraMoveStarted(3);
            this.nativeMap.jumpTo(cameraPosition.target, cameraPosition.zoom, cameraPosition.tilt, cameraPosition.bearing);
            this.cameraChangeDispatcher.onCameraIdle();
            invalidateCameraPosition();
            this.handler.post(new Runnable() { // from class: com.mapbox.mapboxsdk.maps.Transform.3
                @Override // java.lang.Runnable
                public void run() {
                    MapboxMap.CancelableCallback cancelableCallback2 = cancelableCallback;
                    if (cancelableCallback2 != null) {
                        cancelableCallback2.onFinish();
                    }
                }
            });
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.MapView.OnCameraDidChangeListener
    public void onCameraDidChange(boolean z) {
        if (z) {
            invalidateCameraPosition();
            final MapboxMap.CancelableCallback cancelableCallback = this.cameraCancelableCallback;
            if (cancelableCallback != null) {
                this.cameraCancelableCallback = null;
                this.handler.post(new Runnable() { // from class: com.mapbox.mapboxsdk.maps.Transform.2
                    @Override // java.lang.Runnable
                    public void run() {
                        cancelableCallback.onFinish();
                    }
                });
            }
            this.cameraChangeDispatcher.onCameraIdle();
            this.mapView.removeOnCameraDidChangeListener(this);
        }
    }

    public void resetNorth() {
        cancelTransitions();
        this.nativeMap.resetNorth();
    }

    public void setBearing(double d) {
        this.nativeMap.setBearing(d, 0L);
    }

    public void setBearing(double d, float f, float f2) {
        this.nativeMap.setBearing(d, f, f2, 0L);
    }

    public void setBearing(double d, float f, float f2, long j) {
        this.nativeMap.setBearing(d, f, f2, j);
    }

    public void setCenterCoordinate(LatLng latLng) {
        this.nativeMap.setLatLng(latLng, 0L);
    }

    public void setGestureInProgress(boolean z) {
        this.nativeMap.setGestureInProgress(z);
        if (z) {
            return;
        }
        invalidateCameraPosition();
    }

    public void setMaxZoom(double d) {
        if (d < 0.0d || d > 25.5d) {
            Logger.e(TAG, String.format("Not setting maxZoomPreference, value is in unsupported range: %s", Double.valueOf(d)));
        } else {
            this.nativeMap.setMaxZoom(d);
        }
    }

    public void setMinZoom(double d) {
        if (d < 0.0d || d > 25.5d) {
            Logger.e(TAG, String.format("Not setting minZoomPreference, value is in unsupported range: %s", Double.valueOf(d)));
        } else {
            this.nativeMap.setMinZoom(d);
        }
    }

    public void setTilt(Double d) {
        this.nativeMap.setPitch(d.doubleValue(), 0L);
    }

    public void setZoom(double d, PointF pointF) {
        this.nativeMap.setZoom(d, pointF, 0L);
    }

    public void zoomBy(double d, PointF pointF) {
        setZoom(this.nativeMap.getZoom() + d, pointF);
    }
}
