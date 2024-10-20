package X;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.Akf, reason: case insensitive filesystem */
/* loaded from: Akf.class */
public final class C1526Akf extends 1pK {
    public static final String __redex_internal_original_name = "CombinedInviteContactsPermissionFragment";
    public LithoView A00;
    public Bef A01;
    public MigColorScheme A02;

    public 1iF A1R() {
        return AbK.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-464105591);
        LithoView lithoView = new LithoView(getContext(), (AttributeSet) null);
        this.A00 = lithoView;
        0FI.A08(2128854983, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MigColorScheme A0h = AbK.A0h(this);
        this.A02 = A0h;
        AbG.A1H(this.A00, A0h);
        LithoView lithoView = this.A00;
        2cM A0e = AbG.A0e(lithoView.A09);
        QCX qcx = new QCX(this.A00.A09, new QLp());
        String A15 = AbI.A15(this, getString(2131952789), 2131958472);
        QLp qLp = qcx.A01;
        qLp.A02 = A15;
        BitSet bitSet = qcx.A02;
        bitSet.set(1);
        qLp.A00 = this.A01;
        bitSet.set(0);
        qLp.A01 = this.A02;
        lithoView.A0x(7zL.A0U(A0e, qcx));
    }
}
