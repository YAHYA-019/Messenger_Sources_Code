package X;

import android.content.Context;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* loaded from: E63.class */
public final class E63 extends Ezy {
    public Context A00;
    public P2pPaymentData A01;
    public ListenableFuture A02;
    public SettableFuture A03;
    public Boolean A04 = null;
    public final Fch A05;
    public final Executor A06;

    public E63() {
        Fch A0b = DKD.A0b();
        Executor A1D = AbJ.A1D();
        this.A05 = A0b;
        this.A06 = A1D;
    }

    public static void A00(E63 e63, Boolean bool) {
        if (bool.booleanValue()) {
            e63.A03.A04();
            return;
        }
        C2121Dea A03 = C2121Dea.A03(e63.A00);
        A03.A06(2131963153);
        A03.A05(2131963106);
        A03.A0C(false);
        A03.A0J(FK6.A00(e63, 72), 2131955719);
        AbM.A1I(A03);
    }
}
