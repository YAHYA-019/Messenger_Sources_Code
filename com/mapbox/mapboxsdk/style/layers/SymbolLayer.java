package com.mapbox.mapboxsdk.style.layers;

import X.AnonymousClass001;
import X.JQz;
import X.JR0;
import com.google.gson.JsonElement;
import com.mapbox.mapboxsdk.style.expressions.Expression;

/* loaded from: SymbolLayer.class */
public class SymbolLayer extends Layer {
    public SymbolLayer(long j) {
        super(j);
    }

    public SymbolLayer(String str, String str2) {
        initialize(str, str2);
    }

    private native Object nativeGetIconAllowOverlap();

    private native Object nativeGetIconAnchor();

    private native Object nativeGetIconColor();

    private native TransitionOptions nativeGetIconColorTransition();

    private native Object nativeGetIconHaloBlur();

    private native TransitionOptions nativeGetIconHaloBlurTransition();

    private native Object nativeGetIconHaloColor();

    private native TransitionOptions nativeGetIconHaloColorTransition();

    private native Object nativeGetIconHaloWidth();

    private native TransitionOptions nativeGetIconHaloWidthTransition();

    private native Object nativeGetIconIgnorePlacement();

    private native Object nativeGetIconImage();

    private native Object nativeGetIconKeepUpright();

    private native Object nativeGetIconOffset();

    private native Object nativeGetIconOpacity();

    private native TransitionOptions nativeGetIconOpacityTransition();

    private native Object nativeGetIconOptional();

    private native Object nativeGetIconPadding();

    private native Object nativeGetIconPitchAlignment();

    private native Object nativeGetIconRotate();

    private native Object nativeGetIconRotationAlignment();

    private native Object nativeGetIconSize();

    private native Object nativeGetIconTextFit();

    private native Object nativeGetIconTextFitPadding();

    private native Object nativeGetIconTranslate();

    private native Object nativeGetIconTranslateAnchor();

    private native TransitionOptions nativeGetIconTranslateTransition();

    private native Object nativeGetSymbolAvoidEdges();

    private native Object nativeGetSymbolPlacement();

    private native Object nativeGetSymbolSortKey();

    private native Object nativeGetSymbolSpacing();

    private native Object nativeGetSymbolZOrder();

    private native Object nativeGetTextAllowOverlap();

    private native Object nativeGetTextAnchor();

    private native Object nativeGetTextColor();

    private native TransitionOptions nativeGetTextColorTransition();

    private native Object nativeGetTextField();

    private native Object nativeGetTextFont();

    private native Object nativeGetTextHaloBlur();

    private native TransitionOptions nativeGetTextHaloBlurTransition();

    private native Object nativeGetTextHaloColor();

    private native TransitionOptions nativeGetTextHaloColorTransition();

    private native Object nativeGetTextHaloWidth();

    private native TransitionOptions nativeGetTextHaloWidthTransition();

    private native Object nativeGetTextIgnorePlacement();

    private native Object nativeGetTextJustify();

    private native Object nativeGetTextKeepUpright();

    private native Object nativeGetTextLetterSpacing();

    private native Object nativeGetTextLineHeight();

    private native Object nativeGetTextMaxAngle();

    private native Object nativeGetTextMaxWidth();

    private native Object nativeGetTextOffset();

    private native Object nativeGetTextOpacity();

    private native TransitionOptions nativeGetTextOpacityTransition();

    private native Object nativeGetTextOptional();

    private native Object nativeGetTextPadding();

    private native Object nativeGetTextPitchAlignment();

    private native Object nativeGetTextRadialOffset();

    private native Object nativeGetTextRotate();

    private native Object nativeGetTextRotationAlignment();

    private native Object nativeGetTextSize();

    private native Object nativeGetTextTransform();

    private native Object nativeGetTextTranslate();

    private native Object nativeGetTextTranslateAnchor();

    private native TransitionOptions nativeGetTextTranslateTransition();

    private native Object nativeGetTextVariableAnchor();

    private native void nativeSetIconColorTransition(long j, long j2);

    private native void nativeSetIconHaloBlurTransition(long j, long j2);

    private native void nativeSetIconHaloColorTransition(long j, long j2);

    private native void nativeSetIconHaloWidthTransition(long j, long j2);

    private native void nativeSetIconOpacityTransition(long j, long j2);

    private native void nativeSetIconTranslateTransition(long j, long j2);

    private native void nativeSetTextColorTransition(long j, long j2);

    private native void nativeSetTextHaloBlurTransition(long j, long j2);

    private native void nativeSetTextHaloColorTransition(long j, long j2);

    private native void nativeSetTextHaloWidthTransition(long j, long j2);

    private native void nativeSetTextOpacityTransition(long j, long j2);

    private native void nativeSetTextTranslateTransition(long j, long j2);

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

