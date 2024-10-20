package X;

import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Abi, reason: case insensitive filesystem */
/* loaded from: Abi.class */
public final class C1240Abi {
    public 0EW A00;
    public final 1Br A01 = AbG.A0M();
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;

    public C1240Abi() {
        0EV r0 = new 0EV();
        r0.A01 = 02P.A00();
        r0.A00 |= 16;
        this.A00 = r0.A00();
        this.A02 = 1BK.A0D();
        this.A03 = 1Bu.A00(66592);
        this.A04 = 1BK.A0C();
    }

    public static final void A00(Brh brh, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NameValuePair nameValuePair = (NameValuePair) it.next();
            if ("ref".equals(nameValuePair.getName())) {
                brh.A00 = nameValuePair.getValue();
            } else if ("ref_source".equals(nameValuePair.getName()) || Property.SYMBOL_Z_ORDER_SOURCE.equals(nameValuePair.getName())) {
                brh.A01 = nameValuePair.getValue();
            } else if ("source_id".equals(nameValuePair.getName())) {
                brh.A02 = nameValuePair.getValue();
            } else if ("metadata".equals(nameValuePair.getName())) {
                try {
                    String value = nameValuePair.getValue();
                    11T.A0A(value);
                    JSONObject jSONObject = new JSONObject(0CV.A0W(value, "\\", ""));
                    if (jSONObject.has("referer_uri")) {
                        brh.A03 = jSONObject.getString("referer_uri");
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x011c, code lost:
    
        if (X.1BK.A0M(r0).AZk(36320906334715677L) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x07a6, code lost:
    
        r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x02c0, code lost:
    
        r0 = r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02cb, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0318, code lost:
    
        if (r0.length() == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x031f, code lost:
    
        if (r304 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0322, code lost:
    
        r0.A0F = r0;
        r0.A07 = r304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x049d, code lost:
    
        if (r314.length() != 0) goto L143;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Abh] */
    /* JADX WARN: Type inference failed for: r0v362, types: [java.lang.Object, X.Brh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams A01(android.content.Context r302, android.content.Intent r303, com.facebook.messaging.model.threadkey.ThreadKey r304) {
        /*
            Method dump skipped, instructions count: 2122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1240Abi.A01(android.content.Context, android.content.Intent, com.facebook.messaging.model.threadkey.ThreadKey):com.facebook.messaging.threadview.params.ThreadViewMessagesInitParams");
    }
}
