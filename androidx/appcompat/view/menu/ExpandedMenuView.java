package androidx.appcompat.view.menu;

import X.0FI;
import X.53Z;
import X.DKD;
import X.GOn;
import X.LQD;
import X.LQF;
import X.MDt;
import X.MDu;
import X.MKp;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: ExpandedMenuView.class */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, MDt, MDu {
    public static final int[] A01;
    public LQD A00;

    static {
        int[] A1b = GOn.A1b();
        A1b[0] = 16842964;
        A1b[1] = 16843049;
        A01 = A1b;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        53Z A0D = DKD.A0D(context, attributeSet, A01, i, 0);
        TypedArray typedArray = A0D.A02;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A0D.A01(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A0D.A01(1));
        }
        typedArray.recycle();
    }

    @Override // X.MDu
    public void BPG(LQD lqd) {
        this.A00 = lqd;
    }

    @Override // X.MDt
    public boolean BQD(LQF lqf) {
        return this.A00.A0J(lqf, (MKp) null, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1976257305);
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
        0FI.A0C(-1898944034, A06);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        BQD((LQF) getAdapter().getItem(i));
    }
}
