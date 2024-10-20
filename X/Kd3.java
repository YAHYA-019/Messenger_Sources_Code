package X;

import com.google.android.gms.common.Feature;

/* loaded from: Kd3.class */
public abstract class Kd3 {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature[] A04;

    static {
        long j = 2;
        Feature A0g = JQx.A0g("sms_code_autofill", j);
        A00 = A0g;
        Feature A0g2 = JQx.A0g("sms_code_browser", j);
        A01 = A0g2;
        Feature A0g3 = JQx.A0g("sms_retrieve", 1L);
        A02 = A0g3;
        Feature A0g4 = JQx.A0g("user_consent", 3);
        A03 = A0g4;
        A04 = new Feature[]{A0g, A0g2, A0g3, A0g4};
    }
}
