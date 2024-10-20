package X;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.sync.analytics.FullRefreshReason;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: D0a.class */
public final class D0a implements C54j {
    public final C1634Aoc A00 = (C1634Aoc) 1Bi.A03(85123);
    public final Jvl A01 = (Jvl) 1Bi.A03(131235);
    public final D0g A02;

    public D0a(FbUserSession fbUserSession) {
        this.A02 = (D0g) 1Lo.A06(fbUserSession, 85112);
    }

    @Override // X.C54j
    public FullRefreshReason Ani() {
        String A01 = this.A00.A01(BaB.A00);
        if (A01 == null) {
            A01 = "";
        }
        return FullRefreshReason.A00(A01);
    }

    @Override // X.C54j
    public long At9() {
        return this.A00.A00(BaB.A02, -1);
    }

    @Override // X.C54j
    public long AtD() {
        return this.A00.A00(BaB.A03, -1);
    }

    @Override // X.C54j
    public long AtH() {
        return this.A00.A00(BaB.A04, -1);
    }

    @Override // X.C54j
    public boolean BE2() {
        return this.A00.A05(BaB.A09);
    }

    @Override // X.C54j
    public String BE4() {
        return this.A00.A01(BaB.A0A);
    }

    @Override // X.C54j
    public /* bridge */ /* synthetic */ Bundle BLu(C7a c7a, Object obj) {
        SQLiteDatabase AUF = this.A01.AUF();
        C01m.A01(AUF, -1428112930);
        try {
            Bundle A00 = this.A02.AoX((BI6) c7a.A02).A00(c7a);
            this.A00.A03(BaB.A03, c7a.A00);
            AUF.setTransactionSuccessful();
            C01m.A03(AUF, 459286654);
            return A00;
        } catch (Throwable th) {
            try {
                C01m.A03(AUF, 459286654);
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    @Override // X.C54j
    public void Cbd(C7a c7a) {
    }

    @Override // X.C54j
    public void CqP(long j) {
        this.A00.A03(BaB.A02, j);
    }

    @Override // X.C54j
    public void CqR(long j) {
        this.A00.A03(BaB.A04, j);
    }

    @Override // X.C54j
    public void Cv5(FullRefreshReason fullRefreshReason, boolean z) {
        C1634Aoc c1634Aoc = this.A00;
        c1634Aoc.A04(BaB.A09, z ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
        c1634Aoc.A04(BaB.A00, fullRefreshReason.toString());
    }

    @Override // X.C54j
    public boolean CyG(C7a c7a) {
        return false;
    }
}
