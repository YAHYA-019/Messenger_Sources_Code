package com.mapbox.mapboxsdk.location;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;

/* loaded from: MapboxAnimator.class */
public abstract class MapboxAnimator extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {
    public static final int ANIMATOR_CAMERA_COMPASS_BEARING = 5;
    public static final int ANIMATOR_CAMERA_GPS_BEARING = 4;
    public static final int ANIMATOR_CAMERA_LATLNG = 1;
    public static final int ANIMATOR_LAYER_ACCURACY = 6;
    public static final int ANIMATOR_LAYER_COMPASS_BEARING = 3;
    public static final int ANIMATOR_LAYER_GPS_BEARING = 2;
    public static final int ANIMATOR_LAYER_LATLNG = 0;
    public static final int ANIMATOR_TILT = 8;
    public static final int ANIMATOR_ZOOM = 7;
    public Object animatedValue;
    public final double minUpdateInterval;
    public final Object target;
    public long timeElapsed;
    public final AnimationsValueChangeListener updateListener;

    /* loaded from: MapboxAnimator$AnimationsValueChangeListener.class */
    public interface AnimationsValueChangeListener {
        void onNewAnimationValue(Object obj);
    }

    /* loaded from: MapboxAnimator$AnimatorListener.class */
    public class AnimatorListener extends AnimatorListenerAdapter {
        public AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MapboxAnimator.this.postUpdates();
        }
    }

    public MapboxAnimator(Object obj, Object obj2, AnimationsValueChangeListener animationsValueChangeListener, int i) {
        this.minUpdateInterval = 1.0E9d / i;
        setObjectValues(obj, obj2);
        setEvaluator(provideEvaluator());
        this.updateListener = animationsValueChangeListener;
        this.target = obj2;
        addUpdateListener(this);
        addListener(new AnimatorListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdates() {
        this.updateListener.onNewAnimationValue(this.animatedValue);
    }

    public Object getTarget() {
        return this.target;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.animatedValue = valueAnimator.getAnimatedValue();
        long nanoTime = System.nanoTime();
        if (nanoTime - this.timeElapsed >= this.minUpdateInterval) {
            postUpdates();
            this.timeElapsed = nanoTime;
        }
    }

    public abstract TypeEvaluator provideEvaluator();
}
