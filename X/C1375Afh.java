package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Afh, reason: case insensitive filesystem */
/* loaded from: Afh.class */
public final class C1375Afh extends 2O4 {
    public Set A00;
    public int A01 = 0;

    public void A06(RecyclerView recyclerView, int i) {
        Set set = this.A00;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((2O4) it.next()).A06(recyclerView, i);
            }
        }
        if (i != this.A01) {
            this.A01 = i;
        }
    }

    public void A07(RecyclerView recyclerView, int i, int i2) {
        Set set = this.A00;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((2O4) it.next()).A07(recyclerView, i, i2);
            }
        }
    }
}
