package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: Lyq.class */
public final class Lyq extends FutureTask {
    public LCD A00;

    @Override // java.util.concurrent.FutureTask
    public void done() {
        try {
            if (!isCancelled()) {
                try {
                    LCD.A00((L2w) get(), this.A00);
                } catch (InterruptedException | ExecutionException e) {
                    LCD.A00(new L2w(e), this.A00);
                }
            }
        } finally {
            this.A00 = null;
        }
    }
}
