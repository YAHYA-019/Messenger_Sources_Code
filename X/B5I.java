package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.navigation.home.drawer.model.DrawerFolderKey;
import com.facebook.messaging.navigation.home.drawer.model.SpecialDrawerFolderKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: B5I.class */
public final class B5I extends 2Ol implements 2Oo, 2Op {
    public static final String __redex_internal_original_name = "MarketplaceInboxFragment";
    public C1980Ay9 A00;
    public RmO A01;
    public 2Un A02;
    public FbUserSession A04;
    public 5dU A05;
    public 2MX A06;
    public final 2S4 A08 = new 2S3(this, __redex_internal_original_name);
    public final Bew A0A = new Bew(this);
    public final 2OV A09 = new Ci0(this, 2);
    public boolean A03 = true;
    public final 2O4 A07 = new C1374Afg(this, 4);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(B5I b5i) {
        06Z r0 = b5i.mFragmentManager;
        r0.getClass();
        CxE A00 = CxE.A00(b5i, 57);
        C1980Ay9 c1980Ay9 = b5i.A00;
        2Un r02 = b5i.A02;
        MigColorScheme migColorScheme = ((2Ol) b5i).A03;
        boolean z = b5i.A03;
        2MX r03 = b5i.A06;
        AbU abU = (r02 == null || !r02.A02.A02) ? AbU.A04 : AbU.A05;
        AuT auT = new AuT(((LithoView) c1980Ay9).A09, new C1999Ays());
        C1999Ays c1999Ays = auT.A01;
        c1999Ays.A09 = r02;
        BitSet bitSet = auT.A02;
        bitSet.set(12);
        c1999Ays.A0A = migColorScheme;
        bitSet.set(0);
        c1999Ays.A02 = c1980Ay9.A04;
        bitSet.set(2);
        c1999Ays.A0C = abU;
        bitSet.set(6);
        c1999Ays.A04 = c1980Ay9.A06;
        bitSet.set(4);
        c1999Ays.A05 = c1980Ay9.A07;
        bitSet.set(7);
        c1999Ays.A01 = c1980Ay9.A03;
        bitSet.set(9);
        c1999Ays.A0D = Boolean.valueOf(z);
        bitSet.set(5);
        C2kx c2kx = c1980Ay9.A05;
        c1999Ays.A03 = c2kx;
        bitSet.set(10);
        c1999Ays.A07 = c1980Ay9.A09;
        bitSet.set(13);
        c1999Ays.A0B = A00;
        bitSet.set(8);
        c1999Ays.A06 = c1980Ay9.A08;
        bitSet.set(11);
        c1999Ays.A08 = r03;
        bitSet.set(1);
        c1999Ays.A00 = r0;
        bitSet.set(3);
        AbM.A1L(auT, bitSet, auT.A03);
        c1980Ay9.A0x(c1999Ays);
        c2kx.A03();
    }

    public 1iF A1R() {
        return AbF.A0C(267235184257586L);
    }

    public DrawerFolderKey AiR() {
        return new SpecialDrawerFolderKey(0S2.A00);
    }

    public void CpV(2MX r302) {
        this.A06 = r302;
        ((2Ol) this).A01 = new B5C(this, r302);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-563042061);
        super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        this.A04 = 1BL.A0G(this);
        C1F6 c1f6 = (C1F6) 7zO.A0l(this, 969);
        FbUserSession fbUserSession = this.A04;
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            RmO rmO = new RmO(c1f6, fbUserSession);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A01 = rmO;
            rmO.A00 = this.A0A;
            rmO.A05.CmR(rmO.A03);
            Context context = getContext();
            06Z r0 = this.mFragmentManager;
            2S4 r02 = this.A08;
            2S9 r03 = ((2Ol) this).A01;
            2O4 r04 = this.A07;
            RmO rmO2 = this.A01;
            FbUserSession fbUserSession2 = this.A04;
            fbUserSession2.getClass();
            C1980Ay9 c1980Ay9 = new C1980Ay9(context, viewGroup, r0, r04, fbUserSession2, r02, r03, rmO2);
            this.A00 = c1980Ay9;
            7zR.A11(c1980Ay9);
            this.A05 = (5dU) 7zO.A0m(this, 83210);
            C1980Ay9 c1980Ay92 = this.A00;
            0FI.A08(-145501250, A02);
            return c1980Ay92;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-1924413536);
        super.onDestroy();
        this.A01.A05.AEC();
        0FI.A08(-2123289435, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-2123185786);
        super/*androidx.fragment.app.Fragment*/.onPause();
        2QA A00 = ((2RF) 1Bi.A03(33095)).A00(requireContext());
        if (A00 != null) {
            A00.A02(this.A09);
        }
        0FI.A08(-537223811, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1559094967);
        super/*androidx.fragment.app.Fragment*/.onResume();
        2QA A00 = ((2RF) 1Bi.A03(33095)).A00(requireContext());
        if (A00 != null) {
            A00.A03(this.A09);
            this.A05.A00(new SpecialDrawerFolderKey(0S2.A00));
        }
        0FI.A08(-1704396489, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01.A01();
        MigColorScheme.A00(this.A00, ((2Ol) this).A03);
        A03(this);
    }
}
