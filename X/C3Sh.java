package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Sh, reason: invalid class name */
/* loaded from: 3Sh.class */
public abstract class C3Sh {
    public static final 25G A00 = new 5B7();

    public static final RenderTreeNode A00(Rect rect, 25P r302, RenderTreeNode renderTreeNode, 25G r304) {
        int B16 = r302.B16();
        return new RenderTreeNode(rect, (B16 == 0 && r302.B18() == 0 && r302.B17() == 0 && r302.B15() == 0) ? null : new Rect(B16, r302.B18(), r302.B17(), r302.B15()), renderTreeNode, r304, r302.AtS(), renderTreeNode != null ? ((List) renderTreeNode.A08.getValue()).size() : 0);
    }

    public static final void A01(Context context, 25P r302, RenderTreeNode renderTreeNode, ArrayList arrayList, List list, int i, int i2) {
        int i3 = i2;
        int i4 = i;
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (r302 != null) {
            Rect rect = new Rect(i, i2, r302.getWidth() + i, r302.getHeight() + i2);
            int i5 = renderTreeNode.A00 + i;
            int i6 = renderTreeNode.A01 + i2;
            int size = arrayList.size();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    3A0 r0 = (C23e) pair.first;
                    if ((r0 instanceof 3A0) && r0.A00 != null) {
                        C3bx c3bx = (C3bx) pair.second;
                        if (size != 0 && c3bx != null) {
                            new Rect(i5, i6, rect.width() + i5, rect.height() + i6);
                            25G B6y = r302.B6y();
                            if (B6y != null && B6y.A0F()) {
                                c3bx.A00.add(Long.valueOf(B6y.A0I()));
                            }
                        }
                    }
                }
            }
            25G B6y2 = r302.B6y();
            if (B6y2 != null) {
                int AcW = r302.AcW();
                RenderTreeNode A002 = A00(rect, r302, renderTreeNode2, B6y2);
                arrayList.add(A002);
                List list2 = (List) renderTreeNode2.A08.getValue();
                if (AcW > 0) {
                    list2.add(A002);
                    renderTreeNode2 = A002;
                } else {
                    list2.add(A002);
                }
                i4 = 0;
                i3 = 0;
            }
            int AcW2 = r302.AcW();
            for (int i7 = 0; i7 < AcW2; i7++) {
                A01(context, r302.AcN(i7), renderTreeNode2, arrayList, list, r302.BL7(i7) + i4, r302.BLJ(i7) + i3);
            }
        }
    }
}
