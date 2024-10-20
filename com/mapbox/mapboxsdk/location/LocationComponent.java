package com.mapbox.mapboxsdk.location;

import X.1BK;
import X.7zL;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.JQz;
import X.JR2;
import X.KgA;
import X.KzM;
import X.Kzo;
import X.Lgk;
import X.MJ4;
import X.MJh;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Style;
import com.mapbox.mapboxsdk.maps.Transform;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: LocationComponent.class */
public final class LocationComponent {
    public static final double MAPBOX_MAP_MAX_ZOOM_METERS_PER_PIXEL = 0.019d;
    public static final String TAG = "Mbgl-LocationComponent";
    public OnCameraTrackingChangedListener cameraTrackingChangedListener;
    public CompassEngine compassEngine;
    public CompassListener compassListener;
    public MJ4 currentLocationEngineListener;
    public final MapboxMap.OnDeveloperAnimationListener developerAnimationListener;
    public long fastestInterval;
    public InternalLocationEngineProvider internalLocationEngineProvider;
    public boolean isComponentInitialized;
    public boolean isComponentStarted;
    public boolean isEnabled;
    public boolean isLayerReady;
    public boolean isListeningToCompass;
    public CameraPosition lastCameraPosition;
    public Location lastLocation;
    public MJ4 lastLocationEngineListener;
    public long lastUpdateTime;
    public LocationAnimatorCoordinator locationAnimatorCoordinator;
    public LocationCameraController locationCameraController;
    public MJh locationEngine;
    public Kzo locationEngineRequest;
    public LocationLayerController locationLayerController;
    public String locationSubscriptionId;
    public final MapboxMap mapboxMap;
    public MapboxMap.OnCameraIdleListener onCameraIdleListener;
    public OnCameraMoveInvalidateListener onCameraMoveInvalidateListener;
    public MapboxMap.OnCameraMoveListener onCameraMoveListener;
    public OnLocationStaleListener onLocationStaleListener;
    public MapboxMap.OnMapClickListener onMapClickListener;
    public MapboxMap.OnMapLongClickListener onMapLongClickListener;
    public LocationComponentOptions options;
    public OnRenderModeChangedListener renderModeChangedListener;
    public StaleStateManager staleStateManager;
    public Style style;
    public final Transform transform;
    public final CopyOnWriteArrayList onLocationStaleListeners = Kzo.A00(this);
    public final CopyOnWriteArrayList onLocationClickListeners = JQx.A14();
    public final CopyOnWriteArrayList onLocationLongClickListeners = JQx.A14();
    public final CopyOnWriteArrayList onCameraTrackingChangedListeners = JQx.A14();
    public final CopyOnWriteArrayList onRenderModeChangedListeners = JQx.A14();

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponent$1, reason: invalid class name */
    /* loaded from: LocationComponent$1.class */
    public class AnonymousClass1 implements MapboxMap.OnCameraMoveListener {
        public AnonymousClass1() {
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveListener
        public void onCameraMove() {
            LocationComponent.this.updateLayerOffsets(false);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponent$2, reason: invalid class name */
    /* loaded from: LocationComponent$2.class */
    public class AnonymousClass2 implements MapboxMap.OnCameraIdleListener {
        public AnonymousClass2() {
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener
        public void onCameraIdle() {
            LocationComponent.this.updateLayerOffsets(false);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponent$3, reason: invalid class name */
    /* loaded from: LocationComponent$3.class */
    public class AnonymousClass3 implements MapboxMap.OnMapClickListener {
        public AnonymousClass3() {
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener
        public boolean onMapClick(LatLng latLng) {
            if (LocationComponent.this.onLocationClickListeners.isEmpty() || !LocationComponent.this.locationLayerController.onMapClick(latLng)) {
                return false;
            }
            Iterator it = LocationComponent.this.onLocationClickListeners.iterator();
            while (it.hasNext()) {
                ((OnLocationClickListener) it.next()).onLocationComponentClick();
            }
            return true;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponent$4, reason: invalid class name */
    /* loaded from: LocationComponent$4.class */
    public class AnonymousClass4 implements MapboxMap.OnMapLongClickListener {
        public AnonymousClass4() {
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnMapLongClickListener
        public boolean onMapLongClick(LatLng latLng) {
            if (LocationComponent.this.onLocationLongClickListeners.isEmpty() || !LocationComponent.this.locationLayerController.onMapClick(latLng)) {
                return false;
            }
            Iterator it = LocationComponent.this.onLocationLongClickListeners.iterator();
            while (it.hasNext()) {
                ((OnLocationLongClickListener) it.next()).onLocationComponentLongClick();
            }
            return true;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponent$5, reason: invalid class name */
    /* loaded from: LocationComponent$5.class */
    public class AnonymousClass5 implements OnLocationStaleListener {
        public AnonymousClass5() {
        }

        @Override // com.mapbox.mapboxsdk.location.OnLocationStaleListener
        public void onStaleStateChange(boolean z) {
            LocationComponent.this.locationLayerController.setLocationsStale(z);
            Iterator it = LocationComponent.this.onLocationStaleListeners.iterator();
            while (it.hasNext()) {
                ((OnLocationStaleListener) it.next()).onStaleStateChange(z);
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponent$6, reason: invalid class name */
    /* loaded from: LocationComponent$6.class */
    public class AnonymousClass6 implements OnCameraMoveInvalidateListener {
        public AnonymousClass6() {
        }

        @Override // com.mapbox.mapboxsdk.location.OnCameraMoveInvalidateListener
        public void onInvalidateCameraMove() {
            LocationComponent.this.onCameraMoveListener.onCameraMove();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponent$7, reason: invalid class name */
    /* loaded from: LocationComponent$7.class */
    public class AnonymousClass7 implements CompassListener {
        public AnonymousClass7() {
        }

        @Override // com.mapbox.mapboxsdk.location.CompassListener
        public void onCompassAccuracyChange(int i) {
        }

        @Override // com.mapbox.mapboxsdk.location.CompassListener
        public void onCompassChanged(float f) {
            LocationComponent.this.updateCompassHeading(f);
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponent$8, reason: invalid class name */
    /* loaded from: LocationComponent$8.class */
    public class AnonymousClass8 implements OnCameraTrackingChangedListener {
        public AnonymousClass8() {
        }

        @Override // com.mapbox.mapboxsdk.location.OnCameraTrackingChangedListener
        public void onCameraTrackingChanged(int i) {
            LocationComponent.this.locationAnimatorCoordinator.cancelZoomAnimation();
            LocationComponent.this.locationAnimatorCoordinator.cancelTiltAnimation();
            LocationComponent.this.updateAnimatorListenerHolders();
            LocationComponent locationComponent = LocationComponent.this;
            locationComponent.locationAnimatorCoordinator.resetAllCameraAnimations(JQz.A0Z(locationComponent.mapboxMap), AnonymousClass001.A1Q(LocationComponent.this.locationCameraController.cameraMode, 36));
            Iterator it = LocationComponent.this.onCameraTrackingChangedListeners.iterator();
            while (it.hasNext()) {
                ((OnCameraTrackingChangedListener) it.next()).onCameraTrackingChanged(i);
            }
        }

        @Override // com.mapbox.mapboxsdk.location.OnCameraTrackingChangedListener
        public void onCameraTrackingDismissed() {
            Iterator it = LocationComponent.this.onCameraTrackingChangedListeners.iterator();
            while (it.hasNext()) {
                ((OnCameraTrackingChangedListener) it.next()).onCameraTrackingDismissed();
            }
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.location.LocationComponent$9, reason: invalid class name */
    /* loaded from: LocationComponent$9.class */
    public class AnonymousClass9 implements OnRenderModeChangedListener {
        public AnonymousClass9() {
        }

        @Override // com.mapbox.mapboxsdk.location.OnRenderModeChangedListener
        public void onRenderModeChanged(int i) {
            LocationComponent.this.updateAnimatorListenerHolders();
            Iterator it = LocationComponent.this.onRenderModeChangedListeners.iterator();
            while (it.hasNext()) {
                ((OnRenderModeChangedListener) it.next()).onRenderModeChanged(i);
            }
        }
    }

    /* loaded from: LocationComponent$CameraTransitionListener.class */
    public class CameraTransitionListener implements OnLocationCameraTransitionListener {
        public final OnLocationCameraTransitionListener externalListener;

        public CameraTransitionListener(OnLocationCameraTransitionListener onLocationCameraTransitionListener) {
            this.externalListener = onLocationCameraTransitionListener;
        }

        public /* synthetic */ CameraTransitionListener(LocationComponent locationComponent, OnLocationCameraTransitionListener onLocationCameraTransitionListener, AnonymousClass1 anonymousClass1) {
            this(onLocationCameraTransitionListener);
        }

        private void reset(int i) {
            LocationComponent locationComponent = LocationComponent.this;
            locationComponent.locationAnimatorCoordinator.resetAllCameraAnimations(JQz.A0Z(locationComponent.mapboxMap), AnonymousClass001.A1Q(i, 36));
        }

        @Override // com.mapbox.mapboxsdk.location.OnLocationCameraTransitionListener
        public void onLocationCameraTransitionCanceled(int i) {
            OnLocationCameraTransitionListener onLocationCameraTransitionListener = this.externalListener;
            if (onLocationCameraTransitionListener != null) {
                onLocationCameraTransitionListener.onLocationCameraTransitionCanceled(i);
            }
            reset(i);
        }

        @Override // com.mapbox.mapboxsdk.location.OnLocationCameraTransitionListener
        public void onLocationCameraTransitionFinished(int i) {
            OnLocationCameraTransitionListener onLocationCameraTransitionListener = this.externalListener;
            if (onLocationCameraTransitionListener != null) {
                onLocationCameraTransitionListener.onLocationCameraTransitionFinished(i);
            }
            reset(i);
        }
    }

    /* loaded from: LocationComponent$CurrentLocationEngineCallback.class */
    public final class CurrentLocationEngineCallback implements MJ4 {
        public final WeakReference componentWeakReference;

        public CurrentLocationEngineCallback(LocationComponent locationComponent) {
            this.componentWeakReference = 7zL.A14(locationComponent);
        }

        @Override // X.MJ4
        public void onFailure(Exception exc) {
            Logger.e(LocationComponent.TAG, "Failed to obtain location update", exc);
        }

        @Override // X.MJ4
        public void onSuccess(KzM kzM) {
            LocationComponent locationComponent = (LocationComponent) this.componentWeakReference.get();
            if (locationComponent != null) {
                List list = kzM.A00;
                locationComponent.updateLocation(list.isEmpty() ? null : (Location) 1BK.A0r(list), false);
            }
        }
    }

    /* loaded from: LocationComponent$InternalLocationEngineProvider.class */
    public class InternalLocationEngineProvider {
        public MJh getBestLocationEngine(Context context, boolean z) {
            if (context != null) {
                return new Lgk(new KgA(context.getApplicationContext()));
            }
            throw AnonymousClass001.A0Q("context == null");
        }
    }

    /* loaded from: LocationComponent$LastLocationEngineCallback.class */
    public final class LastLocationEngineCallback implements MJ4 {
        public final WeakReference componentWeakReference;

        public LastLocationEngineCallback(LocationComponent locationComponent) {
            this.componentWeakReference = 7zL.A14(locationComponent);
        }

        @Override // X.MJ4
        public void onFailure(Exception exc) {
            Logger.e(LocationComponent.TAG, "Failed to obtain last location update", exc);
        }

        @Override // X.MJ4
        public void onSuccess(KzM kzM) {
            LocationComponent locationComponent = (LocationComponent) this.componentWeakReference.get();
            if (locationComponent != null) {
                List list = kzM.A00;
                locationComponent.updateLocation(list.isEmpty() ? null : (Location) 1BK.A0r(list), true);
            }
        }
    }

    public LocationComponent() {
        JR2.A0i(this);
        this.developerAnimationListener = new MapboxMap.OnDeveloperAnimationListener() { // from class: com.mapbox.mapboxsdk.location.LocationComponent.10
            @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnDeveloperAnimationListener
            public void onDeveloperAnimationStarted() {
                LocationComponent locationComponent = LocationComponent.this;
                if (locationComponent.isComponentInitialized && locationComponent.isEnabled) {
                    locationComponent.setCameraMode(8, null);
                }
            }
        };
        this.mapboxMap = null;
        this.transform = null;
    }

    public LocationComponent(MapboxMap mapboxMap, Transform transform, List list) {
        JR2.A0i(this);
        MapboxMap.OnDeveloperAnimationListener onDeveloperAnimationListener = new MapboxMap.OnDeveloperAnimationListener() { // from class: com.mapbox.mapboxsdk.location.LocationComponent.10
            @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnDeveloperAnimationListener
            public void onDeveloperAnimationStarted() {
                LocationComponent locationComponent = LocationComponent.this;
                if (locationComponent.isComponentInitialized && locationComponent.isEnabled) {
                    locationComponent.setCameraMode(8, null);
                }
            }
        };
        this.developerAnimationListener = onDeveloperAnimationListener;
        this.mapboxMap = mapboxMap;
        this.transform = transform;
        list.add(onDeveloperAnimationListener);
    }

    public LocationComponent(MapboxMap mapboxMap, Transform transform, List list, MJ4 mj4, MJ4 mj42, LocationLayerController locationLayerController, LocationCameraController locationCameraController, LocationAnimatorCoordinator locationAnimatorCoordinator, StaleStateManager staleStateManager, CompassEngine compassEngine, InternalLocationEngineProvider internalLocationEngineProvider) {
        JR2.A0i(this);
        MapboxMap.OnDeveloperAnimationListener onDeveloperAnimationListener = new MapboxMap.OnDeveloperAnimationListener() { // from class: com.mapbox.mapboxsdk.location.LocationComponent.10
            @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnDeveloperAnimationListener
            public void onDeveloperAnimationStarted() {
                LocationComponent locationComponent = LocationComponent.this;
                if (locationComponent.isComponentInitialized && locationComponent.isEnabled) {
                    locationComponent.setCameraMode(8, null);
                }
            }
        };
        this.developerAnimationListener = onDeveloperAnimationListener;
        this.mapboxMap = mapboxMap;
        this.transform = transform;
        list.add(onDeveloperAnimationListener);
        this.currentLocationEngineListener = mj4;
        this.lastLocationEngineListener = mj42;
        this.locationLayerController = locationLayerController;
        this.locationCameraController = locationCameraController;
        this.locationAnimatorCoordinator = locationAnimatorCoordinator;
        this.staleStateManager = staleStateManager;
        this.compassEngine = compassEngine;
        this.internalLocationEngineProvider = internalLocationEngineProvider;
        this.isComponentInitialized = true;
    }

    private float calculateMaxZoomLevelRadius(Location location) {
        float f = 0.0f;
        if (location != null) {
            double latitude = location.getLatitude();
            if (latitude < 90.0d && latitude > -90.0d) {
                f = (float) ((location.getAccuracy() / 0.019d) * (1.0d / Math.cos(JQy.A00(latitude))));
            }
        }
        return f;
    }

    private void checkActivationState() {
        if (!this.isComponentInitialized) {
            throw new LocationComponentNotInitializedException();
        }
    }

    private void detachFromLocationUpdates(boolean z) {
        this.locationEngine.Cec(this.currentLocationEngineListener);
    }

    private void disableLocationComponent() {
        this.isEnabled = false;
        onLocationLayerStop();
    }

    private void enableLocationComponent() {
        this.isEnabled = true;
        onLocationLayerStart();
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [com.mapbox.mapboxsdk.location.LayerSourceProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.mapbox.mapboxsdk.location.LayerFeatureProvider, java.lang.Object] */
    private void initialize(Context context, Style style, LocationComponentOptions locationComponentOptions) {
        if (this.isComponentInitialized) {
            return;
        }
        this.isComponentInitialized = true;
        if (!style.fullyLoaded) {
            throw AnonymousClass001.A0N("Style is invalid, provide the most recently loaded one.");
        }
        this.style = style;
        this.options = locationComponentOptions;
        this.mapboxMap.addOnMapClickListener(this.onMapClickListener);
        this.mapboxMap.addOnMapLongClickListener(this.onMapLongClickListener);
        this.locationLayerController = new LocationLayerController(this.mapboxMap, style, new Object(), new Object(), new LayerBitmapProvider(context), locationComponentOptions, this.renderModeChangedListener);
        this.locationCameraController = new LocationCameraController(context, this.mapboxMap, this.transform, this.cameraTrackingChangedListener, locationComponentOptions, this.onCameraMoveInvalidateListener);
        LocationAnimatorCoordinator locationAnimatorCoordinator = new LocationAnimatorCoordinator(this.mapboxMap.projection, MapboxAnimatorSetProvider.getInstance(), MapboxAnimatorProvider.getInstance());
        this.locationAnimatorCoordinator = locationAnimatorCoordinator;
        locationAnimatorCoordinator.durationMultiplier = locationComponentOptions.trackingAnimationDurationMultiplier;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (windowManager != null && sensorManager != null) {
            this.compassEngine = new LocationComponentCompassEngine(windowManager, sensorManager);
        }
        this.staleStateManager = new StaleStateManager(this.onLocationStaleListener, locationComponentOptions);
        updateMapWithOptions(locationComponentOptions);
        setRenderMode(18);
        setCameraMode(8, null);
        onLocationLayerStart();
    }

    private void initializeLocationEngine(Context context) {
        if (this.locationEngine != null) {
            detachFromLocationUpdates(true);
        }
        if (context == null) {
            throw AnonymousClass001.A0Q("context == null");
        }
        setLocationEngine(new Lgk(new KgA(context.getApplicationContext())));
    }

    private void onLocationLayerStart() {
        if (this.isComponentInitialized && this.isComponentStarted) {
            MapboxMap mapboxMap = this.mapboxMap;
            if (mapboxMap.getStyle() != null) {
                if (!this.isLayerReady) {
                    this.isLayerReady = true;
                    mapboxMap.addOnCameraMoveListener(this.onCameraMoveListener);
                    this.mapboxMap.addOnCameraIdleListener(this.onCameraIdleListener);
                    if (this.options.enableStaleState) {
                        this.staleStateManager.onStart();
                    }
                }
                if (this.isEnabled) {
                    if (this.locationEngine != null) {
                        try {
                            subscribeToLocationUpdates(false);
                        } catch (SecurityException e) {
                            Logger.e(TAG, "Unable to request location updates", e);
                        }
                    }
                    setCameraMode(this.locationCameraController.cameraMode, null);
                    setLastLocation();
                    updateCompassListenerState(true);
                    setLastCompassHeading();
                }
            }
        }
    }

    private void onLocationLayerStop() {
        if (this.isComponentInitialized && this.isLayerReady && this.isComponentStarted) {
            this.isLayerReady = false;
            this.locationLayerController.hide();
            this.staleStateManager.onStop();
            if (this.compassEngine != null) {
                updateCompassListenerState(false);
            }
            this.locationAnimatorCoordinator.cancelAllAnimations();
            if (this.locationEngine != null) {
                detachFromLocationUpdates(false);
            }
            this.mapboxMap.removeOnCameraMoveListener(this.onCameraMoveListener);
            this.mapboxMap.removeOnCameraIdleListener(this.onCameraIdleListener);
        }
    }

    private void removeCompassListener(CompassEngine compassEngine) {
        if (this.isListeningToCompass) {
            this.isListeningToCompass = false;
            compassEngine.removeCompassListener(this.compassListener);
        }
    }

    private void setLastCompassHeading() {
        CompassEngine compassEngine = this.compassEngine;
        updateCompassHeading(compassEngine != null ? compassEngine.getLastHeading() : 0.0f);
    }

    private void setLastLocation() {
        MJh mJh = this.locationEngine;
        if (mJh != null) {
            mJh.At5(this.lastLocationEngineListener);
        } else {
            checkActivationState();
            updateLocation(this.lastLocation, true);
        }
    }

    private void showLocationLayerIfHidden() {
        LocationLayerController locationLayerController = this.locationLayerController;
        boolean z = locationLayerController.isHidden;
        if (this.isEnabled && this.isComponentStarted && z) {
            locationLayerController.show();
        }
    }

    private void subscribeToLocationUpdates(boolean z) {
        MJh mJh = this.locationEngine;
        Kzo kzo = this.locationEngineRequest;
        mJh.Cgy(Looper.getMainLooper(), this.currentLocationEngineListener, kzo);
    }

    private void updateAccuracyRadius(Location location, boolean z) {
        this.locationAnimatorCoordinator.feedNewAccuracyRadius(calculateMaxZoomLevelRadius(location), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAnimatorListenerHolders() {
        HashSet A0v = AnonymousClass001.A0v();
        A0v.addAll(this.locationLayerController.getAnimationListeners());
        A0v.addAll(this.locationCameraController.getAnimationListeners());
        this.locationAnimatorCoordinator.updateAnimatorListenerHolders(A0v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCompassHeading(float f) {
        this.locationAnimatorCoordinator.feedNewCompassBearing(f, JQz.A0Z(this.mapboxMap));
    }

    private void updateCompassListenerState(boolean z) {
        CompassEngine compassEngine = this.compassEngine;
        if (compassEngine != null) {
            if (z) {
                if (!this.isComponentInitialized || !this.isComponentStarted || !this.isEnabled) {
                    return;
                }
                if (this.locationCameraController.isConsumingCompass() || AnonymousClass001.A1Q(this.locationLayerController.renderMode, 4)) {
                    if (this.isListeningToCompass) {
                        return;
                    }
                    this.isListeningToCompass = true;
                    compassEngine.addCompassListener(this.compassListener);
                    return;
                }
            }
            removeCompassListener(compassEngine);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayerOffsets(boolean z) {
        CameraPosition A0Z = JQz.A0Z(this.mapboxMap);
        CameraPosition cameraPosition = this.lastCameraPosition;
        if (cameraPosition == null || z) {
            this.lastCameraPosition = A0Z;
            this.locationLayerController.updateForegroundBearing((float) A0Z.bearing);
            this.locationLayerController.updateForegroundOffset(A0Z.tilt);
            checkActivationState();
            updateAccuracyRadius(this.lastLocation, true);
            return;
        }
        double d = A0Z.bearing;
        if (d != cameraPosition.bearing) {
            this.locationLayerController.updateForegroundBearing((float) d);
        }
        double d2 = A0Z.tilt;
        if (d2 != this.lastCameraPosition.tilt) {
            this.locationLayerController.updateForegroundOffset(d2);
        }
        if (A0Z.zoom != this.lastCameraPosition.zoom) {
            checkActivationState();
            updateAccuracyRadius(this.lastLocation, true);
        }
        this.lastCameraPosition = A0Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocation(Location location, boolean z) {
        if (location != null) {
            if (this.isLayerReady) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - this.lastUpdateTime < this.fastestInterval) {
                    return;
                }
                this.lastUpdateTime = elapsedRealtime;
                showLocationLayerIfHidden();
                if (!z) {
                    this.staleStateManager.updateLatestLocationTime();
                }
                CameraPosition A0Z = JQz.A0Z(this.mapboxMap);
                checkActivationState();
                this.locationAnimatorCoordinator.feedNewLocation(location, A0Z, AnonymousClass001.A1Q(this.locationCameraController.cameraMode, 36));
                updateAccuracyRadius(location, false);
            }
            this.lastLocation = location;
        }
    }

    private void updateMapWithOptions(LocationComponentOptions locationComponentOptions) {
        int[] iArr = locationComponentOptions.padding;
        if (iArr != null) {
            this.mapboxMap.setPadding(JQx.A0M(iArr), iArr[1], iArr[2], iArr[3]);
        }
    }

    public void activateLocationComponent(Context context, Style style) {
        activateLocationComponent(context, style, LocationComponentOptions.createFromAttributes(context, R.style.mapbox_LocationComponent));
    }

    public void activateLocationComponent(Context context, Style style, int i) {
        activateLocationComponent(context, style, LocationComponentOptions.createFromAttributes(context, i));
    }

    public void activateLocationComponent(Context context, Style style, MJh mJh) {
        activateLocationComponent(context, style, mJh, R.style.mapbox_LocationComponent);
    }

    public void activateLocationComponent(Context context, Style style, MJh mJh, int i) {
        activateLocationComponent(context, style, mJh, LocationComponentOptions.createFromAttributes(context, i));
    }

    public void activateLocationComponent(Context context, Style style, MJh mJh, Kzo kzo) {
        activateLocationComponent(context, style, mJh, kzo, R.style.mapbox_LocationComponent);
    }

    public void activateLocationComponent(Context context, Style style, MJh mJh, Kzo kzo, int i) {
        activateLocationComponent(context, style, mJh, kzo, LocationComponentOptions.createFromAttributes(context, i));
    }

    public void activateLocationComponent(Context context, Style style, MJh mJh, Kzo kzo, LocationComponentOptions locationComponentOptions) {
        initialize(context, style, locationComponentOptions);
        setLocationEngineRequest(kzo);
        setLocationEngine(mJh);
        applyStyle(locationComponentOptions);
    }

    public void activateLocationComponent(Context context, Style style, MJh mJh, LocationComponentOptions locationComponentOptions) {
        initialize(context, style, locationComponentOptions);
        setLocationEngine(mJh);
        applyStyle(locationComponentOptions);
    }

    public void activateLocationComponent(Context context, Style style, LocationComponentOptions locationComponentOptions) {
        initialize(context, style, locationComponentOptions);
        initializeLocationEngine(context);
        applyStyle(locationComponentOptions);
    }

    public void activateLocationComponent(Context context, Style style, boolean z) {
        if (z) {
            activateLocationComponent(context, style, R.style.mapbox_LocationComponent);
        } else {
            activateLocationComponent(context, style, (MJh) null, R.style.mapbox_LocationComponent);
        }
    }

    public void activateLocationComponent(Context context, Style style, boolean z, Kzo kzo) {
        setLocationEngineRequest(kzo);
        if (z) {
            activateLocationComponent(context, style, R.style.mapbox_LocationComponent);
        } else {
            activateLocationComponent(context, style, (MJh) null, R.style.mapbox_LocationComponent);
        }
    }

    public void activateLocationComponent(Context context, Style style, boolean z, Kzo kzo, LocationComponentOptions locationComponentOptions) {
        setLocationEngineRequest(kzo);
        if (z) {
            activateLocationComponent(context, style, locationComponentOptions);
        } else {
            activateLocationComponent(context, style, (MJh) null, locationComponentOptions);
        }
    }

    public void activateLocationComponent(LocationComponentActivationOptions locationComponentActivationOptions) {
        LocationComponentOptions locationComponentOptions = locationComponentActivationOptions.locationComponentOptions;
        if (locationComponentOptions == null) {
            int i = locationComponentActivationOptions.styleRes;
            if (i == 0) {
                i = 2132608900;
            }
            locationComponentOptions = LocationComponentOptions.createFromAttributes(locationComponentActivationOptions.context, i);
        }
        initialize(locationComponentActivationOptions.context, locationComponentActivationOptions.style, locationComponentOptions);
        applyStyle(locationComponentOptions);
        Kzo kzo = locationComponentActivationOptions.locationEngineRequest;
        if (kzo != null) {
            setLocationEngineRequest(kzo);
        }
        this.locationSubscriptionId = locationComponentActivationOptions.locationSubscriptionId;
        MJh mJh = locationComponentActivationOptions.locationEngine;
        if (mJh == null) {
            if (locationComponentActivationOptions.useDefaultLocationEngine) {
                initializeLocationEngine(locationComponentActivationOptions.context);
                return;
            }
            mJh = null;
        }
        setLocationEngine(mJh);
    }

    public void addOnCameraTrackingChangedListener(OnCameraTrackingChangedListener onCameraTrackingChangedListener) {
        this.onCameraTrackingChangedListeners.add(onCameraTrackingChangedListener);
    }

    public void addOnLocationClickListener(OnLocationClickListener onLocationClickListener) {
        this.onLocationClickListeners.add(onLocationClickListener);
    }

    public void addOnLocationLongClickListener(OnLocationLongClickListener onLocationLongClickListener) {
        this.onLocationLongClickListeners.add(onLocationLongClickListener);
    }

    public void addOnLocationStaleListener(OnLocationStaleListener onLocationStaleListener) {
        this.onLocationStaleListeners.add(onLocationStaleListener);
    }

    public void addOnRenderModeChangedListener(OnRenderModeChangedListener onRenderModeChangedListener) {
        this.onRenderModeChangedListeners.add(onRenderModeChangedListener);
    }

    public void applyStyle(Context context, int i) {
        checkActivationState();
        applyStyle(LocationComponentOptions.createFromAttributes(context, i));
    }

    public void applyStyle(LocationComponentOptions locationComponentOptions) {
        checkActivationState();
        this.options = locationComponentOptions;
        if (this.mapboxMap.getStyle() != null) {
            this.locationLayerController.applyStyle(locationComponentOptions);
            this.locationCameraController.initializeOptions(locationComponentOptions);
            this.staleStateManager.setEnabled(locationComponentOptions.enableStaleState);
            this.staleStateManager.setDelayTime(locationComponentOptions.staleStateTimeout);
            LocationAnimatorCoordinator locationAnimatorCoordinator = this.locationAnimatorCoordinator;
            locationAnimatorCoordinator.durationMultiplier = locationComponentOptions.trackingAnimationDurationMultiplier;
            locationAnimatorCoordinator.compassAnimationEnabled = locationComponentOptions.compassAnimationEnabled;
            locationAnimatorCoordinator.accuracyAnimationEnabled = locationComponentOptions.accuracyAnimationEnabled;
            updateMapWithOptions(locationComponentOptions);
        }
    }

    public void cancelTiltWhileTrackingAnimation() {
        checkActivationState();
        this.locationAnimatorCoordinator.cancelTiltAnimation();
    }

    public void cancelZoomWhileTrackingAnimation() {
        checkActivationState();
        this.locationAnimatorCoordinator.cancelZoomAnimation();
    }

    public void forceLocationUpdate(Location location) {
        checkActivationState();
        updateLocation(location, false);
    }

    public int getCameraMode() {
        checkActivationState();
        return this.locationCameraController.cameraMode;
    }

    public CompassEngine getCompassEngine() {
        checkActivationState();
        return this.compassEngine;
    }

    public Location getLastKnownLocation() {
        checkActivationState();
        return this.lastLocation;
    }

    public LocationComponentOptions getLocationComponentOptions() {
        checkActivationState();
        return this.options;
    }

    public MJh getLocationEngine() {
        checkActivationState();
        return this.locationEngine;
    }

    public Kzo getLocationEngineRequest() {
        checkActivationState();
        return this.locationEngineRequest;
    }

    public int getRenderMode() {
        checkActivationState();
        return this.locationLayerController.renderMode;
    }

    public boolean isLocationComponentActivated() {
        return this.isComponentInitialized;
    }

    public boolean isLocationComponentEnabled() {
        checkActivationState();
        return this.isEnabled;
    }

    public void onDestroy() {
    }

    public void onFinishLoadingStyle() {
        if (this.isComponentInitialized) {
            Style style = this.mapboxMap.getStyle();
            this.style = style;
            this.locationLayerController.initializeComponents(style, this.options);
            this.locationCameraController.initializeOptions(this.options);
            onLocationLayerStart();
        }
    }

    public void onStart() {
        this.isComponentStarted = true;
        onLocationLayerStart();
    }

    public void onStartLoadingMap() {
        onLocationLayerStop();
    }

    public void onStop() {
        onLocationLayerStop();
        this.isComponentStarted = false;
    }

    public void removeOnCameraTrackingChangedListener(OnCameraTrackingChangedListener onCameraTrackingChangedListener) {
        this.onCameraTrackingChangedListeners.remove(onCameraTrackingChangedListener);
    }

    public void removeOnLocationClickListener(OnLocationClickListener onLocationClickListener) {
        this.onLocationClickListeners.remove(onLocationClickListener);
    }

    public void removeOnLocationLongClickListener(OnLocationLongClickListener onLocationLongClickListener) {
        this.onLocationLongClickListeners.remove(onLocationLongClickListener);
    }

    public void removeOnLocationStaleListener(OnLocationStaleListener onLocationStaleListener) {
        this.onLocationStaleListeners.remove(onLocationStaleListener);
    }

    public void removeRenderModeChangedListener(OnRenderModeChangedListener onRenderModeChangedListener) {
        this.onRenderModeChangedListeners.remove(onRenderModeChangedListener);
    }

    public void setCameraMode(int i) {
        setCameraMode(i, null);
    }

    public void setCameraMode(int i, long j, Double d, Double d2, Double d3, OnLocationCameraTransitionListener onLocationCameraTransitionListener) {
        checkActivationState();
        this.locationCameraController.setCameraMode(i, this.lastLocation, j, d, d2, d3, new CameraTransitionListener(onLocationCameraTransitionListener));
        updateCompassListenerState(true);
    }

    public void setCameraMode(int i, OnLocationCameraTransitionListener onLocationCameraTransitionListener) {
        setCameraMode(i, 750L, null, null, null, onLocationCameraTransitionListener);
    }

    public void setCompassEngine(CompassEngine compassEngine) {
        checkActivationState();
        if (this.compassEngine != null) {
            updateCompassListenerState(false);
        }
        this.compassEngine = compassEngine;
        updateCompassListenerState(true);
    }

    public void setLocationComponentEnabled(boolean z) {
        checkActivationState();
        if (z) {
            enableLocationComponent();
        } else {
            disableLocationComponent();
        }
    }

    public void setLocationEngine(MJh mJh) {
        checkActivationState();
        if (this.locationEngine != null) {
            detachFromLocationUpdates(true);
            this.locationEngine = null;
        }
        if (mJh == null) {
            this.fastestInterval = 0L;
            return;
        }
        this.fastestInterval = this.locationEngineRequest.A00;
        this.locationEngine = mJh;
        if (this.isLayerReady && this.isEnabled) {
            setLastLocation();
            subscribeToLocationUpdates(true);
        }
    }

    public void setLocationEngineRequest(Kzo kzo) {
        checkActivationState();
        this.locationEngineRequest = kzo;
        setLocationEngine(this.locationEngine);
    }

    public void setMaxAnimationFps(int i) {
        checkActivationState();
        this.locationAnimatorCoordinator.setMaxAnimationFps(i);
    }

    public void setRenderMode(int i) {
        checkActivationState();
        this.locationLayerController.setRenderMode(i);
        updateLayerOffsets(true);
        updateCompassListenerState(true);
    }

    public void tiltWhileTracking(double d) {
        checkActivationState();
        tiltWhileTracking(d, LocationComponentConstants.DEFAULT_TRACKING_TILT_ANIM_DURATION, null);
    }

    public void tiltWhileTracking(double d, long j) {
        checkActivationState();
        tiltWhileTracking(d, j, null);
    }

    public void tiltWhileTracking(double d, long j, MapboxMap.CancelableCallback cancelableCallback) {
        checkActivationState();
        if (this.isLayerReady) {
            checkActivationState();
            if (this.locationCameraController.cameraMode == 8) {
                Logger.e(TAG, String.format("%s%s", "LocationComponent#tiltWhileTracking method can only be used", " when a camera mode other than CameraMode#NONE is engaged."));
            } else {
                this.locationAnimatorCoordinator.feedNewTilt(d, JQz.A0Z(this.mapboxMap), j, cancelableCallback);
            }
        }
    }

    public void zoomWhileTracking(double d) {
        checkActivationState();
        zoomWhileTracking(d, 750L, null);
    }

    public void zoomWhileTracking(double d, long j) {
        checkActivationState();
        zoomWhileTracking(d, j, null);
    }

    public void zoomWhileTracking(double d, long j, MapboxMap.CancelableCallback cancelableCallback) {
        checkActivationState();
        if (this.isLayerReady) {
            checkActivationState();
            if (this.locationCameraController.cameraMode == 8) {
                Logger.e(TAG, String.format("%s%s", "LocationComponent#zoomWhileTracking method can only be used", " when a camera mode other than CameraMode#NONE is engaged."));
            } else {
                this.locationAnimatorCoordinator.feedNewZoomLevel(d, JQz.A0Z(this.mapboxMap), j, cancelableCallback);
            }
        }
    }
}
