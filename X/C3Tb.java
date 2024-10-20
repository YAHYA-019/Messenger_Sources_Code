package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import com.facebook.resources.compat.RedexResourcesCompat;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.Locale;

/* renamed from: X.3Tb, reason: invalid class name */
/* loaded from: 3Tb.class */
public abstract class C3Tb {
    public static Locale A00;
    public static final 0QO A01 = new 0QO(0);

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C26H.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = ((PackageItemInfo) context.getApplicationInfo()).name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String A01(Context context, int i) {
        int i2;
        String str;
        Resources resources = context.getResources();
        String A002 = A00(context);
        if (i == 1) {
            i2 = 2131954417;
        } else if (i != 2) {
            if (i != 3) {
                if (i == 5) {
                    str = "common_google_play_services_invalid_account_text";
                } else if (i == 7) {
                    str = "common_google_play_services_network_error_text";
                } else if (i == 9) {
                    i2 = 2131954422;
                } else if (i != 20) {
                    switch (i) {
                        case 16:
                            str = "common_google_play_services_api_unavailable_text";
                            break;
                        case 17:
                            str = "common_google_play_services_sign_in_failed_text";
                            break;
                        case 18:
                            i2 = 2131954426;
                            break;
                        default:
                            i2 = 2131954421;
                            break;
                    }
                } else {
                    str = "common_google_play_services_restricted_profile_text";
                }
                Resources resources2 = context.getResources();
                String A03 = A03(context, str);
                if (A03 == null) {
                    A03 = resources2.getString(2131954421);
                }
                return String.format(resources2.getConfiguration().locale, A03, A002);
            }
            i2 = 2131954414;
        } else {
            if (DeviceProperties.A00(context)) {
                return resources.getString(2131954427);
            }
            i2 = 2131954424;
        }
        return resources.getString(i2, A002);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public static String A02(Context context, int i) {
        String str;
        int i2;
        String str2;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                i2 = 2131954418;
                return resources.getString(i2);
            case 2:
                i2 = 2131954425;
                return resources.getString(i2);
            case 3:
                i2 = 2131954415;
                return resources.getString(i2);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                str = "common_google_play_services_invalid_account_title";
                return A03(context, str);
            case 7:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                str = "common_google_play_services_network_error_title";
                return A03(context, str);
            case 8:
                str2 = "Internal error occurred. Please see logs for detailed information";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 9:
                str2 = "Google Play services is invalid. Cannot recover.";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 10:
                str2 = "Developer error occurred. Please see logs for detailed information";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 11:
                str2 = "The application is not licensed to the user.";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                str2 = 0Pz.A0T("Unexpected error code ", i);
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 16:
                str2 = "One of the API components you attempted to connect to is not available.";
                android.util.Log.e("GoogleApiAvailability", str2);
                return null;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                str = "common_google_play_services_sign_in_failed_title";
                return A03(context, str);
            case 20:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                str = "common_google_play_services_restricted_profile_title";
                return A03(context, str);
        }
    }

    public static String A03(Context context, String str) {
        Resources resources;
        0QO r0 = A01;
        synchronized (r0) {
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            0PL r02 = 0PL.A01;
            Locale locale = locales.get(0);
            if (!locale.equals(A00)) {
                r0.clear();
                A00 = locale;
            }
            String str2 = (String) r0.get(str);
            if (str2 == null) {
                boolean z = GooglePlayServicesUtil.A00;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                str2 = null;
                if (resources != null) {
                    int identifier = RedexResourcesCompat.getIdentifier(resources, str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        android.util.Log.w("GoogleApiAvailability", 0Pz.A0W("Missing resource: ", str));
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            r0.put(str, string);
                            return string;
                        }
                        android.util.Log.w("GoogleApiAvailability", 0Pz.A0W("Got empty resource: ", str));
                    }
                }
            }
            return str2;
        }
    }
}
