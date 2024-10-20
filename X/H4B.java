package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.facebook.messaging.expandablecomponent.ExpandableBottomSheetContainer;
import com.facebook.messaging.media.swipeablemediatray.SwipeableMediaTrayContainerView;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatarpowerup.AvatarPowerUpSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.regularpowerup.RegularPowerUpSuggestedRow;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.stickerhint.StickerHintSuggestedRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbLinearLayout;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: H4B.class */
public abstract class H4B extends 6cN {
    public int A00;
    public VelocityTracker A01;
    public HFC A02;
    public ExpandableBottomSheetContainer A03;
    public JEt A04;
    public 6cN A05;
    public final View.OnClickListener A06;

    public H4B(Context context) {
        super(context);
        this.A06 = IKE.A00(this, 35);
        A0F();
    }

    public H4B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = IKE.A00(this, 35);
        A0F();
    }

    public H4B(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = IKE.A00(this, 35);
        A0F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r304 == null) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0E(X.H4B r301) {
        /*
            r0 = r301
            boolean r0 = X.GOo.A1V(r0)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L24
            r0 = r301
            android.view.View r0 = r0.getRootView()
            r303 = r0
            r0 = 2131367013(0x7f0a1465, float:1.8353936E38)
            r302 = r0
            r0 = r303
            r1 = r302
            android.view.View r0 = r0.findViewById(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L38
            r0 = r304
            android.view.View r0 = X.GOn.A0H(r0)
            r304 = r0
        L20:
            r0 = r304
            if (r0 != 0) goto L49
        L24:
            r0 = r301
            android.view.View r0 = r0.getRootView()
            r303 = r0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r302 = r0
            r0 = r303
            r1 = r302
            android.view.View r0 = r0.findViewById(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L49
            r0 = 0
            return r0
        L38:
            r0 = r301
            android.view.View r0 = r0.getRootView()
            r303 = r0
            r0 = 2131363335(0x7f0a0607, float:1.8346476E38)
            r302 = r0
            r0 = r303
            r1 = r302
            android.view.View r0 = r0.findViewById(r1)
            r304 = r0
            goto L20
        L49:
            r0 = r304
            int r0 = r0.getHeight()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4B.A0E(X.H4B):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0F() {
        A0U(2132541945);
        this.A03 = (ExpandableBottomSheetContainer) C09s.A01(this, 2131363944);
    }

    private void A0G(float f) {
        ViewGroup.LayoutParams layoutParams;
        HFC hfc = this.A02;
        if (hfc != null) {
            int i = (int) (f * hfc.A00);
            View view = hfc.A02;
            if (view == null || view.getLayoutParams() == null || (layoutParams = view.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
            view.requestLayout();
        }
    }

    public static void A0H(MotionEvent motionEvent, H4B h4b) {
        if (h4b.A01 != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
            h4b.A01.addMovement(obtain);
        }
    }

    public static void A0I(View view, H4B h4b) {
        h4b.A0K(false);
        if (view.getParent() != h4b) {
            h4b.A0V(view, new FrameLayout.LayoutParams(view.getWidth(), h4b.A0W(), 85));
            JEt jEt = h4b.A04;
            if (jEt != null) {
                jEt.Cuh(16);
            }
        }
    }

    private void A0J(DF2 df2, int i) {
        ViewGroup.LayoutParams layoutParams;
        if (this.A03 == null || i < A0W() || i > A0E(this) || (layoutParams = this.A03.getLayoutParams()) == null) {
            return;
        }
        int i2 = layoutParams.height;
        boolean z = false;
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new IG3(this, layoutParams, 0));
        if (i < i2 || i == A0W()) {
            z = true;
            C5fi.A01(this.A03);
        }
        ofInt.addListener(new IFv(0, df2, this, z));
        0K6.A00(ofInt);
    }

    private void A0K(boolean z) {
        HFC hfc = this.A02;
        if (hfc != null) {
            View view = hfc.A02;
            ValueAnimator ofInt = ValueAnimator.ofInt((view == null || view.getLayoutParams() == null) ? hfc.A01 != null ? hfc.A00 : 0 : view.getLayoutParams().height, z ? hfc.A00 : 0);
            ofInt.setDuration(250L);
            IG6.A00(ofInt, hfc, 2);
            0K6.A00(ofInt);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int A0W() {
        if (getParent() == null) {
            return 0;
        }
        return GOn.A0H(this).getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0X() {
        ExpandableBottomSheetContainer expandableBottomSheetContainer = this.A03;
        if (expandableBottomSheetContainer != null) {
            A0I(expandableBottomSheetContainer, this);
        }
        6cN r0 = this.A05;
        if (r0 != null) {
            post(new Iw9(r0, this));
            this.A05 = null;
        }
    }

    public void A0Y() {
        String str;
        if (this instanceof C2734Gmj) {
            SwipeableMediaTrayContainerView swipeableMediaTrayContainerView = ((C2734Gmj) this).A01;
            HqP hqP = swipeableMediaTrayContainerView.A05;
            if (hqP == null) {
                str = "folderController";
            } else {
                IVO.A02(hqP.A06);
                H4t A0V = swipeableMediaTrayContainerView.A0V();
                JZj jZj = A0V.A0x.A02;
                if (jZj != null) {
                    jZj.dismiss();
                }
                DMV dmv = A0V.A05;
                if (dmv != null) {
                    dmv.dismiss();
                }
                FbLinearLayout fbLinearLayout = A0V.A0L;
                if (fbLinearLayout != null) {
                    fbLinearLayout.setVisibility(8);
                    return;
                }
                str = "noRollCallMediaView";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0Z() {
        if (GOo.A1V(this)) {
            ExpandableBottomSheetContainer expandableBottomSheetContainer = this.A03;
            if (expandableBottomSheetContainer != null) {
                A0I(expandableBottomSheetContainer, this);
            }
            6cN r0 = this.A05;
            if (r0 != null) {
                post(new Iw9(r0, this));
                this.A05 = null;
            }
        }
    }

    public void A0a(float f) {
        A0G(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        if (r304 == null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0b(android.view.View r302) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4B.A0b(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.HFC, java.lang.Object] */
    public void A0c(View view, View view2) {
        ExpandableBottomSheetContainer expandableBottomSheetContainer = this.A03;
        if (expandableBottomSheetContainer != null && view != null) {
            expandableBottomSheetContainer.A03.getClass();
            expandableBottomSheetContainer.A00 = view;
            expandableBottomSheetContainer.A03.addView(view);
            ExpandableBottomSheetContainer expandableBottomSheetContainer2 = this.A03;
            if (view2 != null) {
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view2);
                }
                expandableBottomSheetContainer2.A04.addView(view2);
            }
            this.A03.setOnTouchListener(new IKU(this));
        }
        Context context = getContext();
        ?? obj = new Object();
        ((HFC) obj).A01 = context;
        ((HFC) obj).A02 = view2;
        if (context != null) {
            ((HFC) obj).A00 = GOo.A01(context.getResources());
        }
        this.A02 = obj;
        A0G(0.0f);
    }

    public void A0d(EditText editText, JEs jEs, JEt jEt) {
        this.A04 = jEt;
        editText.setFocusable(false);
        editText.setOnClickListener(this.A06);
        editText.setOnFocusChangeListener(new IKH(jEs));
    }

    public void A0e(DF2 df2, boolean z) {
        boolean z2;
        if (z) {
            A0J(df2, A0W());
            z2 = false;
        } else {
            A0J(df2, A0E(this));
            z2 = true;
        }
        A0K(z2);
    }

    public void A0f(MigColorScheme migColorScheme) {
        ExpandableBottomSheetContainer expandableBottomSheetContainer = this.A03;
        if (expandableBottomSheetContainer != null) {
            int BDl = migColorScheme.BDl();
            int AqM = migColorScheme.AqM();
            AbH.A1K(expandableBottomSheetContainer.A01, BDl);
            AbH.A1K(expandableBottomSheetContainer.A04, BDl);
            AbH.A1K(expandableBottomSheetContainer.A03, BDl);
            AbH.A1K(C09s.A01(expandableBottomSheetContainer.A01, 2131364438), AqM);
        }
    }

    public void A0g(boolean z) {
    }

    public void A0h(boolean z) {
        String str;
        int i;
        H4x h4x;
        if (this instanceof C2734Gmj) {
            SwipeableMediaTrayContainerView swipeableMediaTrayContainerView = ((C2734Gmj) this).A01;
            if (z) {
                swipeableMediaTrayContainerView.A0V().A0X(0S2.A00);
                return;
            }
            return;
        }
        if (this instanceof C2736Gml) {
            C2736Gml c2736Gml = (C2736Gml) this;
            c2736Gml.A0I = z;
            HGH A00 = C2736Gml.A00(c2736Gml, c2736Gml.A00);
            if (A00 == null || !(A00 instanceof H0H) || (h4x = ((H0H) A00).A04) == null) {
                return;
            }
            h4x.A0C = z;
            H4x.A09(h4x, false);
            return;
        }
        if (this instanceof C2735Gmk) {
            C2735Gmk c2735Gmk = (C2735Gmk) this;
            c2735Gmk.A09 = z;
            HW9 hw9 = c2735Gmk.A02;
            if (hw9 == null) {
                11T.A0L("suggestionRows");
                throw 0Q8.createAndThrow();
            }
            boolean z2 = !z;
            IEz iEz = hw9.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = iEz.A0I;
            r0.A08("com.facebook.messaging.suggestedkeyboard.plugins.interfaces.suggestionrow.SuggestedRowInterfaceSpec", "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setTrayExpanded", andIncrement);
            try {
                try {
                    if (IEz.A04(iEz)) {
                        i = atomicInteger.getAndIncrement();
                        str = GOp.A19(r0, "setTrayExpanded", i);
                        try {
                            RegularPowerUpSuggestedRow regularPowerUpSuggestedRow = iEz.A05;
                            regularPowerUpSuggestedRow.A03 = z2;
                            RegularPowerUpSuggestedRow.A00(regularPowerUpSuggestedRow);
                            r0.A09(str, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setTrayExpanded", i);
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    if (IEz.A01(iEz)) {
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        String A0x = GOo.A0x(r0, "setTrayExpanded", andIncrement2);
                        AvatarPowerUpSuggestedRow avatarPowerUpSuggestedRow = iEz.A02;
                        avatarPowerUpSuggestedRow.A03 = z2;
                        AvatarPowerUpSuggestedRow.A00(avatarPowerUpSuggestedRow);
                        r0.A09(A0x, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setTrayExpanded", andIncrement2);
                    }
                    if (IEz.A06(iEz)) {
                        i = atomicInteger.getAndIncrement();
                        str = GOo.A0w(r0, "setTrayExpanded", i);
                        StickerHintSuggestedRow stickerHintSuggestedRow = iEz.A07;
                        stickerHintSuggestedRow.A04 = z2;
                        StickerHintSuggestedRow.A00(stickerHintSuggestedRow);
                        r0.A09(str, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setTrayExpanded", i);
                    }
                    r0.A02((Exception) null, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setTrayExpanded", andIncrement);
                    Integer num = (C2735Gmk.A03(c2735Gmk) && !c2735Gmk.A09 && c2735Gmk.A08) ? 0S2.A01 : 0S2.A0C;
                    if (c2735Gmk.A07 != num) {
                        C2735Gmk.A01(c2735Gmk, num);
                    }
                    if (z) {
                        C2735Gmk.A02(c2735Gmk, false);
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, str, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setTrayExpanded", i);
                    throw th;
                }
            } catch (Throwable th2) {
                r0.A02((Exception) null, "messaging.suggestedkeyboard.suggestionrow.SuggestedRowInterfaceSpec", "setTrayExpanded", andIncrement);
                throw th2;
            }
        }
    }

    public void A0i(boolean z) {
        if (z) {
            C5fi.A01(this.A03);
        }
    }

    public boolean A0j() {
        return AnonymousClass001.A1W(this.A03.getParent(), this);
    }

    public boolean A0k() {
        boolean z = false;
        if (!A0j()) {
            A0i(false);
            z = true;
            A0e(null, true);
        }
        return z;
    }

    public boolean A0l() {
        return this instanceof C2734Gmj ? ((C2734Gmj) this).A01.A0a() : A0k();
    }

    public boolean A0m(DF2 df2) {
        if (!A0j()) {
            return false;
        }
        A0i(true);
        A0b(this.A03);
        A0e(df2, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-447977464);
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        ExpandableBottomSheetContainer expandableBottomSheetContainer = this.A03;
        if (expandableBottomSheetContainer != null) {
            expandableBottomSheetContainer.getLayoutParams().getClass();
            if (i != i3) {
                this.A03.getLayoutParams().width = i;
            }
            this.A03.getLayoutParams().height = A0W();
            this.A03.requestLayout();
        }
        0FI.A0C(-1229570507, A06);
    }
}
