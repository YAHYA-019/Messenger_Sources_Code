package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.functions.Function1;

/* loaded from: Grc.class */
public final class Grc extends BJB {
    public static final String __redex_internal_original_name = "M4AuthAppLockPreferenceFragment";
    public C15h A01;
    public ImmutableList A00 = 1BK.A0b();
    public final 1Br A09 = 1Bq.A00(66354);
    public final 1Br A03 = 1Bq.A00(66345);
    public final 1Br A05 = 1Bu.A02(this, 83149);
    public final 1Br A02 = 1Bu.A00(116338);
    public final 1Br A0B = 1Bq.A00(67262);
    public final 1Br A04 = 1Bu.A02(this, 116339);
    public final 1Br A06 = 1Bu.A00(82533);
    public final 1Br A0A = AbG.A0a();
    public final C5ww A07 = new IaR(this, 0);
    public final Function1 A08 = new AV1(this, 42);

    public static final 1SD A03(Grc grc) {
        return (1SD) 1Br.A0B(grc.A09);
    }

    public 1iF A1R() {
        return AbF.A0C(796330954455679L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1c() {
        8Uc A1Z;
        LithoView lithoView = ((BJB) this).A00;
        Context context = getContext();
        if (lithoView == null || context == null) {
            return;
        }
        A1b();
        1Iw r0 = new 1Iw(context);
        if (this.A00.isEmpty()) {
            A1Z = new 8Uc(((BJB) this).A01);
        } else {
            C9bw c9bw = new C9bw();
            1Br.A0C(this.A04);
            c9bw.A01 = 2131959938;
            By5 A00 = c9bw.A00();
            MigColorScheme migColorScheme = ((BJB) this).A01;
            11T.A0A(migColorScheme);
            ImmutableList immutableList = this.A00;
            Function1 function1 = this.A08;
            A1Z = A1Z(new C1956Axl(this.A07, migColorScheme, immutableList, Integer.valueOf(A03(this).A00()), function1, A03(this).A02(), 1BK.A1T(1Br.A09(A03(this).A03), 1SE.A03)), r0, A00);
        }
        lithoView.A0x(A1Z);
    }

    public void onAttach(Context context) {
        11T.A0F(context, 0);
        super/*X.1pK*/.onAttach(context);
        this.A01 = new J5u(context, 14);
        A03(this).A00 = new HQe(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 1334727662);
        LithoView A1Y = A1Y(layoutInflater, viewGroup);
        0FI.A08(294553011, A04);
        return A1Y;
    }

    public void onDetach() {
        int A02 = 0FI.A02(-821457216);
        super/*X.1pK*/.onDetach();
        A03(this).A00 = null;
        0FI.A08(839793333, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1471732940);
        super/*androidx.fragment.app.Fragment*/.onResume();
        11T.A0I(requireContext().getSystemService("keyguard"), "null cannot be cast to non-null type android.app.KeyguardManager");
        A1c();
        0FI.A08(-1964159290, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(1226789080);
        super/*androidx.fragment.app.Fragment*/.onStart();
        1Br.A0C(this.A04);
        ImmutableList of = ImmutableList.of((Object) 4YV.A13(1BK.A0v(7zL.A09(), AbJ.A06().getString(2131959933), 2131959945), 0), (Object) 4YV.A13(1BK.A0v(7zL.A09(), AbJ.A06().getString(2131959933), 2131959947), 60), (Object) 4YV.A13(1BK.A0v(7zL.A09(), AbJ.A06().getString(2131959933), 2131959943), 900), (Object) 4YV.A13(1BK.A0v(7zL.A09(), AbJ.A06().getString(2131959933), 2131959946), 3600));
        11T.A0A(of);
        this.A00 = of;
        0FI.A08(-438391021, A02);
    }
}
