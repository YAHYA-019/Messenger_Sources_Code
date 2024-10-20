package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.util.IdentityHashMap;

/* loaded from: LaA.class */
public final class LaA implements 6Zh {
    public final /* synthetic */ 6ZZ A00;
    public final /* synthetic */ JTD A01;

    public LaA(6ZZ r302, JTD jtd) {
        this.A00 = r302;
        this.A01 = jtd;
    }

    public 6Zm A00(6YR r302, 6XD r303, long j) {
        JTD jtd = this.A01;
        Object obj = ((6YS) r302).A04;
        Timeline timeline = Timeline.A00;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        6YR A00 = r302.A00(pair.second);
        JTO jto = (JTO) DKC.A12(obj2, jtd.A09);
        jtd.A0A.add(jto);
        KjL kjL = (KjL) jtd.A06.get(jto);
        if (kjL != null) {
            kjL.A02.APF(kjL.A01);
        }
        jto.A04.add(A00);
        JRw A0H = jto.A02.A0H(A00, r303, j);
        jtd.A07.put(A0H, jto);
        JTD.A02(jtd);
        return A0H;
    }

    public void Ccv(6Zm r302) {
        JTD jtd = this.A01;
        IdentityHashMap identityHashMap = jtd.A07;
        Object remove = identityHashMap.remove(r302);
        remove.getClass();
        JTO jto = (JTO) remove;
        jto.A02.Ccv(r302);
        jto.A04.remove(((JRw) r302).A05);
        if (!identityHashMap.isEmpty()) {
            JTD.A02(jtd);
        }
        JTD.A01(jto, jtd);
    }
}
