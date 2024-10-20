package com.facebook.messaging.encryptedbackups.basefragment;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BM;
import X.1Bi;
import X.1Bn;
import X.1Iw;
import X.1iF;
import X.4YT;
import X.6KV;
import X.7zL;
import X.7zN;
import X.7zQ;
import X.7zR;
import X.7zS;
import X.7zV;
import X.C00m;
import X.C06c;
import X.C0A8;
import X.C1ud;
import X.C1wv;
import X.C2cn;
import X.C5ic;
import X.C9c4;
import X.C9oG;
import X.C9uq;
import X.DR6;
import X.F8h;
import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment;
import com.facebook.messaging.encryptedbackups.hsm.ui.viewdata.viewstate.ViewState;
import com.facebook.messaging.encryptedbackups.nux.fragment.EbSetupNuxMoreOptionFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: BaseFragment.class */
public abstract class BaseFragment extends AbstractNavigableFragment {
    public FbUserSession A00;
    public C9uq A01;
    public C1wv A02;
    public C9c4 A03;
    public C1ud A04;
    public C5ic A05;
    public MigColorScheme A06;
    public LithoView A07;

    public static ShapeDrawable A03(1Iw r301, BaseFragment baseFragment) {
        int AYp = baseFragment.A1f().AYp();
        11T.A0A(r301.A0D);
        return C2cn.A02(C0A8.A00(r0, 8.0f), AYp);
    }

    public static FbUserSession A06(BaseFragment baseFragment, int i) {
        1Bn.A0A(i);
        return baseFragment.A1b();
    }

