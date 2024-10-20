package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.util.NotificationScope;

/* loaded from: Czn.class */
public final class Czn implements C1y5 {
    public final int A00;
    public final Object A01;

    public Czn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static NotificationScope A00(C1y2 c1y2, Object obj, String str, int i) {
        return c1y2.A00(new Czn(obj, i), str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v133, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    /* JADX WARN: Type inference failed for: r0v166, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    /* JADX WARN: Type inference failed for: r0v210, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    @Override // X.C1y5
    public void CHh(java.util.Map map) {
        MailboxFutureImpl mailboxFutureImpl;
        BnY aeO;
        MailboxFutureImpl mailboxFutureImpl2;
        Object obj;
        Object A0j;
        Object obj2;
        MailboxFutureImpl mailboxFutureImpl3;
        switch (this.A00) {
            case 0:
                map.getClass();
                A0j = 7zU.A0j(AnonymousClass206.A00, map, 22);
                obj2 = ((Czf) this.A01).A03;
                mailboxFutureImpl3 = (MailboxObservableImpl) obj2;
                mailboxFutureImpl3.setResult(7zL.A0s(A0j));
                return;
            case 1:
                map.getClass();
                CQLResultSet cQLResultSet = (CQLResultSet) 7zU.A0j(BDU.A00, map, 0);
                mailboxFutureImpl3 = ((Cz1) this.A01).A01;
                if (cQLResultSet != null) {
                    A0j = new 1qX(cQLResultSet);
                    mailboxFutureImpl3.setResult(7zL.A0s(A0j));
                    return;
                }
                A0j = null;
                mailboxFutureImpl3.setResult(7zL.A0s(A0j));
                return;
            case 2:
                map.getClass();
                C1qL c1qL = 1xC.A00;
                String str = (String) 7zU.A0j(c1qL, map, 63);
                map.get(c1qL.A00(15));
                ((Cyy) this.A01).A04.setResult(new Bjl(str, (String) 7zU.A0j(c1qL, map, 14)));
                return;
            case 3:
                map.getClass();
                C1qL c1qL2 = 1xC.A00;
                String str2 = (String) 7zU.A0j(c1qL2, map, 63);
                map.get(c1qL2.A00(15));
                map.get(c1qL2.A00(14));
                ((Cyr) this.A01).A05.setResult(new BbW(str2));
                return;
            case 4:
                map.getClass();
                C1qL c1qL3 = 1xC.A00;
                String str3 = (String) 7zU.A0j(c1qL3, map, 63);
                map.get(c1qL3.A00(15));
                map.get(c1qL3.A00(14));
                ((Cyu) this.A01).A03.setResult(new BbV(str3));
                return;
            case 5:
                map.getClass();
                A0j = 7zU.A0j(BDW.A00, map, 3);
                obj2 = ((CyE) this.A01).A02;
                mailboxFutureImpl3 = (MailboxObservableImpl) obj2;
                mailboxFutureImpl3.setResult(7zL.A0s(A0j));
                return;
            case 6:
                map.getClass();
                C1qL c1qL4 = 22B.A00;
                CQLResultSet cQLResultSet2 = (CQLResultSet) 7zU.A0j(c1qL4, map, 12);
                map.get(c1qL4.A00(11));
                mailboxFutureImpl = ((AeP) this.A01).A02;
                aeO = new AeO(cQLResultSet2 == null ? null : new 1qX(cQLResultSet2));
                mailboxFutureImpl.setResult(aeO);
                return;
            case 7:
                map.getClass();
                C1qL c1qL5 = 22B.A00;
                CQLResultSet cQLResultSet3 = (CQLResultSet) 7zU.A0j(c1qL5, map, 7);
                Number number = (Number) 7zU.A0j(c1qL5, map, 6);
                mailboxFutureImpl = ((Cym) this.A01).A01;
                aeO = new BnY(cQLResultSet3 == null ? null : new 1qX(cQLResultSet3), number);
                mailboxFutureImpl.setResult(aeO);
                return;
            case 8:
                mailboxFutureImpl2 = ((Cyj) this.A01).A01;
                mailboxFutureImpl2.setResult(null);
                return;
            case 9:
                map.getClass();
                CQLResultSet cQLResultSet4 = (CQLResultSet) 7zU.A0j(C00683ob.A00, map, 5);
                mailboxFutureImpl3 = ((Cz2) this.A01).A00;
                if (cQLResultSet4 != null) {
                    A0j = new 1qX(cQLResultSet4);
                    mailboxFutureImpl3.setResult(7zL.A0s(A0j));
                    return;
                }
                A0j = null;
                mailboxFutureImpl3.setResult(7zL.A0s(A0j));
                return;
            case 10:
                mailboxFutureImpl2 = ((Cyq) this.A01).A00;
                mailboxFutureImpl2.setResult(null);
                return;
            case 11:
                obj = ((Czj) this.A01).A02;
                mailboxFutureImpl2 = (MailboxObservableImpl) obj;
                mailboxFutureImpl2.setResult(null);
                return;
            case 12:
                obj = ((Cxn) this.A01).A02;
                mailboxFutureImpl2 = (MailboxObservableImpl) obj;
                mailboxFutureImpl2.setResult(null);
                return;
            default:
                map.getClass();
                CQLResultSet cQLResultSet5 = (CQLResultSet) 7zU.A0j(BDZ.A00, map, 6);
                mailboxFutureImpl3 = (MailboxObservableImpl) ((CyA) this.A01).A04;
                if (cQLResultSet5 != null) {
                    A0j = new 1qX(cQLResultSet5);
                    mailboxFutureImpl3.setResult(7zL.A0s(A0j));
                    return;
                }
                A0j = null;
                mailboxFutureImpl3.setResult(7zL.A0s(A0j));
                return;
        }
    }
}
