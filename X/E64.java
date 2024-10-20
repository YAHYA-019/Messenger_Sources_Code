package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.p2p.datamodel.GeneralP2pPaymentCustomConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentConfig;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.payments.p2p.model.PaymentCard;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.google.common.collect.ImmutableList;

/* loaded from: E64.class */
public final class E64 extends Ezy {
    public Context A00;
    public 1BY A01;
    public 1pK A02;
    public P2pPaymentConfig A03;
    public RSI A04;
    public final E66 A05;
    public final F9R A06;
    public final EsC A07 = new EsC(this);

    public E64(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
        E66 e66 = (E66) 1Bn.A0B(99142);
        F9R f9r = (F9R) 1Bn.A0B(99164);
        this.A05 = e66;
        this.A06 = f9r;
    }

    public static void A00(FbUserSession fbUserSession, E64 e64, GJW gjw, EMQ emq) {
        ImmutableList.Builder A0h = 4YU.A0h();
        E66 e66 = e64.A05;
        ImmutableList immutableList = e66.A0A;
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof PaymentCard) {
                    A0h.m11011add(next);
                }
            }
        }
        PaymentCard paymentCard = null;
        PaymentMethod paymentMethod = e66.A07;
        if (paymentMethod instanceof PaymentCard) {
            paymentCard = (PaymentCard) paymentMethod;
        }
        GeneralP2pPaymentCustomConfig generalP2pPaymentCustomConfig = (GeneralP2pPaymentCustomConfig) e64.A03.A09;
        ImmutableList.of();
        e64.A06.A02(fbUserSession, gjw, new EqP(e64.A02, generalP2pPaymentCustomConfig.A00, e64.A03.A07, paymentCard, emq, A0h.build(), (String) null, false));
    }

    @Override // X.Ezy
    public void A0F(Context context, Bundle bundle, 1pK r304, RQD rqd, P2pPaymentConfig p2pPaymentConfig, P2pPaymentData p2pPaymentData, RSI rsi) {
        super.A00 = true;
        this.A00 = context;
        this.A03 = p2pPaymentConfig;
        this.A02 = r304;
        this.A04 = rsi;
        E66 e66 = this.A05;
        e66.A0F(context, bundle, r304, rqd, p2pPaymentConfig, p2pPaymentData, rsi);
        e66.A05 = this.A07;
    }
}
