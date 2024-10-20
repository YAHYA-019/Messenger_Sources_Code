package com.facebook.stickers.generatedstickers.bottomsheet;

import X.0FI;
import X.1BK;
import X.1Iw;
import X.1LH;
import X.1LI;
import X.9Lo;
import X.AYa;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: GeneratedStickerBottomSheetDialogFragment.class */
public final class GeneratedStickerBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public AYa A00;
    public String A01;
    public String A02;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        final String str = this.A02;
        if (str == null) {
            throw 1BK.A0h();
        }
        final MigColorScheme A1F = A1F();
        final String str2 = this.A01;
        final 9Lo r0 = new 9Lo(this);
        return new 1LH(A1F, r0, str, str2) { // from class: X.8a3
            public final MigColorScheme A00;
            public final 9Lo A01;
            public final String A02;
            public final String A03;

            {
                11T.A0F(A1F, 1);
                this.A00 = A1F;
                this.A03 = str;
                this.A02 = str2;
                this.A01 = r0;
            }

            public 1LI A0s(C2k5 c2k5) {
                1LI A2W;
                11T.A0F(c2k5, 0);
                1Iw r02 = c2k5.A05;
                FbUserSession A01 = 1Fw.A01(r02.A0D);
                2lQ r03 = 2lO.A02;
                MigColorScheme migColorScheme = this.A00;
                2lO A0M = 7zT.A0M(7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1)), 7zL.A03());
                C2sn A0U = 7zQ.A0U(r02);
                1Iw r04 = A0U.A00;
                C6qc c6qc = new C6qc(null, null, null, null, null, this.A03, null, 255, 0, true, false, false, false, false, false);
                8RJ r05 = new 8RJ(r04, new 8lX());
                8lX r06 = r05.A01;
                r06.A00 = A01;
                BitSet bitSet = r05.A02;
                bitSet.set(0);
                r06.A01 = c6qc;
                bitSet.set(1);
                r05.A0z(160.0f);
                r05.A0l(160.0f);
                r05.A17(40.0f);
                r05.A18(20.0f);
                r05.A0L();
                C1rs.A00(bitSet, r05.A03);
                r05.A0J();
                A0U.A00(r06);
                Context A0A = 7zL.A0A(r04);
                9Xj r07 = (9Xj) 1Bi.A03(67739);
                String str3 = this.A02;
                String A00 = r07.A00(A0A, str3);
                if (A00 == null) {
                    A00 = "";
                }
                if (A00.length() == 0) {
                    A2W = null;
                } else {
                    2KD A0X = 7zN.A0X(r04, migColorScheme, 0);
                    String A002 = ((9Xj) 1Bi.A03(67739)).A00(A0A, str3);
                    if (A002 == null) {
                        A002 = "";
                    }
                    A0X.A2z(A002);
                    7zQ.A1Q(A0X);
                    A0X.A18(40.0f);
                    A2W = A0X.A2W();
                }
                A0U.A00(A2W);
                8TZ A003 = C8nr.A00(r04);
                A003.A2a(migColorScheme);
                A003.A2b(3yH.A09(A0U, 2131957277));
                A003.A18(8.0f);
                A003.A2Z(83S.A00(this, 54));
                return 7zM.A0l(A003.A2W(), A0U, c2k5, A0M);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        String string;
        int A02 = 0FI.A02(-2088325736);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 == null || (string = bundle2.getString("STICKER_ID")) == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(2051680137, A02);
            throw A0h;
        }
        this.A02 = string;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString("PROMPT");
        }
        this.A01 = str;
        0FI.A08(-1744044152, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1650057914);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A0p();
        0FI.A08(1810724005, A02);
    }
}
