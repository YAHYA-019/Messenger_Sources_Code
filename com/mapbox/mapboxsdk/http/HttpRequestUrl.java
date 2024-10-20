package com.mapbox.mapboxsdk.http;

import X.0Pz;
import X.AnonymousClass001;
import com.mapbox.mapboxsdk.Mapbox;

/* loaded from: HttpRequestUrl.class */
public class HttpRequestUrl {
    public static String buildResourceUrl(String str, String str2, int i, boolean z) {
        String str3;
        if (isValidMapboxEndpoint(str)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            if (i == 0) {
                A0k.append(str2);
                str3 = "?";
            } else {
                A0k.append(str2);
                str3 = "&";
            }
            str2 = 0Pz.A0j(AnonymousClass001.A0d(str3, A0k), "sku=", Mapbox.getSkuToken());
            if (z) {
                str2 = 0Pz.A0W(str2, "&offline=true");
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r301.endsWith(".mapbox.cn") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isValidMapboxEndpoint(java.lang.String r301) {
        /*
            java.lang.String r0 = "mapbox.com"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L36
            java.lang.String r0 = ".mapbox.com"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.endsWith(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L36
            java.lang.String r0 = "mapbox.cn"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L36
            r0 = r301
            java.lang.String r1 = ".mapbox.cn"
            boolean r0 = r0.endsWith(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L38
        L36:
            r0 = 1
            r303 = r0
        L38:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.http.HttpRequestUrl.isValidMapboxEndpoint(java.lang.String):boolean");
    }
}
