package com.mapbox.mapboxsdk.module.http;

import X.0Pz;
import X.0fH;
import X.1BJ;
import X.1BQ;
import X.1BY;
import X.42C;
import X.AnonymousClass001;
import X.AnonymousClass407;
import X.AnonymousClass409;
import X.C00i;
import X.C2tx;
import X.C41z;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.http.interfaces.RequestPriority;
import com.mapbox.mapboxsdk.BuildConfig;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.http.HttpRequest;
import com.mapbox.mapboxsdk.http.HttpResponder;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

/* loaded from: HttpRequestImpl.class */
public class HttpRequestImpl implements HttpRequest, ResponseHandler {
    public static final String TAG = "HttpRequestImpl";
    public static HttpRequest.UrlRewriter URL_REWRITER;
    public String USER_AGENT_STRING;
    public 1BY _UL_mInjectionContext;
    public C00i mFbHttpRequestProcessor = 1BQ.A02(17131);
    public 42C mHttpFutureWrapper;
    public HttpResponder mHttpResponder;

    private String convertForFBTile(Uri uri) {
        return 0Pz.A0j(C41z.A00(Integer.valueOf(uri.getQueryParameter("x")).intValue(), Integer.valueOf(uri.getQueryParameter("y")).intValue(), Integer.valueOf(uri.getQueryParameter("z")).intValue()), "&", uri.getQuery());
    }

