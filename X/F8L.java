package X;

/* loaded from: F8L.class */
public final class F8L {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final 1Br A07 = 1BK.A0D();

    public static F8L A00(C00i c00i, Object obj) {
        ((F8L) c00i.get()).A04 = obj.toString();
        return (F8L) c00i.get();
    }

    public final void A01(String str, String str2) {
        int length;
        1UG A08 = 1BK.A08(1Br.A02(this.A07), "pii_action_flow");
        if (A08.isSampled()) {
            A08.A7R("event_name", str);
            A08.A7R("page_id", this.A03);
            A08.A7R("user_id", this.A06);
            A08.A7R("form_id", this.A02);
            2DM A0f = 4YU.A0f();
            if (str2 != null && str2.length() != 0) {
                A0f.A0o("exception_string", str2);
            }
            String str3 = this.A04;
            if (str3 != null && (length = str3.length()) != 0) {
                A0f.A0i(1BJ.A00(530), length);
            }
            A0f.A0i("question_list_size", this.A00);
            A0f.A0i(AbstractC00603o4.A00(625), this.A01);
            String str4 = this.A05;
            if (str4 != null && str4.length() != 0) {
                A0f.A0o("response_status_key", str4);
            }
            String obj = A0f.toString();
            if (obj != null) {
                A08.A7R("extra_data", obj);
            }
            A08.BZL();
        }
    }
}
