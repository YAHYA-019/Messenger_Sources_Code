package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.LithoView;
import com.facebook.messaging.media.loader.LocalMediaLoaderParams;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.messaging.montage.viewer.controlsoverlay.MontageViewerControlsContainer;
import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;
import com.facebook.messaging.montage.viewer.swipeablemediapicker.MontageViewerSwipeableMediaPickerContainerView;
import com.facebook.messaging.montage.viewer.swipeablemediapicker.MontageViewerSwipeableMediaPickerView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.resources.ui.FbButton;
import com.facebook.resources.ui.FbImageButton;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.facebook.user.model.User;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.text.BetterTextView;
import java.util.Locale;

/* renamed from: X.Gby, reason: case insensitive filesystem */
/* loaded from: Gby.class */
public final class C2396Gby extends 1pK implements JLj, JKA, 2Ob {
    public static final String __redex_internal_original_name = "MontageEndCardWithMediaPickerViewerPageFragment";
    public View.OnClickListener A00;
    public View.OnTouchListener A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public C00i A06;
    public LithoView A07;
    public MontageViewerFragment A08;
    public JFL A09;
    public MontageViewerControlsContainer A0A;
    public HGD A0B;
    public MontageProgressIndicatorView A0C;
    public MontageViewerSwipeableMediaPickerView A0D;
    public FbButton A0E;
    public FbImageButton A0F;
    public UserTileView A0G;
    public BetterTextView A0H;
    public String A0I;
    public String A0J;
    public C15h A0K;
    public long A0L;
    public long A0M;
    public C00i A0N;
    public boolean A0O;
    public final C00i A0T = AbH.A0Q();
    public boolean A0P = false;
    public final Runnable A0V = new Iqw(this);
    public final C00i A0S = AbH.A0c(this);
    public final C00i A0Q = 1BV.A00(16430);
    public final C00i A0W = AbH.A0a();
    public final C00i A0U = GOo.A0K();
    public final C00i A0R = 1BV.A00(115984);
    public final C00i A0X = AbH.A0S();

    /* JADX WARN: Multi-variable type inference failed */
    public static long A03(C2396Gby c2396Gby) {
        C00i c00i = c2396Gby.A06;
        c00i.getClass();
        c00i.get();
        Bundle bundle = c2396Gby.mArguments;
        bundle.getClass();
        return (bundle.getBoolean("is_end_card_arg") ? 10000L : 9000L) - c2396Gby.A0L;
    }

