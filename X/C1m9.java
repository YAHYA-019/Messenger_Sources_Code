package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.HashMap;

/* renamed from: X.1m9, reason: invalid class name */
/* loaded from: 1m9.class */
public final class C1m9 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1De A04;

    public C1m9(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A02 = 1Bq.A00(16617);
        this.A01 = 1Lm.A03(fbUserSession, r303.A00, 65779);
        this.A03 = 1Bq.A00(66723);
        this.A00 = 1Bq.A00(65755);
    }

    public HashMap A00() {
        HashMap hashMap = new HashMap(3);
        this.A01.A00.get();
        hashMap.put("ls_sv", "8904900936252025");
        String A04 = ((1Oe) this.A02.A00.get()).A04(C1fe.A2W);
        if (A04 == null) {
            A04 = "";
        }
        hashMap.put("ls_fdid", A04);
        if (((C1mA) this.A03.A00.get()).A02()) {
            hashMap.put("presence_msys_consumption_enabled", ConstantsKt.CAMERA_ID_BACK);
        }
        if (((1Ew) this.A00.A00.get()).AXy() == 0S2.A0C) {
            hashMap.put("user_auth_type_override", "IG");
        }
        return hashMap;
    }
}
