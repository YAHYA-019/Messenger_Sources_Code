package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Akl, reason: case insensitive filesystem */
/* loaded from: Akl.class */
public final class C1532Akl extends 1pK {
    public static final String __redex_internal_original_name = "RestrictedListFragment";
    public CFM A00;
    public CFX A01;
    public FbUserSession A02;
    public final C01i A03 = DCy.A00(this, 47);
    public final C01i A04 = DCy.A00(this, 48);
    public final C01i A05 = C01g.A01(DCm.A00);
    public final C01i A06 = C01g.A01(DCn.A00);

    public 1iF A1R() {
        return AbN.A0B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A02 = 1BM.A01(this);
        Context A0C = 7zM.A0C(this, 147905);
        FbUserSession fbUserSession = this.A02;
        if (fbUserSession != null) {
            this.A01 = new CFX(A0C, fbUserSession);
            Context A0C2 = 7zM.A0C(this, 83169);
            FbUserSession fbUserSession2 = this.A02;
            if (fbUserSession2 != null) {
                this.A00 = new CFM(A0C2, fbUserSession2);
                return;
            }
        }
        11T.A0L("fbUserSession");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1X(ThreadKey threadKey) {
        ((6HS) 7zO.A0m(this, 50024)).A07(threadKey, "restricted_list_fragment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(742075936);
        LithoView A0O = AbK.A0O(this);
        CFM cfm = this.A00;
        if (cfm == null) {
            11T.A0L("renderer");
            throw 0Q8.createAndThrow();
        }
        MigColorScheme migColorScheme = (MigColorScheme) this.A03.getValue();
        CxE A00 = CxE.A00(this, ActionId.ON_VIEW_CREATED_END);
        Cx1 A01 = Cx1.A01(this, 50);
        CZF A002 = CZF.A00(this, 85);
        11T.A0F(migColorScheme, 1);
        cfm.A01 = A0O;
        cfm.A03 = migColorScheme;
        cfm.A04 = A00;
        cfm.A02 = A01;
        cfm.A00 = A002;
        0FI.A08(-1403307802, A02);
        return A0O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(2007025835);
        CFX cfx = this.A01;
        if (cfx == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        cfx.A00 = null;
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(1965739702, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1283405242);
        CFX cfx = this.A01;
        if (cfx == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        cfx.A02.A01();
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(1859261826, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1748784366);
        super/*androidx.fragment.app.Fragment*/.onResume();
        CFX cfx = this.A01;
        if (cfx == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        cfx.A02.A00();
        CFX.A00(cfx);
        0FI.A08(2050617391, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A05.getValue();
        Context requireContext = requireContext();
        FbUserSession fbUserSession = this.A02;
        if (fbUserSession == null) {
            str = "fbUserSession";
        } else {
            new 2Vg(requireContext, fbUserSession).A00(this);
            CFX cfx = this.A01;
            if (cfx == null) {
                str = "presenter";
            } else {
                cfx.A00 = this;
                CFM cfm = this.A00;
                if (cfm != null) {
                    CFM.A00(cfm, C0ty.A00, true);
                    return;
                }
                str = "renderer";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
