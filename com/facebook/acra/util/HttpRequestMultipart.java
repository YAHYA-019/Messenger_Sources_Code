package com.facebook.acra.util;

import X.0J3;
import X.0J4;
import X.AnonymousClass001;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;

/* loaded from: HttpRequestMultipart.class */
public class HttpRequestMultipart {
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_DISPOSITION_FILE = "form-data; filename=\"file\"; name=";
    public static final String CONTENT_DISPOSITION_FORM_DATA = "form-data; name=";
    public static final String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";
    public static final String CONTENT_TRANSFER_ENCODING_BINARY = "binary";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_TYPE_APP_BINARY = "application/binary";
    public static final String CONTENT_TYPE_FORM_MULTIPART_FORMAT = "multipart/form-data;boundary=%s";
    public static final String LINE_FEED = "\r\n";
    public static final int STREAM_BLOCK_SIZE = 8192;
    public static final String USER_AGENT = "User-Agent";
    public HttpConnectionProvider mConnectionProvider;
    public Map mHeaders;

    public HttpRequestMultipart(HttpConnectionProvider httpConnectionProvider) {
        this.mConnectionProvider = httpConnectionProvider;
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static String generateBoundary() {
        return UUID.randomUUID().toString();
    }

    public static byte[] generateMultipartEndFooter(String str) {
        return String.format("--%s--\r\n", str).getBytes();
    }

    public static byte[] generateMultipartHeader(String str, String str2, String str3) {
        return String.format("--%s\r\nContent-Disposition: %s\"%s\"\r\nContent-Type: application/binary\r\nContent-Transfer-Encoding: binary\r\n\r\n", str, str2, str3).getBytes();
    }

    public static void writeAcraData(String str, OutputStream outputStream, String str2, Map map) {
        outputStream.write(generateMultipartHeader(str2, CONTENT_DISPOSITION_FORM_DATA, str));
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        HttpRequest.encodeParameters(map, gZIPOutputStream);
        gZIPOutputStream.finish();
        outputStream.write(LINE_FEED.getBytes());
    }

    public void sendPost(URL url, Map map, Map map2, ACRAResponse aCRAResponse, String str, OutputStreamFactory outputStreamFactory) {
        HttpURLConnection connection = this.mConnectionProvider.getConnection(url);
        String obj = UUID.randomUUID().toString();
        connection.setRequestMethod("POST");
        connection.setRequestProperty(USER_AGENT, str);
        connection.setRequestProperty(CONTENT_TYPE, String.format(CONTENT_TYPE_FORM_MULTIPART_FORMAT, obj));
        Map map3 = this.mHeaders;
        if (map3 != null && !map3.isEmpty()) {
            Iterator A0y = AnonymousClass001.A0y(this.mHeaders);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                connection.setRequestProperty(A0z.getKey().toString(), A0z.getValue().toString());
            }
        }
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        try {
            0J4 A01 = 0J3.A01(connection, -143279943);
            try {
                OutputStream createOutputDecorator = AcraRadioMonitorBridge.createOutputDecorator(A01);
                writeAcraData("acra_data", createOutputDecorator, obj, map);
                Iterator A0y2 = AnonymousClass001.A0y(map2);
                while (A0y2.hasNext()) {
                    Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
                    InputStreamField inputStreamField = (InputStreamField) A0z2.getValue();
                    boolean z = inputStreamField.mSendCompressed;
                    createOutputDecorator.write(generateMultipartHeader(obj, inputStreamField.mSendAsAFile ? CONTENT_DISPOSITION_FILE : CONTENT_DISPOSITION_FORM_DATA, A0z2.getKey().toString()));
                    OutputStream create = outputStreamFactory.create(createOutputDecorator);
                    copyStream(inputStreamField.mInputStream, create);
                    if (z) {
                        outputStreamFactory.finish(create);
                    }
                    createOutputDecorator.write(LINE_FEED.getBytes());
                }
                createOutputDecorator.write(generateMultipartEndFooter(obj));
                createOutputDecorator.flush();
                aCRAResponse.mStatus = connection.getResponseCode();
                0J3.A00(connection, -1179941204).close();
                A01.close();
            } finally {
            }
        } finally {
            connection.disconnect();
        }
    }

    public void setHeaders(Map map) {
        this.mHeaders = map;
    }
}
