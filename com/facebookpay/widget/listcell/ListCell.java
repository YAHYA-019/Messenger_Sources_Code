package com.facebookpay.widget.listcell;

import X.0CU;
import X.0G2;
import X.0Q8;
import X.11T;
import X.5Wh;
import X.7zM;
import X.AnonymousClass001;
import X.C06014fk;
import X.C06z;
import X.C1oo;
import X.FAF;
import X.FYG;
import X.HLw;
import X.JQx;
import X.JQz;
import X.JR2;
import X.JXW;
import X.KOS;
import X.KOW;
import X.KOv;
import X.KXk;
import X.LBg;
import X.LKL;
import X.M9L;
import X.M9M;
import X.MCV;
import X.Q0z;
import X.Q11;
import X.Q12;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.widget.actionmenu.InlineActionMenu;
import com.mapbox.mapboxsdk.R;

/* loaded from: ListCell.class */
public class ListCell extends FrameLayout implements MCV {
    public static final /* synthetic */ C06z[] A0q = {JQx.A16(ListCell.class, "primaryText", "getPrimaryText()Ljava/lang/String;"), JQx.A16(ListCell.class, "secondaryText", "getSecondaryText()Ljava/lang/String;"), JQx.A16(ListCell.class, "tertiaryText", "getTertiaryText()Ljava/lang/String;"), JQx.A16(ListCell.class, "quaternaryText", "getQuaternaryText()Ljava/lang/String;"), JQx.A16(ListCell.class, "tertiaryLinkableText", "getTertiaryLinkableText()Ljava/lang/CharSequence;"), JQx.A16(ListCell.class, "quaternaryLinkableText", "getQuaternaryLinkableText()Ljava/lang/CharSequence;"), JQx.A16(ListCell.class, "secondarySpannableText", "getSecondarySpannableText()Landroid/text/SpannableStringBuilder;"), JQx.A16(ListCell.class, "tertiarySpannableText", "getTertiarySpannableText()Landroid/text/SpannableStringBuilder;"), JQx.A16(ListCell.class, "secondaryTextSizePx", "getSecondaryTextSizePx()Ljava/lang/Float;"), JQx.A16(ListCell.class, "tertiaryTextSizePx", "getTertiaryTextSizePx()Ljava/lang/Float;"), JQx.A16(ListCell.class, "quaternaryTextSizePx", "getQuaternaryTextSizePx()Ljava/lang/Float;"), JQx.A16(ListCell.class, "quaternaryTextVerticalSpacing", "getQuaternaryTextVerticalSpacing()Ljava/lang/Integer;"), JQx.A16(ListCell.class, "errorText", "getErrorText()Ljava/lang/String;"), JQx.A16(ListCell.class, "imageUrl", "getImageUrl()Ljava/lang/String;"), JQx.A16(ListCell.class, "textStyle", "getTextStyle()Lcom/facebookpay/widget/listcell/ListCellTextStyle;"), JQx.A16(ListCell.class, "primaryTextStyle", "getPrimaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), JQx.A16(ListCell.class, "secondaryTextStyle", "getSecondaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), JQx.A16(ListCell.class, "tertiaryTextStyle", "getTertiaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), JQx.A16(ListCell.class, "isPrimaryTextLineBreaks", "isPrimaryTextLineBreaks()Z"), JQx.A16(ListCell.class, "isSecondaryTextLineBreaks", "isSecondaryTextLineBreaks()Z"), JQx.A16(ListCell.class, "isTertiaryTextLineBreaks", "isTertiaryTextLineBreaks()Z"), JQx.A16(ListCell.class, "backgroundStyle", "getBackgroundStyle()Lcom/facebookpay/widget/listcell/ListCellBackgroundStyle;"), JQx.A16(ListCell.class, "tertiaryTextOnClickListener", "getTertiaryTextOnClickListener()Landroid/view/View$OnClickListener;")};
    public float A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public FrameLayout A09;
    public FrameLayout A0A;
    public ImageView A0B;
    public LinearLayout A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public ShimmerFrameLayout A0I;
    public ShimmerFrameLayout A0J;
    public ShimmerFrameLayout A0K;
    public ShimmerFrameLayout A0L;
    public ComponentLoggingData A0M;
    public LoggingContext A0N;
    public Q12 A0O;
    public Q0z A0P;
    public FrameLayout A0Q;
    public FrameLayout A0R;
    public Q11 A0S;
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
    public final 0G2 A0e;
    public final 0G2 A0f;
    public final 0G2 A0g;
    public final 0G2 A0h;
    public final 0G2 A0i;
    public final 0G2 A0j;
    public final 0G2 A0k;
    public final 0G2 A0l;
    public final 0G2 A0m;
    public final 0G2 A0n;
    public final 0G2 A0o;
    public final 0G2 A0p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListCell(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        11T.A0F(context, 1);
        this.A0o = new M9M(this, 41);
        this.A0a = new M9M(this, 45);
        this.A0f = new M9M(this, 46);
        this.A0W = new M9M(this, 47);
        this.A0d = new M9L(context, this, 1);
        this.A0V = new M9L(context, this, 2);
        this.A0Z = new M9M(this, 48);
        this.A0e = new M9M(this, 49);
        this.A0b = new M9M(this, 50);
        this.A0h = new M9M(this, 31);
        this.A0X = new M9M(this, 32);
        this.A0Y = new M9M(this, 33);
        this.A0T = new M9M(this, 34);
        this.A0U = new M9M(this, 35);
        this.A0j = new M9M(this, KOW.A0J, 36);
        this.A0p = new M9M(this, KOv.A0m, 37);
        this.A0c = new M9M(this, KOv.A12, 38);
        this.A0i = new M9M(this, KOv.A1A, 39);
        this.A0l = new M9M(this, false, 40);
        this.A0m = new M9M(this, false, 42);
        this.A0n = new M9M(this, false, 43);
        this.A0k = new M9M(this, KOS.A06, 44);
        this.A0g = new M9L(context, this, 0);
        this.A00 = context.getResources().getDimension(R.dimen.mapbox_four_dp);
        View.inflate(context, 2132541988, this);
        this.A02 = 7zM.A0H(this, 2131368155);
        this.A0B = (ImageView) 7zM.A0H(this, R.id.image);
        this.A0C = (LinearLayout) 7zM.A0H(this, 2131367358);
        this.A01 = 7zM.A0H(this, 2131365238);
        this.A0E = (TextView) 7zM.A0H(this, 2131366672);
        this.A0J = (ShimmerFrameLayout) 7zM.A0H(this, 2131366671);
        this.A0G = (TextView) 7zM.A0H(this, 2131367209);
        this.A0K = (ShimmerFrameLayout) 7zM.A0H(this, 2131367208);
        this.A0H = (TextView) 7zM.A0H(this, 2131367912);
        this.A0L = (ShimmerFrameLayout) 7zM.A0H(this, 2131367911);
        this.A0F = (TextView) 7zM.A0H(this, 2131366777);
        this.A06 = (FrameLayout) 7zM.A0H(this, 2131365199);
        this.A09 = (FrameLayout) 7zM.A0H(this, 2131366977);
        this.A08 = (FrameLayout) 7zM.A0H(this, 2131366673);
        this.A0D = (TextView) 7zM.A0H(this, 2131363932);
        this.A0I = (ShimmerFrameLayout) 7zM.A0H(this, 2131364563);
        this.A05 = (FrameLayout) 7zM.A0H(this, 2131363512);
        this.A03 = (FrameLayout) 7zM.A0H(this, 2131364618);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(C06014fk.A04().A02(A03()), C1oo.A0q);
        View view = this.A01;
        if (view == null) {
            str = "containerView";
        } else {
            LBg.A00(obtainStyledAttributes, view, 10, 2132607286);
            int resourceId = obtainStyledAttributes.getResourceId(13, 2132607292);
            TextView textView = this.A0E;
            if (textView == null) {
                str = "primaryTextView";
            } else {
                LBg.A04(textView, resourceId, false);
                TextView textView2 = this.A0G;
                if (textView2 == null) {
                    str = "secondaryTextView";
                } else {
                    LBg.A04(textView2, resourceId, false);
                    TextView textView3 = this.A0H;
                    if (textView3 == null) {
                        str = "tertiaryTextView";
                    } else {
                        LBg.A04(textView3, resourceId, false);
                        TextView textView4 = this.A0F;
                        if (textView4 == null) {
                            str = "quaternaryTextView";
                        } else {
                            LBg.A04(textView4, resourceId, false);
                            TextView textView5 = this.A0D;
                            if (textView5 == null) {
                                str = "errorTextView";
                            } else {
                                LBg.A04(textView5, resourceId, false);
                                LinearLayout linearLayout = this.A0C;
                                if (linearLayout == null) {
                                    str = "shimmerContainer";
                                } else {
                                    LBg.A00(obtainStyledAttributes, linearLayout, 26, 2132607316);
                                    ShimmerFrameLayout shimmerFrameLayout = this.A0J;
                                    if (shimmerFrameLayout == null) {
                                        str = "primaryShimmerView";
                                    } else {
                                        LBg.A00(obtainStyledAttributes, shimmerFrameLayout, 28, 2132607313);
                                        ShimmerFrameLayout shimmerFrameLayout2 = this.A0K;
                                        if (shimmerFrameLayout2 == null) {
                                            str = "secondaryShimmerView";
                                        } else {
                                            LBg.A00(obtainStyledAttributes, shimmerFrameLayout2, 29, 2132607314);
                                            ShimmerFrameLayout shimmerFrameLayout3 = this.A0L;
                                            if (shimmerFrameLayout3 == null) {
                                                str = "tertiaryShimmerView";
                                            } else {
                                                LBg.A00(obtainStyledAttributes, shimmerFrameLayout3, 30, 2132607315);
                                                ImageView imageView = this.A0B;
                                                if (imageView == null) {
                                                    str = "imageView";
                                                } else {
                                                    LBg.A00(obtainStyledAttributes, imageView, 16, 2132607296);
                                                    FrameLayout frameLayout = this.A06;
                                                    if (frameLayout == null) {
                                                        str = "leftAddOnContainer";
                                                    } else {
                                                        LBg.A00(obtainStyledAttributes, frameLayout, 18, 2132607294);
                                                        FrameLayout frameLayout2 = this.A09;
                                                        if (frameLayout2 == null) {
                                                            str = "rightAddOnContainer";
                                                        } else {
                                                            LBg.A00(obtainStyledAttributes, frameLayout2, 21, 2132607293);
                                                            FrameLayout frameLayout3 = this.A08;
                                                            if (frameLayout3 == null) {
                                                                str = "primaryTextAddOnContainer";
                                                            } else {
                                                                LBg.A00(obtainStyledAttributes, frameLayout3, 20, 2132607295);
                                                                FrameLayout frameLayout4 = this.A03;
                                                                if (frameLayout4 != null) {
                                                                    LBg.A00(obtainStyledAttributes, frameLayout4, 17, 2132607299);
                                                                    obtainStyledAttributes.recycle();
                                                                    int A01 = C06014fk.A04().A01(15);
                                                                    ShimmerFrameLayout shimmerFrameLayout4 = this.A0J;
                                                                    if (shimmerFrameLayout4 != null) {
                                                                        FAF A04 = C06014fk.A04();
                                                                        Drawable drawable = context2.getDrawable(2132410779);
                                                                        if (drawable == null) {
                                                                            throw AnonymousClass001.A0N("Required value was null.");
                                                                        }
                                                                        shimmerFrameLayout4.setBackground(A04.A04(context2, drawable, A01));
                                                                        ShimmerFrameLayout shimmerFrameLayout5 = this.A0K;
                                                                        if (shimmerFrameLayout5 != null) {
                                                                            FAF A042 = C06014fk.A04();
                                                                            Drawable drawable2 = context2.getDrawable(2132410779);
                                                                            if (drawable2 == null) {
                                                                                throw AnonymousClass001.A0N("Required value was null.");
                                                                            }
                                                                            shimmerFrameLayout5.setBackground(A042.A04(context2, drawable2, A01));
                                                                            ShimmerFrameLayout shimmerFrameLayout6 = this.A0L;
                                                                            if (shimmerFrameLayout6 != null) {
                                                                                FAF A043 = C06014fk.A04();
                                                                                Drawable drawable3 = context2.getDrawable(2132410779);
                                                                                if (drawable3 == null) {
                                                                                    throw AnonymousClass001.A0N("Required value was null.");
                                                                                }
                                                                                shimmerFrameLayout6.setBackground(A043.A04(context2, drawable3, A01));
                                                                                ShimmerFrameLayout shimmerFrameLayout7 = this.A0I;
                                                                                if (shimmerFrameLayout7 != null) {
                                                                                    FAF A044 = C06014fk.A04();
                                                                                    Drawable drawable4 = context2.getDrawable(2132411003);
                                                                                    if (drawable4 == null) {
                                                                                        throw AnonymousClass001.A0N("Required value was null.");
                                                                                    }
                                                                                    shimmerFrameLayout7.setBackground(A044.A04(context2, drawable4, A01));
                                                                                    ShimmerFrameLayout shimmerFrameLayout8 = this.A0J;
                                                                                    if (shimmerFrameLayout8 != null) {
                                                                                        shimmerFrameLayout8.setImportantForAccessibility(2);
                                                                                        ShimmerFrameLayout shimmerFrameLayout9 = this.A0K;
                                                                                        if (shimmerFrameLayout9 != null) {
                                                                                            shimmerFrameLayout9.setImportantForAccessibility(2);
                                                                                            ShimmerFrameLayout shimmerFrameLayout10 = this.A0L;
                                                                                            if (shimmerFrameLayout10 != null) {
                                                                                                shimmerFrameLayout10.setImportantForAccessibility(2);
                                                                                                ShimmerFrameLayout shimmerFrameLayout11 = this.A0I;
                                                                                                if (shimmerFrameLayout11 != null) {
                                                                                                    shimmerFrameLayout11.setImportantForAccessibility(2);
                                                                                                    setImportantForAccessibility(1);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                11T.A0L("imageShimmer");
                                                                                throw 0Q8.createAndThrow();
                                                                            }
                                                                            11T.A0L("tertiaryShimmerView");
                                                                            throw 0Q8.createAndThrow();
                                                                        }
                                                                        11T.A0L("secondaryShimmerView");
                                                                        throw 0Q8.createAndThrow();
                                                                    }
                                                                    11T.A0L("primaryShimmerView");
                                                                    throw 0Q8.createAndThrow();
                                                                }
                                                                str = "actionMenuContainer";
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
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A00(View view, View view2, int i) {
        JXW jxw;
        JXW touchDelegate = view2.getTouchDelegate();
        if ((touchDelegate instanceof JXW) && (jxw = touchDelegate) != null && jxw.A00.containsKey(Integer.valueOf(view.getId()))) {
            return;
        }
        view2.getViewTreeObserver().addOnGlobalLayoutListener(new FYG(i, 1, view2, view));
    }

    public static final void A01(FrameLayout frameLayout, FrameLayout frameLayout2) {
        int i = 0;
        if (frameLayout2.getChildCount() <= 0 || !11T.A0O(frameLayout2.getChildAt(0), frameLayout)) {
            frameLayout2.removeAllViews();
            if (frameLayout != null) {
                frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-2, -1));
            } else {
                i = 8;
            }
            frameLayout2.setVisibility(i);
        }
    }

    public static final void A02(ListCell listCell, boolean z, boolean z2) {
        String str;
        TypedArray A0J = JR2.A0J(listCell);
        if (!z) {
            View view = listCell.A01;
            if (view == null) {
                str = "containerView";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            LBg.A04(view, A0J.getResourceId(9, 2132607290), false);
        }
        if (!z2) {
            int resourceId = A0J.getResourceId(12, 2132607304);
            TextView textView = listCell.A0E;
            if (textView == null) {
                str = "primaryTextView";
            } else {
                LBg.A04(textView, resourceId, false);
                TextView textView2 = listCell.A0G;
                if (textView2 == null) {
                    str = "secondaryTextView";
                } else {
                    LBg.A04(textView2, resourceId, false);
                    TextView textView3 = listCell.A0H;
                    if (textView3 == null) {
                        str = "tertiaryTextView";
                    } else {
                        LBg.A04(textView3, resourceId, false);
                        TextView textView4 = listCell.A0F;
                        if (textView4 == null) {
                            str = "quaternaryTextView";
                        } else {
                            LBg.A04(textView4, resourceId, false);
                            TextView textView5 = listCell.A0D;
                            if (textView5 == null) {
                                str = "errorTextView";
                            } else {
                                LBg.A04(textView5, resourceId, false);
                                LinearLayout linearLayout = listCell.A0C;
                                if (linearLayout == null) {
                                    str = "shimmerContainer";
                                } else {
                                    LBg.A00(A0J, linearLayout, 26, 2132607317);
                                    ShimmerFrameLayout shimmerFrameLayout = listCell.A0I;
                                    if (shimmerFrameLayout == null) {
                                        str = "imageShimmer";
                                    } else {
                                        LBg.A00(A0J, shimmerFrameLayout, 27, 2132607548);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        A0J.recycle();
    }

    public int A03() {
        if (this instanceof EntityListCell) {
            return ((EntityListCell) this).A00;
        }
        return 0;
    }

    public final void A04() {
        FrameLayout frameLayout = this.A09;
        if (frameLayout == null) {
            11T.A0L("rightAddOnContainer");
            throw 0Q8.createAndThrow();
        }
        5Wh layoutParams = frameLayout.getLayoutParams();
        11T.A0I(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        5Wh r0 = layoutParams;
        r0.A0s = 2131366672;
        r0.A0E = 2131366672;
    }

    public final void A05() {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            11T.A0L("leftAddOnContainer");
            throw 0Q8.createAndThrow();
        }
        5Wh layoutParams = frameLayout.getLayoutParams();
        11T.A0I(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        5Wh r0 = layoutParams;
        r0.A0s = 0;
        r0.A0E = 2131363932;
    }

    public final void A06() {
        String str;
        ShimmerFrameLayout shimmerFrameLayout = this.A0J;
        if (shimmerFrameLayout == null) {
            str = "primaryShimmerView";
        } else {
            shimmerFrameLayout.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A0K;
            if (shimmerFrameLayout2 == null) {
                str = "secondaryShimmerView";
            } else {
                shimmerFrameLayout2.setVisibility(8);
                ShimmerFrameLayout shimmerFrameLayout3 = this.A0L;
                if (shimmerFrameLayout3 == null) {
                    str = "tertiaryShimmerView";
                } else {
                    shimmerFrameLayout3.setVisibility(8);
                    ShimmerFrameLayout shimmerFrameLayout4 = this.A0I;
                    if (shimmerFrameLayout4 == null) {
                        str = "imageShimmer";
                    } else {
                        shimmerFrameLayout4.setVisibility(8);
                        String str2 = (String) JQz.A0g(this, this.A0U, A0q, 13);
                        if (str2 == null || 0CU.A0O(str2)) {
                            return;
                        }
                        ImageView imageView = this.A0B;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                            return;
                        }
                        str = "imageView";
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void A07() {
        TypedArray A0J = JR2.A0J(this);
        View view = this.A01;
        if (view == null) {
            11T.A0L("containerView");
            throw 0Q8.createAndThrow();
        }
        LBg.A04(view, A0J.getResourceId(8, 2132607289), false);
        A0J.recycle();
    }

    public final void A08() {
        ShimmerFrameLayout shimmerFrameLayout = this.A0I;
        String str = "imageShimmer";
        if (shimmerFrameLayout != null) {
            HLw.A00(shimmerFrameLayout, (Integer) null);
            shimmerFrameLayout.setVisibility(0);
            ImageView imageView = this.A0B;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            str = "imageView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void A09(View view, Integer num, int i) {
        TypedArray A0J = JR2.A0J(this);
        11T.A0A(A0J);
        LBg.A04(view, A0J.getResourceId(num.intValue(), i), false);
        A0J.recycle();
    }

    public final void A0A(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A03;
        if (frameLayout2 == null) {
            11T.A0L("actionMenuContainer");
            throw 0Q8.createAndThrow();
        }
        A01(frameLayout, frameLayout2);
        this.A0Q = frameLayout;
    }

    public final void A0B(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A05;
        if (frameLayout2 == null) {
            11T.A0L("customViewContainer");
            throw 0Q8.createAndThrow();
        }
        A01(frameLayout, frameLayout2);
        if (frameLayout != null) {
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            A02(this, false, true);
        }
        this.A04 = frameLayout;
    }

    public final void A0C(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A06;
        if (frameLayout2 == null) {
            11T.A0L("leftAddOnContainer");
            throw 0Q8.createAndThrow();
        }
        A01(frameLayout, frameLayout2);
        this.A07 = frameLayout;
    }

    public final void A0D(FrameLayout frameLayout) {
        String str;
        FrameLayout frameLayout2 = this.A08;
        if (frameLayout2 == null) {
            str = "primaryTextAddOnContainer";
        } else {
            A01(frameLayout, frameLayout2);
            this.A0R = frameLayout;
            if (frameLayout == null) {
                return;
            }
            TextView textView = this.A0E;
            if (textView != null) {
                5Wh layoutParams = textView.getLayoutParams();
                11T.A0I(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                layoutParams.A0L = -1;
                return;
            }
            str = "primaryTextView";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void A0E(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A09;
        if (frameLayout2 == null) {
            11T.A0L("rightAddOnContainer");
            throw 0Q8.createAndThrow();
        }
        A01(frameLayout, frameLayout2);
        this.A0A = frameLayout;
    }

    public void A0F(ComponentLoggingData componentLoggingData, LoggingContext loggingContext) {
        this.A0N = loggingContext;
        this.A0M = componentLoggingData;
        C06014fk.A0A().A02.BZT("client_load_fbpayui_init", KXk.A00(this));
    }

    public final void A0G(KOS kos) {
        JQz.A1J(this, kos, this.A0k, A0q, 21);
    }

    public final void A0H(Q12 q12) {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            11T.A0L("leftAddOnContainer");
            throw 0Q8.createAndThrow();
        }
        A01(q12, frameLayout);
        this.A0O = q12;
    }

    public final void A0I(Q11 q11) {
        FrameLayout frameLayout = this.A09;
        if (frameLayout == null) {
            11T.A0L("rightAddOnContainer");
            throw 0Q8.createAndThrow();
        }
        A01(q11, frameLayout);
        this.A0S = q11;
    }

    public final void A0J(KOW kow) {
        JQz.A1J(this, kow, this.A0j, A0q, 14);
    }

    public final void A0K(KOv kOv) {
        11T.A0F(kOv, 0);
        JQz.A1J(this, kOv, this.A0p, A0q, 15);
    }

    public final void A0L(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0J;
        if (shimmerFrameLayout == null) {
            11T.A0L("primaryShimmerView");
            throw 0Q8.createAndThrow();
        }
        HLw.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void A0M(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0K;
        if (shimmerFrameLayout == null) {
            11T.A0L("secondaryShimmerView");
            throw 0Q8.createAndThrow();
        }
        HLw.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void A0N(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0L;
        if (shimmerFrameLayout == null) {
            11T.A0L("tertiaryShimmerView");
            throw 0Q8.createAndThrow();
        }
        HLw.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void A0O(String str) {
        Context context = getContext();
        this.A00 = context.getResources().getDimension(2132279501);
        A0Q(str);
        this.A00 = context.getResources().getDimension(R.dimen.mapbox_four_dp);
    }

    public final void A0P(String str) {
        JQz.A1J(this, str, this.A0T, A0q, 12);
    }

    public final void A0Q(String str) {
        JQz.A1J(this, str, this.A0U, A0q, 13);
    }

    public final void A0R(String str) {
        JQz.A1J(this, str, this.A0o, A0q, 0);
    }

    public final void A0S(String str) {
        JQz.A1J(this, str, this.A0a, A0q, 1);
    }

    public final void A0T(String str) {
        LinearLayout linearLayout = this.A0C;
        if (linearLayout == null) {
            11T.A0L("shimmerContainer");
            throw 0Q8.createAndThrow();
        }
        linearLayout.setContentDescription(str);
    }

    public final void A0U(String str) {
        JQz.A1J(this, str, this.A0f, A0q, 2);
    }

    public final void A0V(boolean z) {
        this.A0m.Cvy(this, Boolean.valueOf(z), A0q[19]);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InlineActionMenu inlineActionMenu;
        super.onLayout(z, i, i2, i3, i4);
        InlineActionMenu inlineActionMenu2 = this.A0Q;
        if (!(inlineActionMenu2 instanceof InlineActionMenu) || (inlineActionMenu = inlineActionMenu2) == null) {
            return;
        }
        TextView textView = inlineActionMenu.A01;
        String str = "editView";
        if (textView != null) {
            if (textView.getVisibility() == 0) {
                TextView textView2 = inlineActionMenu.A01;
                if (textView2 != null) {
                    A00(textView2, this, inlineActionMenu.A04);
                }
            }
            TextView textView3 = inlineActionMenu.A02;
            str = "removeView";
            if (textView3 != null) {
                if (textView3.getVisibility() == 0) {
                    A00(textView3, this, inlineActionMenu.A04);
                    return;
                }
                return;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener != null ? new LKL(onClickListener, this, 27) : null);
    }
}
