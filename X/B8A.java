package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;

/* loaded from: B8A.class */
public abstract class B8A extends C9a {
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public final BhL A03;

    public B8A(BhL bhL) {
        this.A03 = bhL;
    }

    @Override // X.C9a
    public void A04(Bundle bundle) {
        if (bundle != null) {
            this.A01 = bundle.getBoolean("has_next_page_key");
            this.A02 = bundle.getBoolean("is_loading");
        }
    }

    @Override // X.C9a
    public void A05(Bundle bundle) {
        11T.A0F(bundle, 0);
        bundle.putBoolean("has_next_page_key", this.A01);
        bundle.putBoolean("is_loading", this.A02);
    }

    @Override // X.C9a
    public void A06(ImmutableList immutableList) {
        BhL bhL = this.A03;
        if (bhL != null) {
            super.A06(immutableList);
            this.A02 = false;
            ImmutableList immutableList2 = super.A00;
            AmA amA = bhL.A00;
            amA.A0D.Ciz(new D8M(amA, immutableList2));
        }
    }
}
