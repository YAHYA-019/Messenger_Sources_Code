package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: GX9.class */
public final class GX9 extends 2O4 {
    public final LVe A00;

    public GX9(Context context) {
        this.A00 = ((82O) 1Bn.A0E(context, (1BY) null, 392)).A01("android_messenger_broadcast_flow");
    }

    public void A06(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.A00.A03();
        } else if (i == 1) {
            C5fi.A01(recyclerView);
        } else if (i == 2) {
            this.A00.A04();
        }
    }
}
