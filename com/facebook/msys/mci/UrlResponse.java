package com.facebook.msys.mci;

import X.1XV;
import android.util.Pair;
import com.facebook.simplejni.NativeHolder;
import java.util.Iterator;
import java.util.Map;

/* loaded from: UrlResponse.class */
public class UrlResponse {
    public static final UrlResponse $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    static {
        1XV.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UrlResponse(UrlRequest urlRequest, int i, Map map) {
        urlRequest.getClass();
        NetworkUtils networkUtils = NetworkUtils.$redex_init_class;
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        Iterator it = map.entrySet().iterator();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                Pair pair = new Pair(strArr, strArr2);
                this.mNativeHolder = initNativeHolder(urlRequest, i, (String[]) pair.first, (String[]) pair.second);
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                strArr[i3] = entry.getKey();
                strArr2[i3] = entry.getValue();
                i2 = i3 + 1;
            }
        }
    }

    public static native NativeHolder initNativeHolder(UrlRequest urlRequest, int i, String[] strArr, String[] strArr2);
}
