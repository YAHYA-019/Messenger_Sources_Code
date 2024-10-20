package X;

import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import java.util.HashMap;

/* loaded from: Kqh.class */
public class Kqh {
    public String A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final transient String A07;

    public Kqh(Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        11T.A0F(str2, 4);
        this.A06 = str;
        this.A01 = i;
        this.A02 = num;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = str5;
        this.A03 = str4 != null ? KXQ.A00(str4) : null;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw 1BK.A0g();
        }
        this.A07 = KXB.A00(i);
    }

    public HashMap A00() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, this.A06);
        String str = this.A07;
        if (str != null) {
            A0u.put("media_type", str);
        }
        A0u.put("source_type", this.A04);
        A0u.put("is_native_resizing", this.A05);
        String A00 = KXA.A00(this.A02);
        if (!11T.A0O(A00, "none")) {
            A0u.put("upload_method", A00);
        }
        String str2 = this.A03;
        if (str2 != null) {
            A0u.put("asset_id", str2);
        }
        return A0u;
    }
}
