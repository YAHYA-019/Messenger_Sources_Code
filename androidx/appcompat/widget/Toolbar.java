package androidx.appcompat.widget;

import X.0FI;
import X.4YV;
import X.53Y;
import X.53Z;
import X.AnonymousClass001;
import X.AnonymousClass066;
import X.C05u;
import X.C06k;
import X.C0Ad;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DQB;
import X.DQw;
import X.JQx;
import X.JQy;
import X.JXV;
import X.JXy;
import X.JZi;
import X.JZn;
import X.KTj;
import X.Kqa;
import X.LGb;
import X.LKL;
import X.LKO;
import X.LLU;
import X.LLZ;
import X.LLc;
import X.LLf;
import X.LLh;
import X.LQD;
import X.LQF;
import X.Lji;
import X.MB4;
import X.MDw;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.customview.view.AbsSavedState;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.widget.toolbar.ThemeCompatToolbar;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Toolbar.class */
public class Toolbar extends ViewGroup implements C05u {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Context A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public View A08;
    public ImageButton A09;
    public ImageButton A0A;
    public ImageView A0B;
    public TextView A0C;
    public TextView A0D;
    public LLc A0E;
    public ActionMenuView A0F;
    public Kqa A0G;
    public LLZ A0H;
    public MDw A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public ArrayList A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public Drawable A0T;
    public LLh A0U;
    public CharSequence A0V;
    public boolean A0W;
    public boolean A0X;
    public final AnonymousClass066 A0Y;
    public final Runnable A0Z;
    public final ArrayList A0a;
    public final MB4 A0b;
    public final ArrayList A0c;
    public final int[] A0d;

