package com.facebook.rendercore;

import X.11T;
import X.1BK;
import X.25G;
import X.2AS;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C29h;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: RenderTreeNode.class */
public final class RenderTreeNode {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Rect A03;
    public final Rect A04;
    public final RenderTreeNode A05;
    public final 25G A06;
    public final Object A07;
    public final C01i A08;

    public RenderTreeNode(Rect rect, Rect rect2, RenderTreeNode renderTreeNode, 25G r305, Object obj, int i) {
        this.A05 = renderTreeNode;
        this.A06 = r305;
        this.A07 = obj;
        this.A03 = rect;
        this.A04 = rect2;
        this.A02 = i;
        int i2 = 0;
        this.A00 = (renderTreeNode != null ? renderTreeNode.A00 : 0) + rect.left;
        this.A01 = (renderTreeNode != null ? renderTreeNode.A01 : i2) + rect.top;
        this.A08 = C01g.A00(C03i.A02, C29h.A00);
    }

    public final String A00(2AS r302) {
        25G r0 = this.A06;
        long A0I = r0.A0I();
        String A07 = r0.A07();
        int A03 = r302 != null ? AnonymousClass001.A03(r302.A02.A06(-1, A0I)) : -1;
        String shortString = this.A03.toShortString();
        11T.A0A(shortString);
        int size = ((List) this.A08.getValue()).size();
        RenderTreeNode renderTreeNode = this.A05;
        return 1BK.A15(Locale.US, "Id=%d; renderUnit='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", Arrays.copyOf(new Object[]{Long.valueOf(A0I), A07, Integer.valueOf(A03), Integer.valueOf(this.A02), shortString, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(size), Long.valueOf(renderTreeNode != null ? renderTreeNode.A06.A0I() : -1)}, 9));
    }

    public final void A01(Rect rect) {
        int i = this.A00;
        rect.left = i;
        int i2 = this.A01;
        rect.top = i2;
        Rect rect2 = this.A03;
        rect.right = i + rect2.width();
        rect.bottom = i2 + rect2.height();
    }
}
