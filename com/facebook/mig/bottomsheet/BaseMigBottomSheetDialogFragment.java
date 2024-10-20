package com.facebook.mig.bottomsheet;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1Lo;
import X.2Ov;
import X.2qQ;
import X.2qR;
import X.2yD;
import X.3CB;
import X.3GU;
import X.3PT;
import X.8WD;
import X.8yV;
import X.9De;
import X.9Df;
import X.9Sl;
import X.AnonymousClass524;
import X.BCG;
import X.C00g;
import X.C1296Ad8;
import X.C2xn;
import X.C37r;
import X.C37s;
import X.C8w7;
import X.C8w8;
import X.C9z8;
import X.DGJ;
import X.DKB;
import X.DR7;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.widget.NestedScrollView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.adminonboarding.bottomsheet.AdminOnboardingBottomSheetFragment;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.nativepagereply.filters.bottomsheet.BusinessInboxFiltersBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.LithoAwareNestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: BaseMigBottomSheetDialogFragment.class */
public abstract class BaseMigBottomSheetDialogFragment extends 2Ov implements C00g {
    public static final 2qR A06;
    public MigColorScheme A00;
    public BottomSheetBehavior A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final 1Br A05 = 1Bu.A02(this, 16979);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2qQ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ((2qQ) obj).A01 = 2132607591;
        ((2qQ) obj).A00 = 2132607588;
        A06 = obj.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(BaseMigBottomSheetDialogFragment baseMigBottomSheetDialogFragment) {
        View findViewById;
        View view = baseMigBottomSheetDialogFragment.mView;
        if (view == null || (findViewById = view.findViewById(2131363335)) == null) {
            return;
        }
        if (baseMigBottomSheetDialogFragment.A03) {
            findViewById.setPadding(0, 0, 0, 0);
            return;
        }
        Context requireContext = baseMigBottomSheetDialogFragment.requireContext();
        boolean A00 = AnonymousClass524.A00(requireContext);
        Resources resources = requireContext.getResources();
        int i = 2132279301;
        if (A00) {
            i = 2132279332;
        }
        findViewById.setPadding(0, resources.getDimensionPixelSize(i) + resources.getDimensionPixelSize(R.dimen.mapbox_eight_dp) + resources.getDimensionPixelSize(R.dimen.mapbox_four_dp), 0, 0);
    }

    public static final void A07(BaseMigBottomSheetDialogFragment baseMigBottomSheetDialogFragment, boolean z) {
        if (z) {
            super/*X.0D2*/.A0p();
        } else {
            super/*X.0D2*/.A0o();
        }
    }

