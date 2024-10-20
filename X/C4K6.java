package X;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.4K6, reason: invalid class name */
/* loaded from: 4K6.class */
public final /* synthetic */ class C4K6 implements 4IR {
    public final /* synthetic */ 4IX A00;
    public final /* synthetic */ WorkDatabase A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ Executor A03;

    public /* synthetic */ C4K6(4IX r302, WorkDatabase workDatabase, List list, Executor executor) {
        this.A03 = executor;
        this.A02 = list;
        this.A00 = r302;
        this.A01 = workDatabase;
    }

    public final void Bwy(C4Ki c4Ki, boolean z) {
        this.A03.execute(new 4XJ(this.A00, this.A01, c4Ki, this.A02));
    }
}
