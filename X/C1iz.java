package X;

import com.facebook.orcaslim.mca.MailboxOrcaSlim$ThreadListObserverCallback;
import java.util.Set;

/* renamed from: X.1iz, reason: invalid class name */
/* loaded from: 1iz.class */
public final class C1iz extends MailboxOrcaSlim$ThreadListObserverCallback {
    public final 1XK A00;
    public final MailboxOrcaSlim$ThreadListObserverCallback A01;

    public C1iz(1XK r302, MailboxOrcaSlim$ThreadListObserverCallback mailboxOrcaSlim$ThreadListObserverCallback) {
        this.A00 = r302;
        this.A01 = mailboxOrcaSlim$ThreadListObserverCallback;
    }

    @Override // com.facebook.orcaslim.mca.MailboxOrcaSlim$ThreadListObserverCallback
    public void callback(1qW r302, 1qY r303, Set set, boolean z, int i) {
        this.A00.setResult(new 1qZ(r303, r302, set));
        MailboxOrcaSlim$ThreadListObserverCallback mailboxOrcaSlim$ThreadListObserverCallback = this.A01;
        if (mailboxOrcaSlim$ThreadListObserverCallback != null) {
            mailboxOrcaSlim$ThreadListObserverCallback.callback(r302, r303, set, z, i);
        }
    }
}
