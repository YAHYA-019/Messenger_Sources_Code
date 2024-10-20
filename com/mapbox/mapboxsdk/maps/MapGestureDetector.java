package com.mapbox.mapboxsdk.maps;

import X.0K6;
import X.7zN;
import X.AnonymousClass001;
import X.DKC;
import X.DKD;
import X.GOq;
import X.JQx;
import X.JR0;
import X.KK1;
import X.KK2;
import X.KK3;
import X.KK5;
import X.KK6;
import X.KK7;
import X.KK8;
import X.LCT;
import X.MGh;
import X.MJi;
import X.MJj;
import X.MJk;
import X.MJl;
import X.MMl;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: MapGestureDetector.class */
public final class MapGestureDetector {
    public final AnnotationManager annotationManager;
    public final CameraChangeDispatcher cameraChangeDispatcher;
    public PointF constantFocalPoint;
    public boolean doubleTapRegistered;
    public LCT gesturesManager;
    public final Projection projection;
    public Animator rotateAnimator;
    public Animator scaleAnimator;
    public final Transform transform;
    public final UiSettings uiSettings;
    public final CopyOnWriteArrayList onMapClickListenerList = JQx.A14();
    public final CopyOnWriteArrayList onMapDoubleClickListenerList = JQx.A14();
    public final CopyOnWriteArrayList onMapLongClickListenerList = JQx.A14();
    public final CopyOnWriteArrayList onFlingListenerList = JQx.A14();
    public final CopyOnWriteArrayList onMoveListenerList = JQx.A14();
    public final CopyOnWriteArrayList onRotateListenerList = JQx.A14();
    public final CopyOnWriteArrayList onScaleListenerList = JQx.A14();
    public final CopyOnWriteArrayList onShoveListenerList = JQx.A14();
    public final List scheduledAnimators = AnonymousClass001.A0s();
    public Handler animationsTimeoutHandler = new Handler();
    public final Runnable cancelAnimatorsRunnable = new Runnable() { // from class: com.mapbox.mapboxsdk.maps.MapGestureDetector.1
        @Override // java.lang.Runnable
        public void run() {
            MapGestureDetector.this.cancelAnimators();
        }
    };

    /* loaded from: MapGestureDetector$MoveGestureListener.class */
    public final class MoveGestureListener implements MJi {
        public MoveGestureListener() {
        }

        public MoveGestureListener() {
        }

        @Override // X.MJi
        public boolean onMove(KK6 kk6, float f, float f2) {
            if (f != 0.0f || f2 != 0.0f) {
                MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
                MapGestureDetector.this.transform.moveBy(-f, -f2, 0L);
                MapGestureDetector.this.notifyOnMoveListeners(kk6);
            }
            return true;
        }

        @Override // X.MJi
        public boolean onMoveBegin(KK6 kk6) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (!mapGestureDetector.uiSettings.scrollGesturesEnabled) {
                return false;
            }
            mapGestureDetector.cancelTransitionsIfRequired();
            MapGestureDetector.this.notifyOnMoveBeginListeners(kk6);
            return true;
        }

