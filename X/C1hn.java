package X;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.1hn, reason: invalid class name */
/* loaded from: 1hn.class */
public final class C1hn extends C1hp {
    public C1i6 A00;

    @Override // X.C1hp
    public void A05() {
        C1i6 c1i6 = this.A00;
        if (c1i6 != null) {
            try {
                c1i6.listenerExecutor.execute(c1i6);
            } catch (RejectedExecutionException e) {
                c1i6.this$0.setException(e);
            }
        }
    }

    @Override // X.C1hp
    public void A07(Integer num) {
        super.A07(num);
        if (num == 0S2.A00) {
            this.A00 = null;
        }
    }

    public void interruptTask() {
        C1i6 c1i6 = this.A00;
        if (c1i6 != null) {
            c1i6.A03();
        }
    }
}
