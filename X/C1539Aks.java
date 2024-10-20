package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.acra.constants.ActionId;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Aks, reason: case insensitive filesystem */
/* loaded from: Aks.class */
public final class C1539Aks extends 1pK {
    public static final int A05 = View.generateViewId();
    public static final String __redex_internal_original_name = "DiscoverablePublicBroadcastChatCreationNuxFragment";
    public 1pI A00;
    public BLF A01;
    public boolean A02;
    public LithoView A03;
    public final 1Br A04 = 1Bq.A00(68470);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        BLF serializable;
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (serializable = bundle2.getSerializable("arg_entrypoint")) == null) {
            throw 1BK.A0h();
        }
        this.A01 = serializable;
        this.A02 = bundle != null ? bundle.getBoolean("broadcast_channel_nux_impression_logged") : this.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-753592402);
        Context requireContext = requireContext();
        this.A03 = 7zO.A0V(requireContext);
        1Iw A0W = 7zL.A0W(requireContext);
        LithoView lithoView = this.A03;
        if (lithoView != null) {
            AbL.A11(A0W, lithoView);
            FrameLayout frameLayout = new FrameLayout(requireContext);
            AbJ.A1G(frameLayout, A05);
            LithoView lithoView2 = this.A03;
            if (lithoView2 != null) {
                frameLayout.addView(lithoView2);
                0FI.A08(-1899198140, A02);
                return frameLayout;
            }
        }
        11T.A0L("lithoView");
        throw 0Q8.createAndThrow();
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("broadcast_channel_nux_impression_logged", this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        BOn bOn;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A03;
        String str = "lithoView";
        if (lithoView != null) {
            11T.A0A(lithoView.A09);
            MigColorScheme A0b = 7zR.A0b(requireContext());
            CZF A00 = CZF.A00(this, 34);
            C9zk c9zk = new C9zk(this, 6);
            BLF blf = this.A01;
            if (blf != null) {
                lithoView.A0x(new QGu(A00, blf, A0b, c9zk));
                this.A00 = 1vD.A00(view);
                C5fi.A00(getActivity());
                if (this.A02) {
                    return;
                }
                CQo A0a = 7zR.A0a();
                BLF blf2 = this.A01;
                if (blf2 != null) {
                    int ordinal = blf2.ordinal();
                    if (ordinal == 1) {
                        i = 86;
                        bOn = BOn.A02;
                    } else if (ordinal != 2) {
                        i = 16;
                        bOn = BOn.A0S;
                    } else {
                        i = 5;
                        bOn = BOn.A0A;
                    }
                    CQo.A0E(bOn, A0a, (Long) null, ActionId.END_START_ACTIVITY, 2, i, CQo.A00(blf2));
                    this.A02 = true;
                    return;
                }
            }
            str = "entryPoint";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
