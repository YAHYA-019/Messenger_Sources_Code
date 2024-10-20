package X;

import com.facebook.payments.confirmation.ConfirmationData;
import com.facebook.payments.confirmation.SimpleConfirmationData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: Fm7.class */
public final class Fm7 implements GJR {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public Fm7(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 99019);
        this.A00 = 1Bu.A03(r0, 99026);
    }

    public /* bridge */ /* synthetic */ void BLh(ConfirmationData confirmationData) {
        SimpleConfirmationData simpleConfirmationData = (SimpleConfirmationData) confirmationData;
        11T.A0F(simpleConfirmationData, 0);
        ((Fm8) 1Br.A0B(this.A01)).BLh(simpleConfirmationData);
    }

    public /* bridge */ /* synthetic */ void BoW(ConfirmationData confirmationData, GOK gok) {
        SimpleConfirmationData simpleConfirmationData = (SimpleConfirmationData) confirmationData;
        11T.A0F(simpleConfirmationData, 0);
        11T.A0F(gok, 1);
        QpY Ado = gok.Ado();
        if (Ado == null || Ado.ordinal() != 5) {
            ((Fm8) 1Br.A0B(this.A01)).BoW(gok, simpleConfirmationData);
            return;
        }
        RuC ruC = (RuC) gok;
        PaymentItemType paymentItemType = ruC.A00;
        ER6 A00 = paymentItemType.A00();
        11T.A0A(A00);
        Exx exx = (Exx) 1Br.A0B(this.A00);
        String str = ruC.A01;
        ER6 A002 = paymentItemType.A00();
        int ordinal = A00.ordinal();
        exx.A01(A002, ordinal != 2 ? ordinal != 11 ? ELR.A03 : ELR.A01 : ELR.A02, str);
    }

    public void CsR(ETu eTu) {
        11T.A0F(eTu, 0);
        ((Fm8) 1Br.A0B(this.A01)).A00 = eTu;
    }
}
