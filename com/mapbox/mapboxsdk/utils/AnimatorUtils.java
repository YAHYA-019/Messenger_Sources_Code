package com.mapbox.mapboxsdk.utils;

import X.0K6;
import X.2ML;
import X.JQy;
import X.JR0;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* loaded from: AnimatorUtils.class */
public class AnimatorUtils {

    /* loaded from: AnimatorUtils$OnAnimationEndListener.class */
    public interface OnAnimationEndListener {
        void onAnimationEnd();
    }

    public static void alpha(View view, float f) {
        alpha(view, f, null);
    }

    public static void alpha(final View view, float f, final OnAnimationEndListener onAnimationEndListener) {
        view.setLayerType(2, null);
        Property property = View.ALPHA;
        float[] fArr = new float[2];
        JR0.A1L(fArr, view.getAlpha(), f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.mapbox.mapboxsdk.utils.AnimatorUtils.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                JQy.A18(view);
                OnAnimationEndListener onAnimationEndListener2 = onAnimationEndListener;
                if (onAnimationEndListener2 != null) {
                    onAnimationEndListener2.onAnimationEnd();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                view.setVisibility(0);
            }
        });
        0K6.A00(ofFloat);
    }

    public static void animate(View view, int i) {
        animate(view, i, -1);
    }

    public static void animate(View view, int i, int i2) {
        animate(view, i, i2, null);
    }

    public static void animate(final View view, int i, int i2, final OnAnimationEndListener onAnimationEndListener) {
        if (view != null) {
            JQy.A19(view);
            Animator loadAnimator = AnimatorInflater.loadAnimator(view.getContext(), i);
            if (i2 != -1) {
                loadAnimator.setDuration(i2);
            }
            loadAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.mapbox.mapboxsdk.utils.AnimatorUtils.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    JQy.A18(view);
                    OnAnimationEndListener onAnimationEndListener2 = onAnimationEndListener;
                    if (onAnimationEndListener2 != null) {
                        onAnimationEndListener2.onAnimationEnd();
                    }
                }
            });
            loadAnimator.setTarget(view);
            0K6.A00(loadAnimator);
        }
    }

    public static void animate(View view, int i, OnAnimationEndListener onAnimationEndListener) {
        animate(view, i, -1, onAnimationEndListener);
    }

    public static void rotate(final View view, float f) {
        view.setLayerType(2, null);
        Property property = View.ROTATION;
        float[] fArr = new float[2];
        JR0.A1L(fArr, view.getRotation(), f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.mapbox.mapboxsdk.utils.AnimatorUtils.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                JQy.A18(view);
            }
        });
        0K6.A00(ofFloat);
    }

    public static void rotateBy(final View view, float f) {
        JQy.A19(view);
        view.animate().rotationBy(f).setInterpolator(new 2ML()).setListener(new AnimatorListenerAdapter() { // from class: com.mapbox.mapboxsdk.utils.AnimatorUtils.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                JQy.A18(view);
            }
        });
    }
}
