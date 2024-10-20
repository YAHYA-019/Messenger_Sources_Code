package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rq.class */
public final class C09864rq {
    public final C15h A03 = new C15h() { // from class: X.4rr
        @Override // X.C15h
        public /* bridge */ /* synthetic */ Object get() {
            return 1Fw.A04((1EZ) 1Bn.A0A(16428));
        }
    };
    public final 1Br A00 = 1Bu.A00(131242);
    public final 1Br A02 = 1Bq.A00(33013);
    public final 1Br A01 = 1Bq.A00(83603);

    public TriState A00() {
        TriState triState;
        1G1 r0 = (FbUserSession) this.A03.get();
        if (!r0.A07) {
            1G2 A0D = C09384py.A02.A0D(r0.A02);
            if (A0D != null) {
                triState = ((FbSharedPreferences) this.A02.A00.get()).AZo(A0D);
                11T.A0D(triState);
                0fH.A0g(triState, "ContactUploadStatusHelperImpl", "CCU: new pref get %s");
                return triState;
            }
        }
        triState = TriState.UNSET;
        11T.A0D(triState);
        0fH.A0g(triState, "ContactUploadStatusHelperImpl", "CCU: new pref get %s");
        return triState;
    }

    public void A01(boolean z) {
        1G1 r0 = (FbUserSession) this.A03.get();
        if (!r0.A07) {
            1G2 A0D = C09384py.A02.A0D(r0.A02);
            if (A0D != null) {
                ((FbSharedPreferences) this.A02.A00.get()).edit().putBoolean(A0D, z).commit();
            }
        }
        this.A01.A00.get();
        if (A02() != z) {
            KmP kmP = (KmP) 1Br.A0B(this.A00);
            kmP.A05.A0A(kmP.A04, DKB.A00(560), 0, z ? "on" : "off");
        }
    }

    public boolean A02() {
        return A00().asBoolean(false);
    }
}
