package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3Qy, reason: invalid class name */
/* loaded from: 3Qy.class */
public final class C3Qy {
    public 1BY A00;
    public final COq A05 = (COq) 1Bn.A0E((Context) null, (1BY) null, 84206);
    public final C00i A02 = 1BQ.A00();
    public final 2eG A03 = (2eG) 1Bi.A03(66489);
    public final 1fF A04 = (1fF) 1Bi.A03(66655);
    public final C00i A01 = 1BV.A01((1BY) null, 84136);

    public C3Qy(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static final C3Qy A00(1BO r301) {
        return new C3Qy(r301);
    }

    public boolean A01() {
        try {
            0fH.A0l("UnifiedScoreSyncRunner", "Running UnifiedScoreSyncRunner");
            FbUserSession A05 = 1Fw.A05(this.A00);
            COq cOq = this.A05;
            1I0 r0 = new 1I0(4);
            if (1Br.A06(this.A03.A01).AZk(2342154427965836075L)) {
                r0.A05(2To.A0A);
            }
            r0.A05(2To.A0K);
            r0.A05(2To.A0H);
            r0.A05(2To.A08);
            r0.A05(2To.A06);
            r0.A05(2To.A02);
            if (!1BK.A0N(this.A02).AZk(36322375213532637L)) {
                r0.A05(2To.A0B);
            }
            1fF r02 = this.A04;
            if (1fF.A00(r02).AZk(36325222777311708L) || !1fF.A00(r02).AZk(36316671497349544L)) {
                r0.A05(1fF.A00(r02).AZk(36323345876863484L) ? 2To.A0J : 2To.A0G);
            }
            if (1fF.A00(r02).AZk(36325222777246171L)) {
                r0.A05(2To.A0D);
            }
            if (((C1n) this.A01.get()).A00()) {
                r0.A05(2To.A03);
                r0.A05(2To.A04);
                r0.A05(2To.A05);
            }
            cOq.A02(A05, r0.A07());
            0fH.A0l("UnifiedScoreSyncRunner", "Finished running UnifiedScoreSyncRunner");
            return true;
        } catch (Exception e) {
            0fH.A0w("UnifiedScoreSyncRunner", "Exception running UnifiedScoreSyncRunner", e);
            return false;
        }
    }
}
