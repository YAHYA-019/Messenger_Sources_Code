package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.deprecated.bottomsheet.LegacyMigBottomSheetDialogFragment;
import com.facebook.user.model.UserKey;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;

/* loaded from: Cwv.class */
public final class Cwv implements AnonymousClass553 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public Cwv(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj2;
    }

    @Override // X.AnonymousClass553
    public void onClick(View view) {
        String str;
        String str2;
        AmK amK;
        UserKey A0X;
        ListenableFuture A00;
        int i;
        switch (this.A00) {
            case 0:
                ((GF3) this.A01).CSi((LegacyMigBottomSheetDialogFragment) this.A02, this.A03, this.A04);
                return;
            case 1:
                C0m c0m = (C0m) this.A02;
                str = this.A03;
                str2 = this.A04;
                amK = c0m.A00;
                if (amK.A0C != null) {
                    1Ew A09 = AbI.A09();
                    A0X = 1BK.A0X(str);
                    if (amK.A07.A06(amK.A0C) && A09.AXy() != 0S2.A0C) {
                        CCh cCh = amK.A0A;
                        FbUserSession fbUserSession = amK.A01;
                        fbUserSession.getClass();
                        long j = amK.A0B.A04;
                        11T.A0F(str, 2);
                        A00 = CCh.A00(fbUserSession, cCh, 0S2.A01, str, "THREAD_DETAILS", j);
                        i = 1;
                        break;
                    } else {
                        if (ThreadKey.A0a(amK.A0B) || A09.AXy() == 0S2.A0C) {
                            AmK.A0C(amK, str2, Arrays.asList(Long.decode(str)), false);
                        } else {
                            CbX cbX = (CbX) amK.A0R.get();
                            FbUserSession fbUserSession2 = amK.A01;
                            fbUserSession2.getClass();
                            cbX.A05(fbUserSession2, new ClK(amK, A0X, str2), amK.A0B, A0X, false);
                        }
                        amK.A0Y.add(A0X);
                        AmK.A0A(amK);
                    }
                } else {
                    return;
                }
                break;
            default:
                C0m c0m2 = (C0m) this.A02;
                str = this.A03;
                str2 = this.A04;
                amK = c0m2.A00;
                if (amK.A0C != null) {
                    1Ew A092 = AbI.A09();
                    A0X = 1BK.A0X(str);
                    if (amK.A07.A06(amK.A0C) && A092.AXy() != 0S2.A0C) {
                        CCh cCh2 = amK.A0A;
                        FbUserSession fbUserSession3 = amK.A01;
                        fbUserSession3.getClass();
                        long j2 = amK.A0B.A04;
                        i = 2;
                        11T.A0F(str, 2);
                        A00 = CCh.A00(fbUserSession3, cCh2, 0S2.A00, str, "THREAD_DETAILS", j2);
                        break;
                    } else {
                        if (ThreadKey.A0a(amK.A0B) || A092.AXy() == 0S2.A0C) {
                            AmK.A0C(amK, str2, Arrays.asList(Long.decode(str)), true);
                        } else {
                            CbX cbX2 = (CbX) amK.A0R.get();
                            FbUserSession fbUserSession4 = amK.A01;
                            fbUserSession4.getClass();
                            cbX2.A05(fbUserSession4, new ClL(amK, A0X, str2), amK.A0B, A0X, true);
                        }
                        amK.A0Y.add(A0X);
                        AmK.A0A(amK);
                    }
                } else {
                    return;
                }
                break;
        }
        1Kd.A0D(amK.A0V, new C1612Amt(amK, A0X, str2, str, i), A00);
        amK.A0Y.add(A0X);
        AmK.A0A(amK);
    }
}
