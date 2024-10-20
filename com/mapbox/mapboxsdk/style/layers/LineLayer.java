package com.mapbox.mapboxsdk.style.layers;

import X.AnonymousClass001;
import X.JQz;
import X.JR0;
import com.google.gson.JsonElement;
import com.mapbox.mapboxsdk.style.expressions.Expression;

/* loaded from: LineLayer.class */
public class LineLayer extends Layer {
    public LineLayer(long j) {
        super(j);
    }

    public LineLayer(String str, String str2) {
        initialize(str, str2);
    }

    private native Object nativeGetLineBlur();

    private native TransitionOptions nativeGetLineBlurTransition();

    private native Object nativeGetLineCap();

    private native Object nativeGetLineColor();

    private native TransitionOptions nativeGetLineColorTransition();

    private native Object nativeGetLineDasharray();

    private native TransitionOptions nativeGetLineDasharrayTransition();

    private native Object nativeGetLineGapWidth();

    private native TransitionOptions nativeGetLineGapWidthTransition();

    private native Object nativeGetLineGradient();

    private native Object nativeGetLineJoin();

    private native Object nativeGetLineMiterLimit();

    private native Object nativeGetLineOffset();

    private native TransitionOptions nativeGetLineOffsetTransition();

    private native Object nativeGetLineOpacity();

    private native TransitionOptions nativeGetLineOpacityTransition();

    private native Object nativeGetLinePattern();

    private native TransitionOptions nativeGetLinePatternTransition();

    private native Object nativeGetLineRoundLimit();

    private native Object nativeGetLineTranslate();

    private native Object nativeGetLineTranslateAnchor();

    private native TransitionOptions nativeGetLineTranslateTransition();

    private native Object nativeGetLineWidth();

    private native TransitionOptions nativeGetLineWidthTransition();

    private native void nativeSetLineBlurTransition(long j, long j2);

    private native void nativeSetLineColorTransition(long j, long j2);

    private native void nativeSetLineDasharrayTransition(long j, long j2);

    private native void nativeSetLineGapWidthTransition(long j, long j2);

    private native void nativeSetLineOffsetTransition(long j, long j2);

    private native void nativeSetLineOpacityTransition(long j, long j2);

    private native void nativeSetLinePatternTransition(long j, long j2);

    private native void nativeSetLineTranslateTransition(long j, long j2);

    private native void nativeSetLineWidthTransition(long j, long j2);

    @Override // com.mapbox.mapboxsdk.style.layers.Layer
    public native void finalize();

    public Expression getFilter() {
        JQz.A0y();
        JsonElement nativeGetFilter = nativeGetFilter();
        if (nativeGetFilter != null) {
            return Expression.Converter.convert(nativeGetFilter);
        }
        return null;
    }

    public PropertyValue getLineBlur() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineBlur(), "line-blur");
    }

    public TransitionOptions getLineBlurTransition() {
        JQz.A0y();
        return nativeGetLineBlurTransition();
    }

    public PropertyValue getLineCap() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineCap(), "line-cap");
    }

    public PropertyValue getLineColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineColor(), "line-color");
    }

    public int getLineColorAsInt() {
        JQz.A0y();
        PropertyValue lineColor = getLineColor();
        if (lineColor.isValue()) {
            return JR0.A0M(lineColor);
        }
        throw AnonymousClass001.A0T("line-color was set as a Function");
    }

    public TransitionOptions getLineColorTransition() {
        JQz.A0y();
        return nativeGetLineColorTransition();
    }

    public PropertyValue getLineDasharray() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineDasharray(), "line-dasharray");
    }

    public TransitionOptions getLineDasharrayTransition() {
        JQz.A0y();
        return nativeGetLineDasharrayTransition();
    }

    public PropertyValue getLineGapWidth() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineGapWidth(), "line-gap-width");
    }

    public TransitionOptions getLineGapWidthTransition() {
        JQz.A0y();
        return nativeGetLineGapWidthTransition();
    }

    public PropertyValue getLineGradient() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineGradient(), "line-gradient");
    }

    public int getLineGradientAsInt() {
        JQz.A0y();
        PropertyValue lineGradient = getLineGradient();
        if (lineGradient.isValue()) {
            return JR0.A0M(lineGradient);
        }
        throw AnonymousClass001.A0T("line-gradient was set as a Function");
    }

    public PropertyValue getLineJoin() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineJoin(), "line-join");
    }

    public PropertyValue getLineMiterLimit() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineMiterLimit(), "line-miter-limit");
    }

    public PropertyValue getLineOffset() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineOffset(), "line-offset");
    }

    public TransitionOptions getLineOffsetTransition() {
        JQz.A0y();
        return nativeGetLineOffsetTransition();
    }

    public PropertyValue getLineOpacity() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineOpacity(), "line-opacity");
    }

    public TransitionOptions getLineOpacityTransition() {
        JQz.A0y();
        return nativeGetLineOpacityTransition();
    }

    public PropertyValue getLinePattern() {
        JQz.A0y();
        return JQz.A0e(nativeGetLinePattern(), "line-pattern");
    }

    public TransitionOptions getLinePatternTransition() {
        JQz.A0y();
        return nativeGetLinePatternTransition();
    }

    public PropertyValue getLineRoundLimit() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineRoundLimit(), "line-round-limit");
    }

    public PropertyValue getLineTranslate() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineTranslate(), "line-translate");
    }

    public PropertyValue getLineTranslateAnchor() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineTranslateAnchor(), "line-translate-anchor");
    }

    public TransitionOptions getLineTranslateTransition() {
        JQz.A0y();
        return nativeGetLineTranslateTransition();
    }

    public PropertyValue getLineWidth() {
        JQz.A0y();
        return JQz.A0e(nativeGetLineWidth(), "line-width");
    }

    public TransitionOptions getLineWidthTransition() {
        JQz.A0y();
        return nativeGetLineWidthTransition();
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

    public void setFilter(Expression expression) {
        JQz.A0y();
        nativeSetFilter(expression.toArray());
    }

    public void setLineBlurTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetLineBlurTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setLineColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetLineColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setLineDasharrayTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetLineDasharrayTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setLineGapWidthTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetLineGapWidthTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setLineOffsetTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetLineOffsetTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setLineOpacityTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetLineOpacityTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setLinePatternTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetLinePatternTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setLineTranslateTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetLineTranslateTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setLineWidthTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetLineWidthTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setSourceLayer(String str) {
        JQz.A0y();
        nativeSetSourceLayer(str);
    }

    public LineLayer withFilter(Expression expression) {
        setFilter(expression);
        return this;
    }

    public LineLayer withProperties(PropertyValue... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public LineLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }
}
