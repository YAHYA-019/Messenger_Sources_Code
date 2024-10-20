package com.mapbox.mapboxsdk.utils;

import X.1BK;
import android.content.Context;
import android.os.Bundle;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.MapboxMapOptions;

/* loaded from: MapFragmentUtils.class */
public class MapFragmentUtils {
    public static Bundle createFragmentArgs(MapboxMapOptions mapboxMapOptions) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable(MapboxConstants.FRAG_ARG_MAPBOXMAPOPTIONS, mapboxMapOptions);
        return A05;
    }

    public static MapboxMapOptions resolveArgs(Context context, Bundle bundle) {
        return (bundle == null || !bundle.containsKey(MapboxConstants.FRAG_ARG_MAPBOXMAPOPTIONS)) ? MapboxMapOptions.createFromAttributes(context, null) : (MapboxMapOptions) bundle.getParcelable(MapboxConstants.FRAG_ARG_MAPBOXMAPOPTIONS);
    }
}
