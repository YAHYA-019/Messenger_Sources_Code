package com.facebook.maps.mapbox.common;

import X.0Pz;
import X.1BK;
import android.net.Uri;
import com.mapbox.mapboxsdk.maps.MapboxMapOptions;

/* loaded from: FbMapboxMapOptions.class */
public final class FbMapboxMapOptions extends MapboxMapOptions {
    public String A02;
    public String A03;
    public boolean A04;
    public String A01 = "FbMapboxMapOptions.java";
    public Boolean A00 = 1BK.A0d();

    public String A00(String str) {
        String str2;
        if (!str.contains("_nc_client_caller=")) {
            str2 = "?";
            str = 0Pz.A0j(0Pz.A0W(str, str.contains(str2) ? "&" : "?"), "_nc_client_caller=", Uri.encode(this.A01));
        }
        if (this.A03 != null && !str.contains("&_nc_client_id=")) {
            str = 0Pz.A0j(str, "&_nc_client_id=", Uri.encode(this.A03));
        }
        return str;
    }
}
