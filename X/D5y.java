package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.Iterator;

/* loaded from: D5y.class */
public final class D5y implements Runnable {
    public static final String __redex_internal_original_name = "BusinessInboxCatalogDataProvider$2";
    public final /* synthetic */ CIk A00;

    public D5y(CIk cIk) {
        this.A00 = cIk;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View, X.B4y] */
    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.A00.A06.iterator();
        while (it.hasNext()) {
            CnA cnA = (DEI) it.next();
            switch (cnA.A00) {
                case 0:
                    COd cOd = (COd) cnA.A01;
                    COd.A01(4YV.A0C(cOd.A00), cOd);
                    break;
                case 1:
                    ((C6R) cnA.A01).A00();
                    break;
                case 2:
                    ?? r0 = (B4y) cnA.A01;
                    FbUserSession A0C = 4YV.A0C(r0.getContext());
                    B4y.A02(A0C, r0);
                    B4y.A03(A0C, r0);
                    break;
                default:
                    ((BJB) cnA.A01).A1c();
                    break;
            }
        }
    }
}
