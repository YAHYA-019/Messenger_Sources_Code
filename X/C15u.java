package X;

import android.util.Base64;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.15u, reason: invalid class name */
/* loaded from: 15u.class */
public final class C15u {
    public final C15v A00;
    public final String A01;
    public final String A02;

    public C15u(C15v c15v, String str, String str2) {
        this.A01 = str;
        this.A00 = c15v;
        this.A02 = str2;
    }

    public int A00(String str) {
        String str2;
        String str3;
        DataOutputStream dataOutputStream;
        StringBuilder A0k;
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("format", "json");
        A0u.put("access_token", this.A01);
        if (str == null) {
            try {
                0fH.A0n("AnalyticsHttpClient", "Json data cannot be null");
            } catch (IOException e) {
                0fH.A0s("AnalyticsHttpClient", "Unable to compress message to Json object, using original message", e);
                A0u.put("message", str);
            }
        }
        byte[] bytes = str.getBytes("UTF-8");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        A0u.put("message", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        A0u.put("compressed", ConstantsKt.CAMERA_ID_BACK);
        C15v c15v = this.A00;
        String str4 = this.A02;
        int i = -1;
        try {
        } catch (MalformedURLException e2) {
            e = e2;
            str2 = "AnalyticsService";
            str3 = "Logging end point malformed";
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) c15v.A00.get()).openConnection();
            httpURLConnection.setConnectTimeout(LogcatReader.DEFAULT_WAIT_TIME);
            try {
                try {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestProperty(HttpRequestMultipart.CONTENT_TYPE, "application/x-www-form-urlencoded; charset=UTF-8");
                    httpURLConnection.setRequestProperty(HttpRequestMultipart.USER_AGENT, str4);
                    httpURLConnection.setRequestProperty("X-FB-HTTP-Engine", "MQTT Analytics");
                    try {
                        dataOutputStream = new DataOutputStream(0J3.A01(httpURLConnection, 133641169));
                        A0k = AnonymousClass001.A0k();
                        Iterator A0x = AnonymousClass001.A0x(A0u);
                        while (A0x.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0x);
                            if (A0k.length() != 0) {
                                A0k.append("&");
                            }
                            try {
                                A0k.append(URLEncoder.encode(AnonymousClass001.A0j(A0z), "UTF-8"));
                                A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                                A0k.append(URLEncoder.encode((String) A0z.getValue(), "UTF-8"));
                            } catch (UnsupportedEncodingException e3) {
                                0fH.A0s("AnalyticsService", "", e3);
                                dataOutputStream.close();
                                httpURLConnection.disconnect();
                                return i;
                            }
                        }
                    } catch (IOException | SecurityException e4) {
                        0fH.A0s("AnalyticsService", "Unable to create output stream", e4);
                    }
                } catch (IOException e5) {
                    0fH.A0s("AnalyticsService", "", e5);
                }
                try {
                    try {
                        dataOutputStream.writeBytes(A0k.toString());
                        dataOutputStream.flush();
                        i = httpURLConnection.getResponseCode();
                    } finally {
                        dataOutputStream.close();
                    }
                } catch (IOException e6) {
                    0fH.A0s("AnalyticsService", "Failed to write to output stream", e6);
                    dataOutputStream.close();
                    httpURLConnection.disconnect();
                    return i;
                }
                httpURLConnection.disconnect();
                return i;
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            str2 = "AnalyticsService";
            str3 = "Failed to open http connection";
            0fH.A0s(str2, str3, e);
            return -1;
        }
    }
}
