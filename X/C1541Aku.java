package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;

/* renamed from: X.Aku, reason: case insensitive filesystem */
/* loaded from: Aku.class */
public final class C1541Aku extends 1pK {
    public static final BzY A06 = new Object();
    public static final String __redex_internal_original_name = "DisappearingMessageNuxFragment";
    public FbUserSession A00;
    public 1pI A01;
    public LithoView A02;
    public Blo A03;
    public final 1Br A04 = 1Bu.A00(391);
    public final 1Br A05 = 7zN.A0I(this);

    public 1iF A1R() {
        return AbF.A0C(1086481948460578L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1BM.A01(this);
        C1F6 c1f6 = (C1F6) 1Br.A0B(this.A04);
        Context requireContext = requireContext();
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            Blo blo = new Blo(requireContext);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = blo;
            C1t6.A00(this, new Ckh(this, 3));
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1443697907);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132541859, false);
        0FI.A08(-2108135268, A02);
        return A0G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0211, code lost:
    
        if (X.6qH.A00() == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x028d  */
    /* JADX WARN: Type inference failed for: r0v140, types: [X.2qQ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1541Aku.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
