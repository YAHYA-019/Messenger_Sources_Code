package com.mapbox.mapboxsdk;

import X.AnonymousClass001;
import X.JQz;
import android.content.Context;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.exceptions.MapboxConfigurationException;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.TelemetryDefinition;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.utils.ThreadUtils;

/* loaded from: Mapbox.class */
public final class Mapbox {
    public static Mapbox INSTANCE;
    public static final String TAG = "Mbgl-Mapbox";
    public static ModuleProvider moduleProvider;
    public String accessToken;
    public AccountsManager accounts;
    public Context context;
    public TelemetryDefinition telemetry;

    public Mapbox(Context context, String str) {
        this.context = context;
        this.accessToken = str;
    }

    public static String getAccessToken() {
        validateMapbox();
        return INSTANCE.accessToken;
    }

    public static Context getApplicationContext() {
        return JQz.A0J();
    }

    public static Mapbox getInstance(Context context) {
        Mapbox mapbox;
        synchronized (Mapbox.class) {
            mapbox = getInstance(context, null);
        }
        return mapbox;
    }

    public static Mapbox getInstance(Context context, String str) {
        Mapbox mapbox;
        synchronized (Mapbox.class) {
            ThreadUtils.init(context);
            ThreadUtils.checkThread(TAG);
            if (INSTANCE == null) {
                Context applicationContext = context.getApplicationContext();
                FileSource.initializeFileDirsPaths(applicationContext);
                INSTANCE = new Mapbox(applicationContext, str);
                if (isAccessTokenValid(str)) {
                    initializeTelemetry();
                    INSTANCE.accounts = new AccountsManager();
                }
                ConnectivityReceiver.instance(applicationContext);
            }
            mapbox = INSTANCE;
        }
        return mapbox;
    }

    /* JADX WARN: Type inference failed for: r301v2, types: [com.mapbox.mapboxsdk.ModuleProvider, java.lang.Object] */
    public static ModuleProvider getModuleProvider() {
        ModuleProvider moduleProvider2 = moduleProvider;
        ModuleProvider moduleProvider3 = moduleProvider2;
        if (moduleProvider2 == null) {
            ?? obj = new Object();
            moduleProvider = obj;
            moduleProvider3 = obj;
        }
        return moduleProvider3;
    }

    public static String getSkuToken() {
        return INSTANCE.accounts.getSkuToken();
    }

    public static TelemetryDefinition getTelemetry() {
        return INSTANCE.telemetry;
    }

    public static boolean hasInstance() {
        return AnonymousClass001.A1T(INSTANCE);
    }

    public static void initializeTelemetry() {
        try {
            INSTANCE.telemetry = getModuleProvider().obtainTelemetry();
        } catch (Exception e) {
            Logger.e(TAG, "Error occurred while initializing telemetry", e);
            MapStrictMode.strictModeViolation("Error occurred while initializing telemetry", e);
        }
    }

    public static boolean isAccessTokenValid(String str) {
        boolean z = false;
        if (str != null) {
            String lowerCase = str.trim().toLowerCase(MapboxConstants.MAPBOX_LOCALE);
            if (lowerCase.length() != 0 && (lowerCase.startsWith("pk.") || lowerCase.startsWith("sk."))) {
                z = true;
            }
        }
        return z;
    }

    public static Boolean isConnected() {
        Boolean valueOf;
        synchronized (Mapbox.class) {
            valueOf = Boolean.valueOf(ConnectivityReceiver.instance(JQz.A0J()).isConnected());
        }
        return valueOf;
    }

    public static void setAccessToken(String str) {
        validateMapbox();
        Mapbox mapbox = INSTANCE;
        mapbox.accessToken = str;
        validateMapbox();
        FileSource.getInstance(mapbox.context).setAccessToken(str);
    }

    public static void setConnected(Boolean bool) {
        synchronized (Mapbox.class) {
            ConnectivityReceiver.instance(JQz.A0J()).setConnected(bool);
        }
    }

    public static void validateMapbox() {
        if (INSTANCE == null) {
            throw new MapboxConfigurationException();
        }
    }
}
