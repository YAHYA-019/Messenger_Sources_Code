package X;

import android.content.Intent;
import java.io.Serializable;

/* loaded from: Esy.class */
public final class Esy {
    public final 1Br A01 = 1BK.A0C();
    public final 1Br A00 = 1Bu.A00(68049);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.util.UUID] */
    public 1pK A00(String str) {
        2vM r0;
        C2v7 c2v7 = (C2v7) 1Bi.A03(17111);
        C00i c00i = this.A01.A00;
        2vD A00 = c2v7.A00(1BK.A0M(c00i).AZk(36315335763436255L) ? 2vC.A04 : 2vC.A03);
        A00.A02("fb4a_stories_homebase");
        2vI A01 = A00.A01();
        11T.A0A(A01);
        try {
            C3P5.A01(A01, 1BK.A0M(c00i).Auy(36596810740206789L));
            if (!A01.A07() || !A01.A08() || (r0 = (2vM) A01.A04()) == null || !r0.A04) {
                return null;
            }
            Ei3 ei3 = (Ei3) 1Br.A0B(this.A00);
            if (1Br.A07(ei3.A01).AZk(36315335762715356L)) {
                2vD A002 = ((C2v7) 1Br.A0B(ei3.A00)).A00(2vC.A07);
                A002.A02("fb4a_stories_editor");
                A002.A02("fb4a_stories_homebase");
                A002.A01();
            }
            Intent A05 = AbF.A05();
            if (str == null) {
                str = C04I.A00();
                11T.A0A(str);
            }
            A05.putExtra("extra_session_id", (Serializable) str);
            1pK phk = new PHK();
            phk.A1X(A05);
            return phk;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