    public static I5R A06(C2396Gby c2396Gby) {
        C00i c00i = c2396Gby.A0N;
        if (c00i == null) {
            c00i = 1BV.A00(68403);
            c2396Gby.A0N = c00i;
        }
        return (I5R) c00i.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1O(boolean z, boolean z2) {
        super.A1O(z, z2);
        this.A0P = z;
        if (z) {
            A06(this).A05(this.A0I, "gallery", GOq.A0H(this));
            A1Y(A03(this));
            String A00 = HIN.A00();
            C00i c00i = this.A0X;
            FbSharedPreferences A0R = 1BK.A0R(c00i);
            1G9 r0 = HyP.A0B;
            int i = 1;
            if (A0R.A3a(r0, "").equals(A00)) {
                i = 1 + 1BK.A0R(c00i).ArU(HyP.A09, 0);
            }
            1Ql A0V = 1BL.A0V(c00i);
            A0V.CaL(r0, A00);
            A0V.CaE(HyP.A09, i);
            A0V.commit();
            ((HmP) 4YU.A0p(this.A06)).A00("GALLERY");
        }
        Context context = getContext();
        if (this.A0I != null || context == null) {
            return;
        }
        this.A0I = 7zR.A0s();
        ((HrY) this.A0R.get()).A00(C6r6.A0Q, this.A0I, 1XU.A00(context));
    }

    public 1iF A1R() {
        return AbF.A0C(1567251216773138L);
    }

    public void A1S(Bundle bundle) {
        this.A0K = J5u.A03(this, 29);
        this.A06 = 1BV.A00(68405);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1X() {
        C00i c00i;
        if (this.A0O) {
            return;
        }
        this.A0O = true;
        this.A0L += 1BL.A08(this.A0W) - this.A0M;
        MontageProgressIndicatorView montageProgressIndicatorView = this.A0C;
        if (montageProgressIndicatorView != null) {
            GOo.A1H(montageProgressIndicatorView);
            if (getContext() != null && (c00i = this.A0Q) != null && c00i.get() != null) {
                4YU.A0G(c00i).removeCallbacks(this.A0V);
            }
        }
        if (this.A0J != null) {
            A06(this).A02(GOq.A0H(this), this.A0I, "gallery", this.A0J);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1Y(long j) {
        C00i c00i;
        if (j >= 0 && this.A0O && this.A0P) {
            this.A0M = 1BL.A08(this.A0W);
            this.A0O = false;
            if (this.A0C != null) {
                if (getContext() != null && (c00i = this.A0Q) != null && c00i.get() != null) {
                    4YU.A0G(c00i).removeCallbacks(this.A0V);
                }
                this.A0C.A05(j);
                4YU.A0G(this.A0Q).postDelayed(this.A0V, j);
            }
            if (this.A0J != null) {
                A06(this).A03(GOq.A0H(this), this.A0I, "gallery", this.A0J);
                this.A0J = null;
            }
        }
    }

    public boolean ADo(MotionEvent motionEvent) {
        MontageViewerSwipeableMediaPickerView montageViewerSwipeableMediaPickerView = this.A0D;
        if (montageViewerSwipeableMediaPickerView == null) {
            return false;
        }
        MontageViewerSwipeableMediaPickerContainerView montageViewerSwipeableMediaPickerContainerView = montageViewerSwipeableMediaPickerView.A03;
        RecyclerView recyclerView = montageViewerSwipeableMediaPickerContainerView.A03;
        if (recyclerView == null) {
            return true;
        }
        float f = 0.0f / 0.0f;
        if (!recyclerView.canScrollVertically(-1) || motionEvent.getAction() != 0) {
            return true;
        }
        RecyclerView recyclerView2 = montageViewerSwipeableMediaPickerContainerView.A03;
        Rect rect = montageViewerSwipeableMediaPickerContainerView.A00;
        recyclerView2.getHitRect(rect);
        int[] A1b = GOn.A1b();
        recyclerView2.getLocationOnScreen(A1b);
        rect.offsetTo(A1b[0], A1b[1]);
        return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) ^ true;
    }

    @Override // X.JLj
    public void BrD(Throwable th) {
    }

    @Override // X.JLj
    public void BrE() {
    }

    @Override // X.JLj
    public void BrH() {
        HGD hgd;
        if (!this.A0P || (hgd = this.A0B) == null) {
            return;
        }
        hgd.A05(this);
    }

    @Override // X.JLj
    public void BrI() {
        HGD hgd = this.A0B;
        if (hgd != null) {
            hgd.A02();
        }
    }

    @Override // X.JLj
    public void BrJ() {
    }

    public void CnF(int i) {
    }

    public void CnG(Drawable drawable) {
    }

    public void D7g(float f) {
        float min = Math.min(Math.max(0.0f, f), 1.0f);
        MontageProgressIndicatorView montageProgressIndicatorView = this.A0C;
        if (montageProgressIndicatorView != null) {
            montageProgressIndicatorView.A03(min);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1 || this.A0B == null) {
            onResume();
            return;
        }
        A06(this).A01(GOq.A0H(this), this.A0I, "gallery", 7zK.A00(432));
        this.A0B.A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(240253561);
        View A08 = AbG.A08(layoutInflater.cloneInContext(requireContext()), viewGroup, 2132542741);
        0FI.A08(541524810, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1681127384);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        if (this.A0I != null) {
            ((HrY) this.A0R.get()).A01(this.A0I);
        }
        0FI.A08(558693022, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-296112242);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A1X();
        0FI.A08(-118573958, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1451654561);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A0L = 0L;
        this.A0O = true;
        if (this.A0P) {
            A1Y(A03(this));
        }
        0FI.A08(-2099638429, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        7Mg r304;
        7Mg r3042;
        super.onViewCreated(view, bundle);
        this.A05 = 7zL.A0F(this, 2131365816);
        this.A0A = (MontageViewerControlsContainer) 7zL.A0F(this, 2131363900);
        this.A0G = (UserTileView) 7zL.A0F(this, 2131363904);
        this.A0D = (MontageViewerSwipeableMediaPickerView) 7zL.A0F(this, 2131363905);
        this.A0F = (FbImageButton) 7zL.A0F(this, 2131363049);
        this.A0H = GOp.A10(this, 2131368307);
        this.A02 = 7zL.A0F(this, 2131364450);
        this.A03 = 7zL.A0F(this, 2131365509);
        this.A04 = 7zL.A0F(this, 2131363902);
        IXK ixk = new IXK(this, 1);
        this.A09 = ixk;
        this.A0A.A02 = ixk;
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        String string = bundle2.getString("montage_viewer_launch_source_arg");
        string.getClass();
        try {
            r304 = (7Mg) Enum.valueOf(7Mg.class, string.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            r304 = 7Mg.A0R;
        }
        if (!HIO.A00(r304)) {
            MontageViewerSwipeableMediaPickerView montageViewerSwipeableMediaPickerView = this.A0D;
            HmN hmN = new HmN(this);
            montageViewerSwipeableMediaPickerView.A02 = hmN;
            MontageViewerSwipeableMediaPickerContainerView montageViewerSwipeableMediaPickerContainerView = montageViewerSwipeableMediaPickerView.A03;
            montageViewerSwipeableMediaPickerContainerView.A07 = hmN;
            C00i c00i = montageViewerSwipeableMediaPickerContainerView.A04;
            ((2SQ) c00i.get()).CmR(new GfK(montageViewerSwipeableMediaPickerContainerView, 3));
            ((IQR) c00i.get()).A02 = new HRi(new int[]{100});
            if (((1Rv) montageViewerSwipeableMediaPickerContainerView.A0E.get()).A09(48U.A00(montageViewerSwipeableMediaPickerContainerView.getContext(), new String[]{"android.permission.READ_EXTERNAL_STORAGE"}))) {
                ((2SQ) montageViewerSwipeableMediaPickerContainerView.A04.get()).D1t(new LocalMediaLoaderParams(new MediaResourceSendSource(C5es.A0I, C5et.PICK), null, (-1) >>> 1, -1, true, true));
            }
        }
        IKE.A01(this.A0F, this, 93);
        FbImageButton fbImageButton = this.A0F;
        C00i c00i2 = this.A0T;
        fbImageButton.setImageResource(GOn.A0M(c00i2).A00());
        FbImageButton fbImageButton2 = this.A0F;
        C00i c00i3 = this.A0S;
        fbImageButton2.setColorFilter(AbF.A0p(c00i3).B4h());
        AbG.A1H(7zL.A0F(this, 2131363899), AbF.A0p(c00i3));
        this.A0C = new MontageProgressIndicatorView(requireContext(), c00i3.get() instanceof LightColorScheme);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, GOn.A07(7zO.A0D(this), 2132279309));
        int A07 = GOn.A07(7zO.A0D(this), 2132279327);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = A07;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = A07;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = A07;
        this.A0C.setLayoutParams(layoutParams);
        ((ViewGroup) this.A04).addView(this.A0C, 0);
        this.A0C.setPosition(0, 1);
        MontageProgressIndicatorView montageProgressIndicatorView = this.A0C;
        C00i c00i4 = this.A06;
        c00i4.getClass();
        c00i4.get();
        Bundle bundle3 = this.mArguments;
        bundle3.getClass();
        montageProgressIndicatorView.A04(bundle3.getBoolean("is_end_card_arg") ? 10000L : 9000L);
        this.A0C.A01();
        if (getContext() != null) {
            C15h c15h = this.A0K;
            c15h.getClass();
            User user = (User) c15h.get();
            UserTileView userTileView = this.A0G;
            if (userTileView != null) {
                userTileView.A03(2qZ.A05(user.A0k));
            }
            Bundle bundle4 = this.mArguments;
            bundle4.getClass();
            String string2 = bundle4.getString("montage_viewer_launch_source_arg");
            string2.getClass();
            try {
                r3042 = (7Mg) Enum.valueOf(7Mg.class, string2.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused2) {
                r3042 = 7Mg.A0R;
            }
            boolean A00 = HIO.A00(r3042);
            2OB r0 = this.A0H;
            if (A00) {
                r0.setVisibility(4);
                LithoView lithoView = (LithoView) GOp.A0D(this, 2131365723).inflate();
                this.A07 = lithoView;
                MigColorScheme A0p = AbF.A0p(c00i3);
                JFL jfl = this.A09;
                View.OnClickListener onClickListener = this.A00;
                if (onClickListener == null) {
                    onClickListener = IKE.A00(this, 94);
                    this.A00 = onClickListener;
                }
                lithoView.A0y(new 8XU(onClickListener, jfl, A0p));
                this.A05.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            } else {
                r0.setText(2131960672);
                DKH.A1B(this.A0H, c00i3);
                FbButton fbButton = (FbButton) GOp.A0D(this, 2131365841).inflate();
                this.A0E = fbButton;
                View.OnClickListener onClickListener2 = this.A00;
                if (onClickListener2 == null) {
                    onClickListener2 = IKE.A00(this, 94);
                    this.A00 = onClickListener2;
                }
                fbButton.setOnClickListener(onClickListener2);
                FbButton fbButton2 = this.A0E;
                IKm iKm = this.A01;
                if (iKm == null) {
                    iKm = new IKm(this, 11);
                    this.A01 = iKm;
                }
                fbButton2.setOnTouchListener(iKm);
            }
        }
        AbG.A1H(7zL.A0F(this, 2131365852), AbF.A0p(c00i3));
        DKH.A1B(DKG.A0D(this, 2131365850), c00i3);
        ImageView imageView = (ImageView) 7zL.A0F(this, 2131365849);
        GOn.A1P(imageView, C1u3.A1X, GOn.A0M(c00i2));
        imageView.setColorFilter(AbF.A0p(c00i3).B4h());
    }
}