    public PropertyValue getIconAllowOverlap() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconAllowOverlap(), "icon-allow-overlap");
    }

    public PropertyValue getIconAnchor() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconAnchor(), "icon-anchor");
    }

    public PropertyValue getIconColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconColor(), "icon-color");
    }

    public int getIconColorAsInt() {
        JQz.A0y();
        PropertyValue iconColor = getIconColor();
        if (iconColor.isValue()) {
            return JR0.A0M(iconColor);
        }
        throw AnonymousClass001.A0T("icon-color was set as a Function");
    }

    public TransitionOptions getIconColorTransition() {
        JQz.A0y();
        return nativeGetIconColorTransition();
    }

    public PropertyValue getIconHaloBlur() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconHaloBlur(), "icon-halo-blur");
    }

    public TransitionOptions getIconHaloBlurTransition() {
        JQz.A0y();
        return nativeGetIconHaloBlurTransition();
    }

    public PropertyValue getIconHaloColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconHaloColor(), "icon-halo-color");
    }

    public int getIconHaloColorAsInt() {
        JQz.A0y();
        PropertyValue iconHaloColor = getIconHaloColor();
        if (iconHaloColor.isValue()) {
            return JR0.A0M(iconHaloColor);
        }
        throw AnonymousClass001.A0T("icon-halo-color was set as a Function");
    }

    public TransitionOptions getIconHaloColorTransition() {
        JQz.A0y();
        return nativeGetIconHaloColorTransition();
    }

    public PropertyValue getIconHaloWidth() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconHaloWidth(), "icon-halo-width");
    }

    public TransitionOptions getIconHaloWidthTransition() {
        JQz.A0y();
        return nativeGetIconHaloWidthTransition();
    }

    public PropertyValue getIconIgnorePlacement() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconIgnorePlacement(), "icon-ignore-placement");
    }

    public PropertyValue getIconImage() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconImage(), "icon-image");
    }

    public PropertyValue getIconKeepUpright() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconKeepUpright(), "icon-keep-upright");
    }

    public PropertyValue getIconOffset() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconOffset(), "icon-offset");
    }

    public PropertyValue getIconOpacity() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconOpacity(), "icon-opacity");
    }

    public TransitionOptions getIconOpacityTransition() {
        JQz.A0y();
        return nativeGetIconOpacityTransition();
    }

    public PropertyValue getIconOptional() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconOptional(), "icon-optional");
    }

    public PropertyValue getIconPadding() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconPadding(), "icon-padding");
    }

    public PropertyValue getIconPitchAlignment() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconPitchAlignment(), "icon-pitch-alignment");
    }

    public PropertyValue getIconRotate() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconRotate(), "icon-rotate");
    }

    public PropertyValue getIconRotationAlignment() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconRotationAlignment(), "icon-rotation-alignment");
    }

    public PropertyValue getIconSize() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconSize(), "icon-size");
    }

    public PropertyValue getIconTextFit() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconTextFit(), "icon-text-fit");
    }

    public PropertyValue getIconTextFitPadding() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconTextFitPadding(), "icon-text-fit-padding");
    }

    public PropertyValue getIconTranslate() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconTranslate(), "icon-translate");
    }

    public PropertyValue getIconTranslateAnchor() {
        JQz.A0y();
        return JQz.A0e(nativeGetIconTranslateAnchor(), "icon-translate-anchor");
    }

    public TransitionOptions getIconTranslateTransition() {
        JQz.A0y();
        return nativeGetIconTranslateTransition();
    }

    public String getSourceId() {
        JQz.A0y();
        return nativeGetSourceId();
    }

    public String getSourceLayer() {
        JQz.A0y();
        return nativeGetSourceLayer();
    }

    public PropertyValue getSymbolAvoidEdges() {
        JQz.A0y();
        return JQz.A0e(nativeGetSymbolAvoidEdges(), "symbol-avoid-edges");
    }

    public PropertyValue getSymbolPlacement() {
        JQz.A0y();
        return JQz.A0e(nativeGetSymbolPlacement(), "symbol-placement");
    }

    public PropertyValue getSymbolSortKey() {
        JQz.A0y();
        return JQz.A0e(nativeGetSymbolSortKey(), "symbol-sort-key");
    }

    public PropertyValue getSymbolSpacing() {
        JQz.A0y();
        return JQz.A0e(nativeGetSymbolSpacing(), "symbol-spacing");
    }

    public PropertyValue getSymbolZOrder() {
        JQz.A0y();
        return JQz.A0e(nativeGetSymbolZOrder(), "symbol-z-order");
    }

    public PropertyValue getTextAllowOverlap() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextAllowOverlap(), "text-allow-overlap");
    }

    public PropertyValue getTextAnchor() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextAnchor(), "text-anchor");
    }

    public PropertyValue getTextColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextColor(), "text-color");
    }

    public int getTextColorAsInt() {
        JQz.A0y();
        PropertyValue textColor = getTextColor();
        if (textColor.isValue()) {
            return JR0.A0M(textColor);
        }
        throw AnonymousClass001.A0T("text-color was set as a Function");
    }

    public TransitionOptions getTextColorTransition() {
        JQz.A0y();
        return nativeGetTextColorTransition();
    }

    public PropertyValue getTextField() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextField(), "text-field");
    }

    public PropertyValue getTextFont() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextFont(), "text-font");
    }

    public PropertyValue getTextHaloBlur() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextHaloBlur(), "text-halo-blur");
    }

    public TransitionOptions getTextHaloBlurTransition() {
        JQz.A0y();
        return nativeGetTextHaloBlurTransition();
    }

    public PropertyValue getTextHaloColor() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextHaloColor(), "text-halo-color");
    }

    public int getTextHaloColorAsInt() {
        JQz.A0y();
        PropertyValue textHaloColor = getTextHaloColor();
        if (textHaloColor.isValue()) {
            return JR0.A0M(textHaloColor);
        }
        throw AnonymousClass001.A0T("text-halo-color was set as a Function");
    }

    public TransitionOptions getTextHaloColorTransition() {
        JQz.A0y();
        return nativeGetTextHaloColorTransition();
    }

    public PropertyValue getTextHaloWidth() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextHaloWidth(), "text-halo-width");
    }

    public TransitionOptions getTextHaloWidthTransition() {
        JQz.A0y();
        return nativeGetTextHaloWidthTransition();
    }

    public PropertyValue getTextIgnorePlacement() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextIgnorePlacement(), "text-ignore-placement");
    }

    public PropertyValue getTextJustify() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextJustify(), "text-justify");
    }

    public PropertyValue getTextKeepUpright() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextKeepUpright(), "text-keep-upright");
    }

    public PropertyValue getTextLetterSpacing() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextLetterSpacing(), "text-letter-spacing");
    }

    public PropertyValue getTextLineHeight() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextLineHeight(), "text-line-height");
    }

    public PropertyValue getTextMaxAngle() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextMaxAngle(), "text-max-angle");
    }

    public PropertyValue getTextMaxWidth() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextMaxWidth(), "text-max-width");
    }

    public PropertyValue getTextOffset() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextOffset(), "text-offset");
    }

    public PropertyValue getTextOpacity() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextOpacity(), "text-opacity");
    }

    public TransitionOptions getTextOpacityTransition() {
        JQz.A0y();
        return nativeGetTextOpacityTransition();
    }

    public PropertyValue getTextOptional() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextOptional(), "text-optional");
    }

    public PropertyValue getTextPadding() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextPadding(), "text-padding");
    }

    public PropertyValue getTextPitchAlignment() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextPitchAlignment(), "text-pitch-alignment");
    }

    public PropertyValue getTextRadialOffset() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextRadialOffset(), "text-radial-offset");
    }

    public PropertyValue getTextRotate() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextRotate(), "text-rotate");
    }

    public PropertyValue getTextRotationAlignment() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextRotationAlignment(), "text-rotation-alignment");
    }

    public PropertyValue getTextSize() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextSize(), "text-size");
    }

    public PropertyValue getTextTransform() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextTransform(), "text-transform");
    }

    public PropertyValue getTextTranslate() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextTranslate(), "text-translate");
    }

    public PropertyValue getTextTranslateAnchor() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextTranslateAnchor(), "text-translate-anchor");
    }

    public TransitionOptions getTextTranslateTransition() {
        JQz.A0y();
        return nativeGetTextTranslateTransition();
    }

    public PropertyValue getTextVariableAnchor() {
        JQz.A0y();
        return JQz.A0e(nativeGetTextVariableAnchor(), "text-variable-anchor");
    }

    public native void initialize(String str, String str2);

    public void setFilter(Expression expression) {
        JQz.A0y();
        nativeSetFilter(expression.toArray());
    }

    public void setIconColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetIconColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setIconHaloBlurTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetIconHaloBlurTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setIconHaloColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetIconHaloColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setIconHaloWidthTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetIconHaloWidthTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setIconOpacityTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetIconOpacityTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setIconTranslateTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetIconTranslateTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setSourceLayer(String str) {
        JQz.A0y();
        nativeSetSourceLayer(str);
    }

    public void setTextColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetTextColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setTextHaloBlurTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetTextHaloBlurTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setTextHaloColorTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetTextHaloColorTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setTextHaloWidthTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetTextHaloWidthTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setTextOpacityTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetTextOpacityTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setTextTranslateTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetTextTranslateTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public SymbolLayer withFilter(Expression expression) {
        setFilter(expression);
        return this;
    }

    public SymbolLayer withProperties(PropertyValue... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public SymbolLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }
}
