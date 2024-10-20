package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: Fa3.class */
public final class Fa3 implements GJH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FyG A01;
    public final /* synthetic */ DLQ A02;
    public final /* synthetic */ DLQ A03;

    public Fa3(Context context, FyG fyG, DLQ dlq, DLQ dlq2) {
        this.A03 = dlq;
        this.A00 = context;
        this.A02 = dlq2;
        this.A01 = fyG;
    }

    public void CM7() {
        DLQ dlq = this.A03;
        GJj A0w = DKC.A0w(dlq);
        if (A0w != null) {
            DLQ dlq2 = this.A02;
            DKM A02 = DKM.A02(dlq2);
            FyG fyG = this.A01;
            A02.A0I(fyG);
            DKM.A0D(dlq2, fyG, A02, A0w);
            return;
        }
        GJj A08 = dlq.A08();
        if (A08 != null) {
            FAv.A01(this.A02, this.A01, DKM.A04(), A08);
        }
    }

    public void CM8(int i) {
        GJj A0t = DKC.A0t(this.A03);
        if (A0t != null) {
            Context context = this.A00;
            11T.A0F(context, 0);
            DisplayMetrics A0I = 7zO.A0I(context);
            11T.A0A(A0I);
            int i2 = (int) (i / A0I.density);
            DLQ dlq = this.A02;
            DKM A02 = DKM.A02(dlq);
            FyG fyG = this.A01;
            A02.A0I(fyG);
            A02.A0J(Integer.valueOf(i2), 2);
            DKM.A0D(dlq, fyG, A02, A0t);
        }
    }

    public void CM9(int i) {
        DLQ dlq = this.A03;
        GJj AlB = dlq.AlB(43);
        if (AlB == null) {
            GJj A07 = dlq.A07();
            if (A07 != null) {
                FAv.A01(this.A02, this.A01, DKM.A04(), A07);
                return;
            }
            return;
        }
        Context context = this.A00;
        11T.A0F(context, 0);
        DisplayMetrics A0I = 7zO.A0I(context);
        11T.A0A(A0I);
        int i2 = (int) (i / A0I.density);
        DLQ dlq2 = this.A02;
        DKM A02 = DKM.A02(dlq2);
        FyG fyG = this.A01;
        A02.A0I(fyG);
        A02.A0J(Integer.valueOf(i2), 2);
        DKM.A0D(dlq2, fyG, A02, AlB);
    }
}