        @Override // X.MJi
        public void onMoveEnd(KK6 kk6, float f, float f2) {
            MapGestureDetector.this.dispatchCameraIdle();
            MapGestureDetector.this.notifyOnMoveEndListeners(kk6);
        }
    }

    /* loaded from: MapGestureDetector$RotateGestureListener.class */
    public final class RotateGestureListener implements MJj {
        public final float defaultSpanSinceStartThreshold;
        public final float minimumAngularVelocity;
        public final float minimumScaleSpanWhenRotating;

        public RotateGestureListener() {
        }

        public RotateGestureListener(float f, float f2, float f3) {
            this.minimumScaleSpanWhenRotating = f;
            this.minimumAngularVelocity = f2;
            this.defaultSpanSinceStartThreshold = f3;
        }

        private Animator createRotateAnimator(float f, long j, final PointF pointF) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
            ofFloat.setDuration(j);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mapbox.mapboxsdk.maps.MapGestureDetector.RotateGestureListener.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Transform transform = MapGestureDetector.this.transform;
                    double bearing = transform.nativeMap.getBearing() + JR0.A01(valueAnimator);
                    PointF pointF2 = pointF;
                    transform.setBearing(bearing, pointF2.x, pointF2.y, 0L);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.mapbox.mapboxsdk.maps.MapGestureDetector.RotateGestureListener.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    MapGestureDetector.this.transform.cancelTransitions();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    MapGestureDetector.this.dispatchCameraIdle();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    MapGestureDetector.this.transform.cancelTransitions();
                    MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(3);
                }
            });
            return ofFloat;
        }

        private PointF getRotateFocalPoint(KK2 kk2) {
            PointF pointF = MapGestureDetector.this.constantFocalPoint;
            if (pointF == null) {
                pointF = ((KK8) kk2).A01;
            }
            return pointF;
        }

        @Override // X.MJj
        public boolean onRotate(KK2 kk2, float f, float f2) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            double bearing = MapGestureDetector.this.transform.nativeMap.getBearing() + f;
            PointF rotateFocalPoint = getRotateFocalPoint(kk2);
            MapGestureDetector.this.transform.setBearing(bearing, rotateFocalPoint.x, rotateFocalPoint.y);
            MapGestureDetector.this.notifyOnRotateListeners(kk2);
            return true;
        }

        @Override // X.MJj
        public boolean onRotateBegin(KK2 kk2) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (!mapGestureDetector.uiSettings.rotateGesturesEnabled) {
                return false;
            }
            mapGestureDetector.cancelTransitionsIfRequired();
            MapGestureDetector mapGestureDetector2 = MapGestureDetector.this;
            if (mapGestureDetector2.uiSettings.increaseScaleThresholdWhenRotating) {
                KK5 kk5 = mapGestureDetector2.gesturesManager.standardScaleGestureDetector;
                kk5.A01 = this.minimumScaleSpanWhenRotating;
                kk5.A09();
            }
            MapGestureDetector.this.notifyOnRotateBeginListeners(kk2);
            return true;
        }

        @Override // X.MJj
        public void onRotateEnd(KK2 kk2, float f, float f2, float f3) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (mapGestureDetector.uiSettings.increaseScaleThresholdWhenRotating) {
                mapGestureDetector.gesturesManager.standardScaleGestureDetector.A01 = this.defaultSpanSinceStartThreshold;
            }
            mapGestureDetector.notifyOnRotateEndListeners(kk2);
            MapGestureDetector mapGestureDetector2 = MapGestureDetector.this;
            if (!mapGestureDetector2.uiSettings.rotateVelocityAnimationEnabled || Math.abs(f3) < this.minimumAngularVelocity) {
                mapGestureDetector2.dispatchCameraIdle();
                return;
            }
            boolean A1U = DKD.A1U((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)));
            float A03 = JQx.A03(20.0f, (float) Math.pow(f3, 2.0d), 1.5f);
            long log = (long) (Math.log(1.0f + A03) * 500.0d);
            if (A1U) {
                A03 = -A03;
            }
            mapGestureDetector2.rotateAnimator = createRotateAnimator(A03, log, getRotateFocalPoint(kk2));
            MapGestureDetector mapGestureDetector3 = MapGestureDetector.this;
            mapGestureDetector3.scheduleAnimator(mapGestureDetector3.rotateAnimator);
        }
    }

    /* loaded from: MapGestureDetector$ScaleGestureListener.class */
    public final class ScaleGestureListener implements MJl {
        public final float minimumVelocity;
        public boolean quickZoom;

        public ScaleGestureListener() {
        }

        public ScaleGestureListener(float f) {
            this.minimumVelocity = f;
        }

        private double calculateScale(double d, boolean z) {
            double log = (float) Math.log((d / 1000.0d) + 1.0d);
            if (z) {
                log = -log;
            }
            return log;
        }

        private double getNewZoom(float f, boolean z) {
            double log = (Math.log(f) / Math.log(1.5707963267948966d)) * 0.6499999761581421d * MapGestureDetector.this.uiSettings.zoomRate;
            if (z) {
                boolean A1U = DKD.A1U((log > 0.0d ? 1 : (log == 0.0d ? 0 : -1)));
                log = Math.max(0.0d, Math.min(0.15000000596046448d, Math.abs(log)));
                if (A1U) {
                    log = -log;
                }
            }
            return log;
        }

        private PointF getScaleFocalPoint(KK5 kk5) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            PointF pointF = mapGestureDetector.constantFocalPoint;
            if (pointF == null) {
                if (!this.quickZoom) {
                    return ((KK8) kk5).A01;
                }
                pointF = new PointF(mapGestureDetector.uiSettings.getWidth() / 2.0f, MapGestureDetector.this.uiSettings.getHeight() / 2.0f);
            }
            return pointF;
        }

        @Override // X.MJl
        public boolean onScale(KK5 kk5) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            MapGestureDetector.this.transform.zoomBy(getNewZoom(kk5.A04.getScaleFactor(), this.quickZoom), getScaleFocalPoint(kk5));
            MapGestureDetector.this.notifyOnScaleListeners(kk5);
            return true;
        }

        @Override // X.MJl
        public boolean onScaleBegin(KK5 kk5) {
            boolean A1Q = AnonymousClass001.A1Q(((KK8) kk5).A04.size(), 1);
            this.quickZoom = A1Q;
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            UiSettings uiSettings = mapGestureDetector.uiSettings;
            if (!uiSettings.zoomGesturesEnabled) {
                return false;
            }
            if (A1Q) {
                if (!uiSettings.quickZoomGesturesEnabled) {
                    return false;
                }
                KK6 kk6 = mapGestureDetector.gesturesManager.moveGestureDetector;
                kk6.A04 = false;
                kk6.A09();
            }
            MapGestureDetector.this.cancelTransitionsIfRequired();
            MapGestureDetector mapGestureDetector2 = MapGestureDetector.this;
            if (mapGestureDetector2.uiSettings.increaseRotateThresholdWhenScaling) {
                mapGestureDetector2.gesturesManager.rotateGestureDetector.A00 = 40.3f;
            }
            mapGestureDetector2.notifyOnScaleBeginListeners(kk5);
            return true;
        }

        @Override // X.MJl
        public void onScaleEnd(KK5 kk5, float f, float f2) {
            if (this.quickZoom) {
                MapGestureDetector.this.gesturesManager.moveGestureDetector.A04 = true;
            }
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (mapGestureDetector.uiSettings.increaseRotateThresholdWhenScaling) {
                mapGestureDetector.gesturesManager.rotateGestureDetector.A00 = 15.3f;
            }
            mapGestureDetector.notifyOnScaleEndListeners(kk5);
            float abs = Math.abs(f) + Math.abs(f2);
            MapGestureDetector mapGestureDetector2 = MapGestureDetector.this;
            if (!mapGestureDetector2.uiSettings.scaleVelocityAnimationEnabled || abs < this.minimumVelocity) {
                mapGestureDetector2.dispatchCameraIdle();
                return;
            }
            double calculateScale = calculateScale(abs, kk5.A05);
            double zoom = mapGestureDetector2.transform.nativeMap.getZoom();
            PointF scaleFocalPoint = getScaleFocalPoint(kk5);
            long abs2 = (long) ((Math.abs(calculateScale) * 1000.0d) / 4.0d);
            MapGestureDetector mapGestureDetector3 = MapGestureDetector.this;
            mapGestureDetector3.scaleAnimator = mapGestureDetector3.createScaleAnimator(zoom, calculateScale, scaleFocalPoint, abs2);
            MapGestureDetector mapGestureDetector4 = MapGestureDetector.this;
            mapGestureDetector4.scheduleAnimator(mapGestureDetector4.scaleAnimator);
        }
    }

    /* loaded from: MapGestureDetector$ShoveGestureListener.class */
    public final class ShoveGestureListener implements MJk {
        public ShoveGestureListener() {
        }

        public ShoveGestureListener() {
        }

        @Override // X.MJk
        public boolean onShove(KK3 kk3, float f, float f2) {
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            MapGestureDetector.this.transform.setTilt(Double.valueOf(Math.max(0.0d, Math.min(60.0d, MapGestureDetector.this.transform.nativeMap.getPitch() - (f * 0.1f)))));
            MapGestureDetector.this.notifyOnShoveListeners(kk3);
            return true;
        }

        @Override // X.MJk
        public boolean onShoveBegin(KK3 kk3) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (!mapGestureDetector.uiSettings.tiltGesturesEnabled) {
                return false;
            }
            mapGestureDetector.cancelTransitionsIfRequired();
            KK6 kk6 = MapGestureDetector.this.gesturesManager.moveGestureDetector;
            kk6.A04 = false;
            kk6.A09();
            MapGestureDetector.this.notifyOnShoveBeginListeners(kk3);
            return true;
        }

        @Override // X.MJk
        public void onShoveEnd(KK3 kk3, float f, float f2) {
            MapGestureDetector.this.dispatchCameraIdle();
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            mapGestureDetector.gesturesManager.moveGestureDetector.A04 = true;
            mapGestureDetector.notifyOnShoveEndListeners(kk3);
        }
    }

    /* loaded from: MapGestureDetector$StandardGestureListener.class */
    public final class StandardGestureListener implements MMl {
        public PointF doubleTapFocalPoint;
        public final float doubleTapMovementThreshold;

        public StandardGestureListener() {
        }

        public StandardGestureListener(float f) {
            this.doubleTapMovementThreshold = f;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                this.doubleTapFocalPoint = GOq.A0L(motionEvent);
                MapGestureDetector.this.doubleTapStarted();
            }
            if (motionEvent.getActionMasked() != 1) {
                return false;
            }
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (mapGestureDetector.uiSettings.doubleTapGesturesEnabled && !mapGestureDetector.onMapDoubleClickListenerList.isEmpty()) {
                MapGestureDetector.this.notifyOnMapDoubleClickListeners(this.doubleTapFocalPoint);
            }
            float A01 = DKC.A01(motionEvent.getX(), this.doubleTapFocalPoint.x);
            float y = motionEvent.getY();
            PointF pointF = this.doubleTapFocalPoint;
            float A012 = DKC.A01(y, pointF.y);
            float f = this.doubleTapMovementThreshold;
            if (A01 > f || A012 > f) {
                return false;
            }
            MapGestureDetector mapGestureDetector2 = MapGestureDetector.this;
            UiSettings uiSettings = mapGestureDetector2.uiSettings;
            if (!uiSettings.zoomGesturesEnabled || !uiSettings.doubleTapGesturesEnabled) {
                return false;
            }
            PointF pointF2 = mapGestureDetector2.constantFocalPoint;
            if (pointF2 != null) {
                this.doubleTapFocalPoint = pointF2;
                pointF = pointF2;
            }
            mapGestureDetector2.zoomInAnimated(pointF, false);
            return true;
        }

        public boolean onDoubleTapEvent$StandardGestureDetector$SimpleStandardOnGestureListener(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            boolean z = false;
            if (mapGestureDetector.uiSettings.scrollGesturesEnabled) {
                mapGestureDetector.notifyOnFlingListeners();
                MapGestureDetector mapGestureDetector2 = MapGestureDetector.this;
                UiSettings uiSettings = mapGestureDetector2.uiSettings;
                if (uiSettings.flingVelocityAnimationEnabled) {
                    float f3 = uiSettings.pixelRatio;
                    double hypot = Math.hypot(f / f3, f2 / f3);
                    if (hypot >= 1000.0d) {
                        mapGestureDetector2.transform.cancelTransitions();
                        z = true;
                        MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
                        double pitch = MapGestureDetector.this.transform.nativeMap.getPitch();
                        double d = 0.0d;
                        if (pitch != 0.0d) {
                            d = pitch / 10.0d;
                        }
                        double d2 = d + 1.5d;
                        double d3 = f / d2;
                        double d4 = f3;
                        MapGestureDetector.this.transform.moveBy(d3 / d4, (f2 / d2) / d4, (long) (((hypot / 7.0d) / d2) + 150.0d));
                    }
                }
            }
            return z;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            MapGestureDetector.this.notifyOnMapLongClickListeners(GOq.A0L(motionEvent));
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            PointF A0L = GOq.A0L(motionEvent);
            if (MapGestureDetector.this.annotationManager.onTap(A0L)) {
                return true;
            }
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (mapGestureDetector.uiSettings.deselectMarkersOnTap) {
                mapGestureDetector.annotationManager.deselectMarkers();
            }
            MapGestureDetector.this.notifyOnMapClickListeners(A0L);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            MapGestureDetector.this.transform.cancelTransitions();
            return true;
        }
    }

    /* loaded from: MapGestureDetector$TapGestureListener.class */
    public final class TapGestureListener implements MGh {
        public TapGestureListener() {
        }

        @Override // X.MGh
        public boolean onMultiFingerTap(KK1 kk1, int i) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (!mapGestureDetector.uiSettings.zoomGesturesEnabled || i != 2) {
                return false;
            }
            mapGestureDetector.transform.cancelTransitions();
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            MapGestureDetector mapGestureDetector2 = MapGestureDetector.this;
            PointF pointF = mapGestureDetector2.constantFocalPoint;
            if (pointF == null) {
                pointF = ((KK8) kk1).A01;
            }
            mapGestureDetector2.zoomOutAnimated(pointF, false);
            return true;
        }
    }

    public MapGestureDetector(Context context, Transform transform, Projection projection, UiSettings uiSettings, AnnotationManager annotationManager, CameraChangeDispatcher cameraChangeDispatcher) {
        this.annotationManager = annotationManager;
        this.transform = transform;
        this.projection = projection;
        this.uiSettings = uiSettings;
        this.cameraChangeDispatcher = cameraChangeDispatcher;
        if (context != null) {
            initializeGesturesManager(new LCT(context, true), true);
            initializeGestureListeners(context, true);
        }
    }

    private void cancelAnimator(Animator animator) {
        if (animator == null || !animator.isStarted()) {
            return;
        }
        animator.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTransitionsIfRequired() {
        if (noGesturesInProgress()) {
            this.transform.cancelTransitions();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animator createScaleAnimator(double d, double d2, final PointF pointF, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) d, (float) (d + d2));
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mapbox.mapboxsdk.maps.MapGestureDetector.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MapGestureDetector.this.transform.setZoom(JR0.A01(valueAnimator), pointF);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.mapbox.mapboxsdk.maps.MapGestureDetector.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                MapGestureDetector.this.transform.cancelTransitions();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MapGestureDetector.this.dispatchCameraIdle();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                MapGestureDetector.this.transform.cancelTransitions();
                MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(3);
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCameraIdle() {
        if (noGesturesInProgress()) {
            this.transform.invalidateCameraPosition();
            this.cameraChangeDispatcher.onCameraIdle();
        }
    }

    private void doubleTapFinished() {
        if (this.doubleTapRegistered) {
            this.gesturesManager.moveGestureDetector.A04 = true;
            this.doubleTapRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doubleTapStarted() {
        KK6 kk6 = this.gesturesManager.moveGestureDetector;
        kk6.A04 = false;
        kk6.A09();
        this.doubleTapRegistered = true;
    }

    private void initializeGestureListeners(Context context, boolean z) {
        if (z) {
            StandardGestureListener standardGestureListener = new StandardGestureListener(context.getResources().getDimension(2132279313));
            MoveGestureListener moveGestureListener = new MoveGestureListener();
            ScaleGestureListener scaleGestureListener = new ScaleGestureListener(context.getResources().getDimension(R.dimen.mapbox_minimum_scale_velocity));
            RotateGestureListener rotateGestureListener = new RotateGestureListener(context.getResources().getDimension(R.dimen.mapbox_minimum_scale_span_when_rotating), context.getResources().getDimension(R.dimen.mapbox_minimum_angular_velocity), context.getResources().getDimension(2132279313));
            ShoveGestureListener shoveGestureListener = new ShoveGestureListener();
            TapGestureListener tapGestureListener = new TapGestureListener();
            LCT lct = this.gesturesManager;
            lct.setStandardGestureListener(standardGestureListener);
            lct.setMoveGestureListener(moveGestureListener);
            lct.setStandardScaleGestureListener(scaleGestureListener);
            lct.setRotateGestureListener(rotateGestureListener);
            lct.setShoveGestureListener(shoveGestureListener);
            lct.setMultiFingerTapGestureListener(tapGestureListener);
        }
    }

    private void initializeGesturesManager(LCT lct, boolean z) {
        if (z) {
            HashSet A0v = AnonymousClass001.A0v();
            A0v.add(3);
            Integer A0i = 7zN.A0i();
            A0v.add(A0i);
            HashSet A0v2 = AnonymousClass001.A0v();
            A0v2.add(3);
            AnonymousClass001.A1J(A0v2, 2);
            HashSet A0v3 = AnonymousClass001.A0v();
            A0v3.add(A0i);
            AnonymousClass001.A1J(A0v3, 6);
            lct.setMutuallyExclusiveGestures(new Set[]{A0v, A0v2, A0v3});
        }
        this.gesturesManager = lct;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r302 > 25.5d) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isZoomValid(double r302) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 < 0) goto L1f
            r0 = 4627870829588250624(0x4039800000000000, double:25.5)
            r307 = r0
            r0 = r302
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r306 = r0
            r0 = r309
            if (r0 <= 0) goto L22
        L1f:
            r0 = 0
            r306 = r0
        L22:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapGestureDetector.isZoomValid(double):boolean");
    }

    private boolean noGesturesInProgress() {
        UiSettings uiSettings = this.uiSettings;
        if (uiSettings.scrollGesturesEnabled && ((KK7) this.gesturesManager.moveGestureDetector).A03) {
            return false;
        }
        if (uiSettings.zoomGesturesEnabled && ((KK7) this.gesturesManager.standardScaleGestureDetector).A03) {
            return false;
        }
        if (uiSettings.rotateGesturesEnabled && ((KK7) this.gesturesManager.rotateGestureDetector).A03) {
            return false;
        }
        return (uiSettings.tiltGesturesEnabled && ((KK7) this.gesturesManager.shoveGestureDetector).A03) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleAnimator(Animator animator) {
        this.scheduledAnimators.add(animator);
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
        this.animationsTimeoutHandler.postDelayed(this.cancelAnimatorsRunnable, 150L);
    }

    private void zoomAnimated(boolean z, PointF pointF, boolean z2) {
        cancelAnimator(this.scaleAnimator);
        Animator createScaleAnimator = createScaleAnimator(this.transform.nativeMap.getZoom(), z ? 1.0d : -1.0d, pointF, 300L);
        this.scaleAnimator = createScaleAnimator;
        if (z2) {
            0K6.A00(createScaleAnimator);
        } else {
            scheduleAnimator(createScaleAnimator);
        }
    }

    public void addOnFlingListener(MapboxMap.OnFlingListener onFlingListener) {
        this.onFlingListenerList.add(onFlingListener);
    }

    public void addOnMapClickListener(MapboxMap.OnMapClickListener onMapClickListener) {
        this.onMapClickListenerList.add(onMapClickListener);
    }

    public void addOnMapDoubleClickListener(MapboxMap.OnMapDoubleClickListener onMapDoubleClickListener) {
        this.onMapDoubleClickListenerList.add(onMapDoubleClickListener);
    }

    public void addOnMapLongClickListener(MapboxMap.OnMapLongClickListener onMapLongClickListener) {
        this.onMapLongClickListenerList.add(onMapLongClickListener);
    }

    public void addOnMoveListener(MapboxMap.OnMoveListener onMoveListener) {
        this.onMoveListenerList.add(onMoveListener);
    }

    public void addOnRotateListener(MapboxMap.OnRotateListener onRotateListener) {
        this.onRotateListenerList.add(onRotateListener);
    }

    public void addOnScaleListener(MapboxMap.OnScaleListener onScaleListener) {
        this.onScaleListenerList.add(onScaleListener);
    }

    public void addShoveListener(MapboxMap.OnShoveListener onShoveListener) {
        this.onShoveListenerList.add(onShoveListener);
    }

    public void cancelAnimators() {
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
        this.scheduledAnimators.clear();
        cancelAnimator(this.scaleAnimator);
        cancelAnimator(this.rotateAnimator);
        dispatchCameraIdle();
    }

    public LCT getGesturesManager() {
        return this.gesturesManager;
    }

    public void notifyOnFlingListeners() {
        Iterator it = this.onFlingListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnFlingListener) it.next()).onFling();
        }
    }

    public void notifyOnMapClickListeners(PointF pointF) {
        Iterator it = this.onMapClickListenerList.iterator();
        while (it.hasNext() && !((MapboxMap.OnMapClickListener) it.next()).onMapClick(this.projection.nativeMapView.latLngForPixel(pointF))) {
        }
    }

    public void notifyOnMapDoubleClickListeners(PointF pointF) {
        Iterator it = this.onMapDoubleClickListenerList.iterator();
        while (it.hasNext() && !((MapboxMap.OnMapDoubleClickListener) it.next()).onMapDoubleClick(this.projection.nativeMapView.latLngForPixel(pointF))) {
        }
    }

    public void notifyOnMapLongClickListeners(PointF pointF) {
        Iterator it = this.onMapLongClickListenerList.iterator();
        while (it.hasNext() && !((MapboxMap.OnMapLongClickListener) it.next()).onMapLongClick(this.projection.nativeMapView.latLngForPixel(pointF))) {
        }
    }

    public void notifyOnMoveBeginListeners(KK6 kk6) {
        Iterator it = this.onMoveListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnMoveListener) it.next()).onMoveBegin(kk6);
        }
    }

    public void notifyOnMoveEndListeners(KK6 kk6) {
        Iterator it = this.onMoveListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnMoveListener) it.next()).onMoveEnd(kk6);
        }
    }

    public void notifyOnMoveListeners(KK6 kk6) {
        Iterator it = this.onMoveListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnMoveListener) it.next()).onMove(kk6);
        }
    }

    public void notifyOnRotateBeginListeners(KK2 kk2) {
        Iterator it = this.onRotateListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnRotateListener) it.next()).onRotateBegin(kk2);
        }
    }

    public void notifyOnRotateEndListeners(KK2 kk2) {
        Iterator it = this.onRotateListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnRotateListener) it.next()).onRotateEnd(kk2);
        }
    }

    public void notifyOnRotateListeners(KK2 kk2) {
        Iterator it = this.onRotateListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnRotateListener) it.next()).onRotate(kk2);
        }
    }

    public void notifyOnScaleBeginListeners(KK5 kk5) {
        Iterator it = this.onScaleListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnScaleListener) it.next()).onScaleBegin(kk5);
        }
    }

    public void notifyOnScaleEndListeners(KK5 kk5) {
        Iterator it = this.onScaleListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnScaleListener) it.next()).onScaleEnd(kk5);
        }
    }

    public void notifyOnScaleListeners(KK5 kk5) {
        Iterator it = this.onScaleListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnScaleListener) it.next()).onScale(kk5);
        }
    }

    public void notifyOnShoveBeginListeners(KK3 kk3) {
        Iterator it = this.onShoveListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnShoveListener) it.next()).onShoveBegin(kk3);
        }
    }

    public void notifyOnShoveEndListeners(KK3 kk3) {
        Iterator it = this.onShoveListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnShoveListener) it.next()).onShoveEnd(kk3);
        }
    }

    public void notifyOnShoveListeners(KK3 kk3) {
        Iterator it = this.onShoveListenerList.iterator();
        while (it.hasNext()) {
            ((MapboxMap.OnShoveListener) it.next()).onShove(kk3);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z = false;
        if ((motionEvent.getSource() & 2) == 2 && motionEvent.getActionMasked() == 8 && this.uiSettings.zoomGesturesEnabled) {
            this.transform.cancelTransitions();
            this.transform.zoomBy(motionEvent.getAxisValue(9), GOq.A0L(motionEvent));
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r0 != 5) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.MapGestureDetector.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeOnFlingListener(MapboxMap.OnFlingListener onFlingListener) {
        this.onFlingListenerList.remove(onFlingListener);
    }

    public void removeOnMapClickListener(MapboxMap.OnMapClickListener onMapClickListener) {
        this.onMapClickListenerList.remove(onMapClickListener);
    }

    public void removeOnMapDoubleClickListener(MapboxMap.OnMapDoubleClickListener onMapDoubleClickListener) {
        this.onMapDoubleClickListenerList.remove(onMapDoubleClickListener);
    }

    public void removeOnMapLongClickListener(MapboxMap.OnMapLongClickListener onMapLongClickListener) {
        this.onMapLongClickListenerList.remove(onMapLongClickListener);
    }

    public void removeOnMoveListener(MapboxMap.OnMoveListener onMoveListener) {
        this.onMoveListenerList.remove(onMoveListener);
    }

    public void removeOnRotateListener(MapboxMap.OnRotateListener onRotateListener) {
        this.onRotateListenerList.remove(onRotateListener);
    }

    public void removeOnScaleListener(MapboxMap.OnScaleListener onScaleListener) {
        this.onScaleListenerList.remove(onScaleListener);
    }

    public void removeShoveListener(MapboxMap.OnShoveListener onShoveListener) {
        this.onShoveListenerList.remove(onShoveListener);
    }

    public void setFocalPoint(PointF pointF) {
        PointF pointF2;
        if (pointF == null && (pointF2 = this.uiSettings.userProvidedFocalPoint) != null) {
            pointF = pointF2;
        }
        this.constantFocalPoint = pointF;
    }

    public void setGesturesManager(Context context, LCT lct, boolean z, boolean z2) {
        initializeGesturesManager(lct, z2);
        initializeGestureListeners(context, z);
    }

    public void zoomInAnimated(PointF pointF, boolean z) {
        zoomAnimated(true, pointF, z);
    }

    public void zoomOutAnimated(PointF pointF, boolean z) {
        zoomAnimated(false, pointF, z);
    }
}
