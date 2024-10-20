package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.p2p.messenger.common.contactselector.PaymentContactSelectorConfiguration;
import com.facebook.widget.text.BetterEditTextView;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* renamed from: X.Am8, reason: case insensitive filesystem */
/* loaded from: Am8.class */
public final class C1589Am8 extends 1pK implements DFd {
    public static final ImmutableList A04 = ImmutableList.of((Object) new AnonymousClass543(48, 56));
    public static final String __redex_internal_original_name = "PaymentContactSelectorFragment";
    public C1320Ady A00;
    public BetterEditTextView A01;
    public LithoView A02;
    public final C00i A03 = AbH.A0c(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static DIW A03(C1589Am8 c1589Am8) {
        Bundle bundle = c1589Am8.mArguments;
        bundle.getClass();
        if (((PaymentContactSelectorConfiguration) bundle.getParcelable("contact_selector_config")).A01) {
            return (Cpv) 7zO.A0l(c1589Am8, 84465);
        }
        return ((AbR) 7zO.A0l(c1589Am8, 474)).A0q(1BL.A0G(c1589Am8), new C6o(true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(FbUserSession fbUserSession, DIW diw, C1589Am8 c1589Am8) {
        Euf euf;
        1Bn.A0A(83179);
        Bnd bnd = (Bnd) 7zN.A0m(c1589Am8, fbUserSession, 84461);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(722);
        Bundle bundle = c1589Am8.mArguments;
        bundle.getClass();
        String string = bundle.getString("feature");
        Iterator it = bnd.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                euf = null;
                break;
            } else {
                euf = (Euf) it.next();
                if (DKB.A00(491).equals(string)) {
                    break;
                }
            }
        }
        Context context = c1589Am8.getContext();
        euf.getClass();
        Bundle bundle2 = bundle.getBundle("extras_bundle");
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            CqM b82 = new B82(context, bundle2, fbUserSession, euf);
            1Bn.A0K();
            FbInjector.A04(A01);
            Context requireContext = c1589Am8.requireContext();
            CIo cIo = new CIo(b82, "payment_contact_selector");
            cIo.A01(new B7v(c1589Am8, 10));
            cIo.A0A.m11011add((Object) c1589Am8);
            cIo.A07.m11011add((Object) diw);
            C1320Ady c1320Ady = new C1320Ady(requireContext, fbUserSession, cIo);
            c1589Am8.A00 = c1320Ady;
            c1320Ady.A0G("");
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static void A07(C1589Am8 c1589Am8, ImmutableList immutableList) {
        LithoView lithoView = c1589Am8.A02;
        if (lithoView != null) {
            8OH A00 = C8m6.A00(lithoView.A09);
            A00.A2W(immutableList);
            C00i c00i = c1589Am8.A03;
            7zM.A1O(A00, AbF.A0p(c00i));
            A00.A0J();
            c1589Am8.A02.A0y(A00.A01);
            AbG.A1H(c1589Am8.A02, AbF.A0p(c00i));
        }
    }

    public 1iF A1R() {
        return AbL.A0A();
    }

    @Override // X.DFd
    public /* bridge */ /* synthetic */ void C4p(Object obj, boolean z) {
        if (z) {
            return;
        }
        A07(this, A04);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1273920312);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132543028);
        0FI.A08(1443753105, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A02 = (LithoView) 7zL.A0F(this, 2131366337);
        this.A01 = (BetterEditTextView) 7zL.A0F(this, 2131366341);
        C00i c00i = this.A03;
        MigColorScheme.A00(view, AbF.A0p(c00i));
        MigColorScheme.A00(this.A01, AbF.A0p(c00i));
        this.A01.setHintTextColor(AbF.A0p(c00i).B9Q());
        this.A01.setHint(getString(2131963036));
        AbH.A1M(this.A01, AbF.A0p(c00i));
        MigColorScheme.A00(this.A02, AbF.A0p(c00i));
        6P9 r0 = this.A01;
        if (r0 != null) {
            r0.requestFocus();
            this.A01.addTextChangedListener(new BJI(this, 3));
        }
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        PaymentContactSelectorConfiguration paymentContactSelectorConfiguration = (PaymentContactSelectorConfiguration) bundle2.getParcelable("contact_selector_config");
        FbUserSession A0G = 1BL.A0G(this);
        if (!paymentContactSelectorConfiguration.A01) {
            A06(A0G, A03(this), this);
            return;
        }
        A07(this, A04);
        Fch fch = (Fch) 1Bi.A03(98927);
        ListenableFuture A05 = fch.A05(A0G);
        Fvf fvf = new Fvf(fch, 27);
        1JU r02 = 1JU.A01;
        1Kd.A0F(new D4o(this, A0G, 5), 2FP.A02(fvf, A05, r02), r02);
    }
}
