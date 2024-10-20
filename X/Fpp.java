package X;

import android.content.Context;
import com.facebook.quicksilver.common.sharing.InstantGameImageShareMedia;
import com.facebook.quicksilver.webviewservice.QuicksilverWebviewService;

/* loaded from: Fpp.class */
public final class Fpp implements GIX {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ QuicksilverWebviewService A01;
    public final /* synthetic */ String A02;

    public Fpp(Context context, QuicksilverWebviewService quicksilverWebviewService, String str) {
        this.A01 = quicksilverWebviewService;
        this.A00 = context;
        this.A02 = str;
    }

    private void A00(String str, Throwable th) {
        QuicksilverWebviewService quicksilverWebviewService = this.A01;
        C00i c00i = quicksilverWebviewService.A0Q;
        if (c00i == null || c00i.get() == null) {
            return;
        }
        DKG.A0q(quicksilverWebviewService).A0I("share_link_data_fetch_error", str, th);
    }

    public void COf(Dkb dkb) {
        C00i c00i;
        if (dkb.A0u() == null) {
            A00("Error fetching shareable link", AbF.A1D("Empty share link graphql response"));
            QuicksilverWebviewService quicksilverWebviewService = this.A01;
            QuicksilverWebviewService.A04(quicksilverWebviewService, QuicksilverWebviewService.A01(quicksilverWebviewService));
            return;
        }
        C2241Dhx A0u = dkb.A0u();
        QuicksilverWebviewService quicksilverWebviewService2 = this.A01;
        QuicksilverWebviewService.A04(quicksilverWebviewService2, A0u.A0r(1500913996));
        String A0k = A0u.A0k();
        if (A0k == null || (c00i = quicksilverWebviewService2.A0P) == null || c00i.get() == null || quicksilverWebviewService2.A0j == null) {
            A00("Error updating the share link image after creation", AbF.A1D("A required value was empty"));
        } else {
            ((Ezm) quicksilverWebviewService2.A0P.get()).A03(A0k, ((InstantGameImageShareMedia) quicksilverWebviewService2.A0j.A00).A00);
        }
    }

    public void onFailure(Throwable th) {
        A00("Error fetching share link data from graphql", th);
        QuicksilverWebviewService quicksilverWebviewService = this.A01;
        QuicksilverWebviewService.A04(quicksilverWebviewService, QuicksilverWebviewService.A01(quicksilverWebviewService));
    }
}
