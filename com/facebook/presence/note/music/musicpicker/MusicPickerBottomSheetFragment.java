package com.facebook.presence.note.music.musicpicker;

import X.06Z;
import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BM;
import X.1Br;
import X.1Uj;
import X.4LS;
import X.4LT;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zP;
import X.7zR;
import X.7zS;
import X.9De;
import X.9LY;
import X.9LZ;
import X.9xP;
import X.A03;
import X.AQp;
import X.AVr;
import X.C01i;
import X.C03i;
import X.C0ty;
import X.C8d2;
import X.C9ck;
import X.CpW;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: MusicPickerBottomSheetFragment.class */
public final class MusicPickerBottomSheetFragment extends BaseMigBottomSheetDialogFragment {
    public InputMethodManager A00;
    public 06Z A01;
    public FbUserSession A02;
    public LithoView A03;
    public C9ck A04;
    public String A05;
    public List A06;
    public Function2 A07;
    public boolean A08;
    public MigColorScheme A09;
    public final String A0B;
    public final C01i A0C;
    public final C01i A0D;
    public final 1Br A0A = 7zM.A0P();
    public final 4LS A0E = new CpW(this, 9);
    public final 4LT A0F = new 9xP(this);
    public final 9LZ A0H = new 9LZ(this);
    public final 9LY A0G = new 9LY(this);

    public MusicPickerBottomSheetFragment() {
        C03i c03i = C03i.A02;
        this.A0D = AQp.A00(this, c03i, 30);
        this.A0C = AQp.A00(this, c03i, 29);
        this.A07 = AVr.A00;
        this.A06 = C0ty.A00;
        this.A0B = 7zR.A0s();
        this.A05 = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r0.length() == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A05(com.facebook.presence.note.music.musicpicker.MusicPickerBottomSheetFragment r301) {
        /*
            r0 = r301
            X.9ck r0 = r0.A04
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L12
            java.lang.String r0 = "musicListFetcher"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L12:
            r0 = r301
            java.lang.String r0 = r0.A05
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L2d
            r0 = r303
            int r0 = r0.length()
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L30
        L2d:
            r0 = 1
            r306 = r0
        L30:
            r0 = r302
            r1 = 0
            r2 = r306
            com.google.common.util.concurrent.SettableFuture r0 = r0.A00(r1, r2)
            r304 = r0
            r0 = r301
            X.1Br r0 = r0.A0A
            java.util.concurrent.Executor r0 = X.4YV.A11(r0)
            r307 = r0
            r0 = r304
            r1 = r301
            r2 = r307
            r3 = 52
            X.AC8.A03(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.presence.note.music.musicpicker.MusicPickerBottomSheetFragment.A05(com.facebook.presence.note.music.musicpicker.MusicPickerBottomSheetFragment):void");
    }

    public static final void A08(MusicPickerBottomSheetFragment musicPickerBottomSheetFragment, Integer num) {
        String str;
        LithoView lithoView = musicPickerBottomSheetFragment.A03;
        if (lithoView != null) {
            List list = musicPickerBottomSheetFragment.A06;
            String str2 = musicPickerBottomSheetFragment.A05;
            MigColorScheme migColorScheme = musicPickerBottomSheetFragment.A09;
            if (migColorScheme != null) {
                lithoView.A0y(new C8d2(musicPickerBottomSheetFragment.A0E, musicPickerBottomSheetFragment.A0F, migColorScheme, musicPickerBottomSheetFragment.A0H, num, str2, list));
                return;
            }
            str = "colorScheme";
        } else {
            str = "lithoView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        Context requireContext = requireContext();
        List list = this.A06;
        String str = this.A05;
        MigColorScheme migColorScheme = this.A09;
        if (migColorScheme == null) {
            11T.A0L("colorScheme");
            throw 0Q8.createAndThrow();
        }
        LithoView A0W = 7zO.A0W(requireContext, this, new C8d2(this.A0E, this.A0F, migColorScheme, this.A0H, 0S2.A00, str, list));
        11T.A0D(A0W);
        this.A03 = A0W;
        return A0W;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        String str;
        int A02 = 0FI.A02(-361871339);
        super.onCreate(bundle);
        this.A00 = 7zS.A0C(requireContext());
        this.A02 = 1BM.A01(this);
        this.A09 = 7zS.A0j(this);
        FbUserSession fbUserSession = this.A02;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            C9ck c9ck = (C9ck) 7zN.A0m(this, fbUserSession, 68401);
            this.A04 = c9ck;
            if (c9ck != null) {
                9LY r0 = this.A0G;
                11T.A0F(r0, 0);
                if (c9ck.A00 != null) {
                    c9ck.A01();
                }
                c9ck.A00 = r0;
                1Uj mailboxProvider = 7zP.A0d(c9ck.A08).getMailboxProvider();
                if (mailboxProvider != null) {
                    mailboxProvider.A06(new A03(c9ck, 12));
                }
                A05(this);
                0FI.A08(-58652664, A02);
                return;
            }
            str = "musicListFetcher";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-474396510);
        super.onDestroy();
        C9ck c9ck = this.A04;
        if (c9ck == null) {
            11T.A0L("musicListFetcher");
            throw 0Q8.createAndThrow();
        }
        c9ck.A01();
        0FI.A08(485739725, A02);
    }
}