    public static void A07(HsmPinCodeSetupBaseFragment hsmPinCodeSetupBaseFragment, int i) {
        if (i != 0) {
            hsmPinCodeSetupBaseFragment.A1c().clearFocus();
            hsmPinCodeSetupBaseFragment.A1q();
            6KV r0 = hsmPinCodeSetupBaseFragment.A01;
            if (r0 != null) {
                r0.A02();
                return;
            }
        } else {
            6KV r02 = hsmPinCodeSetupBaseFragment.A01;
            if (r02 != null) {
                r02.A05(-1);
                return;
            }
        }
        11T.A0L("viewOrientationLockHelper");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r0 > 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean A08(com.facebook.messaging.encryptedbackups.basefragment.BaseFragment r301) {
        /*
            r0 = r301
            X.06Z r0 = r0.mFragmentManager
            r302 = r0
            r0 = r302
            int r0 = r0.A0U()
            r303 = r0
            r0 = r301
            boolean r0 = r0.A1l()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1b
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 <= 0) goto L1d
        L1b:
            r0 = 1
            r304 = r0
        L1d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.basefragment.BaseFragment.A08(com.facebook.messaging.encryptedbackups.basefragment.BaseFragment):boolean");
    }

    public static boolean A09(HsmPinCodeSetupBaseFragment hsmPinCodeSetupBaseFragment) {
        return !11T.A0O(hsmPinCodeSetupBaseFragment.A1m().A05.getValue(), ViewState.NoError.A00);
    }

    public static boolean A0A(HsmPinCodeSetupBaseFragment hsmPinCodeSetupBaseFragment) {
        return ((Boolean) hsmPinCodeSetupBaseFragment.A1m().A06.getValue()).booleanValue();
    }

    @Override // com.facebook.base.fragment.AbstractNavigableFragment
    public 1iF A1R() {
        return 7zR.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        MigColorScheme A0j = 7zS.A0j(this);
        11T.A0F(A0j, 0);
        this.A06 = A0j;
        FbUserSession A01 = 1BM.A01(this);
        11T.A0F(A01, 0);
        this.A00 = A01;
        C5ic A0l = 7zQ.A0l();
        11T.A0F(A0l, 0);
        this.A05 = A0l;
        C9c4 c9c4 = (C9c4) 7zN.A0n(this, A1b(), 68884);
        11T.A0F(c9c4, 0);
        this.A03 = c9c4;
        C1wv c1wv = (C1wv) 7zN.A0n(this, A1b(), 68883);
        11T.A0F(c1wv, 0);
        this.A02 = c1wv;
        C9uq A0X = 7zR.A0X();
        11T.A0F(A0X, 0);
        this.A01 = A0X;
        C1ud c1ud = (C1ud) 1Bi.A03(65997);
        11T.A0F(c1ud, 0);
        this.A04 = c1ud;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r303 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle A1a() {
        /*
            r301 = this;
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            java.lang.String r1 = "com.facebook.fragment.BUNDLE_EXTRAS"
            android.os.Bundle r0 = r0.getBundle(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1c
        L14:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            r303 = r0
            r0 = r303
            X.11T.A0B(r0)
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.basefragment.BaseFragment.A1a():android.os.Bundle");
    }

    public final FbUserSession A1b() {
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession != null) {
            return fbUserSession;
        }
        7zL.A1C();
        throw 0Q8.createAndThrow();
    }

    public final LithoView A1c() {
        LithoView lithoView = this.A07;
        if (lithoView != null) {
            return lithoView;
        }
        11T.A0L("_container");
        throw 0Q8.createAndThrow();
    }

    public final C9uq A1d() {
        C9uq c9uq = this.A01;
        if (c9uq != null) {
            return c9uq;
        }
        11T.A0L("setupFlowLogger");
        throw 0Q8.createAndThrow();
    }

    public final C1ud A1e() {
        C1ud c1ud = this.A04;
        if (c1ud != null) {
            return c1ud;
        }
        11T.A0L("gatingUtil");
        throw 0Q8.createAndThrow();
    }

    public final MigColorScheme A1f() {
        MigColorScheme migColorScheme = this.A06;
        if (migColorScheme != null) {
            return migColorScheme;
        }
        11T.A0L("colorScheme");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0407, code lost:
    
        if (X.7zM.A1a(r0, X.C1ud.A00(r0), 2342159435902887914L) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x073c, code lost:
    
        if (X.7zP.A0a(r0.A00).A05() == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x07b8, code lost:
    
        if (r0.A1l() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x130b, code lost:
    
        if (r0 != false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x130f, code lost:
    
        if (r302 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x1312, code lost:
    
        r302.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x1316, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0b3d, code lost:
    
        if (r0 != false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x1318, code lost:
    
        if (r302 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0d51, code lost:
    
        if (r311 != null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x131b, code lost:
    
        r302.A05(-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0d54, code lost:
    
        r325 = 2131957693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0d5b, code lost:
    
        if (r324 == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0d5e, code lost:
    
        r325 = 2131957689;
        r334 = 2131957723;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0d68, code lost:
    
        r321 = new X.C8eb(r314.A08, r311, r322, 2131957692, r326, r314.A1m().A02(), r323, r325, r334, r336, r337, true, false, !r314.A1e().A03(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0dc9, code lost:
    
        r334 = 2131957691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x1320, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0e4e, code lost:
    
        if (r311 != null) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00df, code lost:
    
        if (r0.A1l() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0161, code lost:
    
        if (r0.A03 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x1237, code lost:
    
        if (((X.C87p) r0.A08.getValue()).A00 == false) goto L345;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:214:0x0c66. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0cd6  */
    /* JADX WARN: Type inference failed for: r0v1163, types: [com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsHsmPinCodeRestoreFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v656, types: [com.facebook.messaging.encryptedbackups.basefragment.BaseFragment, androidx.fragment.app.Fragment, com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.restoreflow.fragment.EbRestoreRecoveryCodeFragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1g() {
        /*
            Method dump skipped, instructions count: 4976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.basefragment.BaseFragment.A1g():void");
    }

    public final void A1h() {
        if (this.A05 != null) {
            return;
        }
        11T.A0L("migAlertDialogBuilderFactory");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1i(AbstractNavigableFragment abstractNavigableFragment, String str) {
        if (!(this instanceof EbSetupNuxMoreOptionFragment)) {
            C06c A0G = 7zL.A0G(this.mFragmentManager);
            A0G.A0P(abstractNavigableFragment, str, 2131363889);
            A0G.A0V(str);
            A0G.A04();
            return;
        }
        EbSetupNuxMoreOptionFragment ebSetupNuxMoreOptionFragment = (EbSetupNuxMoreOptionFragment) this;
        if (ebSetupNuxMoreOptionFragment.A00 == null) {
            7zL.A1D();
            throw 0Q8.createAndThrow();
        }
        Class<?> cls = abstractNavigableFragment.getClass();
        11T.A0F(cls, 0);
        F8h f8h = new F8h(cls);
        f8h.A01();
        Intent intent = f8h.A00;
        11T.A0A(intent);
        ebSetupNuxMoreOptionFragment.A1Y(intent);
    }

    public final void A1j(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, C00m c00m, C00m c00m2) {
        DR6 A0O = 7zV.A0O(this);
        A0O.A03(charSequence);
        A0O.A0J(charSequence2);
        C9oG.A00(A0O, charSequence3, c00m, 16);
        A0O.A0E(new C9oG(c00m2, 17), charSequence4);
        7zN.A13(A0O);
    }

    public final void A1k(C00m c00m, C00m c00m2, int i, int i2, int i3, int i4) {
        DR6 A0O = 7zV.A0O(this);
        A0O.A00(i);
        A0O.A06(i2);
        C9oG.A02(A0O, c00m, 14, i3);
        C9oG.A03(A0O, c00m2, 15, i4);
    }

    public final boolean A1l() {
        return A1a().getBoolean("is_nux_flow");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(893753754);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132541928, viewGroup, false);
        11T.A0I(inflate, 4YT.A00(6));
        LithoView lithoView = (LithoView) inflate;
        this.A07 = lithoView;
        if (lithoView != null) {
            MigColorScheme.A00(lithoView, A1f());
            LithoView lithoView2 = this.A07;
            if (lithoView2 != null) {
                0FI.A08(1452947132, A02);
                return lithoView2;
            }
        }
        11T.A0L("_container");
        throw 0Q8.createAndThrow();
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        A1g();
    }
}
