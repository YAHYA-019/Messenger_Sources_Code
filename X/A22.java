package X;

import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;

/* loaded from: A22.class */
public final class A22 implements AaC {
    public final /* synthetic */ 8uM A00;

    public A22(8uM r302) {
        this.A00 = r302;
    }

    @Override // X.AaC
    public void C0j(int i) {
        Window window;
        8uM r0 = this.A00;
        if (r0.A0E) {
            if (!r0.A0F) {
                7zU.A1P(r0);
            }
            7zT.A1A(r0);
            LinearLayout linearLayout = r0.A03;
            if (linearLayout != null) {
                linearLayout.setPadding(0, 0, 0, 0);
            }
            FbRelativeLayout fbRelativeLayout = r0.A0C;
            if (fbRelativeLayout != null) {
                fbRelativeLayout.setPadding(0, 0, 0, 0);
            }
        } else {
            r0.A1e();
            8uM.A03(r0);
            FragmentActivity activity = r0.getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(32);
            }
            LinearLayout linearLayout2 = r0.A03;
            if (linearLayout2 != null) {
                linearLayout2.setPadding(0, 0, 0, i);
            }
            FbRelativeLayout fbRelativeLayout2 = r0.A0C;
            if (fbRelativeLayout2 != null) {
                fbRelativeLayout2.setPadding(0, 0, 0, i);
            }
        }
        r0.A0E = !r0.A0E;
    }

    @Override // X.AaC
    public void CFO(8K0 r302, String str) {
    }

    @Override // X.AaC
    public void CGf() {
        String str;
        8uM r0 = this.A00;
        9Yr r02 = r0.A0B;
        if (r02 == null) {
            str = "seenStateOperator";
        } else {
            RichStatus richStatus = r0.A09;
            if (richStatus == null) {
                str = "paramRichStatus";
            } else {
                long j = richStatus.A04;
                C03513yC c03513yC = r0.A0A;
                if (c03513yC != null) {
                    r02.A00(j, c03513yC.A00, 2);
                    return;
                }
                str = "notesLogger";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
