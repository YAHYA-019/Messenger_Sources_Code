package X;

import android.content.Context;
import com.facebook.quicksilver.common.sharing.InstantGameImageShareMedia;
import com.facebook.quicksilver.common.sharing.InstantGameShareMedia;

/* loaded from: Fpq.class */
public final class Fpq implements GIX {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fpy A01;
    public final /* synthetic */ InstantGameShareMedia A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public Fpq(Context context, Fpy fpy, InstantGameShareMedia instantGameShareMedia, String str, String str2, String str3, String str4) {
        this.A01 = fpy;
        this.A02 = instantGameShareMedia;
        this.A00 = context;
        this.A04 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A05 = str4;
    }

    private void A00(String str, Throwable th) {
        FIT fit = this.A01.A00.A08;
        if (fit != null) {
            fit.A0I("share_link_data_fetch_error", str, th);
        }
    }

    public void COf(Dkb dkb) {
        Ezm ezm;
        if (dkb.A0u() == null) {
            A00("Error fetching shareable link", AbF.A1D("Empty share link graphql response"));
            Fpy.A00(this.A01, null, this.A03, this.A05);
            return;
        }
        C2241Dhx A0u = dkb.A0u();
        Fpy fpy = this.A01;
        String A0r = A0u.A0r(1500913996);
        InstantGameShareMedia instantGameShareMedia = this.A02;
        Fpy.A00(fpy, A0r, this.A03, this.A05);
        String A0k = A0u.A0k();
        if (A0k == null || (ezm = fpy.A00.A0D) == null) {
            A00("Error updating the share link image after creation", AbF.A1D("A required value was empty"));
        } else {
            ezm.A03(A0k, ((InstantGameImageShareMedia) instantGameShareMedia).A00);
        }
    }

    public void onFailure(Throwable th) {
        A00("Error fetching share link data from graphql", th);
        Fpy.A00(this.A01, null, this.A03, this.A05);
    }
}
