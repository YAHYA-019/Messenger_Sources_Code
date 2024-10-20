package X;

import android.graphics.Point;
import android.view.View;
import com.facebook.messaging.photos.editing.layer.Layer;
import com.google.common.collect.ImmutableList;

/* loaded from: H60.class */
public final class H60 extends IlY {
    public final /* synthetic */ IQ0 A00;

    public H60(IQ0 iq0) {
        this.A00 = iq0;
    }

    public boolean CIl(Ht0 ht0) {
        IQ0 iq0 = this.A00;
        if (iq0.A0F) {
            ImmutableList immutableList = iq0.A0c.A01;
            if (immutableList == null || immutableList.isEmpty()) {
                return false;
            }
            float A00 = ht0.A00();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                Layer A0q = GOn.A0q(it);
                iq0.A0h.get(A0q);
                float f = A0q.A00;
                float min = Math.min(7.5f, Math.max(0.1f, ht0.A00() * f));
                if (min == 0.1f) {
                    A00 = Math.max(A00, min / f);
                } else if (min == 7.5f) {
                    A00 = Math.min(A00, min / f);
                }
            }
            1Du it2 = immutableList.iterator();
            while (it2.hasNext()) {
                Layer A0q2 = GOn.A0q(it2);
                A0q2.A02(A0q2.A00 * A00);
            }
        } else {
            IDq iDq = iq0.A07;
            if (iDq != null && iq0.A0D) {
                Layer layer = iDq.A06;
                float A002 = layer.A00 * ht0.A00();
                layer.A02(A002);
                GpB gpB = iq0.A05;
                if (gpB != null) {
                    ((IDq) gpB).A06.A02(A002);
                }
            }
        }
        return true;
    }

    public boolean CIn(Ht0 ht0) {
        int i = (int) ht0.A03;
        int i2 = (int) ht0.A04;
        IQ0 iq0 = this.A00;
        ImmutableList A06 = IQ0.A06(iq0, i, i2);
        if (A06 == null || A06.isEmpty()) {
            return iq0.A07 != null && iq0.A0D;
        }
        if (!iq0.A0I) {
            1Du it = A06.iterator();
            while (it.hasNext()) {
                Layer A0q = GOn.A0q(it);
                IDq A05 = IQ0.A05(iq0, A0q);
                Point point = null;
                if (A05 != null) {
                    point = IQ0.A02(iq0, A05, i, i2);
                    View view = A05.A05;
                    point.offset(-view.getLeft(), -view.getTop());
                }
                IQ0.A07(point, iq0, A0q);
            }
        }
        iq0.A0J = true;
        return true;
    }

    public void CIp(Ht0 ht0) {
        IQ0 iq0 = this.A00;
        iq0.A0J = false;
        ImmutableList immutableList = iq0.A0c.A01;
        if (immutableList == null || immutableList.isEmpty()) {
            return;
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            Layer A0q = GOn.A0q(it);
            View view = IQ0.A05(iq0, A0q).A05;
            IQ0.A07(new Point(view.getWidth() / 2, view.getHeight() / 2), iq0, A0q);
        }
    }
}
