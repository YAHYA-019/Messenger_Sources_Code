package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;

/* renamed from: X.Jhv, reason: case insensitive filesystem */
/* loaded from: Jhv.class */
public final class C3062Jhv extends 2kG {
    public final /* synthetic */ K87 A02;
    public final Calendar A01 = LBq.A03((Calendar) null);
    public final Calendar A00 = LBq.A03((Calendar) null);

    public C3062Jhv(K87 k87) {
        this.A02 = k87;
    }

    public void A03(Canvas canvas, 2NQ r303, RecyclerView recyclerView) {
        Object obj;
        2Xd r0 = recyclerView.A0C;
        if (r0 instanceof C3055Jho) {
            2XA r02 = recyclerView.A0F;
            if (r02 instanceof GridLayoutManager) {
                C3055Jho c3055Jho = (C3055Jho) r0;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) r02;
                K87 k87 = this.A02;
                Iterator it = AnonymousClass001.A0s().iterator();
                while (it.hasNext()) {
                    C5nf c5nf = (C5nf) it.next();
                    Object obj2 = c5nf.A00;
                    if (obj2 != null && (obj = c5nf.A01) != null) {
                        Calendar calendar = this.A01;
                        calendar.setTimeInMillis(AnonymousClass001.A05(obj2));
                        Calendar calendar2 = this.A00;
                        calendar2.setTimeInMillis(AnonymousClass001.A05(obj));
                        int i = calendar.get(1);
                        K87 k872 = c3055Jho.A00;
                        int i2 = i - k872.A04.A05.A04;
                        int i3 = calendar2.get(1) - k872.A04.A05.A04;
                        View A0c = gridLayoutManager.A0c(i2);
                        View A0c2 = gridLayoutManager.A0c(i3);
                        int i4 = gridLayoutManager.A00;
                        int i5 = i2 / i4;
                        int i6 = i3 / i4;
                        int i7 = i5;
                        while (true) {
                            int i8 = i7;
                            if (i8 <= i6) {
                                if (gridLayoutManager.A0c(gridLayoutManager.A00 * i8) != null) {
                                    canvas.drawRect(i8 == i5 ? JQy.A06(A0c) : 0, r0.getTop() + k87.A05.A07.A00.top, i8 == i6 ? JQy.A06(A0c2) : recyclerView.getWidth(), r0.getBottom() - k87.A05.A07.A00.bottom, k87.A05.A00);
                                }
                                i7 = i8 + 1;
                            }
                        }
                    }
                }
            }
        }
    }
}
