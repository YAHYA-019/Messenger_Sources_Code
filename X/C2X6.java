package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.2X6, reason: invalid class name */
/* loaded from: 2X6.class */
public class C2X6 implements C2X7 {
    public final LinearLayoutManager A00;

    public C2X6(Context context, int i, boolean z) {
        this(context, z, i, false);
    }

    public C2X6(Context context, boolean z, int i, boolean z2) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, z);
        linearLayoutManager.A1v(z2);
        this.A00 = linearLayoutManager;
        ((2XA) linearLayoutManager).A0D = false;
    }

    public C2X6(LinearLayoutManager linearLayoutManager) {
        this.A00 = linearLayoutManager;
    }

    @Override // X.C2X7
    public int A9A(int i, int i2, int i3, int i4) {
        float f = i3;
        float f2 = i;
        if (this.A00.A01 != 0) {
            f = i4;
            f2 = i2;
        }
        int ceil = (int) Math.ceil(f / f2);
        if (ceil < 2) {
            ceil = 2;
        } else if (ceil > 10) {
            return 10;
        }
        return ceil;
    }

    @Override // X.C2X7
    public /* bridge */ /* synthetic */ C3m5 ALL(final int i, final int i2) {
        final int i3 = this.A00.A01;
        return new C3m5(i, i2, i3) { // from class: X.3Yv
            public int A00;
            public final int A01;
            public final int A02;
            public final int A03;

            {
                this.A03 = i;
                this.A01 = i2;
                this.A02 = i3;
            }

            @Override // X.C3m5
            public void A4z(C2hn c2hn, int i4, int i5) {
                int i6 = this.A00;
                if (this.A02 == 1) {
                    i4 = i5;
                }
                this.A00 = i6 + i4;
            }

            @Override // X.C3m5
            public int AmU() {
                return this.A00;
            }

            @Override // X.C3m5
            public boolean DAB() {
                boolean z = true;
                if (this.A00 >= (this.A02 == 1 ? this.A01 : this.A03)) {
                    z = false;
                }
                return z;
            }
        };
    }

    @Override // X.C2X4
    public int ASi() {
        return this.A00.A1g();
    }

    @Override // X.C2X4
    public int ASk() {
        return this.A00.A1h();
    }

    @Override // X.C2X4
    public int ASn() {
        return this.A00.A1i();
    }

    @Override // X.C2X4
    public int ASo() {
        return this.A00.A1j();
    }

    @Override // X.C2X7
    public int AcQ(C2hn c2hn, int i) {
        if (this.A00.A01 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return i;
    }

    @Override // X.C2X7
    public int AcU(C2hn c2hn, int i) {
        if (this.A00.A01 == 0) {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return i;
    }

    @Override // X.C2X7
    public 2XA AtW() {
        return this.A00;
    }

    @Override // X.C2X7
    public int B9E() {
        return this.A00.A01;
    }

    @Override // X.C2X7
    public void Cjt(int i, int i2) {
        this.A00.Cjt(i, i2);
    }

    @Override // X.C2X7
    public void Ctp(C2X1 c2x1) {
    }

    @Override // X.C2X4
    public int getItemCount() {
        return this.A00.A0V();
    }
}
