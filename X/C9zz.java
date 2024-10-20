package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.9zz, reason: invalid class name */
/* loaded from: 9zz.class */
public final class C9zz implements MailboxCallback {
    public final /* synthetic */ C9kf A00;

    public C9zz(C9kf c9kf) {
        this.A00 = c9kf;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Number A0y = 7zS.A0y(obj);
        if (A0y != null) {
            C9kf.A01(this.A00, AT6.A00, A0y.longValue());
        }
    }
}
