package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: Fim.class */
public final class Fim implements 7G8 {
    public final C2yq A00;
    public final C2yq A01;
    public final C1qe A02;
    public final Fin A03;
    public final Fio A04;
    public final EdM A05;
    public final Egc A06;
    public final List A07;
    public final Function1 A08;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Fio, java.lang.Object] */
    public /* synthetic */ Fim(C1qe c1qe, EdM edM) {
        ?? obj = new Object();
        GBL gbl = GBL.A00;
        Fin fin = new Fin();
        11T.A0F(gbl, 3);
        this.A05 = edM;
        this.A04 = obj;
        this.A08 = gbl;
        this.A03 = fin;
        this.A02 = c1qe;
        fin.A6t(this);
        this.A07 = AnonymousClass001.A0s();
        this.A01 = new C2yq();
        this.A00 = new C2yq();
        this.A06 = new Egc(this);
    }

    public void CGC() {
        synchronized (this) {
            this.A07.clear();
        }
    }
}
