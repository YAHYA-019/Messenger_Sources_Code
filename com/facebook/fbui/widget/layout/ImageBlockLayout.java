package com.facebook.fbui.widget.layout;

import X.0FI;
import X.0S2;
import X.11T;
import X.1Bq;
import X.1Br;
import X.48A;
import X.4YT;
import X.4YU;
import X.4YV;
import X.69W;
import X.7zO;
import X.AnonymousClass001;
import X.C1oo;
import X.C2141Dex;
import X.C69e;
import X.C69s;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKG;
import X.DP9;
import X.FG9;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbui.widget.contentview.CheckedContentView;
import com.facebook.fbui.widget.contentview.ContentView;
import com.facebook.fbui.widget.contentview.ContentViewWithButton;
import com.facebook.fig.listitem.FigListItem;

/* loaded from: ImageBlockLayout.class */
public class ImageBlockLayout extends 48A implements CallerContextable {
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
    public Paint A0H;
    public Drawable A0I;
    public Drawable A0J;
    public View A0K;
    public View A0L;
    public C69s A0M;
    public boolean A0N;
    public boolean A0O;
    public int A0P;
    public int A0Q;
    public 69W A0R;
    public final CallerContext A0S;
    public final 1Br A0T;
    public final Rect A0U;
    public final Rect A0V;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageBlockLayout(Context context) {
        this(context, null, 2130970615);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageBlockLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970615);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageBlockLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int A04;
        11T.A0F(context, 1);
        this.A0T = 1Bq.A00(66368);
        this.A0S = CallerContext.A0A(getClass(), "unknown", "thumbnail");
        this.A0O = true;
        this.A0V = DKC.A0C();
        this.A0U = DKC.A0C();
        Paint A0A = DKC.A0A(1);
        this.A0H = A0A;
        DKC.A1M(A0A);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1i, i, 0);
        11T.A0A(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(6, 0);
        if (resourceId > 0) {
            DKD.A0A(this).inflate(resourceId, (ViewGroup) this, true);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(20);
        if (drawable != null) {
            A0E(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(15);
        Drawable drawable3 = this.A0I;
        if (drawable3 != drawable2) {
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            this.A0I = drawable2;
            if (drawable2 != null) {
                drawable2.setCallback(this);
                DKE.A1I(drawable2, this);
            }
            A06();
            invalidate();
        }
        int i2 = obtainStyledAttributes.getInt(0, 48);
        if (this.A06 != i2) {
            this.A06 = i2;
            requestLayout();
        }
        A0B(obtainStyledAttributes.getInt(21, 48));
        int i3 = obtainStyledAttributes.getInt(16, 17);
        if (this.A09 != i3) {
            this.A09 = i3;
            A06();
        }
        this.A0C = obtainStyledAttributes.getLayoutDimension(19, -2);
        this.A0A = obtainStyledAttributes.getLayoutDimension(17, -2);
        this.A0B = obtainStyledAttributes.getDimensionPixelSize(18, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            setPadding(DKE.A04(obtainStyledAttributes, 2), DKE.A04(obtainStyledAttributes, 3), DKE.A04(obtainStyledAttributes, 4), DKE.A04(obtainStyledAttributes, 5));
        }
        if (obtainStyledAttributes.hasValue(8)) {
            A04 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            this.A03 = A04;
            this.A04 = A04;
            this.A05 = A04;
        } else {
            int A042 = DKE.A04(obtainStyledAttributes, 11);
            int A043 = DKE.A04(obtainStyledAttributes, 12);
            int A044 = DKE.A04(obtainStyledAttributes, 13);
            A04 = DKE.A04(obtainStyledAttributes, 9);
            this.A03 = A042;
            this.A04 = A043;
            this.A05 = A044;
        }
        this.A01 = A04;
        requestLayout();
        invalidate();
        int color = obtainStyledAttributes.getColor(10, 0);
        if (this.A02 != color) {
            this.A02 = color;
            Paint paint = this.A0H;
            if (paint != null) {
                paint.setColor(color);
            }
            invalidate();
        }
        boolean z = obtainStyledAttributes.getBoolean(14, false);
        if (this.A0N != z) {
            this.A0N = z;
            requestLayout();
            invalidate();
        }
        A0D(obtainStyledAttributes.getLayoutDimension(24, -2), obtainStyledAttributes.getLayoutDimension(22, -2));
        A0A(obtainStyledAttributes.getDimensionPixelSize(23, 0));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        if (this.A00 != dimensionPixelSize2) {
            this.A00 = dimensionPixelSize2;
            requestLayout();
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final 69W A04(ImageBlockLayout imageBlockLayout) {
        69W r302 = imageBlockLayout.A0R;
        if (r302 == null) {
            r302 = new 69W(new C69e(imageBlockLayout.getContext().getResources()).A01());
            imageBlockLayout.A0R = r302;
        }
        return r302;
    }

    private final Integer A05() {
        View view = this.A0L;
        return (view == null || view.getVisibility() == 8) ? (this.A0J == null || !this.A0O) ? 0S2.A0C : 0S2.A01 : 0S2.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r308 != (-1)) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A06() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.layout.ImageBlockLayout.A06():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.fbui.widget.contentview.CheckedContentView, com.facebook.fbui.widget.layout.ImageBlockLayout, android.view.View] */
    public int A07() {
        int paddingLeft;
        int i;
        if (this instanceof CheckedContentView) {
            ?? r0 = (CheckedContentView) this;
            paddingLeft = r0.getPaddingLeft() + r0.A03;
            if (r0.A01 != null) {
                int layoutDirection = r0.getLayoutDirection();
                Integer num = r0.A02;
                if (layoutDirection != 0 ? num == 0S2.A01 : num == 0S2.A00) {
                    i = 7zO.A02(r0.A01) + r0.A00;
                }
            }
            return paddingLeft;
        }
        paddingLeft = getPaddingLeft();
        i = this.A03;
        return paddingLeft + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.fbui.widget.contentview.CheckedContentView, com.facebook.fbui.widget.layout.ImageBlockLayout, android.view.View] */
    public int A08() {
        int paddingRight;
        int i;
        if (this instanceof CheckedContentView) {
            ?? r0 = (CheckedContentView) this;
            paddingRight = r0.getPaddingRight() + r0.A04;
            if (r0.A01 != null) {
                int layoutDirection = r0.getLayoutDirection();
                Integer num = r0.A02;
                if (layoutDirection != 0 ? num == 0S2.A00 : num == 0S2.A01) {
                    i = 7zO.A02(r0.A01) + r0.A00;
                }
            }
            return paddingRight;
        }
        paddingRight = getPaddingRight();
        i = this.A04;
        return paddingRight + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if ((r302 instanceof X.C2141Dex) != false) goto L8;
     */
    @Override // 
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.DP9 generateLayoutParams(android.view.ViewGroup.LayoutParams r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof com.facebook.fig.listitem.FigListItem
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L27
            r0 = r301
            boolean r0 = r0 instanceof com.facebook.fbui.widget.contentview.ContentView
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L20
            r0 = r302
            boolean r0 = r0 instanceof X.C2141Dex
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4d
        L1b:
            r0 = r302
            X.DP9 r0 = (X.DP9) r0
            return r0
        L20:
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
        L27:
            r0 = r302
            boolean r0 = r0 instanceof X.DP9
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1b
            r0 = r301
            boolean r0 = r0 instanceof com.facebook.fbui.widget.contentview.ContentView
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4d
            r0 = -2
            r303 = r0
            X.DP9 r0 = new X.DP9
            r302 = r0
            r0 = r302
            r1 = r303
            r2 = r303
            r0.<init>(r1, r2)
            r0 = r302
            r1 = -1
            r0.A00 = r1
            r0 = r302
            return r0
        L4d:
            X.Dex r0 = new X.Dex
            r302 = r0
            r0 = r302
            r0.<init>()
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.layout.ImageBlockLayout.generateLayoutParams(android.view.ViewGroup$LayoutParams):X.DP9");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0A(int i) {
        if (this.A0F != i) {
            this.A0F = i;
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0B(int i) {
        this.A0D = i;
        if (A05() == 0S2.A00) {
            DP9 A0L = DKE.A0L(this.A0L);
            11T.A0I(A0L, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
            A0L.A00 = i;
        }
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0C(int i, int i2) {
        if (this instanceof ContentView) {
            ContentView contentView = (ContentView) this;
            FG9 fg9 = contentView.A05;
            fg9.A08(i, i2);
            int max = Math.max(0, fg9.A04());
            int A03 = fg9.A03() + fg9.A02();
            FG9 fg92 = contentView.A04;
            fg92.A08(i, i2);
            int max2 = Math.max(max, fg92.A04());
            int A032 = A03 + fg92.A03() + fg92.A02();
            FG9 fg93 = contentView.A03;
            fg93.A08(i, i2);
            int max3 = Math.max(max2, fg93.A04());
            int A033 = A032 + fg93.A03() + fg93.A02();
            ((ImageBlockLayout) contentView).A08 = max3;
            ((ImageBlockLayout) contentView).A07 = A033;
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                DP9 layoutParams = childAt.getLayoutParams();
                11T.A0I(layoutParams, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
                DP9 dp9 = layoutParams;
                if (!dp9.A03 && !dp9.A02 && !dp9.A01) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) DKC.A0H(childAt, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
                    int i6 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    int i7 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                    i3 = Math.max(i3, childAt.getMeasuredWidth() + i6);
                    i4 += childAt.getMeasuredHeight() + i7;
                }
            }
        }
        this.A08 = i3;
        this.A07 = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0D(int i, int i2) {
        this.A0G = i;
        this.A0E = i2;
        int intValue = A05().intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                requestLayout();
                invalidate();
                return;
            }
            return;
        }
        DP9 A0L = DKE.A0L(this.A0L);
        11T.A0I(A0L, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
        DP9 dp9 = A0L;
        ((ViewGroup.LayoutParams) dp9).width = i;
        ((ViewGroup.LayoutParams) dp9).height = i2;
        dp9.A03 = true;
        View view = this.A0L;
        if (view != null) {
            view.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0E(Drawable drawable) {
        Drawable drawable2 = this.A0J;
        if (drawable2 != null || drawable2 == drawable) {
            return;
        }
        this.A0J = drawable;
        drawable.setCallback(this);
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0F(boolean z) {
        this.A0O = z;
        View view = this.A0L;
        if (view != null) {
            view.setVisibility(DKG.A00(z ? 1 : 0));
        } else {
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0G(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i2;
        if (this instanceof ContentView) {
            ContentView contentView = (ContentView) this;
            FG9 fg9 = contentView.A05;
            Integer A01 = FG9.A01(fg9);
            Integer num = 0S2.A00;
            fg9.A09(i, (A01 == num ? DKC.A0I(fg9.A04).topMargin : 0) + i2, i3);
            int A03 = i2 + fg9.A03() + fg9.A02();
            FG9 fg92 = contentView.A04;
            fg92.A09(i, (FG9.A01(fg92) == num ? DKC.A0I(fg92.A04).topMargin : 0) + A03, i3);
            int A032 = A03 + fg92.A03() + fg92.A02();
            FG9 fg93 = contentView.A03;
            fg93.A09(i, A032 + (FG9.A01(fg93) == num ? DKC.A0I(fg93.A04).topMargin : 0), i3);
            return;
        }
        boolean A1O = AnonymousClass001.A1O(getLayoutDirection());
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                DP9 layoutParams = childAt.getLayoutParams();
                11T.A0I(layoutParams, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
                DP9 dp9 = layoutParams;
                if (!dp9.A03 && !dp9.A02 && !dp9.A01) {
                    DP9 A0H = DKC.A0H(childAt, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
                    int i9 = (A0H.A00 < 0 ? 8388611 : A0H.A00) & 7;
                    int marginStart = A0H.getMarginStart();
                    int marginEnd = A0H.getMarginEnd();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (A1O) {
                        if (i9 == 3) {
                            i6 = i + marginStart;
                        } else if (i9 != 5) {
                            i6 = (((((i3 - i) - marginStart) - measuredWidth) - marginEnd) / 2) + i + marginStart;
                        } else {
                            i5 = i3 - marginEnd;
                            i6 = i5 - measuredWidth;
                        }
                        int i10 = i7 + ((ViewGroup.MarginLayoutParams) A0H).topMargin;
                        childAt.layout(i6, i10, measuredWidth + i6, i10 + measuredHeight);
                        i7 = i10 + measuredHeight + ((ViewGroup.MarginLayoutParams) A0H).bottomMargin;
                    } else if (i9 != 3) {
                        i6 = i9 != 5 ? (((((i3 - i) - marginStart) - measuredWidth) - marginEnd) / 2) + i + marginEnd : i + marginEnd;
                        int i102 = i7 + ((ViewGroup.MarginLayoutParams) A0H).topMargin;
                        childAt.layout(i6, i102, measuredWidth + i6, i102 + measuredHeight);
                        i7 = i102 + measuredHeight + ((ViewGroup.MarginLayoutParams) A0H).bottomMargin;
                    } else {
                        i5 = i3 - marginStart;
                        i6 = i5 - measuredWidth;
                        int i1022 = i7 + ((ViewGroup.MarginLayoutParams) A0H).topMargin;
                        childAt.layout(i6, i1022, measuredWidth + i6, i1022 + measuredHeight);
                        i7 = i1022 + measuredHeight + ((ViewGroup.MarginLayoutParams) A0H).bottomMargin;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        4YV.A1N(view, layoutParams);
        if (layoutParams instanceof DP9) {
            DP9 dp9 = (DP9) layoutParams;
            if (dp9.A03) {
                View view2 = this.A0L;
                if (view2 != null) {
                    removeView(view2);
                }
                if (dp9.A00 < 0) {
                    dp9.A00 = 48;
                }
                this.A0L = view;
            } else if (dp9.A02) {
                View view3 = this.A0K;
                if (view3 != null) {
                    removeView(view3);
                }
                if (dp9.A00 < 0) {
                    dp9.A00 = 16;
                }
                this.A0K = view;
            }
        }
        super/*android.view.ViewGroup*/.addView(view, i, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if ((r302 instanceof X.DP9) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto Lf
            r0 = r302
            boolean r0 = r0 instanceof X.DP9
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r304 = r0
        L11:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.layout.ImageBlockLayout.checkLayoutParams(android.view.ViewGroup$LayoutParams):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        11T.A0F(canvas, 0);
        super.dispatchDraw(canvas);
        int paddingTop = getPaddingTop();
        int i = this.A05;
        int i2 = paddingTop + i;
        int paddingBottom = getPaddingBottom();
        int i3 = this.A01;
        int i4 = paddingBottom + i3;
        int A07 = A07();
        int A08 = A08();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (A05() == 0S2.A01 && (drawable = this.A0J) != null) {
            drawable.draw(canvas);
        }
        View view = this.A0L;
        if (view == null ? !(this.A0J == null || !this.A0O) : view.getVisibility() == 0) {
            Drawable drawable2 = this.A0I;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        }
        boolean z = false;
        int i5 = measuredWidth - A08;
        int i6 = measuredHeight - i4;
        if (!this.A0N) {
            A07 = 0;
            i5 = measuredWidth;
            i2 = 0;
            i6 = measuredHeight;
        }
        if (i != 0 || i3 != 0 || this.A03 != 0 || this.A04 != 0) {
            z = true;
            canvas.save();
        }
        Paint paint = this.A0H;
        if (paint != null) {
            if (i != 0) {
                canvas.drawRect(A07, 0.0f, i5, i, paint);
            }
            if (i3 != 0) {
                canvas.drawRect(A07, measuredHeight - i3, i5, measuredHeight, paint);
            }
            int i7 = this.A03;
            if (i7 != 0) {
                canvas.drawRect(0.0f, i2, i7, i6, paint);
            }
            if (this.A04 != 0) {
                canvas.drawRect(measuredWidth - r0, i2, measuredWidth, i6, paint);
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawableStateChanged() {
        super/*android.view.ViewGroup*/.drawableStateChanged();
        Drawable drawable = this.A0I;
        if (drawable != null) {
            DKE.A1I(drawable, this);
        }
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this instanceof ContentView) {
            return new C2141Dex();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        ((DP9) marginLayoutParams).A00 = -1;
        return marginLayoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context A08;
        if (this instanceof FigListItem) {
            A08 = ((View) this).getContext();
        } else {
            if (this instanceof ContentView) {
                return new C2141Dex(((View) this).getContext(), attributeSet);
            }
            11T.A0F(attributeSet, 0);
            A08 = 4YU.A08(this);
        }
        return new DP9(A08, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void jumpDrawablesToCurrentState() {
        super/*android.view.ViewGroup*/.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0I;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1725035473);
        11T.A0F(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        11T.A0I(layoutParams, 4YT.A00(5));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        view.measure(ViewGroup.getChildMeasureSpec(i, i2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, ((ViewGroup.LayoutParams) marginLayoutParams).width), ViewGroup.getChildMeasureSpec(i3, i4 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        0FI.A0C(-383778001, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-977972545);
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        A04(this).A03();
        0FI.A0C(-110991959, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-809868606);
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        A04(this).A04();
        0FI.A0C(-880833976, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishTemporaryDetach() {
        super/*android.view.View*/.onFinishTemporaryDetach();
        A04(this).A03();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x046c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r302, int r303, int r304, int r305, int r306) {
        /*
            Method dump skipped, instructions count: 1423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.layout.ImageBlockLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean A1Q;
        int measuredWidth;
        int measuredHeight;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        View view;
        Drawable drawable;
        this.A08 = 0;
        this.A07 = 0;
        int A07 = A07() + A08();
        int paddingTop = getPaddingTop() + this.A05 + getPaddingBottom() + this.A01;
        Integer A05 = A05();
        int intValue = A05.intValue();
        boolean z = true;
        if (intValue != 0) {
            if (intValue != 1 || (drawable = this.A0J) == null) {
                i3 = 0;
                measuredWidth = 0;
                measuredHeight = 0;
            } else {
                measuredWidth = this.A0G;
                if (measuredWidth < 0) {
                    measuredWidth = drawable.getIntrinsicWidth();
                }
                measuredHeight = this.A0E;
                if (measuredHeight < 0) {
                    measuredHeight = drawable.getIntrinsicHeight();
                }
                i3 = 0;
            }
            i4 = 0;
            A1Q = false;
        } else {
            View view2 = this.A0L;
            if (view2 == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) DKC.A0H(view2, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
            i3 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            i4 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            A1Q = AnonymousClass001.A1Q(((ViewGroup.LayoutParams) marginLayoutParams).height, -1);
            measureChildWithMargins(view2, i, A07, i2, paddingTop);
            measuredWidth = view2.getMeasuredWidth();
            measuredHeight = view2.getMeasuredHeight();
        }
        if (A05 != 0S2.A0C) {
            A07 = A07 + i3 + (measuredWidth == 0 ? 0 : this.A0F + measuredWidth);
            i5 = Math.max(0, i4 + measuredHeight);
        } else {
            i5 = 0;
        }
        View view3 = this.A0K;
        if (view3 == null || view3.getVisibility() == 8) {
            i6 = 0;
            i7 = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) DKC.A0H(view3, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
            int i10 = marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
            int i11 = marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            if (((ViewGroup.LayoutParams) marginLayoutParams2).height != -1) {
                z = false;
            }
            measureChildWithMargins(view3, i, A07, i2, paddingTop);
            i6 = view3.getMeasuredWidth();
            i7 = view3.getMeasuredHeight();
            if (i6 == 0) {
                i9 = 0;
            } else {
                int i12 = i6 + i10;
                if (this instanceof ContentViewWithButton) {
                    ContentViewWithButton contentViewWithButton = (ContentViewWithButton) this;
                    i8 = ((ImageBlockLayout) contentViewWithButton).A00;
                    if (contentViewWithButton.A02 != null && (view = contentViewWithButton.A0K) != null && view.getVisibility() != 8) {
                        i8 += contentViewWithButton.A01;
                    }
                } else {
                    i8 = this.A00;
                }
                i9 = i12 + i8;
            }
            A07 += i9;
            i5 = Math.max(i5, i7 + i11);
        }
        A0C(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - A07, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - paddingTop, View.MeasureSpec.getMode(i2)));
        int max = Math.max(0, this.A08);
        int max2 = Math.max(i5, this.A07);
        ViewGroup.LayoutParams layoutParams = null;
        if (A1Q && measuredHeight != max2) {
            View view4 = this.A0L;
            ViewGroup.LayoutParams layoutParams2 = view4 != null ? view4.getLayoutParams() : null;
            11T.A0I(layoutParams2, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
            View view5 = this.A0L;
            if (view5 != null) {
                view5.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((max2 - marginLayoutParams3.topMargin) - marginLayoutParams3.bottomMargin, 1073741824));
            }
        }
        if (z && i7 != max2) {
            if (view3 != null) {
                layoutParams = view3.getLayoutParams();
            }
            11T.A0I(layoutParams, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (view3 != null) {
                view3.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec((max2 - marginLayoutParams4.topMargin) - marginLayoutParams4.bottomMargin, 1073741824));
            }
        }
        ((View) this).setMeasuredDimension(View.resolveSize(Math.max(max + A07, ((View) this).getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(max2 + paddingTop, ((View) this).getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStartTemporaryDetach() {
        super/*android.view.View*/.onStartTemporaryDetach();
        A04(this).A04();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeView(View view) {
        11T.A0F(view, 0);
        if (view == this.A0L) {
            this.A0L = null;
        } else if (view == this.A0K) {
            this.A0K = null;
        }
        super/*android.view.ViewGroup*/.removeView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeViewInLayout(View view) {
        11T.A0F(view, 0);
        if (view == this.A0L) {
            this.A0L = null;
        } else if (view == this.A0K) {
            this.A0K = null;
        }
        super/*android.view.ViewGroup*/.removeViewInLayout(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (super/*android.view.View*\/.verifyDrawable(r302) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifyDrawable(android.graphics.drawable.Drawable r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A0J
            r304 = r0
            r0 = r304
            r1 = r302
            if (r0 != r1) goto L1a
            r0 = r301
            boolean r0 = r0.A0O
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L34
        L1a:
            r0 = r301
            android.graphics.drawable.Drawable r0 = r0.A0I
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L34
            r0 = r301
            r1 = r302
            boolean r0 = super/*android.view.View*/.verifyDrawable(r1)
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L36
        L34:
            r0 = 1
            r303 = r0
        L36:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbui.widget.layout.ImageBlockLayout.verifyDrawable(android.graphics.drawable.Drawable):boolean");
    }
}
