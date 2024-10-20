package X;

import android.app.Dialog;
import android.view.Window;
import androidx.fragment.app.Fragment;

/* loaded from: C8t.class */
public final class C8t {
    public final Bwz A00;
    public final C01i A01 = DCz.A00(this, 29);

    public C8t(Bwz bwz) {
        this.A00 = bwz;
    }

    public final void A00() {
        C01i c01i = this.A01;
        if (!((Fragment) c01i.getValue()).isAdded() || ((Fragment) c01i.getValue()).isStateSaved()) {
            return;
        }
        7zL.A1Q(c01i.getValue());
    }

    public final void A01() {
        Window window;
        Dialog dialog = ((0D2) this.A01.getValue()).A01;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setFlags(1024, 1024);
    }

    public final void A02() {
        06Z r0 = this.A00.A06;
        if (r0.A1U()) {
            return;
        }
        ((0D2) this.A01.getValue()).A0m(r0, "bottom_sheet_fragment_tag");
    }
}
