package X;

import com.facebook.widget.recyclerview.BetterRecyclerView;

/* loaded from: Gzy.class */
public final class Gzy extends C66m {
    public final /* synthetic */ IAL A00;

    public Gzy(IAL ial) {
        this.A00 = ial;
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float A01 = (float) GOq.A01(c66i);
        BetterRecyclerView betterRecyclerView = this.A00.A0J;
        int childCount = betterRecyclerView.getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return;
            }
            betterRecyclerView.getChildAt(i2).setRotation(A01);
            i = i2 + 1;
        }
    }
}
