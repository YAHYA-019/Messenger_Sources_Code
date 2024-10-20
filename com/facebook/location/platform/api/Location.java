package com.facebook.location.platform.api;

import X.0Pz;
import X.0Q8;
import X.0fH;
import X.1BK;
import X.AnonymousClass001;
import X.DKC;
import X.KRM;
import X.KRN;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: Location.class */
public class Location extends AutoSafeParcelable {
    public static final String ACCURACY = "accuracy";
    public static final String ALTITUDE = "altitude";
    public static final String ALTITUDE_ACCURACY = "altitudeAccuracy";
    public static final String BEARING = "bearing";
    public static final String BEARING_ACCURACY = "bearingAccuracy";
    public static final Parcelable.Creator CREATOR;
    public static final String EXTRAS = "extras";
    public static final Set EXTRAS_SERIALIZATION_KEYS;
    public static final String IS_MOCK_LOCATION = "isMockLocation";
    public static final String LATITUDE = "latitude";
    public static final String LOCATION_ELAPSEDTIME = "locationElapsedTime";
    public static final String LOCATION_TIMESTAMP = "locationTimestamp";
    public static final String LONGITUDE = "longtiude";
    public static final String PROVIDER = "provider";
    public static final String SPEED = "speed";
    public static final String SPEED_ACCURACY = "speedAccuracy";
    public static final String TAG = "Location";
    public static final Map sProviderMap;
    public final Float mAccuracy;
    public final Double mAltitude;
    public final Float mAltitudeAccuracy;
    public final Float mBearing;
    public final Float mBearingAccuracy;
    public final Long mElapsedRealtimeNanos;
    public final Bundle mExtras;
    public final boolean mIsMockLocation;
    public final double mLatitude;
    public final double mLongitude;
    public final String mProvider;
    public final Float mSpeed;
    public final Float mSpeedAccuracy;
    public final Long mTimestamp;

    static {
        HashMap A0u = AnonymousClass001.A0u();
        sProviderMap = A0u;
        EXTRAS_SERIALIZATION_KEYS = AnonymousClass001.A0w(new String[]{"UNDERLYING_PROVIDER", "EXTRA_SUBSCRIPTION_UUID", "LOCATION_UUID", "IS_CACHED"});
        A0u.put("stub", "network");
        A0u.put("wps", "network");
        A0u.put("wps_zero_power", "network");
        CREATOR = AutoSafeParcelable.A01(Location.class);
    }

    public Location() {
        this.mProvider = null;
        this.mLatitude = 0.0d;
        this.mLongitude = 0.0d;
        this.mAltitude = null;
        this.mTimestamp = null;
        this.mElapsedRealtimeNanos = null;
        this.mAccuracy = null;
        this.mAltitudeAccuracy = null;
        this.mBearing = null;
        this.mBearingAccuracy = null;
        this.mSpeed = null;
        this.mSpeedAccuracy = null;
        this.mExtras = null;
        this.mIsMockLocation = false;
    }

    public Location(KRN krn) {
        throw AnonymousClass001.A0Q("mProvider");
    }

    public /* synthetic */ Location(KRN krn, KRM krm) {
        this(krn);
        throw 0Q8.createAndThrow();
    }

    public Location(Bundle bundle, Double d, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Long l, Long l2, String str, double d2, double d3, boolean z) {
        this.mProvider = str;
        this.mLatitude = d2;
        this.mLongitude = d3;
        this.mAltitude = d;
        this.mTimestamp = l2;
        this.mElapsedRealtimeNanos = l;
        this.mAccuracy = f;
        this.mAltitudeAccuracy = f2;
        this.mBearing = f3;
        this.mBearingAccuracy = f4;
        this.mSpeed = f5;
        this.mSpeedAccuracy = f6;
        this.mExtras = bundle;
        this.mIsMockLocation = z;
    }

    public static Location fromJSON(String str) {
        try {
            return fromJSON(DKC.A1F(str));
        } catch (JSONException e) {
            0fH.A0p(TAG, "unable to parse cached location", e);
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0112. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.location.platform.api.Location fromJSON(org.json.JSONObject r301) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.platform.api.Location.fromJSON(org.json.JSONObject):com.facebook.location.platform.api.Location");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.location.platform.api.Location fromLocation(android.content.Context r301, android.location.Location r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.platform.api.Location.fromLocation(android.content.Context, android.location.Location, java.lang.String):com.facebook.location.platform.api.Location");
    }

    private boolean hasAccuracy() {
        return AnonymousClass001.A1T(this.mAccuracy);
    }

    private String makeString(String str, Number number) {
        return number == null ? "" : 0Pz.A0v(", ", str, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, number.toString());
    }

