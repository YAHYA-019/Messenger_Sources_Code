package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.resources.ui.FbImageButton;

/* renamed from: X.Gnq, reason: case insensitive filesystem */
/* loaded from: Gnq.class */
public final class C2773Gnq extends GoC {
    public final /* synthetic */ C2770Gnn A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2773Gnq(View view, C2770Gnn c2770Gnn) {
        super(c2770Gnn, (FbImageButton) C09s.A01(view, 2131364152));
        this.A00 = c2770Gnn;
        c2770Gnn.A08.A05.add(this);
        C2rp.A02(((GoC) this).A01, 0S2.A06);
        A00(this);
    }

    public static void A00(C2773Gnq c2773Gnq) {
        HAP hap = c2773Gnq.A00.A08.A00;
        FbImageButton fbImageButton = ((GoC) c2773Gnq).A01;
        HAP hap2 = HAP.A04;
        fbImageButton.setSelected(AnonymousClass001.A1W(hap, hap2));
        Resources resources = fbImageButton.getResources();
        int i = 2131960637;
        if (hap == hap2) {
            i = 2131960638;
        }
        GOn.A1N(resources, fbImageButton, i);
    }

    public void onClick(View view) {
        int A05 = 0FI.A05(-948481493);
        Htr htr = this.A00.A08;
        HAP hap = htr.A00;
        HAP hap2 = HAP.A04;
        if (hap == hap2) {
            hap2 = HAP.A03;
        }
        htr.A00 = hap2;
        for (GoB goB : htr.A05) {
            if (goB instanceof GoB) {
                ICU icu = goB.A00;
                if (icu.A07) {
                    ICU.A01(icu);
                }
            } else if (goB instanceof C2773Gnq) {
                A00((C2773Gnq) goB);
            } else if (goB instanceof C2789Go6) {
                C2770Gnn.A00(((C2789Go6) goB).A00);
            }
        }
        0FI.A0B(633406878, A05);
    }
}
