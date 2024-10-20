package X;

import android.content.Context;
import com.facebook.common.banner.BasicBannerNotificationView;

/* renamed from: X.3Vb, reason: invalid class name */
/* loaded from: 3Vb.class */
public final class C3Vb implements 3lL {
    public final /* synthetic */ BasicBannerNotificationView A00;
    public final /* synthetic */ 2Ps A01;

    public C3Vb(BasicBannerNotificationView basicBannerNotificationView, 2Ps r303) {
        this.A01 = r303;
        this.A00 = basicBannerNotificationView;
    }

    public final void Bkp(int i) {
        9R9 r0 = (9R9) 1Br.A0B(this.A01.A02);
        1UG A08 = 1BK.A08(1Br.A02(r0.A01), "messenger_business_high_messages_per_second_status_banner_click");
        if (A08.isSampled()) {
            1UG.A02(A08, "business_high_messages_per_second");
            1UG.A01(new 0DA(), A08);
            1UG.A04(A08, r0.A02);
        }
        Context context = this.A00.getContext();
        11T.A0A(context);
        R12.A00(context);
    }
}
