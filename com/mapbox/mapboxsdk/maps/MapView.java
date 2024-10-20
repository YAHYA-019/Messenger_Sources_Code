package com.mapbox.mapboxsdk.maps;

import X.0FI;
import X.AnonymousClass001;
import X.C00p;
import X.DKD;
import X.GOn;
import X.GOo;
import X.LCT;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.MapStrictMode;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.exceptions.MapboxConfigurationException;
import com.mapbox.mapboxsdk.location.LocationComponent;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.NativeMapView;
import com.mapbox.mapboxsdk.maps.renderer.MapRenderer;
import com.mapbox.mapboxsdk.maps.renderer.glsurfaceview.GLSurfaceViewMapRenderer;
import com.mapbox.mapboxsdk.maps.renderer.glsurfaceview.MapboxGLSurfaceView;
import com.mapbox.mapboxsdk.maps.renderer.textureview.TextureViewMapRenderer;
import com.mapbox.mapboxsdk.maps.widgets.CompassView;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.utils.BitmapUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: MapView.class */
public class MapView extends FrameLayout implements NativeMapView.ViewCallback {
    public ImageView attrView;
    public AttributionClickListener attributionClickListener;
    public CompassView compassView;
    public boolean destroyed;
    public PointF focalPoint;
    public final InitialRenderCallback initialRenderCallback;
    public boolean isStarted;
    public ImageView logoView;
    public final MapCallback mapCallback;
    public final MapChangeReceiver mapChangeReceiver;
    public MapGestureDetector mapGestureDetector;
    public MapKeyListener mapKeyListener;
    public MapRenderer mapRenderer;
    public MapboxMap mapboxMap;
    public MapboxMapOptions mapboxMapOptions;
    public NativeMap nativeMapView;
    public Bundle savedInstanceState;

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$1, reason: invalid class name */
    /* loaded from: MapView$1.class */
    public class AnonymousClass1 implements FocalPointChangeListener {
        public AnonymousClass1() {
        }

