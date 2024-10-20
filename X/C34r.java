package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.34r, reason: invalid class name */
/* loaded from: 34r.class */
public final class C34r extends 1pK {
    public static final String __redex_internal_original_name = "AuthAppLockFragment";
    public ColorDrawable A00;
    public boolean A01;
    public final 1Br A02 = 1Bu.A00(116340);
    public final 1Br A03 = 1Bu.A02(this, 16979);

    public 1iF A1R() {
        return new 1iF(796330954455679L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A01 = bundle2.getBoolean(__redex_internal_original_name);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        int A02 = 0FI.A02(1902515920);
        11T.A0F(layoutInflater, 0);
        if (this.A01) {
            inflate = null;
        } else {
            1Br.A0C(this.A02);
            inflate = layoutInflater.inflate(2132541545, viewGroup, false);
        }
        0FI.A08(-924817122, A02);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A01) {
            return;
        }
        View requireViewById = view.requireViewById(2131362161);
        11T.A0A(requireViewById);
        ColorDrawable colorDrawable = new ColorDrawable();
        this.A00 = colorDrawable;
        requireViewById.setBackground(colorDrawable);
    }
}
