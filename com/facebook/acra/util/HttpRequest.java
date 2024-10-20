package com.facebook.acra.util;

import X.0J3;
import X.AnonymousClass001;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: HttpRequest.class */
public class HttpRequest {
    public static final int CHAR_ARRAY_BUFFER_SIZE = 256;
    public static final String POST_CONTENT_TYPE_FORM_URLENCODED = "application/x-www-form-urlencoded";
    public HttpConnectionProvider mConnectionProvider;
    public Map mHeaders;

    public HttpRequest(HttpConnectionProvider httpConnectionProvider) {
        this.mConnectionProvider = httpConnectionProvider;
    }

    public static void encodeParameters(Map map, OutputStream outputStream) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        UrlEncodingWriter urlEncodingWriter = new UrlEncodingWriter(bufferedWriter);
        Iterator A0y = AnonymousClass001.A0y(map);
        boolean z = true;
        while (true) {
            boolean z2 = z;
            if (!A0y.hasNext()) {
                bufferedWriter.flush();
                return;
            }
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            if (!z2) {
                bufferedWriter.append('&');
            }
            Object value = A0z.getValue();
            if (value == null) {
                value = "";
            }
            urlEncodingWriter.write(key.toString());
            bufferedWriter.write(61);
            if (value instanceof InputStream) {
                transferData((InputStream) value, urlEncodingWriter);
            } else {
                urlEncodingWriter.write(value.toString());
            }
            z = false;
        }
    }

    public static boolean transferData(InputStream inputStream, Writer writer) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[256];
        while (true) {
            try {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    return true;
                }
                writer.write(cArr, 0, read);
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public void sendPost(URL url, Map map, ACRAResponse aCRAResponse, String str) {
        HttpURLConnection connection = this.mConnectionProvider.getConnection(url);
        connection.setRequestMethod("POST");
        connection.setRequestProperty(HttpRequestMultipart.USER_AGENT, str);
        connection.setRequestProperty(HttpRequestMultipart.CONTENT_TYPE, POST_CONTENT_TYPE_FORM_URLENCODED);
        connection.setRequestProperty("Content-Encoding", "gzip");
        Map map2 = this.mHeaders;
        if (map2 != null && !map2.isEmpty()) {
            Iterator A0y = AnonymousClass001.A0y(this.mHeaders);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                connection.setRequestProperty(A0z.getKey().toString(), A0z.getValue().toString());
            }
        }
        connection.setDoOutput(true);
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(AcraRadioMonitorBridge.createOutputDecorator(0J3.A01(connection, -2122006138)));
            encodeParameters(map, gZIPOutputStream);
            gZIPOutputStream.close();
            aCRAResponse.mStatus = connection.getResponseCode();
            0J3.A00(connection, -1267551549).close();
        } finally {
            connection.disconnect();
        }
    }

    public void setHeaders(Map map) {
        this.mHeaders = map;
    }
}