    private String getApplicationIdentifier() {
        try {
            Context applicationContext = Mapbox.getApplicationContext();
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            return String.format("%s/%s (%s)", applicationContext.getPackageName(), packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
        } catch (Exception unused) {
            return "";
        }
    }

    private String getHeader(HttpResponse httpResponse, String str) {
        Header firstHeader = httpResponse.getFirstHeader(str);
        if (firstHeader == null) {
            return null;
        }
        return firstHeader.getValue();
    }

    private String getUserAgent() {
        String str = this.USER_AGENT_STRING;
        if (str == null) {
            str = toAscii(String.format("%s %s (%s) Android/%s (%s)", getApplicationIdentifier(), BuildConfig.MAPBOX_VERSION_STRING, BuildConfig.GIT_REVISION_SHORT, Integer.valueOf(Build.VERSION.SDK_INT), Build.CPU_ABI));
            this.USER_AGENT_STRING = str;
        }
        return str;
    }

    private void onFailure(Exception exc) {
        int i;
        if ((exc instanceof NoRouteToHostException) || (exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof ProtocolException) || (exc instanceof SSLException)) {
            i = 0;
        } else {
            i = 2;
            if (exc instanceof InterruptedIOException) {
                i = 1;
            }
        }
        this.mHttpResponder.handleFailure(i, exc.getMessage() != null ? exc.getMessage() : "Error processing the request");
    }

    public static void setUrlRewriter(HttpRequest.UrlRewriter urlRewriter) {
        URL_REWRITER = urlRewriter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        r0 = new java.lang.StringBuilder(r0);
        r0.append(r301.substring(0, r304));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r304 >= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        r0 = r301.codePointAt(r304);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r0 <= 31) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        r305 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (r0 < 127) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r0.append(r305);
        r304 = r304 + java.lang.Character.charCount(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r305 = 63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r301 = r0.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String toAscii(java.lang.String r301) {
        /*
            r0 = r301
            int r0 = r0.length()
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L9:
            r0 = r304
            r1 = r302
            if (r0 >= r1) goto L8f
            r0 = r301
            r1 = r304
            int r0 = r0.codePointAt(r1)
            r305 = r0
            r0 = 127(0x7f, float:1.78E-43)
            r306 = r0
            r0 = 31
            r307 = r0
            r0 = r305
            r1 = r307
            if (r0 <= r1) goto L3a
            r0 = r305
            r1 = r306
            if (r0 >= r1) goto L3a
            r0 = r305
            int r0 = java.lang.Character.charCount(r0)
            r305 = r0
            r0 = r304
            r1 = r305
            int r0 = r0 + r1
            r304 = r0
            goto L9
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r308 = r0
            r0 = r308
            r1 = r302
            r0.<init>(r1)
            r0 = r301
            r1 = 0
            r2 = r304
            java.lang.String r0 = r0.substring(r1, r2)
            r309 = r0
            r0 = r308
            r1 = r309
            java.lang.StringBuilder r0 = r0.append(r1)
        L55:
            r0 = r304
            r1 = r302
            if (r0 >= r1) goto L89
            r0 = r301
            r1 = r304
            int r0 = r0.codePointAt(r1)
            r303 = r0
            r0 = r303
            r1 = r307
            if (r0 <= r1) goto L6f
            r0 = r303
            r305 = r0
            r0 = r303
            r1 = r306
            if (r0 < r1) goto L73
        L6f:
            r0 = 63
            r305 = r0
        L73:
            r0 = r308
            r1 = r305
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r303
            int r0 = java.lang.Character.charCount(r0)
            r305 = r0
            r0 = r304
            r1 = r305
            int r0 = r0 + r1
            r304 = r0
            goto L55
        L89:
            r0 = r308
            java.lang.String r0 = r0.toString()
            r301 = r0
        L8f:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.module.http.HttpRequestImpl.toAscii(java.lang.String):java.lang.String");
    }

    @Override // com.mapbox.mapboxsdk.http.HttpRequest
    public void cancelRequest() {
        42C r0 = this.mHttpFutureWrapper;
        if (r0 != null) {
            r0.A00.A03(r0.A01);
        }
    }

    @Override // com.mapbox.mapboxsdk.http.HttpRequest
    public void executeRequest(HttpResponder httpResponder, long j, String str, String str2, String str3, boolean z) {
        this.mHttpResponder = httpResponder;
        try {
            Uri parse = Uri.parse(str);
            String lowerCase = parse.getHost().toLowerCase(MapboxConstants.MAPBOX_LOCALE);
            if (lowerCase.equals("mapbox.com") || lowerCase.endsWith(".mapbox.com") || lowerCase.equals("mapbox.cn") || lowerCase.endsWith(".mapbox.cn")) {
                str = 0Pz.A0W(parse.getQuery() == null ? 0Pz.A0W(str, "?") : 0Pz.A0W(str, "&"), "events=true");
                if (z) {
                    str = 0Pz.A0W(str, "&offline=true");
                }
            } else if (parse.getEncodedPath().contains("map_tile.php")) {
                str = convertForFBTile(parse);
            }
            HttpRequest.UrlRewriter urlRewriter = URL_REWRITER;
            if (urlRewriter != null) {
                str = urlRewriter.rewrite(str);
            }
            HttpGet httpGet = new HttpGet(str);
            httpGet.addHeader(HttpRequestMultipart.USER_AGENT, getUserAgent());
            if (str2.length() > 0) {
                httpGet.addHeader(1BJ.A00(287), str2);
            } else if (str3.length() > 0) {
                httpGet.addHeader("If-Modified-Since", str3);
            }
            AnonymousClass407 A00 = AnonymousClass409.A00("mapbox-gl-native", this, httpGet);
            A00.A06 = RequestPriority.INTERACTIVE;
            this.mHttpFutureWrapper = ((C2tx) this.mFbHttpRequestProcessor.get()).A01(A00.A00());
        } catch (Exception e) {
            onFailure(e);
        }
    }

    @Override // org.apache.http.client.ResponseHandler
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        handleResponse(httpResponse);
        return httpResponse;
    }

    @Override // org.apache.http.client.ResponseHandler
    public HttpResponse handleResponse(HttpResponse httpResponse) {
        if (httpResponse.getStatusLine() == null) {
            0fH.A0m(TAG, "Null status line");
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode < 200 || statusCode > 300) {
            String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
            if (TextUtils.isEmpty(reasonPhrase)) {
                reasonPhrase = "No additional information";
            }
            0fH.A0j(TAG, String.format("[HTTP] Request with response code = %d: %s", Integer.valueOf(statusCode), reasonPhrase));
        } else {
            0fH.A0m(TAG, String.format("[HTTP] Request was successful (code = %d).", AnonymousClass001.A1a(statusCode)));
        }
        try {
            this.mHttpResponder.onResponse(statusCode, getHeader(httpResponse, "ETag"), getHeader(httpResponse, "Last-Modified"), getHeader(httpResponse, "Cache-Control"), getHeader(httpResponse, "Expires"), getHeader(httpResponse, "Retry-After"), getHeader(httpResponse, "x-rate-limit-reset"), EntityUtils.toByteArray(httpResponse.getEntity()));
            return httpResponse;
        } catch (IOException e) {
            onFailure(e);
            return httpResponse;
        }
    }
}
