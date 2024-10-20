package X;

import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.CQLResultSet;

/* loaded from: N88.class */
public final class N88 implements C1y5 {
    public final int A00;
    public final Object A01;

    public N88(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1y5
    public void CHh(java.util.Map map) {
        Object obj;
        MailboxObservableImpl mailboxObservableImpl;
        switch (this.A00) {
            case 0:
                map.getClass();
                obj = map.get(MWv.A00.A00(3));
                mailboxObservableImpl = (MailboxObservableImpl) ((N7Q) this.A01).A05;
                break;
            case 1:
                map.getClass();
                obj = map.get(MWv.A00.A00(5));
                mailboxObservableImpl = ((N7T) this.A01).A04;
                break;
            default:
                map.getClass();
                CQLResultSet cQLResultSet = (CQLResultSet) map.get(22C.A00.A00(28));
                mailboxObservableImpl = (MailboxObservableImpl) ((N83) this.A01).A04;
                if (cQLResultSet != null) {
                    obj = new 1qX(cQLResultSet);
                    break;
                } else {
                    obj = null;
                    break;
                }
        }
        mailboxObservableImpl.setResult(7zL.A0s(obj));
    }
}
