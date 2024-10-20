package X;

import android.view.View;

/* loaded from: Ih2.class */
public final class Ih2 implements GJe {
    public final /* synthetic */ C2766Gnj A00;

    public Ih2(C2766Gnj c2766Gnj) {
        this.A00 = c2766Gnj;
    }

    @Override // X.GJe
    public void CM7() {
        View A09 = this.A00.A09();
        if (A09 != null) {
            A09.setPadding(A09.getPaddingLeft(), A09.getPaddingTop(), A09.getPaddingRight(), 0);
        }
    }

    @Override // X.GJe
    public void CM8(int i) {
        if (i != this.A00.A00) {
            CM9(i);
        }
    }

    @Override // X.GJe
    public void CM9(int i) {
        C2766Gnj c2766Gnj = this.A00;
        View A09 = c2766Gnj.A09();
        if (A09 != null) {
            c2766Gnj.A00 = i;
            A09.setPadding(A09.getPaddingLeft(), A09.getPaddingTop(), A09.getPaddingRight(), i);
        }
    }
}
