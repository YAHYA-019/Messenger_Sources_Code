package X;

import android.database.DataSetObserver;

/* loaded from: JV3.class */
public final class JV3 extends DataSetObserver {
    public final /* synthetic */ LLd A00;

    public JV3(LLd lLd) {
        this.A00 = lLd;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        LLd lLd = this.A00;
        if (lLd.A09.isShowing()) {
            lLd.CzI();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.A00.dismiss();
    }
}
