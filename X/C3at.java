package X;

import com.facebook.inboxfolders.mca.MailboxInboxFoldersJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.orcaslim.mca.MailboxOrcaSlimJNI;
import com.facebook.simplejni.NativeHolder;

/* renamed from: X.3at, reason: invalid class name */
/* loaded from: 3at.class */
public final class C3at implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C3at(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A01 = i;
        this.A04 = obj;
        this.A03 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxObservableImpl mailboxObservableImpl;
        1XK r308;
        switch (this.A00) {
            case 0:
                NativeHolder nativeHolder = (NativeHolder) MailboxInboxFoldersJNI.dispatchOIOO(0, this.A01, obj, new A1d(this, 29));
                mailboxObservableImpl = (MailboxObservableImpl) this.A03;
                r308 = (1XK) this.A04;
                r308.A01(nativeHolder);
                mailboxObservableImpl.setResult(r308);
                return;
            case 1:
                4uZ.A06("MailboxOrca", "loadOrcaGroupThreadLookup", this.A01);
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A03;
                MailboxNullable A0T = 1BL.A0T();
                A1g a1g = new A1g(this, 88);
                String A00 = 4YT.A00(94);
                C1qL c1qL = 22B.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 0, A00, "OrcaGroupThreadLookup", a1g);
                return;
            default:
                MailboxOrcaSlimJNI.dispatchVIOO(5, this.A01, obj, ((1XK) this.A04).A00);
                mailboxObservableImpl = (MailboxObservableImpl) this.A03;
                r308 = null;
                mailboxObservableImpl.setResult(r308);
                return;
        }
    }
}
