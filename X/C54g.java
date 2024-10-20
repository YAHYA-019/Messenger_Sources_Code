package X;

import com.facebook.sync.analytics.FullRefreshReason;

/* renamed from: X.54g, reason: invalid class name */
/* loaded from: 54g.class */
public final class C54g {
    public final C00i A04 = new 1BQ(16772);
    public final C00i A01 = new 1BQ(99390);
    public final 20A A03 = (20A) 1Bi.A03(100043);
    public final C00i A00 = new 1BQ(16782);
    public final C00i A02 = new 1BQ(16634);

    public void A00(2Jy r302, BLy bLy) {
        r302.A09(bLy, "queue_type");
        r302.A0D("pigeon_reserved_keyword_module", "android_sync");
        8EW.A00((C1kw) this.A04.get()).A03(r302);
    }

    public void A01(FullRefreshReason fullRefreshReason, BLy bLy) {
        20A r0 = this.A03;
        C1cm c1cm = C3X7.A02;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("full_refresh (");
        A0k.append(bLy.apiString);
        r0.A04(c1cm, AnonymousClass001.A0Z(fullRefreshReason, "): ", A0k));
        2Jy A0H = 4YU.A0H(AbstractC00603o4.A00(308));
        A0H.A0D("queue_type", bLy.apiString);
        A0H.A0D("reason_type", fullRefreshReason.A00.name());
        A0H.A0D("reason_msg", fullRefreshReason.A01);
        A0H.A0D("pigeon_reserved_keyword_module", "android_sync");
        8EW.A00(1BK.A06(this.A04)).A03(A0H);
    }
}
