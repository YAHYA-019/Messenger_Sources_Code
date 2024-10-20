package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.9up, reason: invalid class name */
/* loaded from: 9up.class */
public final class C9up implements C3lt {
    public C96q A00;
    public boolean A01;
    public final long A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;

    public C9up() {
        1Br A0T = 7zM.A0T();
        this.A04 = A0T;
        this.A02 = 4YV.A0Z(A0T).generateNewFlowId(231347097);
        this.A05 = 1Bu.A00(68891);
        this.A00 = C96q.A0L;
        this.A03 = 1Bq.A00(98472);
    }

    public static final UserFlowLogger A00(C9up c9up) {
        return 4YV.A0Z(c9up.A04);
    }

    public final void A01(C96q c96q, Integer num) {
        11T.A0F(num, 1);
        this.A00 = c96q;
        1Br r0 = this.A04;
        UserFlowLogger A0Z = 4YV.A0Z(r0);
        long j = this.A02;
        String obj = c96q.toString();
        7zN.A1Z(A0Z, obj, j, false);
        4YV.A0Z(r0).flowAnnotateWithCrucialData(j, "ENTRY_POINT", obj);
        4YV.A0Z(r0).flowAnnotateWithCrucialData(j, "EXPERIMENT", 1 - num.intValue() != 0 ? "HIGH_FRICTION" : "TEST3");
        this.A01 = true;
    }

    public final void A02(Integer num) {
        String str;
        UserFlowLogger A0Z = 4YV.A0Z(this.A04);
        long j = this.A02;
        switch (num.intValue()) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "FAILED";
                break;
            default:
                str = "TIMED_OUT";
                break;
        }
        A0Z.flowAnnotateWithCrucialData(j, "AUTO_RESTORE_STATUS", str);
    }

    public final void A03(Integer num) {
        if (!this.A01) {
            1Br.A0C(this.A05);
        }
        1Br r0 = this.A04;
        UserFlowLogger A0Z = 4YV.A0Z(r0);
        long j = this.A02;
        A0Z.flowAnnotateWithCrucialData(j, "RESTORE_TYPE", 9Bo.A00(num));
        4YV.A0Z(r0).flowEndSuccess(j);
        this.A01 = false;
    }

    public final void A04(Integer num) {
        String str;
        UserFlowLogger A0Z = 4YV.A0Z(this.A04);
        long j = this.A02;
        switch (num.intValue()) {
            case 4:
                str = "GOOGLE_DRIVE";
                break;
            case 5:
                str = "ONE_TIME_CODE";
                break;
            case 6:
                str = "PASSKEY";
                break;
            default:
                str = "GOOGLE_AUTO_BACKUP";
                break;
        }
        A0Z.flowAnnotateWithCrucialData(j, "ATTEMPTED_RESTORE_TYPE", str);
    }

    public final void A05(String str) {
        A07(str);
        4YV.A0Z(this.A04).flowEndCancel(this.A02, CancelReason.USER_CANCELLED);
        this.A01 = false;
    }

    public final void A06(String str) {
        11T.A0F(str, 0);
        A07(str);
        4YV.A0Z(this.A04).flowEndFail(this.A02, CancelReason.SYSTEM_CANCELLED, str);
        this.A01 = false;
    }

    public final void A07(String str) {
        11T.A0F(str, 0);
        if (!this.A01) {
            1Br.A0C(this.A05);
        }
        4YV.A0Z(this.A04).flowMarkPoint(this.A02, str);
    }

    public final void A08(String str) {
        4YV.A0Z(this.A04).flowAnnotate(this.A02, "EB_DEVICE_ID_KEY", str);
    }

    public final void A09(String str, String str2) {
        if (!this.A01) {
            1Br.A0C(this.A05);
        }
        4YV.A0Z(this.A04).flowAnnotate(this.A02, str, str2);
    }

    @Override // X.C3lt
    public void ATL(String str, String str2) {
        11T.A0H(str, str2);
        4YV.A0Z(this.A04).flowAnnotate(this.A02, str, str2);
    }

    @Override // X.C3lt
    public void ATN(String str) {
        11T.A0F(str, 0);
        A07(str);
    }
}
