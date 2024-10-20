package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jhm, reason: case insensitive filesystem */
/* loaded from: Jhm.class */
public final class C3053Jhm extends LinearLayoutManager {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K87 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3053Jhm(Context context, K87 k87, int i, int i2) {
        super(context, i, false);
        this.A01 = k87;
        this.A00 = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1U(2NQ r302, RecyclerView recyclerView, int i) {
        final Context context = recyclerView.getContext();
        final int i2 = 2;
        C02833wb c02833wb = new C02833wb(context, this, i2) { // from class: X.4Oy
            public final int A00;
            public final Object A01;

            {
                this.A00 = i2;
                this.A01 = this;
            }

            @Override // X.C02833wb, X.AbstractC02843wc
            public void A06(View view, C02853wd c02853wd, 2NQ r304) {
                JiI jiI;
                RecyclerView recyclerView2;
                switch (this.A00) {
                    case 0:
                        jiI = (3wX) this.A01;
                        recyclerView2 = ((3wX) jiI).A00;
                        break;
                    case 1:
                        jiI = (JiI) this.A01;
                        recyclerView2 = jiI.A04;
                        break;
                    default:
                        super.A06(view, c02853wd, r304);
                        return;
                }
                C02833wb.A00(view, this, c02853wd, recyclerView2, jiI);
            }

            @Override // X.C02833wb
            public float A07(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // X.C02833wb
            public int A0A(int i3) {
                switch (this.A00) {
                    case 0:
                    case 1:
                        return Math.min(100, super.A0A(i3));
                    default:
                        return super.A0A(i3);
                }
            }
        };
        ((AbstractC02843wc) c02833wb).A00 = i;
        A0x(c02833wb);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1t(2NQ r302, int[] iArr) {
        int height;
        int i = this.A00;
        K87 k87 = this.A01;
        if (i == 0) {
            iArr[0] = k87.A02.getWidth();
            height = k87.A02.getWidth();
        } else {
            iArr[0] = k87.A02.getHeight();
            height = k87.A02.getHeight();
        }
        iArr[1] = height;
    }
}
