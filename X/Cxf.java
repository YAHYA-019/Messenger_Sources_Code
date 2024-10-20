package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: Cxf.class */
public final class Cxf implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final Object A02;

    public Cxf(int i, int i2, Object obj) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        4kB r305;
        switch (this.A00) {
            case 0:
                if (AnonymousClass001.A1V(obj)) {
                    return;
                }
                0fH.A0k("MsysThreadViewQuerySubscriber", "MSYS failed to verifyThreadRowExists");
                5VT r0 = (5VT) this.A02;
                ((4eA) 1Br.A0B(r0.A0J)).A04(this.A01, "triggerServerThreadLoad_failed");
                5VT.A04(r0, (String) null, "verifyThreadRowExists error", false, false);
                return;
            case 1:
                Number number = (Number) obj;
                if (number.longValue() <= 0) {
                    CQB.A00(this.A01);
                    return;
                }
                int i = this.A01;
                CQB.A03(i, "thread_fbid", number.longValue());
                CQB.A02(i);
                return;
            case 2:
                r305 = ((C70g) this.A02).A03;
                break;
            default:
                r305 = ((71V) this.A02).A08;
                break;
        }
        if (r305 != null) {
            r305.A73(this.A01, 7zK.A00(71));
        }
    }
}
