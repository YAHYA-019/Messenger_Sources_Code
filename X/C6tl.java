package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.6tl, reason: invalid class name */
/* loaded from: 6tl.class */
public final class C6tl extends 2O4 {
    public int A01 = 0;
    public ArrayList A00 = null;

    public void A06(RecyclerView recyclerView, int i) {
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((2O4) this.A00.get(i2)).A06(recyclerView, i);
            }
        }
        if (i != this.A01) {
            this.A01 = i;
        }
    }

    public void A07(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = this.A00;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((2O4) this.A00.get(i3)).A07(recyclerView, i, i2);
            }
        }
    }
}
