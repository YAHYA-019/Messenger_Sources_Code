package X;

import com.google.android.gms.common.Feature;

/* loaded from: Kd5.class */
public abstract class Kd5 {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature[] A02;
    public static final Feature A03;
    public static final Feature A04;

    static {
        Feature A0g = JQx.A0g("name_ulr_private", 1L);
        A03 = A0g;
        Feature A0g2 = JQx.A0g("name_sleep_segment_request", 1L);
        A04 = A0g2;
        Feature A0g3 = JQx.A0g("support_context_feature_id", 1L);
        A00 = A0g3;
        Feature A0g4 = JQx.A0g("get_current_location", 1L);
        A01 = A0g4;
        A02 = new Feature[]{A0g, A0g2, A0g3, A0g4};
    }
}
