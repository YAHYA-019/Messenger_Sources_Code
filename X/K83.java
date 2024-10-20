package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebookpay.widget.navibar.NavigationBar;
import java.util.List;

/* loaded from: K83.class */
public class K83 extends DR8 implements MLm {
    public static final /* synthetic */ C06z[] A0X = {JQx.A16(K83.class, "headerTitle", "getHeaderTitle()Ljava/lang/String;"), JQx.A16(K83.class, "headerIcon", "getHeaderIcon()Lcom/facebookpay/widget/style/Icon;"), JQx.A16(K83.class, "headerLeftIconButtonIcon", "getHeaderLeftIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), JQx.A16(K83.class, "isLeftProfileIcon", "isLeftProfileIcon()Z"), JQx.A16(K83.class, "headerLeftTextButtonText", "getHeaderLeftTextButtonText()Ljava/lang/String;"), JQx.A16(K83.class, "headerRightIconButtonIcon", "getHeaderRightIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), JQx.A16(K83.class, "headerRightTextButtonText", "getHeaderRightTextButtonText()Ljava/lang/String;"), JQx.A16(K83.class, "isRightProfileIcon", "isRightProfileIcon()Z"), JQx.A16(K83.class, "headerRightTextButtonEnable", "getHeaderRightTextButtonEnable()Z"), JQx.A16(K83.class, "headerClickableActionsEnable", "getHeaderClickableActionsEnable()Z"), JQx.A16(K83.class, "progressIconShow", "getProgressIconShow()Z"), JQx.A16(K83.class, "headerLeftIconButtonOnClickListener", "getHeaderLeftIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), JQx.A16(K83.class, "headerLeftTextButtonOnClickListener", "getHeaderLeftTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), JQx.A16(K83.class, "headerRightIconButtonOnClickListener", "getHeaderRightIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), JQx.A16(K83.class, "headerRightTextButtonOnClickListener", "getHeaderRightTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), JQx.A16(K83.class, "headerLeftTextButtonHint", "getHeaderLeftTextButtonHint()Ljava/lang/String;"), JQx.A16(K83.class, "headerLeftIconButtonHint", "getHeaderLeftIconButtonHint()Ljava/lang/String;"), JQx.A16(K83.class, "headerRightIconButtonHint", "getHeaderRightIconButtonHint()Ljava/lang/String;"), JQx.A16(K83.class, "headerRightTextButtonHint", "getHeaderRightTextButtonHint()Ljava/lang/String;"), JQx.A16(K83.class, "headerDividerVisible", "getHeaderDividerVisible()Z"), JQx.A16(K83.class, "isLandscape", "isLandscape()Z")};
    public static final String __redex_internal_original_name = "FBPayBottomSheetDialogFragment";
    public DialogInterface.OnDismissListener A00;
    public Bundle A01;
    public FrameLayout A02;
    public ImageView A03;
    public ProgressBar A04;
    public ConstraintLayout A05;
    public ConstraintLayout A06;
    public Fragment A07;
    public NavigationBar A08;
    public boolean A0A;
    public ContextThemeWrapper A0B;
    public final 0G2 A0C;
    public final 0G2 A0D;
    public final 0G2 A0F;
    public final 0G2 A0H;
    public final 0G2 A0I;
    public final 0G2 A0J;
    public final 0G2 A0K;
    public final 0G2 A0L;
    public final 0G2 A0M;
    public final 0G2 A0N;
    public final 0G2 A0O;
    public final 0G2 A0P;
    public final 0G2 A0Q;
    public final 0G2 A0R;
    public final 0G2 A0T;
    public final 0G2 A0U;
    public final 0G2 A0V;
    public final 0G2 A0W;
    public String A09 = "";
    public final 0G2 A0S = new M9M(this, 16);
    public final 0G2 A0E = new M9M(this, 19);
    public final 0G2 A0G = new M9M(this, 20);

