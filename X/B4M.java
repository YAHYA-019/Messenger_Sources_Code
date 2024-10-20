package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.events.creation.EventCreationState;

/* loaded from: B4M.class */
public final class B4M extends AbstractC1551Al6 implements 1pN {
    public static final String __redex_internal_original_name = "StandaloneEventCreationFragment";
    public FbUserSession A00;
    public 1pI A01;
    public LithoView A02;
    public String A03;
    public String A04;
    public final 2S3 A05 = new 2S3(this, __redex_internal_original_name);
    public final DGi A06 = new Ciu(this);
    public final Bd3 A07 = new Bd3(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(B4M b4m) {
        if (CNk.A00(b4m).A0B || CNk.A00(b4m).A09) {
            return;
        }
        DR6 A0K = AbL.A0K(7zM.A0C(b4m, 67527), ((AbstractC1551Al6) b4m).A06);
        A0K.A00(2131957316);
        A0K.A06(2131957335);
        A0K.A09(CSG.A00(b4m, 48));
        A0K.A05();
    }

    public static final void A06(B4M b4m) {
        LithoView lithoView = b4m.A02;
        if (lithoView == null) {
            11T.A0L("titlebarView");
            throw 0Q8.createAndThrow();
        }
        lithoView.post(new D5W(b4m));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (X.R0S.A00(r301.requireContext(), X.CNk.A00(r301)) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0140, code lost:
    
        if (r301.A03 != null) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A07(X.B4M r301) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B4M.A07(X.B4M):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1J() {
        super.A1J();
        A07(this);
        if (!11T.A0O(super.A04, "location")) {
            A1Z("create_event");
        }
        C0H c0h = (C0H) 7zO.A0m(this, 82814);
        long j = super.A00;
        int[] iArr = new int[0];
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        c0h.A00(fbUserSession, new DCC(this, 2), iArr, j, true, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1551Al6
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = 1BM.A01(this);
        ((C0L) 7zO.A0m(this, 83315)).A00(BOr.A0m, super.A00);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bkd() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.litho.LithoView r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L12
            java.lang.String r0 = "titlebarView"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L12:
            r0 = r302
            X.C5fi.A01(r0)
            r0 = r301
            java.lang.String r0 = r0.A04
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L54
            r0 = r303
            int r0 = r0.hashCode()
            r304 = r0
            java.lang.String r0 = "location"
            r305 = r0
            r0 = r304
            switch(r0) {
                case -4084754: goto L5a;
                case 214947003: goto L71;
                case 1557721666: goto L77;
                case 1901043637: goto L84;
                default: goto L54;
            }
        L54:
            r0 = r301
            A06(r0)
        L58:
            r0 = 1
            return r0
        L5a:
            java.lang.String r0 = "external_link"
            r302 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L54
            r0 = r301
            r1 = r305
            r0.A1Z(r1)
            goto L58
        L71:
            java.lang.String r0 = "select_chat"
            r302 = r0
            goto L7b
        L77:
            java.lang.String r0 = "details"
            r302 = r0
        L7b:
            r0 = r303
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            goto L8b
        L84:
            r0 = r303
            r1 = r305
            boolean r0 = r0.equals(r1)
            r304 = r0
        L8b:
            r0 = r304
            if (r0 == 0) goto L54
            java.lang.String r0 = "create_event"
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A1Z(r1)
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B4M.Bkd():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1551Al6
    public void onAttachFragment(Fragment fragment) {
        C1542Akv c1542Akv;
        11T.A0F(fragment, 0);
        super.onAttachFragment(fragment);
        Bd2 bd2 = new Bd2(this);
        if (!(fragment instanceof C1542Akv) || (c1542Akv = (C1542Akv) fragment) == null) {
            return;
        }
        c1542Akv.A02 = bd2;
        long j = c1542Akv.A00;
        String valueOf = j == ((long) (-1)) ? null : String.valueOf(j);
        B4M b4m = bd2.A00;
        b4m.A03 = valueOf;
        A07(b4m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1012010252);
        this.A02 = 7zR.A0M(this);
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        linearLayout.setImportantForAccessibility(2);
        LithoView lithoView = this.A02;
        if (lithoView == null) {
            11T.A0L("titlebarView");
            throw 0Q8.createAndThrow();
        }
        linearLayout.addView(lithoView);
        FrameLayout A08 = AbJ.A08(this);
        A08.setId(AbstractC1551Al6.A09);
        A08.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        linearLayout.addView(A08);
        0FI.A08(-122908447, A02);
        return linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1551Al6
    public void onViewCreated(View view, Bundle bundle) {
        EventCreationState A00;
        EventCreationState A002;
        EventCreationState A003;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = 1vD.A00(view);
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession != null) {
            if (!((22F) 7zN.A0m(this, fbUserSession, 33174)).A00(33, super.A00)) {
                CNk A1X = A1X();
                A002 = EventCreationState.A00(A1X.A02(), null, null, null, null, null, null, null, null, null, 3839, false);
                A1X.A03(A002);
                CNk A1X2 = A1X();
                A003 = EventCreationState.A00(A1X2.A02(), null, null, null, null, null, null, null, null, null, 3071, true);
                A1X2.A03(A003);
            }
            FbUserSession fbUserSession2 = this.A00;
            if (fbUserSession2 != null) {
                if (!((22F) 7zN.A0m(this, fbUserSession2, 33174)).A00(52, super.A00)) {
                    CNk A1X3 = A1X();
                    A00 = EventCreationState.A00(A1X3.A02(), null, null, null, null, null, null, null, null, null, 3583, false);
                    A1X3.A03(A00);
                }
                A03(this);
                CNk A1X4 = A1X();
                CaE.A03(this, A1X4.A00, new AKM(this, 1), 36);
                return;
            }
        }
        7zL.A1C();
        throw 0Q8.createAndThrow();
    }
}
