package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.util.NotificationScope;

/* loaded from: N89.class */
public final class N89 implements C1y5 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public N89(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static NotificationScope A00(C1y2 c1y2, Object obj, String str, int i) {
        return c1y2.A00(new N89(str, obj, i), str);
    }

    public static Object A01(N89 n89, java.util.Map map) {
        map.getClass();
        return MailboxFeature.getNonNullNotificationValue(5P8.A00, map, n89.A02, 69);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v198, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    @Override // X.C1y5
    public void CHh(java.util.Map map) {
        Object nonNullNotificationValue;
        Object obj;
        MailboxFutureImpl mailboxFutureImpl;
        switch (this.A00) {
            case 0:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5FT.A00, map, this.A02, 2);
                obj = ((N6q) this.A01).A02;
                break;
            case 1:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 71);
                obj = ((N6t) this.A01).A02;
                break;
            case 2:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 68);
                obj = ((N71) this.A01).A02;
                break;
            case 3:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(MWu.A00, map, this.A02, 0);
                mailboxFutureImpl = ((N7h) this.A01).A06;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
            case 4:
            case 5:
                nonNullNotificationValue = A01(this, map);
                obj = ((N7C) this.A01).A04;
                break;
            case 6:
            case 16:
            case 18:
                nonNullNotificationValue = A01(this, map);
                obj = ((N7E) this.A01).A03;
                break;
            case 7:
            case 9:
            case 11:
            case 14:
            case 15:
            case 17:
            case 22:
            default:
                nonNullNotificationValue = A01(this, map);
                obj = ((N84) this.A01).A03;
                break;
            case 8:
            case 12:
                nonNullNotificationValue = A01(this, map);
                obj = ((N83) this.A01).A04;
                break;
            case 10:
            case 19:
            case 23:
            case 24:
                nonNullNotificationValue = A01(this, map);
                obj = ((N70) this.A01).A04;
                break;
            case 13:
            case 21:
                nonNullNotificationValue = A01(this, map);
                obj = ((N7A) this.A01).A04;
                break;
            case 20:
                map.getClass();
                C1qL c1qL = 5P8.A00;
                String str = this.A02;
                boolean booleanValue = ((Boolean) MailboxFeature.getNonNullNotificationValue(c1qL, map, str, 69)).booleanValue();
                ((MailboxObservableImpl) ((Cy7) this.A01).A03).setResult(new 9U7((Number) MailboxFeature.getNonNullNotificationValue(c1qL, map, str, 63), (Number) MailboxFeature.getNonNullNotificationValue(c1qL, map, str, 62), (Number) MailboxFeature.getNonNullNotificationValue(c1qL, map, str, 48), (Number) MailboxFeature.getNonNullNotificationValue(c1qL, map, str, 47), booleanValue));
                return;
            case 25:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 50);
                mailboxFutureImpl = ((N7j) this.A01).A00;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
            case 26:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 43);
                obj = ((N6t) this.A01).A02;
                break;
            case 27:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 49);
                mailboxFutureImpl = ((N7a) this.A01).A00;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
            case 28:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 6);
                obj = ((N6v) this.A01).A02;
                break;
            case 29:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 40);
                mailboxFutureImpl = ((N7U) this.A01).A00;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
            case 30:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 54);
                mailboxFutureImpl = ((N7H) this.A01).A00;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
            case 31:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(22C.A00, map, this.A02, 43);
                mailboxFutureImpl = ((N7k) this.A01).A06;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
        }
        mailboxFutureImpl = (MailboxObservableImpl) obj;
        mailboxFutureImpl.setResult(nonNullNotificationValue);
    }
}
