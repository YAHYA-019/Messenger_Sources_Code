package com.mapbox.mapboxsdk.location;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.mapbox.mapboxsdk.location.MapboxAnimator;
import com.mapbox.mapboxsdk.maps.MapboxMap;

/* loaded from: MapboxCameraAnimatorAdapter.class */
public class MapboxCameraAnimatorAdapter extends MapboxFloatAnimator {
    public final MapboxMap.CancelableCallback cancelableCallback;

    /* loaded from: MapboxCameraAnimatorAdapter$MapboxAnimatorListener.class */
    public final class MapboxAnimatorListener extends AnimatorListenerAdapter {
        public MapboxAnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            MapboxMap.CancelableCallback cancelableCallback = MapboxCameraAnimatorAdapter.this.cancelableCallback;
            if (cancelableCallback != null) {
                cancelableCallback.onCancel();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MapboxMap.CancelableCallback cancelableCallback = MapboxCameraAnimatorAdapter.this.cancelableCallback;
            if (cancelableCallback != null) {
                cancelableCallback.onFinish();
            }
        }
    }

    public MapboxCameraAnimatorAdapter(Float f, Float f2, MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener, MapboxMap.CancelableCallback cancelableCallback) {
        super((Object) f, (Object) f2, animationsValueChangeListener, (-1) >>> 1);
        this.cancelableCallback = cancelableCallback;
        addListener(new MapboxAnimatorListener());
    }
}
