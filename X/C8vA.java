package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.encryptedbackups.setting.viewdata.EncryptedBackupsSettingFragmentViewData$createContentModel$1;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8vA, reason: invalid class name */
/* loaded from: 8vA.class */
public final class C8vA extends BJB {
    public static final String __redex_internal_original_name = "EncryptedBackupsSettingFragment";
    public FbUserSession A00;
    public 9lL A01;
    public C9iA A02;
    public C2cw A03;
    public C5ic A04;
    public final C01i A05;
    public final C01i A06;

    public C8vA() {
        C03i c03i = C03i.A02;
        this.A06 = C01g.A00(c03i, AQo.A01(this, 42));
        this.A05 = C01g.A00(c03i, AQo.A01(this, 41));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C96q A03(C8vA c8vA) {
        C96q A00 = 9Bn.A00(c8vA.requireActivity().getIntent().getStringExtra("entry_point_key"));
        if (A00 == null) {
            A00 = C96q.A0I;
        }
        return A00;
    }

    public static final void A06(C8vA c8vA, C00m c00m, C00m c00m2, int i, int i2, int i3, int i4) {
        if (c8vA.A04 == null) {
            11T.A0L("migAlertDialogBuilderFactory");
            throw 0Q8.createAndThrow();
        }
        DR6 A0Q = 7zV.A0Q(c8vA);
        A0Q.A00(i);
        A0Q.A06(i2);
        C9oG.A02(A0Q, c00m, 44, i3);
        C9oG.A03(A0Q, c00m2, 45, i4);
    }

    public 1iF A1R() {
        return 7zR.A0F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        FbUserSession A01 = 1BM.A01(this);
        this.A00 = A01;
        String str = "fbUserSession";
        if (A01 != null) {
            C1wv c1wv = (C1wv) 7zN.A0m(this, A01, 68883);
            FbUserSession fbUserSession = this.A00;
            if (fbUserSession != null) {
                C9c4 c9c4 = (C9c4) 7zN.A0m(this, fbUserSession, 68884);
                FbUserSession fbUserSession2 = this.A00;
                if (fbUserSession2 != null) {
                    final C9iA c9iA = (C9iA) 7zN.A0m(this, fbUserSession2, 68869);
                    this.A02 = c9iA;
                    if (c9iA == null) {
                        str = "viewData";
                    } else {
                        Context requireContext = requireContext();
                        int A06 = 7zP.A06(c1wv, c9c4, 2);
                        c9iA.A02 = c1wv;
                        c9iA.A03 = c9c4;
                        if (((0BG) 1Br.A0B(c9iA.A08)).A00(requireContext) && c9iA.A00 == null) {
                            c9iA.A00 = (C3RG) 4YU.A0n(c9iA.A06, c9iA.A07, 67247);
                        }
                        0zV r0 = c9iA.A0S;
                        0zV r02 = c9iA.A0U;
                        0oO r03 = new 0oO(1, r02, r0, new AJr(c9iA, null, A06));
                        2aH A00 = 2Zy.A00(this, 2Zo.A00());
                        C0zE c0zE = 0zF.A00;
                        c9iA.A05 = 0zL.A01(new C2629Gje(true, false, 1), A00, r03, c0zE);
                        0zV r04 = c9iA.A0R;
                        C9c4 c9c42 = c9iA.A03;
                        if (c9c42 != null) {
                            2bX r05 = c9c42.A03;
                            11T.A0F(r05, 0);
                            C11w A002 = 0Ic.A00(new AJV(r05, (0DR) null, 16, 42));
                            Integer num = 0S2.A01;
                            0Jz ATz = A002 instanceof C11w ? A002.ATz(num, 0DL.A00, 0) : new 0Jz(num, 0DL.A00, A002, 0);
                            c9iA.A04 = 0zL.A01(new 8KR((99O) null, (99O) null, (C2p2) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), 2Zy.A00(this, 2Zo.A00()), new 0oS(new 0zV[]{r0, r02, r04, (0zV) ATz, c9iA.A0T}, new EncryptedBackupsSettingFragmentViewData$createContentModel$1(c9iA, null), 8), c0zE);
                            r02.Cvx(C8tk.A00);
                            r04.Cvx((Object) null);
                            C1wv.A04(c1wv);
                            c1wv.A02.observe(this, new C9qn(this, c9iA, 11));
                            getLifecycle().addObserver(new LifecycleObserver() { // from class: X.9qh
                                public final void onDestroy() {
                                    C9iA c9iA2 = C9iA.this;
                                    if (11T.A0O(c9iA2.A0U.getValue(), C8tk.A00)) {
                                        7zP.A0e(c9iA2.A0J).markerEnd(679423802, (short) 467);
                                    }
                                }
                            });
                            this.A04 = 7zQ.A0l();
                            this.A01 = (9lL) 1Bi.A03(68806);
                            this.A03 = (C2cw) 1Bi.A03(66572);
                            return;
                        }
                        str = "vdStatusRepository";
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A1c() {
        0fH.A0j(__redex_internal_original_name, "updateContent");
        LithoView lithoView = ((BJB) this).A00;
        if (lithoView != null) {
            C9iA c9iA = this.A02;
            String str = "viewData";
            if (c9iA != null) {
                C15t c15t = c9iA.A05;
                if (c15t == null) {
                    str = "_settingModel";
                } else {
                    C2629Gje c2629Gje = (C2629Gje) c15t.getValue();
                    C9It c9It = (C9It) this.A06.getValue();
                    9Is r0 = (9Is) this.A05.getValue();
                    C9iA c9iA2 = this.A02;
                    if (c9iA2 != null) {
                        C15t c15t2 = c9iA2.A04;
                        if (c15t2 != null) {
                            8KR r02 = (8KR) c15t2.getValue();
                            MigColorScheme migColorScheme = ((BJB) this).A01;
                            11T.A0A(migColorScheme);
                            lithoView.A0y(new C8ap(c2629Gje, r02, r0, c9It, migColorScheme));
                            return;
                        }
                        str = "_contentModel";
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 546504742);
        super/*X.DZJ*/.onCreateView(layoutInflater, viewGroup, bundle);
        LithoView A0J = 7zU.A0J(layoutInflater, viewGroup, this);
        0FI.A08(-1814407423, A04);
        return A0J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(259263093);
        super/*androidx.fragment.app.Fragment*/.onResume();
        C9iA c9iA = this.A02;
        if (c9iA == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        c9iA.A03(AnonymousClass001.A0K());
        0FI.A08(1660308359, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        C9iA c9iA = this.A02;
        if (c9iA == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        C96q A03 = A03(this);
        C96q c96q = C96q.A0C;
        if (A03 != c96q) {
            c96q = C96q.A0I;
        }
        c9iA.A01 = c96q;
        0fH.A0j("EncryptedBackupsSettingFragmentViewData", AnonymousClass001.A0Z(c96q, "initilize Data with entry point ", AnonymousClass001.A0k()));
        AJe.A03(this, LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), 17);
    }
}
