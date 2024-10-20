package com.facebook.widget.listview;

import X.0FI;
import X.11T;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1Fo;
import X.2Nn;
import X.AbR;
import X.AnonymousClass001;
import X.C00i;
import X.C0dr;
import X.C1oo;
import X.IL5;
import X.JHI;
import X.JV5;
import X.LKn;
import X.LL7;
import X.Llc;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* loaded from: BetterListView.class */
public class BetterListView extends ListView implements JHI {
    public int A00;
    public int A01;
    public long A02;
    public AbsListView.OnScrollListener A03;
    public C0dr A04;
    public LL7 A05;
    public JV5 A06;
    public Runnable A07;
    public ViewTreeObserver.OnPreDrawListener A08;
    public AbR A09;
    public 2Nn A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C00i A0E;

    public BetterListView(Context context) {
        super(context);
        this.A0E = 1BQ.A02(16501);
        this.A01 = 0;
        this.A0D = true;
        A00(context, null, 0);
    }

    public BetterListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0E = 1BQ.A02(16501);
        this.A01 = 0;
        this.A0D = true;
        A00(context, attributeSet, 0);
    }

    public BetterListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0E = 1BQ.A02(16501);
        this.A01 = 0;
        this.A0D = true;
        A00(context, attributeSet, i);
    }

    private void A00(Context context, AttributeSet attributeSet, int i) {
        this.A05 = (LL7) 1Bn.A0A(131200);
        this.A04 = (C0dr) 1Bi.A03(84492);
        this.A09 = (AbR) 1Bn.A0A(84746);
        super.setOnScrollListener(this.A05);
        this.A03 = new IL5(this, 4);
        this.A07 = new Llc(this);
        this.A08 = new LKn(this, 4);
        this.A0A = new 2Nn();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0C, i, 0);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        setNestedScrollingEnabled(true);
    }

    public void A6u(AbsListView.OnScrollListener onScrollListener) {
        LL7 ll7 = this.A05;
        11T.A0F(onScrollListener, 0);
        ll7.A01.put(onScrollListener, AnonymousClass001.A0K());
    }

    @Override // android.widget.ListView
    public void addHeaderView(View view) {
        addHeaderView(view, null, false);
    }

    @Override // android.widget.ListView
    public void addHeaderView(View view, Object obj, boolean z) {
        if (getAdapter() != null) {
            throw AnonymousClass001.A0N("Phones up until 4.4 may crash if addHeaderView is called after setAdapter.  Keep the header permanently added and use visibility instead");
        }
        super.addHeaderView(view, obj, z);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        if (i >= 0) {
            return super.canScrollVertically(i);
        }
        boolean z = false;
        int paddingTop = getClipToPadding() ? 0 : getPaddingTop();
        if (getChildAt(0) != null && getChildAt(0).getTop() < paddingTop) {
            z = true;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        if (this.A0D) {
            super.dispatchRestoreInstanceState(sparseArray);
        }
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        if (this.A0D) {
            super.dispatchSaveInstanceState(sparseArray);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.A0A.A00();
    }

    @Override // android.widget.AbsListView
    public void handleDataChanged() {
        super.handleDataChanged();
    }

    public boolean isAtBottom() {
        return getChildCount() == 0 || (getLastVisiblePosition() == this.A00 - 1 && getChildAt(getChildCount() - 1).getBottom() <= getHeight());
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.A0B;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        getFirstVisiblePosition();
        getLastVisiblePosition();
        isStackFromBottom();
        super.layoutChildren();
        this.A00 = getCount();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1871302560);
        getViewTreeObserver().addOnPreDrawListener(this.A08);
        super.onAttachedToWindow();
        this.A0B = true;
        ListAdapter adapter = getAdapter();
        if (adapter != null && this.A06 == null) {
            JV5 jv5 = new JV5(this);
            this.A06 = jv5;
            adapter.registerDataSetObserver(jv5);
        }
        0FI.A0C(-1240708457, A06);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        JV5 jv5;
        int A06 = 0FI.A06(2088298725);
        this.A0C = true;
        getViewTreeObserver().removeOnPreDrawListener(this.A08);
        super.onDetachedFromWindow();
        ((1Fo) this.A0E.get()).A01(this);
        this.A0B = false;
        ListAdapter adapter = getAdapter();
        if (adapter != null && (jv5 = this.A06) != null) {
            adapter.unregisterDataSetObserver(jv5);
            this.A06 = null;
        }
        this.A0C = false;
        0FI.A0C(482569917, A06);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(1615667991);
        super.onSizeChanged(i, i2, i3, i4);
        0FI.A0C(1413651264, A06);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = 0FI.A05(-1792070108);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        0FI.A0B(935684481, A05);
        return onTouchEvent;
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView
    public boolean performItemClick(View view, int i, long j) {
        if (this.A0C || !getAdapter().isEnabled(i)) {
            return false;
        }
        return super.performItemClick(view, i, j);
    }

    @Override // android.view.View
    public void restoreHierarchyState(SparseArray sparseArray) {
        super.dispatchRestoreInstanceState(sparseArray);
    }

    @Override // android.view.View
    public void saveHierarchyState(SparseArray sparseArray) {
        super.dispatchSaveInstanceState(sparseArray);
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
        setAdapter(listAdapter);
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public void setAdapter2(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver;
        ListAdapter adapter = getAdapter();
        if (adapter != listAdapter) {
            if (adapter != null && (dataSetObserver = this.A06) != null) {
                adapter.unregisterDataSetObserver(dataSetObserver);
                this.A06 = null;
            }
            if (listAdapter != null && this.A06 == null) {
                JV5 jv5 = new JV5(this);
                this.A06 = jv5;
                listAdapter.registerDataSetObserver(jv5);
            }
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A05.A00 = onScrollListener;
    }
}
