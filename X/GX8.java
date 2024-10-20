package X;

import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: GX8.class */
public final class GX8 extends 2O4 {
    public final /* synthetic */ I2s A00;

    public GX8(I2s i2s) {
        this.A00 = i2s;
    }

    public void A06(RecyclerView recyclerView, int i) {
        TextView textView;
        int i2;
        if (i != 0) {
            I2s i2s = this.A00;
            i2s.A09.A04();
            i2s.A0A.A01();
            return;
        }
        I2s i2s2 = this.A00;
        if (i2s2.A01 != null) {
            i2s2.A01.A01(4YV.A0C(recyclerView.getContext()));
        }
        i2s2.A09.A03();
        i2s2.A0A.A00();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) i2s2.A08.A0F;
        if (!i2s2.A00.A0D || linearLayoutManager == null) {
            return;
        }
        int A1h = linearLayoutManager.A1h();
        HRo hRo = i2s2.A03;
        if (hRo != null) {
            if (A1h == 0) {
                textView = hRo.A00.A02;
                i2 = 8;
            } else {
                if (A1h < 1) {
                    return;
                }
                IEh iEh = hRo.A00;
                iEh.A02.setText(iEh.A0M);
                textView = iEh.A02;
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
    }
}
