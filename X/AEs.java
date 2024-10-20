package X;

import com.facebook.msys.mca.MailboxNullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: AEs.class */
public final class AEs implements Runnable {
    public static final String __redex_internal_original_name = "InboxSubtabsChannelsBadgeController$setupBadgeObserver$1$1$1";
    public final /* synthetic */ C02813wH A00;
    public final /* synthetic */ MailboxNullable A01;

    public AEs(C02813wH c02813wH, MailboxNullable mailboxNullable) {
        this.A00 = c02813wH;
        this.A01 = mailboxNullable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C02813wH c02813wH = this.A00;
        MailboxNullable mailboxNullable = this.A01;
        11T.A0D(mailboxNullable);
        C00j.A05("InboxSubtabsChannelsBadgeController.checkIfBadgeStateChanged", 361845945);
        if (mailboxNullable != null) {
            try {
                C8zs c8zs = (C8zs) mailboxNullable.value;
                if (c8zs != null && 1qX.A00(c8zs) > 0) {
                    boolean z = false;
                    boolean z2 = ((1qX) c8zs).mResultSet.getBoolean(0, 0);
                    AtomicBoolean atomicBoolean = c02813wH.A04;
                    if (!z2) {
                        z = true;
                    }
                    if (atomicBoolean.compareAndSet(z, z2)) {
                        C00m c00m = c02813wH.A00;
                        if (c00m != null) {
                            c00m.invoke();
                        }
                    }
                }
            } catch (Throwable th) {
                C00j.A01(-1717006350);
                throw th;
            }
        }
        C00j.A01(1946409627);
    }
}
