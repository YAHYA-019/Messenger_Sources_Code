package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Iaf.class */
public final class Iaf implements 1Um {
    public final /* synthetic */ Iae A00;

    public Iaf(Iae iae) {
        this.A00 = iae;
    }

    public void AED(NotificationScope notificationScope, String str) {
        Execution.executeAsync(new GtP(this, notificationScope, str), this.A00.A00, 1);
    }

    public boolean Cj2(MailboxCallback mailboxCallback) {
        int executionContext = Execution.getExecutionContext();
        if (executionContext == 0) {
            executionContext = 1;
        }
        Execution.executePossiblySync(new GtK(this, mailboxCallback), this.A00.A00, executionContext);
        return true;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
