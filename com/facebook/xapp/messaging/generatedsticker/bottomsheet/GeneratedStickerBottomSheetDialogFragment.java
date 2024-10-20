package com.facebook.xapp.messaging.generatedsticker.bottomsheet;

import X.0FI;
import X.0Gm;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Iw;
import X.1LH;
import X.1LI;
import X.AKL;
import X.AbstractC00603o4;
import X.C0A2;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: GeneratedStickerBottomSheetDialogFragment.class */
public final class GeneratedStickerBottomSheetDialogFragment extends MigBottomSheetDialogFragment {
    public ThreadKey A00;
    public Uri A01;
    public String A02;
    public final 1Br A03 = 1BK.A0C();

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        final Uri uri = this.A01;
        final String str = this.A02;
        final MigColorScheme A1F = A1F();
        final AKL akl = new AKL(this, 46);
        return new 1LH(uri, A1F, str, akl) { // from class: X.8a4
            public final Uri A00;
            public final MigColorScheme A01;
            public final String A02;
            public final C00m A03;

            {
                11T.A0F(A1F, 3);
                this.A00 = uri;
                this.A02 = str;
                this.A01 = A1F;
                this.A03 = akl;
            }

            public 1LI A0s(C2k5 c2k5) {
                11T.A0F(c2k5, 0);
                Uri uri2 = this.A00;
                if (uri2 == null) {
                    return null;
                }
                2lQ r0 = 2lO.A02;
                MigColorScheme migColorScheme = this.A01;
                2lO A0M = 7zT.A0M(7zT.A0g((2lO) null, 0S2.A00, migColorScheme.BDl()), 7zL.A03());
                C2sn A0L = 7zR.A0L(c2k5);
                1Iw AeS = A0L.AeS();
                5BH A0B = 7zN.A0B(uri2, AeS);
                A0B.A0z(160.0f);
                A0B.A0l(160.0f);
                A0B.A17(40.0f);
                A0B.A18(20.0f);
                A0B.A0L();
                7zU.A1A(A0B, A0L);
                2KD A0X = 7zN.A0X(AeS, migColorScheme, 0);
                String A00 = ((9Xj) 1Bi.A03(67739)).A00(7zL.A0A(AeS), this.A02);
                if (A00 == null) {
                    A00 = "";
                }
                A0X.A2z(A00);
                7zQ.A1Q(A0X);
                A0X.A18(40.0f);
                7zN.A1Q(A0L, A0X);
                8TZ A002 = C8nr.A00(AeS);
                A002.A2a(migColorScheme);
                A002.A2Y(2131957277);
                A002.A18(8.0f);
                A002.A2Z(83S.A00(this, 67));
                return 7zM.A0l(A002.A2W(), A0L, c2k5, A0M);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Uri uri;
        String string;
        int A02 = 0FI.A02(-1629293611);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Parcelable parcelable = null;
        if (bundle2 == null || (string = bundle2.getString("URI")) == null) {
            uri = null;
        } else {
            try {
                uri = C0A2.A03(string);
            } catch (SecurityException unused) {
                uri = null;
            }
        }
        this.A01 = uri;
        Bundle bundle3 = this.mArguments;
        this.A02 = bundle3 != null ? bundle3.getString("PROMPT") : null;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            parcelable = bundle4.getParcelable(AbstractC00603o4.A00(108));
        }
        Parcelable.Creator creator = ThreadKey.CREATOR;
        11T.A0B(creator);
        this.A00 = (ThreadKey) 0Gm.A01(creator, parcelable, ThreadKey.class);
        0FI.A08(954277338, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1739919882);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A0p();
        0FI.A08(-1444711291, A02);
    }
}
