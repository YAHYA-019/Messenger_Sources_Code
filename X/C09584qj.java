package X;

import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.4qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4qj.class */
public final class C09584qj implements 1aR {
    public final AbstractC00401az A00;
    public final C1Zg A01;

    public C09584qj() {
        C1Zg c1Zg = (C1Zg) 1Bn.A0A(33057);
        this.A01 = c1Zg;
        this.A00 = c1Zg.A00(1BJ.A00(566));
    }

    public /* bridge */ /* synthetic */ void CAv(1Z6 r302, 1Yu r303, File file) {
        ((Executor) this.A01.A01.get()).execute(new 3iR(r302, this, (3A7) r303, file));
    }
}
