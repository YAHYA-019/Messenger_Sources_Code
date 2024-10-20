package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.1we, reason: invalid class name */
/* loaded from: 1we.class */
public final class C1we {
    public final 1Br A00 = 1Bq.A00(33013);
    public final 1Br A02 = 1Bu.A00(65998);
    public final 1Br A03 = 1Bq.A00(66243);
    public final 1Br A01 = 1Bu.A00(66524);

    public final void A00(FbUserSession fbUserSession, boolean z) {
        0fH.A0j("TableDropFlagManager", 0Pz.A1C("setUserOnboarded flag: ", z));
        0fH.A0j("TableDropFlagManager", 0Pz.A1C("setDBOnBoardedFlag flag: ", z));
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        ((1xC) 1Lo.A04(A00, fbUserSession, (1BY) null, 33148)).A07(new 1xD(), "ENCRYPTED_BACKUP_ONBOARDED_KEY", z);
        1Ql edit = ((FbSharedPreferences) this.A00.A00.get()).edit();
        1G9 r0 = 1NK.A5l;
        11T.A0F(this.A02.A00.get(), 1);
        edit.putBoolean(C1wg.A02(r0), z).commitImmediately();
    }
}
