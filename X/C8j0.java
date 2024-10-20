package X;

import com.facebook.messaging.model.messages.Message;

/* renamed from: X.8j0, reason: invalid class name */
/* loaded from: 8j0.class */
public final class C8j0 extends C1rj {
    public C9xa A00;

    public C8j0() {
        super("MontagePreviewComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.Qxf, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C9xa c9xa = this.A00;
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0z(80.0f);
        A01.A0l(80.0f);
        8PF r0 = new 8PF(r302, new C8li());
        Message message = c9xa.A00;
        ?? obj = new Object();
        ((Qxf) obj).A00 = message;
        r0.A01.A01 = obj;
        r0.A02.set(0);
        r0.A0Q();
        return 7zL.A0c(r0, A01);
    }
}
