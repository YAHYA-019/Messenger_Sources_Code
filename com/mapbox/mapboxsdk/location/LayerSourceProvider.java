package com.mapbox.mapboxsdk.location;

import X.4YU;
import X.7zN;
import X.AnonymousClass001;
import X.JQz;
import com.mapbox.geojson.Feature;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import com.mapbox.mapboxsdk.style.layers.CircleLayer;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.layers.LayoutPropertyValue;
import com.mapbox.mapboxsdk.style.layers.SymbolLayer;
import com.mapbox.mapboxsdk.style.sources.GeoJsonOptions;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.util.HashMap;

/* loaded from: LayerSourceProvider.class */
public class LayerSourceProvider {
    public static final String EMPTY_STRING = "";
    public static final int MAPBOX_MAP_MAX_ZOOM_LEVEL = 22;

    public Layer generateAccuracyLayer() {
        CircleLayer circleLayer = new CircleLayer(LocationComponentConstants.ACCURACY_LAYER, LocationComponentConstants.LOCATION_SOURCE);
        circleLayer.setProperties(JQz.A0d(Expression.interpolate(Expression.exponential(JQz.A0a(Float.valueOf(2.0f))), Expression.zoom(), Expression.Stop.toExpressionArray(new Expression.Stop(4YU.A0k(), 7zN.A0f()), new Expression.Stop(22, Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_ACCURACY_RADIUS))))), "circle-radius"), JQz.A0d(Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_ACCURACY_COLOR)), "circle-color"), JQz.A0d(Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_ACCURACY_ALPHA)), "circle-opacity"), JQz.A0d(Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_ACCURACY_COLOR)), "circle-stroke-color"), JQz.A0d("map", "circle-pitch-alignment"));
        return circleLayer;
    }

    public Layer generateLayer(String str) {
        SymbolLayer symbolLayer = new SymbolLayer(str, LocationComponentConstants.LOCATION_SOURCE);
        Boolean A0K = AnonymousClass001.A0K();
        LayoutPropertyValue A0c = JQz.A0c(A0K, "icon-allow-overlap");
        LayoutPropertyValue A0c2 = JQz.A0c(A0K, "icon-ignore-placement");
        LayoutPropertyValue A0c3 = JQz.A0c("map", "icon-rotation-alignment");
        Expression.ExpressionLiteral A0a = JQz.A0a(str);
        Float A0f = 7zN.A0f();
        symbolLayer.setProperties(A0c, A0c2, A0c3, JQz.A0c(Expression.match(A0a, JQz.A0a(A0f), new Expression.Stop(LocationComponentConstants.FOREGROUND_LAYER, Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_GPS_BEARING))), new Expression.Stop(LocationComponentConstants.BACKGROUND_LAYER, Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_GPS_BEARING))), new Expression.Stop(LocationComponentConstants.SHADOW_LAYER, Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_GPS_BEARING))), new Expression.Stop(LocationComponentConstants.BEARING_LAYER, Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_COMPASS_BEARING)))), "icon-rotate"), JQz.A0c(Expression.match(JQz.A0a(str), JQz.A0a(""), new Expression.Stop(LocationComponentConstants.FOREGROUND_LAYER, JQz.A0b("case", new Expression[]{Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_LOCATION_STALE)), Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_FOREGROUND_STALE_ICON)), Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_FOREGROUND_ICON))})), new Expression.Stop(LocationComponentConstants.BACKGROUND_LAYER, JQz.A0b("case", new Expression[]{Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_LOCATION_STALE)), Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_BACKGROUND_STALE_ICON)), Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_BACKGROUND_ICON))})), new Expression.Stop(LocationComponentConstants.SHADOW_LAYER, JQz.A0a(LocationComponentConstants.SHADOW_ICON)), new Expression.Stop(LocationComponentConstants.BEARING_LAYER, Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_BEARING_ICON)))), "icon-image"), JQz.A0c(Expression.match(JQz.A0a(str), Expression.literal((Object[]) new Float[]{A0f, A0f}), new Expression.Stop(JQz.A0a(LocationComponentConstants.FOREGROUND_LAYER), Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_FOREGROUND_ICON_OFFSET))), new Expression.Stop(JQz.A0a(LocationComponentConstants.SHADOW_LAYER), Expression.get(JQz.A0a(LocationComponentConstants.PROPERTY_SHADOW_ICON_OFFSET)))), "icon-offset"));
        return symbolLayer;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.mapbox.mapboxsdk.style.sources.GeoJsonOptions, java.util.HashMap] */
    public GeoJsonSource generateSource(Feature feature) {
        String str = Source.TAG;
        ?? hashMap = new HashMap();
        hashMap.withMaxZoom(16);
        return new GeoJsonSource(LocationComponentConstants.LOCATION_SOURCE, feature, (GeoJsonOptions) hashMap);
    }
}
