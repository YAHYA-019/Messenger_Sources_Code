package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.Aeg, reason: case insensitive filesystem */
/* loaded from: Aeg.class */
public final class C1340Aeg extends 1pK implements JFq, 1vZ {
    public static final String __redex_internal_original_name = "CallStatusBarFragment";
    public ViewStub A01;
    public TextView A02;
    public View.OnClickListener A00 = CZF.A00(this, 97);
    public final C01i A05 = C01g.A01(new J9p(this, 21));
    public final C01i A06 = C01g.A01(new J9p(this, 22));
    public final 1Br A03 = 1Bu.A00(147681);
    public final 1Br A04 = 1Lm.A01((FbUserSession) this.A05.getValue(), 84148);
    public final C01i A07 = C01g.A01(new J9p(this, 23));

    public 1iF A1R() {
        return AbF.A0C(594492937905231L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    @Override // X.JFq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1340Aeg.CfQ(X.JDB):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1714279724);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132543559, false);
        0FI.A08(122699201, A02);
        return A0G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-532274646);
        super/*androidx.fragment.app.Fragment*/.onStart();
        AbI.A1S(this, this.A06);
        0FI.A08(-887971477, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(288733283);
        super/*androidx.fragment.app.Fragment*/.onStop();
        AbI.A1X(this.A06);
        0FI.A08(-817748892, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (ViewStub) 7zL.A0F(this, 2131362804);
    }
}
