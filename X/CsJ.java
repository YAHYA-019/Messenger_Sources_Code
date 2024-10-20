package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: CsJ.class */
public final class CsJ implements DIX {
    public final /* synthetic */ C1559Ald A00;

    public CsJ(C1559Ald c1559Ald) {
        this.A00 = c1559Ald;
    }

    public void BzF(View view, boolean z) {
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.Fragment, X.Ald] */
    public void CF5(CharSequence charSequence) {
        if (1JF.A0A(charSequence)) {
            return;
        }
        ?? r0 = this.A00;
        if (r0.getContext() != null) {
            String.valueOf(charSequence);
            C2T c2t = (C2T) r0.A09.get();
            AbG.A0r(c2t.A01).flowMarkPoint(c2t.A00, "search_clicked");
            r0.A07.get();
            CB7.A00(r0.getContext(), r0.A04, String.valueOf(charSequence), "thread_settings", (String) null, (String) null);
            View view = r0.mView;
            if (view != null) {
                AbO.A0O(view, (C1559Ald) r0);
            }
        }
    }

    public void CJd(CharSequence charSequence) {
        this.A00.A05 = 1JF.A0A(charSequence) ? null : String.valueOf(charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Ald] */
    public void onBackPressed() {
        ?? r0 = this.A00;
        View view = r0.mView;
        if (view != null) {
            C1559Ald.A03(r0);
            AbO.A0O(view, (C1559Ald) r0);
            View view2 = r0.mView;
            if (view2 != null) {
                InputMethodManager A06 = AbI.A06(r0.requireContext());
                if (A06 != null) {
                    7zR.A12(view2, A06);
                }
                view2.requestFocus();
            }
        }
    }
}
