package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: A1k.class */
public final class A1k implements C1y5 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public A1k(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static NotificationScope A00(C1y2 c1y2, Object obj, String str, int i) {
        return c1y2.A00(new A1k(str, obj, i), str);
    }

    public static List A01(A1k a1k, java.util.Map map) {
        map.getClass();
        C1qL c1qL = 5P8.A00;
        MailboxFeature.getNonNullNotificationValue(c1qL, map, a1k.A02, 69);
        return (List) map.get(c1qL.A00(58));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v569, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    @Override // X.C1y5
    public void CHh(java.util.Map map) {
        MailboxObservableImpl mailboxObservableImpl;
        Object obj;
        Object nonNullNotificationValue;
        MailboxFutureImpl mailboxFutureImpl;
        Object obj2;
        switch (this.A00) {
            case 0:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(AnonymousClass206.A00, map, this.A02, 25);
                mailboxFutureImpl = ((C3ao) this.A01).A01;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 1:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(AnonymousClass206.A00, map, this.A02, 1);
                obj2 = ((A0C) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 2:
                map.getClass();
                C1qL c1qL = C2cx.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL, map, this.A02, 50);
                Object A0j = 7zU.A0j(c1qL, map, 49);
                mailboxObservableImpl = (MailboxObservableImpl) ((A0a) this.A01).A02;
                obj = new 9GY(A0j);
                mailboxObservableImpl.setResult(obj);
                return;
            case 3:
                map.getClass();
                C1qL c1qL2 = C2cx.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL2, map, this.A02, 56);
                Object A0j2 = 7zU.A0j(c1qL2, map, 55);
                mailboxObservableImpl = (MailboxObservableImpl) ((IbT) this.A01).A02;
                obj = new 9Ga(A0j2);
                mailboxObservableImpl.setResult(obj);
                return;
            case 4:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(C2cx.A00, map, this.A02, 33);
                obj2 = ((A1e) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 5:
                map.getClass();
                C1qL c1qL3 = C2cx.A00;
                boolean A1V = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL3, map, this.A02, 16));
                Object A0j3 = 7zU.A0j(c1qL3, map, 17);
                mailboxObservableImpl = (MailboxObservableImpl) ((A0Q) this.A01).A02;
                obj = new 9Mj(A1V, A0j3);
                mailboxObservableImpl.setResult(obj);
                return;
            case 6:
                map.getClass();
                C1qL c1qL4 = C2cx.A00;
                boolean A1V2 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL4, map, this.A02, 13));
                Object A0j4 = 7zU.A0j(c1qL4, map, 14);
                mailboxObservableImpl = (MailboxObservableImpl) ((IbP) this.A01).A02;
                obj = new C9Mi(A1V2, A0j4);
                mailboxObservableImpl.setResult(obj);
                return;
            case 7:
                map.getClass();
                C1qL c1qL5 = C2cx.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL5, map, this.A02, 53);
                Object A0j5 = 7zU.A0j(c1qL5, map, 52);
                mailboxObservableImpl = ((A0t) this.A01).A01;
                obj = new 9GZ(A0j5);
                mailboxObservableImpl.setResult(obj);
                return;
            case 8:
                map.getClass();
                C1qL c1qL6 = C2cx.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL6, map, this.A02, 44);
                Object A0j6 = 7zU.A0j(c1qL6, map, 43);
                mailboxObservableImpl = ((A0e) this.A01).A01;
                obj = new 9GX(A0j6);
                mailboxObservableImpl.setResult(obj);
                return;
            case 9:
                map.getClass();
                C1qL c1qL7 = C2cx.A00;
                boolean A1V3 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL7, map, this.A02, 38));
                Object A0j7 = 7zU.A0j(c1qL7, map, 37);
                mailboxObservableImpl = (MailboxObservableImpl) ((A1e) this.A01).A02;
                obj = new C9Ml(A1V3, A0j7);
                mailboxObservableImpl.setResult(obj);
                return;
            case 10:
                map.getClass();
                C1qL c1qL8 = C2cx.A00;
                boolean A1V4 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL8, map, this.A02, 34));
                Object A0j8 = 7zU.A0j(c1qL8, map, 35);
                mailboxObservableImpl = (MailboxObservableImpl) ((A1e) this.A01).A03;
                obj = new 9Mk(A1V4, A0j8);
                mailboxObservableImpl.setResult(obj);
                return;
            case 11:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5FT.A00, map, this.A02, 3);
                obj2 = ((C87u) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 12:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 61);
                obj2 = ((A1Y) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 13:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 62);
                obj2 = ((A1Y) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 14:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 15);
                obj2 = ((C3aw) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 15:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 70);
                obj2 = ((A0I) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 16:
                map.getClass();
                C1qL c1qL9 = 1xC.A00;
                boolean A1V5 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL9, map, this.A02, 17));
                map.get(c1qL9.A00(16));
                mailboxObservableImpl = (MailboxObservableImpl) ((A0H) this.A01).A02;
                obj = new 2CM(A1V5);
                mailboxObservableImpl.setResult(obj);
                return;
            case 17:
                map.getClass();
                C1qL c1qL10 = 1xC.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL10, map, this.A02, 17);
                map.get(c1qL10.A00(16));
                mailboxObservableImpl = (MailboxObservableImpl) ((A0G) this.A01).A03;
                obj = new Object();
                mailboxObservableImpl.setResult(obj);
                return;
            case 18:
                map.getClass();
                C1qL c1qL11 = 1xC.A00;
                boolean A1V6 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL11, map, this.A02, 9));
                map.get(c1qL11.A00(8));
                mailboxObservableImpl = (MailboxObservableImpl) ((A0H) this.A01).A02;
                obj = new C2ww(A1V6);
                mailboxObservableImpl.setResult(obj);
                return;
            case 19:
                map.getClass();
                C1qL c1qL12 = 1xC.A00;
                Number number = (Number) MailboxFeature.getNonNullNotificationValue(c1qL12, map, this.A02, 13);
                map.get(c1qL12.A00(12));
                mailboxObservableImpl = (MailboxObservableImpl) ((C3b5) this.A01).A02;
                obj = new 7MK(number);
                mailboxObservableImpl.setResult(obj);
                return;
            case 20:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xA.A00, map, this.A02, 356);
                obj2 = ((A1e) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 21:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xA.A00, map, this.A02, 382);
                obj2 = ((A1f) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 22:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xA.A00, map, this.A02, 348);
                obj2 = ((C3au) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 23:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xA.A00, map, this.A02, 394);
                mailboxFutureImpl = ((C3az) this.A01).A01;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 24:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(AnonymousClass231.A00, map, this.A02, 3);
                obj2 = ((C3aw) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 25:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(C5gf.A00, map, this.A02, 7);
                obj2 = ((A1e) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 26:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(BDY.A00, map, this.A02, 17);
                obj2 = ((A0R) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 27:
                List A01 = A01(this, map);
                mailboxObservableImpl = ((A18) this.A01).A02;
                obj = new 9Lk(A01);
                mailboxObservableImpl.setResult(obj);
                return;
            case 28:
                List A012 = A01(this, map);
                mailboxObservableImpl = ((A14) this.A01).A02;
                obj = new 9Ln(A012);
                mailboxObservableImpl.setResult(obj);
                return;
            case 29:
                List A013 = A01(this, map);
                mailboxObservableImpl = ((A16) this.A01).A01;
                obj = new 9Lj(A013);
                mailboxObservableImpl.setResult(obj);
                return;
            case 30:
                map.getClass();
                C1qL c1qL13 = 5P8.A00;
                boolean A1V7 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL13, map, this.A02, 69));
                List list = (List) 7zU.A0j(c1qL13, map, 58);
                mailboxObservableImpl = ((A12) this.A01).A01;
                obj = new 9PZ(list, A1V7);
                mailboxObservableImpl.setResult(obj);
                return;
            case 31:
                List A014 = A01(this, map);
                mailboxObservableImpl = ((A15) this.A01).A01;
                obj = new 9Ll(A014);
                mailboxObservableImpl.setResult(obj);
                return;
            case 32:
                List A015 = A01(this, map);
                mailboxObservableImpl = ((A13) this.A01).A01;
                obj = new 9Lm(A015);
                mailboxObservableImpl.setResult(obj);
                return;
            case 33:
                map.getClass();
                C1qL c1qL14 = 5P8.A00;
                boolean A1V8 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL14, map, this.A02, 69));
                String str = (String) 7zU.A0j(c1qL14, map, 57);
                mailboxObservableImpl = ((A0z) this.A01).A02;
                obj = new 9PY(A1V8, str);
                mailboxObservableImpl.setResult(obj);
                return;
            case 34:
                map.getClass();
                C1qL c1qL15 = 5P8.A00;
                String str2 = (String) 7zU.A0j(c1qL15, map, 60);
                String str3 = (String) 7zU.A0j(c1qL15, map, 64);
                MailboxFeature.getNonNullNotificationValue(c1qL15, map, this.A02, 56);
                mailboxObservableImpl = ((A19) this.A01).A03;
                obj = new 9Pa(str2, str3);
                mailboxObservableImpl.setResult(obj);
                return;
            case 35:
                map.getClass();
                C1qL c1qL16 = 5P8.A00;
                String str4 = (String) 7zU.A0j(c1qL16, map, 60);
                String str5 = (String) 7zU.A0j(c1qL16, map, 64);
                MailboxFeature.getNonNullNotificationValue(c1qL16, map, this.A02, 56);
                mailboxObservableImpl = ((A17) this.A01).A03;
                obj = new 9Pb(str4, str5);
                mailboxObservableImpl.setResult(obj);
                return;
            case 36:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 52);
                obj2 = ((A0X) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 37:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 41);
                obj2 = ((A0L) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 38:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 5);
                obj2 = ((A0I) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 39:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 56);
                obj2 = ((A0K) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            default:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 1);
                obj2 = ((A1f) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj2;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
        }
    }
}
