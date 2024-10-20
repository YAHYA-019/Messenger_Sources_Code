package X;

import android.graphics.Rect;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.TestItem;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.39z, reason: invalid class name */
/* loaded from: 39z.class */
public final class C39z extends C1sS {
    public C23N A00;
    public final C1rF A01;
    public final java.util.Map A02;

    public C39z(C1rF c1rF) {
        11T.A0F(c1rF, 1);
        this.A01 = c1rF;
        this.A02 = AnonymousClass001.A0u();
    }

    @Override // X.C1sS
    public /* bridge */ /* synthetic */ void A0C(Rect rect, 1sX r303, Object obj) {
        this.A00 = (C23N) obj;
    }

    @Override // X.C1sS
    public void A0D(1sX r302) {
        3Lb r0;
        java.util.Map map = this.A02;
        map.clear();
        C23N c23n = this.A00;
        if (c23n != null) {
            List list = c23n.A0R;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    List list2 = c23n.A0R;
                    if (list2 != null && (r0 = (3Lb) list2.get(i)) != null) {
                        long j = r0.A00;
                        TestItem testItem = new TestItem();
                        C23N c23n2 = this.A00;
                        ComponentHost componentHost = null;
                        if (c23n2 != null) {
                            int i2 = 0;
                            int size2 = c23n2.A0Q.size();
                            while (true) {
                                if (i2 >= size2) {
                                    break;
                                }
                                RenderTreeNode renderTreeNode = (RenderTreeNode) c23n2.A0Q.get(i2);
                                if (renderTreeNode.A06.A0I() == r0.A00) {
                                    RenderTreeNode renderTreeNode2 = renderTreeNode.A05;
                                    if (renderTreeNode2 != null) {
                                        2JG r02 = (2JG) this.A01.A06.A05(renderTreeNode2.A06.A0I());
                                        componentHost = (ComponentHost) (r02 != null ? r02.A04 : null);
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                        testItem.A00 = componentHost;
                        Rect rect = r0.A02;
                        11T.A0F(rect, 0);
                        testItem.A03.set(rect);
                        testItem.A02 = r0.A01;
                        2JG r03 = (2JG) this.A01.A06.A05(j);
                        testItem.A01 = r03 != null ? r03.A04 : null;
                        Deque deque = (Deque) map.get(r0.A01);
                        if (deque == null) {
                            deque = new LinkedList();
                        }
                        deque.add(testItem);
                        map.put(r0.A01, deque);
                    }
                }
            }
        }
    }
}
