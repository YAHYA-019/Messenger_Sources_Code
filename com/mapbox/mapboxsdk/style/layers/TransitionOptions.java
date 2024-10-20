package com.mapbox.mapboxsdk.style.layers;

import X.AnonymousClass001;
import X.AnonymousClass002;

/* loaded from: TransitionOptions.class */
public class TransitionOptions {
    public long delay;
    public long duration;
    public boolean enablePlacementTransitions;

    public TransitionOptions(long j, long j2) {
        this(j, j2, true);
    }

    public TransitionOptions(long j, long j2, boolean z) {
        this.duration = j;
        this.delay = j2;
        this.enablePlacementTransitions = z;
    }

    public static TransitionOptions fromTransitionOptions(long j, long j2) {
        return new TransitionOptions(j, j2);
    }

    public static TransitionOptions fromTransitionOptions(long j, long j2, boolean z) {
        return new TransitionOptions(j, j2, z);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TransitionOptions transitionOptions = (TransitionOptions) obj;
            if (this.duration != transitionOptions.duration || this.delay != transitionOptions.delay) {
                return false;
            }
            if (this.enablePlacementTransitions != transitionOptions.enablePlacementTransitions) {
                z = false;
            }
        }
        return z;
    }

    public long getDelay() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.delay, AnonymousClass002.A01(this.duration)) + (this.enablePlacementTransitions ? 1 : 0);
    }

    public boolean isEnablePlacementTransitions() {
        return this.enablePlacementTransitions;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TransitionOptions{duration=");
        A0k.append(this.duration);
        A0k.append(", delay=");
        A0k.append(this.delay);
        A0k.append(", enablePlacementTransitions=");
        A0k.append(this.enablePlacementTransitions);
        return AnonymousClass001.A0f(A0k);
    }
}
