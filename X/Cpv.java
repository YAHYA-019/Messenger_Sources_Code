package X;

import android.content.Context;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

/* loaded from: Cpv.class */
public final class Cpv implements DIW {
    public 1BY A00;
    public ListenableFuture A01;
    public final Context A02 = 7zP.A0J();
    public final ExecutorService A06 = (ExecutorService) 1Bi.A03(16460);
    public final CGn A03 = (CGn) 1Bn.A0B(84597);
    public final COi A04 = AbJ.A0F();
    public final C1325Ae3 A05 = new C1325Ae3();

    public Cpv(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public void A5L(DFe dFe) {
        this.A05.A00(dFe);
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    public /* bridge */ /* synthetic */ C1323Ae1 Cpm(ByH byH, Object obj) {
        String str = (String) obj;
        synchronized (this) {
            if (4DQ.A03(this.A01)) {
                this.A01.cancel(true);
            }
            C30G A0H = AbF.A0H(15);
            A0H.A03("search_constraint", str != null ? str : "");
            A0H.A06("limit", 50);
            A0H.A08("is_optimized", true);
            CGn.A00(this.A03, A0H);
            C3sa A00 = C3sa.A00(A0H);
            AbstractC05414dq A08 = 1VX.A08(this.A02, 1Fw.A05(this.A00));
            4YV.A1B(A00);
            C03713yu A03 = A08.A03(A00);
            this.A01 = A03;
            1Kd.A0F(new C1609Amq(this, byH, str, 1), A03, this.A06);
        }
        return C1323Ae1.A05;
    }

    public String getFriendlyName() {
        return "PaymentP2pContactDataSource";
    }
}
