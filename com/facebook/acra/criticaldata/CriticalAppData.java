package com.facebook.acra.criticaldata;

import X.AnonymousClass001;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.acra.constants.ErrorReportingConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: CriticalAppData.class */
public final class CriticalAppData {
    public static final String ACRA_CRITICAL_DATA_STORE = "acra_criticaldata_store";
    public static final String ADDITIONAL_PARAMS = "ADDITIONAL_PARAMS";
    public static final String CLIENT_USER_ID = "CLIENT_USER_ID";
    public static final String DEVICE_ID = "DEVICE_ID";
    public static final String IS_EMPLOYEE = "IS_EMPLOYEE";
    public static final String UNDERLYING_ACCOUNT_USER_ID = "UNDERLYING_ACCOUNT_USER_ID";
    public static final String USER_ID = "USER_ID";
    public static volatile UserChangeListener sUserChangeListener;

    public static Set getAdditionalParamKeySet(Context context) {
        return AnonymousClass001.A06(context).getStringSet(ADDITIONAL_PARAMS, null);
    }

    public static Map getAdditionalParamValues(Context context) {
        HashMap A0u = AnonymousClass001.A0u();
        Set additionalParamKeySet = getAdditionalParamKeySet(context);
        if (additionalParamKeySet != null && !additionalParamKeySet.isEmpty()) {
            SharedPreferences A06 = AnonymousClass001.A06(context);
            Iterator it = additionalParamKeySet.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                String string = A06.getString(A0i, "");
                if (!TextUtils.isEmpty(string)) {
                    A0u.put(A0i, string);
                }
            }
        }
        return A0u;
    }

    public static String getClientUserId(Context context) {
        return AnonymousClass001.A06(context).getString(CLIENT_USER_ID, "");
    }

    public static String getDeviceId(Context context) {
        return AnonymousClass001.A06(context).getString(DEVICE_ID, "");
    }

    public static SharedPreferences getSharedPreferences(Context context) {
        return AnonymousClass001.A06(context);
    }

    public static String getUnderlyingAccountUserId(Context context) {
        String string = AnonymousClass001.A06(context).getString(UNDERLYING_ACCOUNT_USER_ID, "-2");
        if (string == null) {
            string = "-3";
        }
        return string;
    }

    public static String getUserId(Context context) {
        return AnonymousClass001.A06(context).getString(USER_ID, "");
    }

    public static boolean isEmployee(Context context) {
        return context.getSharedPreferences(ACRA_CRITICAL_DATA_STORE, 0).getBoolean(IS_EMPLOYEE, false);
    }

    public static void maybeNotifyDetector() {
        UserChangeListener userChangeListener = sUserChangeListener;
        if (userChangeListener != null) {
            userChangeListener.userHasChanged();
        }
    }

    public static void setClientUserId(Context context, String str) {
        if (str == null || str.equals(getUserId(context))) {
            return;
        }
        AnonymousClass001.A06(context).edit().putString(CLIENT_USER_ID, str).commit();
    }

    public static void setDeviceId(Context context, String str) {
        if (str == null || str.equals(getDeviceId(context))) {
            return;
        }
        AnonymousClass001.A06(context).edit().putString(DEVICE_ID, str).commit();
    }

    public static void setUserAndDeviceId(Context context, String str, String str2, String str3, boolean z) {
        if (str == null || str3 == null) {
            return;
        }
        if (str.equals(getUserId(context)) && str3.equals(getDeviceId(context)) && z == isEmployee(context) && str2.equals(getUnderlyingAccountUserId(context))) {
            return;
        }
        AnonymousClass001.A06(context).edit().putString(USER_ID, str).putString(UNDERLYING_ACCOUNT_USER_ID, str2).putString(DEVICE_ID, str3).putBoolean(IS_EMPLOYEE, z).commit();
        maybeNotifyDetector();
    }

    public static void setUserAndDeviceId(Context context, String str, String str2, boolean z) {
        setUserAndDeviceId(context, str, ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL, str2, z);
    }

    public static void setUserChangeListener(UserChangeListener userChangeListener) {
        sUserChangeListener = userChangeListener;
    }

    public static void setUserId(Context context, String str) {
        setUserId(context, str, "");
    }

    public static void setUserId(Context context, String str, String str2) {
        if ((str == null || str.equals(getUserId(context))) && str2.equals(getUnderlyingAccountUserId(context))) {
            return;
        }
        AnonymousClass001.A06(context).edit().putString(USER_ID, str).putString(UNDERLYING_ACCOUNT_USER_ID, str2).commit();
        maybeNotifyDetector();
    }
}
