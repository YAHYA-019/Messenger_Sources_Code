package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController;
import com.facebook.secure.securewebview.SecureWebView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.meta.foa.widgets.AnimatableView;

/* loaded from: E8j.class */
public abstract class E8j extends 25G implements C1rk {
    public DLQ A00;
    public final long A01;

    public E8j(FyG fyG, DLQ dlq) {
        super(0S2.A01);
        this.A01 = dlq.A04;
        this.A00 = dlq;
        29L[] r0 = {DKC.A0d(new Fr2(fyG, this), this), DKC.A0d(new EHh(fyG, this), this)};
        int i = 0;
        do {
            A0E(r0[i]);
            i++;
        } while (i < 2);
    }

    public static Integer A03(FyG fyG, DLQ dlq, int i) {
        Integer num = null;
        DLQ A06 = dlq.A06(i);
        if (A06 != null) {
            num = Integer.valueOf(EYa.A00(fyG, A06, 0));
        }
        return num;
    }

    public long A0I() {
        return this.A01;
    }

    public C1rk A0J() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x08b2, code lost:
    
        if (X.11T.A0N(r0 != null ? r0.A00 : null, r0) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0290, code lost:
    
        if (X.F2Z.A00(r304, 58, false) != false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r316v7, types: [java.lang.Object, X.ET9] */
    /* JADX WARN: Type inference failed for: r316v9, types: [java.lang.Object, X.ET9] */
    /* JADX WARN: Type inference failed for: r319v11, types: [java.lang.Object, X.ET9] */
    /* JADX WARN: Type inference failed for: r319v9, types: [java.lang.Object, X.ET9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0K(android.view.View r302, X.FyG r303, X.DLQ r304, java.lang.Object r305) {
        /*
            Method dump skipped, instructions count: 3383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8j.A0K(android.view.View, X.FyG, X.DLQ, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0L(View view, FyG fyG, DLQ dlq, Object obj, Object obj2) {
        if (this instanceof EHq) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
            11T.A0F(swipeRefreshLayout, 0);
            int childCount = swipeRefreshLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = swipeRefreshLayout.getChildAt(i);
                if (childAt instanceof E8b) {
                    ((E8b) childAt).Ctt(null);
                    swipeRefreshLayout.A08(false);
                    return;
                }
            }
            throw AnonymousClass001.A0N("SwipeRefreshLayout does not contain RenderTreeHostView child");
        }
        if (this instanceof EHs) {
            EHs eHs = (EHs) this;
            ViewGroup viewGroup = (ViewGroup) view;
            7zT.A1S(viewGroup, fyG, dlq);
            AvatarRetextureSparkPreviewController avatarRetextureSparkPreviewController = (AvatarRetextureSparkPreviewController) FJ6.A06(dlq, fyG);
            if (avatarRetextureSparkPreviewController != null) {
                LifecycleOwner lifecycleOwner = eHs.A00;
                11T.A0F(lifecycleOwner, 0);
                Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                ILQ ilq = avatarRetextureSparkPreviewController.A04;
                lifecycle.removeObserver(ilq);
                HkX hkX = ilq.A00;
                if (hkX != null) {
                    hkX.A06.destroy();
                }
            }
            viewGroup.removeAllViews();
            return;
        }
        if (this instanceof EHp) {
            ((GJk) view).CvQ(1.0f);
            return;
        }
        if (this instanceof EHt) {
            EHt eHt = (EHt) this;
            C01i c01i = ((F67) DKC.A0z(eHt.A01, eHt.A00)).A04;
            ((Eum) c01i.getValue()).A00();
            ((Eum) c01i.getValue()).A01 = false;
            return;
        }
        if (this instanceof EHr) {
            EHr eHr = (EHr) this;
            EbY ebY = (EbY) FJ6.A06(dlq, fyG);
            if (ebY == null) {
                throw AnonymousClass001.A0T("Popup container defines a controller but none was found");
            }
            eHr.A00.removeCallbacksAndMessages(null);
            PopupWindow popupWindow = ebY.A00;
            View contentView = popupWindow.getContentView();
            C0k4.A00(contentView);
            ((E8b) contentView).Ctt(null);
            popupWindow.dismiss();
            return;
        }
        if (this instanceof EHz) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            11T.A0F(viewGroup2, 0);
            1BL.A1F(fyG, dlq);
            0fH.A0j("BodyParametricSliderPreviewUnit", "onFinalUnmount");
            if (viewGroup2.getChildCount() <= 0 || !(0Se.A00(viewGroup2) instanceof SeekBar)) {
                return;
            }
            View A00 = 0Se.A00(viewGroup2);
            11T.A0I(A00, "null cannot be cast to non-null type android.widget.SeekBar");
            ((SeekBar) A00).setOnSeekBarChangeListener(null);
            viewGroup2.setTag(2131361797, false);
            return;
        }
        if (this instanceof KJu) {
            ViewGroup viewGroup3 = (ViewGroup) view;
            11T.A0F(viewGroup3, 0);
            11T.A0G(fyG, 1, dlq);
            EHa childAt2 = viewGroup3.getChildAt(0);
            11T.A0I(childAt2, "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView");
            EHa eHa = childAt2;
            EHa childAt3 = viewGroup3.getChildAt(1);
            11T.A0I(childAt3, "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView");
            EHa eHa2 = childAt3;
            eHa.A0Z((F63) null, (FyG) null);
            eHa2.A0Z((F63) null, (FyG) null);
            eHa.A01 = 0;
            eHa.A00 = 0;
            EHa.A00(eHa);
            eHa2.A01 = 0;
            eHa2.A00 = 0;
            EHa.A00(eHa2);
            Object A06 = FJ6.A06(dlq, fyG);
            if (A06 == null) {
                throw 1BK.A0h();
            }
            ((EbX) A06).A00 = -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0M(View view, FyG fyG, DLQ dlq, Object obj, Object obj2) {
        if ((this instanceof EHl) || (this instanceof EHm)) {
            AnimatableView animatableView = (AnimatableView) view;
            11T.A0F(animatableView, 0);
            animatableView.A01();
            return;
        }
        if (this instanceof EHq) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
            11T.A0F(swipeRefreshLayout, 0);
            swipeRefreshLayout.A0C = null;
            return;
        }
        if (this instanceof EHs) {
            return;
        }
        if (this instanceof EHp) {
            ((GJk) view).A00.setOnCheckedChangeListener(null);
            return;
        }
        if (this instanceof EHt) {
            EHt eHt = (EHt) this;
            ((F67) DKC.A0z(eHt.A01, eHt.A00)).A00 = null;
            return;
        }
        if (this instanceof EHu) {
            11T.A0F(view, 0);
            view.setBackground(null);
            return;
        }
        if (this instanceof EHo) {
            ImageView imageView = (ImageView) view;
            11T.A0F(imageView, 0);
            imageView.clearColorFilter();
            return;
        }
        if (this instanceof EHn) {
            return;
        }
        if (this instanceof EHy) {
            E9X e9x = (E9X) ((SecureWebView) view);
            EkX ekX = (EkX) FJ6.A06(dlq, fyG);
            e9x.A01.A00 = null;
            e9x.onPause();
            DR4 dr4 = ekX.A00;
            dr4.A00 = null;
            dr4.A01(false);
            e9x.stopLoading();
            e9x.clearHistory();
            e9x.loadData("", null, null);
            return;
        }
        if ((this instanceof EHv) || (this instanceof EHr) || (this instanceof EHk)) {
            return;
        }
        if (this instanceof EHj) {
            ViewGroup viewGroup = (ViewGroup) view;
            11T.A0F(viewGroup, 0);
            if (viewGroup.getChildCount() > 0) {
                View A00 = 0Se.A00(viewGroup);
                11T.A0I(A00, "null cannot be cast to non-null type com.bloks.components.bkcomponentaeparametricslider.ParametricSlider");
                ((SeekBar) A00).setOnSeekBarChangeListener(null);
                return;
            }
            return;
        }
        if (this instanceof EHz) {
            1BL.A1F(fyG, dlq);
            0fH.A0j("BodyParametricSliderPreviewUnit", "unbind");
            Egz egz = (Egz) FJ6.A06(dlq, fyG);
            if (egz != null) {
                egz.A01 = null;
                egz.A00 = null;
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        11T.A0F(viewGroup2, 0);
        if (obj2 != null) {
            View childAt = viewGroup2.getChildAt(1);
            11T.A0I(childAt, "null cannot be cast to non-null type com.bloks.components.bkavatareditorverticalsplitpane.ResizingBloksRenderTreeHostView");
            BottomSheetBehavior A02 = BottomSheetBehavior.A02(childAt);
            11T.A0A(A02);
            A02.A0l.remove(obj2);
        }
    }

    public boolean A0N(DLQ dlq, DLQ dlq2, Object obj, Object obj2) {
        if (this instanceof EHq) {
            return 1BK.A1V(obj, obj2);
        }
        if (this instanceof EHy) {
            return false;
        }
        return this instanceof KJu ? !11T.A0O(obj, obj2) : AnonymousClass001.A1U(EbC.A01.get());
    }

    @Override // X.C1rk
    public /* synthetic */ boolean ADe() {
        return false;
    }

    @Override // X.C1rk
    public /* synthetic */ Object B3t() {
        return getClass();
    }

    @Override // X.C1rk
    public /* synthetic */ 1Ii B3u() {
        return C29N.A00;
    }

    @Override // X.C1rk
    public /* synthetic */ C3m7 Brt(int i) {
        return C2m5.A00(this, i);
    }

    @Override // X.C1rk
    public /* synthetic */ int CXj() {
        return 3;
    }
}
