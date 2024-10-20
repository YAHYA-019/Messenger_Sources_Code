package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.payments.shipping.model.ShippingSource;
import com.facebook.payments.shipping.model.SimpleMailingAddress;
import com.facebook.payments.ui.FloatingLabelTextView;
import com.facebook.widget.text.BetterTextView;

/* loaded from: Fo6.class */
public final class Fo6 implements GFq {
    public final Fo2 A01 = (Fo2) 1Bn.A0A(98990);
    public final C00i A00 = DKD.A0V();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v55, types: [com.facebook.payments.ui.FloatingLabelTextView, android.view.View, android.view.ViewGroup] */
    @Override // X.GFq
    public View BK1(View view, ViewGroup viewGroup, GFt gFt, ETu eTu) {
        E7H qRd;
        BetterTextView betterTextView;
        QuC B8P = gFt.B8P();
        int ordinal = B8P.ordinal();
        if (ordinal == 13) {
            FoN foN = (FoN) gFt;
            if (FI2.A02(this.A00)) {
                qRd = view == null ? new QRf(viewGroup.getContext()) : (QRf) view;
                qRd.A0E(eTu);
                ((QRf) qRd).A00 = foN;
                ((QRf) qRd).A02.setText(foN.A05);
                ((QRf) qRd).A01.setText(((QRf) qRd).A00.A04);
                boolean z = ((SimpleMailingAddress) foN.A02).mIsDefault;
                2OB r0 = ((QRf) qRd).A03;
                int i = 4;
                if (z) {
                    i = 0;
                }
                r0.setVisibility(i);
            } else {
                qRd = view == null ? new QRd(viewGroup.getContext()) : (QRd) view;
                qRd.A0E(eTu);
                ((QRd) qRd).A01 = foN;
                CharSequence charSequence = foN.A05;
                String str = foN.A04;
                ShippingSource shippingSource = foN.A03;
                int ordinal2 = shippingSource.ordinal();
                int i2 = 8;
                if (ordinal2 == 0) {
                    GlyphView glyphView = ((QRd) qRd).A00;
                    if (foN.A06) {
                        i2 = 0;
                    }
                    glyphView.setVisibility(i2);
                    FloatingLabelTextView floatingLabelTextView = ((QRd) qRd).A02;
                    floatingLabelTextView.A00.setVisibility(0);
                    floatingLabelTextView.A00.setText(charSequence);
                    floatingLabelTextView.A01.setVisibility(0);
                    betterTextView = floatingLabelTextView.A01;
                } else {
                    if (ordinal2 != 1) {
                        throw AnonymousClass002.A0C(shippingSource, "Unhandled ", AnonymousClass001.A0k());
                    }
                    ((QRd) qRd).A00.setVisibility(8);
                    ?? r02 = ((QRd) qRd).A02;
                    r02.removeView(r02.A00);
                    r02.addView(r02.A00, r02.indexOfChild(r02.A01) + 1);
                    Resources resources = r02.getResources();
                    r02.A01.setTextSize(C0A8.A06(resources, 2132279515));
                    r02.A00.setTextSize(C0A8.A06(resources, 2132279323));
                    r02.A01.setVisibility(0);
                    r02.A01.setText(charSequence);
                    r02.A00.setVisibility(0);
                    betterTextView = r02.A00;
                }
                betterTextView.setText(str);
            }
        } else if (ordinal == 9) {
            Ruy ruy = (Ruy) gFt;
            if (view == null) {
                QRf qRf = new 48A(viewGroup.getContext());
                int i3 = 2132543343;
                if (FI2.A02(DKD.A0V())) {
                    i3 = 2132542121;
                }
                qRf.setContentView(i3);
                DKF.A12(qRf.getContext(), AbG.A09(qRf, 2131367401), 2131965927);
                C2rp.A01(qRf);
                qRd = qRf;
            } else {
                qRd = (E7H) view;
            }
            qRd.A00 = eTu;
            qRd.A00 = ruy;
            qRd.setOnClickListener(qRd);
        } else {
            if (ordinal != 3 && ordinal != 20) {
                throw AnonymousClass002.A0C(B8P, "Illegal row type ", AnonymousClass001.A0k());
            }
            qRd = this.A01.BK1(view, viewGroup, gFt, eTu);
        }
        return (View) qRd;
    }
}
