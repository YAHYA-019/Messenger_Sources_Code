package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.util.NotificationScope;

/* loaded from: A1j.class */
public final class A1j implements C1y5 {
    public final int A00;
    public final Object A01;

    public A1j(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static NotificationScope A00(C1y2 c1y2, Object obj, String str, int i) {
        return c1y2.A00(new A1j(obj, i), str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    /* JADX WARN: Type inference failed for: r0v127, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    /* JADX WARN: Type inference failed for: r0v216, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    /* JADX WARN: Type inference failed for: r1v28, types: [X.5u3] */
    /* JADX WARN: Type inference failed for: r2v20, types: [X.4l8] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.4l6] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.4l4] */
    @Override // X.C1y5
    public void CHh(java.util.Map map) {
        C1qL c1qL;
        int i;
        Object A0j;
        Object obj;
        C1qL c1qL2;
        int i2;
        MailboxFutureImpl mailboxFutureImpl;
        9Pc c9Mo;
        MailboxObservableImpl mailboxObservableImpl;
        Object obj2;
        switch (this.A00) {
            case 0:
            case 3:
                obj2 = ((A1f) this.A01).A02;
                7zO.A1V(obj2);
                return;
            case 1:
                obj2 = ((A0C) this.A01).A03;
                7zO.A1V(obj2);
                return;
            case 2:
                map.getClass();
                c1qL = AnonymousClass206.A00;
                i = 28;
                A0j = 7zU.A0j(c1qL, map, i);
                obj = ((C3b5) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 4:
            case 6:
            case 20:
            default:
                obj2 = ((A1V) this.A01).A02;
                7zO.A1V(obj2);
                return;
            case 5:
                obj2 = ((A0S) this.A01).A02;
                7zO.A1V(obj2);
                return;
            case 7:
                map.getClass();
                c1qL = AnonymousClass206.A00;
                i = 19;
                A0j = 7zU.A0j(c1qL, map, i);
                obj = ((C3b5) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 8:
                map.getClass();
                c1qL2 = AnonymousClass206.A00;
                i2 = 27;
                A0j = 7zU.A0j(c1qL2, map, i2);
                obj = ((A1V) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 9:
                map.getClass();
                C1qL c1qL3 = 1xC.A00;
                String str = (String) 7zU.A0j(c1qL3, map, 63);
                map.get(c1qL3.A00(15));
                String str2 = (String) 7zU.A0j(c1qL3, map, 14);
                mailboxFutureImpl = ((A1A) this.A01).A03;
                c9Mo = new C9Mo(str, str2);
                mailboxFutureImpl.setResult(c9Mo);
                return;
            case 10:
                map.getClass();
                c1qL2 = C8ye.A00;
                i2 = 1;
                A0j = 7zU.A0j(c1qL2, map, i2);
                obj = ((A1V) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 11:
                map.getClass();
                CQLResultSet cQLResultSet = (CQLResultSet) 7zU.A0j(1xA.A00, map, 191);
                mailboxObservableImpl = (MailboxObservableImpl) ((C3b5) this.A01).A02;
                if (cQLResultSet != null) {
                    A0j = new 1qX(cQLResultSet);
                    mailboxObservableImpl.setResult(7zL.A0s(A0j));
                    return;
                }
                A0j = null;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 12:
                map.getClass();
                CQLResultSet cQLResultSet2 = (CQLResultSet) 7zU.A0j(1xA.A00, map, 312);
                mailboxObservableImpl = (MailboxObservableImpl) ((A1f) this.A01).A02;
                if (cQLResultSet2 != null) {
                    A0j = new 1qX(cQLResultSet2);
                    mailboxObservableImpl.setResult(7zL.A0s(A0j));
                    return;
                }
                A0j = null;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 13:
                map.getClass();
                A0j = 7zU.A0j(1xA.A00, map, 378);
                obj = ((A1Y) this.A01).A02;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 14:
                map.getClass();
                C1qL c1qL4 = 1xA.A00;
                String str3 = (String) 7zU.A0j(c1qL4, map, 376);
                String str4 = (String) 7zU.A0j(c1qL4, map, 377);
                mailboxFutureImpl = (MailboxObservableImpl) ((C3aw) this.A01).A03;
                c9Mo = new 3KF(str3, str4);
                mailboxFutureImpl.setResult(c9Mo);
                return;
            case 15:
                map.getClass();
                C1qL c1qL5 = 1xA.A00;
                Number number = (Number) 7zU.A0j(c1qL5, map, 369);
                Number number2 = (Number) 7zU.A0j(c1qL5, map, 370);
                mailboxFutureImpl = (MailboxObservableImpl) ((A1f) this.A01).A02;
                c9Mo = new 9Mp(number, number2);
                mailboxFutureImpl.setResult(c9Mo);
                return;
            case 16:
                map.getClass();
                CQLResultSet cQLResultSet3 = (CQLResultSet) 7zU.A0j(1xA.A00, map, 194);
                mailboxObservableImpl = (MailboxObservableImpl) ((C3b5) this.A01).A02;
                if (cQLResultSet3 != null) {
                    A0j = new 1qX(cQLResultSet3);
                    mailboxObservableImpl.setResult(7zL.A0s(A0j));
                    return;
                }
                A0j = null;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 17:
                map.getClass();
                A0j = 7zU.A0j(GsK.A00, map, 7);
                obj = ((A0P) this.A01).A04;
                mailboxObservableImpl = (MailboxObservableImpl) obj;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 18:
                map.getClass();
                C1qL c1qL6 = 8yX.A00;
                CQLResultSet cQLResultSet4 = (CQLResultSet) 7zU.A0j(c1qL6, map, 1);
                CQLResultSet cQLResultSet5 = (CQLResultSet) 7zU.A0j(c1qL6, map, 4);
                CQLResultSet cQLResultSet6 = (CQLResultSet) 7zU.A0j(c1qL6, map, 3);
                CQLResultSet cQLResultSet7 = (CQLResultSet) 7zU.A0j(c1qL6, map, 2);
                MailboxFutureImpl mailboxFutureImpl2 = ((A0y) this.A01).A04;
                1qX r305 = null;
                1qX r306 = cQLResultSet4 == null ? null : new 1qX(cQLResultSet4);
                1qX r307 = cQLResultSet5 == null ? null : new 1qX(cQLResultSet5);
                1qX r312 = cQLResultSet6 == null ? null : new 1qX(cQLResultSet6);
                if (cQLResultSet7 != null) {
                    r305 = new 1qX(cQLResultSet7);
                }
                mailboxFutureImpl2.setResult(new 9Sy(r306, r305, r312, r307));
                return;
            case 19:
                map.getClass();
                C1qL c1qL7 = 8yZ.A00;
                Number number3 = (Number) 7zU.A0j(c1qL7, map, 4);
                String str5 = (String) 7zU.A0j(c1qL7, map, 2);
                mailboxFutureImpl = (MailboxObservableImpl) ((A1Y) this.A01).A03;
                c9Mo = new 9Pc(str5, number3);
                mailboxFutureImpl.setResult(c9Mo);
                return;
            case 21:
                map.getClass();
                A0j = 7zU.A0j(5P5.A00, map, 1);
                mailboxObservableImpl = ((A0q) this.A01).A02;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 22:
                map.getClass();
                CQLResultSet cQLResultSet8 = (CQLResultSet) 7zU.A0j(6CT.A00, map, 13);
                mailboxObservableImpl = (MailboxObservableImpl) ((A1c) this.A01).A02;
                if (cQLResultSet8 != null) {
                    A0j = new 1qX(cQLResultSet8);
                    mailboxObservableImpl.setResult(7zL.A0s(A0j));
                    return;
                }
                A0j = null;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 23:
                map.getClass();
                CQLResultSet cQLResultSet9 = (CQLResultSet) 7zU.A0j(6CT.A00, map, 3);
                mailboxObservableImpl = (MailboxObservableImpl) ((A1U) this.A01).A03;
                if (cQLResultSet9 != null) {
                    A0j = new 1qX(cQLResultSet9);
                    mailboxObservableImpl.setResult(7zL.A0s(A0j));
                    return;
                }
                A0j = null;
                mailboxObservableImpl.setResult(7zL.A0s(A0j));
                return;
            case 24:
                map.getClass();
                C1qL c1qL8 = 6CT.A00;
                CQLResultSet cQLResultSet10 = (CQLResultSet) 7zU.A0j(c1qL8, map, 13);
                CQLResultSet cQLResultSet11 = (CQLResultSet) 7zU.A0j(c1qL8, map, 10);
                Number number4 = (Number) 7zU.A0j(c1qL8, map, 11);
                java.util.Map map2 = (java.util.Map) 7zU.A0j(c1qL8, map, 5);
                java.util.Map map3 = (java.util.Map) 7zU.A0j(c1qL8, map, 9);
                java.util.Map map4 = (java.util.Map) 7zU.A0j(c1qL8, map, 8);
                map.get(c1qL8.A00(4));
                map.get(c1qL8.A00(12));
                CQLResultSet cQLResultSet12 = (CQLResultSet) 7zU.A0j(c1qL8, map, 7);
                java.util.Map map5 = (java.util.Map) 7zU.A0j(c1qL8, map, 6);
                MailboxObservableImpl mailboxObservableImpl2 = (MailboxObservableImpl) ((A0a) this.A01).A03;
                1qX r3052 = null;
                1qX r314 = cQLResultSet10 == null ? null : new 1qX(cQLResultSet10);
                1qX r315 = cQLResultSet11 == null ? null : new 1qX(cQLResultSet11);
                if (cQLResultSet12 != null) {
                    r3052 = new 1qX(cQLResultSet12);
                }
                mailboxObservableImpl2.setResult(new 9VW(r3052, r315, r314, number4, map2, map3, map4, map5));
                return;
        }
    }
}
