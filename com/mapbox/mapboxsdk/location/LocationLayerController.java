package com.mapbox.mapboxsdk.location;

import X.1BK;
import X.7zN;
import X.AnonymousClass001;
import X.JQz;
import X.JR0;
import android.graphics.Bitmap;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Point;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.MapboxAnimator;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Style;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.mapbox.mapboxsdk.style.layers.SymbolLayer;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;
import com.mapbox.mapboxsdk.utils.ColorUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: LocationLayerController.class */
public final class LocationLayerController {
    public final LayerBitmapProvider bitmapProvider;
    public final OnRenderModeChangedListener internalRenderModeChangedListener;
    public final LayerSourceProvider layerSourceProvider;
    public Feature locationFeature;
    public GeoJsonSource locationSource;
    public final MapboxMap mapboxMap;
    public LocationComponentOptions options;
    public LocationComponentPositionManager positionManager;
    public int renderMode;
    public Style style;
    public final Set layerSet = AnonymousClass001.A0v();
    public boolean isHidden = true;
    public final MapboxAnimator.AnimationsValueChangeListener latLngValueListener = new MapboxAnimator.AnimationsValueChangeListener() { // from class: com.mapbox.mapboxsdk.location.LocationLayerController.1
        @Override // com.mapbox.mapboxsdk.location.MapboxAnimator.AnimationsValueChangeListener
        public void onNewAnimationValue(LatLng latLng) {
            LocationLayerController.this.setLocationPoint(Point.fromLngLat(latLng.longitude, latLng.latitude));
        }
    };
    public final MapboxAnimator.AnimationsValueChangeListener gpsBearingValueListener = new MapboxAnimator.AnimationsValueChangeListener() { // from class: com.mapbox.mapboxsdk.location.LocationLayerController.2
        @Override // com.mapbox.mapboxsdk.location.MapboxAnimator.AnimationsValueChangeListener
        public void onNewAnimationValue(Float f) {
            LocationLayerController.this.setBearingProperty(LocationComponentConstants.PROPERTY_GPS_BEARING, f.floatValue());
        }
    };
    public final MapboxAnimator.AnimationsValueChangeListener compassBearingValueListener = new MapboxAnimator.AnimationsValueChangeListener() { // from class: com.mapbox.mapboxsdk.location.LocationLayerController.3
        @Override // com.mapbox.mapboxsdk.location.MapboxAnimator.AnimationsValueChangeListener
        public void onNewAnimationValue(Float f) {
            LocationLayerController.this.setBearingProperty(LocationComponentConstants.PROPERTY_COMPASS_BEARING, f.floatValue());
        }
    };
    public final MapboxAnimator.AnimationsValueChangeListener accuracyValueListener = new MapboxAnimator.AnimationsValueChangeListener() { // from class: com.mapbox.mapboxsdk.location.LocationLayerController.4
        @Override // com.mapbox.mapboxsdk.location.MapboxAnimator.AnimationsValueChangeListener
        public void onNewAnimationValue(Float f) {
            LocationLayerController.this.updateAccuracyRadius(f.floatValue());
        }
    };

    public LocationLayerController(MapboxMap mapboxMap, Style style, LayerSourceProvider layerSourceProvider, LayerFeatureProvider layerFeatureProvider, LayerBitmapProvider layerBitmapProvider, LocationComponentOptions locationComponentOptions, OnRenderModeChangedListener onRenderModeChangedListener) {
        this.mapboxMap = mapboxMap;
        this.style = style;
        this.layerSourceProvider = layerSourceProvider;
        this.bitmapProvider = layerBitmapProvider;
        this.locationFeature = layerFeatureProvider.generateLocationFeature(this.locationFeature, locationComponentOptions);
        this.internalRenderModeChangedListener = onRenderModeChangedListener;
        initializeComponents(style, locationComponentOptions);
    }

    private void addAccuracyLayer() {
        addLayerToMap(this.layerSourceProvider.generateAccuracyLayer(), LocationComponentConstants.BACKGROUND_LAYER);
    }

    private void addLayerToMap(Layer layer, String str) {
        this.style.addLayerBelow(layer, str);
        Set set = this.layerSet;
        JQz.A0y();
        set.add(layer.nativeGetId());
    }

