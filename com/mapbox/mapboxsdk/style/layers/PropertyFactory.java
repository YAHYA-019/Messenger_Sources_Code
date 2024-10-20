package com.mapbox.mapboxsdk.style.layers;

import X.JQz;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.types.Formatted;
import com.mapbox.mapboxsdk.utils.ColorUtils;

/* loaded from: PropertyFactory.class */
public class PropertyFactory {
    public static PropertyValue backgroundColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "background-color");
    }

    public static PropertyValue backgroundColor(Expression expression) {
        return JQz.A0d(expression, "background-color");
    }

    public static PropertyValue backgroundColor(String str) {
        return JQz.A0d(str, "background-color");
    }

    public static PropertyValue backgroundOpacity(Expression expression) {
        return JQz.A0d(expression, "background-opacity");
    }

    public static PropertyValue backgroundOpacity(Float f) {
        return JQz.A0d(f, "background-opacity");
    }

    public static PropertyValue backgroundPattern(Expression expression) {
        return JQz.A0d(expression, "background-pattern");
    }

    public static PropertyValue backgroundPattern(String str) {
        return JQz.A0d(str, "background-pattern");
    }

    public static PropertyValue circleBlur(Expression expression) {
        return JQz.A0d(expression, "circle-blur");
    }

    public static PropertyValue circleBlur(Float f) {
        return JQz.A0d(f, "circle-blur");
    }

    public static PropertyValue circleColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "circle-color");
    }

    public static PropertyValue circleColor(Expression expression) {
        return JQz.A0d(expression, "circle-color");
    }

    public static PropertyValue circleColor(String str) {
        return JQz.A0d(str, "circle-color");
    }

    public static PropertyValue circleOpacity(Expression expression) {
        return JQz.A0d(expression, "circle-opacity");
    }

    public static PropertyValue circleOpacity(Float f) {
        return JQz.A0d(f, "circle-opacity");
    }

    public static PropertyValue circlePitchAlignment(Expression expression) {
        return JQz.A0d(expression, "circle-pitch-alignment");
    }

    public static PropertyValue circlePitchAlignment(String str) {
        return JQz.A0d(str, "circle-pitch-alignment");
    }

    public static PropertyValue circlePitchScale(Expression expression) {
        return JQz.A0d(expression, "circle-pitch-scale");
    }

    public static PropertyValue circlePitchScale(String str) {
        return JQz.A0d(str, "circle-pitch-scale");
    }

    public static PropertyValue circleRadius(Expression expression) {
        return JQz.A0d(expression, "circle-radius");
    }

    public static PropertyValue circleRadius(Float f) {
        return JQz.A0d(f, "circle-radius");
    }

    public static PropertyValue circleStrokeColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "circle-stroke-color");
    }

    public static PropertyValue circleStrokeColor(Expression expression) {
        return JQz.A0d(expression, "circle-stroke-color");
    }

    public static PropertyValue circleStrokeColor(String str) {
        return JQz.A0d(str, "circle-stroke-color");
    }

    public static PropertyValue circleStrokeOpacity(Expression expression) {
        return JQz.A0d(expression, "circle-stroke-opacity");
    }

    public static PropertyValue circleStrokeOpacity(Float f) {
        return JQz.A0d(f, "circle-stroke-opacity");
    }

    public static PropertyValue circleStrokeWidth(Expression expression) {
        return JQz.A0d(expression, "circle-stroke-width");
    }

    public static PropertyValue circleStrokeWidth(Float f) {
        return JQz.A0d(f, "circle-stroke-width");
    }

    public static PropertyValue circleTranslate(Expression expression) {
        return JQz.A0d(expression, "circle-translate");
    }

    public static PropertyValue circleTranslate(Float[] fArr) {
        return JQz.A0d(fArr, "circle-translate");
    }

    public static PropertyValue circleTranslateAnchor(Expression expression) {
        return JQz.A0d(expression, "circle-translate-anchor");
    }

    public static PropertyValue circleTranslateAnchor(String str) {
        return JQz.A0d(str, "circle-translate-anchor");
    }

    public static PropertyValue fillAntialias(Expression expression) {
        return JQz.A0d(expression, "fill-antialias");
    }

    public static PropertyValue fillAntialias(Boolean bool) {
        return JQz.A0d(bool, "fill-antialias");
    }

    public static PropertyValue fillColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "fill-color");
    }

    public static PropertyValue fillColor(Expression expression) {
        return JQz.A0d(expression, "fill-color");
    }

    public static PropertyValue fillColor(String str) {
        return JQz.A0d(str, "fill-color");
    }

    public static PropertyValue fillExtrusionBase(Expression expression) {
        return JQz.A0d(expression, "fill-extrusion-base");
    }

    public static PropertyValue fillExtrusionBase(Float f) {
        return JQz.A0d(f, "fill-extrusion-base");
    }

    public static PropertyValue fillExtrusionColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "fill-extrusion-color");
    }

    public static PropertyValue fillExtrusionColor(Expression expression) {
        return JQz.A0d(expression, "fill-extrusion-color");
    }

    public static PropertyValue fillExtrusionColor(String str) {
        return JQz.A0d(str, "fill-extrusion-color");
    }

    public static PropertyValue fillExtrusionHeight(Expression expression) {
        return JQz.A0d(expression, "fill-extrusion-height");
    }

    public static PropertyValue fillExtrusionHeight(Float f) {
        return JQz.A0d(f, "fill-extrusion-height");
    }

    public static PropertyValue fillExtrusionOpacity(Expression expression) {
        return JQz.A0d(expression, "fill-extrusion-opacity");
    }

    public static PropertyValue fillExtrusionOpacity(Float f) {
        return JQz.A0d(f, "fill-extrusion-opacity");
    }

    public static PropertyValue fillExtrusionPattern(Expression expression) {
        return JQz.A0d(expression, "fill-extrusion-pattern");
    }

    public static PropertyValue fillExtrusionPattern(String str) {
        return JQz.A0d(str, "fill-extrusion-pattern");
    }

    public static PropertyValue fillExtrusionTranslate(Expression expression) {
        return JQz.A0d(expression, "fill-extrusion-translate");
    }

    public static PropertyValue fillExtrusionTranslate(Float[] fArr) {
        return JQz.A0d(fArr, "fill-extrusion-translate");
    }

    public static PropertyValue fillExtrusionTranslateAnchor(Expression expression) {
        return JQz.A0d(expression, "fill-extrusion-translate-anchor");
    }

    public static PropertyValue fillExtrusionTranslateAnchor(String str) {
        return JQz.A0d(str, "fill-extrusion-translate-anchor");
    }

    public static PropertyValue fillExtrusionVerticalGradient(Expression expression) {
        return JQz.A0d(expression, "fill-extrusion-vertical-gradient");
    }

    public static PropertyValue fillExtrusionVerticalGradient(Boolean bool) {
        return JQz.A0d(bool, "fill-extrusion-vertical-gradient");
    }

    public static PropertyValue fillOpacity(Expression expression) {
        return JQz.A0d(expression, "fill-opacity");
    }

    public static PropertyValue fillOpacity(Float f) {
        return JQz.A0d(f, "fill-opacity");
    }

    public static PropertyValue fillOutlineColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "fill-outline-color");
    }

    public static PropertyValue fillOutlineColor(Expression expression) {
        return JQz.A0d(expression, "fill-outline-color");
    }

    public static PropertyValue fillOutlineColor(String str) {
        return JQz.A0d(str, "fill-outline-color");
    }

    public static PropertyValue fillPattern(Expression expression) {
        return JQz.A0d(expression, "fill-pattern");
    }

    public static PropertyValue fillPattern(String str) {
        return JQz.A0d(str, "fill-pattern");
    }

    public static PropertyValue fillTranslate(Expression expression) {
        return JQz.A0d(expression, "fill-translate");
    }

    public static PropertyValue fillTranslate(Float[] fArr) {
        return JQz.A0d(fArr, "fill-translate");
    }

    public static PropertyValue fillTranslateAnchor(Expression expression) {
        return JQz.A0d(expression, "fill-translate-anchor");
    }

    public static PropertyValue fillTranslateAnchor(String str) {
        return JQz.A0d(str, "fill-translate-anchor");
    }

    public static PropertyValue heatmapColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "heatmap-color");
    }

    public static PropertyValue heatmapColor(Expression expression) {
        return JQz.A0d(expression, "heatmap-color");
    }

    public static PropertyValue heatmapColor(String str) {
        return JQz.A0d(str, "heatmap-color");
    }

    public static PropertyValue heatmapIntensity(Expression expression) {
        return JQz.A0d(expression, "heatmap-intensity");
    }

    public static PropertyValue heatmapIntensity(Float f) {
        return JQz.A0d(f, "heatmap-intensity");
    }

    public static PropertyValue heatmapOpacity(Expression expression) {
        return JQz.A0d(expression, "heatmap-opacity");
    }

    public static PropertyValue heatmapOpacity(Float f) {
        return JQz.A0d(f, "heatmap-opacity");
    }

    public static PropertyValue heatmapRadius(Expression expression) {
        return JQz.A0d(expression, "heatmap-radius");
    }

    public static PropertyValue heatmapRadius(Float f) {
        return JQz.A0d(f, "heatmap-radius");
    }

    public static PropertyValue heatmapWeight(Expression expression) {
        return JQz.A0d(expression, "heatmap-weight");
    }

    public static PropertyValue heatmapWeight(Float f) {
        return JQz.A0d(f, "heatmap-weight");
    }

    public static PropertyValue hillshadeAccentColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "hillshade-accent-color");
    }

    public static PropertyValue hillshadeAccentColor(Expression expression) {
        return JQz.A0d(expression, "hillshade-accent-color");
    }

    public static PropertyValue hillshadeAccentColor(String str) {
        return JQz.A0d(str, "hillshade-accent-color");
    }

    public static PropertyValue hillshadeExaggeration(Expression expression) {
        return JQz.A0d(expression, "hillshade-exaggeration");
    }

    public static PropertyValue hillshadeExaggeration(Float f) {
        return JQz.A0d(f, "hillshade-exaggeration");
    }

    public static PropertyValue hillshadeHighlightColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "hillshade-highlight-color");
    }

    public static PropertyValue hillshadeHighlightColor(Expression expression) {
        return JQz.A0d(expression, "hillshade-highlight-color");
    }

    public static PropertyValue hillshadeHighlightColor(String str) {
        return JQz.A0d(str, "hillshade-highlight-color");
    }

    public static PropertyValue hillshadeIlluminationAnchor(Expression expression) {
        return JQz.A0d(expression, "hillshade-illumination-anchor");
    }

    public static PropertyValue hillshadeIlluminationAnchor(String str) {
        return JQz.A0d(str, "hillshade-illumination-anchor");
    }

    public static PropertyValue hillshadeIlluminationDirection(Expression expression) {
        return JQz.A0d(expression, "hillshade-illumination-direction");
    }

    public static PropertyValue hillshadeIlluminationDirection(Float f) {
        return JQz.A0d(f, "hillshade-illumination-direction");
    }

    public static PropertyValue hillshadeShadowColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "hillshade-shadow-color");
    }

    public static PropertyValue hillshadeShadowColor(Expression expression) {
        return JQz.A0d(expression, "hillshade-shadow-color");
    }

    public static PropertyValue hillshadeShadowColor(String str) {
        return JQz.A0d(str, "hillshade-shadow-color");
    }

    public static PropertyValue iconAllowOverlap(Expression expression) {
        return JQz.A0c(expression, "icon-allow-overlap");
    }

    public static PropertyValue iconAllowOverlap(Boolean bool) {
        return JQz.A0c(bool, "icon-allow-overlap");
    }

    public static PropertyValue iconAnchor(Expression expression) {
        return JQz.A0c(expression, "icon-anchor");
    }

    public static PropertyValue iconAnchor(String str) {
        return JQz.A0c(str, "icon-anchor");
    }

    public static PropertyValue iconColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "icon-color");
    }

    public static PropertyValue iconColor(Expression expression) {
        return JQz.A0d(expression, "icon-color");
    }

    public static PropertyValue iconColor(String str) {
        return JQz.A0d(str, "icon-color");
    }

    public static PropertyValue iconHaloBlur(Expression expression) {
        return JQz.A0d(expression, "icon-halo-blur");
    }

    public static PropertyValue iconHaloBlur(Float f) {
        return JQz.A0d(f, "icon-halo-blur");
    }

    public static PropertyValue iconHaloColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "icon-halo-color");
    }

    public static PropertyValue iconHaloColor(Expression expression) {
        return JQz.A0d(expression, "icon-halo-color");
    }

    public static PropertyValue iconHaloColor(String str) {
        return JQz.A0d(str, "icon-halo-color");
    }

    public static PropertyValue iconHaloWidth(Expression expression) {
        return JQz.A0d(expression, "icon-halo-width");
    }

    public static PropertyValue iconHaloWidth(Float f) {
        return JQz.A0d(f, "icon-halo-width");
    }

    public static PropertyValue iconIgnorePlacement(Expression expression) {
        return JQz.A0c(expression, "icon-ignore-placement");
    }

    public static PropertyValue iconIgnorePlacement(Boolean bool) {
        return JQz.A0c(bool, "icon-ignore-placement");
    }

    public static PropertyValue iconImage(Expression expression) {
        return JQz.A0c(expression, "icon-image");
    }

    public static PropertyValue iconImage(String str) {
        return JQz.A0c(str, "icon-image");
    }

    public static PropertyValue iconKeepUpright(Expression expression) {
        return JQz.A0c(expression, "icon-keep-upright");
    }

    public static PropertyValue iconKeepUpright(Boolean bool) {
        return JQz.A0c(bool, "icon-keep-upright");
    }

    public static PropertyValue iconOffset(Expression expression) {
        return JQz.A0c(expression, "icon-offset");
    }

    public static PropertyValue iconOffset(Float[] fArr) {
        return JQz.A0c(fArr, "icon-offset");
    }

    public static PropertyValue iconOpacity(Expression expression) {
        return JQz.A0d(expression, "icon-opacity");
    }

    public static PropertyValue iconOpacity(Float f) {
        return JQz.A0d(f, "icon-opacity");
    }

    public static PropertyValue iconOptional(Expression expression) {
        return JQz.A0c(expression, "icon-optional");
    }

    public static PropertyValue iconOptional(Boolean bool) {
        return JQz.A0c(bool, "icon-optional");
    }

    public static PropertyValue iconPadding(Expression expression) {
        return JQz.A0c(expression, "icon-padding");
    }

    public static PropertyValue iconPadding(Float f) {
        return JQz.A0c(f, "icon-padding");
    }

    public static PropertyValue iconPitchAlignment(Expression expression) {
        return JQz.A0c(expression, "icon-pitch-alignment");
    }

    public static PropertyValue iconPitchAlignment(String str) {
        return JQz.A0c(str, "icon-pitch-alignment");
    }

    public static PropertyValue iconRotate(Expression expression) {
        return JQz.A0c(expression, "icon-rotate");
    }

    public static PropertyValue iconRotate(Float f) {
        return JQz.A0c(f, "icon-rotate");
    }

    public static PropertyValue iconRotationAlignment(Expression expression) {
        return JQz.A0c(expression, "icon-rotation-alignment");
    }

    public static PropertyValue iconRotationAlignment(String str) {
        return JQz.A0c(str, "icon-rotation-alignment");
    }

    public static PropertyValue iconSize(Expression expression) {
        return JQz.A0c(expression, "icon-size");
    }

    public static PropertyValue iconSize(Float f) {
        return JQz.A0c(f, "icon-size");
    }

    public static PropertyValue iconTextFit(Expression expression) {
        return JQz.A0c(expression, "icon-text-fit");
    }

    public static PropertyValue iconTextFit(String str) {
        return JQz.A0c(str, "icon-text-fit");
    }

    public static PropertyValue iconTextFitPadding(Expression expression) {
        return JQz.A0c(expression, "icon-text-fit-padding");
    }

    public static PropertyValue iconTextFitPadding(Float[] fArr) {
        return JQz.A0c(fArr, "icon-text-fit-padding");
    }

    public static PropertyValue iconTranslate(Expression expression) {
        return JQz.A0d(expression, "icon-translate");
    }

    public static PropertyValue iconTranslate(Float[] fArr) {
        return JQz.A0d(fArr, "icon-translate");
    }

    public static PropertyValue iconTranslateAnchor(Expression expression) {
        return JQz.A0d(expression, "icon-translate-anchor");
    }

    public static PropertyValue iconTranslateAnchor(String str) {
        return JQz.A0d(str, "icon-translate-anchor");
    }

    public static PropertyValue lineBlur(Expression expression) {
        return JQz.A0d(expression, "line-blur");
    }

    public static PropertyValue lineBlur(Float f) {
        return JQz.A0d(f, "line-blur");
    }

    public static PropertyValue lineCap(Expression expression) {
        return JQz.A0c(expression, "line-cap");
    }

    public static PropertyValue lineCap(String str) {
        return JQz.A0c(str, "line-cap");
    }

    public static PropertyValue lineColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "line-color");
    }

    public static PropertyValue lineColor(Expression expression) {
        return JQz.A0d(expression, "line-color");
    }

    public static PropertyValue lineColor(String str) {
        return JQz.A0d(str, "line-color");
    }

    public static PropertyValue lineDasharray(Expression expression) {
        return JQz.A0d(expression, "line-dasharray");
    }

    public static PropertyValue lineDasharray(Float[] fArr) {
        return JQz.A0d(fArr, "line-dasharray");
    }

    public static PropertyValue lineGapWidth(Expression expression) {
        return JQz.A0d(expression, "line-gap-width");
    }

    public static PropertyValue lineGapWidth(Float f) {
        return JQz.A0d(f, "line-gap-width");
    }

    public static PropertyValue lineGradient(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "line-gradient");
    }

    public static PropertyValue lineGradient(Expression expression) {
        return JQz.A0d(expression, "line-gradient");
    }

    public static PropertyValue lineGradient(String str) {
        return JQz.A0d(str, "line-gradient");
    }

    public static PropertyValue lineJoin(Expression expression) {
        return JQz.A0c(expression, "line-join");
    }

    public static PropertyValue lineJoin(String str) {
        return JQz.A0c(str, "line-join");
    }

    public static PropertyValue lineMiterLimit(Expression expression) {
        return JQz.A0c(expression, "line-miter-limit");
    }

    public static PropertyValue lineMiterLimit(Float f) {
        return JQz.A0c(f, "line-miter-limit");
    }

    public static PropertyValue lineOffset(Expression expression) {
        return JQz.A0d(expression, "line-offset");
    }

    public static PropertyValue lineOffset(Float f) {
        return JQz.A0d(f, "line-offset");
    }

    public static PropertyValue lineOpacity(Expression expression) {
        return JQz.A0d(expression, "line-opacity");
    }

    public static PropertyValue lineOpacity(Float f) {
        return JQz.A0d(f, "line-opacity");
    }

    public static PropertyValue linePattern(Expression expression) {
        return JQz.A0d(expression, "line-pattern");
    }

    public static PropertyValue linePattern(String str) {
        return JQz.A0d(str, "line-pattern");
    }

    public static PropertyValue lineRoundLimit(Expression expression) {
        return JQz.A0c(expression, "line-round-limit");
    }

    public static PropertyValue lineRoundLimit(Float f) {
        return JQz.A0c(f, "line-round-limit");
    }

    public static PropertyValue lineTranslate(Expression expression) {
        return JQz.A0d(expression, "line-translate");
    }

    public static PropertyValue lineTranslate(Float[] fArr) {
        return JQz.A0d(fArr, "line-translate");
    }

    public static PropertyValue lineTranslateAnchor(Expression expression) {
        return JQz.A0d(expression, "line-translate-anchor");
    }

    public static PropertyValue lineTranslateAnchor(String str) {
        return JQz.A0d(str, "line-translate-anchor");
    }

    public static PropertyValue lineWidth(Expression expression) {
        return JQz.A0d(expression, "line-width");
    }

    public static PropertyValue lineWidth(Float f) {
        return JQz.A0d(f, "line-width");
    }

    public static PropertyValue rasterBrightnessMax(Expression expression) {
        return JQz.A0d(expression, "raster-brightness-max");
    }

    public static PropertyValue rasterBrightnessMax(Float f) {
        return JQz.A0d(f, "raster-brightness-max");
    }

    public static PropertyValue rasterBrightnessMin(Expression expression) {
        return JQz.A0d(expression, "raster-brightness-min");
    }

    public static PropertyValue rasterBrightnessMin(Float f) {
        return JQz.A0d(f, "raster-brightness-min");
    }

    public static PropertyValue rasterContrast(Expression expression) {
        return JQz.A0d(expression, "raster-contrast");
    }

    public static PropertyValue rasterContrast(Float f) {
        return JQz.A0d(f, "raster-contrast");
    }

    public static PropertyValue rasterFadeDuration(Expression expression) {
        return JQz.A0d(expression, "raster-fade-duration");
    }

    public static PropertyValue rasterFadeDuration(Float f) {
        return JQz.A0d(f, "raster-fade-duration");
    }

    public static PropertyValue rasterHueRotate(Expression expression) {
        return JQz.A0d(expression, "raster-hue-rotate");
    }

    public static PropertyValue rasterHueRotate(Float f) {
        return JQz.A0d(f, "raster-hue-rotate");
    }

    public static PropertyValue rasterOpacity(Expression expression) {
        return JQz.A0d(expression, "raster-opacity");
    }

    public static PropertyValue rasterOpacity(Float f) {
        return JQz.A0d(f, "raster-opacity");
    }

    public static PropertyValue rasterResampling(Expression expression) {
        return JQz.A0d(expression, "raster-resampling");
    }

    public static PropertyValue rasterResampling(String str) {
        return JQz.A0d(str, "raster-resampling");
    }

    public static PropertyValue rasterSaturation(Expression expression) {
        return JQz.A0d(expression, "raster-saturation");
    }

    public static PropertyValue rasterSaturation(Float f) {
        return JQz.A0d(f, "raster-saturation");
    }

    public static PropertyValue symbolAvoidEdges(Expression expression) {
        return JQz.A0c(expression, "symbol-avoid-edges");
    }

    public static PropertyValue symbolAvoidEdges(Boolean bool) {
        return JQz.A0c(bool, "symbol-avoid-edges");
    }

    public static PropertyValue symbolPlacement(Expression expression) {
        return JQz.A0c(expression, "symbol-placement");
    }

    public static PropertyValue symbolPlacement(String str) {
        return JQz.A0c(str, "symbol-placement");
    }

    public static PropertyValue symbolSortKey(Expression expression) {
        return JQz.A0c(expression, "symbol-sort-key");
    }

    public static PropertyValue symbolSortKey(Float f) {
        return JQz.A0c(f, "symbol-sort-key");
    }

    public static PropertyValue symbolSpacing(Expression expression) {
        return JQz.A0c(expression, "symbol-spacing");
    }

    public static PropertyValue symbolSpacing(Float f) {
        return JQz.A0c(f, "symbol-spacing");
    }

    public static PropertyValue symbolZOrder(Expression expression) {
        return JQz.A0c(expression, "symbol-z-order");
    }

    public static PropertyValue symbolZOrder(String str) {
        return JQz.A0c(str, "symbol-z-order");
    }

    public static PropertyValue textAllowOverlap(Expression expression) {
        return JQz.A0c(expression, "text-allow-overlap");
    }

    public static PropertyValue textAllowOverlap(Boolean bool) {
        return JQz.A0c(bool, "text-allow-overlap");
    }

    public static PropertyValue textAnchor(Expression expression) {
        return JQz.A0c(expression, "text-anchor");
    }

    public static PropertyValue textAnchor(String str) {
        return JQz.A0c(str, "text-anchor");
    }

    public static PropertyValue textColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "text-color");
    }

    public static PropertyValue textColor(Expression expression) {
        return JQz.A0d(expression, "text-color");
    }

    public static PropertyValue textColor(String str) {
        return JQz.A0d(str, "text-color");
    }

    public static PropertyValue textField(Expression expression) {
        return JQz.A0c(expression, "text-field");
    }

    public static PropertyValue textField(Formatted formatted) {
        return JQz.A0c(formatted, "text-field");
    }

    public static PropertyValue textField(String str) {
        return JQz.A0c(str, "text-field");
    }

    public static PropertyValue textFont(Expression expression) {
        return JQz.A0c(expression, "text-font");
    }

    public static PropertyValue textFont(String[] strArr) {
        return JQz.A0c(strArr, "text-font");
    }

    public static PropertyValue textHaloBlur(Expression expression) {
        return JQz.A0d(expression, "text-halo-blur");
    }

    public static PropertyValue textHaloBlur(Float f) {
        return JQz.A0d(f, "text-halo-blur");
    }

    public static PropertyValue textHaloColor(int i) {
        return JQz.A0d(ColorUtils.colorToRgbaString(i), "text-halo-color");
    }

    public static PropertyValue textHaloColor(Expression expression) {
        return JQz.A0d(expression, "text-halo-color");
    }

    public static PropertyValue textHaloColor(String str) {
        return JQz.A0d(str, "text-halo-color");
    }

    public static PropertyValue textHaloWidth(Expression expression) {
        return JQz.A0d(expression, "text-halo-width");
    }

    public static PropertyValue textHaloWidth(Float f) {
        return JQz.A0d(f, "text-halo-width");
    }

    public static PropertyValue textIgnorePlacement(Expression expression) {
        return JQz.A0c(expression, "text-ignore-placement");
    }

    public static PropertyValue textIgnorePlacement(Boolean bool) {
        return JQz.A0c(bool, "text-ignore-placement");
    }

    public static PropertyValue textJustify(Expression expression) {
        return JQz.A0c(expression, "text-justify");
    }

    public static PropertyValue textJustify(String str) {
        return JQz.A0c(str, "text-justify");
    }

    public static PropertyValue textKeepUpright(Expression expression) {
        return JQz.A0c(expression, "text-keep-upright");
    }

    public static PropertyValue textKeepUpright(Boolean bool) {
        return JQz.A0c(bool, "text-keep-upright");
    }

    public static PropertyValue textLetterSpacing(Expression expression) {
        return JQz.A0c(expression, "text-letter-spacing");
    }

    public static PropertyValue textLetterSpacing(Float f) {
        return JQz.A0c(f, "text-letter-spacing");
    }

    public static PropertyValue textLineHeight(Expression expression) {
        return JQz.A0c(expression, "text-line-height");
    }

    public static PropertyValue textLineHeight(Float f) {
        return JQz.A0c(f, "text-line-height");
    }

    public static PropertyValue textMaxAngle(Expression expression) {
        return JQz.A0c(expression, "text-max-angle");
    }

    public static PropertyValue textMaxAngle(Float f) {
        return JQz.A0c(f, "text-max-angle");
    }

    public static PropertyValue textMaxWidth(Expression expression) {
        return JQz.A0c(expression, "text-max-width");
    }

    public static PropertyValue textMaxWidth(Float f) {
        return JQz.A0c(f, "text-max-width");
    }

    public static PropertyValue textOffset(Expression expression) {
        return JQz.A0c(expression, "text-offset");
    }

    public static PropertyValue textOffset(Float[] fArr) {
        return JQz.A0c(fArr, "text-offset");
    }

    public static PropertyValue textOpacity(Expression expression) {
        return JQz.A0d(expression, "text-opacity");
    }

    public static PropertyValue textOpacity(Float f) {
        return JQz.A0d(f, "text-opacity");
    }

    public static PropertyValue textOptional(Expression expression) {
        return JQz.A0c(expression, "text-optional");
    }

    public static PropertyValue textOptional(Boolean bool) {
        return JQz.A0c(bool, "text-optional");
    }

    public static PropertyValue textPadding(Expression expression) {
        return JQz.A0c(expression, "text-padding");
    }

    public static PropertyValue textPadding(Float f) {
        return JQz.A0c(f, "text-padding");
    }

    public static PropertyValue textPitchAlignment(Expression expression) {
        return JQz.A0c(expression, "text-pitch-alignment");
    }

    public static PropertyValue textPitchAlignment(String str) {
        return JQz.A0c(str, "text-pitch-alignment");
    }

    public static PropertyValue textRadialOffset(Expression expression) {
        return JQz.A0c(expression, "text-radial-offset");
    }

    public static PropertyValue textRadialOffset(Float f) {
        return JQz.A0c(f, "text-radial-offset");
    }

    public static PropertyValue textRotate(Expression expression) {
        return JQz.A0c(expression, "text-rotate");
    }

    public static PropertyValue textRotate(Float f) {
        return JQz.A0c(f, "text-rotate");
    }

    public static PropertyValue textRotationAlignment(Expression expression) {
        return JQz.A0c(expression, "text-rotation-alignment");
    }

    public static PropertyValue textRotationAlignment(String str) {
        return JQz.A0c(str, "text-rotation-alignment");
    }

    public static PropertyValue textSize(Expression expression) {
        return JQz.A0c(expression, "text-size");
    }

    public static PropertyValue textSize(Float f) {
        return JQz.A0c(f, "text-size");
    }

    public static PropertyValue textTransform(Expression expression) {
        return JQz.A0c(expression, "text-transform");
    }

    public static PropertyValue textTransform(String str) {
        return JQz.A0c(str, "text-transform");
    }

    public static PropertyValue textTranslate(Expression expression) {
        return JQz.A0d(expression, "text-translate");
    }

    public static PropertyValue textTranslate(Float[] fArr) {
        return JQz.A0d(fArr, "text-translate");
    }

    public static PropertyValue textTranslateAnchor(Expression expression) {
        return JQz.A0d(expression, "text-translate-anchor");
    }

    public static PropertyValue textTranslateAnchor(String str) {
        return JQz.A0d(str, "text-translate-anchor");
    }

    public static PropertyValue textVariableAnchor(Expression expression) {
        return JQz.A0c(expression, "text-variable-anchor");
    }

    public static PropertyValue textVariableAnchor(String[] strArr) {
        return JQz.A0c(strArr, "text-variable-anchor");
    }

    public static PropertyValue visibility(String str) {
        return JQz.A0c(str, "visibility");
    }
}
