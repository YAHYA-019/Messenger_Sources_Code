package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.Af3, reason: case insensitive filesystem */
/* loaded from: Af3.class */
public final class C1361Af3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C1559Ald A00;

    public C1361Af3(C1559Ald c1559Ald) {
        this.A00 = c1559Ald;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, X.Ald] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ?? r0 = this.A00;
        View view = r0.mView;
        if (view == null) {
            return true;
        }
        C1559Ald.A03(r0);
        AbO.A0O(view, (C1559Ald) r0);
        View view2 = r0.mView;
        if (view2 == null) {
            return true;
        }
        InputMethodManager A06 = AbI.A06(r0.requireContext());
        if (A06 != null) {
            7zR.A12(view2, A06);
        }
        view2.requestFocus();
        return true;
    }
}
