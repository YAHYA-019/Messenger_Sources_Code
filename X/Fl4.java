package X;

import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: Fl4.class */
public final class Fl4 implements GFO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Fl4(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CAu(String str) {
        GL5 gl5;
        Object obj;
        F9H f9h;
        long B2w;
        int i;
        E57 e57;
        E5F e5f;
        GL5 gl52;
        GLi gLi;
        5iG A0h;
        Executor A1E;
        ListenableFuture A06;
        int i2;
        int i3 = this.A00;
        Object obj2 = this.A01;
        switch (i3) {
            case 0:
                E57 e572 = (E57) obj2;
                gl5 = (GL5) this.A02;
                obj = this.A03;
                f9h = e572.A03;
                B2w = gl5.B2w();
                i = 0;
                e57 = e572;
                break;
            case 1:
                e5f = (E5E) obj2;
                gl52 = (GL5) this.A02;
                gLi = (GLi) this.A03;
                ((E5E) e5f).A09.A05(PaymentsFlowStep.A2b, ((E5E) e5f).A00, ((E5E) e5f).A01);
                gLi.D0E();
                A0h = DKF.A0h(((E5E) e5f).A07);
                A1E = 1BK.A1E(((E5E) e5f).A08);
                FHI fhi = (FHI) ((E5E) e5f).A06.get();
                String A00 = GL5.A00(gl52);
                PaymentsLoggingSessionData paymentsLoggingSessionData = ((E5E) e5f).A00;
                A06 = fhi.A06(str, A00, paymentsLoggingSessionData != null ? paymentsLoggingSessionData.sessionId : null);
                i2 = 6;
                A0h.A05(new C2084Db9(gl52, e5f, gLi, str, i2), A06, "VERIFY_PASSWORD_API_REQUEST", A1E);
                return;
            case 2:
                E59 e59 = (E59) obj2;
                gl5 = (GL5) this.A02;
                obj = this.A03;
                f9h = e59.A03;
                B2w = gl5.B2w();
                i = 1;
                e57 = e59;
                break;
            default:
                e5f = (E5F) obj2;
                gl52 = (GL5) this.A02;
                gLi = (GLi) this.A03;
                e5f.A0B.A05(PaymentsFlowStep.A2b, e5f.A01, e5f.A02);
                gLi.D0E();
                A0h = DKF.A0h(e5f.A09);
                A1E = 1BK.A1E(e5f.A0A);
                FHI fhi2 = (FHI) e5f.A08.get();
                String A002 = GL5.A00(gl52);
                PaymentsLoggingSessionData paymentsLoggingSessionData2 = e5f.A01;
                A06 = fhi2.A06(str, A002, paymentsLoggingSessionData2 != null ? paymentsLoggingSessionData2.sessionId : null);
                i2 = 8;
                A0h.A05(new C2084Db9(gl52, e5f, gLi, str, i2), A06, "VERIFY_PASSWORD_API_REQUEST", A1E);
                return;
        }
        f9h.A01 = F9H.A00(new F5g(null, "p2p_pin_delete_fail", "p2p_pin_deleted"), new E4z(i, obj, gl5, e57), f9h, new Fvk(f9h, str, B2w), f9h.A01);
    }
}
