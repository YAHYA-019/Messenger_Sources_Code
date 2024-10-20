package com.mapbox.mapboxsdk;

import X.AnonymousClass001;
import X.JQz;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.mapbox.android.accounts.v1.MapboxAccounts;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.log.Logger;

/* loaded from: AccountsManager.class */
public class AccountsManager {
    public static final String PREFERENCE_TIMESTAMP = "com.mapbox.mapboxsdk.accounts.timestamp";
    public static final String PREFERENCE_USER_ID = "com.mapbox.mapboxsdk.accounts.userid";
    public static final String TAG = "Mbgl-AccountsManager";
    public boolean isManaged;
    public SharedPreferences sharedPreferences;
    public String skuToken;
    public long timestamp;

    public AccountsManager() {
        this.isManaged = isSkuTokenManaged();
        initialize();
    }

    public AccountsManager(SharedPreferences sharedPreferences, boolean z) {
        this.sharedPreferences = sharedPreferences;
        this.isManaged = z;
        initialize();
    }

    private String generateSkuToken(String str) {
        return MapboxAccounts.obtainMapsSkuUserToken(str);
    }

    private String generateUserId() {
        return MapboxAccounts.obtainEndUserId();
    }

    public static long getNow() {
        return System.currentTimeMillis();
    }

    private SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            sharedPreferences = JQz.A0J().getSharedPreferences(MapboxConstants.MAPBOX_SHARED_PREFERENCES, 0);
            this.sharedPreferences = sharedPreferences;
        }
        return sharedPreferences;
    }

    private void initialize() {
        retrieveSkuTokenAndTimestamp();
        if (this.isManaged) {
            validateRotation(validateUserId());
        }
    }

    private boolean isExpired() {
        return isExpired(System.currentTimeMillis(), this.timestamp);
    }

    public static boolean isExpired(long j, long j2) {
        return AnonymousClass001.A1P(((j - j2) > 3600000L ? 1 : ((j - j2) == 3600000L ? 0 : -1)));
    }

    private boolean isSkuTokenManaged() {
        try {
            Bundle bundle = ((PackageItemInfo) retrieveApplicationInfo()).metaData;
            if (bundle != null) {
                return bundle.getBoolean(MapboxConstants.KEY_META_DATA_MANAGE_SKU_TOKEN, true);
            }
        } catch (Exception e) {
            Logger.e(TAG, "Failed to read the package metadata: ", e);
        }
        return true;
    }

    private long persistRotation(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putLong(PREFERENCE_TIMESTAMP, currentTimeMillis);
        edit.putString(MapboxConstants.KEY_PREFERENCE_SKU_TOKEN, str);
        edit.apply();
        return currentTimeMillis;
    }

    private ApplicationInfo retrieveApplicationInfo() {
        return JQz.A0J().getPackageManager().getApplicationInfo(JQz.A0J().getPackageName(), 128);
    }

    private void retrieveSkuTokenAndTimestamp() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        this.skuToken = sharedPreferences.getString(MapboxConstants.KEY_PREFERENCE_SKU_TOKEN, "");
        this.timestamp = sharedPreferences.getLong(PREFERENCE_TIMESTAMP, 0L);
    }

    private void validateRotation(String str) {
        if (TextUtils.isEmpty(this.skuToken) || this.timestamp == 0) {
            String obtainMapsSkuUserToken = MapboxAccounts.obtainMapsSkuUserToken(str);
            this.skuToken = obtainMapsSkuUserToken;
            this.timestamp = persistRotation(obtainMapsSkuUserToken);
        }
    }

    private String validateUserId() {
        String string = getSharedPreferences().getString(PREFERENCE_USER_ID, "");
        if (TextUtils.isEmpty(string)) {
            string = MapboxAccounts.obtainEndUserId();
            SharedPreferences.Editor edit = getSharedPreferences().edit();
            edit.putString(PREFERENCE_USER_ID, string);
            edit.apply();
        }
        return string;
    }

    public String getSkuToken() {
        if (!this.isManaged) {
            this.skuToken = getSharedPreferences().getString(MapboxConstants.KEY_PREFERENCE_SKU_TOKEN, "");
        } else if (isExpired()) {
            String obtainMapsSkuUserToken = MapboxAccounts.obtainMapsSkuUserToken(getSharedPreferences().getString(PREFERENCE_USER_ID, ""));
            this.skuToken = obtainMapsSkuUserToken;
            this.timestamp = persistRotation(obtainMapsSkuUserToken);
        }
        return this.skuToken;
    }
}
