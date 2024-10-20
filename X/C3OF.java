package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3OF, reason: invalid class name */
/* loaded from: 3OF.class */
public final class C3OF {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final java.util.Map A06 = Collections.synchronizedMap(AnonymousClass001.A0u());
    public final List A07;
    public final List A08;
    public final java.util.Map A09;

    public C3OF(String str, String str2, String str3, List list, List list2, java.util.Map map, int i, int i2, long j) {
        this.A01 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = j;
        this.A00 = i2;
        this.A09 = map;
        this.A07 = list;
        this.A08 = list2;
        this.A05 = str3;
    }

    public JSONObject A00() {
        JSONObject A12 = AnonymousClass001.A12();
        int i = 0;
        while (true) {
            List list = this.A07;
            if (i >= list.size()) {
                break;
            }
            A12.put(1BK.A14(list, i), list.get(i + 1));
            i += 2;
        }
        JSONObject A122 = AnonymousClass001.A12();
        java.util.Map map = this.A09;
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            String A0i = AnonymousClass001.A0i(A1B);
            A122.put(A0i, map.get(A0i));
        }
        JSONObject A123 = AnonymousClass001.A12();
        java.util.Map map2 = this.A06;
        Iterator A1B2 = 1BK.A1B(map2);
        while (A1B2.hasNext()) {
            String A0i2 = AnonymousClass001.A0i(A1B2);
            A123.put(A0i2, map2.get(A0i2));
        }
        JSONObject A124 = AnonymousClass001.A12();
        A124.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A01);
        A124.put("event", this.A04);
        A124.put("action", this.A03);
        A124.put("timestamp", this.A02);
        A124.put("duration", this.A00);
        A124.put("metadata", A122);
        A124.put("points", A123);
        A124.put("tags", this.A08);
        A124.put("extra", A12);
        A124.put(AnonymousClass000.A00(271), this.A05);
        return A124;
    }
}
