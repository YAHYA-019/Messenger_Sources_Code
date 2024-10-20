package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: HTTPClientResponseHandler.class */
public class HTTPClientResponseHandler implements ResponseHandler {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.cameracore.mediapipeline.services.networking.interfaces.HTTPResponse, java.lang.Object] */
    @Override // org.apache.http.client.ResponseHandler
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        String[] strArr;
        ?? obj = new Object();
        ((HTTPResponse) obj).statusCode = httpResponse.getStatusLine().getStatusCode();
        Header[] allHeaders = httpResponse.getAllHeaders();
        if (allHeaders == null) {
            ((HTTPResponse) obj).headerNames = new String[0];
            strArr = new String[0];
        } else {
            int length = allHeaders.length;
            String[] strArr2 = new String[length];
            strArr = new String[length];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                strArr2[i2] = allHeaders[i2].getName();
                strArr[i2] = allHeaders[i2].getValue();
                i = i2 + 1;
            }
            ((HTTPResponse) obj).headerNames = strArr2;
        }
        ((HTTPResponse) obj).headerValues = strArr;
        InputStream content = httpResponse.getEntity().getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = content.read(bArr, 0, 1024);
            if (read == -1) {
                byteArrayOutputStream.flush();
                content.close();
                ((HTTPResponse) obj).content = byteArrayOutputStream.toByteArray();
                return (Object) obj;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
