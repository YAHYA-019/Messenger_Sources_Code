package X;

import android.net.Uri;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: Ic4.class */
public final class Ic4 implements C1y5 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Ic4(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static NotificationScope A00(C1y2 c1y2, Object obj, String str, int i) {
        return c1y2.A00(new Ic4(str, obj, i), str);
    }

    public static Object A01(Ic4 ic4, java.util.Map map) {
        map.getClass();
        return MailboxFeature.getNonNullNotificationValue(5P8.A00, map, ic4.A02, 69);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v320, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    @Override // X.C1y5
    public void CHh(java.util.Map map) {
        MailboxObservableImpl mailboxObservableImpl;
        HXp hd1;
        Object nonNullNotificationValue;
        Object obj;
        MailboxFutureImpl mailboxFutureImpl;
        switch (this.A00) {
            case 0:
                map.getClass();
                C1qL c1qL = GsG.A00;
                boolean A1V = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL, map, this.A02, 14));
                Uri uri = (Uri) 7zU.A0j(c1qL, map, 15);
                map.get(c1qL.A00(13));
                map.get(c1qL.A00(12));
                Number number = (Number) 7zU.A0j(c1qL, map, 11);
                mailboxObservableImpl = (MailboxObservableImpl) ((Ib3) this.A01).A03;
                hd1 = new Hd1(uri, number, A1V);
                mailboxObservableImpl.setResult(hd1);
                return;
            case 1:
                map.getClass();
                C1qL c1qL2 = GsG.A00;
                boolean A1V2 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL2, map, this.A02, 6));
                Number number2 = (Number) 7zU.A0j(c1qL2, map, 4);
                String str = (String) 7zU.A0j(c1qL2, map, 5);
                String str2 = (String) 7zU.A0j(c1qL2, map, 7);
                mailboxObservableImpl = (MailboxObservableImpl) ((A0S) this.A01).A02;
                hd1 = new HfV(number2, str, str2, A1V2);
                mailboxObservableImpl.setResult(hd1);
                return;
            case 2:
                map.getClass();
                C1qL c1qL3 = GsG.A00;
                String str3 = this.A02;
                boolean A1V3 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL3, map, str3, 10));
                String str4 = (String) 7zU.A0j(c1qL3, map, 8);
                Number number3 = (Number) MailboxFeature.getNonNullNotificationValue(c1qL3, map, str3, 9);
                mailboxObservableImpl = (MailboxObservableImpl) ((IbT) this.A01).A04;
                hd1 = new Hd0(number3, str4, A1V3);
                mailboxObservableImpl.setResult(hd1);
                return;
            case 3:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 79);
                obj = ((Iav) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 4:
                map.getClass();
                C1qL c1qL4 = GsJ.A00;
                String str5 = this.A02;
                boolean A1V4 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL4, map, str5, 5));
                String str6 = (String) MailboxFeature.getNonNullNotificationValue(c1qL4, map, str5, 0);
                mailboxObservableImpl = ((Ibs) this.A01).A01;
                hd1 = new HaC(A1V4, str6);
                mailboxObservableImpl.setResult(hd1);
                return;
            case 5:
                map.getClass();
                C1qL c1qL5 = GsK.A00;
                Uri uri2 = (Uri) 7zU.A0j(c1qL5, map, 6);
                MsysError msysError = (MsysError) 7zU.A0j(c1qL5, map, 3);
                Number number4 = (Number) MailboxFeature.getNonNullNotificationValue(c1qL5, map, this.A02, 5);
                mailboxObservableImpl = ((Ibg) this.A01).A04;
                hd1 = new Hdj(uri2, msysError, number4);
                mailboxObservableImpl.setResult(hd1);
                return;
            case 6:
                map.getClass();
                C1qL c1qL6 = GsK.A00;
                boolean A1V5 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL6, map, this.A02, 2));
                MsysError msysError2 = (MsysError) 7zU.A0j(c1qL6, map, 0);
                mailboxObservableImpl = (MailboxObservableImpl) ((Iar) this.A01).A02;
                hd1 = new HaD(msysError2, A1V5);
                mailboxObservableImpl.setResult(hd1);
                return;
            case 7:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(BDW.A00, map, this.A02, 3);
                obj = ((IbV) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 8:
                map.getClass();
                C1qL c1qL7 = BDX.A00;
                String str7 = this.A02;
                List list = (List) MailboxFeature.getNonNullNotificationValue(c1qL7, map, str7, 9);
                List list2 = (List) MailboxFeature.getNonNullNotificationValue(c1qL7, map, str7, 0);
                List list3 = (List) MailboxFeature.getNonNullNotificationValue(c1qL7, map, str7, 12);
                List list4 = (List) MailboxFeature.getNonNullNotificationValue(c1qL7, map, str7, 10);
                String str8 = (String) MailboxFeature.getNonNullNotificationValue(c1qL7, map, str7, 11);
                mailboxObservableImpl = (MailboxObservableImpl) ((Cxv) this.A01).A02;
                hd1 = new BvH(str8, list, list2, list3, list4);
                mailboxObservableImpl.setResult(hd1);
                return;
            case 9:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(GsL.A00, map, this.A02, 0);
                obj = ((Ibd) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 10:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(GsL.A00, map, this.A02, 75);
                obj = ((Ibl) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 11:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(BDY.A00, map, this.A02, 17);
                obj = ((Ibd) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 12:
                map.getClass();
                C1qL c1qL8 = 5P8.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL8, map, this.A02, 69);
                List list5 = (List) 7zU.A0j(c1qL8, map, 58);
                mailboxObservableImpl = ((Ibq) this.A01).A02;
                hd1 = new HXp(list5);
                mailboxObservableImpl.setResult(hd1);
                return;
            case 13:
            case 14:
            default:
                nonNullNotificationValue = A01(this, map);
                obj = ((IbM) this.A01).A04;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 15:
                nonNullNotificationValue = A01(this, map);
                obj = ((IbH) this.A01).A04;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 16:
                nonNullNotificationValue = A01(this, map);
                mailboxFutureImpl = ((Ibi) this.A01).A01;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 17:
                nonNullNotificationValue = A01(this, map);
                mailboxFutureImpl = ((Ibe) this.A01).A02;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 18:
                nonNullNotificationValue = A01(this, map);
                obj = ((Iax) this.A01).A04;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 19:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(8yZ.A00, map, this.A02, 0);
                obj = ((IbO) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 20:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 51);
                obj = ((Ibc) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 21:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 47);
                obj = ((IbV) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 22:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1yC.A00, map, this.A02, 17);
                obj = ((Ib5) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
        }
    }
}
