package X;

import android.content.Context;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.inject.FbInjector;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.5og, reason: invalid class name */
/* loaded from: 5og.class */
public final class C5og implements 1Ro {
    public static final String __redex_internal_original_name = "NativeCodeUsageUploadMethod";
    public final C00i A03 = new 1BQ(33032);
    public final C00i A02 = new 1BQ(16616);
    public final C00i A00 = new 1BQ(67199);
    public final C00i A01 = FbInjector.A00;

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        C5oe c5oe = (C5oe) obj;
        boolean z = false;
        if (c5oe != null) {
            z = true;
        }
        Preconditions.checkArgument(z);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("device_id", ((1H2) this.A03.get()).A02()));
        arrayList.add(new BasicNameValuePair("session_id", ((1RX) this.A00.get()).A07()));
        arrayList.add(new BasicNameValuePair("app_uptime", Long.toString(((1Od) this.A02.get()).A05() / 1000)));
        arrayList.add(new BasicNameValuePair(Property.SYMBOL_Z_ORDER_SOURCE, "IRPGO_FUNCTION_COVERAGE"));
        arrayList.add(new BasicNameValuePair(ErrorReportingConstants.APP_NAME_KEY, ((Context) this.A01.get()).getPackageName()));
        String str = c5oe.A01;
        if (str != null) {
            arrayList.add(new BasicNameValuePair("process_name", str));
        }
        final long[] jArr = c5oe.A00.A01;
        C4C4 c4c4 = new C4C4(new C5oi(jArr) { // from class: X.5oj
        }, "functionids");
        C04083zw c04083zw = new C04083zw();
        c04083zw.A0D = "uploadClassUsage";
        c04083zw.A0F = "native_code_usage_data";
        c04083zw.A0E = "POST";
        c04083zw.A0J = arrayList;
        Integer num = 0S2.A01;
        c04083zw.A07 = num;
        c04083zw.A0I = Collections.singletonList(c4c4);
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
        throw new UnsupportedOperationException("Method not decompiled: X.C5og.B7m(X.439, java.lang.Object):java.lang.Object");
    }
}
