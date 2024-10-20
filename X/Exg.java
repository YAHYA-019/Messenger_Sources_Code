package X;

import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: Exg.class */
public abstract class Exg {
    public final GL5 A00;

    public Exg(GL5 gl5) {
        this.A00 = gl5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0041. Please report as an issue. */
    public GJp A00() {
        Eq3 eq3;
        GL5 gl5;
        String str;
        int i;
        if (this instanceof E55) {
            E55 e55 = (E55) this;
            if (1 - e55.A00 != 0) {
                return null;
            }
            return new Fkz(e55, 2);
        }
        if (!(this instanceof E54)) {
            return null;
        }
        E54 e54 = (E54) this;
        switch (e54.A00) {
            case 1:
                E5H e5h = (E5H) e54.A01;
                eq3 = e5h.A00;
                gl5 = (GL5) e54.A02;
                str = e5h.A03;
                return new Fl0(1Fw.A00(), gl5, eq3, str);
            case 2:
            case 3:
            default:
                return null;
            case 4:
                E5E e5e = (E5E) e54.A01;
                eq3 = (Eq3) e5e.A05.get();
                gl5 = (GL5) e54.A02;
                str = e5e.A03;
                return new Fl0(1Fw.A00(), gl5, eq3, str);
            case 5:
                E5F e5f = (E5F) e54.A01;
                eq3 = (Eq3) e5f.A07.get();
                gl5 = (GL5) e54.A02;
                str = e5f.A04;
                return new Fl0(1Fw.A00(), gl5, eq3, str);
            case 6:
                i = 3;
                return new Fkz(e54, i);
            case 7:
                i = 4;
                return new Fkz(e54, i);
        }
    }

    public void A01() {
        FHO fho;
        PaymentsLoggingSessionData paymentsLoggingSessionData;
        PaymentsFlowStep paymentsFlowStep;
        Object obj;
        FHO fho2;
        PaymentsLoggingSessionData paymentsLoggingSessionData2;
        PaymentsFlowStep paymentsFlowStep2;
        if (this instanceof E55) {
            E55 e55 = (E55) this;
            if (e55.A00 != 0) {
                E5D e5d = (E5D) e55.A01;
                e5d.A09.A04(PaymentsFlowStep.A0Y, e5d.A00);
                obj = e55.A03;
            } else {
                E5G e5g = (E5G) e55.A01;
                e5g.A02.A04(PaymentsFlowStep.A0H, e5g.A00);
                obj = e55.A04;
            }
        } else if (this instanceof E54) {
            E54 e54 = (E54) this;
            switch (e54.A00) {
                case 0:
                    E5G e5g2 = (E5G) e54.A01;
                    e5g2.A02.A04(PaymentsFlowStep.A0H, e5g2.A00);
                    obj = e54.A03;
                    break;
                case 1:
                    E5H e5h = (E5H) e54.A01;
                    fho2 = e5h.A04;
                    paymentsLoggingSessionData2 = e5h.A01;
                    paymentsFlowStep2 = PaymentsFlowStep.A0X;
                    break;
                case 2:
                    E5B e5b = (E5B) e54.A01;
                    fho2 = e5b.A02;
                    paymentsLoggingSessionData2 = e5b.A00;
                    paymentsFlowStep2 = PaymentsFlowStep.A0f;
                    break;
                case 3:
                    E58 e58 = (E58) e54.A01;
                    fho2 = e58.A02;
                    paymentsLoggingSessionData2 = e58.A00;
                    paymentsFlowStep2 = PaymentsFlowStep.A0i;
                    break;
                case 4:
                case 5:
                default:
                    return;
                case 6:
                    E5A e5a = (E5A) e54.A01;
                    fho2 = e5a.A02;
                    paymentsLoggingSessionData2 = e5a.A00;
                    paymentsFlowStep2 = PaymentsFlowStep.A0r;
                    break;
                case 7:
                    E5C e5c = (E5C) e54.A01;
                    fho2 = e5c.A03;
                    paymentsLoggingSessionData2 = e5c.A00;
                    paymentsFlowStep2 = PaymentsFlowStep.A2c;
                    break;
            }
            fho2.A04(paymentsFlowStep2, paymentsLoggingSessionData2);
            obj = e54.A02;
        } else {
            E53 e53 = (E53) this;
            switch (e53.A00) {
                case 0:
                    E5G e5g3 = (E5G) e53.A01;
                    fho = e5g3.A02;
                    paymentsLoggingSessionData = e5g3.A00;
                    paymentsFlowStep = PaymentsFlowStep.A0H;
                    break;
                case 1:
                    E5H e5h2 = (E5H) e53.A01;
                    fho = e5h2.A04;
                    paymentsLoggingSessionData = e5h2.A01;
                    paymentsFlowStep = PaymentsFlowStep.A0X;
                    break;
                case 2:
                default:
                    return;
                case 3:
                    E5D e5d2 = (E5D) e53.A01;
                    fho = e5d2.A09;
                    paymentsLoggingSessionData = e5d2.A00;
                    paymentsFlowStep = PaymentsFlowStep.A0Y;
                    break;
            }
            fho.A04(paymentsFlowStep, paymentsLoggingSessionData);
            obj = e53.A02;
        }
        ((GL5) obj).BzT();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x01f2. Please report as an issue. */
    public void A02(String str) {
        String str2;
        E5H e5h;
        GL5 gl5;
        GKX gkx;
        5iG r303;
        ListenableFuture A00;
        int i;
        C2084Db9 c2084Db9;
        Object obj;
        GL5 gl52;
        E5E e5e;
        GKX gkx2;
        5iG A0h;
        Executor A1E;
        ListenableFuture A04;
        int i2;
        1RN c2081Db6;
        Object obj2;
        Object obj3;
        if (this instanceof E55) {
            E55 e55 = (E55) this;
            if (e55.A00 != 0) {
                GL5 gl53 = (GL5) e55.A03;
                if (!str.equals(gl53.BCk("NUX_PIN_STORE"))) {
                    obj3 = e55.A04;
                    GKX gkx3 = (GKX) obj3;
                    gkx3.Cwz();
                    gkx3.AQn();
                    return;
                }
                E5D e5d = (E5D) e55.A01;
                GKX gkx4 = (GKX) e55.A04;
                e5d.A09.A05(PaymentsFlowStep.A0Y, e5d.A00, e5d.A01);
                gkx4.D0E();
                A0h = DKF.A0h(e5d.A07);
                A1E = 1BK.A1E(e5d.A08);
                FHI fhi = (FHI) e5d.A06.get();
                String A002 = GL5.A00(gl53);
                PaymentsLoggingSessionData paymentsLoggingSessionData = e5d.A00;
                A04 = fhi.A05(str, A002, paymentsLoggingSessionData != null ? paymentsLoggingSessionData.sessionId : null);
                c2081Db6 = new C2084Db9(gl53, e5d, gkx4, str, 7);
                obj2 = "CREATED_PIN_API_REQUEST";
                A0h.A05(c2081Db6, A04, obj2, A1E);
                return;
            }
            GL5 gl54 = (GL5) e55.A04;
            if (!str.equals(gl54.BCk("STORE_NEW_PIN"))) {
                obj3 = e55.A02;
                GKX gkx32 = (GKX) obj3;
                gkx32.Cwz();
                gkx32.AQn();
                return;
            }
            E5G e5g = (E5G) e55.A01;
            Object obj4 = e55.A03;
            GKX gkx5 = (GKX) e55.A02;
            String BCk = gl54.BCk("STORE_OLD_PIN");
            BCk.getClass();
            e5g.A02.A05(PaymentsFlowStep.A0H, e5g.A00, e5g.A01);
            gkx5.D0E();
            A0h = e5g.A08;
            A1E = e5g.A09;
            FHI fhi2 = e5g.A06;
            PaymentsLoggingSessionData paymentsLoggingSessionData2 = e5g.A00;
            A04 = fhi2.A04(gl54.AX2(), BCk, str, (String) null, paymentsLoggingSessionData2 != null ? paymentsLoggingSessionData2.sessionId : null);
            c2081Db6 = new C2075Db0(gl54, gkx5, obj4, e5g, str, 2);
            obj2 = "UPDATE_PIN_API_REQUEST";
            A0h.A05(c2081Db6, A04, obj2, A1E);
            return;
        }
        if (!(this instanceof E54)) {
            E53 e53 = (E53) this;
            int i3 = e53.A00;
            GL5 gl55 = (GL5) e53.A02;
            switch (i3) {
                case 0:
                    str2 = "STORE_NEW_PIN";
                    break;
                case 1:
                    str2 = "STORE_CREATED_PIN";
                    break;
                case 2:
                    str2 = "FORGOT_PIN_STORE";
                    break;
                case 3:
                    str2 = "NUX_PIN_STORE";
                    break;
                default:
                    str2 = "RESET_PIN_STORE";
                    break;
            }
            gl55.D36(str2, str);
            gl55.BfQ();
            return;
        }
        E54 e54 = (E54) this;
        switch (e54.A00) {
            case 0:
                E5G e5g2 = (E5G) e54.A01;
                GL5 gl56 = (GL5) e54.A03;
                GKX gkx6 = (GKX) e54.A02;
                e5g2.A02.A05(PaymentsFlowStep.A2Y, e5g2.A00, e5g2.A01);
                gkx6.D0E();
                A0h = e5g2.A08;
                A1E = e5g2.A09;
                FHI fhi3 = e5g2.A06;
                String A003 = GL5.A00(gl56);
                PaymentsLoggingSessionData paymentsLoggingSessionData3 = e5g2.A00;
                A04 = fhi3.A07(str, A003, paymentsLoggingSessionData3 != null ? paymentsLoggingSessionData3.sessionId : null);
                c2081Db6 = new C2084Db9(gkx6, e5g2, gl56, str, 1);
                obj2 = "VERIFY_PIN_API_REQUEST_BEFORE_CHANGE_PIN";
                A0h.A05(c2081Db6, A04, obj2, A1E);
                return;
            case 1:
                gl5 = (GL5) e54.A02;
                if (str.equals(gl5.BCk("STORE_CREATED_PIN"))) {
                    e5h = (E5H) e54.A01;
                    gkx = (GKX) e54.A03;
                    if (e5h.A06.A06() && "DISABLED".equals(gl5.B25())) {
                        e5h.A04.A05(PaymentsFlowStep.A0r, e5h.A01, e5h.A02);
                        gkx.D0E();
                        r303 = e5h.A07;
                        A00 = FHI.A00(e5h.A05, str, "ACTIVE", GL5.A00(gl5));
                        i = 3;
                        c2084Db9 = new C2084Db9(gl5, e5h, gkx, str, i);
                        obj = "ENABLE_PIN_API_REQUEST";
                        r303.A04(c2084Db9, A00, obj);
                        return;
                    }
                    e5h.A04.A05(PaymentsFlowStep.A0X, e5h.A01, e5h.A02);
                    gkx.D0E();
                    A0h = e5h.A07;
                    A1E = e5h.A08;
                    FHI fhi4 = e5h.A05;
                    String A004 = GL5.A00(gl5);
                    PaymentsLoggingSessionData paymentsLoggingSessionData4 = e5h.A01;
                    A04 = fhi4.A05(str, A004, paymentsLoggingSessionData4 != null ? paymentsLoggingSessionData4.sessionId : null);
                    c2081Db6 = new C2084Db9(gl5, e5h, gkx, str, 2);
                    obj2 = "CREATED_PIN_API_REQUEST";
                    A0h.A05(c2081Db6, A04, obj2, A1E);
                    return;
                }
                obj3 = e54.A03;
                GKX gkx322 = (GKX) obj3;
                gkx322.Cwz();
                gkx322.AQn();
                return;
            case 2:
                E5B e5b = (E5B) e54.A01;
                GL5 gl57 = (GL5) e54.A02;
                GKX gkx7 = (GKX) e54.A03;
                e5b.A02.A05(PaymentsFlowStep.A0f, e5b.A00, e5b.A01);
                gkx7.D0E();
                A0h = e5b.A05;
                A1E = e5b.A06;
                A04 = FHI.A00(e5b.A03, str, "DISABLED", GL5.A00(gl57));
                c2081Db6 = new C2084Db9(gl57, e5b, gkx7, str, 4);
                obj2 = "DISABLE_PIN_API_REQUEST";
                A0h.A05(c2081Db6, A04, obj2, A1E);
                return;
            case 3:
                E58 e58 = (E58) e54.A01;
                GL5 gl58 = (GL5) e54.A02;
                GKX gkx8 = (GKX) e54.A03;
                gkx8.D0E();
                e58.A02.A05(PaymentsFlowStep.A0i, e58.A00, e58.A01);
                r303 = e58.A04;
                A00 = FHI.A00(e58.A03, str, "DISABLED", GL5.A00(gl58));
                c2084Db9 = new C2084Db9(gl58, e58, gkx8, str, 5);
                obj = "DISABLE_PIN_API_REQUEST";
                r303.A04(c2084Db9, A00, obj);
                return;
            case 4:
                gl52 = (GL5) e54.A02;
                if (str.equals(gl52.BCk("FORGOT_PIN_STORE"))) {
                    e5e = (E5E) e54.A01;
                    e5e.A03 = str;
                    gkx2 = (GKX) e54.A03;
                    e5e.A09.A05(PaymentsFlowStep.A2T, e5e.A00, e5e.A01);
                    gkx2.D0E();
                    A0h = DKF.A0h(e5e.A07);
                    A1E = 1BK.A1E(e5e.A08);
                    FHI fhi5 = (FHI) e5e.A06.get();
                    String str3 = e5e.A03;
                    String str4 = e5e.A02;
                    PaymentsLoggingSessionData paymentsLoggingSessionData5 = e5e.A00;
                    A04 = fhi5.A04(gl52.AX2(), (String) null, str3, str4, paymentsLoggingSessionData5 != null ? paymentsLoggingSessionData5.sessionId : null);
                    i2 = 1;
                    c2081Db6 = new C2081Db6(i2, gkx2, gl52, e5e);
                    obj2 = "UPDATE_PIN_WITH_PASSWORD_API_REQUEST";
                    A0h.A05(c2081Db6, A04, obj2, A1E);
                    return;
                }
                obj3 = e54.A03;
                GKX gkx3222 = (GKX) obj3;
                gkx3222.Cwz();
                gkx3222.AQn();
                return;
            case 5:
                gl52 = (GL5) e54.A02;
                if (str.equals(gl52.BCk("RESET_PIN_STORE"))) {
                    e5e = (E5F) e54.A01;
                    ((E5F) e5e).A04 = str;
                    gkx2 = (GKX) e54.A03;
                    ((E5F) e5e).A0B.A05(PaymentsFlowStep.A2T, ((E5F) e5e).A01, ((E5F) e5e).A02);
                    gkx2.D0E();
                    A0h = DKF.A0h(((E5F) e5e).A09);
                    A1E = 1BK.A1E(((E5F) e5e).A0A);
                    FHI fhi6 = (FHI) ((E5F) e5e).A08.get();
                    String str5 = ((E5F) e5e).A04;
                    String str6 = ((E5F) e5e).A03;
                    PaymentsLoggingSessionData paymentsLoggingSessionData6 = ((E5F) e5e).A01;
                    A04 = fhi6.A04(gl52.AX2(), (String) null, str5, str6, paymentsLoggingSessionData6 != null ? paymentsLoggingSessionData6.sessionId : null);
                    i2 = 3;
                    c2081Db6 = new C2081Db6(i2, gkx2, gl52, e5e);
                    obj2 = "UPDATE_PIN_WITH_PASSWORD_API_REQUEST";
                    A0h.A05(c2081Db6, A04, obj2, A1E);
                    return;
                }
                obj3 = e54.A03;
                GKX gkx32222 = (GKX) obj3;
                gkx32222.Cwz();
                gkx32222.AQn();
                return;
            case 6:
                e5h = (E5A) e54.A01;
                gl5 = (GL5) e54.A02;
                gkx = (GKX) e54.A03;
                ((E5A) e5h).A02.A05(PaymentsFlowStep.A0r, ((E5A) e5h).A00, ((E5A) e5h).A01);
                gkx.D0E();
                r303 = ((E5A) e5h).A04;
                A00 = FHI.A00(((E5A) e5h).A03, str, "ACTIVE", GL5.A00(gl5));
                i = 9;
                c2084Db9 = new C2084Db9(gl5, e5h, gkx, str, i);
                obj = "ENABLE_PIN_API_REQUEST";
                r303.A04(c2084Db9, A00, obj);
                return;
            default:
                E5C e5c = (E5C) e54.A01;
                GL5 gl59 = (GL5) e54.A02;
                Object obj5 = e54.A03;
                A0h = e5c.A06;
                A1E = 1BK.A1E(e5c.A02);
                FHI fhi7 = e5c.A04;
                String A005 = GL5.A00(gl59);
                PaymentsLoggingSessionData paymentsLoggingSessionData7 = e5c.A00;
                A04 = fhi7.A07(str, A005, paymentsLoggingSessionData7 != null ? paymentsLoggingSessionData7.sessionId : null);
                c2081Db6 = new C2084Db9(gl59, e5c, obj5, str, 10);
                obj2 = "VERIFY_PIN_API_REQUEST";
                A0h.A05(c2081Db6, A04, obj2, A1E);
                return;
        }
    }
}
