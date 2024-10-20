package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: X.Afe, reason: case insensitive filesystem */
/* loaded from: Afe.class */
public final class C1372Afe extends 2O4 {
    public int[] A00;
    public final 1Iw A01;
    public final C2iw A02;

    public C1372Afe(1Iw r302, C2iw c2iw, int[] iArr) {
        this.A01 = r302;
        this.A02 = c2iw;
        this.A00 = iArr;
    }

    public void A06(RecyclerView recyclerView, int i) {
        2XA r0 = recyclerView.A0F;
        if (r0 != null) {
            int binarySearch = Arrays.binarySearch(this.A00, ((LinearLayoutManager) r0).A1i());
            if (binarySearch < 0) {
                binarySearch = Math.max(0, (-binarySearch) - 2);
            }
            3wK.A01(this.A02, binarySearch);
        }
    }
}
