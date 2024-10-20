package com.mapbox.mapboxsdk.location;

import X.0K6;
import android.animation.AnimatorSet;
import android.view.animation.Interpolator;
import java.util.List;

/* loaded from: MapboxAnimatorSetProvider.class */
public class MapboxAnimatorSetProvider {
    public static MapboxAnimatorSetProvider instance;

    /* JADX WARN: Type inference failed for: r301v2, types: [java.lang.Object, com.mapbox.mapboxsdk.location.MapboxAnimatorSetProvider] */
    public static MapboxAnimatorSetProvider getInstance() {
        MapboxAnimatorSetProvider mapboxAnimatorSetProvider = instance;
        MapboxAnimatorSetProvider mapboxAnimatorSetProvider2 = mapboxAnimatorSetProvider;
        if (mapboxAnimatorSetProvider == null) {
            ?? obj = new Object();
            instance = obj;
            mapboxAnimatorSetProvider2 = obj;
        }
        return mapboxAnimatorSetProvider2;
    }

    public void startAnimation(List list, Interpolator interpolator, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(list);
        animatorSet.setInterpolator(interpolator);
        animatorSet.setDuration(j);
        0K6.A00(animatorSet);
    }
}
