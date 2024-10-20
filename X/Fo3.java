package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: Fo3.class */
public final class Fo3 implements GFq {
    public final Fo2 A00 = (Fo2) 1Bn.A0A(98990);

    @Override // X.GFq
    public View BK1(View view, ViewGroup viewGroup, GFt gFt, ETu eTu) {
        View qRc;
        if (gFt.B8P().ordinal() != 19) {
            qRc = this.A00.BK1(view, viewGroup, gFt, eTu);
        } else {
            Rv7 rv7 = (Rv7) gFt;
            qRc = view == null ? new QRc(viewGroup.getContext()) : (QRc) view;
            qRc.A0E(eTu);
            ((QRc) qRc).A02 = rv7;
            ((QRc) qRc).A01.setVisibility(DKG.A00(rv7.A04 ? 1 : 0));
            ((QRc) qRc).A00.setText(((QRc) qRc).A02.A03);
        }
        return qRc;
    }
}
