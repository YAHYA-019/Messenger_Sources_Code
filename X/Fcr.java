package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbui.widget.facepile.FacepileView;
import com.facebook.payments.p2p.messenger.core.prefs.transactions.MessengerPayHistoryLoaderResult;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Fcr.class */
public final class Fcr implements 2TV {
    public final int A00;
    public final Object A01;

    public Fcr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.fragment.app.Fragment, X.Da8] */
    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        if (1 - this.A00 == 0) {
            RQE rqe = (RQE) obj2;
            ?? r0 = (C2047Da8) this.A01;
            r0.A01.removeFooterView(r0.A00);
            0V5.A00(r0.A04, 1100593971);
            1BK.A09(r0.A0F).D0v(C2047Da8.class.getName(), rqe.toString());
            0fH.A0T(C2047Da8.class, "Loading of messenger pay history items with params %s failed with %s", DKG.A1b(rqe, obj));
            FI9.A01(r0.getContext(), rqe.A00, FI9.A00);
        }
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        if (this.A00 == 0) {
            C7om c7om = (C7om) obj;
            11T.A0H(c7om, obj2);
            if (!(obj2 instanceof E9n)) {
                obj2 = null;
            }
            C2j0 c2j0 = (C2j0) 1Br.A0B(((EnS) this.A01).A00);
            String str = c7om.A00;
            11T.A09(str);
            c2j0.A01(new 7fA(str, AnonymousClass001.A1T(obj2)));
        }
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
        if (1 - this.A00 == 0) {
            C2047Da8 c2047Da8 = (C2047Da8) this.A01;
            if (c2047Da8.A01.getFooterViewsCount() == 0) {
                c2047Da8.A01.addFooterView(c2047Da8.A00, null, false);
                0V5.A00(c2047Da8.A04, 1245225188);
            }
        }
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C2047Da8 c2047Da8 = (C2047Da8) this.A01;
                c2047Da8.A06 = (MessengerPayHistoryLoaderResult) obj2;
                C2047Da8.A03(c2047Da8);
                return;
            default:
                ImmutableList immutableList = (ImmutableList) obj2;
                11T.A0F(immutableList, 1);
                E7v e7v = (E7v) this.A01;
                CallerContext callerContext = E7v.A0I;
                ArrayList A1B = AbJ.A1B(immutableList);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    String A07 = ((User) it.next()).A07();
                    if (A07 != null) {
                        A1B.add(new RYM(C0A2.A03(A07)));
                    }
                }
                FacepileView facepileView = e7v.A01;
                if (facepileView != null) {
                    FacepileView.A04(facepileView, A1B);
                    FacepileView facepileView2 = e7v.A01;
                    if (facepileView2 != null) {
                        facepileView2.setVisibility(0);
                        FacepileView facepileView3 = e7v.A01;
                        if (facepileView3 != null) {
                            facepileView3.postInvalidate();
                            return;
                        }
                    }
                }
                11T.A0L("facepileView");
                throw 0Q8.createAndThrow();
        }
    }
}