    /* loaded from: Toolbar$SavedState.class */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new LGb(1);
        public int A00;
        public boolean A01;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130972111);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = 8388627;
        this.A0c = AnonymousClass001.A0s();
        this.A0a = AnonymousClass001.A0s();
        this.A0d = new int[2];
        this.A0Y = new AnonymousClass066(new Runnable() { // from class: X.Ljh
            public static final String __redex_internal_original_name = "Toolbar$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                Toolbar toolbar = Toolbar.this;
                Iterator it = toolbar.A0L.iterator();
                while (it.hasNext()) {
                    toolbar.A0F().removeItem(((MenuItem) it.next()).getItemId());
                }
                Menu A0F = toolbar.A0F();
                ArrayList A0s = AnonymousClass001.A0s();
                LQD A0F2 = toolbar.A0F();
                for (int i2 = 0; i2 < A0F2.size(); i2++) {
                    A0s.add(A0F2.getItem(i2));
                }
                toolbar.A0Y.A01(A0F, new JXV(toolbar.getContext()));
                ArrayList A0s2 = AnonymousClass001.A0s();
                LQD A0F3 = toolbar.A0F();
                for (int i3 = 0; i3 < A0F3.size(); i3++) {
                    A0s2.add(A0F3.getItem(i3));
                }
                A0s2.removeAll(A0s);
                toolbar.A0L = A0s2;
            }
        });
        this.A0L = AnonymousClass001.A0s();
        this.A0b = new LLf(this);
        this.A0Z = new Lji(this);
        Context context2 = getContext();
        int[] iArr = 53Y.A0O;
        53Z A0D = DKD.A0D(context2, attributeSet, iArr, i, 0);
        TypedArray typedArray = A0D.A02;
        C0Ad.A07(context, typedArray, attributeSet, this, iArr, i, 0);
        this.A04 = typedArray.getResourceId(28, 0);
        this.A03 = typedArray.getResourceId(19, 0);
        this.A01 = typedArray.getInteger(0, this.A01);
        this.A00 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.A0P = dimensionPixelOffset;
        this.A0S = dimensionPixelOffset;
        this.A0Q = dimensionPixelOffset;
        this.A0R = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.A0R = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.A0Q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.A0S = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.A0P = dimensionPixelOffset5;
        }
        this.A0O = typedArray.getDimensionPixelSize(13, -1);
        int i2 = (-1) << (-1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, i2);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, i2);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        Kqa kqa = this.A0G;
        if (kqa == null) {
            kqa = new Kqa();
            this.A0G = kqa;
        }
        kqa.A06 = false;
        if (dimensionPixelSize != i2) {
            kqa.A01 = dimensionPixelSize;
            kqa.A03 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != i2) {
            kqa.A02 = dimensionPixelSize2;
            kqa.A04 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != i2 || dimensionPixelOffset7 != i2) {
            kqa.A00(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.A0N = typedArray.getDimensionPixelOffset(10, i2);
        this.A0M = typedArray.getDimensionPixelOffset(6, i2);
        this.A0T = A0D.A01(4);
        this.A0V = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            A0T(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            A0S(text2);
        }
        this.A05 = context2;
        int resourceId = typedArray.getResourceId(17, 0);
        if (this.A02 != resourceId) {
            this.A02 = resourceId;
            this.A05 = resourceId == 0 ? context2 : new ContextThemeWrapper(context2, resourceId);
        }
        Drawable A01 = A0D.A01(16);
        if (A01 != null) {
            A0P(A01);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            A0R(text3);
        }
        Drawable A012 = A0D.A01(11);
        if (A012 != null) {
            A0O(A012);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            if (!TextUtils.isEmpty(text4) && this.A0B == null) {
                this.A0B = new AppCompatImageView(context2, null);
            }
            ImageView imageView = this.A0B;
            if (imageView != null) {
                imageView.setContentDescription(text4);
            }
        }
        if (typedArray.hasValue(29)) {
            ColorStateList A00 = A0D.A00(29);
            this.A07 = A00;
            TextView textView = this.A0D;
            if (textView != null) {
                textView.setTextColor(A00);
            }
        }
        if (typedArray.hasValue(20)) {
            ColorStateList A002 = A0D.A00(20);
            this.A06 = A002;
            TextView textView2 = this.A0C;
            if (textView2 != null) {
                textView2.setTextColor(A002);
            }
        }
        if (typedArray.hasValue(14)) {
            A0K(typedArray.getResourceId(14, 0));
        }
        typedArray.recycle();
    }

    private int A00() {
        LQD lqd;
        ActionMenuView actionMenuView = this.A0F;
        if (actionMenuView != null && (lqd = actionMenuView.A05) != null && lqd.hasVisibleItems()) {
            Kqa kqa = this.A0G;
            return Math.max(kqa != null ? kqa.A07 ? kqa.A03 : kqa.A04 : 0, Math.max(this.A0M, 0));
        }
        Kqa kqa2 = this.A0G;
        if (kqa2 != null) {
            return kqa2.A07 ? kqa2.A03 : kqa2.A04;
        }
        return 0;
    }

    private int A01() {
        Drawable A0E = A0E();
        Kqa kqa = this.A0G;
        int i = kqa != null ? kqa.A07 ? kqa.A04 : kqa.A03 : 0;
        if (A0E != null) {
            i = Math.max(i, Math.max(this.A0N, 0));
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        if (r0 != 80) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A02(android.view.View r302, int r303) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A02(android.view.View, int):int");
    }

    private int A03(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(view);
        int i3 = A0I.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int A02 = A02(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, A02, max + measuredWidth, view.getMeasuredHeight() + A02);
        return max + measuredWidth + A0I.rightMargin;
    }

    private int A04(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(view);
        int i3 = A0I.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int A02 = A02(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, A02, max, view.getMeasuredHeight() + A02);
        return max - (measuredWidth + A0I.leftMargin);
    }

    private int A05(View view, int[] iArr, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(view);
        int i5 = A0I.leftMargin - iArr[0];
        int i6 = A0I.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, DKE.A07(this) + max + i2, ((ViewGroup.LayoutParams) A0I).width), ViewGroup.getChildMeasureSpec(i3, JQy.A07(this) + A0I.topMargin + A0I.bottomMargin + i4, ((ViewGroup.LayoutParams) A0I).height));
        return view.getMeasuredWidth() + max;
    }

    public static JZi A06(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        if (layoutParams instanceof JZi) {
            JZi jZi = (JZi) layoutParams;
            marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) jZi);
            ((JXy) marginLayoutParams).A00 = 0;
            ((JXy) marginLayoutParams).A00 = ((JXy) jZi).A00;
            ((JZi) marginLayoutParams).A00 = 0;
            i = jZi.A00;
        } else if (layoutParams instanceof JXy) {
            JXy jXy = (JXy) layoutParams;
            marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) jXy);
            ((JXy) marginLayoutParams).A00 = 0;
            ((JXy) marginLayoutParams).A00 = jXy.A00;
            i = 0;
        } else {
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams((ViewGroup.LayoutParams) marginLayoutParams2);
                ((JXy) marginLayoutParams3).A00 = 0;
                ((JZi) marginLayoutParams3).A00 = 0;
                marginLayoutParams3.leftMargin = marginLayoutParams2.leftMargin;
                marginLayoutParams3.topMargin = marginLayoutParams2.topMargin;
                marginLayoutParams3.rightMargin = marginLayoutParams2.rightMargin;
                marginLayoutParams3.bottomMargin = marginLayoutParams2.bottomMargin;
                return marginLayoutParams3;
            }
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            i = 0;
            ((JXy) marginLayoutParams).A00 = 0;
        }
        ((JZi) marginLayoutParams).A00 = i;
        return marginLayoutParams;
    }

    private void A07() {
        if (this.A0A == null) {
            this.A0A = new DQB(getContext(), (AttributeSet) null, 2130972110);
            ViewGroup.LayoutParams jZi = new JZi();
            ((JXy) jZi).A00 = 8388611 | (this.A00 & ActionId.MISSED_EVENT);
            this.A0A.setLayoutParams(jZi);
        }
    }

    private void A08(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, DKE.A07(this) + A0I.leftMargin + A0I.rightMargin + i2, ((ViewGroup.LayoutParams) A0I).width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, JQy.A07(this) + A0I.topMargin + A0I.bottomMargin, ((ViewGroup.LayoutParams) A0I).height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void A09(View view, boolean z) {
        JZi layoutParams = view.getLayoutParams();
        JZi jZi = layoutParams == null ? new JZi() : !checkLayoutParams(layoutParams) ? A06(layoutParams) : layoutParams;
        jZi.A00 = 1;
        if (!z || this.A08 == null) {
            addView(view, (ViewGroup.LayoutParams) jZi);
        } else {
            view.setLayoutParams(jZi);
            this.A0a.add(view);
        }
    }

    public static void A0A(Toolbar toolbar) {
        if (toolbar.A0F == null) {
            ActionMenuView actionMenuView = new ActionMenuView(toolbar.getContext(), null);
            toolbar.A0F = actionMenuView;
            int i = toolbar.A02;
            if (actionMenuView.A02 != i) {
                actionMenuView.A02 = i;
                actionMenuView.A03 = i == 0 ? actionMenuView.getContext() : new ContextThemeWrapper(actionMenuView.getContext(), i);
            }
            ActionMenuView actionMenuView2 = toolbar.A0F;
            actionMenuView2.A07 = toolbar.A0b;
            actionMenuView2.A04 = new LLU(toolbar);
            ViewGroup.LayoutParams jZi = new JZi();
            ((JXy) jZi).A00 = 8388613 | (toolbar.A00 & ActionId.MISSED_EVENT);
            toolbar.A0F.setLayoutParams(jZi);
            toolbar.A09(toolbar.A0F, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0B(java.util.List r302, int r303) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0B(java.util.List, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r301.A0a.contains(r302) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0C(android.view.View r302) {
        /*
            r301 = this;
            r0 = r302
            android.view.ViewParent r0 = r0.getParent()
            r303 = r0
            r0 = r303
            r1 = r301
            if (r0 == r1) goto L1c
            r0 = r301
            java.util.ArrayList r0 = r0.A0a
            r1 = r302
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0C(android.view.View):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r302.getVisibility() == 8) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0D(android.view.View r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r302
            android.view.ViewParent r0 = r0.getParent()
            r303 = r0
            r0 = r303
            r1 = r301
            if (r0 != r1) goto L20
            r0 = r302
            int r0 = r0.getVisibility()
            r304 = r0
            r0 = 8
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L25
        L20:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L25:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0D(android.view.View):boolean");
    }

    public Drawable A0E() {
        ImageButton imageButton = this.A0A;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public LQD A0F() {
        A0A(this);
        ActionMenuView actionMenuView = this.A0F;
        if (actionMenuView.A05 == null) {
            LQD A01 = actionMenuView.A01();
            LLZ llz = this.A0H;
            if (llz == null) {
                llz = new LLZ(this);
                this.A0H = llz;
            }
            this.A0F.A06.A0D = true;
            A01.A09(this.A05, llz);
            A0J();
        }
        return this.A0F.A01();
    }

    /* JADX WARN: Type inference failed for: r302v2, types: [java.lang.Object, X.LLh] */
    public LLh A0G() {
        Drawable drawable;
        LLh lLh = this.A0U;
        LLh lLh2 = lLh;
        if (lLh == null) {
            ?? obj = new Object();
            ((LLh) obj).A00 = 0;
            ((LLh) obj).A09 = this;
            CharSequence charSequence = this.A0K;
            ((LLh) obj).A0C = charSequence;
            ((LLh) obj).A0B = this.A0J;
            ((LLh) obj).A0E = AnonymousClass001.A1T(charSequence);
            ((LLh) obj).A05 = A0E();
            53Z A0D = DKD.A0D(getContext(), (AttributeSet) null, 53Y.A00, 2130968597, 0);
            ((LLh) obj).A02 = A0D.A01(15);
            TypedArray typedArray = A0D.A02;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.CvV(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                ((LLh) obj).A0B = text2;
                if ((((LLh) obj).A01 & 8) != 0) {
                    ((LLh) obj).A09.A0S(text2);
                }
            }
            Drawable A01 = A0D.A01(20);
            if (A01 != null) {
                ((LLh) obj).A04 = A01;
                LLh.A00((LLh) obj);
            }
            Drawable A012 = A0D.A01(17);
            if (A012 != null) {
                ((LLh) obj).A03 = A012;
                LLh.A00((LLh) obj);
            }
            if (((LLh) obj).A05 == null && (drawable = ((LLh) obj).A02) != null) {
                obj.CrZ(drawable);
            }
            obj.CoC(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                obj.Cnm(DKD.A0A(((LLh) obj).A09).inflate(resourceId, (ViewGroup) ((LLh) obj).A09, false));
                obj.CoC(((LLh) obj).A01 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = ((LLh) obj).A09.getLayoutParams();
                layoutParams.height = layoutDimension;
                ((LLh) obj).A09.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                Toolbar toolbar = ((LLh) obj).A09;
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                Kqa kqa = toolbar.A0G;
                if (kqa == null) {
                    kqa = new Kqa();
                    toolbar.A0G = kqa;
                }
                kqa.A00(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = ((LLh) obj).A09;
                Context context = toolbar2.getContext();
                toolbar2.A04 = resourceId2;
                TextView textView = toolbar2.A0D;
                if (textView != null) {
                    textView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = ((LLh) obj).A09;
                Context context2 = toolbar3.getContext();
                toolbar3.A03 = resourceId3;
                TextView textView2 = toolbar3.A0C;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                Toolbar toolbar4 = ((LLh) obj).A09;
                if (toolbar4.A02 != resourceId4) {
                    toolbar4.A02 = resourceId4;
                    toolbar4.A05 = new ContextThemeWrapper(toolbar4.getContext(), resourceId4);
                }
            }
            typedArray.recycle();
            if (2131952099 != ((LLh) obj).A00) {
                ((LLh) obj).A00 = 2131952099;
                ImageButton imageButton = ((LLh) obj).A09.A0A;
                if (TextUtils.isEmpty(imageButton != null ? imageButton.getContentDescription() : null)) {
                    obj.CrY(((LLh) obj).A00);
                }
            }
            ImageButton imageButton2 = ((LLh) obj).A09.A0A;
            ((LLh) obj).A0A = imageButton2 != null ? imageButton2.getContentDescription() : null;
            ((LLh) obj).A09.A0Q(new LKL((LLh) obj));
            this.A0U = obj;
            lLh2 = obj;
        }
        return lLh2;
    }

    public void A0H() {
        LQF lqf;
        LLZ llz = this.A0H;
        if (llz == null || (lqf = llz.A01) == null) {
            return;
        }
        lqf.collapseActionView();
    }

    public void A0I() {
        if (this.A09 == null) {
            DQB dqb = new DQB(getContext(), (AttributeSet) null, 2130972110);
            this.A09 = dqb;
            dqb.setImageDrawable(this.A0T);
            this.A09.setContentDescription(this.A0V);
            ViewGroup.LayoutParams jZi = new JZi();
            ((JXy) jZi).A00 = 8388611 | (this.A00 & ActionId.MISSED_EVENT);
            ((JZi) jZi).A00 = 2;
            this.A09.setLayoutParams(jZi);
            LKO.A01(this.A09, this, 2);
        }
    }

    public void A0J() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher A00 = KTj.A00(this);
            LLZ llz = this.A0H;
            if (llz == null || llz.A01 == null || A00 == null) {
                return;
            }
            isAttachedToWindow();
        }
    }

    public void A0K(int i) {
        if (this instanceof ThemeCompatToolbar) {
            new JZn(getContext()).inflate(i, A0F());
        } else {
            new JXV(getContext()).inflate(i, A0F());
        }
    }

    public void A0L(int i) {
        A0R(i != 0 ? getContext().getText(i) : null);
    }

    public void A0M(int i) {
        A0T(getContext().getText(i));
    }

    public void A0N(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        this.A07 = valueOf;
        TextView textView = this.A0D;
        if (textView != null) {
            textView.setTextColor(valueOf);
        }
    }

    public void A0O(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A0B;
            if (imageView == null) {
                imageView = new AppCompatImageView(getContext(), null);
                this.A0B = imageView;
            }
            if (!A0C(imageView)) {
                A09(this.A0B, true);
            }
        } else {
            ImageView imageView2 = this.A0B;
            if (imageView2 != null && A0C(imageView2)) {
                removeView(this.A0B);
                this.A0a.remove(this.A0B);
            }
        }
        ImageView imageView3 = this.A0B;
        if (imageView3 != null) {
            imageView3.setImageDrawable(drawable);
        }
    }

    public void A0P(Drawable drawable) {
        if (drawable != null) {
            A07();
            if (!A0C(this.A0A)) {
                A09(this.A0A, true);
            }
        } else {
            ImageButton imageButton = this.A0A;
            if (imageButton != null && A0C(imageButton)) {
                removeView(this.A0A);
                this.A0a.remove(this.A0A);
            }
        }
        ImageButton imageButton2 = this.A0A;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void A0Q(View.OnClickListener onClickListener) {
        A07();
        this.A0A.setOnClickListener(onClickListener);
    }

    public void A0R(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A07();
        }
        ImageButton imageButton = this.A0A;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.A0A.setTooltipText(charSequence);
        }
    }

    public void A0S(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0C;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                DQw dQw = new DQw(context);
                this.A0C = dQw;
                dQw.setSingleLine();
                this.A0C.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A03;
                if (i != 0) {
                    this.A0C.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A06;
                if (colorStateList != null) {
                    this.A0C.setTextColor(colorStateList);
                }
            }
            if (!A0C(this.A0C)) {
                A09(this.A0C, true);
            }
        } else if (textView != null && A0C(textView)) {
            removeView(this.A0C);
            this.A0a.remove(this.A0C);
        }
        TextView textView2 = this.A0C;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0J = charSequence;
    }

    public void A0T(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0D;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                DQw dQw = new DQw(context);
                this.A0D = dQw;
                dQw.setSingleLine();
                this.A0D.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A04;
                if (i != 0) {
                    this.A0D.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A07;
                if (colorStateList != null) {
                    this.A0D.setTextColor(colorStateList);
                }
            }
            if (!A0C(this.A0D)) {
                A09(this.A0D, true);
            }
        } else if (textView != null && A0C(textView)) {
            removeView(this.A0D);
            this.A0a.remove(this.A0D);
        }
        TextView textView2 = this.A0D;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0K = charSequence;
    }

    @Override // X.C05u
    public void A6Q(C06k c06k) {
        AnonymousClass066 anonymousClass066 = this.A0Y;
        anonymousClass066.A02.add(c06k);
        anonymousClass066.A00.run();
    }

    @Override // X.C05u
    public void Cef(C06k c06k) {
        AnonymousClass066 anonymousClass066 = this.A0Y;
        anonymousClass066.A02.remove(c06k);
        anonymousClass066.A01.remove(c06k);
        anonymousClass066.A00.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r302 instanceof X.JZi) == false) goto L6;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = super.checkLayoutParams(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L15
            r0 = r302
            boolean r0 = r0 instanceof X.JZi
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L17
        L15:
            r0 = 0
            r303 = r0
        L17:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.checkLayoutParams(android.view.ViewGroup$LayoutParams):boolean");
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new JZi();
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        ((JXy) marginLayoutParams).A00 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 53Y.A01);
        ((JXy) marginLayoutParams).A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        ((JZi) marginLayoutParams).A00 = 0;
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A06(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(2028022362);
        super.onAttachedToWindow();
        A0J();
        0FI.A0C(651836385, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1211236323);
        super.onDetachedFromWindow();
        removeCallbacks(this.A0Z);
        A0J();
        0FI.A0C(-1912923680, A06);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0W = false;
        }
        if (!this.A0W) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0W = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0W = false;
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x071a A[EDGE_INSN: B:100:0x071a->B:101:0x071a BREAK  A[LOOP:1: B:97:0x06f2->B:99:0x06f9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0747 A[LOOP:2: B:102:0x0740->B:104:0x0747, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x080f A[LOOP:3: B:112:0x0808->B:114:0x080f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0448 A[LOOP:0: B:92:0x0441->B:94:0x0448, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06dc A[EDGE_INSN: B:95:0x06dc->B:96:0x06dc BREAK  A[LOOP:0: B:92:0x0441->B:94:0x0448], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06f9 A[LOOP:1: B:97:0x06f2->B:99:0x06f9, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r302, int r303, int r304, int r305, int r306) {
        /*
            Method dump skipped, instructions count: 2102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.A0d;
        boolean A1U = 4YV.A1U(getLayoutDirection());
        int i9 = !A1U ? 1 : 0;
        if (A0D(this.A0A)) {
            A08(this.A0A, i, 0, i2, this.A0O);
            i3 = JQy.A08(this.A0A, this.A0A.getMeasuredWidth());
            int measuredHeight = this.A0A.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0I = DKC.A0I(this.A0A);
            i4 = JQx.A0B(measuredHeight, A0I.topMargin + A0I.bottomMargin, 0);
            i5 = JQx.A0G(this.A0A, 0);
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (A0D(this.A09)) {
            A08(this.A09, i, 0, i2, this.A0O);
            i3 = JQy.A08(this.A09, this.A09.getMeasuredWidth());
            int measuredHeight2 = this.A09.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0I2 = DKC.A0I(this.A09);
            i4 = JQx.A0B(measuredHeight2, A0I2.topMargin + A0I2.bottomMargin, i4);
            i5 = JQx.A0G(this.A09, i5);
        }
        int A01 = A01();
        int max = Math.max(A01, i3);
        iArr[A1U ? 1 : 0] = JQx.A0C(A01, i3, 0);
        if (A0D(this.A0F)) {
            A08(this.A0F, i, max, i2, this.A0O);
            i6 = JQy.A08(this.A0F, this.A0F.getMeasuredWidth());
            int measuredHeight3 = this.A0F.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0I3 = DKC.A0I(this.A0F);
            i4 = JQx.A0B(measuredHeight3, A0I3.topMargin + A0I3.bottomMargin, i4);
            i5 = JQx.A0G(this.A0F, i5);
        } else {
            i6 = 0;
        }
        int A00 = A00();
        int max2 = max + Math.max(A00, i6);
        iArr[i9] = JQx.A0C(A00, i6, 0);
        if (A0D(this.A08)) {
            max2 += A05(this.A08, iArr, i, max2, i2, 0);
            int measuredHeight4 = this.A08.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0I4 = DKC.A0I(this.A08);
            i4 = JQx.A0B(measuredHeight4, A0I4.topMargin + A0I4.bottomMargin, i4);
            i5 = JQx.A0G(this.A08, i5);
        }
        if (A0D(this.A0B)) {
            max2 += A05(this.A0B, iArr, i, max2, i2, 0);
            int measuredHeight5 = this.A0B.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0I5 = DKC.A0I(this.A0B);
            i4 = JQx.A0B(measuredHeight5, A0I5.topMargin + A0I5.bottomMargin, i4);
            i5 = JQx.A0G(this.A0B, i5);
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getLayoutParams().A00 == 0 && A0D(childAt)) {
                max2 += A05(childAt, iArr, i, max2, i2, 0);
                int measuredHeight6 = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams A0I6 = DKC.A0I(childAt);
                i4 = JQx.A0B(measuredHeight6, A0I6.topMargin + A0I6.bottomMargin, i4);
                i5 = JQx.A0G(childAt, i5);
            }
            i10 = i11 + 1;
        }
        int i12 = this.A0S + this.A0P;
        int i13 = this.A0R + this.A0Q;
        if (A0D(this.A0D)) {
            A05(this.A0D, iArr, i, max2 + i13, i2, i12);
            i7 = JQy.A08(this.A0D, this.A0D.getMeasuredWidth());
            int measuredHeight7 = this.A0D.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0I7 = DKC.A0I(this.A0D);
            i8 = measuredHeight7 + A0I7.topMargin + A0I7.bottomMargin;
            i5 = JQx.A0G(this.A0D, i5);
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (A0D(this.A0C)) {
            i7 = Math.max(i7, A05(this.A0C, iArr, i, max2 + i13, i2, i8 + i12));
            int measuredHeight8 = this.A0C.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0I8 = DKC.A0I(this.A0C);
            i8 += measuredHeight8 + A0I8.topMargin + A0I8.bottomMargin;
            i5 = JQx.A0G(this.A0C, i5);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i7 + DKE.A07(this), getSuggestedMinimumWidth()), i, (-16777216) & i5), View.resolveSizeAndState(Math.max(Math.max(i4, i8) + JQy.A07(this), getSuggestedMinimumHeight()), i2, i5 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        ActionMenuView actionMenuView = this.A0F;
        LQD lqd = actionMenuView != null ? actionMenuView.A05 : null;
        int i = savedState.A00;
        if (i != 0 && this.A0H != null && lqd != null && (findItem = lqd.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.A01) {
            Runnable runnable = this.A0Z;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (r305 != r0) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRtlPropertiesChanged(int r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            super.onRtlPropertiesChanged(r1)
            r0 = r301
            X.Kqa r0 = r0.A0G
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1b
            X.Kqa r0 = new X.Kqa
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r301
            r1 = r303
            r0.A0G = r1
        L1b:
            r0 = r302
            boolean r0 = X.4YV.A1U(r0)
            r304 = r0
            r0 = r303
            boolean r0 = r0.A07
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L71
            r0 = r303
            r1 = r304
            r0.A07 = r1
            r0 = r303
            boolean r0 = r0.A06
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L94
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L72
            r0 = r303
            int r0 = r0.A00
            r305 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L58
            r0 = r303
            int r0 = r0.A01
            r305 = r0
        L58:
            r0 = r303
            r1 = r305
            r0.A03 = r1
            r0 = r303
            int r0 = r0.A05
            r305 = r0
        L64:
            r0 = r305
            r1 = r306
            if (r0 == r1) goto La0
        L6b:
            r0 = r303
            r1 = r305
            r0.A04 = r1
        L71:
            return
        L72:
            r0 = r303
            int r0 = r0.A05
            r305 = r0
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L85
            r0 = r303
            int r0 = r0.A01
            r305 = r0
        L85:
            r0 = r303
            r1 = r305
            r0.A03 = r1
            r0 = r303
            int r0 = r0.A00
            r305 = r0
            goto L64
        L94:
            r0 = r303
            int r0 = r0.A01
            r305 = r0
            r0 = r303
            r1 = r305
            r0.A03 = r1
        La0:
            r0 = r303
            int r0 = r0.A02
            r305 = r0
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r0.A02() == false) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.appcompat.widget.Toolbar$SavedState] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r301 = this;
            android.os.Parcelable$Creator r0 = androidx.appcompat.widget.Toolbar.SavedState.CREATOR
            r302 = r0
            r0 = r301
            android.os.Parcelable r0 = super.onSaveInstanceState()
            r302 = r0
            androidx.appcompat.widget.Toolbar$SavedState r0 = new androidx.appcompat.widget.Toolbar$SavedState
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)
            r0 = r301
            X.LLZ r0 = r0.A0H
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2e
            r0 = r302
            X.LQF r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2e
            r0 = r302
            int r0 = r0.getItemId()
            r304 = r0
            r0 = r303
            r1 = r304
            r0.A00 = r1
        L2e:
            r0 = r301
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0F
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4d
            r0 = r302
            X.LLc r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4d
            r0 = r302
            boolean r0 = r0.A02()
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L51
        L4d:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L51:
            r0 = r303
            r1 = r304
            r0.A01 = r1
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-1722082724);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0X = false;
        }
        if (!this.A0X) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0X = true;
                }
                0FI.A0B(-2074026522, A05);
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0X = false;
        }
        0FI.A0B(-2074026522, A05);
        return true;
    }
}
