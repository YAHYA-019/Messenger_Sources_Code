package X;

import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxHealthReport;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* loaded from: Czo.class */
public final class Czo implements C1y5 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public Czo(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static NotificationScope A00(C1y2 c1y2, Object obj, String str, int i) {
        return c1y2.A00(new Czo(str, obj, i), str);
    }

    public static Object A01(Czo czo, java.util.Map map) {
        map.getClass();
        return MailboxFeature.getNonNullNotificationValue(5P8.A00, map, czo.A02, 69);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [X.4l4, X.1qX] */
    /* JADX WARN: Type inference failed for: r0v110, types: [X.4l6, X.1qX] */
    /* JADX WARN: Type inference failed for: r0v112, types: [X.4l8, X.1qX] */
    /* JADX WARN: Type inference failed for: r0v738, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    /* JADX WARN: Type inference failed for: r1v26, types: [X.4lB] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.4lC] */
    @Override // X.C1y5
    public void CHh(java.util.Map map) {
        MailboxObservableImpl mailboxObservableImpl;
        1qX r308;
        Object nonNullNotificationValue;
        MailboxFutureImpl mailboxFutureImpl;
        Object obj;
        switch (this.A00) {
            case 0:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 58);
                mailboxFutureImpl = ((Cyf) this.A01).A02;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 1:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 15);
                mailboxFutureImpl = ((C3b0) this.A01).A01;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 2:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 65);
                obj = ((C3b6) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 3:
                map.getClass();
                CQLResultSet cQLResultSet = (CQLResultSet) MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 2);
                mailboxObservableImpl = (MailboxObservableImpl) ((C1251Abt) this.A01).A03;
                r308 = new 1qX(cQLResultSet);
                mailboxObservableImpl.setResult(r308);
                return;
            case 4:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 66);
                obj = ((C3b6) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 5:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 64);
                mailboxFutureImpl = ((C3ay) this.A01).A01;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 6:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(1xC.A00, map, this.A02, 1);
                obj = ((Czf) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 7:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(C6qk.A00, map, this.A02, 1);
                mailboxFutureImpl = ((Cxi) this.A01).A02;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 8:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(C6qk.A00, map, this.A02, 3);
                mailboxFutureImpl = ((Cxr) this.A01).A02;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 9:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(BDX.A00, map, this.A02, 7);
                mailboxFutureImpl = ((Cyl) this.A01).A01;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 10:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(BDX.A00, map, this.A02, 8);
                obj = ((Czi) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 11:
                map.getClass();
                C1qL c1qL = BDX.A00;
                String str = this.A02;
                List list = (List) MailboxFeature.getNonNullNotificationValue(c1qL, map, str, 9);
                String str2 = (String) MailboxFeature.getNonNullNotificationValue(c1qL, map, str, 11);
                mailboxObservableImpl = (MailboxObservableImpl) ((Czi) this.A01).A02;
                r308 = new BnT(str2, list);
                mailboxObservableImpl.setResult(r308);
                return;
            case 12:
                map.getClass();
                C1qL c1qL2 = BDX.A00;
                String str3 = this.A02;
                List list2 = (List) MailboxFeature.getNonNullNotificationValue(c1qL2, map, str3, 9);
                List list3 = (List) MailboxFeature.getNonNullNotificationValue(c1qL2, map, str3, 0);
                List list4 = (List) MailboxFeature.getNonNullNotificationValue(c1qL2, map, str3, 12);
                List list5 = (List) MailboxFeature.getNonNullNotificationValue(c1qL2, map, str3, 10);
                String str4 = (String) MailboxFeature.getNonNullNotificationValue(c1qL2, map, str3, 11);
                mailboxObservableImpl = (MailboxObservableImpl) ((CyC) this.A01).A03;
                r308 = new BvI(str4, list2, list3, list4, list5);
                mailboxObservableImpl.setResult(r308);
                return;
            case 13:
                map.getClass();
                C1qL c1qL3 = 22B.A00;
                String str5 = this.A02;
                CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxFeature.getNonNullNotificationValue(c1qL3, map, str5, 20);
                CQLResultSet cQLResultSet3 = (CQLResultSet) MailboxFeature.getNonNullNotificationValue(c1qL3, map, str5, 13);
                CQLResultSet cQLResultSet4 = (CQLResultSet) MailboxFeature.getNonNullNotificationValue(c1qL3, map, str5, 10);
                CQLResultSet cQLResultSet5 = (CQLResultSet) 7zU.A0j(c1qL3, map, 19);
                CQLResultSet cQLResultSet6 = (CQLResultSet) 7zU.A0j(c1qL3, map, 18);
                Number number = (Number) 7zU.A0j(c1qL3, map, 17);
                Number number2 = (Number) 7zU.A0j(c1qL3, map, 16);
                Number number3 = (Number) 7zU.A0j(c1qL3, map, 15);
                Number number4 = (Number) 7zU.A0j(c1qL3, map, 14);
                CQLResultSet cQLResultSet7 = (CQLResultSet) 7zU.A0j(c1qL3, map, 0);
                mailboxObservableImpl = ((31N) this.A01).A05;
                ?? r0 = new 1qX(cQLResultSet2);
                ?? r02 = new 1qX(cQLResultSet3);
                ?? r03 = new 1qX(cQLResultSet4);
                1qX r313 = null;
                1qX r314 = cQLResultSet5 == null ? null : new 1qX(cQLResultSet5);
                1qX r311 = cQLResultSet6 == null ? null : new 1qX(cQLResultSet6);
                if (cQLResultSet7 != null) {
                    r313 = new 1qX(cQLResultSet7);
                }
                r308 = new AcC(r313, (C07904l8) r03, (C07884l6) r02, r311, r314, (C07864l4) r0, number, number2, number3, number4);
                mailboxObservableImpl.setResult(r308);
                return;
            case 14:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(GsL.A00, map, this.A02, 73);
                obj = ((Cyc) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 15:
                map.getClass();
                C1qL c1qL4 = BDY.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL4, map, this.A02, 17);
                java.util.Map map2 = (java.util.Map) 7zU.A0j(c1qL4, map, 27);
                mailboxObservableImpl = ((Cyd) this.A01).A02;
                r308 = new Bj7(map2);
                mailboxObservableImpl.setResult(r308);
                return;
            case 16:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(BDY.A00, map, this.A02, 17);
                obj = ((CyG) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 17:
                nonNullNotificationValue = A01(this, map);
                obj = ((Cxu) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 18:
                nonNullNotificationValue = A01(this, map);
                obj = ((Czc) this.A01).A04;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 19:
                nonNullNotificationValue = A01(this, map);
                obj = ((CyV) this.A01).A05;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 20:
                nonNullNotificationValue = A01(this, map);
                obj = ((CyS) this.A01).A04;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 21:
                map.getClass();
                C1qL c1qL5 = 5P8.A00;
                boolean A1V = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL5, map, this.A02, 69));
                Number number5 = (Number) 7zU.A0j(c1qL5, map, 70);
                Number number6 = (Number) 7zU.A0j(c1qL5, map, 72);
                map.get(c1qL5.A00(49));
                mailboxObservableImpl = (MailboxObservableImpl) ((Cxw) this.A01).A04;
                r308 = new 5PA(number5, number6, A1V);
                mailboxObservableImpl.setResult(r308);
                return;
            case 22:
                map.getClass();
                C1qL c1qL6 = 5P8.A00;
                boolean A1V2 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL6, map, this.A02, 69));
                Number number7 = (Number) 7zU.A0j(c1qL6, map, 70);
                Number number8 = (Number) 7zU.A0j(c1qL6, map, 72);
                map.get(c1qL6.A00(49));
                mailboxObservableImpl = (MailboxObservableImpl) ((CyT) this.A01).A03;
                r308 = new BrB(number7, number8, A1V2);
                mailboxObservableImpl.setResult(r308);
                return;
            case 23:
                map.getClass();
                C1qL c1qL7 = 5P8.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL7, map, this.A02, 69);
                List list6 = (List) 7zU.A0j(c1qL7, map, 58);
                mailboxObservableImpl = ((Cyx) this.A01).A02;
                r308 = new BjB(list6);
                mailboxObservableImpl.setResult(r308);
                return;
            case 24:
                map.getClass();
                C1qL c1qL8 = 5P8.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL8, map, this.A02, 69);
                List list7 = (List) 7zU.A0j(c1qL8, map, 58);
                mailboxObservableImpl = ((Cyo) this.A01).A02;
                r308 = new BjC(list7);
                mailboxObservableImpl.setResult(r308);
                return;
            case 25:
                nonNullNotificationValue = A01(this, map);
                obj = ((CzW) this.A01).A04;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 26:
                map.getClass();
                C1qL c1qL9 = 5P8.A00;
                boolean A1V3 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL9, map, this.A02, 69));
                List list8 = (List) 7zU.A0j(c1qL9, map, 55);
                mailboxObservableImpl = (MailboxObservableImpl) ((CzX) this.A01).A03;
                r308 = new Bnr(list8, A1V3);
                mailboxObservableImpl.setResult(r308);
                return;
            case 27:
                nonNullNotificationValue = A01(this, map);
                mailboxFutureImpl = ((CyH) this.A01).A02;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 28:
                nonNullNotificationValue = A01(this, map);
                obj = ((CyT) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 29:
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
            case ActionId.ON_START_END /* 47 */:
            case ActionId.UNKNOWN /* 51 */:
            default:
                nonNullNotificationValue = A01(this, map);
                obj = ((Cxx) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 30:
            case 35:
            case 39:
                nonNullNotificationValue = A01(this, map);
                obj = ((Czc) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 31:
            case 32:
            case 33:
            case 34:
                nonNullNotificationValue = A01(this, map);
                obj = ((Czb) this.A01).A04;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 36:
                nonNullNotificationValue = A01(this, map);
                mailboxFutureImpl = ((Cys) this.A01).A01;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 37:
                nonNullNotificationValue = A01(this, map);
                mailboxFutureImpl = ((Cyp) this.A01).A01;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 38:
                nonNullNotificationValue = A01(this, map);
                mailboxFutureImpl = ((CyI) this.A01).A02;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 40:
                map.getClass();
                C1qL c1qL10 = 5P8.A00;
                String str6 = (String) 7zU.A0j(c1qL10, map, 60);
                String str7 = (String) 7zU.A0j(c1qL10, map, 64);
                MailboxFeature.getNonNullNotificationValue(c1qL10, map, this.A02, 56);
                mailboxObservableImpl = ((Cyv) this.A01).A03;
                r308 = new Bns(str6, str7);
                mailboxObservableImpl.setResult(r308);
                return;
            case 41:
                map.getClass();
                C1qL c1qL11 = 5P8.A00;
                String str8 = (String) 7zU.A0j(c1qL11, map, 60);
                String str9 = (String) 7zU.A0j(c1qL11, map, 64);
                MailboxFeature.getNonNullNotificationValue(c1qL11, map, this.A02, 56);
                mailboxObservableImpl = ((Cyz) this.A01).A06;
                r308 = new Bnt(str8, str9);
                mailboxObservableImpl.setResult(r308);
                return;
            case 42:
                map.getClass();
                C1qL c1qL12 = 5P8.A00;
                String str10 = (String) 7zU.A0j(c1qL12, map, 60);
                String str11 = (String) 7zU.A0j(c1qL12, map, 64);
                MailboxFeature.getNonNullNotificationValue(c1qL12, map, this.A02, 56);
                mailboxObservableImpl = ((Cyt) this.A01).A02;
                r308 = new Bnu(str10, str11);
                mailboxObservableImpl.setResult(r308);
                return;
            case 43:
                map.getClass();
                C1qL c1qL13 = 5P8.A00;
                String str12 = (String) 7zU.A0j(c1qL13, map, 60);
                String str13 = (String) 7zU.A0j(c1qL13, map, 64);
                MailboxFeature.getNonNullNotificationValue(c1qL13, map, this.A02, 56);
                mailboxObservableImpl = ((Cyk) this.A01).A01;
                r308 = new 7TK(str12, str13);
                mailboxObservableImpl.setResult(r308);
                return;
            case 46:
                nonNullNotificationValue = A01(this, map);
                obj = ((CzX) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case ActionId.QUEUED /* 48 */:
                map.getClass();
                C1qL c1qL14 = 5P8.A00;
                MailboxFeature.getNonNullNotificationValue(c1qL14, map, this.A02, 69);
                MailboxHealthReport mailboxHealthReport = (MailboxHealthReport) 7zU.A0j(c1qL14, map, 0);
                mailboxObservableImpl = ((CyJ) this.A01).A02;
                r308 = new BjA(mailboxHealthReport);
                mailboxObservableImpl.setResult(r308);
                return;
            case ActionId.IN_PROGRESS /* 49 */:
                nonNullNotificationValue = A01(this, map);
                obj = ((Cyb) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case 50:
                nonNullNotificationValue = A01(this, map);
                mailboxFutureImpl = ((Cy3) this.A01).A01;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(C00683ob.A00, map, this.A02, 6);
                mailboxFutureImpl = ((Cz0) this.A01).A00;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(8yZ.A00, map, this.A02, 5);
                obj = ((Cyc) this.A01).A03;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case ActionId.QUEUEING_BEGIN /* 54 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 45);
                obj = ((Cxp) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 24);
                obj = ((Czj) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case ActionId.QUEUEING_FAIL /* 56 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 25);
                obj = ((Cxq) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(5Xd.A00, map, this.A02, 34);
                obj = ((Cze) this.A01).A02;
                mailboxFutureImpl = (MailboxObservableImpl) obj;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                map.getClass();
                C1qL c1qL15 = 22C.A00;
                String str14 = (String) MailboxFeature.getNonNullNotificationValue(c1qL15, map, this.A02, 1);
                List list9 = (List) 7zU.A0j(c1qL15, map, 33);
                mailboxObservableImpl = ((Cz3) this.A01).A04;
                r308 = new Bnw(str14, list9);
                mailboxObservableImpl.setResult(r308);
                return;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                map.getClass();
                nonNullNotificationValue = MailboxFeature.getNonNullNotificationValue(22C.A00, map, this.A02, 32);
                mailboxFutureImpl = ((Cyw) this.A01).A05;
                mailboxFutureImpl.setResult(nonNullNotificationValue);
                return;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                map.getClass();
                C1qL c1qL16 = 22C.A00;
                String str15 = this.A02;
                Number number9 = (Number) MailboxFeature.getNonNullNotificationValue(c1qL16, map, str15, 42);
                boolean A1V4 = AnonymousClass001.A1V(MailboxFeature.getNonNullNotificationValue(c1qL16, map, str15, 43));
                Number number10 = (Number) 7zU.A0j(c1qL16, map, 38);
                byte[] bArr = (byte[]) 7zU.A0j(c1qL16, map, 34);
                Uri uri = (Uri) 7zU.A0j(c1qL16, map, 40);
                String str16 = (String) 7zU.A0j(c1qL16, map, 39);
                MailboxHealthReport mailboxHealthReport2 = (MailboxHealthReport) 7zU.A0j(c1qL16, map, 41);
                mailboxObservableImpl = ((C31z) this.A01).A03;
                r308 = new 69B(uri, mailboxHealthReport2, number9, number10, str16, bArr, A1V4);
                mailboxObservableImpl.setResult(r308);
                return;
            case ActionId.COUNTER /* 61 */:
                map.getClass();
                CQLResultSet cQLResultSet8 = (CQLResultSet) MailboxFeature.getNonNullNotificationValue(C8ya.A00, map, this.A02, 10);
                mailboxObservableImpl = (MailboxObservableImpl) ((CyV) this.A01).A05;
                r308 = new 1qX(cQLResultSet8);
                mailboxObservableImpl.setResult(r308);
                return;
        }
    }
}
