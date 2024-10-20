package com.facebook.messaging.tabbedpager;

import X.0S2;
import X.AnonymousClass001;
import X.C0et;
import X.C1u2;
import X.DKC;
import X.GWV;
import X.GY7;
import X.H4z;
import X.IaE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.AutoMeasureLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ui.emoji.model.EmojiSet;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.CustomViewPager;
import com.google.common.collect.ImmutableList;

/* loaded from: TabbedPager.class */
public class TabbedPager extends CustomLinearLayout {
    public int A00;
    public View A01;
    public ImageButton A02;
    public TextView A03;
    public AutoMeasureLinearLayoutManager A04;
    public RecyclerView A05;
    public C0et A06;
    public C1u2 A07;
    public IaE A08;
    public GWV A09;
    public TabbedPageIndicator A0A;
    public GY7 A0B;
    public CustomViewPager A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public View A0H;
    public ViewGroup A0I;
    public ImageButton A0J;
    public TextView A0K;
    public TextView A0L;

    public TabbedPager(Context context) {
        super(context);
        this.A00 = -1;
        A03(context, null);
    }

    public TabbedPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = -1;
        A03(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x019a, code lost:
    
        if (r0.getBoolean(5, false) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0054, code lost:
    
        if (r0.getBoolean(3, false) == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v71, types: [androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AutoMeasureLinearLayoutManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A03(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.tabbedpager.TabbedPager.A03(android.content.Context, android.util.AttributeSet):void");
    }

    public static void A04(TabbedPager tabbedPager) {
        if (tabbedPager.A0G) {
            return;
        }
        TabbedPageIndicator tabbedPageIndicator = tabbedPager.A0A;
        tabbedPageIndicator.A03 = tabbedPager.A05.getLeft();
        tabbedPageIndicator.invalidate();
        TabbedPageIndicator tabbedPageIndicator2 = tabbedPager.A0A;
        tabbedPageIndicator2.A04 = tabbedPager.getWidth() - tabbedPager.A05.getRight();
        tabbedPageIndicator2.invalidate();
    }

    public static void A05(TabbedPager tabbedPager, int i) {
        View childAt;
        float A1j;
        int i2;
        if (tabbedPager.A05.getChildCount() != 0) {
            int i3 = i - 1;
            if (tabbedPager.A04.A1h() >= i3) {
                childAt = tabbedPager.A05.getChildAt(0);
                A1j = (tabbedPager.A04.A1h() * childAt.getWidth()) - childAt.getLeft();
                i2 = Math.max(i3, 0);
            } else {
                int i4 = i + 1;
                if (tabbedPager.A04.A1j() > i4 || tabbedPager.A04.A1j() >= tabbedPager.A0B.A01.size()) {
                    return;
                }
                int min = Math.min(i4, DKC.A06(tabbedPager.A0B.A01));
                childAt = tabbedPager.A05.getChildAt(r0.getChildCount() - 1);
                A1j = ((tabbedPager.A04.A1j() * childAt.getWidth()) + tabbedPager.A05.getWidth()) - childAt.getLeft();
                i2 = min + 1;
            }
            tabbedPager.A05.A11((int) ((i2 * childAt.getWidth()) - A1j), 0);
        }
    }

    public static void A06(TabbedPager tabbedPager, int i) {
        H4z h4z;
        ImmutableList immutableList = tabbedPager.A0B.A01;
        if (i < 0 || i >= immutableList.size()) {
            i = 0;
        }
        int i2 = tabbedPager.A00;
        if (i != i2) {
            if (i2 >= 0 && i2 < immutableList.size()) {
                immutableList.get(tabbedPager.A00);
            }
            tabbedPager.A00 = i;
            IaE iaE = tabbedPager.A08;
            EmojiSet emojiSet = (EmojiSet) immutableList.get(i);
            iaE.A07.A00("Tab switched", 0S2.A15);
            iaE.A03 = String.valueOf(emojiSet.A01);
            boolean A00 = emojiSet.A00();
            iaE.A04 = A00;
            if (A00 && (h4z = iaE.A01) != null && h4z.A05 != null) {
                H4z.A00(h4z, h4z.A08.A00);
            }
            tabbedPager.A0C.A0Q(i, false);
            int A1h = tabbedPager.A04.A1h();
            for (int i3 = 0; i3 < tabbedPager.A05.getChildCount(); i3++) {
                tabbedPager.A05.getChildAt(i3).setSelected(AnonymousClass001.A1Q(A1h + i3, tabbedPager.A00));
            }
            A05(tabbedPager, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0E(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            X.GY7 r0 = r0.A0B
            r303 = r0
            r0 = r303
            X.JLC r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L51
            r0 = 0
            r305 = r0
        L11:
            r0 = r303
            com.google.common.collect.ImmutableList r0 = r0.A01
            r304 = r0
            r0 = r304
            int r0 = r0.size()
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 >= r1) goto L51
            r0 = r303
            com.google.common.collect.ImmutableList r0 = r0.A01
            r1 = r305
            java.lang.Object r0 = r0.get(r1)
            r307 = r0
            r0 = r303
            X.JLC r0 = r0.A00
            r1 = r307
            java.lang.String r0 = r0.Apn(r1)
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L54
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            goto L11
        L51:
            r0 = -1
            r305 = r0
        L54:
            r0 = r301
            X.GWV r0 = r0.A09
            r304 = r0
            r0 = r304
            r1 = r302
            r0.A03 = r1
            r0 = r305
            if (r0 < 0) goto L69
            r0 = r301
            r1 = r305
            A06(r0, r1)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.tabbedpager.TabbedPager.A0E(java.lang.String):void");
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        A04(this);
    }
}
