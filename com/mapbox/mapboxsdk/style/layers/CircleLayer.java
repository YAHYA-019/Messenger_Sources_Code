package com.mapbox.mapboxsdk.style.layers;

import X.AnonymousClass001;
import X.JQz;
import X.JR0;
import com.google.gson.JsonElement;
import com.mapbox.mapboxsdk.style.expressions.Expression;

/* loaded from: CircleLayer.class */
public class CircleLayer extends Layer {
    public CircleLayer(long j) {
        super(j);
    }

    public CircleLayer(String str, String str2) {
        initialize(str, str2);
    }

    private native Object nativeGetCircleBlur();

    private native TransitionOptions nativeGetCircleBlurTransition();

    private native Object nativeGetCircleColor();

    private native TransitionOptions nativeGetCircleColorTransition();

    private native Object nativeGetCircleOpacity();

    private native TransitionOptions nativeGetCircleOpacityTransition();

    private native Object nativeGetCirclePitchAlignment();

    private native Object nativeGetCirclePitchScale();

    private native Object nativeGetCircleRadius();

    private native TransitionOptions nativeGetCircleRadiusTransition();

    private native Object nativeGetCircleStrokeColor();

    private native TransitionOptions nativeGetCircleStrokeColorTransition();

    private native Object nativeGetCircleStrokeOpacity();

    private native TransitionOptions nativeGetCircleStrokeOpacityTransition();

    private native Object nativeGetCircleStrokeWidth();

    private native TransitionOptions nativeGetCircleStrokeWidthTransition();

    private native Object nativeGetCircleTranslate();

    private native Object nativeGetCircleTranslateAnchor();

    private native TransitionOptions nativeGetCircleTranslateTransition();

    private native void nativeSetCircleBlurTransition(long j, long j2);

    private native void nativeSetCircleColorTransition(long j, long j2);

    private native void nativeSetCircleOpacityTransition(long j, long j2);

    private native void nativeSetCircleRadiusTransition(long j, long j2);

    private native void nativeSetCircleStrokeColorTransition(long j, long j2);

    private native void nativeSetCircleStrokeOpacityTransition(long j, long j2);

    private native void nativeSetCircleStrokeWidthTransition(long j, long j2);

    private native void nativeSetCircleTranslateTransition(long j, long j2);

    @Override // com.mapbox.mapboxsdk.style.layers.Layer
    public native void finalize();

    public PropertyValue getCircleBlur() {
        JQz.A0y();
        return JQz.A0e(nativeGetCircleBlur(), "circle-blur");
    }

    public TransitionOptions getCircleBlurTransition() {
        JQz.A0y();
        return nativeGetCircleBlurTransition();
    }

    public PropertyValue getCircleColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetCircleColor(), "circle-color");
    }

    public int getCircleColorAsInt() {
        JQz.A0y();
        PropertyValue circleColor = getCircleColor();
        if (circleColor.isValue()) {
            return JR0.A0M(circleColor);
        }
        throw AnonymousClass001.A0T("circle-color was set as a Function");
    }

    public TransitionOptions getCircleColorTransition() {
        JQz.A0y();
        return nativeGetCircleColorTransition();
    }

    public PropertyValue getCircleOpacity() {
        JQz.A0y();
        return JQz.A0e(nativeGetCircleOpacity(), "circle-opacity");
    }

    public TransitionOptions getCircleOpacityTransition() {
        JQz.A0y();
        return nativeGetCircleOpacityTransition();
    }

    public PropertyValue getCirclePitchAlignment() {
        JQz.A0y();
        return JQz.A0e(nativeGetCirclePitchAlignment(), "circle-pitch-alignment");
    }

    public PropertyValue getCirclePitchScale() {
        JQz.A0y();
        return JQz.A0e(nativeGetCirclePitchScale(), "circle-pitch-scale");
    }

    public PropertyValue getCircleRadius() {
        JQz.A0y();
        return JQz.A0e(nativeGetCircleRadius(), "circle-radius");
    }

    public TransitionOptions getCircleRadiusTransition() {
        JQz.A0y();
        return nativeGetCircleRadiusTransition();
    }

    public PropertyValue getCircleStrokeColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetCircleStrokeColor(), "circle-stroke-color");
    }

    public int getCircleStrokeColorAsInt() {
        JQz.A0y();
        PropertyValue circleStrokeColor = getCircleStrokeColor();
        if (circleStrokeColor.isValue()) {
            return JR0.A0M(circleStrokeColor);
        }
        throw AnonymousClass001.A0T("circle-stroke-color was set as a Function");
    }

    public TransitionOptions getCircleStrokeColorTransition() {
        JQz.A0y();
        return nativeGetCircleStrokeColorTransition();
    }

    public PropertyValue getCircleStrokeOpacity() {
        JQz.A0y();
        return JQz.A0e(nativeGetCircleStrokeOpacity(), "circle-stroke-opacity");
    }

    public TransitionOptions getCircleStrokeOpacityTransition() {
        JQz.A0y();
        return nativeGetCircleStrokeOpacityTransition();
    }

    public PropertyValue getCircleStrokeWidth() {
        JQz.A0y();
        return JQz.A0e(nativeGetCircleStrokeWidth(), "circle-stroke-width");
    }

    public TransitionOptions getCircleStrokeWidthTransition() {
        JQz.A0y();
        return nativeGetCircleStrokeWidthTransition();
    }

    public PropertyValue getCircleTranslate() {
        JQz.A0y();
        return JQz.A0e(nativeGetCircleTranslate(), "circle-translate");
    }

    public PropertyValue getCircleTranslateAnchor() {
        JQz.A0y();
        return JQz.A0e(nativeGetCircleTranslateAnchor(), "circle-translate-anchor");
    }

    public TransitionOptions getCircleTranslateTransition() {
        JQz.A0y();
        return nativeGetCircleTranslateTransition();
    }

    public Expression getFilter() {
        JQz.A0y();
        JsonElement nativeGetFilter = nativeGetFilter();
        if (nativeGetFilter != null) {
            return Expression.Converter.convert(nativeGetFilter);
        }
        return null;
    }

    public String getSourceId() {
        JQz.A0y();
        return nativeGetSourceId();
    }

    public String getSourceLayer() {
        JQz.A0y();
        return nativeGetSourceLayer();
    }

    public native void initialize(String str, String str2);

    public void setCircleBlurTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetCircleBlurTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setCircleColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetCircleColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setCircleOpacityTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetCircleOpacityTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setCircleRadiusTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetCircleRadiusTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setCircleStrokeColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetCircleStrokeColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setCircleStrokeOpacityTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetCircleStrokeOpacityTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setCircleStrokeWidthTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetCircleStrokeWidthTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setCircleTranslateTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetCircleTranslateTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setFilter(Expression expression) {
        JQz.A0y();
        nativeSetFilter(expression.toArray());
    }

    public void setSourceLayer(String str) {
        JQz.A0y();
        nativeSetSourceLayer(str);
    }

    public CircleLayer withFilter(Expression expression) {
        setFilter(expression);
        return this;
    }

    public CircleLayer withProperties(PropertyValue... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public CircleLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }
}
