package X;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

/* loaded from: G7x.class */
public final class G7x implements ResponseHandler {
    public static final G7x A00 = new Object();

    @Override // org.apache.http.client.ResponseHandler
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        String entityUtils;
        HttpEntity entity = httpResponse.getEntity();
        String str = "";
        if (entity != null && (entityUtils = EntityUtils.toString(entity, "UTF-8")) != null) {
            str = entityUtils;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        Header[] allHeaders = httpResponse.getAllHeaders();
        int length = allHeaders.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                break;
            }
            Header header = allHeaders[i3];
            A0k.append(header.getName());
            A0k.append(":");
            A0k.append(header.getValue());
            A0k.append("\n");
            i2 = i3 + 1;
        }
        StatusLine statusLine = httpResponse.getStatusLine();
        if (statusLine != null) {
            i = statusLine.getStatusCode();
        }
        return new El4(i, A0k.toString(), str);
    }
}
