package X;

import com.facebook.common.callercontext.CallerContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: Fjv.class */
public final class Fjv implements 4LT {
    public final /* synthetic */ Fci A00;

    public Fjv(Fci fci) {
        this.A00 = fci;
    }

    public void BzG(boolean z) {
        if (z) {
            Fci fci = this.A00;
            CallerContext callerContext = Fci.A0f;
            BottomSheetBehavior bottomSheetBehavior = fci.A0F;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0B(3);
            }
            if (fci.A0K) {
                return;
            }
            fci.A0K = true;
            fci.A0C.A01(fci.A08, fci.A0H, fci.A09 == EKz.A03 ? "overreact_search" : "custom_react_search", "emoji_search_tap", (String) null, (String) null, Fci.A01(fci), (java.util.Map) null);
        }
    }
}
