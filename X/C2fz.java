package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.MontageBucketPreview;

/* renamed from: X.2fz, reason: invalid class name */
/* loaded from: 2fz.class */
public final class C2fz {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public C2fz(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A03 = r303;
        this.A01 = 1Bq.A00(67918);
        this.A00 = 1Lm.A03(fbUserSession, r303.A00, 33258);
        this.A02 = 1Bq.A00(67922);
    }

    public final boolean A00(MontageBucketPreview montageBucketPreview) {
        if ((montageBucketPreview != null ? montageBucketPreview.A04 : null) == null || !((2Kj) this.A01.A00.get()).A00()) {
            return false;
        }
        try {
            11T.A0A(montageBucketPreview.A06.id);
            return !((C4Nu) this.A00.A00.get()).A04.A04(Long.toString(Long.parseLong(r0)));
        } catch (NumberFormatException unused) {
            0fH.A18("MontageViewHelper", "Failed to parse user key: %s", new Object[]{montageBucketPreview.A06.id});
            return false;
        }
    }
}