        @Override // com.mapbox.mapboxsdk.maps.FocalPointChangeListener
        public void onFocalPointChanged(PointF pointF) {
            MapView.this.focalPoint = pointF;
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$2, reason: invalid class name */
    /* loaded from: MapView$2.class */
    public class AnonymousClass2 implements MapboxMap.OnCompassAnimationListener {
        public final /* synthetic */ CameraChangeDispatcher val$cameraChangeDispatcher;

        public AnonymousClass2(CameraChangeDispatcher cameraChangeDispatcher) {
            this.val$cameraChangeDispatcher = cameraChangeDispatcher;
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnCompassAnimationListener
        public void onCompassAnimation() {
            this.val$cameraChangeDispatcher.onCameraMove();
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnCompassAnimationListener
        public void onCompassAnimationFinished() {
            MapView.this.compassView.isAnimating = false;
            this.val$cameraChangeDispatcher.onCameraIdle();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.MapView$3, reason: invalid class name */
    /* loaded from: MapView$3.class */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ CameraChangeDispatcher val$cameraChangeDispatcher;

        public AnonymousClass3(CameraChangeDispatcher cameraChangeDispatcher) {
            this.val$cameraChangeDispatcher = cameraChangeDispatcher;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            float width;
            float height;
            int A05 = 0FI.A05(913228538);
            MapView mapView = MapView.this;
            MapboxMap mapboxMap = mapView.mapboxMap;
            if (mapboxMap != null && mapView.compassView != null) {
                PointF pointF = mapView.focalPoint;
                if (pointF != null) {
                    width = pointF.x;
                    height = pointF.y;
                } else {
                    width = mapboxMap.getWidth() / 2.0f;
                    height = MapView.this.mapboxMap.getHeight() / 2.0f;
                }
                mapboxMap.setFocalBearing(0.0d, width, height, 150L);
                this.val$cameraChangeDispatcher.onCameraMoveStarted(3);
                CompassView compassView = MapView.this.compassView;
                compassView.isAnimating = true;
                compassView.postDelayed(compassView, 650L);
            }
            0FI.A0B(-527892635, A05);
        }
    }

    /* loaded from: MapView$AttributionClickListener.class */
    public class AttributionClickListener implements View.OnClickListener {
        public final AttributionDialogManager defaultDialogManager;
        public UiSettings uiSettings;

        public AttributionClickListener(Context context, MapboxMap mapboxMap) {
            this.defaultDialogManager = new AttributionDialogManager(context, mapboxMap);
            this.uiSettings = mapboxMap.uiSettings;
        }

        public /* synthetic */ AttributionClickListener(Context context, MapboxMap mapboxMap, AnonymousClass1 anonymousClass1) {
            this(context, mapboxMap);
        }

        private AttributionDialogManager getDialogManager() {
            AttributionDialogManager attributionDialogManager = this.uiSettings.attributionDialogManager;
            if (attributionDialogManager == null) {
                attributionDialogManager = this.defaultDialogManager;
            }
            return attributionDialogManager;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int A05 = 0FI.A05(-659858166);
            getDialogManager().onClick(view);
            0FI.A0B(-1386997346, A05);
        }

        public void onStop() {
            getDialogManager().onStop();
        }
    }

    /* loaded from: MapView$FocalPointInvalidator.class */
    public class FocalPointInvalidator implements FocalPointChangeListener {
        public final List focalPointChangeListeners;

        public FocalPointInvalidator() {
            this.focalPointChangeListeners = AnonymousClass001.A0s();
        }

        public /* synthetic */ FocalPointInvalidator(MapView mapView, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void addListener(FocalPointChangeListener focalPointChangeListener) {
            this.focalPointChangeListeners.add(focalPointChangeListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.FocalPointChangeListener
        public void onFocalPointChanged(PointF pointF) {
            MapView.this.mapGestureDetector.setFocalPoint(pointF);
            Iterator it = this.focalPointChangeListeners.iterator();
            while (it.hasNext()) {
                ((FocalPointChangeListener) it.next()).onFocalPointChanged(pointF);
            }
        }
    }

    /* loaded from: MapView$GesturesManagerInteractionListener.class */
    public class GesturesManagerInteractionListener implements MapboxMap.OnGesturesManagerInteractionListener {
        public GesturesManagerInteractionListener() {
        }

        public /* synthetic */ GesturesManagerInteractionListener(MapView mapView, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void cancelAllVelocityAnimations() {
            MapView.this.mapGestureDetector.cancelAnimators();
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public LCT getGesturesManager() {
            return MapView.this.mapGestureDetector.gesturesManager;
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onAddFlingListener(MapboxMap.OnFlingListener onFlingListener) {
            MapView.this.mapGestureDetector.addOnFlingListener(onFlingListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onAddMapClickListener(MapboxMap.OnMapClickListener onMapClickListener) {
            MapView.this.mapGestureDetector.addOnMapClickListener(onMapClickListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onAddMapDoubleClickListener(MapboxMap.OnMapDoubleClickListener onMapDoubleClickListener) {
            MapView.this.mapGestureDetector.addOnMapDoubleClickListener(onMapDoubleClickListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onAddMapLongClickListener(MapboxMap.OnMapLongClickListener onMapLongClickListener) {
            MapView.this.mapGestureDetector.addOnMapLongClickListener(onMapLongClickListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onAddMoveListener(MapboxMap.OnMoveListener onMoveListener) {
            MapView.this.mapGestureDetector.addOnMoveListener(onMoveListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onAddRotateListener(MapboxMap.OnRotateListener onRotateListener) {
            MapView.this.mapGestureDetector.addOnRotateListener(onRotateListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onAddScaleListener(MapboxMap.OnScaleListener onScaleListener) {
            MapView.this.mapGestureDetector.addOnScaleListener(onScaleListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onAddShoveListener(MapboxMap.OnShoveListener onShoveListener) {
            MapView.this.mapGestureDetector.addShoveListener(onShoveListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onRemoveFlingListener(MapboxMap.OnFlingListener onFlingListener) {
            MapView.this.mapGestureDetector.removeOnFlingListener(onFlingListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onRemoveMapClickListener(MapboxMap.OnMapClickListener onMapClickListener) {
            MapView.this.mapGestureDetector.removeOnMapClickListener(onMapClickListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onRemoveMapDoubleClickListener(MapboxMap.OnMapDoubleClickListener onMapDoubleClickListener) {
            MapView.this.mapGestureDetector.removeOnMapDoubleClickListener(onMapDoubleClickListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onRemoveMapLongClickListener(MapboxMap.OnMapLongClickListener onMapLongClickListener) {
            MapView.this.mapGestureDetector.removeOnMapLongClickListener(onMapLongClickListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onRemoveMoveListener(MapboxMap.OnMoveListener onMoveListener) {
            MapView.this.mapGestureDetector.removeOnMoveListener(onMoveListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onRemoveRotateListener(MapboxMap.OnRotateListener onRotateListener) {
            MapView.this.mapGestureDetector.removeOnRotateListener(onRotateListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onRemoveScaleListener(MapboxMap.OnScaleListener onScaleListener) {
            MapView.this.mapGestureDetector.removeOnScaleListener(onScaleListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void onRemoveShoveListener(MapboxMap.OnShoveListener onShoveListener) {
            MapView.this.mapGestureDetector.removeShoveListener(onShoveListener);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnGesturesManagerInteractionListener
        public void setGesturesManager(LCT lct, boolean z, boolean z2) {
            MapView mapView = MapView.this;
            mapView.mapGestureDetector.setGesturesManager(mapView.getContext(), lct, z, z2);
        }
    }

    /* loaded from: MapView$InitialRenderCallback.class */
    public class InitialRenderCallback implements OnDidFinishRenderingFrameListener {
        public int renderCount;

        public InitialRenderCallback() {
            MapView.this.addOnDidFinishRenderingFrameListener(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onDestroy() {
            MapView.this.removeOnDidFinishRenderingFrameListener(this);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapView.OnDidFinishRenderingFrameListener
        public void onDidFinishRenderingFrame(boolean z) {
            Style style;
            MapView mapView = MapView.this;
            MapboxMap mapboxMap = mapView.mapboxMap;
            if (mapboxMap == null || (style = mapboxMap.getStyle()) == null || !style.fullyLoaded) {
                return;
            }
            int i = this.renderCount + 1;
            this.renderCount = i;
            if (i == 3) {
                mapView.setForeground(null);
                MapView.this.removeOnDidFinishRenderingFrameListener(this);
            }
        }
    }

    /* loaded from: MapView$MapCallback.class */
    public class MapCallback implements OnCameraDidChangeListener, OnCameraIsChangingListener, OnDidFailLoadingMapListener, OnDidFinishLoadingMapListener, OnDidFinishLoadingStyleListener, OnDidFinishRenderingFrameListener {
        public final List onMapReadyCallbackList = AnonymousClass001.A0s();

        public MapCallback() {
            MapView.this.addOnDidFinishLoadingStyleListener(this);
            MapView.this.addOnDidFinishRenderingFrameListener(this);
            MapView.this.addOnDidFinishLoadingMapListener(this);
            MapView.this.addOnCameraIsChangingListener(this);
            MapView.this.addOnCameraDidChangeListener(this);
            MapView.this.addOnDidFailLoadingMapListener(this);
        }

        private void onMapReady() {
            if (this.onMapReadyCallbackList.size() > 0) {
                Iterator it = this.onMapReadyCallbackList.iterator();
                while (it.hasNext()) {
                    OnMapReadyCallback onMapReadyCallback = (OnMapReadyCallback) it.next();
                    if (onMapReadyCallback != null) {
                        onMapReadyCallback.onMapReady(MapView.this.mapboxMap);
                    }
                    it.remove();
                }
            }
        }

        public void addOnMapReadyCallback(OnMapReadyCallback onMapReadyCallback) {
            this.onMapReadyCallbackList.add(onMapReadyCallback);
        }

        public void initialised() {
            MapView.this.mapboxMap.onPreMapReady();
            onMapReady();
            MapView.this.mapboxMap.onPostMapReady();
        }

        @Override // com.mapbox.mapboxsdk.maps.MapView.OnCameraDidChangeListener
        public void onCameraDidChange(boolean z) {
            MapboxMap mapboxMap = MapView.this.mapboxMap;
            if (mapboxMap != null) {
                mapboxMap.onUpdateRegionChange();
            }
        }

        @Override // com.mapbox.mapboxsdk.maps.MapView.OnCameraIsChangingListener
        public void onCameraIsChanging() {
            MapboxMap mapboxMap = MapView.this.mapboxMap;
            if (mapboxMap != null) {
                mapboxMap.onUpdateRegionChange();
            }
        }

        public void onDestroy() {
            this.onMapReadyCallbackList.clear();
            MapView.this.removeOnDidFinishLoadingStyleListener(this);
            MapView.this.removeOnDidFinishRenderingFrameListener(this);
            MapView.this.removeOnDidFinishLoadingMapListener(this);
            MapView.this.removeOnCameraIsChangingListener(this);
            MapView.this.removeOnCameraDidChangeListener(this);
            MapView.this.removeOnDidFailLoadingMapListener(this);
        }

        @Override // com.mapbox.mapboxsdk.maps.MapView.OnDidFailLoadingMapListener
        public void onDidFailLoadingMap(String str) {
            MapboxMap mapboxMap = MapView.this.mapboxMap;
            if (mapboxMap != null) {
                mapboxMap.styleLoadedCallback = null;
            }
        }

        @Override // com.mapbox.mapboxsdk.maps.MapView.OnDidFinishLoadingMapListener
        public void onDidFinishLoadingMap() {
            MapboxMap mapboxMap = MapView.this.mapboxMap;
            if (mapboxMap != null) {
                mapboxMap.onUpdateRegionChange();
            }
        }

        @Override // com.mapbox.mapboxsdk.maps.MapView.OnDidFinishLoadingStyleListener
        public void onDidFinishLoadingStyle() {
            MapboxMap mapboxMap = MapView.this.mapboxMap;
            if (mapboxMap != null) {
                mapboxMap.notifyStyleLoaded();
            }
        }

        @Override // com.mapbox.mapboxsdk.maps.MapView.OnDidFinishRenderingFrameListener
        public void onDidFinishRenderingFrame(boolean z) {
            MapboxMap mapboxMap = MapView.this.mapboxMap;
            if (mapboxMap != null) {
                mapboxMap.onUpdateFullyRendered();
            }
        }
    }

    /* loaded from: MapView$OnCameraDidChangeListener.class */
    public interface OnCameraDidChangeListener {
        void onCameraDidChange(boolean z);
    }

    /* loaded from: MapView$OnCameraIsChangingListener.class */
    public interface OnCameraIsChangingListener {
        void onCameraIsChanging();
    }

    /* loaded from: MapView$OnCameraWillChangeListener.class */
    public interface OnCameraWillChangeListener {
        void onCameraWillChange(boolean z);
    }

    /* loaded from: MapView$OnCanRemoveUnusedStyleImageListener.class */
    public interface OnCanRemoveUnusedStyleImageListener {
        boolean onCanRemoveUnusedStyleImage(String str);
    }

    /* loaded from: MapView$OnDidBecomeIdleListener.class */
    public interface OnDidBecomeIdleListener {
        void onDidBecomeIdle();
    }

    /* loaded from: MapView$OnDidFailLoadingMapListener.class */
    public interface OnDidFailLoadingMapListener {
        void onDidFailLoadingMap(String str);
    }

    /* loaded from: MapView$OnDidFinishLoadingMapListener.class */
    public interface OnDidFinishLoadingMapListener {
        void onDidFinishLoadingMap();
    }

    /* loaded from: MapView$OnDidFinishLoadingStyleListener.class */
    public interface OnDidFinishLoadingStyleListener {
        void onDidFinishLoadingStyle();
    }

    /* loaded from: MapView$OnDidFinishRenderingFrameListener.class */
    public interface OnDidFinishRenderingFrameListener {
        void onDidFinishRenderingFrame(boolean z);
    }

    /* loaded from: MapView$OnDidFinishRenderingMapListener.class */
    public interface OnDidFinishRenderingMapListener {
        void onDidFinishRenderingMap(boolean z);
    }

    /* loaded from: MapView$OnSourceChangedListener.class */
    public interface OnSourceChangedListener {
        void onSourceChangedListener(String str);
    }

    /* loaded from: MapView$OnStyleImageMissingListener.class */
    public interface OnStyleImageMissingListener {
        void onStyleImageMissing(String str);
    }

    /* loaded from: MapView$OnWillStartLoadingMapListener.class */
    public interface OnWillStartLoadingMapListener {
        void onWillStartLoadingMap();
    }

    /* loaded from: MapView$OnWillStartRenderingFrameListener.class */
    public interface OnWillStartRenderingFrameListener {
        void onWillStartRenderingFrame();
    }

    /* loaded from: MapView$OnWillStartRenderingMapListener.class */
    public interface OnWillStartRenderingMapListener {
        void onWillStartRenderingMap();
    }

    public MapView(Context context) {
        super(context);
        this.mapChangeReceiver = new MapChangeReceiver();
        this.mapCallback = new MapCallback();
        this.initialRenderCallback = new InitialRenderCallback();
        initialize(context, MapboxMapOptions.createFromAttributes(context, null));
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mapChangeReceiver = new MapChangeReceiver();
        this.mapCallback = new MapCallback();
        this.initialRenderCallback = new InitialRenderCallback();
        initialize(context, MapboxMapOptions.createFromAttributes(context, attributeSet));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mapChangeReceiver = new MapChangeReceiver();
        this.mapCallback = new MapCallback();
        this.initialRenderCallback = new InitialRenderCallback();
        initialize(context, MapboxMapOptions.createFromAttributes(context, attributeSet));
    }

    public MapView(Context context, MapboxMapOptions mapboxMapOptions) {
        super(context);
        this.mapChangeReceiver = new MapChangeReceiver();
        this.mapCallback = new MapCallback();
        this.initialRenderCallback = new InitialRenderCallback();
        initialize(context, mapboxMapOptions == null ? MapboxMapOptions.createFromAttributes(context, null) : mapboxMapOptions);
    }

    private MapboxMap.OnCompassAnimationListener createCompassAnimationListener(CameraChangeDispatcher cameraChangeDispatcher) {
        return new AnonymousClass2(cameraChangeDispatcher);
    }

    private View.OnClickListener createCompassClickListener(CameraChangeDispatcher cameraChangeDispatcher) {
        return new AnonymousClass3(cameraChangeDispatcher);
    }

    private FocalPointChangeListener createFocalPointChangeListener() {
        return new AnonymousClass1();
    }

    private float getPixelRatio() {
        float f = this.mapboxMapOptions.pixelRatio;
        if (f == 0.0f) {
            f = DKD.A09(this).density;
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initialiseDrawingSurface(MapboxMapOptions mapboxMapOptions) {
        MapRenderer mapRenderer;
        MapboxGLSurfaceView mapboxGLSurfaceView;
        String str = mapboxMapOptions.localIdeographFontFamily;
        boolean z = mapboxMapOptions.textureMode;
        Context context = getContext();
        if (z) {
            TextureView textureView = new TextureView(context);
            mapRenderer = new TextureViewMapRenderer(context, textureView, str, mapboxMapOptions.translucentTextureSurface) { // from class: com.mapbox.mapboxsdk.maps.MapView.4
                @Override // com.mapbox.mapboxsdk.maps.renderer.textureview.TextureViewMapRenderer, com.mapbox.mapboxsdk.maps.renderer.MapRenderer
                public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                    MapView.this.onSurfaceCreated();
                    super.onSurfaceCreated(gl10, eGLConfig);
                }
            };
            mapboxGLSurfaceView = textureView;
        } else {
            MapboxGLSurfaceView mapboxGLSurfaceView2 = new MapboxGLSurfaceView(context);
            mapboxGLSurfaceView2.setZOrderMediaOverlay(this.mapboxMapOptions.zMediaOverlay);
            mapRenderer = new GLSurfaceViewMapRenderer(context, mapboxGLSurfaceView2, str) { // from class: com.mapbox.mapboxsdk.maps.MapView.5
                @Override // com.mapbox.mapboxsdk.maps.renderer.glsurfaceview.GLSurfaceViewMapRenderer, com.mapbox.mapboxsdk.maps.renderer.MapRenderer
                public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                    MapView.this.onSurfaceCreated();
                    super.onSurfaceCreated(gl10, eGLConfig);
                }
            };
            mapboxGLSurfaceView = mapboxGLSurfaceView2;
        }
        this.mapRenderer = mapRenderer;
        addView(mapboxGLSurfaceView, 0);
        boolean z2 = this.mapboxMapOptions.crossSourceCollisions;
        String str2 = NativeMapView.TAG;
        this.nativeMapView = new NativeMapView(context, getPixelRatio(), z2, this, this.mapChangeReceiver, this.mapRenderer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialiseMap() {
        Context context = getContext();
        FocalPointInvalidator focalPointInvalidator = new FocalPointInvalidator();
        focalPointInvalidator.addListener(new AnonymousClass1());
        GesturesManagerInteractionListener gesturesManagerInteractionListener = new GesturesManagerInteractionListener();
        CameraChangeDispatcher cameraChangeDispatcher = new CameraChangeDispatcher();
        Projection projection = new Projection(this.nativeMapView, this);
        UiSettings uiSettings = new UiSettings(projection, focalPointInvalidator, this.compassView, this.attrView, this.logoView, getPixelRatio());
        C00p c00p = new C00p();
        NativeMap nativeMap = this.nativeMapView;
        IconManager iconManager = new IconManager(nativeMap);
        AnnotationManager annotationManager = new AnnotationManager(this, c00p, iconManager, new AnnotationContainer(nativeMap, c00p), new MarkerContainer(nativeMap, c00p, iconManager), new PolygonContainer(nativeMap, c00p), new PolylineContainer(nativeMap, c00p), new ShapeAnnotationContainer(nativeMap, c00p));
        Transform transform = new Transform(this, nativeMap, cameraChangeDispatcher);
        ArrayList A0s = AnonymousClass001.A0s();
        MapboxMap mapboxMap = new MapboxMap(this.nativeMapView, transform, uiSettings, projection, gesturesManagerInteractionListener, cameraChangeDispatcher, A0s);
        this.mapboxMap = mapboxMap;
        mapboxMap.injectAnnotationManager(annotationManager);
        MapGestureDetector mapGestureDetector = new MapGestureDetector(context, transform, projection, uiSettings, annotationManager, cameraChangeDispatcher);
        this.mapGestureDetector = mapGestureDetector;
        this.mapKeyListener = new MapKeyListener(transform, uiSettings, mapGestureDetector);
        CompassView compassView = this.compassView;
        compassView.compassAnimationListener = new AnonymousClass2(cameraChangeDispatcher);
        compassView.setOnClickListener(new AnonymousClass3(cameraChangeDispatcher));
        MapboxMap mapboxMap2 = this.mapboxMap;
        mapboxMap2.locationComponent = new LocationComponent(mapboxMap2, transform, A0s);
        ImageView imageView = this.attrView;
        AttributionClickListener attributionClickListener = new AttributionClickListener(context, this.mapboxMap);
        this.attributionClickListener = attributionClickListener;
        imageView.setOnClickListener(attributionClickListener);
        setClickable(true);
        setLongClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestDisallowInterceptTouchEvent(true);
        this.nativeMapView.setReachability(Mapbox.isConnected().booleanValue());
        Bundle bundle = this.savedInstanceState;
        if (bundle == null) {
            this.mapboxMap.initialise(context, this.mapboxMapOptions);
        } else {
            this.mapboxMap.onRestoreInstanceState(bundle);
        }
        this.mapCallback.initialised();
    }

    private boolean isGestureDetectorInitialized() {
        return AnonymousClass001.A1T(this.mapGestureDetector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceCreated() {
        post(new Runnable() { // from class: com.mapbox.mapboxsdk.maps.MapView.6
            @Override // java.lang.Runnable
            public void run() {
                MapView mapView = MapView.this;
                if (mapView.destroyed || mapView.mapboxMap != null) {
                    return;
                }
                mapView.initialiseMap();
                MapView.this.mapboxMap.onStart();
            }
        });
    }

    public static void setMapStrictModeEnabled(boolean z) {
        MapStrictMode.setStrictModeEnabled(z);
    }

    public void addOnCameraDidChangeListener(OnCameraDidChangeListener onCameraDidChangeListener) {
        this.mapChangeReceiver.addOnCameraDidChangeListener(onCameraDidChangeListener);
    }

    public void addOnCameraIsChangingListener(OnCameraIsChangingListener onCameraIsChangingListener) {
        this.mapChangeReceiver.addOnCameraIsChangingListener(onCameraIsChangingListener);
    }

    public void addOnCameraWillChangeListener(OnCameraWillChangeListener onCameraWillChangeListener) {
        this.mapChangeReceiver.addOnCameraWillChangeListener(onCameraWillChangeListener);
    }

    public void addOnCanRemoveUnusedStyleImageListener(OnCanRemoveUnusedStyleImageListener onCanRemoveUnusedStyleImageListener) {
        this.mapChangeReceiver.addOnCanRemoveUnusedStyleImageListener(onCanRemoveUnusedStyleImageListener);
    }

    public void addOnDidBecomeIdleListener(OnDidBecomeIdleListener onDidBecomeIdleListener) {
        this.mapChangeReceiver.addOnDidBecomeIdleListener(onDidBecomeIdleListener);
    }

    public void addOnDidFailLoadingMapListener(OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.mapChangeReceiver.addOnDidFailLoadingMapListener(onDidFailLoadingMapListener);
    }

    public void addOnDidFinishLoadingMapListener(OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.mapChangeReceiver.addOnDidFinishLoadingMapListener(onDidFinishLoadingMapListener);
    }

    public void addOnDidFinishLoadingStyleListener(OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.mapChangeReceiver.addOnDidFinishLoadingStyleListener(onDidFinishLoadingStyleListener);
    }

    public void addOnDidFinishRenderingFrameListener(OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.mapChangeReceiver.addOnDidFinishRenderingFrameListener(onDidFinishRenderingFrameListener);
    }

    public void addOnDidFinishRenderingMapListener(OnDidFinishRenderingMapListener onDidFinishRenderingMapListener) {
        this.mapChangeReceiver.addOnDidFinishRenderingMapListener(onDidFinishRenderingMapListener);
    }

    public void addOnSourceChangedListener(OnSourceChangedListener onSourceChangedListener) {
        this.mapChangeReceiver.addOnSourceChangedListener(onSourceChangedListener);
    }

    public void addOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        this.mapChangeReceiver.addOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    public void addOnWillStartLoadingMapListener(OnWillStartLoadingMapListener onWillStartLoadingMapListener) {
        this.mapChangeReceiver.addOnWillStartLoadingMapListener(onWillStartLoadingMapListener);
    }

    public void addOnWillStartRenderingFrameListener(OnWillStartRenderingFrameListener onWillStartRenderingFrameListener) {
        this.mapChangeReceiver.addOnWillStartRenderingFrameListener(onWillStartRenderingFrameListener);
    }

    public void addOnWillStartRenderingMapListener(OnWillStartRenderingMapListener onWillStartRenderingMapListener) {
        this.mapChangeReceiver.addOnWillStartRenderingMapListener(onWillStartRenderingMapListener);
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        MapboxMap mapboxMap = this.mapboxMap;
        if (mapboxMap == null) {
            this.mapCallback.addOnMapReadyCallback(onMapReadyCallback);
        } else {
            onMapReadyCallback.onMapReady(mapboxMap);
        }
    }

    public MapboxMap getMapboxMap() {
        return this.mapboxMap;
    }

    @Override // com.mapbox.mapboxsdk.maps.NativeMapView.ViewCallback
    public Bitmap getViewContent() {
        return BitmapUtils.createBitmapFromView(this);
    }

    public void initialize(Context context, MapboxMapOptions mapboxMapOptions) {
        if (isInEditMode()) {
            return;
        }
        if (!AnonymousClass001.A1T(Mapbox.INSTANCE)) {
            throw new MapboxConfigurationException();
        }
        setForeground(new ColorDrawable(mapboxMapOptions.foregroundLoadColor));
        this.mapboxMapOptions = mapboxMapOptions;
        View inflate = LayoutInflater.from(context).inflate(R.layout.mapbox_mapview_internal, this);
        this.compassView = (CompassView) inflate.findViewById(R.id.compassView);
        ImageView A0I = GOn.A0I(inflate, R.id.attributionView);
        this.attrView = A0I;
        Context context2 = getContext();
        A0I.setImageDrawable(BitmapUtils.getDrawableFromRes(context2, R.drawable.mapbox_info_bg_selector, null));
        ImageView A0I2 = GOn.A0I(inflate, R.id.logoView);
        this.logoView = A0I2;
        A0I2.setImageDrawable(BitmapUtils.getDrawableFromRes(context2, 2132345653, null));
        GOo.A16(context, this, R.string.mapbox_mapActionDescription);
        setWillNotDraw(false);
        initialiseDrawingSurface(mapboxMapOptions);
    }

    public boolean isDestroyed() {
        return this.destroyed;
    }

    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getBoolean(MapboxConstants.STATE_HAS_SAVED_STATE)) {
                this.savedInstanceState = bundle;
            }
        } else {
            TelemetryDefinition telemetryDefinition = Mapbox.INSTANCE.telemetry;
            if (telemetryDefinition != null) {
                telemetryDefinition.onAppUserTurnstileEvent();
            }
        }
    }

    public void onDestroy() {
        this.destroyed = true;
        this.mapChangeReceiver.clear();
        this.mapCallback.onDestroy();
        this.initialRenderCallback.onDestroy();
        CompassView compassView = this.compassView;
        if (compassView != null) {
            compassView.resetAnimation();
        }
        MapboxMap mapboxMap = this.mapboxMap;
        if (mapboxMap != null) {
            mapboxMap.onDestroy();
        }
        NativeMap nativeMap = this.nativeMapView;
        if (nativeMap != null) {
            nativeMap.destroy();
            this.nativeMapView = null;
        }
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer != null) {
            mapRenderer.onDestroy();
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        if (!AnonymousClass001.A1T(this.mapGestureDetector)) {
            z = super.onGenericMotionEvent(motionEvent);
        } else {
            if (this.mapGestureDetector.onGenericMotionEvent(motionEvent)) {
                return true;
            }
            z = false;
            if (super.onGenericMotionEvent(motionEvent)) {
                return true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (super.onKeyDown(r302, r303) != false) goto L6;
     */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r302, android.view.KeyEvent r303) {
        /*
            r301 = this;
            r0 = r301
            com.mapbox.mapboxsdk.maps.MapKeyListener r0 = r0.mapKeyListener
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r303
            boolean r0 = r0.onKeyDown(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L24
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = super.onKeyDown(r1, r2)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L27
        L24:
            r0 = 1
            r305 = r0
        L27:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapView.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (super.onKeyLongPress(r302, r303) != false) goto L6;
     */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyLongPress(int r302, android.view.KeyEvent r303) {
        /*
            r301 = this;
            r0 = r301
            com.mapbox.mapboxsdk.maps.MapKeyListener r0 = r0.mapKeyListener
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r303
            boolean r0 = r0.onKeyLongPress(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L24
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = super.onKeyLongPress(r1, r2)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L27
        L24:
            r0 = 1
            r305 = r0
        L27:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapView.onKeyLongPress(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (super.onKeyUp(r302, r303) != false) goto L6;
     */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyUp(int r302, android.view.KeyEvent r303) {
        /*
            r301 = this;
            r0 = r301
            com.mapbox.mapboxsdk.maps.MapKeyListener r0 = r0.mapKeyListener
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r303
            boolean r0 = r0.onKeyUp(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L24
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = super.onKeyUp(r1, r2)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L27
        L24:
            r0 = 1
            r305 = r0
        L27:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapView.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    public void onLowMemory() {
        NativeMap nativeMap = this.nativeMapView;
        if (nativeMap == null || this.mapboxMap == null || this.destroyed) {
            return;
        }
        nativeMap.onLowMemory();
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.mapboxMap != null) {
            bundle.putBoolean(MapboxConstants.STATE_HAS_SAVED_STATE, true);
            this.mapboxMap.onSaveInstanceState(bundle);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        NativeMap nativeMap;
        int A06 = 0FI.A06(1296930412);
        if (!isInEditMode() && (nativeMap = this.nativeMapView) != null) {
            nativeMap.resizeView(i, i2);
        }
        0FI.A0C(169829999, A06);
    }

    public void onStart() {
        if (!this.isStarted) {
            Context context = getContext();
            ConnectivityReceiver.instance(context).activate();
            FileSource.getInstance(context).activate();
            this.isStarted = true;
        }
        MapboxMap mapboxMap = this.mapboxMap;
        if (mapboxMap != null) {
            mapboxMap.onStart();
        }
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer != null) {
            mapRenderer.onStart();
        }
    }

    public void onStop() {
        AttributionClickListener attributionClickListener = this.attributionClickListener;
        if (attributionClickListener != null) {
            attributionClickListener.onStop();
        }
        if (this.mapboxMap != null) {
            this.mapGestureDetector.cancelAnimators();
            this.mapboxMap.onStop();
        }
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer != null) {
            mapRenderer.onStop();
        }
        if (this.isStarted) {
            Context context = getContext();
            ConnectivityReceiver.instance(context).deactivate();
            FileSource.getInstance(context).deactivate();
            this.isStarted = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (super.onTouchEvent(r302) != false) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = -13839394(0xffffffffff2cd3de, float:-2.297273E38)
            int r0 = X.0FI.A05(r0)
            r303 = r0
            r0 = r301
            com.mapbox.mapboxsdk.maps.MapGestureDetector r0 = r0.mapGestureDetector
            r304 = r0
            r0 = r304
            boolean r0 = X.AnonymousClass001.A1T(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L2c
            r0 = r301
            r1 = r302
            boolean r0 = super.onTouchEvent(r1)
            r306 = r0
            r0 = -405264452(0xffffffffe7d827bc, float:-2.0415283E24)
            r305 = r0
        L23:
            r0 = r305
            r1 = r303
            X.0FI.A0B(r0, r1)
            r0 = r306
            return r0
        L2c:
            r0 = r301
            com.mapbox.mapboxsdk.maps.MapGestureDetector r0 = r0.mapGestureDetector
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.onTouchEvent(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4c
            r0 = r301
            r1 = r302
            boolean r0 = super.onTouchEvent(r1)
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L4f
        L4c:
            r0 = 1
            r306 = r0
        L4f:
            r0 = -1951007017(0xffffffff8bb5fed7, float:-7.0102104E-32)
            r305 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (super.onTrackballEvent(r302) != false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTrackballEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = r301
            com.mapbox.mapboxsdk.maps.MapKeyListener r0 = r0.mapKeyListener
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.onTrackballEvent(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1f
            r0 = r301
            r1 = r302
            boolean r0 = super.onTrackballEvent(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L21
        L1f:
            r0 = 1
            r304 = r0
        L21:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapView.onTrackballEvent(android.view.MotionEvent):boolean");
    }

    public void removeOnCameraDidChangeListener(OnCameraDidChangeListener onCameraDidChangeListener) {
        this.mapChangeReceiver.removeOnCameraDidChangeListener(onCameraDidChangeListener);
    }

    public void removeOnCameraIsChangingListener(OnCameraIsChangingListener onCameraIsChangingListener) {
        this.mapChangeReceiver.removeOnCameraIsChangingListener(onCameraIsChangingListener);
    }

    public void removeOnCameraWillChangeListener(OnCameraWillChangeListener onCameraWillChangeListener) {
        this.mapChangeReceiver.removeOnCameraWillChangeListener(onCameraWillChangeListener);
    }

    public void removeOnCanRemoveUnusedStyleImageListener(OnCanRemoveUnusedStyleImageListener onCanRemoveUnusedStyleImageListener) {
        this.mapChangeReceiver.removeOnCanRemoveUnusedStyleImageListener(onCanRemoveUnusedStyleImageListener);
    }

    public void removeOnDidBecomeIdleListener(OnDidBecomeIdleListener onDidBecomeIdleListener) {
        this.mapChangeReceiver.removeOnDidBecomeIdleListener(onDidBecomeIdleListener);
    }

    public void removeOnDidFailLoadingMapListener(OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.mapChangeReceiver.removeOnDidFailLoadingMapListener(onDidFailLoadingMapListener);
    }

    public void removeOnDidFinishLoadingMapListener(OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.mapChangeReceiver.removeOnDidFinishLoadingMapListener(onDidFinishLoadingMapListener);
    }

    public void removeOnDidFinishLoadingStyleListener(OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.mapChangeReceiver.removeOnDidFinishLoadingStyleListener(onDidFinishLoadingStyleListener);
    }

    public void removeOnDidFinishRenderingFrameListener(OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.mapChangeReceiver.removeOnDidFinishRenderingFrameListener(onDidFinishRenderingFrameListener);
    }

    public void removeOnDidFinishRenderingMapListener(OnDidFinishRenderingMapListener onDidFinishRenderingMapListener) {
        this.mapChangeReceiver.removeOnDidFinishRenderingMapListener(onDidFinishRenderingMapListener);
    }

    public void removeOnSourceChangedListener(OnSourceChangedListener onSourceChangedListener) {
        this.mapChangeReceiver.removeOnSourceChangedListener(onSourceChangedListener);
    }

    public void removeOnStyleImageMissingListener(OnStyleImageMissingListener onStyleImageMissingListener) {
        this.mapChangeReceiver.removeOnStyleImageMissingListener(onStyleImageMissingListener);
    }

    public void removeOnWillStartLoadingMapListener(OnWillStartLoadingMapListener onWillStartLoadingMapListener) {
        this.mapChangeReceiver.removeOnWillStartLoadingMapListener(onWillStartLoadingMapListener);
    }

    public void removeOnWillStartRenderingFrameListener(OnWillStartRenderingFrameListener onWillStartRenderingFrameListener) {
        this.mapChangeReceiver.removeOnWillStartRenderingFrameListener(onWillStartRenderingFrameListener);
    }

    public void removeOnWillStartRenderingMapListener(OnWillStartRenderingMapListener onWillStartRenderingMapListener) {
        this.mapChangeReceiver.removeOnWillStartRenderingMapListener(onWillStartRenderingMapListener);
    }

    public void setMapboxMap(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
    }

    public void setMaximumFps(int i) {
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer == null) {
            throw AnonymousClass001.A0N("Calling MapView#setMaximumFps before mapRenderer is created.");
        }
        mapRenderer.setMaximumFps(i);
    }
}
