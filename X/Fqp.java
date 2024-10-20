package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: Fqp.class */
public final class Fqp implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        2XA r0;
        E8i e8i = (E8i) obj2;
        if (obj3 == null) {
            throw AnonymousClass001.A0N("List data was not computed during layout");
        }
        2Xd r02 = e8i.A0D;
        EmD emD = (EmD) obj3;
        int i = ((DSj) r02).A00;
        int i2 = emD.A00;
        boolean z = true;
        boolean z2 = false;
        boolean A1W = 4YV.A1W(i, i2);
        int i3 = ((DSj) r02).A01;
        int i4 = emD.A01;
        boolean A1W2 = 4YV.A1W(i3, i4);
        RecyclerView recyclerView = ((DSj) r02).A02;
        if (recyclerView != null && (r0 = recyclerView.A0F) != null) {
            if ((!r0.A1b() || !A1W) && (!r0.A1e() || !A1W2)) {
                z = false;
            }
            z2 = z;
        }
        ((DSj) r02).A01 = i4;
        ((DSj) r02).A00 = i2;
        List list = ((DSj) r02).A03;
        ((DSj) r02).A03 = emD.A02;
        if (z2) {
            r02.A07();
            return null;
        }
        C2hw.A00(new DSS(r02, list), true).A02(r02);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z = false;
        if (obj3 != null && obj4 != null) {
            EmD emD = (EmD) obj3;
            EmD emD2 = (EmD) obj4;
            if (emD.A01 != emD2.A01 || emD.A00 != emD2.A00 || !emD.A02.equals(emD2.A02)) {
                z = true;
            }
        }
        return z;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
