package X;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.LithoView;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.79c, reason: invalid class name */
/* loaded from: 79c.class */
public final class C79c implements C78z {
    public final FrameLayout A00;
    public final LifecycleOwner A01;
    public final C6w3 A02;
    public final C79d A03;
    public final C01i A04;
    public final C01i A05;
    public final boolean A06;
    public final 1Iw A07;
    public final C79f A08;
    public final 6wW A09;
    public final 79O A0A;
    public final List A0B;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.79f] */
    public C79c(FrameLayout frameLayout, LifecycleOwner lifecycleOwner, 1Iw r304, C6w3 c6w3, 6wW r306, 79O r307, List list, boolean z) {
        11T.A0F(list, 5);
        this.A0A = r307;
        this.A07 = r304;
        this.A00 = frameLayout;
        this.A01 = lifecycleOwner;
        this.A0B = list;
        this.A09 = r306;
        this.A06 = z;
        this.A02 = c6w3;
        final C79d c79d = new C79d();
        this.A03 = c79d;
        this.A08 = new 2O4(c79d) { // from class: X.79f
            public final C79e A00;

            {
                this.A00 = c79d;
            }

            public void A06(RecyclerView recyclerView, int i) {
                11T.A0F(recyclerView, 0);
                boolean canScrollVertically = recyclerView.canScrollVertically(-1);
                C79e c79e = this.A00;
                if (canScrollVertically) {
                    c79e.AFa();
                } else {
                    c79e.CqF();
                }
            }
        };
        this.A04 = C01g.A01(new C82z(this, 1));
        this.A05 = C01g.A01(new C82z(this, 2));
    }

    @Override // X.C78z
    public void CfW(Capabilities capabilities, C77n c77n, 6RU r304) {
        Object obj;
        11T.A0F(r304, 0);
        11T.A0F(c77n, 1);
        11T.A0F(capabilities, 2);
        Iterator it = this.A0B.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((79S) obj).BQO(c77n)) {
                    break;
                }
            }
        }
        79S r0 = (79S) obj;
        if (r0 == null) {
            ((7DZ) this.A04.getValue()).A02(this.A00, c77n);
            return;
        }
        A5X a5x = new A5X(r304);
        C01i c01i = this.A04;
        7DZ r02 = (7DZ) c01i.getValue();
        1Iw r03 = this.A07;
        8Rg r04 = new 8Rg(r03, new C7fs());
        79O r05 = this.A0A;
        C7fs c7fs = r04.A01;
        c7fs.A00 = -7829368;
        BitSet bitSet = r04.A02;
        bitSet.set(0);
        r04.A1H(r05.AYV());
        C1rs.A05(bitSet, r04.A03, 1);
        r04.A0J();
        LithoView lithoView = r02.A03;
        if (lithoView.getVisibility() != 0) {
            lithoView.setVisibility(0);
        }
        C7m9.A00(c7fs, lithoView, r02.A05);
        7DZ r06 = (7DZ) c01i.getValue();
        C7m9.A00(r0.AJL(this.A08, r03, capabilities, c77n, a5x), r06.A02, r06.A05);
        ((7DZ) c01i.getValue()).A06.A01 = 0;
        7DZ r07 = (7DZ) c01i.getValue();
        C7m9.A00(new 2AW(), r07.A04, r07.A05);
        6wW r08 = this.A09;
        if (r08 != null) {
            r08.A00 = (7DZ) c01i.getValue();
        }
        ((7DZ) c01i.getValue()).A06.A07 = new A6l(a5x, this);
        ((7DZ) c01i.getValue()).A01(this.A00, c77n);
    }

    @Override // X.C78z
    public /* synthetic */ void Cfg(Capabilities capabilities, C77n c77n, 6RU r304) {
        7RP.A00(capabilities, c77n, r304, this);
    }
}
