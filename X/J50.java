package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.Callable;

/* loaded from: J50.class */
public final class J50 implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public J50(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        GmO gmO;
        C3sa A00;
        String A0r;
        FbUserSession fbUserSession;
        switch (this.A00) {
            case 0:
                C30G A0H = AbF.A0H(29);
                String str = this.A02;
                11T.A0F(str, 0);
                A0H.A03("order_receipt_id", str);
                ((2Jf) A0H).A00.A04("item_count", 5);
                A00 = C3sa.A00(A0H);
                A00.A0A(600L);
                A00.A09(600L);
                gmO = (GmO) this.A01;
                CallerContext callerContext = GmO.A0Z;
                fbUserSession = gmO.A07;
                break;
            case 1:
                C30G A0H2 = AbF.A0H(29);
                String str2 = this.A02;
                11T.A0F(str2, 0);
                A0H2.A03("order_receipt_id", str2);
                ((2Jf) A0H2).A00.A04("item_count", 10);
                gmO = (GmO) this.A01;
                CallerContext callerContext2 = GmO.A0Z;
                2JX r0 = gmO.A0A;
                if (r0 != null && (A0r = r0.A0r(-77796550)) != null) {
                    A0H2.A03("item_after_cursor", A0r);
                }
                A00 = C3sa.A00(A0H2);
                A00.A0A(600L);
                A00.A09(600L);
                fbUserSession = gmO.A07;
                break;
            default:
                C30G A0H3 = AbF.A0H(31);
                A0H3.A03("shipment_id", this.A02);
                ((2Jf) A0H3).A00.A04("item_count", 20);
                ((2Jf) A0H3).A00.A04("event_count", 20);
                A00 = C3sa.A00(A0H3);
                A00.A0A(600L);
                A00.A09(600L);
                gmO = (C2723GmN) this.A01;
                CallerContext callerContext3 = C2723GmN.A0c;
                fbUserSession = gmO.A08;
                break;
        }
        fbUserSession.getClass();
        AbstractC05414dq A07 = 1VX.A07(gmO.requireContext(), fbUserSession);
        4YU.A1J(A00, 675975893060109L);
        return A07.A03(A00);
    }
}
