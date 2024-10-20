package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.9uq, reason: invalid class name */
/* loaded from: 9uq.class */
public final class C9uq implements C3lt {
    public C96q A00;
    public C96c A01;
    public boolean A02;
    public final long A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;

    public C9uq() {
        this(231354803);
    }

    public C9uq(int i) {
        this.A07 = 7zM.A0T();
        this.A08 = 1Bu.A00(68891);
        this.A03 = 4YV.A0Z(this.A07).generateNewFlowId(i);
        this.A00 = C96q.A0L;
        this.A06 = 7zM.A0W();
        this.A05 = 1Bq.A00(98472);
        this.A04 = 7zM.A0d();
    }

    public static final UserFlowLogger A00(C9uq c9uq) {
        return 4YV.A0Z(c9uq.A07);
    }

    public static final void A01(C9uq c9uq, C96q c96q, C96m c96m, Integer num) {
        Integer num2;
        String str;
        1Br r0 = c9uq.A07;
        UserFlowLogger A0Z = 4YV.A0Z(r0);
        long j = c9uq.A03;
        String obj = c96q.toString();
        7zN.A1Z(A0Z, obj, j, false);
        4YV.A0Z(r0).flowAnnotateWithCrucialData(j, "ENTRY_POINT", obj);
        if (c96m != null) {
            UserFlowLogger A0Z2 = 4YV.A0Z(r0);
            switch (c96m.ordinal()) {
                case 0:
                case 1:
                case 9:
                    num2 = 0S2.A0N;
                    break;
                case 2:
                case 3:
                case 8:
                    num2 = 0S2.A0Y;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                default:
                    num2 = 0S2.A00;
                    break;
                case 10:
                    num2 = 0S2.A0j;
                    break;
            }
            switch (num2.intValue()) {
                case 0:
                    str = "TEST1_BASELINE";
                    break;
                case 1:
                    str = "ASYNC_PIN";
                    break;
                case 2:
                    str = "ASYNC_PIN_FALLBACK";
                    break;
                case 3:
                    str = "TEST3_PIN_FIRST";
                    break;
                case 4:
                    str = "TEST3_3P_FIRST";
                    break;
                default:
                    str = "NEW_USER_ONBOARDING_FLOW";
                    break;
            }
            A0Z2.flowAnnotateWithCrucialData(j, "EXPERIMENT", str);
        }
        if (num != null) {
            4YV.A0Z(r0).flowAnnotate(j, "SOFT_NUX_COUNT", num.intValue());
        }
        if (c96q == C96q.A0F) {
            1Br.A0C(c9uq.A08);
        }
        if (7zP.A0a(c9uq.A06).A09()) {
            try {
                Context A00 = FbInjector.A00();
                9H5 r02 = (9H5) 1Bn.A0A(68908);
                11T.A0D(A00);
                11T.A0F(A00, 0);
                int A03 = r02.A00.A03(A00);
                if (A03 == 0) {
                    0fH.A0j("SetupFlowLogger", "Google Play Services are available");
                    4YV.A0Z(r0).flowMarkPoint(j, "GDRIVE_GOOGLE_SERVICES_AVAILABLE");
                } else {
                    0fH.A0j("SetupFlowLogger", "Google Play Services are not available");
                    String str2 = (String) 7zN.A0r(9Fx.A01, A03);
                    if (str2 == null) {
                        str2 = "ERROR_GPLAY_OTHER";
                    }
                    4YV.A0Z(r0).flowAnnotate(j, JQw.A00(48), String.valueOf(A03));
                    4YV.A0Z(r0).flowMarkPoint(j, "GDRIVE_GOOGLE_SERVICES_NOT_AVAILABLE");
                    4YV.A0Z(r0).flowMarkPoint(j, str2);
                }
            } catch (Exception e) {
                0fH.A0s("SetupFlowLogger", "Failed to check Google Play Services availability", e);
                4YV.A0Z(r0).flowMarkPoint(j, "GDRIVE_GOOGLE_SERVICES_NOT_AVAILABLE");
                4YV.A0Z(r0).flowMarkPoint(j, "ERROR_GPLAY_OTHER");
            }
        }
        c9uq.A00 = c96q;
        c9uq.A02 = true;
    }

    public static final void A02(C9uq c9uq, C96c c96c, C00m c00m) {
        if (!c9uq.A02) {
            1Br.A0C(c9uq.A08);
        }
        if (c96c != null) {
            4YV.A0Z(c9uq.A07).flowAnnotateWithCrucialData(c9uq.A03, "SETUP_TYPE", c96c.type);
        }
        c00m.invoke();
        c9uq.A00 = C96q.A0L;
        c9uq.A01 = null;
    }

    public final void A03() {
        if (!this.A02) {
            1Br.A0C(this.A08);
        } else if (this.A00.finishEventOnBackPressed) {
            4YV.A0Z(this.A07).flowMarkPoint(this.A03, "EXIT_WITH_BACK_BUTTON");
        } else {
            A06("EXIT_WITH_BACK_BUTTON");
        }
        this.A02 = false;
    }

    public final void A04(C96c c96c) {
        if (this.A01 == null) {
            this.A01 = c96c;
            A0B("ATTEMPTED_SETUP_TYPE", c96c.toString());
        }
    }

    public final void A05(C96m c96m, Integer num) {
        C96q c96q;
        int ordinal = c96m.type.ordinal();
        if (ordinal == 0) {
            c96q = C96q.A0A;
        } else if (ordinal == 1) {
            c96q = C96q.A05;
        } else {
            if (ordinal != 2) {
                throw 1BK.A1F();
            }
            c96q = C96q.A04;
        }
        A01(this, c96q, c96m, num);
    }

    public final void A06(String str) {
        A02(this, null, new AKY(str, this, 13));
    }

    public final void A07(String str) {
        11T.A0F(str, 0);
        A02(this, null, new AKY(str, this, 14));
    }

    public final void A08(String str) {
        4YV.A0Z(this.A07).flowMarkPoint(this.A03, str);
    }

    public final void A09(String str) {
        A0B("LAST_SCREEN", 0Pz.A0W(str, 0DY.A0m(String.valueOf(1Br.A00(this.A04)), 5)));
    }

    public final void A0A(String str, String str2) {
        11T.A0F(str2, 1);
        4YV.A0Z(this.A07).flowAnnotate(this.A03, str, str2);
    }

    public final void A0B(String str, String str2) {
        11T.A0F(str2, 1);
        4YV.A0Z(this.A07).flowAnnotateWithCrucialData(this.A03, str, str2);
    }

    @Override // X.C3lt
    public void ATL(String str, String str2) {
        11T.A0H(str, str2);
        4YV.A0Z(this.A07).flowAnnotate(this.A03, str, str2);
    }

    @Override // X.C3lt
    public void ATN(String str) {
        11T.A0F(str, 0);
        A08(str);
    }
}
