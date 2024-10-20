package com.facebookpay.widget.navibar;

import X.0G2;
import X.0Q8;
import X.11T;
import X.5XE;
import X.7zM;
import X.7zO;
import X.AnonymousClass001;
import X.C06014fk;
import X.C06z;
import X.C1oo;
import X.DMd;
import X.EyR;
import X.FAF;
import X.GOm;
import X.JQx;
import X.JR0;
import X.KOv;
import X.L9O;
import X.LBg;
import X.LKj;
import X.M9L;
import X.M9M;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: NavigationBar.class */
public final class NavigationBar extends FrameLayout {
    public static final /* synthetic */ C06z[] A0g = {JQx.A16(NavigationBar.class, "title", "getTitle()Ljava/lang/String;"), JQx.A16(NavigationBar.class, "titleIcon", "getTitleIcon()Lcom/facebookpay/widget/style/Icon;"), JQx.A16(NavigationBar.class, "leftIconButtonIcon", "getLeftIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), JQx.A16(NavigationBar.class, "isLeftProfileIcon", "isLeftProfileIcon()Z"), JQx.A16(NavigationBar.class, "leftIconButtonOnClickListener", "getLeftIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), JQx.A16(NavigationBar.class, "leftTextButtonText", "getLeftTextButtonText()Ljava/lang/String;"), JQx.A16(NavigationBar.class, "isRightProfileIcon", "isRightProfileIcon()Z"), JQx.A16(NavigationBar.class, "rightIconButtonIcon", "getRightIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), JQx.A16(NavigationBar.class, "rightIconButtonOnClickListener", "getRightIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), JQx.A16(NavigationBar.class, "rightTextButtonText", "getRightTextButtonText()Ljava/lang/String;"), JQx.A16(NavigationBar.class, "leftIconButtonEnable", "getLeftIconButtonEnable()Z"), JQx.A16(NavigationBar.class, "rightIconButtonEnable", "getRightIconButtonEnable()Z"), JQx.A16(NavigationBar.class, "leftTextButtonEnable", "getLeftTextButtonEnable()Z"), JQx.A16(NavigationBar.class, "rightTextButtonEnable", "getRightTextButtonEnable()Z"), JQx.A16(NavigationBar.class, "navBarClickableActionsEnable", "getNavBarClickableActionsEnable()Z"), JQx.A16(NavigationBar.class, "progressIconShow", "getProgressIconShow()Z"), JQx.A16(NavigationBar.class, "leftIconButtonLabel", "getLeftIconButtonLabel()Ljava/lang/String;"), JQx.A16(NavigationBar.class, "leftTextButtonHint", "getLeftTextButtonHint()Ljava/lang/String;"), JQx.A16(NavigationBar.class, "rightIconButtonLabel", "getRightIconButtonLabel()Ljava/lang/String;"), JQx.A16(NavigationBar.class, "rightTextButtonHint", "getRightTextButtonHint()Ljava/lang/String;"), JQx.A16(NavigationBar.class, "leftTextButtonOnClickListener", "getLeftTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), JQx.A16(NavigationBar.class, "rightTextButtonOnClickListener", "getRightTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), JQx.A16(NavigationBar.class, "bottomDividerVisible", "getBottomDividerVisible()Z")};
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public LinearLayout A09;
    public ProgressBar A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public DMd A0E;
    public boolean A0F;
    public final LKj A0G;
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
    public final 0G2 A0S;
    public final 0G2 A0T;
    public final 0G2 A0U;
    public final 0G2 A0V;
    public final 0G2 A0W;
    public final 0G2 A0X;
    public final 0G2 A0Y;
    public final 0G2 A0Z;
    public final 0G2 A0a;
    public final 0G2 A0b;
    public final 0G2 A0c;
    public final 0G2 A0d;
    public final LKj A0e;
    public final LKj A0f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0e = new LKj(this, 9);
        this.A0G = new LKj(this, 8);
        this.A0f = new LKj(this, 10);
        this.A0c = new M9M(this, 65);
        this.A0d = new M9L(context, this, 6);
        this.A0L = new M9L(context, this, 7);
        this.A0I = new M9M(this, false, 70);
        this.A0N = new M9M(this, 71);
        this.A0R = new M9M(this, 72);
        this.A0J = new M9M(this, false, 73);
        this.A0V = new M9L(context, this, 8);
        this.A0X = new M9M(this, 74);
        this.A0b = new M9M(this, 57);
        this.A0K = new M9M(this, false, 58);
        this.A0U = new M9M(this, false, 59);
        this.A0O = new M9L(context, this, false, 4);
        this.A0Y = new M9L(context, this, false, 5);
        this.A0S = new M9M(this, false, 60);
        this.A0T = new M9M(this, false, 61);
        this.A0M = new M9M(this, 62);
        this.A0P = new M9M(this, 63);
        this.A0W = new M9M(this, 64);
        this.A0Z = new M9M(this, 66);
        this.A0Q = new M9M(this, 67);
        this.A0a = new M9M(this, 68);
        this.A0H = new M9M(this, false, 69);
        EyR A01 = C06014fk.A01();
        11T.A0D(A01);
        this.A0E = new DMd(context, A01);
        A01.A01(context);
        View.inflate(this.A0E, 2132541994, this);
        this.A08 = (LinearLayout) 7zM.A0H(this, 2131365943);
        this.A07 = (LinearLayout) 7zM.A0H(this, 2131365941);
        this.A09 = (LinearLayout) 7zM.A0H(this, 2131365944);
        this.A06 = (ImageView) 7zM.A0H(this, 2131368079);
        this.A0D = (TextView) 7zM.A0H(this, 2131368084);
        this.A04 = (ImageView) 7zM.A0H(this, 2131365204);
        this.A0B = (TextView) 7zM.A0H(this, 2131365212);
        this.A0C = (TextView) 7zM.A0H(this, 2131366993);
        this.A05 = (ImageView) 7zM.A0H(this, 2131366983);
        Context context2 = this.A0E;
        Context context3 = context2;
        this.A03 = new View(context2 == null ? getContext() : context2);
        this.A0A = (ProgressBar) 7zM.A0H(this, 2131366708);
        View view = this.A03;
        String str = "bottomDivider";
        if (view != null) {
            float f = 0.0f / 0.0f;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            addView(view, layoutParams);
            TextView textView = this.A0D;
            if (textView != null) {
                L9O.A01(textView, KOv.A0t);
                TextView textView2 = this.A0B;
                if (textView2 != null) {
                    KOv kOv = KOv.A0y;
                    L9O.A01(textView2, kOv);
                    TextView textView3 = this.A0C;
                    if (textView3 != null) {
                        L9O.A01(textView3, kOv);
                        TextView textView4 = this.A0B;
                        if (textView4 != null) {
                            A00(textView4);
                            TextView textView5 = this.A0C;
                            if (textView5 != null) {
                                A00(textView5);
                                ProgressBar progressBar = this.A0A;
                                if (progressBar == null) {
                                    str = "progressIcon";
                                } else {
                                    Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                                    if (indeterminateDrawable != null) {
                                        FAF A04 = C06014fk.A04();
                                        11T.A0D(context3 == null ? getContext() : context3);
                                        indeterminateDrawable.setColorFilter(A04.A01(25), PorterDuff.Mode.MULTIPLY);
                                    }
                                    Context context4 = context3 == null ? getContext() : context3;
                                    C06014fk.A04();
                                    TypedArray obtainStyledAttributes = context4.obtainStyledAttributes(2132607318, C1oo.A0r);
                                    LBg.A04(7zM.A0H(this, 2131365946), obtainStyledAttributes.getResourceId(1, 2132607320), false);
                                    ImageView imageView = this.A06;
                                    if (imageView == null) {
                                        str = "titleIconView";
                                    } else {
                                        LBg.A00(obtainStyledAttributes, imageView, 3, 2132607326);
                                        TextView textView6 = this.A0D;
                                        if (textView6 != null) {
                                            LBg.A00(obtainStyledAttributes, textView6, 4, 2132607325);
                                            View view2 = this.A03;
                                            if (view2 != null) {
                                                LBg.A04(view2, obtainStyledAttributes.getResourceId(0, 2132607319), false);
                                                TextView textView7 = this.A0B;
                                                if (textView7 != null) {
                                                    LBg.A00(obtainStyledAttributes, textView7, 2, 2132607322);
                                                    TextView textView8 = this.A0C;
                                                    if (textView8 != null) {
                                                        LBg.A00(obtainStyledAttributes, textView8, 2, 2132607322);
                                                        ImageView imageView2 = this.A04;
                                                        if (imageView2 == null) {
                                                            str = "leftIconButton";
                                                        } else {
                                                            LBg.A04(imageView2, 2132607324, false);
                                                            ImageView imageView3 = this.A05;
                                                            if (imageView3 == null) {
                                                                str = "rightIconButton";
                                                            } else {
                                                                LBg.A04(imageView3, 2132607324, false);
                                                                obtainStyledAttributes.recycle();
                                                                context3 = context3 == null ? getContext() : context3;
                                                                11T.A0D(context3);
                                                                View view3 = this.A03;
                                                                if (view3 != null) {
                                                                    11T.A0F(context3, 0);
                                                                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                                                                    int applyDimension = (int) TypedValue.applyDimension(1, 0.5f, 7zO.A0I(context3));
                                                                    layoutParams2.height = applyDimension == 0 ? 1 : applyDimension;
                                                                    LBg.A01(this, 2);
                                                                    View view4 = this.A03;
                                                                    if (view4 != null) {
                                                                        LBg.A01(view4, 19);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    11T.A0L("rightTextButton");
                    throw 0Q8.createAndThrow();
                }
                11T.A0L("leftTextButton");
                throw 0Q8.createAndThrow();
            }
            11T.A0L("titleTextView");
            throw 0Q8.createAndThrow();
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A00(TextView textView) {
        Context context = textView.getContext();
        C06014fk.A04();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132607342, C1oo.A0p);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_pressed};
        FAF A04 = C06014fk.A04();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        stateListDrawable.addState(iArr, JR0.A0Y(context, drawable, C06014fk.A04(), A04, 23));
        stateListDrawable.addState(new int[]{-16842919}, null);
        int[] iArr2 = {R.attr.state_focused};
        FAF A042 = C06014fk.A04();
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        if (drawable2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        stateListDrawable.addState(iArr2, JR0.A0Y(context, drawable2, C06014fk.A04(), A042, 23));
        stateListDrawable.addState(new int[]{-16842908}, null);
        textView.setBackground(stateListDrawable);
        obtainStyledAttributes.recycle();
    }

    public static final void A01(NavigationBar navigationBar) {
        String str;
        LinearLayout linearLayout = navigationBar.A08;
        if (linearLayout == null) {
            str = "navbarLeftContainer";
        } else {
            float measuredWidth = linearLayout.getMeasuredWidth();
            if (navigationBar.A07 == null) {
                str = "navbarCenterContainer";
            } else {
                float measuredWidth2 = r0.getMeasuredWidth() * 0.6f;
                LinearLayout linearLayout2 = navigationBar.A09;
                if (linearLayout2 != null) {
                    float measuredWidth3 = linearLayout2.getMeasuredWidth();
                    float f = measuredWidth + measuredWidth2 + measuredWidth3;
                    float f2 = measuredWidth / f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    float f3 = measuredWidth2 / f;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    float f4 = measuredWidth3 / f;
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) navigationBar.findViewById(2131365946);
                    5XE r0 = new 5XE();
                    r0.A0C(constraintLayout);
                    r0.A08(2131365943, f2);
                    r0.A08(2131365941, f3);
                    r0.A08(2131365944, f4);
                    r0.A0A(constraintLayout);
                    constraintLayout.requestLayout();
                    return;
                }
                str = "navbarRightContainer";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A02(NavigationBar navigationBar) {
        ConstraintLayout constraintLayout = (ConstraintLayout) navigationBar.findViewById(2131365946);
        5XE r0 = new 5XE();
        r0.A0C(constraintLayout);
        r0.A08(2131365943, 0.0f);
        r0.A08(2131365941, 0.0f);
        r0.A08(2131365944, 0.0f);
        r0.A0A(constraintLayout);
    }

    public static final void A03(NavigationBar navigationBar) {
        LinearLayout linearLayout = navigationBar.A08;
        if (linearLayout == null) {
            11T.A0L("navbarLeftContainer");
            throw 0Q8.createAndThrow();
        }
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(navigationBar.A0e);
    }

    public static final void A04(NavigationBar navigationBar) {
        LinearLayout linearLayout = navigationBar.A09;
        if (linearLayout == null) {
            11T.A0L("navbarRightContainer");
            throw 0Q8.createAndThrow();
        }
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(navigationBar.A0f);
    }

    public static final void A05(NavigationBar navigationBar, boolean z) {
        Context context = navigationBar.A0E;
        if (context == null) {
            context = navigationBar.getContext();
        }
        C06014fk.A04();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132607321, C1oo.A0s);
        int i = 0;
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AnonymousClass001.A1N(z ? 1 : 0) ? 1 : 0, 0);
        View findViewById = navigationBar.findViewById(2131365946);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        11T.A0I(layoutParams, GOm.A00(0));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = marginLayoutParams.leftMargin;
        boolean z2 = navigationBar.A0F;
        int i3 = z2 ? 0 : marginLayoutParams.topMargin;
        int i4 = marginLayoutParams.rightMargin;
        if (!z2) {
            i = dimensionPixelOffset;
        }
        marginLayoutParams.setMargins(i2, i3, i4, i);
        findViewById.requestLayout();
        findViewById.invalidate();
        obtainStyledAttributes.recycle();
    }
}
