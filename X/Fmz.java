package X;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.graphql.enums.GraphQLPeerToPeerPaymentRequestStatus;
import com.facebook.payments.p2p.messenger.core.prefs.transactions.UserMessengerPayHistoryItemView;
import com.facebook.payments.p2p.model.Amount;
import com.google.common.base.Preconditions;

/* loaded from: Fmz.class */
public final class Fmz implements GFi {
    public final LayoutInflater A00;
    public final Elw A01;

    public Fmz() {
        LayoutInflater layoutInflater = (LayoutInflater) 1Hv.A02(7zP.A0J(), 100193);
        Elw elw = (Elw) 1Bn.A0B(99292);
        this.A00 = layoutInflater;
        this.A01 = elw;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r309v1, types: [X.RLm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r309v2, types: [X.RLm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r309v4, types: [X.RLm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r309v6, types: [X.RLm, java.lang.Object] */
    @Override // X.GFi
    public GFh BK3(View view, ViewGroup viewGroup, Object obj) {
        boolean z;
        Resources resources;
        int i;
        RLm rLm;
        String string;
        RLm rLm2;
        RuZ ruZ;
        String A0k;
        if (view == null || !(view instanceof UserMessengerPayHistoryItemView)) {
            view = AbG.A08(this.A00, viewGroup, 2132543542);
        }
        GFh gFh = (GFh) view;
        Elw elw = this.A01;
        Preconditions.checkArgument(obj instanceof GNv);
        GNv gNv = (GNv) obj;
        C15h c15h = elw.A02;
        if (c15h.get() == null) {
            elw.A01.D11(Elw.class.getSimpleName(), "null ViewerContextUser found when creating params for payment request");
            ruZ = null;
        } else {
            2JY B7V = gNv.B7V();
            if (B7V == null || (A0k = B7V.A0k()) == null) {
                z = false;
            } else {
                z = AbH.A1E(c15h).equals(A0k);
                if (z) {
                    B7V = gNv.B7U();
                }
            }
            Rua rua = B7V == null ? null : new Rua(B7V);
            Integer num = 0S2.A00;
            Boolean A17 = 7zM.A17(z);
            String name = rua != null ? rua.getName() : "";
            Amount A0F = DKI.A0F(gNv.AWV());
            GraphQLPeerToPeerPaymentRequestStatus B7P = gNv.B7P();
            if (B7P == null) {
                B7P = GraphQLPeerToPeerPaymentRequestStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            }
            switch (B7P.ordinal()) {
                case 1:
                    ?? obj2 = new Object();
                    ((RLm) obj2).A01 = QoN.A01;
                    ((RLm) obj2).A00 = Typeface.DEFAULT_BOLD;
                    resources = elw.A00;
                    i = 2131964427;
                    rLm = obj2;
                    string = resources.getString(i);
                    rLm2 = rLm;
                    break;
                case 2:
                    ?? obj3 = new Object();
                    ((RLm) obj3).A01 = QoN.A01;
                    ((RLm) obj3).A00 = Typeface.DEFAULT_BOLD;
                    resources = elw.A00;
                    i = 2131964430;
                    rLm = obj3;
                    string = resources.getString(i);
                    rLm2 = rLm;
                    break;
                case 3:
                case 5:
                default:
                    0fH.A07(Elw.class, B7P, "Invalid request status %s provided");
                    ?? obj4 = new Object();
                    ((RLm) obj4).A01 = QoN.A03;
                    ((RLm) obj4).A00 = Typeface.DEFAULT_BOLD;
                    string = "";
                    rLm2 = obj4;
                    break;
                case 4:
                case 7:
                case 8:
                    ?? obj5 = new Object();
                    ((RLm) obj5).A01 = QoN.A02;
                    ((RLm) obj5).A00 = Typeface.DEFAULT;
                    resources = elw.A00;
                    i = 2131964449;
                    rLm = obj5;
                    string = resources.getString(i);
                    rLm2 = rLm;
                    break;
                case 6:
                    elw.A01.D11(Elw.class.getSimpleName(), "A TRANSFER_COMPLETED request is seen by the user.");
                    0fH.A07(Elw.class, B7P, "Invalid request status %s provided");
                    ?? obj42 = new Object();
                    ((RLm) obj42).A01 = QoN.A03;
                    ((RLm) obj42).A00 = Typeface.DEFAULT_BOLD;
                    string = "";
                    rLm2 = obj42;
                    break;
            }
            rLm2.A02 = string;
            ruZ = new RuZ(new RN8(new RYl(rLm2), A0F, A17, num, name), rua);
        }
        gFh.CrF(ruZ);
        return gFh;
    }
}
