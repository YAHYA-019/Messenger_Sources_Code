package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.FbFragmentActivity;

/* renamed from: X.Da6, reason: case insensitive filesystem */
/* loaded from: Da6.class */
public final class C2045Da6 extends 1pK implements GGu {
    public static final String __redex_internal_original_name = "FBPayAuthBlueContainerFragment";
    public 5W3 A00;

    public C2045Da6() {
    }

    public C2045Da6(int i) {
    }

    public 1iF A1R() {
        return DKH.A0K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GGu
    public boolean Bzb(Bundle bundle, int i, boolean z) {
        return R4E.A00(bundle, this, z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1815325013);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541981);
        0FI.A08(-1508342845, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        1gM r0;
        int A02 = 0FI.A02(631247296);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        FragmentActivity activity = getActivity();
        if ((activity instanceof FbFragmentActivity) && (r0 = this.A00) != null) {
            ((FbFragmentActivity) activity).Cdt(r0);
        }
        0FI.A08(-1197586141, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity instanceof FbFragmentActivity) {
            1gM c2053Dae = new C2053Dae(this, 0);
            this.A00 = c2053Dae;
            ((FbFragmentActivity) activity).A5D(c2053Dae);
        }
        06Z childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.A0Y(2131363328) == null) {
            Bundle bundle2 = this.mArguments;
            11T.A0F(bundle2, 0);
            String string = bundle2.getString("CHILD_FRAGMENT_IDENTIFIER");
            Bundle bundle3 = this.mArguments;
            11T.A0F(bundle3, 0);
            Fragment A00 = C06014fk.A0B().A05.A00(bundle3.getBundle("CHILD_FRAGMENT_BUNDLE"), string);
            if (A00 != null) {
                0AW.A04(this);
                A00.setTargetFragment(null, this.mTargetRequestCode);
                C06c A0G = 7zL.A0G(childFragmentManager);
                A0G.A0M(A00, 2131363328);
                A0G.A04();
            }
        }
    }
}
