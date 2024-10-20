package X;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.payments.ui.PaymentsSecurityInfoView;
import com.facebook.resources.ui.FbTextView;

/* loaded from: Fo2.class */
public final class Fo2 implements GFq {
    public final C00i A00 = DKD.A0V();

    @Override // X.GFq
    public View BK1(View view, ViewGroup viewGroup, GFt gFt, ETu eTu) {
        ViewGroup viewGroup2;
        LayoutInflater A0A;
        int i;
        CharSequence charSequence;
        2OB r310;
        QuC B8P = gFt.B8P();
        int ordinal = B8P.ordinal();
        if (ordinal == 20) {
            Rv1 rv1 = (Rv1) gFt;
            boolean A02 = FI2.A02(this.A00);
            if (view == null) {
                viewGroup2 = new 48A(viewGroup.getContext());
                ((EBs) viewGroup2).A02 = false;
                PaymentsSecurityInfoView inflate = DKD.A0A(viewGroup2).inflate(2132543584, viewGroup2, false);
                ((EBs) viewGroup2).A00 = inflate;
                viewGroup2.addView(inflate);
            } else {
                viewGroup2 = (EBs) view;
            }
            ((EBs) viewGroup2).A01 = eTu;
            if (A02) {
                ((EBs) viewGroup2).A02 = true;
            }
            PaymentsSecurityInfoView paymentsSecurityInfoView = ((EBs) viewGroup2).A00;
            paymentsSecurityInfoView.A0E(eTu);
            paymentsSecurityInfoView.A01.setText(rv1.A01);
            int intValue = rv1.A00.intValue();
            boolean z = ((EBs) viewGroup2).A02;
            if (intValue != 1) {
                ((EBs) viewGroup2).A00.A0F(z ? 4YU.A0F("https://www.facebook.com/help/pay?ref=learn_more") : 4YU.A0F("https://m.facebook.com/payer_protection"), Uri.parse("https://m.facebook.com/payments_terms"));
                return viewGroup2;
            }
            PaymentsSecurityInfoView paymentsSecurityInfoView2 = ((EBs) viewGroup2).A00;
            Uri A0F = z ? 4YU.A0F("https://www.facebook.com/help/pay?ref=learn_more") : 4YU.A0F("https://m.facebook.com/payer_protection");
            2OB r0 = paymentsSecurityInfoView2.A00;
            A0F.getClass();
            r0.setVisibility(0);
            FXs.A01(r0, A0F, paymentsSecurityInfoView2, 63);
            return viewGroup2;
        }
        if (ordinal == 3 || ordinal == 5) {
            if (view == null) {
                if (B8P == QuC.A0P) {
                    A0A = DKD.A0A(viewGroup);
                    i = 2132543357;
                } else {
                    if (B8P != QuC.A0Q) {
                        throw AnonymousClass002.A0C(B8P, "Invalid rowType provided for divider: ", AnonymousClass001.A0k());
                    }
                    A0A = DKD.A0A(viewGroup);
                    i = 2132543366;
                }
                return A0A.inflate(i, viewGroup, false);
            }
        } else if (ordinal == 1) {
            Rux rux = (Rux) gFt;
            if (FI2.A02(this.A00)) {
                if (view == null) {
                    view = new 48A(viewGroup.getContext());
                    view.setContentView(2132543528);
                    ((E7K) view).A00 = (FbTextView) C09s.A01(view, 2131364443);
                } else {
                    view = (E7K) view;
                }
                charSequence = rux.A00;
                if (!1JF.A0B(charSequence)) {
                    r310 = ((E7K) view).A00;
                    r310.setText(charSequence);
                    return view;
                }
            } else {
                if (view == null) {
                    view = new 48A(viewGroup.getContext());
                    view.setContentView(2132542109);
                    ((E7J) view).A00 = AbG.A09(view, 2131364462);
                } else {
                    view = (E7J) view;
                }
                charSequence = rux.A00;
                if (!1JF.A0B(charSequence)) {
                    r310 = ((E7J) view).A00;
                    r310.setText(charSequence);
                    return view;
                }
            }
        } else {
            if (ordinal != 21) {
                throw AnonymousClass002.A0C(B8P, "Illegal row type ", AnonymousClass001.A0k());
            }
            if (view == null) {
                view = AbG.A08(DKD.A0A(viewGroup), viewGroup, 2132543111);
            }
        }
        return view;
    }
}
