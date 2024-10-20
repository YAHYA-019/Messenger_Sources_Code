package X;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.3wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wk.class */
public final class C02913wk implements C2X7 {
    public C2X1 A00;
    public final GridLayoutManager A01;
    public final C02923wl A02;

    public C02913wk(GridLayoutManager gridLayoutManager) {
        this.A01 = gridLayoutManager;
        C02923wl c02923wl = new C02923wl(this);
        this.A02 = c02923wl;
        gridLayoutManager.A01 = c02923wl;
    }

    @Override // X.C2X7
    public int A9A(int i, int i2, int i3, int i4) {
        double d;
        double d2;
        GridLayoutManager gridLayoutManager = this.A01;
        int i5 = gridLayoutManager.A00;
        if (((LinearLayoutManager) gridLayoutManager).A01 != 0) {
            d = i4;
            d2 = i2;
        } else {
            d = i3;
            d2 = i;
        }
        return ((int) Math.ceil(d / d2)) * i5;
    }

    @Override // X.C2X7
    public /* bridge */ /* synthetic */ C3m5 ALL(final int i, final int i2) {
        GridLayoutManager gridLayoutManager = this.A01;
        final int i3 = ((LinearLayoutManager) gridLayoutManager).A01;
        final int i4 = gridLayoutManager.A00;
        return new C3m5(i, i2, i3, i4) { // from class: X.4Vp
            public int A00;
            public int A01;
            public final int A02;
            public final int A03;
            public final int A04;
            public final int A05;

            {
                this.A05 = i;
                this.A02 = i2;
                this.A03 = i3;
                this.A04 = i4;
            }

            @Override // X.C3m5
            public void A4z(C2hn c2hn, int i5, int i6) {
                if (this.A01 == 0) {
                    int i7 = this.A00;
                    if (this.A03 == 1) {
                        i5 = i6;
                    }
                    this.A00 = i7 + i5;
                }
                if (!c2hn.BT1()) {
                    int BBq = this.A01 + c2hn.BBq();
                    this.A01 = BBq;
                    if (BBq != this.A04) {
                        return;
                    }
                }
                this.A01 = 0;
            }

            @Override // X.C3m5
            public int AmU() {
                return this.A00;
            }

            @Override // X.C3m5
            public boolean DAB() {
                boolean z = true;
                if (this.A00 >= (this.A03 == 1 ? this.A02 : this.A05)) {
                    z = false;
                }
                return z;
            }
        };
    }

    @Override // X.C2X4
    public int ASi() {
        return this.A01.A1g();
    }

    @Override // X.C2X4
    public int ASk() {
        return this.A01.A1h();
    }

    @Override // X.C2X4
    public int ASn() {
        return this.A01.A1i();
    }

    @Override // X.C2X4
    public int ASo() {
        return this.A01.A1j();
    }

    @Override // X.C2X7
    public int AcQ(C2hn c2hn, int i) {
        int BBq;
        GridLayoutManager gridLayoutManager = this.A01;
        if (((LinearLayoutManager) gridLayoutManager).A01 != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Number number = (Number) c2hn.AgD("OVERRIDE_SIZE");
        if (number != null) {
            BBq = number.intValue();
        } else if (c2hn.BT1()) {
            BBq = View.MeasureSpec.getSize(i);
        } else {
            BBq = c2hn.BBq() * (View.MeasureSpec.getSize(i) / gridLayoutManager.A00);
        }
        return View.MeasureSpec.makeMeasureSpec(BBq, 1073741824);
    }

    @Override // X.C2X7
    public int AcU(C2hn c2hn, int i) {
        int BBq;
        GridLayoutManager gridLayoutManager = this.A01;
        if (((LinearLayoutManager) gridLayoutManager).A01 == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Number number = (Number) c2hn.AgD("OVERRIDE_SIZE");
        if (number != null) {
            BBq = number.intValue();
        } else if (c2hn.BT1()) {
            BBq = View.MeasureSpec.getSize(i);
        } else {
            BBq = c2hn.BBq() * (View.MeasureSpec.getSize(i) / gridLayoutManager.A00);
        }
        return View.MeasureSpec.makeMeasureSpec(BBq, 1073741824);
    }

    @Override // X.C2X7
    public 2XA AtW() {
        return this.A01;
    }

    @Override // X.C2X7
    public int B9E() {
        return ((LinearLayoutManager) this.A01).A01;
    }

    @Override // X.C2X7
    public void Cjt(int i, int i2) {
        this.A01.Cjt(i, i2);
    }

    @Override // X.C2X7
    public void Ctp(C2X1 c2x1) {
        this.A00 = c2x1;
    }

    @Override // X.C2X4
    public int getItemCount() {
        return this.A01.A0V();
    }
}
