package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.Jhq, reason: case insensitive filesystem */
/* loaded from: Jhq.class */
public final class C3057Jhq extends 2Xd {
    public KfC A00;
    public List A01 = AnonymousClass001.A0s();

    public C3057Jhq() {
        KOG[] values = KOG.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            this.A01.add(values[i2]);
            i = i2 + 1;
        }
    }

    public /* bridge */ /* synthetic */ void BlZ(C2lb c2lb, int i) {
        C3069Ji7 c3069Ji7 = (C3069Ji7) c2lb;
        KOG kog = (KOG) this.A01.get(i);
        2OB r0 = c3069Ji7.A01;
        DKF.A12(c3069Ji7.A00, r0, kog.optionStringId);
        LKL.A00(r0, c3069Ji7, kog, 14);
    }

    public /* bridge */ /* synthetic */ C2lb Bs3(ViewGroup viewGroup, int i) {
        return new C3069Ji7(AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132541514), this);
    }

    public int getItemCount() {
        return this.A01.size();
    }
}