    private final boolean A08(boolean z) {
        DR7 dr7 = ((0D2) this).A01;
        boolean z2 = false;
        if (dr7 instanceof DR7) {
            11T.A0I(dr7, DKB.A00(4));
            DR7 dr72 = dr7;
            if (A1G().A0R && dr72.A07) {
                if (A1G().A0G == 5) {
                    A07(this, z);
                } else {
                    A1G().A0G(new 3CB(this, z));
                    A1G().A0B(5);
                }
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0o() {
        if (!isAdded() || isStateSaved() || A08(false)) {
            return;
        }
        super/*X.0D2*/.A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0p() {
        if (!isAdded() || isStateSaved() || A08(true)) {
            return;
        }
        super/*X.0D2*/.A0p();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, androidx.fragment.app.Fragment] */
    public View A1C() {
        ?? r0 = (MigBottomSheetDialogFragment) this;
        r0.A00 = new LithoView(r0.requireContext(), (AttributeSet) null);
        return r0.A1L();
    }

    public abstract 9De A1D();

    public DGJ A1E(1Iw r302) {
        if (!(this instanceof BusinessInboxFiltersBottomSheetDialogFragment)) {
            return null;
        }
        9Sl r0 = ((BusinessInboxFiltersBottomSheetDialogFragment) this).A00;
        if (r0 != null) {
            return new C9z8(r0);
        }
        11T.A0L("bottomSheetSelectListener");
        throw 0Q8.createAndThrow();
    }

    public final MigColorScheme A1F() {
        MigColorScheme migColorScheme = this.A00;
        if (migColorScheme == null) {
            migColorScheme = (MigColorScheme) this.A05.A00.get();
        }
        return migColorScheme;
    }

    public final BottomSheetBehavior A1G() {
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        11T.A0L("bottomSheetBehavior");
        throw 0Q8.createAndThrow();
    }

    public void A1H() {
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.fragment.app.Fragment, com.facebook.messaging.communitymessaging.adminonboarding.bottomsheet.AdminOnboardingBottomSheetFragment] */
    public void A1I() {
        String str;
        if (this instanceof AdminOnboardingBottomSheetFragment) {
            ?? r0 = (AdminOnboardingBottomSheetFragment) this;
            if (r0.A07) {
                return;
            }
            FbUserSession fbUserSession = r0.A00;
            if (fbUserSession == null) {
                str = "fbUserSession";
            } else {
                8yV r02 = (8yV) 1Lo.A04(r0.requireContext(), fbUserSession, (1BY) null, 68149);
                ThreadKey threadKey = r0.A03;
                str = "threadKey";
                if (threadKey != null) {
                    r02.A00(threadKey.A04, true);
                    String string = r0.requireArguments().getString("ARG_SESSION_ID");
                    if (string != null) {
                        ThreadKey threadKey2 = r0.A03;
                        if (threadKey2 != null) {
                            r02.A01(string, threadKey2.A04);
                        }
                    }
                    C1296Ad8 c1296Ad8 = r0.A02;
                    if (c1296Ad8 == null) {
                        str = "communityMessagingLogger";
                    } else {
                        String str2 = r0.A06;
                        String valueOf = String.valueOf(r0.A05);
                        ThreadKey threadKey3 = r0.A03;
                        if (threadKey3 != null) {
                            String A0w = 1BK.A0w(threadKey3);
                            Integer num = r0.A04;
                            if (num != null) {
                                C1296Ad8.A02(c1296Ad8, new CommunityMessagingLoggerModel(null, null, valueOf, str2, A0w, null, null, "admin_onboarding_sheet", "admin_onboarding_sheet_dismissed", null, null, 1BK.A1D("entry_point", 3GU.A00(num))), "dismiss");
                                return;
                            }
                            str = Property.SYMBOL_Z_ORDER_SOURCE;
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    public boolean A1J() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1469085608);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = (MigColorScheme) bundle.getParcelable("OVERRIDE_COLOR_SCHEME_KEY");
            this.A04 = bundle.getBoolean("SKIP_COLLAPSED_STATE_KEY");
            this.A02 = bundle.getBoolean("ADD_NESTED_SCROLL_CONTAINER_KEY");
        }
        0FI.A08(357336628, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.2qQ, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1371487666);
        11T.A0F(layoutInflater, 0);
        if (((2yD) 1Bi.A03(16385)).AZk(36326360943515130L)) {
            layoutInflater = layoutInflater.cloneInContext(requireContext());
        }
        View inflate = layoutInflater.inflate(2132542600, viewGroup, false);
        MigColorScheme A1F = A1F();
        ?? obj = new Object();
        ((2qQ) obj).A01 = false;
        ((2qQ) obj).A00 = true;
        Object Ci4 = A1F.Ci4(obj.A00());
        11T.A0A(Ci4);
        int i = 2132411138;
        if (((Boolean) Ci4).booleanValue()) {
            i = 2132411137;
        }
        inflate.setBackgroundResource(i);
        if (this.A02) {
            float f = NestedScrollView.A0T;
            LithoAwareNestedScrollView lithoAwareNestedScrollView = new LithoAwareNestedScrollView(layoutInflater.getContext());
            lithoAwareNestedScrollView.addView(inflate);
            inflate = lithoAwareNestedScrollView;
        }
        0FI.A08(912580991, A02);
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable("OVERRIDE_COLOR_SCHEME_KEY", this.A00);
        bundle.putBoolean("SKIP_COLLAPSED_STATE_KEY", this.A04);
        bundle.putBoolean("ADD_NESTED_SCROLL_CONTAINER_KEY", this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        float f;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Dialog A0e = A0e();
        MigColorScheme A1F = A1F();
        11T.A0F(A1F, 1);
        Window window = A0e.getWindow();
        if (window == null) {
            throw 1BK.A0h();
        }
        3PT.A00(window, A1F);
        ((LithoView) view.findViewById(2131364441)).A0x(new 8WD(A1F(), new C2xn(this, 43)));
        LithoView lithoView = (LithoView) view.findViewById(2131364453);
        1Iw r0 = lithoView.A09;
        11T.A0A(r0);
        DGJ A1E = A1E(r0);
        lithoView.A0x(A1E != null ? A1E.AJE(r0, A1F()) : null);
        View findViewById = view.findViewById(2131365726);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            9De c37r = requireContext().getResources().getConfiguration().orientation == 2 ? new C37r(100) : A1D();
            if ((c37r instanceof C37s) || (c37r instanceof C8w7)) {
                i = -1;
                float f2 = 0.0f / 0.0f;
            } else {
                if (c37r instanceof C37r) {
                    f = ((C37r) c37r).A00;
                } else if (c37r instanceof BCG) {
                    f = 87.5f;
                } else {
                    if (!(c37r instanceof C8w8)) {
                        throw 1BK.A1F();
                    }
                    f = 70.0f;
                }
                i = (int) (9Df.A00(requireContext()) * (f / 100.0f));
            }
            layoutParams.height = i;
        }
        A06(this);
        ((ViewGroup) view.findViewById(2131363003)).addView(A1C());
    }
}
