package com.mapbox.mapboxsdk.location;

import X.AnonymousClass002;
import com.mapbox.mapboxsdk.location.MapboxAnimator;

/* loaded from: AnimatorListenerHolder.class */
public class AnimatorListenerHolder {
    public final int animatorType;
    public final MapboxAnimator.AnimationsValueChangeListener listener;

    public AnimatorListenerHolder(int i, MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener) {
        this.animatorType = i;
        this.listener = animationsValueChangeListener;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnimatorListenerHolder animatorListenerHolder = (AnimatorListenerHolder) obj;
            if (this.animatorType != animatorListenerHolder.animatorType) {
                return false;
            }
            MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener = this.listener;
            MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener2 = animatorListenerHolder.listener;
            if (animationsValueChangeListener != null) {
                z = animationsValueChangeListener.equals(animationsValueChangeListener2);
            } else if (animationsValueChangeListener2 != null) {
                return false;
            }
        }
        return z;
    }

    public int getAnimatorType() {
        return this.animatorType;
    }

    public MapboxAnimator.AnimationsValueChangeListener getListener() {
        return this.listener;
    }

    public int hashCode() {
        return (this.animatorType * 31) + AnonymousClass002.A04(this.listener);
    }
}