    private void addLayers() {
        Layer generateLayer = this.layerSourceProvider.generateLayer(LocationComponentConstants.BEARING_LAYER);
        this.positionManager.addLayerToMap(generateLayer);
        Set set = this.layerSet;
        JQz.A0y();
        set.add(generateLayer.nativeGetId());
        addSymbolLayer(LocationComponentConstants.FOREGROUND_LAYER, LocationComponentConstants.BEARING_LAYER);
        addSymbolLayer(LocationComponentConstants.BACKGROUND_LAYER, LocationComponentConstants.FOREGROUND_LAYER);
        addSymbolLayer(LocationComponentConstants.SHADOW_LAYER, LocationComponentConstants.BACKGROUND_LAYER);
        addAccuracyLayer();
    }

    private void addLocationSource() {
        GeoJsonSource generateSource = this.layerSourceProvider.generateSource(Feature.fromJson(this.locationFeature.toJson()));
        this.locationSource = generateSource;
        this.style.addSource(generateSource);
    }

    private void addSymbolLayer(String str, String str2) {
        addLayerToMap(this.layerSourceProvider.generateLayer(str), str2);
    }

    private String buildIconString(String str, String str2) {
        return str != null ? str : str2;
    }

    private void determineIconsSource(LocationComponentOptions locationComponentOptions) {
        String str = this.renderMode == 8 ? locationComponentOptions.gpsName : locationComponentOptions.foregroundName;
        if (str == null) {
            str = LocationComponentConstants.FOREGROUND_ICON;
        }
        String str2 = locationComponentOptions.foregroundStaleName;
        if (str2 == null) {
            str2 = LocationComponentConstants.FOREGROUND_STALE_ICON;
        }
        String str3 = locationComponentOptions.backgroundName;
        if (str3 == null) {
            str3 = LocationComponentConstants.BACKGROUND_ICON;
        }
        String str4 = locationComponentOptions.backgroundStaleName;
        if (str4 == null) {
            str4 = LocationComponentConstants.BACKGROUND_STALE_ICON;
        }
        String str5 = locationComponentOptions.bearingName;
        if (str5 == null) {
            str5 = LocationComponentConstants.BEARING_ICON;
        }
        this.locationFeature.addStringProperty(LocationComponentConstants.PROPERTY_FOREGROUND_ICON, str);
        this.locationFeature.addStringProperty(LocationComponentConstants.PROPERTY_BACKGROUND_ICON, str3);
        this.locationFeature.addStringProperty(LocationComponentConstants.PROPERTY_FOREGROUND_STALE_ICON, str2);
        this.locationFeature.addStringProperty(LocationComponentConstants.PROPERTY_BACKGROUND_STALE_ICON, str4);
        this.locationFeature.addStringProperty(LocationComponentConstants.PROPERTY_BEARING_ICON, str5);
        refreshSource();
    }

    private void refreshSource() {
        if (this.style.getSourceAs(LocationComponentConstants.LOCATION_SOURCE) != null) {
            this.locationSource.setGeoJson(this.locationFeature.toJson());
        }
    }

