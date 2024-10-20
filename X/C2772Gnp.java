package X;

import android.view.View;
import com.facebook.resources.ui.FbImageButton;

/* renamed from: X.Gnp, reason: case insensitive filesystem */
/* loaded from: Gnp.class */
public final class C2772Gnp extends GoC {
    public final /* synthetic */ C2770Gnn A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2772Gnp(View view, C2770Gnn c2770Gnn) {
        super(c2770Gnn, (FbImageButton) C09s.A01(view, 2131364163));
        this.A00 = c2770Gnn;
    }

    public void onClick(View view) {
        int i;
        int A05 = 0FI.A05(1964992799);
        C2770Gnn c2770Gnn = this.A00;
        int i2 = c2770Gnn.A0A.A00;
        if (i2 == 1 || i2 == 2) {
            i = 1446407307;
        } else {
            c2770Gnn.A08.A00(!r0.A01);
            i = 1675657278;
        }
        0FI.A0B(i, A05);
    }
}
