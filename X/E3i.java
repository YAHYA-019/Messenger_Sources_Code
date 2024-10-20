package X;

import android.app.Dialog;
import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import java.util.List;
import java.util.Stack;

/* loaded from: E3i.class */
public final class E3i extends FIJ {
    public final GL7 A00;

    public E3i(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A00 = gl7;
    }

    public void A08(FyG fyG) {
        11T.A0F(fyG, 0);
        GL7 gl7 = this.A00;
        List A0A = GL7.A0A(gl7);
        11T.A0A(A0A);
        boolean z = gl7.getBoolean(36, false);
        GL7 Ay2 = gl7.Ay2(38);
        int Acj = gl7.Acj();
        RgF.A01();
        Stack stack = RgF.A00;
        if (stack != null) {
            int i = 0;
            int size = stack.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                RLe rLe = (RLe) RgF.A00.elementAt(i);
                if (rLe.A00 == Acj) {
                    Dialog dialog = (Dialog) rLe.A02.get();
                    if (dialog != null && dialog.isShowing()) {
                        0fH.A0n("FBOpenDialogAction", "Ignoring open for shown dialog");
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
        1Iw A0W = 7zL.A0W(fyG.A00);
        ComponentTree A00 = ComponentTree.A01(FIJ.A03(Due.A06(A0W), fyG, "openDialog", A0A), A0W, null).A00();
        Context A0A2 = 7zL.A0A(A0W);
        LithoView A04 = LithoView.A04(7zL.A0W(A0A2), A00);
        Dialog dialog2 = new Dialog(A0A2, 2132607694);
        A04.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        dialog2.setContentView(A04);
        dialog2.setCancelable(!z);
        RgF.A03(dialog2, GL7.A04(gl7), gl7.Acj());
        dialog2.setOnDismissListener(Riw.A00);
        if (Ay2 != null) {
            dialog2.setOnCancelListener(new FJn(Ay2, fyG, 0));
        }
        dialog2.show();
    }
}
