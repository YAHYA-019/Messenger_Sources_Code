package com.mapbox.mapboxsdk.location;

import X.AnonymousClass001;
import X.Kzo;
import X.MJh;
import android.content.Context;
import com.mapbox.mapboxsdk.maps.Style;

/* loaded from: LocationComponentActivationOptions.class */
public class LocationComponentActivationOptions {
    public final Context context;
    public final LocationComponentOptions locationComponentOptions;
    public final MJh locationEngine;
    public final Kzo locationEngineRequest;
    public final String locationSubscriptionId;
    public final Style style;
    public final int styleRes;
    public final boolean useDefaultLocationEngine;

    /* loaded from: LocationComponentActivationOptions$Builder.class */
    public final class Builder {
        public final Context context;
        public LocationComponentOptions locationComponentOptions;
        public MJh locationEngine;
        public Kzo locationEngineRequest;
        public String locationSubscriptionId;
        public final Style style;
        public int styleRes;
        public boolean useDefaultLocationEngine = true;

        public Builder(Context context, Style style) {
            this.context = context;
            this.style = style;
        }

        public LocationComponentActivationOptions build() {
            int i = this.styleRes;
            if (i != 0 && this.locationComponentOptions != null) {
                throw AnonymousClass001.A0L("You've provided both a style resource and a LocationComponentOptions object to the LocationComponentActivationOptions builder. You can't use both and you must choose one of the two to style the LocationComponent.");
            }
            Context context = this.context;
            if (context == null) {
                throw AnonymousClass001.A0Q("Context in LocationComponentActivationOptions is null.");
            }
            Style style = this.style;
            if (style == null) {
                throw AnonymousClass001.A0Q("Style in LocationComponentActivationOptions is null. Make sure the Style object isn't null. Wait for the map to fully load before passing the Style object to LocationComponentActivationOptions.");
            }
            if (style.fullyLoaded) {
                return new LocationComponentActivationOptions(context, style, this.locationEngine, this.locationEngineRequest, this.locationComponentOptions, this.locationSubscriptionId, i, this.useDefaultLocationEngine);
            }
            throw AnonymousClass001.A0L("Style in LocationComponentActivationOptions isn't fully loaded. Wait for the map to fully load before passing the Style object to LocationComponentActivationOptions.");
        }

        public Builder locationComponentOptions(LocationComponentOptions locationComponentOptions) {
            this.locationComponentOptions = locationComponentOptions;
            return this;
        }

        public Builder locationEngine(MJh mJh) {
            this.locationEngine = mJh;
            return this;
        }

        public Builder locationEngineRequest(Kzo kzo) {
            this.locationEngineRequest = kzo;
            return this;
        }

        public Builder locationSubscriptionId(String str) {
            this.locationSubscriptionId = str;
            return this;
        }

        public Builder styleRes(int i) {
            this.styleRes = i;
            return this;
        }

        public Builder useDefaultLocationEngine(boolean z) {
            this.useDefaultLocationEngine = z;
            return this;
        }
    }

    public LocationComponentActivationOptions(Context context, Style style, MJh mJh, Kzo kzo, LocationComponentOptions locationComponentOptions, String str, int i, boolean z) {
        this.context = context;
        this.style = style;
        this.locationEngine = mJh;
        this.locationEngineRequest = kzo;
        this.locationComponentOptions = locationComponentOptions;
        this.styleRes = i;
        this.useDefaultLocationEngine = z;
        this.locationSubscriptionId = str;
    }

    public static Builder builder(Context context, Style style) {
        return new Builder(context, style);
    }

    public Context context() {
        return this.context;
    }

    public LocationComponentOptions locationComponentOptions() {
        return this.locationComponentOptions;
    }

    public MJh locationEngine() {
        return this.locationEngine;
    }

    public Kzo locationEngineRequest() {
        return this.locationEngineRequest;
    }

    public String locationSubscriptionId() {
        return this.locationSubscriptionId;
    }

    public Style style() {
        return this.style;
    }

    public int styleRes() {
        return this.styleRes;
    }

    public boolean useDefaultLocationEngine() {
        return this.useDefaultLocationEngine;
    }
}
