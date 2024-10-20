package com.mapbox.mapboxsdk.maps;

import X.AnonymousClass001;
import X.DKC;
import X.DKG;
import X.JQx;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.widgets.CompassView;
import com.mapbox.mapboxsdk.utils.BitmapUtils;
import com.mapbox.mapboxsdk.utils.ColorUtils;

/* loaded from: UiSettings.class */
public final class UiSettings {
    public AttributionDialogManager attributionDialogManager;
    public final ImageView attributionsView;
    public final CompassView compassView;
    public final FocalPointChangeListener focalPointChangeListener;
    public final View logoView;
    public final float pixelRatio;
    public final Projection projection;
    public PointF userProvidedFocalPoint;
    public final int[] compassMargins = new int[4];
    public final int[] attributionsMargins = new int[4];
    public final int[] logoMargins = new int[4];
    public boolean rotateGesturesEnabled = true;
    public boolean tiltGesturesEnabled = true;
    public boolean zoomGesturesEnabled = true;
    public boolean scrollGesturesEnabled = true;
    public boolean doubleTapGesturesEnabled = true;
    public boolean quickZoomGesturesEnabled = true;
    public boolean scaleVelocityAnimationEnabled = true;
    public boolean rotateVelocityAnimationEnabled = true;
    public boolean flingVelocityAnimationEnabled = true;
    public boolean increaseRotateThresholdWhenScaling = true;
    public boolean increaseScaleThresholdWhenRotating = true;
    public float zoomRate = 1.0f;
    public boolean deselectMarkersOnTap = true;

    public UiSettings(Projection projection, FocalPointChangeListener focalPointChangeListener, CompassView compassView, ImageView imageView, View view, float f) {
        this.projection = projection;
        this.focalPointChangeListener = focalPointChangeListener;
        this.compassView = compassView;
        this.attributionsView = imageView;
        this.logoView = view;
        this.pixelRatio = f;
    }

    private void initialiseAttribution(Context context, MapboxMapOptions mapboxMapOptions) {
        setAttributionEnabled(mapboxMapOptions.attributionEnabled);
        setAttributionGravity(mapboxMapOptions.attributionGravity);
        setAttributionMargins(context, mapboxMapOptions.attributionMargins);
        int i = mapboxMapOptions.attributionTintColor;
        if (i == -1) {
            i = ColorUtils.getPrimaryColor(context);
        }
        setAttributionTintColor(i);
    }

    private void initialiseCompass(MapboxMapOptions mapboxMapOptions, Resources resources) {
        setCompassEnabled(mapboxMapOptions.compassEnabled);
        setCompassGravity(mapboxMapOptions.compassGravity);
        int[] iArr = mapboxMapOptions.compassMargins;
        if (iArr != null) {
            setCompassMargins(JQx.A0M(iArr), iArr[1], iArr[2], iArr[3]);
        } else {
            int dimension = (int) resources.getDimension(R.dimen.mapbox_four_dp);
            setCompassMargins(dimension, dimension, dimension, dimension);
        }
        setCompassFadeFacingNorth(mapboxMapOptions.fadeCompassFacingNorth);
        Drawable drawable = mapboxMapOptions.compassImage;
        if (drawable == null) {
            drawable = resources.getDrawable(2132345653, null);
            mapboxMapOptions.compassImage = drawable;
        }
        setCompassImage(drawable);
    }

    private void initialiseGestures(MapboxMapOptions mapboxMapOptions) {
        this.zoomGesturesEnabled = mapboxMapOptions.zoomGesturesEnabled;
        this.scrollGesturesEnabled = mapboxMapOptions.scrollGesturesEnabled;
        this.rotateGesturesEnabled = mapboxMapOptions.rotateGesturesEnabled;
        this.tiltGesturesEnabled = mapboxMapOptions.tiltGesturesEnabled;
        this.doubleTapGesturesEnabled = mapboxMapOptions.doubleTapGesturesEnabled;
        this.quickZoomGesturesEnabled = mapboxMapOptions.quickZoomGesturesEnabled;
    }

