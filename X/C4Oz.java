package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4Oz, reason: invalid class name */
/* loaded from: 4Oz.class */
public final class C4Oz extends 2O4 {
    public boolean A00 = false;
    public final /* synthetic */ 3wX A01;

    public C4Oz(3wX r302) {
        this.A01 = r302;
    }

    public void A06(RecyclerView recyclerView, int i) {
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A04();
        }
    }

    public void A07(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.A00 = true;
    }
}
