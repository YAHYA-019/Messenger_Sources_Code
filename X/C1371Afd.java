package X;

import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.Afd, reason: case insensitive filesystem */
/* loaded from: Afd.class */
public final class C1371Afd extends 2O4 {
    public final int A00;

    public C1371Afd(int i) {
        this.A00 = i;
    }

    public void A06(RecyclerView recyclerView, int i) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                if (i != 0) {
                    InputMethodManager A06 = AbI.A06(recyclerView.getContext());
                    if (A06 != null) {
                        7zR.A12(recyclerView, A06);
                    }
                    recyclerView.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
                    recyclerView.requestFocus();
                    return;
                }
                return;
            default:
                super.A06(recyclerView, i);
                return;
        }
    }
}
