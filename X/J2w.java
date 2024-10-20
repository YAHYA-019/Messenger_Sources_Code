package X;

import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import java.util.Iterator;
import java.util.Map;

/* loaded from: J2w.class */
public final class J2w implements Runnable {
    public static final String __redex_internal_original_name = "OrcaRsysConnectFunnelProxy$annotateMultiple$1";
    public final /* synthetic */ Gwb A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ java.util.Map A02;
    public final /* synthetic */ java.util.Map A03;
    public final /* synthetic */ java.util.Map A04;

    public J2w(Gwb gwb, String str, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        this.A04 = map;
        this.A00 = gwb;
        this.A01 = str;
        this.A02 = map2;
        this.A03 = map3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator A0y = AnonymousClass001.A0y(this.A04);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            ((I9T) 1Br.A0B(this.A00.A00)).A04(this.A01, AnonymousClass001.A03(A0z.getKey()), 1BK.A16(A0z));
        }
        Iterator A0y2 = AnonymousClass001.A0y(this.A02);
        while (A0y2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
            ((I9T) 1Br.A0B(this.A00.A00)).A05(this.A01, AnonymousClass001.A03(A0z2.getKey()), AnonymousClass001.A1V(A0z2.getValue()));
        }
        Iterator A0y3 = AnonymousClass001.A0y(this.A03);
        while (A0y3.hasNext()) {
            Map.Entry A0z3 = AnonymousClass001.A0z(A0y3);
            int A03 = AnonymousClass001.A03(A0z3.getKey());
            long A08 = C3o5.A08(A0z3);
            I9T i9t = (I9T) 1Br.A0B(this.A00.A00);
            String str = this.A01;
            if (7zQ.A1a(i9t.A09)) {
                ConnectFunnel.CProxy.annotateMultipleTyped(str, null, null, 1BK.A1D(Integer.valueOf(A03), Long.valueOf(A08)));
            }
        }
    }
}
