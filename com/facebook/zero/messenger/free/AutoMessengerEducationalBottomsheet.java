package com.facebook.zero.messenger.free;

import X.0FI;
import X.11T;
import X.1Br;
import X.2BQ;
import X.7zN;
import X.7zQ;
import X.9De;
import X.AbF;
import X.AbH;
import X.C37s;
import X.DKE;
import X.DKH;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: AutoMessengerEducationalBottomsheet.class */
public final class AutoMessengerEducationalBottomsheet extends BaseMigBottomSheetDialogFragment {
    public String A00;
    public final 1Br A01 = 7zN.A0I(this);
    public final 2BQ A02 = DKE.A0h();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("layout_inflater") : null;
        11T.A0I(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(2132541551, (ViewGroup) null);
        11T.A0A(inflate);
        return inflate;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(75);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(679552144);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A00 = bundle.getString("ARG_CARRIER_NAME");
        0FI.A08(1472659947, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        TextView A06 = AbF.A06(view, 2131363807);
        if (A06 != null) {
            A06.setText(getString(2131953020));
            AbH.A1M(A06, 7zQ.A0m(this.A01));
        }
        TextView A062 = AbF.A06(view, 2131363802);
        if (A062 != null) {
            DKH.A18(A062, this, this.A00, 2131953021);
            DKH.A1A(A062, this.A01.A00);
        }
        TextView A063 = AbF.A06(view, 2131363804);
        if (this.A02.A04("semi_auto_messenger_bottomsheet_content")) {
            if (A063 != null) {
                i = 2131965666;
                A063.setText(getString(i));
                DKH.A1A(A063, this.A01.A00);
            }
        } else if (A063 != null) {
            i = 2131953022;
            A063.setText(getString(i));
            DKH.A1A(A063, this.A01.A00);
        }
        TextView A064 = AbF.A06(view, 2131363806);
        if (A064 != null) {
            A064.setText(getString(2131953023));
            DKH.A1A(A064, this.A01.A00);
        }
    }
}
