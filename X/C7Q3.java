package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.HashMap;

/* renamed from: X.7Q3, reason: invalid class name */
/* loaded from: 7Q3.class */
public final class C7Q3 {
    public final C00i A00 = 1Bi.A02(04J.class, (Class) null);
    public final C00i A02 = 1Bn.A06(1Bn.A00(), 5VU.class, (Class) null);
    public final C00i A01 = 1Bn.A09(5Zt.class, (Class) null);

    public static boolean A00(C7Q3 c7q3) {
        return 5Zt.A00((5Zt) c7q3.A01.get()).AZk(36313939898473746L);
    }

    public void A01(ThreadKey threadKey) {
        if (A00(this) && ((5VU) this.A02.get()).A03(threadKey)) {
            1UG A08 = 1BK.A08(1BK.A07(this.A00), 1BJ.A00(1896));
            if (A08.isSampled()) {
                A08.A7R("page_id", 4YU.A0z(threadKey));
                A08.BZL();
            }
        }
    }

    public void A02(ThreadKey threadKey) {
        if (A00(this) && ((5VU) this.A02.get()).A03(threadKey)) {
            1UG A08 = 1BK.A08(1BK.A07(this.A00), "page_rtc_video_button_click");
            if (A08.isSampled()) {
                A08.A7R("page_id", 4YU.A0z(threadKey));
                A08.BZL();
            }
        }
    }

    public void A03(String str, java.util.Map map) {
        if (A00(this)) {
            1UG A08 = 1BK.A08(1BK.A07(this.A00), 1BJ.A00(1902));
            if (A08.isSampled()) {
                A08.A7R("page_id", str);
                A08.A6J("extra_info", map);
                A08.BZL();
            }
        }
    }

    public void A04(String str, boolean z) {
        if (A00(this)) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("is_actor_id_null", String.valueOf(z));
            1UG A08 = 1BK.A08(1BK.A07(this.A00), 1BJ.A00(1898));
            if (A08.isSampled()) {
                A08.A7R("page_id", str);
                A08.A6J("extra_info", A0u);
                A08.BZL();
            }
        }
    }
}
