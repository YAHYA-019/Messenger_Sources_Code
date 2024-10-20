package com.facebook.messaging.ui.text;

import X.0FI;
import X.11T;
import X.1BK;
import X.1JF;
import X.AnonymousClass001;
import X.DKD;
import X.DKE;
import X.DKF;
import X.DKG;
import X.EXt;
import X.Eid;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MultilineEllipsizeTextView.class */
public final class MultilineEllipsizeTextView extends View {
    public int A00;
    public Typeface A01;
    public TextPaint A02;
    public Eid A03;
    public CharSequence A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public Eid A0F;
    public final int A0G;
    public final boolean A0H;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultilineEllipsizeTextView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultilineEllipsizeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultilineEllipsizeTextView(android.content.Context r302, android.util.AttributeSet r303, int r304) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.ui.text.MultilineEllipsizeTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ MultilineEllipsizeTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r320v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r320v1 */
    /* JADX WARN: Type inference failed for: r320v3, types: [java.util.AbstractCollection] */
    private final Eid A00(int i) {
        List<CharSequence> emptyList;
        int lineEnd;
        A01();
        int max = (int) Math.max(0.0d, i - DKE.A07(this));
        CharSequence charSequence = this.A04;
        TextPaint textPaint = this.A02;
        int i2 = this.A09;
        int i3 = this.A0B;
        int i4 = 1;
        if (charSequence == null || charSequence.length() == 0 || max < 0) {
            emptyList = Collections.emptyList();
            11T.A0A((Object) emptyList);
        } else {
            if (textPaint == null) {
                textPaint = new TextPaint();
            }
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.A0H);
            int lineCount = staticLayout.getLineCount();
            i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (true) {
                if (i5 >= lineCount) {
                    i4 = i6;
                    break;
                }
                int paragraphDirection = staticLayout.getParagraphDirection(i5);
                if (i5 != 0) {
                    if (i6 != paragraphDirection) {
                        break;
                    }
                } else {
                    i6 = paragraphDirection;
                }
                i5++;
            }
            emptyList = AnonymousClass001.A0s();
            int i7 = 0;
            for (int i8 = i2; i8 > 0; i8--) {
                if (i7 >= staticLayout.getLineCount()) {
                    break;
                }
                int lineStart = staticLayout.getLineStart(i7);
                if (lineStart >= charSequence.length()) {
                    break;
                }
                if (i7 >= i2 - 1 && i4 != 0) {
                    int i9 = lineStart;
                    while (true) {
                        lineEnd = i9;
                        if (lineEnd >= charSequence.length() || charSequence.charAt(lineEnd) == '\n') {
                            break;
                        }
                        i9 = lineEnd + 1;
                    }
                } else {
                    lineEnd = staticLayout.getLineEnd(i7);
                    if (charSequence.charAt(lineEnd - 1) == '\n') {
                        lineEnd--;
                    }
                }
                CharSequence subSequence = charSequence.subSequence(lineStart, lineEnd);
                if ((charSequence instanceof Spannable) && (subSequence instanceof Spannable)) {
                    Spanned spanned = (Spanned) charSequence;
                    Spannable spannable = (Spannable) subSequence;
                    Object[] spans = spanned.getSpans(lineStart, lineEnd, StyleSpan.class);
                    11T.A0A(spans);
                    StyleSpan[] styleSpanArr = (StyleSpan[]) spans;
                    int length = styleSpanArr.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = i10;
                        if (i11 < length) {
                            StyleSpan styleSpan = styleSpanArr[i11];
                            int spanStart = spanned.getSpanStart(styleSpan);
                            int spanEnd = spanned.getSpanEnd(styleSpan);
                            spannable.setSpan(new StyleSpan(styleSpan.getStyle()), (int) Math.max(0.0d, spanStart - lineStart), (int) Math.min(subSequence.length(), spanEnd - lineStart), 17);
                            i10 = i11 + 1;
                        }
                    }
                }
                emptyList.add(subSequence);
                i7++;
            }
            while (emptyList.size() < i3) {
                emptyList.add("");
            }
        }
        TextPaint textPaint2 = this.A02;
        if (textPaint2 == null) {
            textPaint2 = new TextPaint();
        }
        boolean z = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (CharSequence charSequence2 : emptyList) {
            if (!z) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            spannableStringBuilder.append(1JF.A03(charSequence2, false));
            z = false;
        }
        return new Eid(new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint2, i4 == 0 ? max : 16384, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.A0H, TextUtils.TruncateAt.END, max), i4);
    }

    private final void A01() {
        if (this.A02 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.A02 = textPaint;
            textPaint.density = DKD.A09(this).density;
            TextPaint textPaint2 = this.A02;
            if (textPaint2 != null) {
                textPaint2.setTextSize(this.A05);
            }
            TextPaint textPaint3 = this.A02;
            if (textPaint3 != null) {
                textPaint3.setColor(this.A0C);
            }
            TextPaint textPaint4 = this.A02;
            if (textPaint4 == null) {
                throw 1BK.A0h();
            }
            Typeface typeface = this.A01;
            EXt.A00(typeface, textPaint4, this.A00);
            TextPaint textPaint5 = this.A02;
            if (textPaint5 != null) {
                textPaint5.setTypeface(typeface);
            }
            TextPaint textPaint6 = this.A02;
            if (textPaint6 != null) {
                textPaint6.setShadowLayer(this.A08, this.A06, this.A07, this.A0E);
            }
        }
    }

    public static final void A02(MultilineEllipsizeTextView multilineEllipsizeTextView) {
        multilineEllipsizeTextView.A03 = null;
        multilineEllipsizeTextView.A0F = null;
        multilineEllipsizeTextView.A0D = -1;
        multilineEllipsizeTextView.requestLayout();
        multilineEllipsizeTextView.invalidate();
    }

    public final int getMaxLines() {
        return this.A09;
    }

    public final int getTextColor() {
        return this.A0C;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        A01();
        if (this.A03 == null) {
            this.A03 = A00(getWidth());
        }
        canvas.save();
        int height = getHeight();
        Eid eid = this.A03;
        if (eid != null) {
            Layout layout = eid.A01;
            canvas.translate(getPaddingLeft(), ((int) Math.max(0.0d, height - layout.getHeight())) / 2);
            int i = eid.A00;
            float f = 0.0f / 0.0f;
            if (i == -1) {
                canvas.translate(-(layout.getWidth() - (getWidth() - DKE.A07(this))), 0.0f);
            }
            layout.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r312 == null) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.ui.text.MultilineEllipsizeTextView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(964646671);
        super.onSizeChanged(i, i2, i3, i4);
        A02(this);
        0FI.A0C(1274342143, A06);
    }

    public final void setMaxLines(int i) {
        this.A09 = i;
        A02(this);
    }

    public final void setTextColor(int i) {
        this.A0C = i;
        TextPaint textPaint = this.A02;
        if (textPaint != null) {
            textPaint.setColor(i);
        }
        invalidate();
    }
}
