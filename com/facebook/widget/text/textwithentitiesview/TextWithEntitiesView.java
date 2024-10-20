package com.facebook.widget.text.textwithentitiesview;

import X.0Cs;
import X.0FI;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Du;
import X.2JX;
import X.2JY;
import X.AbG;
import X.AbH;
import X.AnonymousClass524;
import X.C00i;
import X.C0Ad;
import X.C1oo;
import X.DNx;
import X.DNy;
import X.DRi;
import X.EC4;
import X.ERd;
import X.Exv;
import X.FAi;
import X.G6c;
import X.GGb;
import X.GMA;
import X.QWP;
import X.QWQ;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.widget.text.BetterTextView;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: TextWithEntitiesView.class */
public class TextWithEntitiesView extends BetterTextView implements CallerContextable {
    public int A00;
    public DNx A01;
    public C00i A02;
    public C00i A03;
    public boolean A04;
    public EC4 A05;
    public final int A06;
    public static final Comparator A08 = new G6c(20);
    public static final CallerContext A07 = CallerContext.A06(TextWithEntitiesView.class);

    public TextWithEntitiesView(Context context) {
        this(context, null, 0);
    }

    public TextWithEntitiesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextWithEntitiesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = false;
        this.A03 = AbH.A0D();
        this.A02 = 1BQ.A02(99558);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2i);
        obtainStyledAttributes.getColor(2, getCurrentTextColor());
        this.A00 = obtainStyledAttributes.getColor(0, getContext().getColor(2132214189));
        this.A06 = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
    }

    private void A00(Spannable spannable, int i, int i2) {
        spannable.setSpan(new ForegroundColorSpan(this.A00), i, i2, 18);
        int i3 = this.A06;
        if (i3 >= 0) {
            spannable.setSpan(new StyleSpan(i3), i, i2, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01() {
        0Cs dRi = new DRi(this);
        dRi.A00 = this;
        dRi.A00 = this;
        DRi.A04 = -1;
        ((DRi) dRi).A00 = false;
        this.A05 = dRi;
        C0Ad.A0B(this, dRi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A02(GMA gma) {
        int i;
        int i2;
        gma.getClass();
        String A0i = ((2JY) gma).A0i();
        A0i.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0i);
        ImmutableList B5l = gma.B5l();
        if (!B5l.isEmpty()) {
            1Du it = B5l.iterator();
            while (it.hasNext()) {
                2JX A0D = AbG.A0D(it);
                Exv A01 = FAi.A01(A0D, A0i);
                2JX A0L = 1BL.A0L(A0D, -1298275357, 2012351341);
                if (A0L != null) {
                    String A0m = A0L.A0m();
                    if (!Platform.stringIsNullOrEmpty(A0m)) {
                        i = A01.A01;
                        i2 = i + A01.A00;
                        spannableStringBuilder.setSpan(new QWQ(this, A0m), i, i2, 18);
                        A00(spannableStringBuilder, i, i2);
                    }
                }
                i = A01.A01;
                i2 = i + A01.A00;
                A00(spannableStringBuilder, i, i2);
            }
        }
        setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A03(GMA gma, GGb gGb) {
        LinkMovementMethod linkMovementMethod;
        ImmutableList B5l = gma.B5l();
        boolean isEmpty = B5l.isEmpty();
        2JY r0 = (2JY) gma;
        if (isEmpty) {
            setText(r0.A0i());
            linkMovementMethod = null;
        } else {
            String A0i = r0.A0i();
            SpannableString valueOf = SpannableString.valueOf(A0i);
            ArrayList A17 = 1BK.A17(B5l);
            Collections.sort(A17, A08);
            Iterator it = A17.iterator();
            while (it.hasNext()) {
                2JX A0D = AbG.A0D(it);
                2JX A0L = 1BL.A0L(A0D, -1298275357, 2012351341);
                if (A0L != null && A0L.getTypeName() != null) {
                    try {
                        Exv A01 = FAi.A01(A0D, A0i);
                        int i = A01.A01;
                        int i2 = i + A01.A00;
                        valueOf.setSpan(new QWP(A0L, gGb), i, i2, 18);
                        A00(valueOf, i, i2);
                    } catch (ERd e) {
                        0fH.A0w("TextWithEntitiesView", e.getMessage(), e);
                    }
                }
            }
            setText(valueOf);
            linkMovementMethod = DNy.A00;
            if (linkMovementMethod == null) {
                linkMovementMethod = new LinkMovementMethod();
                DNy.A00 = linkMovementMethod;
            }
        }
        setMovementMethod(linkMovementMethod);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0250, code lost:
    
        if (r0 != 15) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(com.facebook.graphql.model.GraphQLTextWithEntities r302, float r303) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.widget.text.textwithentitiesview.TextWithEntitiesView.A04(com.facebook.graphql.model.GraphQLTextWithEntities, float):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.text.BetterTextView, com.facebook.resources.ui.FbTextView
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1822698873);
        super.onAttachedToWindow();
        this.A04 = true;
        DNx dNx = this.A01;
        if (dNx != null) {
            dNx.A05(this);
        }
        0FI.A0C(-1453411180, A06);
    }

    @Override // com.facebook.widget.text.BetterTextView, com.facebook.resources.ui.FbTextView
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1016064172);
        this.A04 = false;
        DNx dNx = this.A01;
        if (dNx != null) {
            if (this == dNx.A01) {
                dNx.A01 = null;
            }
            dNx.A04();
        }
        super.onDetachedFromWindow();
        0FI.A0C(1063532413, A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.text.BetterTextView
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.A04 = true;
        DNx dNx = this.A01;
        if (dNx != null) {
            dNx.A05(this);
        }
    }

    @Override // com.facebook.widget.text.BetterTextView
    public void onStartTemporaryDetach() {
        this.A04 = false;
        DNx dNx = this.A01;
        if (dNx != null) {
            if (this == dNx.A01) {
                dNx.A01 = null;
            }
            dNx.A04();
        }
        super.onStartTemporaryDetach();
    }

    @Override // com.facebook.widget.text.BetterTextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        DNx dNx = this.A01;
        if (dNx != null) {
            if (this == dNx.A01) {
                dNx.A01 = null;
            }
            dNx.A04();
        }
        this.A01 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.widget.text.BetterTextView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = 0FI.A05(1628336431);
        if (this.A05 != null) {
            if (getLayout() == null) {
                onTouchEvent = false;
                i = 92433979;
                0FI.A0B(i, A05);
                return onTouchEvent;
            }
            if (AnonymousClass524.A00(getContext()) && motionEvent.getAction() != 1) {
                this.A05.A0s();
            }
        }
        onTouchEvent = super.onTouchEvent(motionEvent);
        i = -599668142;
        0FI.A0B(i, A05);
        return onTouchEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        EC4 ec4 = this.A05;
        if (ec4 == null || i != 16) {
            return super/*android.view.View*/.performAccessibilityAction(i, bundle);
        }
        ec4.A0s();
        return true;
    }
}
