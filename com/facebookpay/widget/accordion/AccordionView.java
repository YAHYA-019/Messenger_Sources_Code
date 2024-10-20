package com.facebookpay.widget.accordion;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BK;
import X.1Mu;
import X.7zM;
import X.AbstractC3052Jhk;
import X.AnonymousClass001;
import X.C2lb;
import X.Jwz;
import X.KP0;
import X.Kld;
import X.Q3D;
import X.QWp;
import X.RHh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.collect.HashMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: AccordionView.class */
public class AccordionView extends FrameLayout {
    public FrameLayout A00;
    public LinearLayout A01;
    public ConstraintLayout A02;
    public C2lb A03;
    public KP0 A04;
    public Kld A05;
    public RHh A06;
    public Map A07;
    public Function2 A08;
    public boolean A09;
    public final int A0A;
    public final 1Mu A0B;
    public final Map A0C;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0C = 1BK.A1C();
        this.A0B = new HashMultimap();
        this.A0A = context.getResources().getDimensionPixelSize(2132279305);
        View.inflate(context, 2132541984, this);
        setImportantForAccessibility(2);
        this.A00 = (FrameLayout) 7zM.A0H(this, 2131361847);
        this.A01 = (LinearLayout) 7zM.A0H(this, 2131361846);
        this.A02 = (ConstraintLayout) 7zM.A0H(this, 2131361848);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        r306.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r306 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r306 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebookpay.widget.accordion.AccordionView r301, boolean r302) {
        /*
            java.lang.String r0 = "summaryContainer"
            r303 = r0
            java.lang.String r0 = "expandedContainer"
            r304 = r0
            r0 = 8
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L33
            r0 = r301
            android.widget.FrameLayout r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L50
            r0 = r306
            r1 = r305
            r0.setVisibility(r1)
            r0 = r301
            android.widget.LinearLayout r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L57
        L2b:
            r0 = r304
            X.11T.A0L(r0)
        L2f:
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L33:
            r0 = r301
            android.widget.LinearLayout r0 = r0.A01
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L2b
            r0 = r306
            r1 = r305
            r0.setVisibility(r1)
            r0 = r301
            android.widget.FrameLayout r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L57
        L50:
            r0 = r303
            X.11T.A0L(r0)
            goto L2f
        L57:
            r0 = r306
            r1 = 0
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.A00(com.facebookpay.widget.accordion.AccordionView, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r0.getChildCount() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (X.11T.A0O(java.lang.Boolean.valueOf(r309), r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r312 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c7, code lost:
    
        if (r0.A05 == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(boolean r302) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.A01(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c3, code lost:
    
        if (X.1BK.A1X(r0.A0I(), false) != false) goto L40;
     */
    /* JADX WARN: Type inference failed for: r0v150, types: [X.Kle, X.Jx6] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Jwz jwz;
        QWp qWp;
        QWp qWp2;
        int A06 = 0FI.A06(-27158710);
        super.onDetachedFromWindow();
        Collection AQp = this.A0B.AQp();
        11T.A0A(AQp);
        Iterator it = AQp.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            Map map = this.A07;
            if (map == null) {
                11T.A0L("viewBinders");
                throw 0Q8.createAndThrow();
            }
            QWp qWp3 = (AbstractC3052Jhk) map.get(A0z.getKey());
            if ((qWp3 instanceof QWp) && (qWp2 = qWp3) != null) {
                Object value = A0z.getValue();
                11T.A0A(value);
                qWp2.A09((C2lb) value);
            }
            if ((qWp3 instanceof Jwz) && (jwz = (Jwz) qWp3) != null) {
                Object value2 = A0z.getValue();
                11T.A0A(value2);
                Q3D q3d = (Q3D) jwz.A04.get(value2);
                if (q3d != null && (qWp = jwz.A03) != null) {
                    qWp.A09(q3d);
                }
            }
        }
        0FI.A0C(-674520643, A06);
    }
}