    private void removeLayers() {
        Iterator it = this.layerSet.iterator();
        while (it.hasNext()) {
            this.style.removeLayer(AnonymousClass001.A0i(it));
        }
        this.layerSet.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBearingProperty(String str, float f) {
        this.locationFeature.addNumberProperty(str, Float.valueOf(f));
        refreshSource();
    }

    private void setLayerVisibility(String str, boolean z) {
        Layer layer = this.style.getLayer(str);
        if (layer != null) {
            Object obj = Property.VISIBLE;
            if (((String) layer.getVisibility().value).equals(z ? obj : "none")) {
                return;
            }
            if (!z) {
                obj = "none";
            }
            layer.setProperties(JQz.A0c(obj, "visibility"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationPoint(Point point) {
        JsonObject properties = this.locationFeature.properties();
        if (properties != null) {
            this.locationFeature = Feature.fromGeometry(point, properties);
            refreshSource();
        }
    }

    private void styleAccuracy(float f, int i) {
        this.locationFeature.addNumberProperty(LocationComponentConstants.PROPERTY_ACCURACY_ALPHA, Float.valueOf(f));
        this.locationFeature.addStringProperty(LocationComponentConstants.PROPERTY_ACCURACY_COLOR, ColorUtils.colorToRgbaString(i));
        refreshSource();
    }

    private void styleBackground(LocationComponentOptions locationComponentOptions) {
        Bitmap generateBitmap = this.bitmapProvider.generateBitmap(locationComponentOptions.backgroundDrawable, locationComponentOptions.backgroundTintColor);
        Bitmap generateBitmap2 = this.bitmapProvider.generateBitmap(locationComponentOptions.backgroundDrawableStale, locationComponentOptions.backgroundStaleTintColor);
        this.style.addImage(LocationComponentConstants.BACKGROUND_ICON, generateBitmap);
        this.style.addImage(LocationComponentConstants.BACKGROUND_STALE_ICON, generateBitmap2);
    }

    private void styleBearing(LocationComponentOptions locationComponentOptions) {
        this.style.addImage(LocationComponentConstants.BEARING_ICON, this.bitmapProvider.generateBitmap(locationComponentOptions.bearingDrawable, locationComponentOptions.bearingTintColor));
    }

    private void styleForeground(LocationComponentOptions locationComponentOptions) {
        Bitmap generateBitmap = this.bitmapProvider.generateBitmap(locationComponentOptions.foregroundDrawable, locationComponentOptions.foregroundTintColor);
        Bitmap generateBitmap2 = this.bitmapProvider.generateBitmap(locationComponentOptions.foregroundDrawableStale, locationComponentOptions.foregroundStaleTintColor);
        if (this.renderMode == 8) {
            generateBitmap = this.bitmapProvider.generateBitmap(locationComponentOptions.gpsDrawable, locationComponentOptions.foregroundTintColor);
            generateBitmap2 = this.bitmapProvider.generateBitmap(locationComponentOptions.gpsDrawable, locationComponentOptions.foregroundStaleTintColor);
        }
        this.style.addImage(LocationComponentConstants.FOREGROUND_ICON, generateBitmap);
        this.style.addImage(LocationComponentConstants.FOREGROUND_STALE_ICON, generateBitmap2);
    }

    private void styleScaling(LocationComponentOptions locationComponentOptions) {
        Iterator it = this.layerSet.iterator();
        while (it.hasNext()) {
            Layer layer = this.style.getLayer(AnonymousClass001.A0i(it));
            if (layer instanceof SymbolLayer) {
                layer.setProperties(JQz.A0c(Expression.interpolate(Expression.linear(), Expression.zoom(), Expression.Stop.toExpressionArray(new Expression.Stop(Double.valueOf(this.mapboxMap.getMinZoomLevel()), Float.valueOf(locationComponentOptions.minZoomIconScale)), new Expression.Stop(Double.valueOf(this.mapboxMap.getMaxZoomLevel()), Float.valueOf(locationComponentOptions.maxZoomIconScale)))), "icon-size"));
            }
        }
    }

    private void styleShadow(LocationComponentOptions locationComponentOptions) {
        this.style.addImage(LocationComponentConstants.SHADOW_ICON, this.bitmapProvider.generateShadowBitmap(locationComponentOptions));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAccuracyRadius(float f) {
        this.locationFeature.addNumberProperty(LocationComponentConstants.PROPERTY_ACCURACY_RADIUS, Float.valueOf(f));
        refreshSource();
    }

    public void applyStyle(LocationComponentOptions locationComponentOptions) {
        if (this.positionManager.update(locationComponentOptions.layerAbove, locationComponentOptions.layerBelow)) {
            removeLayers();
            addLayers();
            if (this.isHidden) {
                Iterator it = this.layerSet.iterator();
                while (it.hasNext()) {
                    setLayerVisibility(AnonymousClass001.A0i(it), false);
                }
            }
            setRenderMode(this.renderMode);
        }
        this.options = locationComponentOptions;
        if (locationComponentOptions.elevation > 0.0f) {
            styleShadow(locationComponentOptions);
        }
        styleForeground(locationComponentOptions);
        styleBackground(locationComponentOptions);
        styleBearing(locationComponentOptions);
        styleAccuracy(locationComponentOptions.accuracyAlpha, locationComponentOptions.accuracyColor);
        styleScaling(locationComponentOptions);
        determineIconsSource(locationComponentOptions);
    }

    public Set getAnimationListeners() {
        int i;
        MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener;
        int i2;
        HashSet A0v = AnonymousClass001.A0v();
        JR0.A1A(this.latLngValueListener, A0v, 0);
        int i3 = this.renderMode;
        if (i3 != 8) {
            if (i3 == 4) {
                i = 3;
                animationsValueChangeListener = this.compassBearingValueListener;
            }
            i2 = this.renderMode;
            if (i2 != 4 || i2 == 18) {
                JR0.A1A(this.accuracyValueListener, A0v, 6);
            }
            return A0v;
        }
        i = 2;
        animationsValueChangeListener = this.gpsBearingValueListener;
        JR0.A1A(animationsValueChangeListener, A0v, i);
        i2 = this.renderMode;
        if (i2 != 4) {
        }
        JR0.A1A(this.accuracyValueListener, A0v, 6);
        return A0v;
    }

    public int getRenderMode() {
        return this.renderMode;
    }

    public void hide() {
        this.isHidden = true;
        Iterator it = this.layerSet.iterator();
        while (it.hasNext()) {
            setLayerVisibility(AnonymousClass001.A0i(it), false);
        }
    }

    public void initializeComponents(Style style, LocationComponentOptions locationComponentOptions) {
        this.style = style;
        this.positionManager = new LocationComponentPositionManager(style, locationComponentOptions.layerAbove, locationComponentOptions.layerBelow);
        addLocationSource();
        addLayers();
        applyStyle(locationComponentOptions);
        if (this.isHidden) {
            hide();
        } else {
            show();
        }
    }

    public boolean isConsumingCompass() {
        return AnonymousClass001.A1Q(this.renderMode, 4);
    }

    public boolean isHidden() {
        return this.isHidden;
    }

    public boolean onMapClick(LatLng latLng) {
        return 1BK.A1Y(this.mapboxMap.queryRenderedFeatures(this.mapboxMap.projection.nativeMapView.pixelForLatLng(latLng), LocationComponentConstants.BACKGROUND_LAYER, LocationComponentConstants.FOREGROUND_LAYER, LocationComponentConstants.BEARING_LAYER));
    }

    public void setLocationsStale(boolean z) {
        this.locationFeature.addBooleanProperty(LocationComponentConstants.PROPERTY_LOCATION_STALE, Boolean.valueOf(z));
        refreshSource();
        if (this.renderMode != 8) {
            setLayerVisibility(LocationComponentConstants.ACCURACY_LAYER, !z);
        }
    }

    public void setRenderMode(int i) {
        int i2 = this.renderMode;
        this.renderMode = i;
        if (!this.isHidden) {
            boolean booleanValue = this.locationFeature.getBooleanProperty(LocationComponentConstants.PROPERTY_LOCATION_STALE).booleanValue();
            if (i != 4) {
                if (i == 8) {
                    styleForeground(this.options);
                    setLayerVisibility(LocationComponentConstants.SHADOW_LAYER, false);
                    setLayerVisibility(LocationComponentConstants.FOREGROUND_LAYER, true);
                    setLayerVisibility(LocationComponentConstants.BACKGROUND_LAYER, true);
                    setLayerVisibility(LocationComponentConstants.ACCURACY_LAYER, false);
                } else if (i == 18) {
                    styleForeground(this.options);
                    setLayerVisibility(LocationComponentConstants.SHADOW_LAYER, true);
                    setLayerVisibility(LocationComponentConstants.FOREGROUND_LAYER, true);
                    setLayerVisibility(LocationComponentConstants.BACKGROUND_LAYER, true);
                    setLayerVisibility(LocationComponentConstants.ACCURACY_LAYER, !booleanValue);
                }
                setLayerVisibility(LocationComponentConstants.BEARING_LAYER, false);
            } else {
                styleForeground(this.options);
                setLayerVisibility(LocationComponentConstants.SHADOW_LAYER, true);
                setLayerVisibility(LocationComponentConstants.FOREGROUND_LAYER, true);
                setLayerVisibility(LocationComponentConstants.BACKGROUND_LAYER, true);
                setLayerVisibility(LocationComponentConstants.ACCURACY_LAYER, !booleanValue);
                setLayerVisibility(LocationComponentConstants.BEARING_LAYER, true);
            }
            determineIconsSource(this.options);
        }
        if (i2 != i) {
            this.internalRenderModeChangedListener.onRenderModeChanged(i);
        }
    }

    public void show() {
        this.isHidden = false;
        setRenderMode(this.renderMode);
    }

    public void updateForegroundBearing(float f) {
        if (this.renderMode != 8) {
            setBearingProperty(LocationComponentConstants.PROPERTY_GPS_BEARING, f);
        }
    }

    public void updateForegroundOffset(double d) {
        JsonArray jsonArray = new JsonArray();
        Float A0f = 7zN.A0f();
        jsonArray.add(A0f);
        jsonArray.add(Float.valueOf((float) ((-0.05d) * d)));
        this.locationFeature.addProperty(LocationComponentConstants.PROPERTY_FOREGROUND_ICON_OFFSET, jsonArray);
        JsonArray jsonArray2 = new JsonArray();
        jsonArray2.add(A0f);
        jsonArray2.add(Float.valueOf((float) (d * 0.05d)));
        this.locationFeature.addProperty(LocationComponentConstants.PROPERTY_SHADOW_ICON_OFFSET, jsonArray2);
        refreshSource();
    }
}
