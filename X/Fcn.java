package X;

import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: Fcn.class */
public final class Fcn implements 1RN {
    public Queue A00;
    public boolean A01;
    public volatile boolean A02;
    public final /* synthetic */ EpL A03;
    public final /* synthetic */ Etl A04;

    public Fcn() {
        this.A01 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Fcn(EpL epL, Etl etl) {
        this();
        this.A04 = etl;
        this.A03 = epL;
    }

    public boolean BRi() {
        return this.A02;
    }

    public void dispose() {
        this.A02 = true;
        Queue queue = this.A00;
        if (queue != null) {
            queue.clear();
        }
    }

    public final void onFailure(Throwable th) {
        if (this.A02) {
            return;
        }
        if (this.A01) {
            if (th instanceof CancellationException) {
                return;
            }
            this.A03.A05.remove(this);
            this.A04.A00();
            return;
        }
        Q5O q5o = new Q5O(this, th);
        Queue queue = this.A00;
        if (queue == null) {
            queue = new LinkedBlockingQueue();
            this.A00 = queue;
        }
        queue.add(q5o);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x05d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fcn.onSuccess(java.lang.Object):void");
    }
}
