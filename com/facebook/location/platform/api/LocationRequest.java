package com.facebook.location.platform.api;

import X.1BK;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.JQz;
import X.JR0;
import X.KRP;
import X.KRQ;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: LocationRequest.class */
public class LocationRequest extends AutoSafeParcelable {
    public static final String BATCH_DURATION_SECONDS = "batchDurationSeconds";
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(LocationRequest.class);
    public static final String DESIRED_ACCURACY = "desiredAccuracy";
    public static final String DESIRED_INTERVAL = "desiredInterval";
    public static final String EXTRA_PARAMS = "extraParams";
    public static final String IS_OPPORTUNISTIC = "isOpportunistic";
    public static final String MAX_DURATION = "maximumDuration";
    public static final String MAX_INTERVAL = "maxInterval";
    public static final String MAX_POWER_USE = "maxPowerUse";
    public static final String MIN_DISPLACEMENT = "desiredSmallestDistance";
    public static final String NUM_LOCATIONS = "numberOfLocations";
    public static final int NUM_LOCATIONS_UNLIMITED = Integer.MAX_VALUE;
    public static final String PROVIDER = "provider";
    public final int mBatchDurationSec;
    public final int mDesiredAccuracy;
    public final int mDesiredIntervalSec;
    public final int mDesiredSmallestDistanceMeters;
    public final Bundle mExtraParams;
    public boolean mIsOpportunistic;
    public final long mMaxDurationSec;
    public final int mMaxIntervalSec;
    public final int mMaxPowerUse;
    public final int mNumLocations;
    public final String mProvider;

    public LocationRequest() {
        this.mDesiredAccuracy = 2;
        this.mMaxPowerUse = 1;
        this.mProvider = null;
        this.mIsOpportunistic = false;
        this.mDesiredIntervalSec = 0;
        this.mDesiredSmallestDistanceMeters = 0;
        this.mMaxDurationSec = 0L;
        this.mNumLocations = 0;
        this.mBatchDurationSec = 0;
        this.mMaxIntervalSec = -1;
        this.mExtraParams = null;
    }

    public LocationRequest(KRQ krq) {
        this.mDesiredAccuracy = 1;
        this.mMaxPowerUse = 1;
        this.mProvider = "fused";
        this.mIsOpportunistic = false;
        this.mDesiredIntervalSec = 1;
        this.mDesiredSmallestDistanceMeters = 0;
        this.mMaxDurationSec = 0L;
        this.mNumLocations = 1;
        this.mBatchDurationSec = 0;
        this.mMaxIntervalSec = -1;
        this.mExtraParams = null;
    }

    public /* synthetic */ LocationRequest(KRQ krq, KRP krp) {
        this(krq);
    }

    public LocationRequest(Bundle bundle, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z) {
        this.mDesiredAccuracy = i2;
        this.mMaxPowerUse = i6;
        this.mProvider = str;
        this.mIsOpportunistic = z;
        this.mDesiredIntervalSec = i3;
        this.mDesiredSmallestDistanceMeters = i4;
        this.mMaxDurationSec = j;
        this.mNumLocations = i7;
        this.mBatchDurationSec = i;
        this.mMaxIntervalSec = i5;
        this.mExtraParams = bundle;
    }

    public static LocationRequest fromJSON(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(DESIRED_ACCURACY, 2);
        int optInt2 = jSONObject.optInt(MAX_POWER_USE, 2);
        String optString = jSONObject.optString("provider", "");
        boolean optBoolean = jSONObject.optBoolean(IS_OPPORTUNISTIC, false);
        int optInt3 = jSONObject.optInt(DESIRED_INTERVAL, 0);
        int optInt4 = jSONObject.optInt(MIN_DISPLACEMENT, 0);
        int optInt5 = jSONObject.optInt(MAX_DURATION, 0);
        int optInt6 = jSONObject.optInt(NUM_LOCATIONS, 0);
        int optInt7 = jSONObject.optInt(BATCH_DURATION_SECONDS, 0);
        int optInt8 = jSONObject.optInt(MAX_INTERVAL, 0);
        JSONObject optJSONObject = jSONObject.optJSONObject(EXTRA_PARAMS);
        Bundle bundle = null;
        long j = optInt5;
        if (optJSONObject != null) {
            bundle = 1BK.A05();
            bundle.putString("PROVIDER", optJSONObject.optString("PROVIDER"));
        }
        if (optInt8 < optInt3 && optInt8 != -1) {
            Log.w("Builder", "Max Interval was set to value less than Desired Interval. Setting to default -1.");
            optInt8 = -1;
        }
        if (optInt3 == 0 && optInt6 > 1) {
            Log.i("Builder", "Requesting many locations as fast as possible, which may impact battery.");
        }
        if (optString != null && !optString.equals("fused")) {
            if (bundle == null) {
                bundle = 1BK.A05();
            }
            bundle.putString("PROVIDER", optString);
            optString = "fused";
        }
        if (optInt7 < optInt3) {
            optInt7 = optInt3;
        }
        return new LocationRequest(bundle, optString, optInt7, optInt, optInt3, optInt4, optInt8, optInt2, optInt6, j, optBoolean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.mIsOpportunistic != locationRequest.mIsOpportunistic || this.mDesiredIntervalSec != locationRequest.mDesiredIntervalSec || this.mDesiredSmallestDistanceMeters != locationRequest.mDesiredSmallestDistanceMeters || this.mMaxDurationSec != locationRequest.mMaxDurationSec || this.mNumLocations != locationRequest.mNumLocations || this.mDesiredAccuracy != locationRequest.mDesiredAccuracy || this.mMaxPowerUse != locationRequest.mMaxPowerUse || this.mMaxIntervalSec != locationRequest.mMaxIntervalSec || this.mBatchDurationSec != locationRequest.mBatchDurationSec) {
            return false;
        }
        Bundle bundle = this.mExtraParams;
        Bundle bundle2 = locationRequest.mExtraParams;
        if (bundle == null) {
            if (bundle2 != null) {
                return false;
            }
        } else {
            if (bundle2 == null) {
                return false;
            }
            Iterator A0w = JR0.A0w(bundle);
            while (A0w.hasNext()) {
                String A0i = AnonymousClass001.A0i(A0w);
                Object obj2 = this.mExtraParams.get(A0i);
                Object obj3 = locationRequest.mExtraParams.get(A0i);
                if (obj2 == null) {
                    if (obj3 != null) {
                        return false;
                    }
                } else if (!obj2.equals(obj3)) {
                    return false;
                }
            }
        }
        return this.mProvider.equals(locationRequest.mProvider);
    }

