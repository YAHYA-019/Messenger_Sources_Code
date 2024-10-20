package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: D0e.class */
public final class D0e implements DGS {
    public final FcM A00;

    public D0e(FbUserSession fbUserSession) {
        this.A00 = (FcM) 1Lo.A06(fbUserSession, 98928);
    }

    public /* bridge */ /* synthetic */ Object AQS(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BI6 bi6 = (BI6) ((C7a) it.next()).A02;
            if (bi6.setField_ == 8) {
                Ryw ryw = (Ryw) BI6.A00(bi6, 8);
                Long l = ryw.fetchTransferFbId;
                if (l != null) {
                    this.A00.A01(String.valueOf(l));
                } else {
                    Boolean bool = ryw.fetchPaymentMethods;
                    if (bool != null && bool.booleanValue()) {
                        this.A00.A00();
                    }
                }
            }
        }
        return new Object();
    }
}
