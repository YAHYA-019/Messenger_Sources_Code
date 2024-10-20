package com.facebook.messaging.encryptedbackups.gdrive.fragment;

import X.02H;
import X.08O;
import X.0DE;
import X.0DR;
import X.0FI;
import X.0Q8;
import X.0QD;
import X.0fH;
import X.11T;
import X.1BM;
import X.1Bi;
import X.1Br;
import X.1HG;
import X.1Lm;
import X.1iF;
import X.2Zo;
import X.2aG;
import X.2aI;
import X.2aK;
import X.4YT;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.7zU;
import X.8Cs;
import X.96C;
import X.96R;
import X.9IO;
import X.9YZ;
import X.9ZP;
import X.AJG;
import X.AJW;
import X.AQb;
import X.AQt;
import X.AQv;
import X.AbE;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00i;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C1ud;
import X.C5ic;
import X.C95b;
import X.C96q;
import X.C96z;
import X.C97j;
import X.C9i0;
import X.C9ku;
import X.C9m2;
import X.C9qq;
import X.C9up;
import X.C9uq;
import X.FIu;
import X.SIr;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.fragment.AbstractNavigableFragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsGDriveSetupFragment;
import com.facebook.messaging.encryptedbackups.nux.fragment.GDriveMESoftNuxSetupFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Set;

/* loaded from: GDriveSetupRestoreFragment.class */
public class GDriveSetupRestoreFragment extends AbstractNavigableFragment {
    public FbUserSession A00;
    public C00i A01;
    public LithoView A02;
    public FIu A03;
    public 96R A04;
    public C9i0 A05;
    public GoogleAuthController A06;
    public GoogleDriveViewData A07;
    public 8Cs A08;
    public 9YZ A09;
    public C9up A0A;
    public 9ZP A0B;
    public C9ku A0C;
    public MigColorScheme A0D;
    public 08O A0E;
    public 2aI A0F;
    public C1ud A0G;
    public C5ic A0H;
    public final C01i A0I;
    public final C01i A0J;
    public final C01i A0K;
    public final C01i A0L;
    public final Set A0M = 02H.A02(new 96C[]{96C.A08, 96C.A03});
    public final C01i A0N;

