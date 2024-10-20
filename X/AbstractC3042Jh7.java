package X;

import android.content.Context;
import android.os.AsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jh7, reason: case insensitive filesystem */
/* loaded from: Jh7.class */
public abstract class AbstractC3042Jh7 extends 0Uf {
    public Executor A00;
    public volatile Lrb A01;
    public volatile Lrb A02;

    public AbstractC3042Jh7(Context context) {
        ((0Uf) this).A05 = false;
        ((0Uf) this).A02 = false;
        ((0Uf) this).A04 = true;
        ((0Uf) this).A03 = false;
        ((0Uf) this).A00 = context.getApplicationContext();
    }

    public void A02(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A02(str, fileDescriptor, printWriter, strArr);
        if (this.A02 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.A02);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
        if (this.A01 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.A01);
            printWriter.print(" waiting=");
            printWriter.println(false);
        }
    }

    public boolean A03() {
        if (this.A02 == null) {
            return false;
        }
        if (!((0Uf) this).A05) {
            ((0Uf) this).A03 = true;
        }
        if (this.A01 != null) {
            this.A02 = null;
            return false;
        }
        Lrb lrb = this.A02;
        lrb.A01.set(true);
        boolean cancel = lrb.A00.cancel(false);
        if (cancel) {
            this.A01 = this.A02;
        }
        this.A02 = null;
        return cancel;
    }

    public Object A06() {
        C3041Jh6 c3041Jh6 = (C3041Jh6) this;
        Iterator it = c3041Jh6.A00.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((28M) it.next()).A0F(c3041Jh6)) {
                i++;
            }
        }
        try {
            c3041Jh6.A01.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            android.util.Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            AnonymousClass001.A13();
            return null;
        }
    }

    public void A07() {
        if (this.A01 != null || this.A02 == null) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        Lrb lrb = this.A02;
        Executor executor = this.A00;
        if (lrb.A03 == 0S2.A00) {
            lrb.A03 = 0S2.A01;
            executor.execute(lrb.A00);
            return;
        }
        int intValue = lrb.A03.intValue();
        if (intValue == 1) {
            throw AnonymousClass001.A0N("Cannot execute task: the task is already running.");
        }
        if (intValue == 2) {
            throw AnonymousClass001.A0N("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw AnonymousClass001.A0N("We should never reach this state");
    }

    public void A08() {
        A03();
        this.A02 = new Lrb(this);
        A07();
    }
}
