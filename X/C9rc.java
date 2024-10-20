package X;

import android.graphics.Point;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Iterator;

/* renamed from: X.9rc, reason: invalid class name */
/* loaded from: 9rc.class */
public final class C9rc implements JKw {
    public Point A00 = new Point(0, 0);
    public final ThreadKey A01;
    public final boolean A02;
    public final /* synthetic */ C6s5 A03;

    public C9rc(ThreadKey threadKey, C6s5 c6s5) {
        this.A03 = c6s5;
        this.A01 = threadKey;
        boolean z = false;
        int i = C6s5.A0g;
        this.A02 = 4YU.A0B(c6s5.A0Q).orientation == 2 ? true : z;
    }

    @Override // X.JKw
    public void AND(float f, float f2) {
        this.A00 = new Point((int) f, (int) f2);
    }

    @Override // X.JKw
    public void ANE(float f, float f2) {
        Point point = this.A00;
        int i = point.x;
        int i2 = (int) f;
        if (i == i2 && point.y == ((int) f2)) {
            return;
        }
        C6s5 c6s5 = this.A03;
        int i3 = C6s5.A0g;
        C9ah c9ah = (C9ah) 1Br.A0B(c6s5.A0T);
        String A0y = 4YU.A0y(this.A01);
        DraggableViewContainer draggableViewContainer = c6s5.A06;
        c9ah.A00(A0y, C6s5.A02(draggableViewContainer != null ? draggableViewContainer.A0B : null), null, this.A02);
        this.A00 = new Point(i2, (int) f2);
    }

    @Override // X.JKw
    public void ANF() {
        C6s5 c6s5 = this.A03;
        int i = C6s5.A0g;
        C9a3 c9a3 = c6s5.A0J;
        if (c9a3 != null) {
            8LK A00 = C9mF.A00(c9a3.A06.A01, null, null, 0L);
            7Ri r0 = (7Ri) c6s5.A0d.getValue();
            if (r0 != null) {
                r0.A02(A00);
            }
        }
        C9ah c9ah = (C9ah) 1Br.A0B(c6s5.A0T);
        String A0y = 4YU.A0y(this.A01);
        DraggableViewContainer draggableViewContainer = c6s5.A06;
        c9ah.A00(A0y, C6s5.A02(draggableViewContainer != null ? draggableViewContainer.A0B : null), "long", this.A02);
    }

    @Override // X.JKw
    public void ANH() {
        C6s5 c6s5 = this.A03;
        int i = C6s5.A0g;
        C9kz c9kz = c6s5.A0K;
        if (c9kz != null) {
            82V r0 = c9kz.A00;
            82V r02 = new 82V(r0.A00, 1, r0.A03, r0.A02, !r0.A01);
            c9kz.A00 = r02;
            C5jn c5jn = c9kz.A01;
            if (c5jn != null) {
                c5jn.A00(r02);
            }
            Iterator it = c9kz.A05.iterator();
            while (it.hasNext()) {
                C6s5.A03(((C6s7) it.next()).A00, c9kz.A00.A01);
            }
        }
        C9ah c9ah = (C9ah) 1Br.A0B(c6s5.A0T);
        String A0y = 4YU.A0y(this.A01);
        DraggableViewContainer draggableViewContainer = c6s5.A06;
        c9ah.A00(A0y, C6s5.A02(draggableViewContainer != null ? draggableViewContainer.A0B : null), "short", this.A02);
    }
}
