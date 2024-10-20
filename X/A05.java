package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import java.lang.ref.WeakReference;

/* loaded from: A05.class */
public final class A05 implements MailboxCallback {
    public final C5fv A00;
    public final WeakReference A01;

    public A05(7Mq r302, C5fv c5fv) {
        this.A00 = c5fv;
        this.A01 = 7zL.A14(r302);
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        7Mq r0;
        1qX A14 = 7zM.A14((MailboxNullable) obj);
        if (A14 == null || 7zP.A03(A14, 0) != 4 || (r0 = (7Mq) this.A01.get()) == null) {
            return;
        }
        7Mq.A00(r0, this.A00);
    }
}