    public int getBatchDurationSec() {
        return this.mBatchDurationSec;
    }

    public int getDesiredAccuracy() {
        return this.mDesiredAccuracy;
    }

    public int getDesiredIntervalSec() {
        return this.mDesiredIntervalSec;
    }

    public int getDesiredSmallestDistanceMeters() {
        return this.mDesiredSmallestDistanceMeters;
    }

    public Bundle getExtraParams() {
        return this.mExtraParams;
    }

    public long getMaxDurationSec() {
        return this.mMaxDurationSec;
    }

    public int getMaxIntervalSec() {
        return this.mMaxIntervalSec;
    }

    public int getMaxPowerUse() {
        return this.mMaxPowerUse;
    }

    public int getNumLocations() {
        return this.mNumLocations;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A02(this.mMaxDurationSec, ((((((((((this.mDesiredAccuracy * 331) + this.mMaxPowerUse) * 31) + 1BL.A06(this.mProvider)) * 31) + (this.mIsOpportunistic ? 1 : 0)) * 31) + this.mDesiredIntervalSec) * 31) + this.mDesiredSmallestDistanceMeters) * 31) + this.mNumLocations) * 31) + this.mMaxIntervalSec) * 31) + JQz.A0E(this.mExtraParams, 0);
    }

    public boolean isOpportunistic() {
        return this.mIsOpportunistic;
    }

    public void setStartTime() {
    }

    public JSONObject toJSON() {
        JSONObject A12 = AnonymousClass001.A12();
        A12.put(DESIRED_ACCURACY, this.mDesiredAccuracy);
        A12.put(MAX_POWER_USE, this.mMaxPowerUse);
        A12.put("provider", this.mProvider);
        A12.put(IS_OPPORTUNISTIC, this.mIsOpportunistic);
        A12.put(DESIRED_INTERVAL, this.mDesiredIntervalSec);
        A12.put(MIN_DISPLACEMENT, this.mDesiredSmallestDistanceMeters);
        A12.put(MAX_DURATION, this.mMaxDurationSec);
        A12.put(NUM_LOCATIONS, this.mNumLocations);
        A12.put(BATCH_DURATION_SECONDS, this.mBatchDurationSec);
        A12.put(MAX_INTERVAL, this.mMaxIntervalSec);
        A12.put(EXTRA_PARAMS, this.mExtraParams);
        return A12;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LocationRequest{mDesiredAccuracy=");
        A0k.append(this.mDesiredAccuracy);
        A0k.append(", mMaxPowerUse=");
        A0k.append(this.mMaxPowerUse);
        A0k.append(", mProvider='");
        A0k.append(this.mProvider);
        A0k.append('\'');
        A0k.append(", mIsOpportunistic=");
        A0k.append(this.mIsOpportunistic);
        A0k.append(", mDesiredIntervalSec=");
        A0k.append(this.mDesiredIntervalSec);
        A0k.append(", mDesiredSmallestDistanceMeters=");
        A0k.append(this.mDesiredSmallestDistanceMeters);
        A0k.append(", mMaxDurationSec=");
        A0k.append(this.mMaxDurationSec);
        A0k.append(", mNumLocations=");
        A0k.append(this.mNumLocations);
        A0k.append(", mBatchDurationSec=");
        A0k.append(this.mBatchDurationSec);
        A0k.append(", mMaxIntervalSec=");
        A0k.append(this.mMaxIntervalSec);
        A0k.append(", mExtraParams=");
        A0k.append(this.mExtraParams);
        return AnonymousClass001.A0f(A0k);
    }
}