    public K83() {
        Boolean A0d = 1BK.A0d();
        this.A0U = new M9M(this, A0d, 21);
        this.A0K = new M9M(this, 22);
        this.A0M = new M9M(this, 23);
        this.A0R = new M9M(this, 24);
        this.A0V = new M9M(this, A0d, 25);
        this.A0O = new M9M(this, A0d, 26);
        this.A0C = new M9M(this, A0d, 6);
        this.A0W = new M9M(this, A0d, 7);
        this.A0H = new M9M(this, 8);
        this.A0J = new M9M(this, 9);
        this.A0N = new M9M(this, 10);
        this.A0Q = new M9M(this, 11);
        this.A0I = new M9M(this, 12);
        this.A0F = new M9M(this, 13);
        this.A0L = new M9M(this, 14);
        this.A0P = new M9M(this, 15);
        this.A0D = new M9M(this, A0d, 17);
        this.A0T = new M9M(this, A0d, 18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int A0l() {
        if (requireArguments().containsKey("STYLE_RES")) {
            return requireArguments().getInt("STYLE_RES");
        }
        C06014fk.A04().A02(14);
        throw 0Q8.createAndThrow();
    }

    public Dialog A0n(Bundle bundle) {
        return A0q(null);
    }

    public void A0o() {
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(((0D2) this).A01);
        }
        super.A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Qmh A0q(C00m c00m) {
        Window window;
        Qmh qmh = new Qmh(requireContext(), this, c00m, requireArguments().getInt("STYLE_RES"));
        qmh.setOnShowListener(new FKG(this, 6));
        if (requireArguments().getBoolean("checkoutInFullScreen", false) && (window = qmh.getWindow()) != null) {
            window.setFlags(1024, 1024);
        }
        return qmh;
    }

    public final void A0r() {
        5XE r0 = new 5XE();
        ConstraintLayout constraintLayout = this.A05;
        if (constraintLayout != null) {
            r0.A0C(constraintLayout);
            r0.A08(2131362589, 0.67f);
            ConstraintLayout constraintLayout2 = this.A05;
            if (constraintLayout2 != null) {
                r0.A0A(constraintLayout2);
                return;
            }
        }
        11T.A0L("transparentViewContainer");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MLm
    public boolean BdB() {
        if (getChildFragmentManager().A0U() <= 1) {
            return false;
        }
        List A0A = getChildFragmentManager().A0T.A0A();
        11T.A0A(A0A);
        JgV jgV = (Fragment) 0QD.A0F(A0A);
        if ((jgV instanceof JgV) && jgV.A0F()) {
            getChildFragmentManager().A1V();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean BrB() {
        if (getChildFragmentManager().A0U() <= 1) {
            return false;
        }
        getChildFragmentManager().A1V();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MLm
    public void CnK(Fragment fragment, boolean z, boolean z2) {
        06Z A08 = 7zN.A08(this);
        if (z2 && A08.A0U() > 0) {
            A08.A0x(((C06c) A08.A0e(0)).A07);
        }
        0AW.A04(this);
        fragment.setTargetFragment(null, this.mTargetRequestCode);
        C06c c06c = new C06c(A08);
        c06c.A0Q(fragment, "BOTTOM_SHEET_CONTENT_FRAGMENT_TAG", 2131363336);
        if (z) {
            c06c.A0V(null);
        }
        c06c.A04();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1301915478);
        11T.A0F(layoutInflater, 0);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), A0l());
        this.A0B = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(2131558406, viewGroup, false);
        0FI.A08(1967154109, A02);
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        String str = this.A09;
        if (str.length() > 0) {
            bundle.putString("SAVED_INSTANCE_FRAGMENT_ID_KEY", str);
        }
        Bundle bundle2 = this.A01;
        if (bundle2 != null) {
            bundle.putBundle("SAVED_INSTANCE_FRAGMENT_BUNDLE_KEY", bundle2);
        }
        super/*X.0D2*/.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0185, code lost:
    
        if (r304 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019d, code lost:
    
        if (r304 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01fd, code lost:
    
        if (r0.equals("loading_fragment") != false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K83.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
