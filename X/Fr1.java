package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: Fr1.class */
public final class Fr1 implements 29I {
    public final Eh6 A00;
    public final Eqr A01;

    public Fr1(Eh6 eh6, Eqr eqr) {
        this.A01 = eqr;
        this.A00 = eh6;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        Eqr eqr = this.A01;
        Eh6 eh6 = this.A00;
        eqr.A08 = eh6.A00 == 1 ? eh6.A01.A02.AZU().B9F() : null;
        eqr.A07 = recyclerView;
        recyclerView.A1F(eqr.A06);
        int i = eqr.A00;
        if (i != -1) {
            if (!eqr.A0A) {
                recyclerView.A0u(i);
            } else if (eqr.A09.equals("")) {
                recyclerView.A0w(i);
            } else {
                C02833wb c02833wb = new C02833wb(context);
                ((DST) c02833wb).A00 = 0;
                ((DST) c02833wb).A03 = true;
                ((DST) c02833wb).A01 = 0;
                c02833wb.A0E(eqr.A09);
                ((DST) c02833wb).A00 = eqr.A03;
                ((DST) c02833wb).A03 = eqr.A0C;
                ((AbstractC02843wc) c02833wb).A00 = eqr.A00;
                2XA r0 = recyclerView.A0F;
                if (r0 != null) {
                    r0.A0x(c02833wb);
                }
            }
            eqr.A00 = -1;
            eqr.A0A = false;
            eqr.A09 = "";
            eqr.A03 = 0;
            eqr.A0C = true;
        }
        int i2 = eqr.A01;
        if (i2 != -1 || eqr.A02 != -1) {
            boolean z = eqr.A0B;
            int i3 = eqr.A02;
            if (z) {
                recyclerView.A11(i2, i3);
            } else {
                recyclerView.scrollBy(i2, i3);
            }
            eqr.A01 = -1;
            eqr.A02 = -1;
            eqr.A0B = false;
        }
        8Dx r02 = eqr.A08;
        if (r02 == null) {
            return null;
        }
        recyclerView.A1F(r02);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        Eqr eqr = this.A01;
        RecyclerView recyclerView2 = eqr.A07;
        if (recyclerView2 != null) {
            recyclerView2.setImportantForAutofill(0);
        }
        eqr.A07 = null;
        recyclerView.A1G(eqr.A06);
        8Dx r0 = eqr.A08;
        if (r0 != null) {
            recyclerView.A1G(r0);
        }
        eqr.A08 = null;
    }
}
