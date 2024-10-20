package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.payments.invoice.creation.v2.model.InvoiceData;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import java.math.BigDecimal;

/* loaded from: E5y.class */
public final class E5y extends Ezy {
    public InvoiceData A00;
    public BigDecimal A01;
    public QVP A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1De A05;

    public E5y(1De r302) {
        this.A05 = r302;
        1BY r0 = r302.A00;
        this.A04 = 1Bu.A03(r0, 16428);
        this.A03 = 1Bu.A03(r0, 68194);
    }

    @Override // X.Ezy
    public View A0D(Context context, ViewGroup viewGroup) {
        return this.A02;
    }

    @Override // X.Ezy
    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        11T.A0F(context, 0);
        7zT.A1W(r304, p2pPaymentData, p2pPaymentConfig, rsi);
        11T.A0F(rqd, 6);
        super.A00 = true;
        this.A00 = p2pPaymentData.A02;
        QVP qvp = new QVP(context);
        this.A02 = qvp;
        qvp.A00.setText(context.getString(2131964019));
        QVP qvp2 = this.A02;
        11T.A0D(qvp2);
        qvp2.setVisibility(8);
    }

    @Override // X.Ezy
    public void A0H(P2pPaymentData p2pPaymentData) {
        int i = 0;
        11T.A0F(p2pPaymentData, 0);
        BigDecimal bigDecimal = this.A01;
        if (bigDecimal == null || this.A02 == null) {
            return;
        }
        int compareTo = p2pPaymentData.A00().A01.compareTo(bigDecimal);
        QVP qvp = this.A02;
        if (compareTo > 0) {
            11T.A0D(qvp);
        } else {
            11T.A0D(qvp);
            i = 8;
        }
        qvp.setVisibility(i);
    }
}
