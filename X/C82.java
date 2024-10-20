package X;

/* loaded from: C82.class */
public final class C82 {
    public final 2R2 A00;
    public final C0dr A01;
    public final String A02;
    public final String A03;
    public final java.util.Map A04;

    public C82(2R2 r302, C0dr c0dr, String str, String str2) {
        11T.A0F(c0dr, 1);
        this.A01 = c0dr;
        this.A00 = r302;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = 1BK.A1C();
    }

    public void A00() {
        2R2 r0 = this.A00;
        if (4YU.A1X(r0)) {
            String str = this.A03;
            if (!0CU.A0O(str)) {
                this.A04.put("funnel_session_id", str);
            }
            r0.A0E("sub_event", this.A02);
            r0.A0E("video_call_link_hash", (String) null);
            r0.A0D("event_fire_timestamp_on_client", AbH.A13(this.A01));
            ((0D7) r0).A00.A6J("annotations", this.A04);
            r0.BZL();
        }
    }

    public void A01(String str, String str2) {
        11T.A0F(str2, 1);
        this.A04.put(str, str2);
    }
}
