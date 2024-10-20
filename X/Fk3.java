package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: Fk3.class */
public final class Fk3 implements C5ww {
    public final /* synthetic */ 06Z A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ 2JX A02;
    public final /* synthetic */ C1qb A03;
    public final /* synthetic */ Edo A04;
    public final /* synthetic */ FHk A05;
    public final /* synthetic */ GF3 A06;
    public final /* synthetic */ MigColorScheme A07;
    public final /* synthetic */ ImmutableList A08;
    public final /* synthetic */ Boolean A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    public Fk3(06Z r302, FbUserSession fbUserSession, 2JX r304, C1qb c1qb, Edo edo, FHk fHk, GF3 gf3, MigColorScheme migColorScheme, ImmutableList immutableList, Boolean bool, String str, boolean z) {
        this.A05 = fHk;
        this.A0A = str;
        this.A0B = z;
        this.A09 = bool;
        this.A01 = fbUserSession;
        this.A03 = c1qb;
        this.A07 = migColorScheme;
        this.A08 = immutableList;
        this.A00 = r302;
        this.A06 = gf3;
        this.A02 = r304;
        this.A04 = edo;
    }

    @Override // X.C5ww
    public void onClick(View view) {
        FHk fHk = this.A05;
        String str = this.A0A;
        FHk.A03(fHk, "pp_sync_toggle_pressed", "im_settings", str, (java.util.Map) null);
        if (this.A0B) {
            E1P e1p = this.A04.A00;
            e1p.A08 = "";
            e1p.A07 = "";
            E1P.A07(e1p, e1p.A04, "");
            F9r f9r = (F9r) e1p.A0H.get();
            FbUserSession fbUserSession = e1p.A00;
            fbUserSession.getClass();
            f9r.A02(fbUserSession, Rhr.A03(e1p.A04, "", "PROFILE_PHOTO"), FwL.A00(e1p, 25), (String) 1BK.A0r(Rhr.A01(e1p.A03)));
            return;
        }
        if (this.A09.booleanValue()) {
            ImmutableList immutableList = this.A08;
            if (1JF.A0B(DKF.A0U(immutableList, 0).A0B)) {
                return;
            }
            this.A06.CSi(null, DKF.A0U(immutableList, 0).A0B, "");
            return;
        }
        FbUserSession fbUserSession2 = this.A01;
        C1qb c1qb = this.A03;
        MigColorScheme migColorScheme = this.A07;
        ImmutableList immutableList2 = this.A08;
        06Z r0 = this.A00;
        GF3 gf3 = this.A06;
        2JX r02 = this.A02;
        String A0r = r02.A0r(-551945908);
        String str2 = A0r != null ? A0r : "";
        String A0r2 = r02.A0r(1436250972);
        F1u.A01(r0, fbUserSession2, c1qb, gf3, migColorScheme, immutableList2, str2, A0r2 != null ? A0r2 : "", DKG.A19(r02, "", -1496673235));
        FHk.A03(fHk, "photo_central_bottom_sheet_shown", "im_settings", str, (java.util.Map) null);
    }
}
