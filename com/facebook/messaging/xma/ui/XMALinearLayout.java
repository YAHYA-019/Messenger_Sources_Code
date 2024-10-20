package com.facebook.messaging.xma.ui;

import X.0FI;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.4YU;
import X.7Wh;
import X.7gW;
import X.C7sh;
import X.DKG;
import X.E2d;
import X.E2e;
import X.E2f;
import X.FkC;
import X.GFC;
import X.HpU;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.messaging.business.attachments.generic.views.PlatformGenericAttachmentItemView;
import com.facebook.messaging.business.vstacked.VStackedCompactItemView;
import com.facebook.widget.CustomLinearLayout;

/* loaded from: XMALinearLayout.class */
public class XMALinearLayout extends CustomLinearLayout implements GFC {
    public 7Wh A00;
    public HpU A01;

    public XMALinearLayout(Context context) {
        super(context);
        A01();
    }

    public XMALinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public XMALinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    private final void A01() {
        HpU hpU = (HpU) 1Bn.A0E(4YU.A08(this), (1BY) null, 67312);
        this.A01 = hpU;
        if (hpU == null) {
            throw 1BK.A0h();
        }
        hpU.A00 = new FkC(this, 2);
    }

    public final void A0E(C7sh c7sh) {
        7Wh r0 = this.A00;
        if (r0 != null) {
            r0.CXA(this, c7sh);
        }
    }

    public void A0F(7Wh r302) {
        if (!(this instanceof 7gW)) {
            if (this instanceof E2e) {
                DKG.A1Q(r302, ((E2e) this).A02);
                return;
            }
            if (this instanceof VStackedCompactItemView) {
                DKG.A1Q(r302, ((VStackedCompactItemView) this).A01);
                return;
            }
            if (this instanceof E2d) {
                DKG.A1Q(r302, ((E2d) this).A02);
                return;
            } else if (this instanceof E2f) {
                DKG.A1Q(r302, ((E2f) this).A05);
                return;
            } else {
                if (this instanceof PlatformGenericAttachmentItemView) {
                    DKG.A1Q(r302, ((PlatformGenericAttachmentItemView) this).A09);
                    return;
                }
                return;
            }
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= getChildCount()) {
                return;
            }
            GFC childAt = getChildAt(i2);
            if (childAt instanceof GFC) {
                childAt.Cwl(r302);
            }
            i = i2 + 1;
        }
    }

    public void Cwl(7Wh r302) {
        this.A00 = r302;
        A0F(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (super.onInterceptTouchEvent(r302) != false) goto L8;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.HpU r0 = r0.A01
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2e
            r0 = r304
            r1 = r302
            boolean r0 = r0.A00(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2a
            r0 = r301
            r1 = r302
            boolean r0 = super.onInterceptTouchEvent(r1)
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L2c
        L2a:
            r0 = 1
            r303 = r0
        L2c:
            r0 = r303
            return r0
        L2e:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.xma.ui.XMALinearLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-1840911823);
        11T.A0F(motionEvent, 0);
        HpU hpU = this.A01;
        if (hpU == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A0B(-1555901936, A05);
            throw A0h;
        }
        if (motionEvent.getAction() == 0) {
            hpU.A01 = false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        0FI.A0B(-1005981838, A05);
        return onTouchEvent;
    }
}
