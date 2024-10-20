package com.mapbox.mapboxsdk.style.layers;

import X.JQz;

/* loaded from: RasterLayer.class */
public class RasterLayer extends Layer {
    public RasterLayer(long j) {
        super(j);
    }

    public RasterLayer(String str, String str2) {
        initialize(str, str2);
    }

    private native Object nativeGetRasterBrightnessMax();

    private native TransitionOptions nativeGetRasterBrightnessMaxTransition();

    private native Object nativeGetRasterBrightnessMin();

    private native TransitionOptions nativeGetRasterBrightnessMinTransition();

    private native Object nativeGetRasterContrast();

    private native TransitionOptions nativeGetRasterContrastTransition();

    private native Object nativeGetRasterFadeDuration();

    private native Object nativeGetRasterHueRotate();

    private native TransitionOptions nativeGetRasterHueRotateTransition();

    private native Object nativeGetRasterOpacity();

    private native TransitionOptions nativeGetRasterOpacityTransition();

    private native Object nativeGetRasterResampling();

    private native Object nativeGetRasterSaturation();

    private native TransitionOptions nativeGetRasterSaturationTransition();

    private native void nativeSetRasterBrightnessMaxTransition(long j, long j2);

    private native void nativeSetRasterBrightnessMinTransition(long j, long j2);

    private native void nativeSetRasterContrastTransition(long j, long j2);

    private native void nativeSetRasterHueRotateTransition(long j, long j2);

    private native void nativeSetRasterOpacityTransition(long j, long j2);

    private native void nativeSetRasterSaturationTransition(long j, long j2);

    @Override // com.mapbox.mapboxsdk.style.layers.Layer
    public native void finalize();

    public PropertyValue getRasterBrightnessMax() {
        JQz.A0y();
        return JQz.A0e(nativeGetRasterBrightnessMax(), "raster-brightness-max");
    }

    public TransitionOptions getRasterBrightnessMaxTransition() {
        JQz.A0y();
        return nativeGetRasterBrightnessMaxTransition();
    }

    public PropertyValue getRasterBrightnessMin() {
        JQz.A0y();
        return JQz.A0e(nativeGetRasterBrightnessMin(), "raster-brightness-min");
    }

    public TransitionOptions getRasterBrightnessMinTransition() {
        JQz.A0y();
        return nativeGetRasterBrightnessMinTransition();
    }

    public PropertyValue getRasterContrast() {
        JQz.A0y();
        return JQz.A0e(nativeGetRasterContrast(), "raster-contrast");
    }

    public TransitionOptions getRasterContrastTransition() {
        JQz.A0y();
        return nativeGetRasterContrastTransition();
    }

    public PropertyValue getRasterFadeDuration() {
        JQz.A0y();
        return JQz.A0e(nativeGetRasterFadeDuration(), "raster-fade-duration");
    }

    public PropertyValue getRasterHueRotate() {
        JQz.A0y();
        return JQz.A0e(nativeGetRasterHueRotate(), "raster-hue-rotate");
    }

    public TransitionOptions getRasterHueRotateTransition() {
        JQz.A0y();
        return nativeGetRasterHueRotateTransition();
    }

    public PropertyValue getRasterOpacity() {
        JQz.A0y();
        return JQz.A0e(nativeGetRasterOpacity(), "raster-opacity");
    }

    public TransitionOptions getRasterOpacityTransition() {
        JQz.A0y();
        return nativeGetRasterOpacityTransition();
    }

    public PropertyValue getRasterResampling() {
        JQz.A0y();
        return JQz.A0e(nativeGetRasterResampling(), "raster-resampling");
    }

    public PropertyValue getRasterSaturation() {
        JQz.A0y();
        return JQz.A0e(nativeGetRasterSaturation(), "raster-saturation");
    }

    public TransitionOptions getRasterSaturationTransition() {
        JQz.A0y();
        return nativeGetRasterSaturationTransition();
    }

    public String getSourceId() {
        JQz.A0y();
        return nativeGetSourceId();
    }

    public native void initialize(String str, String str2);

    public void setRasterBrightnessMaxTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetRasterBrightnessMaxTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setRasterBrightnessMinTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetRasterBrightnessMinTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setRasterContrastTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetRasterContrastTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setRasterHueRotateTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetRasterHueRotateTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setRasterOpacityTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetRasterOpacityTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setRasterSaturationTransition(TransitionOptions transitionOptions) {
        JQz.A0y();
        nativeSetRasterSaturationTransition(transitionOptions.duration, transitionOptions.delay);
    }

    public void setSourceLayer(String str) {
        JQz.A0y();
        nativeSetSourceLayer(str);
    }

    public RasterLayer withProperties(PropertyValue... propertyValueArr) {
        setProperties(propertyValueArr);
        return this;
    }

    public RasterLayer withSourceLayer(String str) {
        setSourceLayer(str);
        return this;
    }
}
