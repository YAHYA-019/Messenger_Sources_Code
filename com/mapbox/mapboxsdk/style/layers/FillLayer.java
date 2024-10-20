package com.mapbox.mapboxsdk.style.layers;

import X.AnonymousClass001;
import X.JQz;
import X.JR0;
import com.google.gson.JsonElement;
import com.mapbox.mapboxsdk.style.expressions.Expression;

/* loaded from: FillLayer.class */
public class FillLayer extends Layer {
    public FillLayer(long j) {
        super(j);
    }

    public FillLayer(String str, String str2) {
        initialize(str, str2);
    }

    private native Object nativeGetFillAntialias();

    private native Object nativeGetFillColor();

    private native TransitionOptions nativeGetFillColorTransition();

    private native Object nativeGetFillOpacity();

    private native TransitionOptions nativeGetFillOpacityTransition();

    private native Object nativeGetFillOutlineColor();

    private native TransitionOptions nativeGetFillOutlineColorTransition();

    private native Object nativeGetFillPattern();

    private native TransitionOptions nativeGetFillPatternTransition();

    private native Object nativeGetFillTranslate();

    private native Object nativeGetFillTranslateAnchor();

    private native TransitionOptions nativeGetFillTranslateTransition();

    private native void nativeSetFillColorTransition(long j, long j2);

    private native void nativeSetFillOpacityTransition(long j, long j2);

    private native void nativeSetFillOutlineColorTransition(long j, long j2);

    private native void nativeSetFillPatternTransition(long j, long j2);

    private native void nativeSetFillTranslateTransition(long j, long j2);

    @Override // com.mapbox.mapboxsdk.style.layers.Layer
    public native void finalize();

    public PropertyValue getFillAntialias() {
        JQz.A0y();
        return JQz.A0e(nativeGetFillAntialias(), "fill-antialias");
    }

    public PropertyValue getFillColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetFillColor(), "fill-color");
    }

    public int getFillColorAsInt() {
        JQz.A0y();
        PropertyValue fillColor = getFillColor();
        if (fillColor.isValue()) {
            return JR0.A0M(fillColor);
        }
        throw AnonymousClass001.A0T("fill-color was set as a Function");
    }

    public TransitionOptions getFillColorTransition() {
        JQz.A0y();
        return nativeGetFillColorTransition();
    }

    public PropertyValue getFillOpacity() {
        JQz.A0y();
        return JQz.A0e(nativeGetFillOpacity(), "fill-opacity");
    }

    public TransitionOptions getFillOpacityTransition() {
        JQz.A0y();
        return nativeGetFillOpacityTransition();
    }

    public PropertyValue getFillOutlineColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetFillOutlineColor(), "fill-outline-color");
    }

    public int getFillOutlineColorAsInt() {
        JQz.A0y();
        PropertyValue fillOutlineColor = getFillOutlineColor();
        if (fillOutlineColor.isValue()) {
            return JR0.A0M(fillOutlineColor);
        }
        throw AnonymousClass001.A0T("fill-outline-color was set as a Function");
    }

    public TransitionOptions getFillOutlineColorTransition() {
        JQz.A0y();
        return nativeGetFillOutlineColorTransition();
    }

    public PropertyValue getFillPattern() {
        JQz.A0y();
        return JQz.A0e(nativeGetFillPattern(), "fill-pattern");
    }

    public TransitionOptions getFillPatternTransition() {
        JQz.A0y();
        return nativeGetFillPatternTransition();
    }

    public PropertyValue getFillTranslate() {
        JQz.A0y();
        return JQz.A0e(nativeGetFillTranslate(), "fill-translate");
    }

    public PropertyValue getFillTranslateAnchor() {
        JQz.A0y();
        return JQz.A0e(nativeGetFillTranslateAnchor(), "fill-translate-anchor");
    }

    public TransitionOptions getFillTranslateTransition() {
        JQz.A0y();
        return nativeGetFillTranslateTransition();
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

    public void setFillColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetFillColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setFillOpacityTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetFillOpacityTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setFillOutlineColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetFillOutlineColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setFillPatternTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetFillPatternTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setFillTranslateTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetFillTranslateTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setFilter(Expression expression) {
        JQz.A0y();
        nativeSetFilter(expression.toArray());
    }

    public void setSourceLayer(String str) {
        JQz.A0y();
        nativeSetSourceLayer(str);
    }

    public FillLayer withFilter(Expression expression) {
        setFilter(expression);
        return this;
    }

    public FillLayer withProperties(PropertyValue... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public FillLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }
}
