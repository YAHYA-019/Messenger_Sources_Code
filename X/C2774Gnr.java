package X;

import android.view.View;
import com.facebook.resources.ui.FbImageButton;

/* renamed from: X.Gnr, reason: case insensitive filesystem */
/* loaded from: Gnr.class */
public final class C2774Gnr extends GoC implements JD1, JFH {
    public final /* synthetic */ C2770Gnn A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2774Gnr(View view, C2770Gnn c2770Gnn) {
        super(c2770Gnn, (FbImageButton) C09s.A01(view, 2131365374));
        this.A00 = c2770Gnn;
        c2770Gnn.A07.A02.add(this);
        c2770Gnn.A08.A05.add(this);
        C2rp.A02(((GoC) this).A01, 0S2.A06);
        A00(this);
    }

    public static void A00(C2774Gnr c2774Gnr) {
        FbImageButton fbImageButton = ((GoC) c2774Gnr).A01;
        Htr htr = c2774Gnr.A00.A08;
        fbImageButton.setSelected(htr.A02);
        int i = 2131960642;
        if (htr.A02) {
            i = 2131960643;
        }
        GOn.A1N(fbImageButton.getResources(), fbImageButton, i);
    }

    public void BmP() {
        C2770Gnn c2770Gnn = this.A00;
        C2770Gnn.A02(c2770Gnn, c2770Gnn.A0C(), c2770Gnn.A0D());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r0.A02 != true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r302) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2774Gnr.onClick(android.view.View):void");
    }
}
