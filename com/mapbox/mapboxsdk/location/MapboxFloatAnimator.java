package com.mapbox.mapboxsdk.location;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import com.mapbox.mapboxsdk.location.MapboxAnimator;

/* loaded from: MapboxFloatAnimator.class */
public class MapboxFloatAnimator extends MapboxAnimator {
    public MapboxFloatAnimator(Float f, Float f2, MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener, int i) {
        super(f, f2, animationsValueChangeListener, i);
    }

    @Override // com.mapbox.mapboxsdk.location.MapboxAnimator
    public TypeEvaluator provideEvaluator() {
        return new FloatEvaluator();
    }
}
