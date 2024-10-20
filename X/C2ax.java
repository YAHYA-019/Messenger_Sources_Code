package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.2ax, reason: invalid class name */
/* loaded from: 2ax.class */
public final class C2ax {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;

    public C2ax(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A05 = 1Bq.A00(65997);
        this.A07 = 1Bu.A00(68385);
        this.A06 = 1Lm.A01(fbUserSession, 68797);
        this.A04 = 1Bq.A00(99390);
        this.A03 = 1Bq.A00(68885);
    }

    public static final 9lI A00(C2ax c2ax) {
        return (9lI) c2ax.A07.A00.get();
    }

    public static final void A01(C2ax c2ax) {
        A00(c2ax).A05();
        A00(c2ax).A04();
        9lI A00 = A00(c2ax);
        0fH.A0j(7zK.A00(69), "resetValidationSuccessCount");
        1Ql edit = 9lI.A01(A00).edit();
        1G9 r0 = 1NK.A4r;
        11T.A0F(9lI.A00(A00), 1);
        edit.Cdj(C1wg.A02(r0));
        edit.commitImmediately();
    }

    public static final void A02(C2ax c2ax, boolean z) {
        0fH.A0j("PinReminderProvider", "updateFlagWhenPinReminderValidated");
        if (c2ax.A02) {
            return;
        }
        c2ax.A02 = true;
        if (z) {
            9hC r0 = (9hC) 1Br.A0B(c2ax.A06);
            9hC.A00(r0).flowAnnotateWithCrucialData(r0.A01, "PIN_VALIDATED", ConstantsKt.CAMERA_ID_BACK);
        }
        A00(c2ax).A04();
        9lI A00 = A00(c2ax);
        FbSharedPreferences A01 = 9lI.A01(A00);
        1G9 r02 = 1NK.A4r;
        int ArU = A01.ArU(C1wg.A03(r02, 9lI.A00(A00)), 0);
        int i = ArU + 1;
        0fH.A0j(7zK.A00(69), 0Pz.A0C(ArU, i, "increaseValidationSuccessCount from ", " to "));
        1Ql edit = 9lI.A01(A00).edit();
        edit.CaE(C1wg.A03(r02, 9lI.A00(A00)), i);
        edit.commitImmediately();
        A00(c2ax).A05();
    }
}
