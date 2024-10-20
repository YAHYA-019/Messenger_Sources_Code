package X;

import android.content.Context;
import com.facebook.payments.paymentmethods.cardform.CardFormStyle;
import com.google.common.collect.ImmutableMap;
import java.util.Set;

/* loaded from: EuD.class */
public final class EuD {
    public 1BY A00;
    public final C00i A01 = 1BV.A01((1BY) null, 99214);
    public final ImmutableMap A02;

    public EuD(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        Set<Epj> set = (Set) 1Bn.A0E((Context) null, (1BY) null, 197);
        ImmutableMap.Builder A0c = 1BK.A0c();
        for (Epj epj : set) {
            A0c.put(epj.A05, epj);
        }
        this.A02 = A0c.build();
    }

    public GKW A00(CardFormStyle cardFormStyle) {
        ImmutableMap immutableMap = this.A02;
        if (!immutableMap.containsKey(cardFormStyle)) {
            cardFormStyle = CardFormStyle.SIMPLE;
        }
        return (GKW) ((Epj) immutableMap.get(cardFormStyle)).A01.get();
    }
}
