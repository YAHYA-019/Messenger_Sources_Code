package com.google.android.material.textfield;

import X.0Em;
import X.0K6;
import X.0Pz;
import X.2K5;
import X.4YU;
import X.53Z;
import X.6Le;
import X.6Lg;
import X.AbN;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0Ad;
import X.C2955Jei;
import X.C53a;
import X.C80w;
import X.DKC;
import X.DKG;
import X.DQB;
import X.DQw;
import X.GOo;
import X.JR1;
import X.JUI;
import X.K8G;
import X.K8H;
import X.K8P;
import X.K8Q;
import X.K8R;
import X.K8S;
import X.K8T;
import X.Kjh;
import X.L6H;
import X.LBK;
import X.LBN;
import X.LDQ;
import X.LF7;
import X.LGb;
import X.LJj;
import X.LKO;
import X.LeS;
import X.Lm3;
import X.Lm4;
import X.MGQ;
import X.MGR;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.facebook.acra.constants.ActionId;
import com.google.android.material.internal.CheckableImageButton;
import com.mapbox.mapboxsdk.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: TextInputLayout.class */
public class TextInputLayout extends LinearLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public ValueAnimator A0J;
    public ColorStateList A0K;
    public ColorStateList A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public ColorStateList A0P;
    public ColorStateList A0Q;
    public ColorStateList A0R;
    public ColorStateList A0S;
    public PorterDuff.Mode A0T;
    public PorterDuff.Mode A0U;
    public EditText A0V;
    public TextView A0W;
    public TextView A0X;
    public 6Le A0Y;
    public 6Le A0Z;
    public 6Lg A0a;
    public CharSequence A0b;
    public CharSequence A0c;
    public CharSequence A0d;
    public CharSequence A0e;
    public CharSequence A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public int A0s;
    public int A0t;
    public int A0u;
    public int A0v;
    public int A0w;
    public int A0x;
    public Drawable A0y;
    public Drawable A0z;
    public Drawable A10;
    public boolean A11;
    public boolean A12;
    public final int A13;
    public final Rect A14;
    public final FrameLayout A15;
    public final FrameLayout A16;
    public final LinearLayout A17;
    public final LinearLayout A18;
    public final TextView A19;
    public final TextView A1A;
    public final CheckableImageButton A1B;
    public final CheckableImageButton A1C;
    public final CheckableImageButton A1D;
    public final LDQ A1E;
    public final LBN A1F;
    public final LinkedHashSet A1G;
    public final LinkedHashSet A1H;
    public final Rect A1I;
    public final RectF A1J;
    public final SparseArray A1K;

    /* loaded from: TextInputLayout$SavedState.class */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new LGb(5);
        public CharSequence A00;
        public CharSequence A01;
        public CharSequence A02;
        public CharSequence A03;
        public boolean A04;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.A00 = (CharSequence) creator.createFromParcel(parcel);
            this.A04 = AbN.A1U(parcel);
            this.A02 = (CharSequence) creator.createFromParcel(parcel);
            this.A01 = (CharSequence) creator.createFromParcel(parcel);
            this.A03 = (CharSequence) creator.createFromParcel(parcel);
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            AnonymousClass002.A0W(this, "TextInputLayout.SavedState{", A0k);
            A0k.append(" error=");
            A0k.append((Object) this.A00);
            A0k.append(" hint=");
            A0k.append((Object) this.A02);
            A0k.append(" helperText=");
            A0k.append((Object) this.A01);
            A0k.append(" placeholderText=");
            return AbstractC2327GOs.A0U(this.A03, A0k);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.A00, parcel, i);
            parcel.writeInt(this.A04 ? 1 : 0);
            TextUtils.writeToParcel(this.A02, parcel, i);
            TextUtils.writeToParcel(this.A01, parcel, i);
            TextUtils.writeToParcel(this.A03, parcel, i);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971996);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0e58, code lost:
    
        if (r301.A0o != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0741, code lost:
    
        if (r301.A1F.A0D == false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v229, types: [com.google.android.material.internal.CheckableImageButton, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v300, types: [com.google.android.material.internal.CheckableImageButton, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v341, types: [com.google.android.material.internal.CheckableImageButton, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v722, types: [com.google.android.material.internal.CheckableImageButton, android.widget.ImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v749, types: [com.google.android.material.internal.CheckableImageButton, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 4775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int A04() {
        float f;
        int i = 0;
        if (this.A0n) {
            int i2 = this.A01;
            if (i2 == 0 || i2 == 1) {
                LDQ ldq = this.A1E;
                TextPaint textPaint = ldq.A0c;
                LDQ.A03(textPaint, ldq);
                f = -textPaint.ascent();
            } else if (i2 == 2) {
                LDQ ldq2 = this.A1E;
                TextPaint textPaint2 = ldq2.A0c;
                LDQ.A03(textPaint2, ldq2);
                f = (-textPaint2.ascent()) / 2.0f;
            }
            i = (int) f;
        }
        return i;
    }

    public static ColorStateList A05(Context context, 53Z r302, int i) {
        int resourceId;
        ColorStateList A02;
        TypedArray typedArray = r302.A02;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A02 = 0Em.A02(context, resourceId)) == null) ? r302.A00(i) : A02;
    }

    private Kjh A06() {
        SparseArray sparseArray = this.A1K;
        Kjh kjh = (Kjh) sparseArray.get(this.A0D);
        if (kjh == null) {
            kjh = (Kjh) sparseArray.get(0);
        }
        return kjh;
    }

    private void A07() {
        DQB dqb = this.A1B;
        boolean z = this.A0i;
        ColorStateList colorStateList = this.A0N;
        boolean z2 = this.A0j;
        PorterDuff.Mode mode = this.A0T;
        Drawable drawable = dqb.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (dqb.getDrawable() != drawable) {
            dqb.setImageDrawable(drawable);
        }
    }

    private void A08() {
        DQB dqb = this.A1D;
        boolean z = this.A0k;
        ColorStateList colorStateList = this.A0R;
        boolean z2 = this.A0l;
        PorterDuff.Mode mode = this.A0U;
        Drawable drawable = dqb.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (dqb.getDrawable() != drawable) {
            dqb.setImageDrawable(drawable);
        }
    }

    private void A09() {
        float f;
        float A00;
        float f2;
        float A002;
        float f3;
        if (A0S()) {
            RectF rectF = this.A1J;
            LDQ ldq = this.A1E;
            int width = this.A0V.getWidth();
            int gravity = this.A0V.getGravity();
            CharSequence charSequence = ldq.A0Q;
            boolean BVU = (ldq.A0d.getLayoutDirection() == 1 ? 2K5.A02 : 2K5.A01).BVU(charSequence, 0, charSequence.length());
            ldq.A0V = BVU;
            if (gravity == 17 || (gravity & 7) == 1) {
                f = width / 2.0f;
                A00 = LDQ.A00(ldq) / 2.0f;
            } else {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? BVU : !BVU) {
                    f2 = ldq.A0Y.left;
                    rectF.left = f2;
                    Rect rect = ldq.A0Y;
                    rectF.top = rect.top;
                    if (gravity != 17 || (gravity & 7) == 1) {
                        f2 = width / 2.0f;
                        A002 = LDQ.A00(ldq) / 2.0f;
                    } else {
                        if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !ldq.A0V : ldq.A0V) {
                            f3 = rect.right;
                            rectF.right = f3;
                            float f4 = rect.top;
                            TextPaint textPaint = ldq.A0c;
                            LDQ.A03(textPaint, ldq);
                            rectF.bottom = f4 + (-textPaint.ascent());
                            float f5 = rectF.left;
                            float f6 = this.A13;
                            rectF.left = f5 - f6;
                            rectF.right += f6;
                            int i = this.A07;
                            this.A03 = i;
                            rectF.top = 0.0f;
                            rectF.bottom = i;
                            rectF.offset(-getPaddingLeft(), 0.0f);
                            K8H.A00(this.A0Y, rectF.left, rectF.top, rectF.right, rectF.bottom);
                        }
                        A002 = LDQ.A00(ldq);
                    }
                    f3 = f2 + A002;
                    rectF.right = f3;
                    float f42 = rect.top;
                    TextPaint textPaint2 = ldq.A0c;
                    LDQ.A03(textPaint2, ldq);
                    rectF.bottom = f42 + (-textPaint2.ascent());
                    float f52 = rectF.left;
                    float f62 = this.A13;
                    rectF.left = f52 - f62;
                    rectF.right += f62;
                    int i2 = this.A07;
                    this.A03 = i2;
                    rectF.top = 0.0f;
                    rectF.bottom = i2;
                    rectF.offset(-getPaddingLeft(), 0.0f);
                    K8H.A00(this.A0Y, rectF.left, rectF.top, rectF.right, rectF.bottom);
                }
                f = ldq.A0Y.right;
                A00 = LDQ.A00(ldq);
            }
            f2 = f - A00;
            rectF.left = f2;
            Rect rect2 = ldq.A0Y;
            rectF.top = rect2.top;
            if (gravity != 17) {
            }
            f2 = width / 2.0f;
            A002 = LDQ.A00(ldq) / 2.0f;
            f3 = f2 + A002;
            rectF.right = f3;
            float f422 = rect2.top;
            TextPaint textPaint22 = ldq.A0c;
            LDQ.A03(textPaint22, ldq);
            rectF.bottom = f422 + (-textPaint22.ascent());
            float f522 = rectF.left;
            float f622 = this.A13;
            rectF.left = f522 - f622;
            rectF.right += f622;
            int i22 = this.A07;
            this.A03 = i22;
            rectF.top = 0.0f;
            rectF.bottom = i22;
            rectF.offset(-getPaddingLeft(), 0.0f);
            K8H.A00(this.A0Y, rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.internal.CheckableImageButton, android.view.View] */
    private void A0A() {
        ?? r0 = this.A1D;
        r0.setOnLongClickListener(null);
        boolean hasOnClickListeners = r0.hasOnClickListeners();
        boolean z = false;
        int i = 1;
        if (hasOnClickListeners) {
            z = true;
        }
        r0.setFocusable(z);
        r0.setClickable(hasOnClickListeners);
        r0.A01 = hasOnClickListeners;
        r0.setLongClickable(false);
        if (!z) {
            i = 2;
        }
        r0.setImportantForAccessibility(i);
    }

    private void A0B() {
        if (this.A0V != null) {
            this.A19.setPaddingRelative(this.A1D.getVisibility() == 0 ? 0 : this.A0V.getPaddingStart(), this.A0V.getCompoundPaddingTop(), GOo.A0A(this).getDimensionPixelSize(2132279309), this.A0V.getCompoundPaddingBottom());
        }
    }

    private void A0C() {
        if (this.A0V != null) {
            this.A1A.setPaddingRelative(GOo.A0A(this).getDimensionPixelSize(2132279309), this.A0V.getPaddingTop(), (A0k() || this.A1C.getVisibility() == 0) ? 0 : this.A0V.getPaddingEnd(), this.A0V.getPaddingBottom());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r301.A0o != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0D() {
        /*
            r301 = this;
            r0 = r301
            android.widget.TextView r0 = r0.A1A
            r302 = r0
            r0 = r302
            int r0 = r0.getVisibility()
            r303 = r0
            r0 = r301
            java.lang.CharSequence r0 = r0.A0f
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L27
            r0 = r301
            boolean r0 = r0.A0o
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L2e
        L27:
            r0 = 0
            r308 = r0
            r0 = 8
            r305 = r0
        L2e:
            r0 = r302
            r1 = r305
            r0.setVisibility(r1)
            r0 = r302
            int r0 = r0.getVisibility()
            r307 = r0
            r0 = r303
            r1 = r307
            if (r0 == r1) goto L6d
            r0 = r301
            X.Kjh r0 = r0.A06()
            r306 = r0
            r0 = r306
            boolean r0 = r0 instanceof X.K8S
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L6d
            r0 = r306
            X.K8S r0 = (X.K8S) r0
            r306 = r0
            r0 = r306
            com.google.android.material.textfield.TextInputLayout r0 = r0.A02
            java.lang.CharSequence r0 = r0.A0f
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L6d
            r0 = r306
            r1 = r308
            X.K8S.A00(r0, r1)
        L6d:
            r0 = r301
            boolean r0 = r0.A0T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0D():void");
    }

    private void A0E(float f) {
        LDQ ldq = this.A1E;
        if (ldq.A0C != f) {
            if (this.A0J == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A0J = valueAnimator;
                valueAnimator.setInterpolator(C80w.A02);
                this.A0J.setDuration(167L);
                LF7.A00(this.A0J, this, 27);
            }
            this.A0J.setFloatValues(ldq.A0C, f);
            0K6.A00(this.A0J);
        }
    }

    /* JADX WARN: Type inference failed for: r0v115, types: [com.google.android.material.internal.CheckableImageButton, android.view.View] */
    private void A0F(int i) {
        int i2 = this.A0D;
        this.A0D = i;
        Iterator it = this.A1H.iterator();
        while (it.hasNext()) {
            ((MGR) it.next()).Bvz(this, i2);
        }
        A0i(AnonymousClass001.A1N(i));
        Kjh A06 = A06();
        int i3 = this.A01;
        if ((A06 instanceof K8T) && !AnonymousClass001.A1N(i3)) {
            throw AnonymousClass001.A0N(0Pz.A0C(i3, i, "The current box background mode ", " is not supported by the end icon mode "));
        }
        K8R A062 = A06();
        if (A062 instanceof K8R) {
            K8R k8r = A062;
            TextInputLayout textInputLayout = k8r.A02;
            textInputLayout.A0a(C53a.A00(k8r.A00, 2132410638));
            textInputLayout.A0c(textInputLayout.getResources().getText(2131962954));
            A0H(LKO.A00(k8r, ActionId.NEW_START_FOUND), textInputLayout.A1B);
            MGQ mgq = k8r.A01;
            textInputLayout.A1G.add(mgq);
            if (textInputLayout.A0V != null) {
                mgq.BvP(textInputLayout);
            }
            textInputLayout.A1H.add(k8r.A02);
            EditText editText = textInputLayout.A0V;
            if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        } else if (A062 instanceof K8Q) {
            TextInputLayout textInputLayout2 = ((Kjh) A062).A02;
            A0H(null, textInputLayout2.A1B);
            textInputLayout2.A0a(null);
            textInputLayout2.A0c(null);
        } else if (A062 instanceof K8T) {
            K8T k8t = (K8T) A062;
            Context context = k8t.A00;
            float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mapbox_four_dp);
            float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mapbox_eight_dp);
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mapbox_eight_dp);
            Drawable A00 = K8T.A00(k8t, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
            Drawable A002 = K8T.A00(k8t, 0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
            k8t.A05 = A00;
            StateListDrawable stateListDrawable = new StateListDrawable();
            k8t.A03 = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, A00);
            k8t.A03.addState(new int[0], A002);
            TextInputLayout textInputLayout3 = k8t.A02;
            textInputLayout3.A0a(C53a.A00(context, 2132411226));
            textInputLayout3.A0c(textInputLayout3.getResources().getText(2131956658));
            A0H(LKO.A00(k8t, ActionId.RTMP_CONNECTION_RELEASE), textInputLayout3.A1B);
            MGQ mgq2 = k8t.A0B;
            textInputLayout3.A1G.add(mgq2);
            if (textInputLayout3.A0V != null) {
                mgq2.BvP(textInputLayout3);
            }
            textInputLayout3.A1H.add(k8t.A0C);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            TimeInterpolator timeInterpolator = C80w.A03;
            ofFloat.setInterpolator(timeInterpolator);
            ofFloat.setDuration(67);
            LF7.A00(ofFloat, k8t, 26);
            k8t.A01 = ofFloat;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.setInterpolator(timeInterpolator);
            ofFloat2.setDuration(50);
            LF7.A00(ofFloat2, k8t, 26);
            k8t.A02 = ofFloat2;
            JUI.A00(ofFloat2, k8t, 11);
            k8t.A04 = (AccessibilityManager) context.getSystemService("accessibility");
        } else if (A062 instanceof K8P) {
            ?? r0 = ((Kjh) A062).A02.A1B;
            A0H(null, r0);
            r0.setOnLongClickListener(null);
            boolean hasOnClickListeners = r0.hasOnClickListeners();
            boolean z = false;
            int i4 = 1;
            if (hasOnClickListeners) {
                z = true;
            }
            r0.setFocusable(z);
            r0.setClickable(hasOnClickListeners);
            r0.A01 = hasOnClickListeners;
            r0.setLongClickable(false);
            if (!z) {
                i4 = 2;
            }
            r0.setImportantForAccessibility(i4);
        } else {
            K8S k8s = (K8S) A062;
            TextInputLayout textInputLayout4 = k8s.A02;
            textInputLayout4.A0a(C53a.A00(k8s.A00, 2132411229));
            textInputLayout4.A0c(textInputLayout4.getResources().getText(2131954201));
            A0H(LKO.A00(k8s, ActionId.RTMP_CONNECTION_REQUESTED), textInputLayout4.A1B);
            MGQ mgq3 = k8s.A04;
            textInputLayout4.A1G.add(mgq3);
            if (textInputLayout4.A0V != null) {
                mgq3.BvP(textInputLayout4);
            }
            textInputLayout4.A1H.add(k8s.A05);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat3.setInterpolator(C80w.A04);
            ofFloat3.setDuration(150L);
            LF7.A00(ofFloat3, k8s, 25);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            TimeInterpolator timeInterpolator2 = C80w.A03;
            ofFloat4.setInterpolator(timeInterpolator2);
            long j = 100;
            ofFloat4.setDuration(j);
            LF7.A00(ofFloat4, k8s, 24);
            AnimatorSet animatorSet = new AnimatorSet();
            k8s.A00 = animatorSet;
            animatorSet.playTogether(ofFloat3, ofFloat4);
            JUI.A00(k8s.A00, k8s, 9);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat5.setInterpolator(timeInterpolator2);
            ofFloat5.setDuration(j);
            LF7.A00(ofFloat5, k8s, 24);
            k8s.A01 = ofFloat5;
            JUI.A00(ofFloat5, k8s, 10);
        }
        A07();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0G(ColorStateList colorStateList, CheckableImageButton checkableImageButton, TextInputLayout textInputLayout) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] copyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, copyOf, length, length2);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0H(View.OnClickListener onClickListener, CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnClickListener(onClickListener);
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        int i = 1;
        if (hasOnClickListeners) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.A01 = hasOnClickListeners;
        checkableImageButton.setLongClickable(false);
        if (!z) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static void A0I(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= childCount) {
                return;
            }
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                A0I((ViewGroup) childAt, z);
            }
            i = i2 + 1;
        }
    }

    public static void A0J(TextInputLayout textInputLayout) {
        EditText editText;
        int paddingStart;
        Resources resources;
        int dimensionPixelSize;
        int paddingEnd;
        int i;
        Resources resources2;
        int i2;
        int i3 = textInputLayout.A01;
        if (i3 == 0) {
            textInputLayout.A0Y = null;
            textInputLayout.A0Z = null;
        } else if (i3 == 1) {
            textInputLayout.A0Y = new 6Le(textInputLayout.A0a);
            textInputLayout.A0Z = new 6Le();
        } else {
            if (i3 != 2) {
                throw AnonymousClass001.A0L(0Pz.A0D(i3, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            textInputLayout.A0Y = (!textInputLayout.A0n || (textInputLayout.A0Y instanceof K8H)) ? new 6Le(textInputLayout.A0a) : new K8H(textInputLayout.A0a);
            textInputLayout.A0Z = null;
        }
        EditText editText2 = textInputLayout.A0V;
        if (editText2 != null && textInputLayout.A0Y != null && editText2.getBackground() == null && textInputLayout.A01 != 0) {
            textInputLayout.A0V.setBackground(textInputLayout.A0Y);
        }
        textInputLayout.A0V();
        if (textInputLayout.A01 == 1) {
            Context context = textInputLayout.getContext();
            if (4YU.A0B(context).fontScale >= 2.0f) {
                resources2 = textInputLayout.getResources();
                i2 = 2132279306;
            } else if (L6H.A02(context)) {
                resources2 = textInputLayout.getResources();
                i2 = 2132279301;
            }
            textInputLayout.A02 = resources2.getDimensionPixelSize(i2);
        }
        if (textInputLayout.A0V != null && textInputLayout.A01 == 1) {
            Context context2 = textInputLayout.getContext();
            if (4YU.A0B(context2).fontScale >= 2.0f) {
                editText = textInputLayout.A0V;
                paddingStart = editText.getPaddingStart();
                resources = textInputLayout.getResources();
                dimensionPixelSize = resources.getDimensionPixelSize(2132279312);
                paddingEnd = textInputLayout.A0V.getPaddingEnd();
                i = 2132279306;
            } else if (L6H.A02(context2)) {
                editText = textInputLayout.A0V;
                paddingStart = editText.getPaddingStart();
                resources = textInputLayout.getResources();
                dimensionPixelSize = resources.getDimensionPixelSize(2132279431);
                paddingEnd = textInputLayout.A0V.getPaddingEnd();
                i = 2132279327;
            }
            editText.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, resources.getDimensionPixelSize(i));
        }
        if (textInputLayout.A01 != 0) {
            A0L(textInputLayout);
        }
    }

    public static void A0K(TextInputLayout textInputLayout) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = textInputLayout.A0W;
        if (textView != null) {
            textInputLayout.A0b(textView, textInputLayout.A0h ? textInputLayout.A09 : textInputLayout.A0A);
            if (!textInputLayout.A0h && (colorStateList2 = textInputLayout.A0L) != null) {
                textInputLayout.A0W.setTextColor(colorStateList2);
            }
            if (!textInputLayout.A0h || (colorStateList = textInputLayout.A0K) == null) {
                return;
            }
            textInputLayout.A0W.setTextColor(colorStateList);
        }
    }

    public static void A0L(TextInputLayout textInputLayout) {
        if (textInputLayout.A01 != 1) {
            FrameLayout frameLayout = textInputLayout.A16;
            ViewGroup.MarginLayoutParams A0I = DKC.A0I(frameLayout);
            int A04 = textInputLayout.A04();
            if (A04 != A0I.topMargin) {
                A0I.topMargin = A04;
                frameLayout.requestLayout();
            }
        }
    }

    public static void A0M(TextInputLayout textInputLayout, int i) {
        if (i != 0 || textInputLayout.A0o) {
            TextView textView = textInputLayout.A0X;
            if (textView == null || !textInputLayout.A0q) {
                return;
            }
            textView.setText((CharSequence) null);
            textInputLayout.A0X.setVisibility(4);
            return;
        }
        TextView textView2 = textInputLayout.A0X;
        if (textView2 == null || !textInputLayout.A0q) {
            return;
        }
        textView2.setText(textInputLayout.A0d);
        textInputLayout.A0X.setVisibility(0);
        textInputLayout.A0X.bringToFront();
    }

    public static void A0N(TextInputLayout textInputLayout, CharSequence charSequence) {
        if (TextUtils.equals(charSequence, textInputLayout.A0b)) {
            return;
        }
        textInputLayout.A0b = charSequence;
        LDQ ldq = textInputLayout.A1E;
        if (charSequence == null || !TextUtils.equals(ldq.A0Q, charSequence)) {
            ldq.A0Q = charSequence;
            ldq.A0R = null;
            LDQ.A06(ldq);
        }
        if (textInputLayout.A0o) {
            return;
        }
        textInputLayout.A09();
    }

    public static void A0O(TextInputLayout textInputLayout, boolean z) {
        int i = 0;
        textInputLayout.A1C.setVisibility(DKG.A00(z ? 1 : 0));
        FrameLayout frameLayout = textInputLayout.A15;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        textInputLayout.A0C();
        if (textInputLayout.A0D == 0) {
            textInputLayout.A0T();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.getText()) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01cf, code lost:
    
        if (r301.A0o != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r0.hasFocus() == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0P(com.google.android.material.textfield.TextInputLayout r301, boolean r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0P(com.google.android.material.textfield.TextInputLayout, boolean, boolean):void");
    }

    private void A0Q(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.A1F.A0E) {
                A0R(false);
                return;
            }
            return;
        }
        LBN lbn = this.A1F;
        if (!lbn.A0E) {
            A0R(true);
        }
        Animator animator = lbn.A04;
        if (animator != null) {
            animator.cancel();
        }
        lbn.A0C = charSequence;
        lbn.A09.setText(charSequence);
        int i = lbn.A00;
        if (i != 2) {
            lbn.A01 = 2;
        }
        LBN.A01(lbn, i, lbn.A01, LBN.A02(lbn.A09, lbn, charSequence));
    }

    private void A0R(boolean z) {
        LBN lbn = this.A1F;
        if (lbn.A0E != z) {
            Animator animator = lbn.A04;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                DQw dQw = new DQw(lbn.A0I);
                lbn.A09 = dQw;
                dQw.setId(2131367980);
                lbn.A09.setTextAlignment(5);
                lbn.A09.setVisibility(4);
                lbn.A09.setAccessibilityLiveRegion(1);
                int i = lbn.A03;
                lbn.A03 = i;
                TextView textView = lbn.A09;
                if (textView != null) {
                    textView.setTextAppearance(i);
                }
                ColorStateList colorStateList = lbn.A06;
                lbn.A06 = colorStateList;
                TextView textView2 = lbn.A09;
                if (textView2 != null && colorStateList != null) {
                    textView2.setTextColor(colorStateList);
                }
                lbn.A05(lbn.A09, 1);
            } else {
                Animator animator2 = lbn.A04;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = lbn.A00;
                if (i2 == 2) {
                    lbn.A01 = 0;
                }
                LBN.A01(lbn, i2, lbn.A01, LBN.A02(lbn.A09, lbn, (CharSequence) null));
                lbn.A06(lbn.A09, 1);
                lbn.A09 = null;
                TextInputLayout textInputLayout = lbn.A0J;
                textInputLayout.A0U();
                textInputLayout.A0V();
            }
            lbn.A0E = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if ((r301.A0Y instanceof X.K8H) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0S() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0n
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L27
            r0 = r301
            java.lang.CharSequence r0 = r0.A0b
            r303 = r0
            r0 = r303
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L27
            r0 = r301
            X.6Le r0 = r0.A0Y
            r303 = r0
            r0 = r303
            boolean r0 = r0 instanceof X.K8H
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L2b
        L27:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L2b:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0S():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x013a, code lost:
    
        if (r311 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x002d, code lost:
    
        if (r301.A18.getMeasuredWidth() <= 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0T() {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0T():boolean");
    }

    private void A0b(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2132607952);
        textView.setTextColor(getContext().getColor(2132214014));
    }

    private void A0c(CharSequence charSequence) {
        DQB dqb = this.A1B;
        if (dqb.getContentDescription() != charSequence) {
            dqb.setContentDescription(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r304 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0U() {
        /*
            r301 = this;
            r0 = r301
            android.widget.EditText r0 = r0.A0V
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4a
            r0 = r301
            int r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4a
            r0 = r302
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L4a
            r0 = r304
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r305 = r0
            r0 = r301
            X.LBN r0 = r0.A1F
            r302 = r0
            r0 = r302
            boolean r0 = r0.A07()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4b
            r0 = r302
            android.widget.TextView r0 = r0.A08
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L5d
            r0 = -1
            r306 = r0
        L3b:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1 = r306
            android.graphics.PorterDuffColorFilter r0 = X.C53i.A00(r0, r1)
            r304 = r0
            r0 = r305
            r1 = r304
            r0.setColorFilter(r1)
        L4a:
            return
        L4b:
            r0 = r301
            boolean r0 = r0.A0h
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L66
            r0 = r301
            android.widget.TextView r0 = r0.A0W
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L66
        L5d:
            r0 = r304
            int r0 = r0.getCurrentTextColor()
            r306 = r0
            goto L3b
        L66:
            r0 = r305
            r0.clearColorFilter()
            r0 = r301
            android.widget.EditText r0 = r0.A0V
            r0.refreshDrawableState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0U():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0330, code lost:
    
        if (r315 != null) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a4  */
    /* JADX WARN: Type inference failed for: r0v68, types: [com.google.android.material.internal.CheckableImageButton, android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r0v80, types: [com.google.android.material.internal.CheckableImageButton, android.widget.ImageView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V() {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0V():void");
    }

    public void A0W(int i) {
        if (this.A08 != i) {
            if (i <= 0) {
                i = -1;
            }
            this.A08 = i;
            if (!this.A0g || this.A0W == null) {
                return;
            }
            A0Y(JR1.A0N(this));
        }
    }

    public void A0X(int i) {
        LDQ ldq = this.A1E;
        Context context = ldq.A0d.getContext();
        LBK lbk = new LBK(context, i);
        ColorStateList colorStateList = lbk.A0A;
        if (colorStateList != null) {
            ldq.A0K = colorStateList;
        }
        float f = lbk.A00;
        if (f != 0.0f) {
            ldq.A06 = f;
        }
        ColorStateList colorStateList2 = lbk.A09;
        if (colorStateList2 != null) {
            ldq.A0J = colorStateList2;
        }
        ldq.A03 = lbk.A04;
        ldq.A04 = lbk.A05;
        ldq.A05 = lbk.A06;
        ldq.A02 = lbk.A03;
        K8G k8g = ldq.A0P;
        if (k8g != null) {
            k8g.A00 = true;
        }
        LeS leS = new LeS(ldq);
        LBK.A01(lbk);
        K8G k8g2 = new K8G(lbk.A01, leS);
        ldq.A0P = k8g2;
        lbk.A05(context, k8g2);
        LDQ.A06(ldq);
        this.A0P = ldq.A0K;
        if (this.A0V != null) {
            A0P(this, false, false);
            A0L(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Y(int r302) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0Y(int):void");
    }

    public void A0Z(ColorStateList colorStateList) {
        this.A0M = colorStateList;
        this.A0P = colorStateList;
        if (this.A0V != null) {
            A0P(this, false, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.internal.CheckableImageButton, android.widget.ImageView] */
    public void A0a(Drawable drawable) {
        ?? r0 = this.A1B;
        r0.setImageDrawable(drawable);
        A0G(this.A0N, r0, this);
    }

    public void A0d(CharSequence charSequence) {
        LBN lbn = this.A1F;
        if (!lbn.A0D) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                A0j(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            lbn.A04();
            return;
        }
        Animator animator = lbn.A04;
        if (animator != null) {
            animator.cancel();
        }
        lbn.A0A = charSequence;
        lbn.A08.setText(charSequence);
        int i = lbn.A00;
        if (i != 1) {
            lbn.A01 = 1;
        }
        LBN.A01(lbn, i, lbn.A01, LBN.A02(lbn.A08, lbn, charSequence));
    }

    public void A0e(CharSequence charSequence) {
        if (this.A0n) {
            A0N(this, charSequence);
            sendAccessibilityEvent(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void A0f(CharSequence charSequence) {
        if (!this.A0q || !TextUtils.isEmpty(charSequence)) {
            if (!this.A0q) {
                DQw dQw = new DQw(getContext());
                this.A0X = dQw;
                dQw.setId(2131367981);
                this.A0X.setAccessibilityLiveRegion(1);
                int i = this.A0I;
                this.A0I = i;
                TextView textView = this.A0X;
                if (textView != null) {
                    textView.setTextAppearance(i);
                }
                TextView textView2 = this.A0X;
                if (textView2 != null) {
                    this.A16.addView(textView2);
                    this.A0X.setVisibility(0);
                }
                this.A0q = true;
            }
            this.A0d = charSequence;
        } else if (this.A0q) {
            DKG.A1J(this.A0X);
            this.A0X = null;
            this.A0q = false;
        }
        A0M(this, JR1.A0N(this));
    }

    public void A0g(boolean z) {
        if (this.A0g != z) {
            if (z) {
                DQw dQw = new DQw(getContext());
                this.A0W = dQw;
                dQw.setId(2131367978);
                this.A0W.setMaxLines(1);
                this.A1F.A05(this.A0W, 2);
                DKC.A0I(this.A0W).setMarginStart(getResources().getDimensionPixelOffset(2132279314));
                A0K(this);
                if (this.A0W != null) {
                    A0Y(JR1.A0N(this));
                }
            } else {
                this.A1F.A06(this.A0W, 2);
                this.A0W = null;
            }
            this.A0g = z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.internal.CheckableImageButton, android.view.View] */
    public void A0h(boolean z) {
        ?? r0 = this.A1B;
        if (r0.A00 != z) {
            r0.A00 = z;
            r0.sendAccessibilityEvent(0);
        }
    }

    public void A0i(boolean z) {
        if (A0k() != z) {
            this.A1B.setVisibility(DKG.A00(z ? 1 : 0));
            A0C();
            A0T();
        }
    }

    public void A0j(boolean z) {
        LBN lbn = this.A1F;
        if (lbn.A0D != z) {
            Animator animator = lbn.A04;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                DQw dQw = new DQw(lbn.A0I);
                lbn.A08 = dQw;
                dQw.setId(2131367979);
                lbn.A08.setTextAlignment(5);
                int i = lbn.A02;
                lbn.A02 = i;
                TextView textView = lbn.A08;
                if (textView != null) {
                    lbn.A0J.A0b(textView, i);
                }
                ColorStateList colorStateList = lbn.A05;
                lbn.A05 = colorStateList;
                TextView textView2 = lbn.A08;
                if (textView2 != null && colorStateList != null) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = lbn.A0B;
                lbn.A0B = charSequence;
                TextView textView3 = lbn.A08;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                lbn.A08.setVisibility(4);
                lbn.A08.setAccessibilityLiveRegion(1);
                lbn.A05(lbn.A08, 0);
            } else {
                lbn.A04();
                lbn.A06(lbn.A08, 0);
                lbn.A08 = null;
                TextInputLayout textInputLayout = lbn.A0J;
                textInputLayout.A0U();
                textInputLayout.A0V();
            }
            lbn.A0D = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r301.A1B.getVisibility() != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0k() {
        /*
            r301 = this;
            r0 = r301
            android.widget.FrameLayout r0 = r0.A15
            r302 = r0
            r0 = r302
            int r0 = r0.getVisibility()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1e
            r0 = r301
            com.google.android.material.internal.CheckableImageButton r0 = r0.A1B
            r302 = r0
            r0 = r302
            int r0 = r0.getVisibility()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L22
        L1e:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L22:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0k():boolean");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        boolean z2;
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.A16;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        A0L(this);
        EditText editText = (EditText) view;
        if (this.A0V != null) {
            throw AnonymousClass001.A0L("We already have an EditText, can only have one");
        }
        if (this.A0D != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.A0V = editText;
        int i2 = this.A0H;
        this.A0H = i2;
        if (editText != null) {
            float f = 0.0f / 0.0f;
            if (i2 != -1) {
                editText.setMinWidth(i2);
            }
        }
        int i3 = this.A0G;
        this.A0G = i3;
        EditText editText2 = this.A0V;
        if (editText2 != null) {
            float f2 = 0.0f / 0.0f;
            if (i3 != -1) {
                editText2.setMaxWidth(i3);
            }
        }
        A0J(this);
        C2955Jei c2955Jei = new C2955Jei(this);
        EditText editText3 = this.A0V;
        if (editText3 != null) {
            C0Ad.A0B(editText3, c2955Jei);
        }
        LDQ ldq = this.A1E;
        Typeface typeface = this.A0V.getTypeface();
        K8G k8g = ldq.A0P;
        if (k8g != null) {
            k8g.A00 = true;
        }
        if (ldq.A0M != typeface) {
            ldq.A0M = typeface;
            z = true;
        } else {
            z = false;
        }
        if (ldq.A0N != typeface) {
            ldq.A0N = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            LDQ.A06(ldq);
        }
        float textSize = this.A0V.getTextSize();
        if (ldq.A0D != textSize) {
            ldq.A0D = textSize;
            LDQ.A06(ldq);
        }
        int gravity = this.A0V.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (ldq.A0F != i4) {
            ldq.A0F = i4;
            LDQ.A06(ldq);
        }
        if (ldq.A0G != gravity) {
            ldq.A0G = gravity;
            LDQ.A06(ldq);
        }
        this.A0V.addTextChangedListener(new LJj(this, 8));
        if (this.A0M == null) {
            this.A0M = this.A0V.getHintTextColors();
        }
        if (this.A0n) {
            if (TextUtils.isEmpty(this.A0b)) {
                CharSequence hint = this.A0V.getHint();
                this.A0c = hint;
                A0e(hint);
                this.A0V.setHint((CharSequence) null);
            }
            this.A0p = true;
        }
        if (this.A0W != null) {
            A0Y(this.A0V.getText().length());
        }
        A0U();
        this.A1F.A03();
        this.A18.bringToFront();
        this.A17.bringToFront();
        this.A15.bringToFront();
        this.A1C.bringToFront();
        Iterator it = this.A1G.iterator();
        while (it.hasNext()) {
            ((MGQ) it.next()).BvP(this);
        }
        A0B();
        A0C();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        A0P(this, false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.A0V;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.A0c != null) {
            boolean z = this.A0p;
            this.A0p = false;
            CharSequence hint = editText.getHint();
            this.A0V.setHint(this.A0c);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.A0V.setHint(hint);
                this.A0p = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.A16;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.A0V) {
                newChild.setHint(this.A0n ? this.A0b : null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.A0r = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0r = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A0n) {
            LDQ ldq = this.A1E;
            int save = canvas.save();
            if (ldq.A0R != null && ldq.A0U) {
                ldq.A0O.getLineLeft(0);
                ldq.A0b.setTextSize(ldq.A09);
                float f = ldq.A07;
                float f2 = ldq.A08;
                float f3 = ldq.A0E;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                canvas.translate(f, f2);
                ldq.A0O.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        6Le r0 = this.A0Z;
        if (r0 != null) {
            Rect bounds = r0.getBounds();
            bounds.top = bounds.bottom - this.A07;
            this.A0Z.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void drawableStateChanged() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A12
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L8f
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A12 = r1
            r0 = r301
            super.drawableStateChanged()
            r0 = r301
            int[] r0 = r0.getDrawableState()
            r304 = r0
            r0 = r301
            X.LDQ r0 = r0.A1E
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L95
            r0 = r305
            r1 = r304
            r0.A0W = r1
            r0 = r305
            android.content.res.ColorStateList r0 = r0.A0K
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3d
            r0 = r304
            boolean r0 = r0.isStateful()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L50
        L3d:
            r0 = r305
            android.content.res.ColorStateList r0 = r0.A0L
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L95
            r0 = r304
            boolean r0 = r0.isStateful()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L95
        L50:
            r0 = r305
            X.LDQ.A06(r0)
            r0 = 1
            r306 = r0
        L58:
            r0 = r301
            android.widget.EditText r0 = r0.A0V
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L79
            r0 = r301
            boolean r0 = r0.isLaidOut()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L90
            r0 = r301
            boolean r0 = r0.isEnabled()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L90
        L73:
            r0 = r301
            r1 = r303
            r2 = 0
            A0P(r0, r1, r2)
        L79:
            r0 = r301
            r0.A0U()
            r0 = r301
            r0.A0V()
            r0 = r306
            if (r0 == 0) goto L8a
            r0 = r301
            r0.invalidate()
        L8a:
            r0 = r301
            r1 = 0
            r0.A12 = r1
        L8f:
            return
        L90:
            r0 = 0
            r303 = r0
            goto L73
        L95:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.A0V;
        return editText != null ? editText.getBaseline() + getPaddingTop() + A04() : super.getBaseline();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05a3  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r302, int r303, int r304, int r305, int r306) {
        /*
            Method dump skipped, instructions count: 1451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.A0V != null && this.A0V.getMeasuredHeight() < (max = Math.max(this.A17.getMeasuredHeight(), this.A18.getMeasuredHeight()))) {
            this.A0V.setMinimumHeight(max);
            z = true;
        }
        boolean A0T = A0T();
        if (z || A0T) {
            this.A0V.post(new Lm4(this));
        }
        if (this.A0X != null && (editText = this.A0V) != null) {
            this.A0X.setGravity(editText.getGravity());
            this.A0X.setPadding(this.A0V.getCompoundPaddingLeft(), this.A0V.getCompoundPaddingTop(), this.A0V.getCompoundPaddingRight(), this.A0V.getCompoundPaddingBottom());
        }
        A0B();
        A0C();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        A0d(savedState.A00);
        if (savedState.A04) {
            this.A1B.post(new Lm3(this));
        }
        A0e(savedState.A02);
        A0Q(savedState.A01);
        A0f(savedState.A03);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r301.A1B.isChecked() == false) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.TextInputLayout$SavedState, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        A0I(this, z);
        super.setEnabled(z);
    }
}
