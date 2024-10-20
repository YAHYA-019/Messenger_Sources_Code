package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: GW5.class */
public final class GW5 extends AbstractC02903wj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GW5(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.AbstractC02903wj
    public int A00(int i) {
        int i2;
        if (this.A00 != 0) {
            i2 = 1;
            if (i < ((C3061Jhu) this.A02).A01.size()) {
                i2 = 3;
            }
        } else {
            2Xd r0 = ((RecyclerView) this.A02).A0C;
            i2 = 1;
            if (r0 == null) {
                return -1;
            }
            int itemViewType = r0.getItemViewType(i);
            if (Integer.valueOf(itemViewType) == null) {
                return -1;
            }
            if (itemViewType == 1) {
                return ((Hh5) this.A01).A02;
            }
        }
        return i2;
    }
}
