package com.google.android.material.datepicker;

import X.0FI;
import X.0V5;
import X.1BK;
import X.4YV;
import X.AnonymousClass001;
import X.C0Ad;
import X.C2957Jek;
import X.C5nf;
import X.JQy;
import X.JYV;
import X.JgQ;
import X.Km4;
import X.LBq;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: MaterialCalendarGridView.class */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar A00;
    public final boolean A01;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = LBq.A03((Calendar) null);
        Context context2 = getContext();
        if (JgQ.A08(context2, R.attr.windowFullscreen)) {
            setNextFocusLeftId(2131362859);
            setNextFocusRightId(2131363265);
        }
        this.A01 = JgQ.A08(context2, 2130971210);
        C0Ad.A0B(this, new C2957Jek(this, 3));
    }

    public JYV A00() {
        return super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ ListAdapter getAdapter() {
        return super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ ListAdapter getAdapter2() {
        return super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(331470910);
        super.onAttachedToWindow();
        0V5.A00((BaseAdapter) super.getAdapter(), -1683200808);
        0FI.A0C(1802301946, A06);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object obj;
        int A01;
        int A06;
        int A012;
        int A062;
        int i;
        int i2;
        super.onDraw(canvas);
        JYV adapter = super.getAdapter();
        Km4 km4 = adapter.A00;
        Month month = adapter.A04;
        Long A02 = adapter.A02(month.A01());
        int A013 = month.A01();
        int i3 = month.A01;
        Long A022 = adapter.A02((A013 + i3) - 1);
        Iterator it = AnonymousClass001.A0s().iterator();
        while (it.hasNext()) {
            C5nf c5nf = (C5nf) it.next();
            Object obj2 = c5nf.A00;
            if (obj2 != null && (obj = c5nf.A01) != null) {
                long A05 = AnonymousClass001.A05(obj2);
                long A052 = AnonymousClass001.A05(obj);
                if (A02 != null && A022 != null) {
                    long longValue = A022.longValue();
                    if (A05 <= longValue) {
                        long longValue2 = A02.longValue();
                        if (A052 >= longValue2) {
                            boolean A1U = 4YV.A1U(getLayoutDirection());
                            if (A05 < longValue2) {
                                A01 = month.A01();
                                if (A01 % month.A02 == 0) {
                                    A06 = 0;
                                } else {
                                    View childAt = getChildAt(A01 - 1);
                                    A06 = !A1U ? childAt.getRight() : childAt.getLeft();
                                }
                            } else {
                                this.A00.setTimeInMillis(A05);
                                A01 = month.A01() + (r0.get(5) - 1);
                                A06 = JQy.A06(getChildAt(A01));
                            }
                            if (A052 > longValue) {
                                A012 = Math.min((month.A01() + i3) - 1, getChildCount() - 1);
                                if ((A012 + 1) % month.A02 == 0) {
                                    A062 = getWidth();
                                } else {
                                    View childAt2 = getChildAt(A012);
                                    A062 = !A1U ? childAt2.getRight() : childAt2.getLeft();
                                }
                            } else {
                                this.A00.setTimeInMillis(A052);
                                A012 = month.A01() + (r0.get(5) - 1);
                                A062 = JQy.A06(getChildAt(A012));
                            }
                            int itemId = (int) adapter.getItemId(A012);
                            for (int itemId2 = (int) adapter.getItemId(A01); itemId2 <= itemId; itemId2++) {
                                int numColumns = getNumColumns() * itemId2;
                                int numColumns2 = (getNumColumns() + numColumns) - 1;
                                View childAt3 = getChildAt(numColumns);
                                int top = childAt3.getTop();
                                Rect rect = km4.A01.A00;
                                int i4 = top + rect.top;
                                int bottom = childAt3.getBottom() - rect.bottom;
                                if (A1U) {
                                    i = A062;
                                    if (A012 > numColumns2) {
                                        i = 0;
                                    }
                                    if (numColumns <= A01) {
                                        i2 = A06;
                                    }
                                    i2 = getWidth();
                                } else {
                                    i = A06;
                                    if (numColumns > A01) {
                                        i = 0;
                                    }
                                    if (A012 <= numColumns2) {
                                        i2 = A062;
                                    }
                                    i2 = getWidth();
                                }
                                canvas.drawRect(i, i4, i2, bottom, km4.A00);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        boolean z2;
        int A01;
        int A06 = 0FI.A06(-1236514159);
        if (z) {
            if (i == 33) {
                Month month = super.getAdapter().A04;
                A01 = (month.A01() + month.A01) - 1;
            } else if (i == 130) {
                A01 = super.getAdapter().A04.A01();
            } else {
                z2 = true;
            }
            setSelection(A01);
            0FI.A0C(-668309057, A06);
        }
        z2 = false;
        super.onFocusChanged(z2, i, rect);
        0FI.A0C(-668309057, A06);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() != -1 && getSelectedItemPosition() < super.getAdapter().A04.A01()) {
            if (19 != i) {
                return false;
            }
            setSelection(super.getAdapter().A04.A01());
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.A01) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, (-1) << (-1)));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
        setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public final void setAdapter2(ListAdapter listAdapter) {
        if (!(listAdapter instanceof JYV)) {
            throw 1BK.A0f("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), JYV.class.getCanonicalName()});
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < super.getAdapter().A04.A01()) {
            i = super.getAdapter().A04.A01();
        }
        super.setSelection(i);
    }
}
