package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Jm9, reason: case insensitive filesystem */
/* loaded from: Jm9.class */
public final class C3198Jm9 extends 1pK {
    public static final int A03 = View.generateViewId();
    public static final String __redex_internal_original_name = "E2EEXmaYoutubePlayerScreenFragment";
    public LithoView A00;
    public final 1Br A01 = 1Bu.A02(this, 16979);
    public final C01i A02 = new ViewModelLazy(7zL.A18(C3028Jgr.class), new AKO(this, 10), new AKO(this, 9), new AKX((Object) null, this, 9));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C3198Jm9 c3198Jm9) {
        String string = c3198Jm9.requireArguments().getString("arg_video_id");
        if (string != null) {
            C01i c01i = c3198Jm9.A02;
            F7a f7a = JQz.A0U(c01i).A00;
            if (f7a != null) {
                FragmentActivity activity = c3198Jm9.getActivity();
                boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                S4Z s4z = new S4Z(c3198Jm9);
                MigColorScheme migColorScheme = (MigColorScheme) 1Br.A0B(c3198Jm9.A01);
                Boolean bool = (Boolean) JQz.A0U(c01i).A08.getValue();
                if (bool == null) {
                    bool = false;
                }
                boolean z = JQz.A0U(c01i).A04;
                Number number = (Number) JQz.A0U(c01i).A07.getValue();
                if (number == null) {
                    number = 0;
                }
                C00m c00m = JQz.A0U(c01i).A02;
                long j = 8hK.A09;
                1LI r0 = new 8hK(migColorScheme, f7a, s4z, string, c00m, number.intValue(), isInPictureInPictureMode, bool.booleanValue(), z);
                LithoView lithoView = c3198Jm9.A00;
                if (lithoView != null) {
                    lithoView.A0x(r0);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1616084038);
        this.A00 = new LithoView(requireContext());
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(A03);
        frameLayout.setClickable(true);
        frameLayout.setImportantForAccessibility(2);
        frameLayout.addView(this.A00);
        0FI.A08(-1780508162, A02);
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1281392425);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        JQz.A0U(this.A02).A00();
        0FI.A08(673899516, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(1071252931);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        JQz.A0U(this.A02).A00();
        this.A00 = null;
        0FI.A08(-707911816, A02);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        A03(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1520231504);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A03(this);
        0FI.A08(-19189094, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        JQz.A0U(this.A02).A08.observe(getViewLifecycleOwner(), LR8.A00(this, 20));
        A03(this);
    }
}
