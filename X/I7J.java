package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: I7J.class */
public final class I7J {
    public String A00;
    public boolean A01;
    public final 04J A02;
    public final String A03;

    public I7J(04J r302, String str, String str2) {
        7zR.A1N(r302, str2);
        this.A02 = r302;
        this.A03 = str;
        this.A00 = str2;
    }

    public static void A00(1UG r301, I7J i7j) {
        r301.A7R("entry_point", i7j.A03);
        r301.A7R("media_type", i7j.A00);
        r301.A6H("position", (Long) null);
    }

    public static final void A01(I7J i7j) {
        i7j.A00 = "PHOTO";
        if (!i7j.A01) {
            i7j.A01 = true;
            return;
        }
        1UG A08 = 1BK.A08(i7j.A02, 1BJ.A00(1966));
        if (A08.isSampled()) {
            A08.A7R("error_message", (String) null);
            A08.A6H(TraceFieldType.ErrorCode, (Long) null);
            A08.A7R("connection_quality", (String) null);
            A08.A5c((C07n) null, "source_click_category");
            A00(A08, i7j);
            A08.A6H("duration", (Long) null);
            A08.BZL();
        }
    }
}
