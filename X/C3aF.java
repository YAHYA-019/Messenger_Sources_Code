package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3aF, reason: invalid class name */
/* loaded from: 3aF.class */
public final class C3aF implements 55F {
    public final /* synthetic */ 2SP A00;
    public final /* synthetic */ C9cs A01;

    public C3aF(2SP r302, C9cs c9cs) {
        this.A00 = r302;
        this.A01 = c9cs;
    }

    public void C2K() {
    }

    public void CUo() {
        Long valueOf = Long.valueOf(this.A00.A0B());
        C9cs c9cs = this.A01;
        String str = c9cs.A0B;
        String str2 = c9cs.A0C;
        String str3 = c9cs.A0D;
        boolean z = !c9cs.A02();
        C2z3 c2z3 = c9cs.A00;
        Long l = null;
        String str4 = c2z3 != null ? c2z3.A01 : null;
        String A00 = c9cs.A00();
        Integer num = c9cs.A01;
        if (num != null) {
            l = 1BK.A0l(num.intValue());
        }
        if (C3TS.A00 != null) {
            1UG A08 = 1BK.A08(1Br.A02(C3TS.A01), "messenger_jewel_notification_event");
            if (A08.isSampled()) {
                0DA r0 = new 0DA();
                r0.A01(3yU.A07, "major_surface");
                C34Q A002 = 1BM.A00(3yV.A0H, r0, valueOf);
                0DA r02 = new 0DA();
                r02.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                r02.A07("deduplication_id", str2);
                r02.A07("jewel_session_id", C3TS.A00);
                r02.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
                r02.A03(GOm.A00(28), Boolean.valueOf(z));
                r02.A07("section", str4);
                r02.A07("target_id", A00);
                0DA r03 = new 0DA();
                r03.A06("absolute_position", l);
                0DA r04 = new 0DA();
                r04.A01(3yQ.A06, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                r04.A02(A002, "badging");
                r04.A02(r02, "jewel_notification");
                r04.A02(r03, "ranking");
                1UG.A00(3yM.A02, r0, r04, A08);
            }
        }
    }
}
