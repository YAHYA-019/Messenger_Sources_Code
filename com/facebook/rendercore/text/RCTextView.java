package com.facebook.rendercore.text;

import X.0Cs;
import X.0FI;
import X.AnonymousClass001;
import X.C0Ad;
import X.DKC;
import X.DRh;
import X.EqR;
import X.FrU;
import X.FrV;
import X.Fz5;
import X.GDP;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.common.dextricks.DexStore;

/* loaded from: RCTextView.class */
public class RCTextView extends View {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Path A05;
    public Layout A06;
    public CharSequence A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public ClickableSpan[] A0B;
    public int A0C;
    public int A0D;
    public ColorStateList A0E;
    public Paint A0F;
    public boolean A0G;
    public ImageSpan[] A0H;
    public final DRh A0I;

    public RCTextView(Context context) {
        super(context);
        this.A09 = false;
        if (getImportantForAccessibility() != 0) {
            this.A0I = null;
            return;
        }
        DRh dRh = new DRh(this);
        this.A0I = dRh;
        this.A09 = true;
        C0Ad.A0B(this, dRh);
        this.A09 = false;
    }

    public static int A00(RCTextView rCTextView, int i, int i2) {
        float paragraphLeft;
        float lineMax;
        int i3 = (int) (i2 - rCTextView.A01);
        int i4 = (int) (i - rCTextView.A00);
        int lineForVertical = rCTextView.A06.getLineForVertical(i3);
        Layout.Alignment alignment = rCTextView.A06.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = rCTextView.A06;
        if (alignment == alignment2) {
            paragraphLeft = layout.getLineLeft(lineForVertical);
            lineMax = rCTextView.A06.getLineRight(lineForVertical);
        } else {
            boolean A1Q = AnonymousClass001.A1Q(layout.getParagraphDirection(lineForVertical), -1);
            Layout layout2 = rCTextView.A06;
            if (A1Q) {
                paragraphLeft = layout2.getWidth() - rCTextView.A06.getLineMax(lineForVertical);
                lineMax = rCTextView.A06.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = layout2.getParagraphLeft(lineForVertical);
                lineMax = rCTextView.A06.getLineMax(lineForVertical);
            }
        }
        float f = i4;
        if (f >= paragraphLeft && f <= lineMax) {
            try {
                return rCTextView.A06.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    public static CharSequence A01(RCTextView rCTextView) {
        CharSequence charSequence = rCTextView.A07;
        return (charSequence == null || charSequence.length() < 1000000) ? rCTextView.A07 : (Character.isHighSurrogate(rCTextView.A07.charAt(999999)) && Character.isLowSurrogate(rCTextView.A07.charAt(DexStore.MS_IN_NS))) ? rCTextView.A07.subSequence(0, 999999) : rCTextView.A07.subSequence(0, DexStore.MS_IN_NS);
    }

    private void A02(int i, int i2) {
        if (Color.alpha(this.A02) != 0) {
            if (this.A04 == i && this.A03 == i2) {
                return;
            }
            this.A04 = i;
            this.A03 = i2;
            Paint paint = this.A0F;
            if (paint == null) {
                paint = DKC.A09();
                this.A0F = paint;
            }
            paint.setColor(this.A02);
            int i3 = this.A0C;
            this.A0F.setPathEffect(i3 != 0 ? new CornerPathEffect(i3) : null);
            this.A0A = true;
            invalidate();
        }
    }

    public static void A03(Canvas canvas, RCTextView rCTextView) {
        Layout layout = rCTextView.A06;
        Path path = null;
        if (rCTextView.A04 != rCTextView.A03 && Color.alpha(rCTextView.A02) != 0) {
            if (rCTextView.A0A) {
                Path path2 = rCTextView.A05;
                if (path2 == null) {
                    path2 = DKC.A0B();
                    rCTextView.A05 = path2;
                }
                rCTextView.A06.getSelectionPath(rCTextView.A04, rCTextView.A03, path2);
                rCTextView.A0A = false;
            }
            path = rCTextView.A05;
        }
        layout.draw(canvas, path, rCTextView.A0F, 0);
    }

    public void A04() {
        this.A07 = null;
        this.A06 = null;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = 0;
        this.A0C = 0;
        this.A0E = null;
        this.A0D = 0;
        ImageSpan[] imageSpanArr = this.A0H;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Drawable drawable = this.A0H[i2].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
                i = i2 + 1;
            }
            this.A0H = null;
        }
        this.A0B = null;
        this.A0G = false;
        setContentDescription("");
        DRh dRh = this.A0I;
        if (dRh != null) {
            dRh.A0e();
        }
    }

    public void A05(EqR eqR) {
        Fz5 fz5 = eqR.A03;
        ColorStateList colorStateList = fz5.A0R;
        this.A07 = eqR.A04;
        this.A06 = eqR.A02;
        this.A00 = eqR.A00;
        this.A01 = eqR.A01;
        this.A02 = fz5.A0A;
        this.A0C = fz5.A0B;
        this.A08 = eqR.A05;
        int i = fz5.A0O;
        if (i != 0) {
            this.A0E = null;
            this.A0D = i;
        } else {
            this.A0E = colorStateList;
            this.A0D = colorStateList.getDefaultColor();
            Layout layout = this.A06;
            if (layout != null) {
                layout.getPaint().setColor(this.A0E.getColorForState(getDrawableState(), this.A0D));
            }
        }
        A02(0, 0);
        ImageSpan[] imageSpanArr = eqR.A07;
        if (imageSpanArr != null) {
            this.A0H = imageSpanArr;
            int length = imageSpanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Drawable drawable = this.A0H[i2].getDrawable();
                drawable.setCallback(this);
                drawable.setVisible(true, false);
            }
        }
        ClickableSpan[] clickableSpanArr = eqR.A06;
        this.A0B = clickableSpanArr;
        this.A0G = clickableSpanArr != null && clickableSpanArr.length > 0;
        String str = eqR.A03.A0Z;
        if (str != null) {
            setContentDescription(str);
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (super.dispatchHoverEvent(r302) != false) goto L8;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = r301
            X.DRh r0 = r0.A0I
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L13
            r0 = r303
            r1 = r302
            boolean r0 = r0.A0p(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L23
        L13:
            r0 = r301
            r1 = r302
            boolean r0 = super.dispatchHoverEvent(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            r304 = r0
        L25:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (super.dispatchKeyEvent(r302) != false) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r302) {
        /*
            r301 = this;
            r0 = r301
            X.DRh r0 = r0.A0I
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L23
            r0 = r301
            android.text.style.ClickableSpan[] r0 = r0.A0B
            r304 = r0
            r0 = r304
            int r0 = r0.length
            r305 = r0
            r0 = r305
            if (r0 <= 0) goto L23
            r0 = r303
            r1 = r302
            boolean r0 = r0.A0o(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L34
        L23:
            r0 = r301
            r1 = r302
            boolean r0 = super.dispatchKeyEvent(r1)
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L37
        L34:
            r0 = 1
            r305 = r0
        L37:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int save;
        super.draw(canvas);
        if (this.A06 != null) {
            boolean z = false;
            if (this.A00 == 0.0f && this.A01 == 0.0f && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                save = 0;
            } else {
                save = canvas.save();
                canvas.translate(this.A00, this.A01);
                canvas.translate(getPaddingLeft(), getPaddingTop());
                z = true;
            }
            CharSequence charSequence = this.A07;
            GDP[] gdpArr = !(charSequence instanceof Spanned) ? new GDP[0] : (GDP[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), GDP.class);
            int length = gdpArr.length;
            if (length == 0) {
                A03(canvas, this);
            } else {
                FrV frU = new FrU(this);
                Spanned spanned = (Spanned) this.A07;
                while (true) {
                    length--;
                    FrV frV = frU;
                    if (length < 0) {
                        break;
                    }
                    GDP gdp = gdpArr[length];
                    spanned.getSpanStart(gdp);
                    spanned.getSpanEnd(gdp);
                    frU = new FrV(frV, gdp, this);
                }
                frU.AOE(canvas);
            }
            if (z) {
                canvas.restoreToCount(save);
            }
        }
    }

    public CharSequence getText() {
        return this.A07;
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = 0FI.A06(-510871704);
        super.onFocusChanged(z, i, rect);
        DRh dRh = this.A0I;
        if (dRh != null && this.A0B.length > 0) {
            dRh.A0m(z, i, rect);
        }
        0FI.A0C(1223856925, A06);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        int A05 = 0FI.A05(-1766223610);
        if (this.A0G) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 3) {
                A02(0, 0);
                onTouchEvent = false;
                i = 1041940516;
            } else {
                int A00 = A00(this, (int) motionEvent.getX(), (int) motionEvent.getY());
                CharSequence charSequence = this.A07;
                if (!(charSequence instanceof Spanned) || A00 < 0 || (clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(A00, A00, ClickableSpan.class)) == null || clickableSpanArr.length <= 0 || (clickableSpan = clickableSpanArr[0]) == null) {
                    A02(0, 0);
                    onTouchEvent = super.onTouchEvent(motionEvent);
                    i = -418670402;
                } else {
                    onTouchEvent = true;
                    if (actionMasked == 1) {
                        A02(0, 0);
                        clickableSpan.onClick(this);
                    } else if (actionMasked == 0) {
                        Spanned spanned = (Spanned) this.A07;
                        A02(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
                    }
                    i = -1360532451;
                }
            }
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -819567802;
        }
        0FI.A0B(i, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        0Cs A01;
        super.setAccessibilityDelegate(accessibilityDelegate);
        0Cs r0 = this.A0I;
        if (r0 == null || this.A09 || (A01 = C0Ad.A01(this)) == r0) {
            return;
        }
        ((DRh) r0).A00 = A01;
        this.A09 = true;
        C0Ad.A0B(this, r0);
        this.A09 = false;
    }
}
