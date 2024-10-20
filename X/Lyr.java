package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: Lyr.class */
public final class Lyr extends FutureTask {
    public final /* synthetic */ Lrb A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lyr(Lrb lrb, Callable callable) {
        super(callable);
        this.A00 = lrb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.Lrb] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    @Override // java.util.concurrent.FutureTask
    public void done() {
        ?? r0 = "An error occurred while executing doInBackground()";
        try {
            Object obj = get();
            Lrb lrb = this.A00;
            if (lrb.A02.get()) {
                return;
            }
            r0 = lrb;
            r0.A00(obj);
        } catch (InterruptedException e) {
            android.util.Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            Lrb lrb2 = this.A00;
            if (lrb2.A02.get()) {
                return;
            }
            lrb2.A00(null);
        } catch (ExecutionException unused2) {
            throw 1BK.A0s("An error occurred while executing doInBackground()", r0.getCause());
        } catch (Throwable th) {
            throw 1BK.A0s("An error occurred while executing doInBackground()", th);
        }
    }
}
