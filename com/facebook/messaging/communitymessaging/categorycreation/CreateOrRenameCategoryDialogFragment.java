package com.facebook.messaging.communitymessaging.categorycreation;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.2KD;
import X.2Ov;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zR;
import X.7zV;
import X.8TS;
import X.8oX;
import X.AbI;
import X.AbM;
import X.AeI;
import X.AnonymousClass001;
import X.BzH;
import X.C1296Ad8;
import X.C1qo;
import X.C2121Dea;
import X.CSF;
import X.CSG;
import X.DKS;
import X.DMV;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.view.Window;
import android.widget.Button;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Map;

/* loaded from: CreateOrRenameCategoryDialogFragment.class */
public final class CreateOrRenameCategoryDialogFragment extends 2Ov {
    public static final BzH A07 = new Object();
    public LithoView A00;
    public ThreadKey A01;
    public Long A02;
    public String A03 = "";
    public String A04 = "";
    public String A05;
    public C1296Ad8 A06;

    public static final void A05(CreateOrRenameCategoryDialogFragment createOrRenameCategoryDialogFragment) {
        Button button;
        String str = createOrRenameCategoryDialogFragment.A03;
        int A05 = 7zQ.A05(str);
        boolean z = false;
        if (1 <= A05 && A05 < 31 && !11T.A0O(str, createOrRenameCategoryDialogFragment.A05)) {
            z = true;
        }
        DMV dmv = ((0D2) createOrRenameCategoryDialogFragment).A01;
        if (dmv == null || (button = dmv.A00.A0F) == null) {
            return;
        }
        button.setEnabled(z);
    }

    public static final void A06(CreateOrRenameCategoryDialogFragment createOrRenameCategoryDialogFragment, String str, Map map) {
        String str2;
        C1296Ad8 c1296Ad8 = createOrRenameCategoryDialogFragment.A06;
        if (c1296Ad8 == null) {
            str2 = "communityMessagingLogger";
        } else {
            ThreadKey threadKey = createOrRenameCategoryDialogFragment.A01;
            if (threadKey != null) {
                c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, 1BK.A0w(threadKey), createOrRenameCategoryDialogFragment.A04, null, null, "manage_thread", "messenger", str, null, null, map));
                return;
            }
            str2 = "threadKey";
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        String str;
        Parcelable A0B = AbM.A0B(this);
        if (A0B == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ThreadKey threadKey = (ThreadKey) A0B;
        this.A01 = threadKey;
        String str2 = null;
        if (threadKey == null) {
            AbM.A17();
            throw 0Q8.createAndThrow();
        }
        if (!threadKey.A1E()) {
            throw 1BK.A0g();
        }
        this.A02 = AbI.A10(requireArguments(), "category_id");
        this.A05 = requireArguments().getString("category_name_original");
        if (bundle != null) {
            str2 = bundle.getString("category_name");
        }
        str = "";
        if (str2 == null) {
            str2 = this.A05;
            if (str2 == null) {
                str2 = str;
            }
        }
        this.A03 = str2;
        String string = requireArguments().getString("group_id");
        this.A04 = string != null ? string : "";
        MigColorScheme A0S = 7zV.A0S(this);
        1Iw A0T = 7zP.A0T(this);
        this.A00 = new LithoView(A0T);
        8TS A00 = 8oX.A00(A0T);
        A00.A2Z(A0S);
        A00.A2X(2131954248);
        8oX r0 = A00.A01;
        r0.A04 = 8193;
        r0.A0N = this.A03;
        r0.A0U = true;
        r0.A05 = 30;
        A00.A2Y(new InputFilter.LengthFilter(30));
        A00.A0e();
        r0.A0C = 7zO.A0U(new AeI(this, 42));
        1LI A2W = A00.A2W();
        LithoView lithoView = this.A00;
        if (lithoView == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        lithoView.A0y(A2W);
        this.A06 = 7zR.A0W();
        FbUserSession A01 = 1BM.A01(this);
        C2121Dea A03 = 7zQ.A0l().A03(requireContext());
        String str3 = this.A05;
        C1qo c1qo = A0T.A0E;
        String A0D = str3 == null ? c1qo.A0D(2131954251) : c1qo.A0E(2131954252, str3);
        LithoView lithoView2 = new LithoView(A0T);
        2KD A13 = 7zM.A13(A0T, A0D, 0);
        A13.A2x(A0S);
        A13.A2g();
        A13.A2b();
        A13.A2M(true);
        A13.A12(8.0f);
        A13.A2a();
        lithoView2.A0y(A13.A2W());
        int i = 2131954253;
        if (this.A05 == null) {
            i = 2131954250;
        }
        A03.A0C(false);
        A03.A09(this.A00);
        A03.A0E(new CSF(this, A01, 3), i);
        A03.A07(CSG.A00(this, 34));
        ((DKS) A03).A01.A07 = lithoView2;
        return A03.A0I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        Window window;
        Window window2;
        int A02 = 0FI.A02(-1913677938);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A05(this);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.clearFlags(131080);
        }
        Dialog dialog2 = ((0D2) this).A01;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setSoftInputMode(5);
        }
        Dialog dialog3 = ((0D2) this).A01;
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(false);
        }
        0FI.A08(1365670221, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putString("category_name", this.A03);
    }
}
