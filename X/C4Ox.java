package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4Ox, reason: invalid class name */
/* loaded from: 4Ox.class */
public final class C4Ox extends C02833wb {
    public final /* synthetic */ 3wX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4Ox(Context context, 3wX r303) {
        super(context);
        this.A00 = r303;
    }

    @Override // X.C02833wb, X.AbstractC02843wc
    public void A06(View view, C02853wd c02853wd, 2NQ r304) {
        3wX r0 = this.A00;
        RecyclerView recyclerView = r0.A00;
        if (recyclerView != null) {
            C02833wb.A00(view, this, c02853wd, recyclerView, r0);
        }
    }

    @Override // X.C02833wb
    public float A07(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
