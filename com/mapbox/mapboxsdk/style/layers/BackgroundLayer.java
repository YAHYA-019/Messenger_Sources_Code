package com.mapbox.mapboxsdk.style.layers;

import X.AnonymousClass001;
import X.JQz;
import X.JR0;

/* loaded from: BackgroundLayer.class */
public class BackgroundLayer extends Layer {
    public BackgroundLayer(long j) {
        super(j);
    }

    public BackgroundLayer(String str) {
        initialize(str);
    }

    private native Object nativeGetBackgroundColor();

    private native TransitionOptions nativeGetBackgroundColorTransition();

    private native Object nativeGetBackgroundOpacity();

    private native TransitionOptions nativeGetBackgroundOpacityTransition();

    private native Object nativeGetBackgroundPattern();

    private native TransitionOptions nativeGetBackgroundPatternTransition();

    private native void nativeSetBackgroundColorTransition(long j, long j2);

    private native void nativeSetBackgroundOpacityTransition(long j, long j2);

    private native void nativeSetBackgroundPatternTransition(long j, long j2);

    @Override // com.mapbox.mapboxsdk.style.layers.Layer
    public native void finalize();

    public PropertyValue getBackgroundColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetBackgroundColor(), "background-color");
    }

    public int getBackgroundColorAsInt() {
        JQz.A0y();
        PropertyValue backgroundColor = getBackgroundColor();
        if (backgroundColor.isValue()) {
            return JR0.A0M(backgroundColor);
        }
        throw AnonymousClass001.A0T("background-color was set as a Function");
    }

    public TransitionOptions getBackgroundColorTransition() {
        JQz.A0y();
        return nativeGetBackgroundColorTransition();
    }

    public PropertyValue getBackgroundOpacity() {
        JQz.A0y();
        return JQz.A0e(nativeGetBackgroundOpacity(), "background-opacity");
    }

    public TransitionOptions getBackgroundOpacityTransition() {
        JQz.A0y();
        return nativeGetBackgroundOpacityTransition();
    }

    public PropertyValue getBackgroundPattern() {
        JQz.A0y();
        return JQz.A0e(nativeGetBackgroundPattern(), "background-pattern");
    }

    public TransitionOptions getBackgroundPatternTransition() {
        JQz.A0y();
        return nativeGetBackgroundPatternTransition();
    }

    public native void initialize(String str);

    public void setBackgroundColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetBackgroundColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setBackgroundOpacityTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetBackgroundOpacityTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setBackgroundPatternTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetBackgroundPatternTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public BackgroundLayer withProperties(PropertyValue... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }
}
