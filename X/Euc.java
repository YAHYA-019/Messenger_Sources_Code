package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.mig.deprecated.bottomsheet.LegacyMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Euc.class */
public final class Euc {
    public LegacyMigBottomSheetDialogFragment A00;
    public final 1Br A01;
    public final 1Br A02 = 7zM.A0U();
    public final 1De A03;

    public Euc(1De r302) {
        this.A03 = r302;
        this.A01 = 7zM.A0h(r302, 100011);
    }

    public final void A00(Context context, Fragment fragment, 1Iw r304, MigColorScheme migColorScheme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        7zR.A1N(migColorScheme, context);
        11T.A0F(str8, 11);
        LegacyMigBottomSheetDialogFragment A05 = LegacyMigBottomSheetDialogFragment.A05(migColorScheme, false);
        C1em c1em = (C1em) AnonymousClass016.A00(context, C1em.class);
        1Br A01 = 1Bu.A01(context, 83979);
        FGd fGd = (FGd) 1De.A00(this.A03, 99824);
        Context context2 = r304.A0D;
        if (context2 == null) {
            throw 1BK.A0h();
        }
        FEN fen = (FEN) 1Bn.A0E(context2, (1BY) null, 98540);
        FGd.A01(EQr.A0C, fGd, str8);
        FEN.A01(fen, "web_auth_bottomsheet_dialog_show", str8);
        A05.A1C(c1em != null ? c1em.BDe() : null, new 8dH(new FXj(context, fragment, fen, A01, fGd, A05, str8, str6, str5, str7), new FXb(fen, A05, str8, 2), (1LI) null, migColorScheme, 7zN.A0e(new RIv(str2, (String) null, (String) null)), str, str3, str4), 8dH.class.toString());
    }
}