    public Float getAccuracy() {
        return this.mAccuracy;
    }

    public Double getAltitude() {
        return this.mAltitude;
    }

    public Float getAltitudeAccuracy() {
        return this.mAltitudeAccuracy;
    }

    public Float getBearing() {
        return this.mBearing;
    }

    public Float getBearingAccuracy() {
        return this.mBearingAccuracy;
    }

    public float getDistanceMeters(Location location) {
        float[] fArr = new float[1];
        android.location.Location.distanceBetween(this.mLatitude, this.mLongitude, location.mLatitude, location.mLongitude, fArr);
        return fArr[0];
    }

    public Long getElapsedRealtimeNanos() {
        return this.mElapsedRealtimeNanos;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public Float getSpeed() {
        return this.mSpeed;
    }

    public Float getSpeedAccuracy() {
        return this.mSpeedAccuracy;
    }

    public Long getTimestamp() {
        return this.mTimestamp;
    }

    public String getUnderlyingProvider() {
        String string;
        Bundle bundle = this.mExtras;
        return (bundle == null || (string = bundle.getString("UNDERLYING_PROVIDER")) == null) ? this.mProvider : string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r0.longValue() == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isComplete() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.mProvider
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4e
            r0 = r301
            java.lang.Float r0 = r0.mAccuracy
            r302 = r0
            r0 = r302
            boolean r0 = X.AnonymousClass001.A1T(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4e
            r0 = r301
            java.lang.Long r0 = r0.mTimestamp
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4e
            r0 = r302
            long r0 = r0.longValue()
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4e
            r0 = r301
            java.lang.Long r0 = r0.mElapsedRealtimeNanos
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4e
            r0 = r302
            long r0 = r0.longValue()
            r308 = r0
            r0 = r308
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r310 = r0
            r0 = 1
            r303 = r0
            r0 = r310
            if (r0 != 0) goto L52
        L4e:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L52:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.platform.api.Location.isComplete():boolean");
    }

    public boolean isMockLocation() {
        return this.mIsMockLocation;
    }

    public Float optAccuracy() {
        return optAccuracy(0.0f);
    }

    public Float optAccuracy(float f) {
        Float f2 = this.mAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Double optAltitude() {
        return optAltitude(0.0d);
    }

    public Double optAltitude(double d) {
        Double d2 = this.mAltitude;
        if (d2 != null) {
            d = d2.doubleValue();
        }
        return Double.valueOf(d);
    }

    public Float optAltitudeAccuracy() {
        return optAltitudeAccuracy(0.0f);
    }

    public Float optAltitudeAccuracy(float f) {
        Float f2 = this.mAltitudeAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Float optBearing() {
        return optBearing(0.0f);
    }

    public Float optBearing(float f) {
        Float f2 = this.mBearing;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Float optBearingAccuracy() {
        return optBearingAccuracy(0.0f);
    }

    public Float optBearingAccuracy(float f) {
        Float f2 = this.mBearingAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Long optElapsedRealtimeNano() {
        return optElapsedRealtimeNano(0L);
    }

    public Long optElapsedRealtimeNano(long j) {
        Long l = this.mElapsedRealtimeNanos;
        if (l != null) {
            j = l.longValue();
        }
        return Long.valueOf(j);
    }

    public Bundle optExtras() {
        Bundle bundle = this.mExtras;
        if (bundle == null) {
            bundle = 1BK.A05();
        }
        return bundle;
    }

    public Float optSpeed() {
        return optSpeed(0.0f);
    }

    public Float optSpeed(float f) {
        Float f2 = this.mSpeed;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Float optSpeedAccuracy() {
        return optSpeedAccuracy(0.0f);
    }

    public Float optSpeedAccuracy(float f) {
        Float f2 = this.mSpeedAccuracy;
        if (f2 != null) {
            f = f2.floatValue();
        }
        return Float.valueOf(f);
    }

    public Long optTimestamp() {
        return optTimestamp(0L);
    }

    public Long optTimestamp(long j) {
        Long l = this.mTimestamp;
        if (l != null) {
            j = l.longValue();
        }
        return Long.valueOf(j);
    }

    public android.location.Location toAndroidLocation() {
        Map map = sProviderMap;
        String underlyingProvider = map.get(getUnderlyingProvider()) == null ? getUnderlyingProvider() : AnonymousClass001.A0b(getUnderlyingProvider(), map);
        if (underlyingProvider == null) {
            underlyingProvider = "fused";
        }
        return toAndroidLocation(underlyingProvider);
    }

    public android.location.Location toAndroidLocation(String str) {
        android.location.Location location = new android.location.Location(str);
        location.setLatitude(this.mLatitude);
        location.setLongitude(this.mLongitude);
        Double d = this.mAltitude;
        if (d != null) {
            location.setAltitude(d.doubleValue());
        }
        Long l = this.mTimestamp;
        long j = 0;
        location.setTime(l == null ? 0L : l.longValue());
        Float f = this.mAccuracy;
        if (f != null) {
            location.setAccuracy(f.floatValue());
        }
        Float f2 = this.mBearing;
        if (f2 != null) {
            location.setBearing(f2.floatValue());
        }
        Float f3 = this.mSpeed;
        if (f3 != null) {
            location.setSpeed(f3.floatValue());
        }
        Long l2 = this.mElapsedRealtimeNanos;
        if (l2 != null) {
            j = l2.longValue();
        }
        location.setElapsedRealtimeNanos(j);
        Float f4 = this.mSpeedAccuracy;
        if (f4 != null) {
            location.setSpeedAccuracyMetersPerSecond(f4.floatValue());
        }
        Float f5 = this.mBearingAccuracy;
        if (f5 != null) {
            location.setBearingAccuracyDegrees(f5.floatValue());
        }
        Float f6 = this.mAltitudeAccuracy;
        if (f6 != null) {
            location.setVerticalAccuracyMeters(f6.floatValue());
        }
        Bundle bundle = this.mExtras;
        if (bundle != null) {
            location.setExtras(bundle);
        }
        return location;
    }

    public JSONObject toJSON() {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put("provider", this.mProvider);
        double d = this.mLatitude;
        double d2 = 0.0d;
        if (Double.isNaN(d)) {
            d = 0.0d;
        }
        A12.put(LATITUDE, d);
        double d3 = this.mLongitude;
        if (!Double.isNaN(d3)) {
            d2 = d3;
        }
        A12.put(LONGITUDE, d2);
        Double d4 = this.mAltitude;
        if (d4 != null && !d4.isNaN()) {
            A12.put(ALTITUDE, this.mAltitude);
        }
        Float f = this.mAccuracy;
        if (f != null && !f.isNaN()) {
            A12.put(ACCURACY, this.mAccuracy);
        }
        Float f2 = this.mAltitudeAccuracy;
        if (f2 != null && !f2.isNaN()) {
            A12.put(ALTITUDE_ACCURACY, this.mAltitudeAccuracy);
        }
        Float f3 = this.mBearing;
        if (f3 != null && !f3.isNaN()) {
            A12.put(BEARING, this.mBearing);
        }
        Float f4 = this.mBearingAccuracy;
        if (f4 != null && !f4.isNaN()) {
            A12.put(BEARING_ACCURACY, this.mBearingAccuracy);
        }
        Float f5 = this.mSpeed;
        if (f5 != null && !f5.isNaN()) {
            A12.put(SPEED, this.mSpeed);
        }
        Float f6 = this.mSpeedAccuracy;
        if (f6 != null && !f6.isNaN()) {
            A12.put(SPEED_ACCURACY, this.mSpeedAccuracy);
        }
        A12.put(LOCATION_TIMESTAMP, this.mTimestamp);
        A12.put(LOCATION_ELAPSEDTIME, this.mElapsedRealtimeNanos);
        A12.put(IS_MOCK_LOCATION, this.mIsMockLocation);
        Bundle bundle = this.mExtras;
        if (bundle != null) {
            JSONObject A122 = AnonymousClass001.A12();
            Iterator it = EXTRAS_SERIALIZATION_KEYS.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                if (bundle.containsKey(A0i)) {
                    A122.put(A0i, bundle.get(A0i));
                }
            }
            A12.put(EXTRAS, A122);
        }
        return A12;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Location{mProvider=");
        A0k.append(this.mProvider);
        A0k.append(", mTimestamp=");
        A0k.append(this.mTimestamp);
        A0k.append(", mElapsedRealtimeNanos=");
        A0k.append(this.mElapsedRealtimeNanos);
        A0k.append(", mAccuracy=");
        A0k.append(this.mAccuracy);
        A0k.append(makeString("mAltitudeAccuracy", this.mAltitudeAccuracy));
        A0k.append(makeString("mBearing", this.mBearing));
        A0k.append(makeString("mBearingAccuracy", this.mBearingAccuracy));
        A0k.append(makeString("mSpeed", this.mSpeed));
        A0k.append(makeString("mSpeedAccuracy", this.mSpeedAccuracy));
        A0k.append(", mExtras=");
        A0k.append(this.mExtras);
        A0k.append(", mIsMockLocation=");
        A0k.append(this.mIsMockLocation);
        A0k.append(", underlyingProvider=");
        A0k.append(getUnderlyingProvider());
        return AnonymousClass001.A0f(A0k);
    }
}