    public GDriveSetupRestoreFragment() {
        C03i c03i = C03i.A02;
        this.A0N = AQv.A00(this, c03i, 5);
        this.A0J = AQv.A00(this, c03i, 2);
        this.A0L = AQv.A00(this, c03i, 4);
        this.A0I = C01g.A00(c03i, AQb.A00(this, 49));
        this.A0K = AQv.A00(this, c03i, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r301.mFragmentManager.A0U() > 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        if (r0.getBoolean("from_setting_toggle") != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A03(com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment r301) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment.A03(com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1B(Bundle bundle) {
        96R r309;
        super.A1B(bundle);
        Bundle bundle2 = this.mArguments;
        String string = bundle2 != null ? bundle2.getString("flow_type") : null;
        96R[] values = 96R.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r309 = null;
                break;
            }
            r309 = values[i];
            if (11T.A0O(r309.value, string)) {
                break;
            } else {
                i++;
            }
        }
        this.A04 = r309;
        0fH.A0j("GDriveSetupRestoreFragment", AnonymousClass001.A0Z(r309, "afterOnCreate flowType = ", AnonymousClass001.A0k()));
        if (this.A04 == null) {
            throw AnonymousClass001.A0L("invalid/null flow type");
        }
        Bundle bundle3 = this.mArguments;
        C95b c95b = (bundle3 == null || bundle3.getBoolean("from_setting_toggle")) ? C95b.A04 : A1g() ? C95b.A02 : C95b.A03;
        for (C96z c96z : C96z.values()) {
            if (c96z.flowType == this.A04 && c96z.entryPoint == c95b) {
                AQt A01 = AQt.A01(c96z, this, 41);
                C01i A00 = C01g.A00(C03i.A02, AQb.A00(AQb.A00(this, 44), 45));
                8Cs r0 = (8Cs) 7zU.A0F(AQb.A00(A00, 46), A01, AQt.A01(null, A00, 40), 7zL.A18(8Cs.class)).getValue();
                this.A08 = r0;
                if (r0 == null) {
                    11T.A0L("viewModel");
                    throw 0Q8.createAndThrow();
                }
                this.A07 = r0.A01;
                this.A06 = r0.A00;
                GoogleDriveViewData A1a = A1a();
                C96z c96z2 = A1a.A0K;
                int ordinal = c96z2.ordinal();
                if (ordinal == 4) {
                    1Br r02 = A1a.A0A;
                    C9m2 c9m2 = (C9m2) 1Br.A0B(r02);
                    if (bundle != null) {
                        C9m2.A02(c9m2, SIr.A00);
                        return;
                    } else {
                        c9m2.A03();
                        ((C9m2) 1Br.A0B(r02)).A04(C96q.A0I, c96z2.isFromSettingToggle);
                        return;
                    }
                }
                if (ordinal == 0 || ordinal == 2) {
                    if (bundle != null) {
                        return;
                    }
                } else if (ordinal != 1 && ordinal != 3) {
                    return;
                }
                ((C9m2) 1Br.A0B(A1a.A0A)).A03();
                return;
            }
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Flow not allowed: flowType=");
        A0k.append(this.A04);
        throw AnonymousClass002.A0C(c95b, AbE.A00(97), A0k);
    }

    @Override // com.facebook.base.fragment.AbstractNavigableFragment
    public 1iF A1R() {
        return 7zR.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        Context requireContext = requireContext();
        FbUserSession A01 = 1BM.A01(this);
        11T.A0F(A01, 0);
        this.A00 = A01;
        this.A0D = 7zR.A0c(requireContext);
        this.A01 = 1HG.A00(requireContext, 99435);
        FIu A0d = 7zQ.A0d(requireContext);
        11T.A0F(A0d, 0);
        this.A03 = A0d;
        this.A0H = 7zQ.A0l();
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession != null) {
            9YZ r0 = (9YZ) 1Lm.A05(requireContext, fbUserSession, 68798);
            11T.A0F(r0, 0);
            this.A09 = r0;
            Bundle bundle2 = this.mArguments;
            r0.A00 = 7zM.A17(bundle2 != null ? bundle2.getBoolean("from_setting_toggle") : true);
            C9up c9up = (C9up) 1Bi.A03(68799);
            11T.A0F(c9up, 0);
            this.A0A = c9up;
            this.A0G = (C1ud) 1Bi.A03(65997);
            this.A0E = 7zR.A0l();
            Context A0C = 7zM.A0C(this, 147595);
            FbUserSession fbUserSession2 = this.A00;
            if (fbUserSession2 != null) {
                9ZP r02 = new 9ZP(A0C, fbUserSession2);
                this.A0B = r02;
                Set set = this.A0M;
                11T.A0F(set, 0);
                r02.A00 = 0QD.A0O(set, r02.A00);
                return;
            }
        }
        7zL.A1C();
        throw 0Q8.createAndThrow();
    }

    public final GoogleDriveViewData A1a() {
        GoogleDriveViewData googleDriveViewData = this.A07;
        if (googleDriveViewData != null) {
            return googleDriveViewData;
        }
        7zL.A1B();
        throw 0Q8.createAndThrow();
    }

    public void A1b() {
        0fH.A0k("GDriveSetupRestoreFragment", "Create PIN click is called from non-NUX flow");
    }

    public void A1c() {
        String str;
        if (!(this instanceof EncryptedBackupsGDriveSetupFragment)) {
            0fH.A0k("GDriveSetupRestoreFragment", "More option click is called from non-NUX flow");
            return;
        }
        EncryptedBackupsGDriveSetupFragment encryptedBackupsGDriveSetupFragment = (EncryptedBackupsGDriveSetupFragment) this;
        String str2 = C97j.A0Q.key;
        C9uq c9uq = encryptedBackupsGDriveSetupFragment.A00;
        if (c9uq == null) {
            str = "setupFlowLogger";
        } else {
            c9uq.A08("SETUP_WITH_GDRIVE_MORE_OPTIONS_BUTTON_TAP");
            if (encryptedBackupsGDriveSetupFragment.A01 != null) {
                7zR.A10(Bundle.EMPTY, encryptedBackupsGDriveSetupFragment, str2);
                return;
            }
            str = "intentBuilder";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.messaging.encryptedbackups.nux.fragment.GDriveMESoftNuxSetupFragment, androidx.fragment.app.Fragment] */
    public void A1d() {
        if (!(this instanceof EncryptedBackupsGDriveSetupFragment)) {
            0fH.A0j("GDriveSetupRestoreFragment", "setup close click");
            A1a().A0I();
            7zU.A15(this);
            return;
        }
        EncryptedBackupsGDriveSetupFragment encryptedBackupsGDriveSetupFragment = (EncryptedBackupsGDriveSetupFragment) this;
        if (!(encryptedBackupsGDriveSetupFragment instanceof GDriveMESoftNuxSetupFragment)) {
            EncryptedBackupsGDriveSetupFragment.A06(encryptedBackupsGDriveSetupFragment);
            return;
        }
        ?? r0 = (GDriveMESoftNuxSetupFragment) encryptedBackupsGDriveSetupFragment;
        C9uq c9uq = r0.A00;
        if (c9uq == null) {
            11T.A0L("userFlowLogger");
            throw 0Q8.createAndThrow();
        }
        c9uq.A06("SETUP_EDUCATIONAL_SCREEN_CANCEL_TAP");
        7zR.A14((Fragment) r0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r0.getBoolean("from_setting_toggle") != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1e() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData r0 = r0.A1a()
            X.1Br r0 = r0.A09
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.9X3 r0 = (X.C9X3) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A00()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L30
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L30
            java.lang.String r0 = "from_setting_toggle"
            r302 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.getBoolean(r1)
            r303 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            if (r0 == 0) goto L33
        L30:
            r0 = 0
            r305 = r0
        L33:
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L6f
            java.lang.String r0 = "from_setting_toggle"
            r302 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.getBoolean(r1)
            r303 = r0
        L45:
            r0 = r305
            if (r0 == 0) goto L5f
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r304 = r0
            r0 = 2131956420(0x7f1312c4, float:1.9549395E38)
            r303 = r0
        L53:
            r0 = r304
            r1 = r303
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r302 = r0
            r0 = r302
            r0.show()
        L5e:
            return
        L5f:
            r0 = r303
            if (r0 == 0) goto L5e
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r304 = r0
            r0 = 2131956421(0x7f1312c5, float:1.9549397E38)
            r303 = r0
            goto L53
        L6f:
            r0 = 1
            r303 = r0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment.A1e():void");
    }

    public void A1f(boolean z) {
        2aI r0 = this.A0F;
        if (r0 == null) {
            11T.A0L("viewBoundBackgroundScope");
            throw 0Q8.createAndThrow();
        }
        2aK.A03((Integer) null, (0DE) null, new AJG(this, (0DR) null, 3, z), r0, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r302 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A1g() {
        /*
            r301 = this;
            r0 = r301
            android.os.Bundle r0 = r0.mArguments
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L17
            java.lang.String r0 = "com.facebook.fragment.BUNDLE_EXTRAS"
            r303 = r0
            r0 = r302
            r1 = r303
            android.os.Bundle r0 = r0.getBundle(r1)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1f
        L17:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            r302 = r0
            r0 = r302
            X.11T.A0B(r0)
        L1f:
            r0 = r302
            java.lang.String r1 = "is_nux_flow"
            boolean r0 = r0.getBoolean(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.fragment.GDriveSetupRestoreFragment.A1g():boolean");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1450785504);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132541928, viewGroup, false);
        11T.A0I(inflate, 4YT.A00(6));
        LithoView lithoView = (LithoView) inflate;
        this.A02 = lithoView;
        String str = "_container";
        if (lithoView != null) {
            MigColorScheme migColorScheme = this.A0D;
            if (migColorScheme == null) {
                str = "colorScheme";
            } else {
                MigColorScheme.A00(lithoView, migColorScheme);
                LithoView lithoView2 = this.A02;
                if (lithoView2 != null) {
                    0FI.A08(-1305707218, A02);
                    return lithoView2;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        8Cs r0 = this.A08;
        if (r0 == null) {
            str = "viewModel";
        } else {
            this.A0F = 2aG.A03(2Zo.A00(), ViewModelKt.getViewModelScope(r0));
            A1a().A0J();
            GoogleAuthController googleAuthController = this.A06;
            if (googleAuthController == null) {
                str = "googleAuthController";
            } else {
                FragmentActivity requireActivity = requireActivity();
                Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
                9IO r02 = (9IO) A1a().A0M.getValue();
                2aI r03 = this.A0F;
                if (r03 != null) {
                    googleAuthController.A0B(requireActivity, lifecycle, r02, "GDriveSetupRestoreFragment", r03);
                    this.A05 = (C9i0) 7zO.A0l(this, 68871);
                    7zT.A1C(this, new AJW(this, null, 44), A1a().A0O);
                    C9qq.A00(this, A1a().A05, 15);
                    A03(this);
                    return;
                }
                str = "viewBoundBackgroundScope";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
