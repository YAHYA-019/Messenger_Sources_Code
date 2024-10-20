package X;

import android.util.SparseArray;
import android.view.View;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.google.common.collect.ImmutableList;

/* loaded from: Euz.class */
public final class Euz {
    public P2pPaymentConfig A00;
    public P2pPaymentData A01;
    public final ImmutableList A04;
    public final C00i A03 = AbH.A0F();
    public final SparseArray A02 = DKC.A0E();

    public Euz(ImmutableList immutableList) {
        this.A04 = immutableList;
    }

    public void A00() {
        int i = 0;
        while (true) {
            int i2 = i;
            SparseArray sparseArray = this.A02;
            if (i2 >= sparseArray.size()) {
                return;
            }
            Ezy ezy = (Ezy) this.A04.get(sparseArray.keyAt(i2));
            View view = (View) sparseArray.valueAt(i2);
            if (view != null) {
                ezy.A0G(view, this.A00, this.A01);
            }
            i = i2 + 1;
        }
    }
}
