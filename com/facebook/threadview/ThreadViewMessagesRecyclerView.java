package com.facebook.threadview;

import X.0FI;
import X.2qN;
import X.6F2;
import X.6Lx;
import X.7ZH;
import X.AnonymousClass622;
import X.AnonymousClass624;
import X.C04w;
import X.C4Sy;
import X.C5nx;
import X.I2k;
import X.IFU;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.messaging.model.messages.Message;
import com.facebook.widget.recyclerview.BetterRecyclerView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

/* loaded from: ThreadViewMessagesRecyclerView.class */
public class ThreadViewMessagesRecyclerView extends BetterRecyclerView {
    public boolean A00;
    public final C04w A01;

    public ThreadViewMessagesRecyclerView(Context context) {
        super(context);
        this.A01 = new C04w();
        A1N(new 6Lx(this));
        A1F(new 7ZH(this, 1));
    }

    public ThreadViewMessagesRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new C04w();
        A1N(new 6Lx(this));
        A1F(new 7ZH(this, 1));
    }

    public ThreadViewMessagesRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = new C04w();
        A1N(new 6Lx(this));
        A1F(new 7ZH(this, 1));
    }

    public void A1O() {
        C04w c04w = this.A01;
        int A02 = c04w.A02(-1);
        while (true) {
            int i = A02;
            if (i < 0) {
                return;
            }
            IFU.A06((IFU) c04w.A03(i));
            A02 = c04w.A02(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0478, code lost:
    
        if (r328 != null) goto L68;
     */
    @Override // com.facebook.widget.recyclerview.BetterRecyclerView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchDraw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.threadview.ThreadViewMessagesRecyclerView.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-2018736636);
        super.onAttachedToWindow();
        C04w c04w = this.A01;
        int A02 = c04w.A02(-1);
        while (true) {
            int i = A02;
            if (i < 0) {
                0FI.A0C(-437053228, A06);
                return;
            }
            Iterator it = ((IFU) c04w.A03(i)).A0B.iterator();
            while (it.hasNext()) {
                ((I2k) it.next()).A09.A06();
            }
            A02 = c04w.A02(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1759459063);
        super.onDetachedFromWindow();
        C04w c04w = this.A01;
        int A02 = c04w.A02(-1);
        while (true) {
            int i = A02;
            if (i < 0) {
                0FI.A0C(-2069896358, A06);
                return;
            }
            Iterator it = ((IFU) c04w.A03(i)).A0B.iterator();
            while (it.hasNext()) {
                2qN r0 = ((I2k) it.next()).A09;
                r0.A04.invalidateSelf();
                r0.A07();
            }
            A02 = c04w.A02(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-842998612);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A00 = true;
        } else if (actionMasked == 1 && this.A00) {
            C04w c04w = this.A01;
            float f = 0.0f / 0.0f;
            int A02 = c04w.A02(-1);
            while (true) {
                int i = A02;
                if (i < 0) {
                    break;
                }
                IFU ifu = (IFU) c04w.A03(i);
                if (ifu.A01 != null) {
                    Iterator it = ifu.A0B.iterator();
                    while (it.hasNext()) {
                        I2k i2k = (I2k) it.next();
                        int x = (int) motionEvent.getX();
                        int y = (int) motionEvent.getY();
                        Rect bounds = i2k.A09.A04.getBounds();
                        int width = bounds.width();
                        int i2 = i2k.A06;
                        int max = Math.max(width, i2);
                        int max2 = Math.max(bounds.height(), i2);
                        int centerX = bounds.centerX() - (max / 2);
                        int centerY = bounds.centerY() - (max2 / 2);
                        if (x >= centerX && x < centerX + max && y >= centerY && y < centerY + max2) {
                            C4Sy c4Sy = ifu.A01;
                            long j = i2k.A04;
                            6F2 r0 = c4Sy.A00;
                            ImmutableSet immutableSet = 6F2.A4P;
                            ImmutableList immutableList = r0.A0z.A0Q;
                            int size = immutableList.size();
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 >= size) {
                                    break;
                                }
                                AnonymousClass624 anonymousClass624 = (AnonymousClass624) immutableList.get(i4);
                                if (anonymousClass624.AsR() == j && (anonymousClass624 instanceof AnonymousClass622)) {
                                    Message message = ((AnonymousClass622) anonymousClass624).A03;
                                    r0.A0w.A01(new C5nx(message.A1V, message.A1g));
                                    break;
                                }
                                i3 = i4 + 1;
                            }
                            0FI.A0B(2028103068, A05);
                            return true;
                        }
                    }
                }
                A02 = c04w.A02(i);
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        0FI.A0B(-255103561, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            C04w c04w = this.A01;
            int A02 = c04w.A02(-1);
            loop0: while (true) {
                int i = A02;
                if (i < 0) {
                    return false;
                }
                Iterator it = ((IFU) c04w.A03(i)).A0B.iterator();
                while (it.hasNext()) {
                    if (((I2k) it.next()).A09.A04 == drawable) {
                        break loop0;
                    }
                }
                A02 = c04w.A02(i);
            }
        }
        return true;
    }
}
