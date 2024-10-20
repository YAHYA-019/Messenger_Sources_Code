package X;

import android.content.Context;
import com.facebook.common.build.BuildConstants;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

/* renamed from: X.5od, reason: invalid class name */
/* loaded from: 5od.class */
public final class C5od implements 1Ro {
    public static final String __redex_internal_original_name = "ClassUsageUploadMethod";
    public final C00i A02 = new 1BQ(33032);
    public final C00i A00 = new 1BQ(67199);
    public final C00i A01 = FbInjector.A00;

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        C5oe c5oe = (C5oe) obj;
        c5oe.getClass();
        0P0 r0 = c5oe.A00;
        java.util.Map map = r0.A00;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("device_id", ((1H2) this.A02.get()).A02()));
        String A07 = ((1RX) this.A00.get()).A07();
        if (A07 != null) {
            arrayList.add(new BasicNameValuePair("session_id", A07));
        }
        arrayList.add(new BasicNameValuePair("package_name", ((Context) this.A01.get()).getPackageName()));
        String str = c5oe.A01;
        if (str != null) {
            arrayList.add(new BasicNameValuePair("process_name", str));
        }
        arrayList.add(new BasicNameValuePair(1BJ.A00(79), String.valueOf(BuildConstants.A01())));
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey().toString(), entry.getValue());
        }
        arrayList.add(new BasicNameValuePair("threadmap", new JSONObject(hashMap).toString()));
        final long[] jArr = r0.A01;
        C5oi c5oi = new C5oi(jArr) { // from class: X.5oh
        };
        C04083zw c04083zw = new C04083zw();
        c04083zw.A0D = "uploadClassUsage";
        c04083zw.A0F = "me/mobile_class_usages";
        c04083zw.A0E = "POST";
        c04083zw.A0J = arrayList;
        Integer num = 0S2.A01;
        c04083zw.A07 = num;
        c04083zw.A0I = Collections.singletonList(new C4C4(c5oi, "classids"));
        c04083zw.A06 = num;
        return c04083zw.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r0.A0O() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object B7m(X.AnonymousClass439 r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r302
            r0.A03()
            r0 = r302
            X.24X r0 = r0.A01()
            r304 = r0
            r0 = r304
            java.lang.String r1 = "success"
            X.24X r0 = r0.A0D(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L25
            r0 = r305
            boolean r0 = r0.A0O()
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L2b
        L25:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
        L2b:
            r0 = r307
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5od.B7m(X.439, java.lang.Object):java.lang.Object");
    }
}
