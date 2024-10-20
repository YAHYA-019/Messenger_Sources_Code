package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: Fwx.class */
public final class Fwx implements GH5 {
    public SwipeRefreshLayout A00;
    public boolean A01;

    @Override // X.GH5
    public boolean Clv(FyG fyG, Object obj, int i) {
        11T.A0F(obj, 2);
        if (i != 38) {
            return false;
        }
        boolean A02 = FB1.A02(obj);
        this.A01 = A02;
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        if (swipeRefreshLayout == null) {
            return true;
        }
        swipeRefreshLayout.A08(A02);
        return true;
    }
}
