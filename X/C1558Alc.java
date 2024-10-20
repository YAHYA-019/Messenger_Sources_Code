package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.model.Community;

/* renamed from: X.Alc, reason: case insensitive filesystem */
/* loaded from: Alc.class */
public final class C1558Alc extends 1pK implements 1pN {
    public static final String __redex_internal_original_name = "CommunityProfilePreviewPictureFragment";
    public FbUserSession A00;
    public LithoView A01;
    public C9ad A02;
    public CMt A03;
    public C5ic A04;
    public boolean A05;
    public final 1Br A06 = 1Bu.A00(83430);
    public final 1Br A07 = 7zN.A0I(this);
    public final 1Br A08 = 1Bu.A02(this, 83374);
    public final C01i A0A = DCw.A00(this, 38);
    public final C01i A09 = DCw.A00(this, 37);

    public static final 2cL A03(1Iw r301, C1558Alc c1558Alc) {
        2cM A00 = 2cK.A00(r301);
        C00i c00i = c1558Alc.A07.A00;
        7zM.A1O(A00, 7zM.A11(c00i));
        C5yw A002 = C5yv.A00(r301);
        int i = 2131954791;
        if (c1558Alc.A05) {
            i = 2131954785;
        }
        A002.A2a(i);
        A002.A2b(7zM.A11(c00i));
        A002.A2i(false);
        A002.A2Y();
        CxE.A01(A002, c1558Alc, 32);
        A002.A0N();
        AbH.A1Q(A00, A002);
        return 7zL.A0V(A00, new QHV((Uri) c1558Alc.A0A.getValue(), 7zM.A11(c00i), new DCw(c1558Alc, 39), c1558Alc.A05));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = ((1Fv) 1Bi.A03(66351)).A06(this);
        FbUserSession A06 = ((1Fv) 1Bi.A03(66351)).A06(this);
        this.A04 = 7zQ.A0l();
        this.A02 = (C9ad) 7zN.A0n(this, A06, 83373);
        this.A03 = (CMt) 7zN.A0n(this, A06, 83067);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        String str;
        CMt cMt = this.A03;
        if (cMt == null) {
            str = "communityProfileLogger";
        } else {
            C01i c01i = this.A09;
            long A07 = 7zU.A07((Community) c01i.getValue());
            long A0C = 7zQ.A0C((Community) c01i.getValue());
            long A0H = 7zQ.A0H(AbJ.A0n(this.A06));
            int i = 2;
            if (this.A05) {
                i = 1;
            }
            CMt.A00(cMt, (String) null, (String) null, 16, i, A07, A0C, A0H);
            if (this.A04 != null) {
                DR6 A0K = AbL.A0K(requireContext(), this.A07);
                A0K.A00(2131955813);
                A0K.A06(2131955810);
                CSG.A05(A0K, this, 47, 2131955812);
                A0K.A0B(CRe.A00, 2131955811);
                A0K.A05();
                return true;
            }
            str = "alertDialogBuilderFactory";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 1427143501);
        super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0M = 7zR.A0M(this);
        this.A01 = A0M;
        A0M.A0x(A03(AbF.A0U(A0M), this));
        LithoView lithoView = this.A01;
        if (lithoView == null) {
            11T.A0L("lithoView");
            throw 0Q8.createAndThrow();
        }
        0FI.A08(-1290859627, A04);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-78681717);
        super/*androidx.fragment.app.Fragment*/.onResume();
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
        0FI.A08(-809850483, A02);
    }
}
