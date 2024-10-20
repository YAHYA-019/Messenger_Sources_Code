package com.facebook.msys.mci;

import X.0fH;
import X.1XV;
import X.C1iw;
import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.UrlResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* loaded from: NetworkUtils.class */
public class NetworkUtils {
    public static final NetworkUtils $redex_init_class = null;

    static {
        1XV.A00();
    }

    public static Map flattenHeaders(Header[] headerArr) {
        HashMap hashMap = new HashMap();
        int length = headerArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return hashMap;
            }
            Header header = headerArr[i2];
            hashMap.put(header.getName(), header.getValue());
            i = i2 + 1;
        }
    }

    public static native String getMqttSandboxDomain();

    public static native String getSandboxDomain();

    public static void markDataTaskCompleted(final DataTask dataTask, final NetworkSession networkSession, final UrlResponse urlResponse, final String str, final byte[] bArr, final File file, final IOException iOException) {
        String str2 = dataTask.mTaskIdentifier;
        if (bArr == null) {
            0fH.A0h(str2, str, "markDataTaskCompletedInExecution, id=%s");
        } else {
            0fH.A0e(str2, Integer.valueOf(bArr.length), str, "markDataTaskCompletedInExecution, id=%s, bytes=%d");
        }
        Execution.executeAsync(new C1iw() { // from class: X.4ul
            public static final String __redex_internal_original_name = "NetworkUtils$3";

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("markDataTaskCompleted");
            }

            @Override // java.lang.Runnable
            public void run() {
                File file2;
                DataTask dataTask2 = DataTask.this;
                String str3 = dataTask2.mTaskCategory;
                String str4 = dataTask2.mTaskIdentifier;
                int i = dataTask2.mTaskType;
                try {
                    try {
                        NetworkSession networkSession2 = networkSession;
                        UrlResponse urlResponse2 = urlResponse;
                        byte[] bArr2 = bArr;
                        file2 = file;
                        networkSession2.markDataTaskAsCompletedCallback(str3, str4, i, urlResponse2, bArr2, file2 != null ? file2.getCanonicalPath() : null, iOException);
                    } catch (IOException e) {
                        0fH.A0r(str, "IOException while executing markDataTaskCompleted", e);
                        networkSession.markDataTaskAsCompletedCallback(str3, str4, i, urlResponse, bArr, null, e);
                        file2 = file;
                    }
                    if (file2 != null) {
                        file2.delete();
                    }
                } catch (Throwable th) {
                    File file3 = file;
                    if (file3 != null) {
                        file3.delete();
                    }
                    throw th;
                }
            }
        }, null, 3);
    }

    public static UrlResponse newErrorURLResponse(UrlRequest urlRequest) {
        UrlResponse urlResponse = UrlResponse.$redex_init_class;
        return new UrlResponse(urlRequest, 0, new HashMap());
    }

    public static native synchronized void setMqttSandboxDomain(String str);

    public static native synchronized void setSandboxDomain(String str);
}
