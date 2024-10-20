package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: A08.class */
public final class A08 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final String A02;

    public A08(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                C75a.A00((C75a) this.A01, this.A02, AnonymousClass001.A1V(obj));
                return;
            case 1:
                4kB r0 = (4kB) this.A01;
                if (r0 != null) {
                    r0.A73(this.A02.hashCode(), "SEND_MESSAGE_API_END");
                    return;
                }
                return;
            default:
                if (AnonymousClass001.A1V(obj)) {
                    6vA r02 = (6vA) this.A01;
                    String str = this.A02;
                    r02.A01.A00(new C5ny(str, 0S2.A01, null));
                    r02.A00.A08(str);
                    return;
                }
                return;
        }
    }
}
