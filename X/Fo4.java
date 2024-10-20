package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: Fo4.class */
public final class Fo4 implements GFq {
    public final Fo2 A00 = (Fo2) 1Bn.A0A(98990);

    @Override // X.GFq
    public View BK1(View view, ViewGroup viewGroup, GFt gFt, ETu eTu) {
        View qRe;
        QuC B8P = gFt.B8P();
        int ordinal = B8P.ordinal();
        if (ordinal == 14) {
            Rv6 rv6 = (Rv6) gFt;
            qRe = view == null ? new QRe(viewGroup.getContext()) : (QRe) view;
            qRe.A0E(eTu);
            ((QRe) qRe).A02 = rv6;
            ((QRe) qRe).A01.setVisibility(DKG.A00(rv6.A03 ? 1 : 0));
            ((QRe) qRe).A00.setText(((QRe) qRe).A02.A02);
        } else {
            if (ordinal != 3) {
                throw AnonymousClass002.A0C(B8P, "Illegal row type ", AnonymousClass001.A0k());
            }
            qRe = this.A00.BK1(view, viewGroup, gFt, eTu);
        }
        return qRe;
    }
}
