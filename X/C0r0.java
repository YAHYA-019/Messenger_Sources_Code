package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0r0, reason: invalid class name */
/* loaded from: 0r0.class */
public final class C0r0 extends C15n {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;

    @Override // X.C15n
    public C15n A03(String str) {
        return this;
    }

    @Override // X.C15n
    public JSONObject A04() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            C15n.A01(this, A12);
            JSONObject A122 = AnonymousClass001.A12();
            A122.put("event", this.A07);
            A122.put("exc", this.A06);
            A122.put("actn", this.A05);
            A122.put("ctnr", super.A04);
            A122.put("scn_on", this.A09);
            A122.put("s_boot", this.A00);
            A122.put("s_mqtt", this.A01);
            A122.put("s_net", this.A02);
            A122.put("s_scn", this.A03);
            A122.put("s_svc", this.A04);
            C15n.A02(this, A122, this.A08);
            A12.put("extra", A122);
            return A12;
        } catch (JSONException e) {
            0fH.A0v("FbnsServiceLifecycleEvent", "Failed to serialize", e);
            return A12;
        }
    }
}
