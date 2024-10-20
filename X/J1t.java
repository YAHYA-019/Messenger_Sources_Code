package X;

import com.facebook.locationsharing.core.models.LiveLocationSharer;

/* loaded from: J1t.class */
public final class J1t implements Runnable {
    public static final String __redex_internal_original_name = "LiveLocationSharingRepositoryProxy$3";
    public final /* synthetic */ JOe A00;
    public final /* synthetic */ 7Vd A01;
    public final /* synthetic */ LiveLocationSharer A02;
    public final /* synthetic */ String A03;

    public J1t(JOe jOe, 7Vd r303, LiveLocationSharer liveLocationSharer, String str) {
        this.A01 = r303;
        this.A03 = str;
        this.A02 = liveLocationSharer;
        this.A00 = jOe;
    }

    @Override // java.lang.Runnable
    public void run() {
        7Vd r0 = this.A01;
        7Vc r02 = r0.A00;
        String str = this.A03;
        r02.D8X(new RlR(this.A00, r0.A01), this.A02, str);
    }
}
