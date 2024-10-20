package X;

import com.facebook.msys.mca.MailboxCallback;
import java.lang.ref.WeakReference;

/* loaded from: A04.class */
public final class A04 implements MailboxCallback {
    public final C5fv A00;
    public final WeakReference A01;

    public A04(A8V a8v, C5fv c5fv) {
        this.A00 = c5fv;
        this.A01 = 7zL.A14(a8v);
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        A8V a8v;
        if (!7zR.A1X(obj) || (a8v = (A8V) this.A01.get()) == null) {
            return;
        }
        C5fv c5fv = this.A00;
        C5jn c5jn = a8v.A01;
        C5fu c5fu = (C5fu) c5fv;
        String str = c5fu.A09;
        c5jn.A00(new C5ny(str, 0S2.A00, c5fu.A0B));
        a8v.A00.A08(str);
    }
}
