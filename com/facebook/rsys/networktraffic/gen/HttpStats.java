package com.facebook.rsys.networktraffic.gen;

import X.1BJ;
import X.1BL;
import X.2JQ;
import X.7zN;
import X.7zP;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: HttpStats.class */
public class HttpStats {
    public static 2JQ CONVERTER = LVi.A00(38);
    public static long sMcfTypeId;
    public final String errorDescription;
    public final String httpMethod;
    public final String networkType;
    public final long requestBodyBytes;
    public final String requestCallPath;
    public final int requestCategory;
    public final String requestFriendlyName;
    public final long requestHeaderBytes;
    public final String requestSurface;
    public final String requestUri;
    public final long responseBodyBytes;
    public final long responseHeaderBytes;
    public final int statusCode;

    public HttpStats(long j, long j2, long j3, long j4, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7) {
        7zP.A1S(str, str2, str3);
        str4.getClass();
        this.requestHeaderBytes = j;
        this.requestBodyBytes = j2;
        this.responseHeaderBytes = j3;
        this.responseBodyBytes = j4;
        this.requestUri = str;
        this.requestFriendlyName = str2;
        this.requestCallPath = str3;
        this.requestCategory = i;
        this.statusCode = i2;
        this.httpMethod = str4;
        this.errorDescription = str5;
        this.networkType = str6;
        this.requestSurface = str7;
    }

    public static native HttpStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HttpStats)) {
                return false;
            }
            HttpStats httpStats = (HttpStats) obj;
            if (this.requestHeaderBytes != httpStats.requestHeaderBytes || this.requestBodyBytes != httpStats.requestBodyBytes || this.responseHeaderBytes != httpStats.responseHeaderBytes || this.responseBodyBytes != httpStats.responseBodyBytes || !this.requestUri.equals(httpStats.requestUri) || !this.requestFriendlyName.equals(httpStats.requestFriendlyName) || !this.requestCallPath.equals(httpStats.requestCallPath) || this.requestCategory != httpStats.requestCategory || this.statusCode != httpStats.statusCode || !this.httpMethod.equals(httpStats.httpMethod)) {
                return false;
            }
            String str = this.errorDescription;
            String str2 = httpStats.errorDescription;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.networkType;
            String str4 = httpStats.networkType;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.requestSurface;
            String str6 = httpStats.requestSurface;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.requestHeaderBytes;
        int A02 = AnonymousClass002.A02(this.responseHeaderBytes, AnonymousClass002.A02(this.requestBodyBytes, AbstractC2326GOr.A03((int) (j ^ (j >>> 32)))));
        long j2 = this.responseBodyBytes;
        return ((((AnonymousClass002.A07(this.httpMethod, (((AnonymousClass002.A07(this.requestCallPath, AnonymousClass002.A07(this.requestFriendlyName, AnonymousClass002.A07(this.requestUri, (A02 + ((int) ((j2 >>> 32) ^ j2))) * 31))) + this.requestCategory) * 31) + this.statusCode) * 31) + 1BL.A05(this.errorDescription)) * 31) + 1BL.A05(this.networkType)) * 31) + 7zN.A05(this.requestSurface);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("HttpStats{requestHeaderBytes=");
        A0k.append(this.requestHeaderBytes);
        A0k.append(",requestBodyBytes=");
        A0k.append(this.requestBodyBytes);
        A0k.append(",responseHeaderBytes=");
        A0k.append(this.responseHeaderBytes);
        A0k.append(",responseBodyBytes=");
        A0k.append(this.responseBodyBytes);
        A0k.append(",requestUri=");
        A0k.append(this.requestUri);
        A0k.append(",requestFriendlyName=");
        A0k.append(this.requestFriendlyName);
        A0k.append(",requestCallPath=");
        A0k.append(this.requestCallPath);
        A0k.append(",requestCategory=");
        A0k.append(this.requestCategory);
        A0k.append(",statusCode=");
        A0k.append(this.statusCode);
        A0k.append(",httpMethod=");
        A0k.append(this.httpMethod);
        A0k.append(1BJ.A00(618));
        A0k.append(this.errorDescription);
        A0k.append(",networkType=");
        A0k.append(this.networkType);
        A0k.append(",requestSurface=");
        return GOq.A12(this.requestSurface, A0k);
    }
}
