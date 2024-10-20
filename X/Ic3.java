package X;

import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mca.MailboxObservableImpl;

/* loaded from: Ic3.class */
public final class Ic3 implements C1y5 {
    public final int A00;
    public final Object A01;

    public Ic3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1y5
    public void CHh(java.util.Map map) {
        MailboxObservableImpl mailboxObservableImpl;
        MailboxNullable mailboxNullable;
        switch (this.A00) {
            case 0:
                mailboxObservableImpl = (MailboxObservableImpl) ((IbV) this.A01).A03;
                mailboxNullable = null;
                break;
            case 1:
                map.getClass();
                Object A0j = 7zU.A0j(MWv.A00, map, 1);
                mailboxObservableImpl = (MailboxObservableImpl) ((Ibw) this.A01).A03;
                mailboxNullable = new MailboxNullable(A0j);
                break;
            default:
                mailboxObservableImpl = ((Ibr) this.A01).A09;
                mailboxNullable = null;
                break;
        }
        mailboxObservableImpl.setResult(mailboxNullable);
    }
}