    private void initialiseLogo(MapboxMapOptions mapboxMapOptions, Resources resources) {
        setLogoEnabled(mapboxMapOptions.logoEnabled);
        setLogoGravity(mapboxMapOptions.logoGravity);
        setLogoMargins(resources, mapboxMapOptions.logoMargins);
    }

    private void restoreAttribution(Bundle bundle) {
        setAttributionEnabled(bundle.getBoolean(MapboxConstants.STATE_ATTRIBUTION_ENABLED));
        setAttributionGravity(bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_GRAVITY));
        setAttributionMargins(bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_LEFT), bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_TOP), bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_RIGHT), bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_BOTTOM));
    }

    private void restoreCompass(Bundle bundle) {
        setCompassEnabled(bundle.getBoolean(MapboxConstants.STATE_COMPASS_ENABLED));
        setCompassGravity(bundle.getInt(MapboxConstants.STATE_COMPASS_GRAVITY));
        setCompassMargins(bundle.getInt(MapboxConstants.STATE_COMPASS_MARGIN_LEFT), bundle.getInt(MapboxConstants.STATE_COMPASS_MARGIN_TOP), bundle.getInt(MapboxConstants.STATE_COMPASS_MARGIN_RIGHT), bundle.getInt(MapboxConstants.STATE_COMPASS_MARGIN_BOTTOM));
        setCompassFadeFacingNorth(bundle.getBoolean(MapboxConstants.STATE_COMPASS_FADE_WHEN_FACING_NORTH));
        setCompassImage(BitmapUtils.getDrawableFromByteArray(this.compassView.getContext(), bundle.getByteArray(MapboxConstants.STATE_COMPASS_IMAGE_BITMAP)));
    }

    private void restoreDeselectMarkersOnTap(Bundle bundle) {
        this.deselectMarkersOnTap = bundle.getBoolean(MapboxConstants.STATE_DESELECT_MARKER_ON_TAP);
    }

    private void restoreFocalPoint(Bundle bundle) {
        PointF pointF = (PointF) bundle.getParcelable(MapboxConstants.STATE_USER_FOCAL_POINT);
        if (pointF != null) {
            setFocalPoint(pointF);
        }
    }

    private void restoreGestures(Bundle bundle) {
        this.zoomGesturesEnabled = bundle.getBoolean(MapboxConstants.STATE_ZOOM_ENABLED);
        this.scrollGesturesEnabled = bundle.getBoolean(MapboxConstants.STATE_SCROLL_ENABLED);
        this.rotateGesturesEnabled = bundle.getBoolean(MapboxConstants.STATE_ROTATE_ENABLED);
        this.tiltGesturesEnabled = bundle.getBoolean(MapboxConstants.STATE_TILT_ENABLED);
        this.doubleTapGesturesEnabled = bundle.getBoolean(MapboxConstants.STATE_DOUBLE_TAP_ENABLED);
        this.scaleVelocityAnimationEnabled = bundle.getBoolean(MapboxConstants.STATE_SCALE_ANIMATION_ENABLED);
        this.rotateVelocityAnimationEnabled = bundle.getBoolean(MapboxConstants.STATE_ROTATE_ANIMATION_ENABLED);
        this.flingVelocityAnimationEnabled = bundle.getBoolean(MapboxConstants.STATE_FLING_ANIMATION_ENABLED);
        this.increaseRotateThresholdWhenScaling = bundle.getBoolean(MapboxConstants.STATE_INCREASE_ROTATE_THRESHOLD);
        this.increaseScaleThresholdWhenRotating = bundle.getBoolean(MapboxConstants.STATE_INCREASE_SCALE_THRESHOLD);
        this.quickZoomGesturesEnabled = bundle.getBoolean(MapboxConstants.STATE_QUICK_ZOOM_ENABLED);
        this.zoomRate = bundle.getFloat(MapboxConstants.STATE_ZOOM_RATE, 1.0f);
    }

    private void restoreLogo(Bundle bundle) {
        setLogoEnabled(bundle.getBoolean(MapboxConstants.STATE_LOGO_ENABLED));
        setLogoGravity(bundle.getInt(MapboxConstants.STATE_LOGO_GRAVITY));
        setLogoMargins(bundle.getInt(MapboxConstants.STATE_LOGO_MARGIN_LEFT), bundle.getInt(MapboxConstants.STATE_LOGO_MARGIN_TOP), bundle.getInt(MapboxConstants.STATE_LOGO_MARGIN_RIGHT), bundle.getInt(MapboxConstants.STATE_LOGO_MARGIN_BOTTOM));
    }

    private void saveAttribution(Bundle bundle) {
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_GRAVITY, getAttributionGravity());
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_LEFT, JQx.A0M(this.attributionsMargins));
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_TOP, this.attributionsMargins[1]);
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_RIGHT, this.attributionsMargins[2]);
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_BOTTOM, this.attributionsMargins[3]);
        bundle.putBoolean(MapboxConstants.STATE_ATTRIBUTION_ENABLED, isAttributionEnabled());
    }

    private void saveCompass(Bundle bundle) {
        bundle.putBoolean(MapboxConstants.STATE_COMPASS_ENABLED, this.compassView.isEnabled());
        bundle.putInt(MapboxConstants.STATE_COMPASS_GRAVITY, getCompassGravity());
        bundle.putInt(MapboxConstants.STATE_COMPASS_MARGIN_LEFT, JQx.A0M(this.compassMargins));
        bundle.putInt(MapboxConstants.STATE_COMPASS_MARGIN_TOP, this.compassMargins[1]);
        bundle.putInt(MapboxConstants.STATE_COMPASS_MARGIN_BOTTOM, this.compassMargins[3]);
        bundle.putInt(MapboxConstants.STATE_COMPASS_MARGIN_RIGHT, this.compassMargins[2]);
        bundle.putBoolean(MapboxConstants.STATE_COMPASS_FADE_WHEN_FACING_NORTH, this.compassView.fadeCompassViewFacingNorth);
        bundle.putByteArray(MapboxConstants.STATE_COMPASS_IMAGE_BITMAP, BitmapUtils.getByteArrayFromDrawable(this.compassView.getDrawable()));
    }

    private void saveDeselectMarkersOnTap(Bundle bundle) {
        bundle.putBoolean(MapboxConstants.STATE_DESELECT_MARKER_ON_TAP, this.deselectMarkersOnTap);
    }

    private void saveFocalPoint(Bundle bundle) {
        bundle.putParcelable(MapboxConstants.STATE_USER_FOCAL_POINT, this.userProvidedFocalPoint);
    }

    private void saveGestures(Bundle bundle) {
        bundle.putBoolean(MapboxConstants.STATE_ZOOM_ENABLED, this.zoomGesturesEnabled);
        bundle.putBoolean(MapboxConstants.STATE_SCROLL_ENABLED, this.scrollGesturesEnabled);
        bundle.putBoolean(MapboxConstants.STATE_ROTATE_ENABLED, this.rotateGesturesEnabled);
        bundle.putBoolean(MapboxConstants.STATE_TILT_ENABLED, this.tiltGesturesEnabled);
        bundle.putBoolean(MapboxConstants.STATE_DOUBLE_TAP_ENABLED, this.doubleTapGesturesEnabled);
        bundle.putBoolean(MapboxConstants.STATE_SCALE_ANIMATION_ENABLED, this.scaleVelocityAnimationEnabled);
        bundle.putBoolean(MapboxConstants.STATE_ROTATE_ANIMATION_ENABLED, this.rotateVelocityAnimationEnabled);
        bundle.putBoolean(MapboxConstants.STATE_FLING_ANIMATION_ENABLED, this.flingVelocityAnimationEnabled);
        bundle.putBoolean(MapboxConstants.STATE_INCREASE_ROTATE_THRESHOLD, this.increaseRotateThresholdWhenScaling);
        bundle.putBoolean(MapboxConstants.STATE_INCREASE_SCALE_THRESHOLD, this.increaseScaleThresholdWhenRotating);
        bundle.putBoolean(MapboxConstants.STATE_QUICK_ZOOM_ENABLED, this.quickZoomGesturesEnabled);
        bundle.putFloat(MapboxConstants.STATE_ZOOM_RATE, this.zoomRate);
    }

    private void saveLogo(Bundle bundle) {
        bundle.putInt(MapboxConstants.STATE_LOGO_GRAVITY, getLogoGravity());
        bundle.putInt(MapboxConstants.STATE_LOGO_MARGIN_LEFT, JQx.A0M(this.logoMargins));
        bundle.putInt(MapboxConstants.STATE_LOGO_MARGIN_TOP, this.logoMargins[1]);
        bundle.putInt(MapboxConstants.STATE_LOGO_MARGIN_RIGHT, this.logoMargins[2]);
        bundle.putInt(MapboxConstants.STATE_LOGO_MARGIN_BOTTOM, this.logoMargins[3]);
        bundle.putBoolean(MapboxConstants.STATE_LOGO_ENABLED, isLogoEnabled());
    }

    private void setAttributionMargins(Context context, int[] iArr) {
        if (iArr != null) {
            setAttributionMargins(JQx.A0M(iArr), iArr[1], iArr[2], iArr[3]);
            return;
        }
        Resources resources = context.getResources();
        int dimension = (int) resources.getDimension(R.dimen.mapbox_four_dp);
        setAttributionMargins((int) resources.getDimension(R.dimen.mapbox_ninety_two_dp), dimension, dimension, dimension);
    }

    private void setLogoMargins(Resources resources, int[] iArr) {
        if (iArr != null) {
            setLogoMargins(JQx.A0M(iArr), iArr[1], iArr[2], iArr[3]);
        } else {
            int dimension = (int) resources.getDimension(R.dimen.mapbox_four_dp);
            setLogoMargins(dimension, dimension, dimension, dimension);
        }
    }

    private void setWidgetGravity(View view, int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    private void setWidgetMargins(View view, int[] iArr, int i, int i2, int i3, int i4) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(view);
        A0I.setMargins(i, i2, i3, i4);
        A0I.setMarginStart(i);
        A0I.setMarginEnd(i3);
        view.setLayoutParams(A0I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r301.quickZoomGesturesEnabled == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean areAllGesturesEnabled() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.rotateGesturesEnabled
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r301
            boolean r0 = r0.tiltGesturesEnabled
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r301
            boolean r0 = r0.zoomGesturesEnabled
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r301
            boolean r0 = r0.scrollGesturesEnabled
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r301
            boolean r0 = r0.doubleTapGesturesEnabled
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r301
            boolean r0 = r0.quickZoomGesturesEnabled
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L3a
        L38:
            r0 = 0
            r302 = r0
        L3a:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.UiSettings.areAllGesturesEnabled():boolean");
    }

    public AttributionDialogManager getAttributionDialogManager() {
        return this.attributionDialogManager;
    }

    public int getAttributionGravity() {
        return ((FrameLayout.LayoutParams) this.attributionsView.getLayoutParams()).gravity;
    }

    public int getAttributionMarginBottom() {
        return this.attributionsMargins[3];
    }

    public int getAttributionMarginLeft() {
        return JQx.A0M(this.attributionsMargins);
    }

    public int getAttributionMarginRight() {
        return this.attributionsMargins[2];
    }

    public int getAttributionMarginTop() {
        return this.attributionsMargins[1];
    }

    public int getCompassGravity() {
        return ((FrameLayout.LayoutParams) this.compassView.getLayoutParams()).gravity;
    }

    public Drawable getCompassImage() {
        return this.compassView.getDrawable();
    }

    public int getCompassMarginBottom() {
        return this.compassMargins[3];
    }

    public int getCompassMarginLeft() {
        return JQx.A0M(this.compassMargins);
    }

    public int getCompassMarginRight() {
        return this.compassMargins[2];
    }

    public int getCompassMarginTop() {
        return this.compassMargins[1];
    }

    public PointF getFocalPoint() {
        return this.userProvidedFocalPoint;
    }

    public float getHeight() {
        return DKC.A03(this.projection.mapView);
    }

    public int getLogoGravity() {
        return ((FrameLayout.LayoutParams) this.logoView.getLayoutParams()).gravity;
    }

    public int getLogoMarginBottom() {
        return this.logoMargins[3];
    }

    public int getLogoMarginLeft() {
        return JQx.A0M(this.logoMargins);
    }

    public int getLogoMarginRight() {
        return this.logoMargins[2];
    }

    public int getLogoMarginTop() {
        return this.logoMargins[1];
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public float getWidth() {
        return DKC.A02(this.projection.mapView);
    }

    public float getZoomRate() {
        return this.zoomRate;
    }

    public void initialise(Context context, MapboxMapOptions mapboxMapOptions) {
        Resources resources = context.getResources();
        initialiseGestures(mapboxMapOptions);
        initialiseCompass(mapboxMapOptions, resources);
        initialiseLogo(mapboxMapOptions, resources);
        initialiseAttribution(context, mapboxMapOptions);
    }

    public void invalidate() {
        int[] iArr = this.logoMargins;
        setLogoMargins(JQx.A0M(iArr), iArr[1], iArr[2], iArr[3]);
        int[] iArr2 = this.compassMargins;
        setCompassMargins(JQx.A0M(iArr2), iArr2[1], iArr2[2], iArr2[3]);
        int[] iArr3 = this.attributionsMargins;
        setAttributionMargins(JQx.A0M(iArr3), iArr3[1], iArr3[2], iArr3[3]);
    }

    public boolean isAttributionEnabled() {
        return AnonymousClass001.A1O(this.attributionsView.getVisibility());
    }

    public boolean isCompassEnabled() {
        return this.compassView.isEnabled();
    }

    public boolean isCompassFadeWhenFacingNorth() {
        return this.compassView.fadeCompassViewFacingNorth;
    }

    public boolean isDeselectMarkersOnTap() {
        return this.deselectMarkersOnTap;
    }

    public boolean isDoubleTapGesturesEnabled() {
        return this.doubleTapGesturesEnabled;
    }

    public boolean isFlingVelocityAnimationEnabled() {
        return this.flingVelocityAnimationEnabled;
    }

    public boolean isIncreaseRotateThresholdWhenScaling() {
        return this.increaseRotateThresholdWhenScaling;
    }

    public boolean isIncreaseScaleThresholdWhenRotating() {
        return this.increaseScaleThresholdWhenRotating;
    }

    public boolean isLogoEnabled() {
        return AnonymousClass001.A1O(this.logoView.getVisibility());
    }

    public boolean isQuickZoomGesturesEnabled() {
        return this.quickZoomGesturesEnabled;
    }

    public boolean isRotateGesturesEnabled() {
        return this.rotateGesturesEnabled;
    }

    public boolean isRotateVelocityAnimationEnabled() {
        return this.rotateVelocityAnimationEnabled;
    }

    public boolean isScaleVelocityAnimationEnabled() {
        return this.scaleVelocityAnimationEnabled;
    }

    public boolean isScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    public boolean isTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    public boolean isZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        restoreGestures(bundle);
        restoreCompass(bundle);
        restoreLogo(bundle);
        restoreAttribution(bundle);
        restoreDeselectMarkersOnTap(bundle);
        restoreFocalPoint(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        saveGestures(bundle);
        saveCompass(bundle);
        saveLogo(bundle);
        saveAttribution(bundle);
        saveDeselectMarkersOnTap(bundle);
        saveFocalPoint(bundle);
    }

    public void setAllGesturesEnabled(boolean z) {
        this.scrollGesturesEnabled = z;
        this.rotateGesturesEnabled = z;
        this.tiltGesturesEnabled = z;
        this.zoomGesturesEnabled = z;
        this.doubleTapGesturesEnabled = z;
        this.quickZoomGesturesEnabled = z;
    }

    public void setAllVelocityAnimationsEnabled(boolean z) {
        this.scaleVelocityAnimationEnabled = z;
        this.rotateVelocityAnimationEnabled = z;
        this.flingVelocityAnimationEnabled = z;
    }

    public void setAttributionDialogManager(AttributionDialogManager attributionDialogManager) {
        this.attributionDialogManager = attributionDialogManager;
    }

    public void setAttributionEnabled(boolean z) {
        this.attributionsView.setVisibility(DKG.A00(z ? 1 : 0));
    }

    public void setAttributionGravity(int i) {
        setWidgetGravity(this.attributionsView, i);
    }

    public void setAttributionMargins(int i, int i2, int i3, int i4) {
        setWidgetMargins(this.attributionsView, this.attributionsMargins, i, i2, i3, i4);
    }

    public void setAttributionTintColor(int i) {
        if (Color.alpha(i) != 0) {
            ColorUtils.setTintList(this.attributionsView, i);
        } else {
            ImageView imageView = this.attributionsView;
            ColorUtils.setTintList(imageView, imageView.getContext().getColor(R.color.mapbox_blue));
        }
    }

    public void setCompassEnabled(boolean z) {
        this.compassView.setEnabled(z);
    }

    public void setCompassFadeFacingNorth(boolean z) {
        this.compassView.fadeCompassViewFacingNorth = z;
    }

    public void setCompassGravity(int i) {
        setWidgetGravity(this.compassView, i);
    }

    public void setCompassImage(Drawable drawable) {
        this.compassView.setImageDrawable(drawable);
    }

    public void setCompassMargins(int i, int i2, int i3, int i4) {
        setWidgetMargins(this.compassView, this.compassMargins, i, i2, i3, i4);
    }

    public void setDeselectMarkersOnTap(boolean z) {
        this.deselectMarkersOnTap = z;
    }

    public void setDoubleTapGesturesEnabled(boolean z) {
        this.doubleTapGesturesEnabled = z;
    }

    public void setFlingVelocityAnimationEnabled(boolean z) {
        this.flingVelocityAnimationEnabled = z;
    }

    public void setFocalPoint(PointF pointF) {
        this.userProvidedFocalPoint = pointF;
        this.focalPointChangeListener.onFocalPointChanged(pointF);
    }

    public void setIncreaseRotateThresholdWhenScaling(boolean z) {
        this.increaseRotateThresholdWhenScaling = z;
    }

    public void setIncreaseScaleThresholdWhenRotating(boolean z) {
        this.increaseScaleThresholdWhenRotating = z;
    }

    public void setLogoEnabled(boolean z) {
        this.logoView.setVisibility(DKG.A00(z ? 1 : 0));
    }

    public void setLogoGravity(int i) {
        setWidgetGravity(this.logoView, i);
    }

    public void setLogoMargins(int i, int i2, int i3, int i4) {
        setWidgetMargins(this.logoView, this.logoMargins, i, i2, i3, i4);
    }

    public void setQuickZoomGesturesEnabled(boolean z) {
        this.quickZoomGesturesEnabled = z;
    }

    public void setRotateGesturesEnabled(boolean z) {
        this.rotateGesturesEnabled = z;
    }

    public void setRotateVelocityAnimationEnabled(boolean z) {
        this.rotateVelocityAnimationEnabled = z;
    }

    public void setScaleVelocityAnimationEnabled(boolean z) {
        this.scaleVelocityAnimationEnabled = z;
    }

    public void setScrollGesturesEnabled(boolean z) {
        this.scrollGesturesEnabled = z;
    }

    public void setTiltGesturesEnabled(boolean z) {
        this.tiltGesturesEnabled = z;
    }

    public void setZoomGesturesEnabled(boolean z) {
        this.zoomGesturesEnabled = z;
    }

    public void setZoomRate(float f) {
        this.zoomRate = f;
    }

    public void update(CameraPosition cameraPosition) {
        if (this.compassView.isEnabled()) {
            this.compassView.update(-cameraPosition.bearing);
        }
    }
}
