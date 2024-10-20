package com.facebook.rtc.views.omnigrid;

import X.0FI;
import X.11T;
import X.2XA;
import X.C2626GjK;
import X.DKF;
import X.DKG;
import X.GOp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: OmniGridRecyclerView.class */
public class OmniGridRecyclerView extends RecyclerView {
    public GestureDetector A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OmniGridRecyclerView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OmniGridRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmniGridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
    }

    public /* synthetic */ OmniGridRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        List<C2626GjK> list;
        int i;
        int i2;
        11T.A0F(motionEvent, 0);
        2XA r0 = this.A0F;
        if ((r0 instanceof OmniGridLayoutManager) && motionEvent.getAction() == 0 && (list = ((OmniGridLayoutManager) r0).A07.A01) != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (C2626GjK c2626GjK : list) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i3 = c2626GjK.A01;
                int i4 = c2626GjK.A02;
                if (i3 < i4 && (i = c2626GjK.A03) < (i2 = c2626GjK.A00) && x >= i3 && x < i4 && y >= i && y < i2) {
                    return false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        11T.A0F(motionEvent, 0);
        2XA r0 = this.A0F;
        if (!(r0 instanceof OmniGridLayoutManager)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        OmniGridLayoutManager omniGridLayoutManager = (OmniGridLayoutManager) r0;
        omniGridLayoutManager.A04 = motionEvent;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        omniGridLayoutManager.A04 = null;
        return onInterceptTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int A06 = GOp.A06(motionEvent, 2114564044);
        2XA r0 = this.A0F;
        if (r0 instanceof OmniGridLayoutManager) {
            OmniGridLayoutManager omniGridLayoutManager = (OmniGridLayoutManager) r0;
            omniGridLayoutManager.A04 = motionEvent;
            onTouchEvent = super.onTouchEvent(motionEvent);
            omniGridLayoutManager.A04 = null;
            GestureDetector gestureDetector = this.A00;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        0FI.A0B(2064603857, A06);
        return onTouchEvent;
    }
}
