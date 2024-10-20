package X;

import com.facebook.messaging.users.displayname.ChangeDisplayNameSettingsFragment;
import com.facebook.pages.common.requesttime.shared.cancelappointment.RejectAppointmentActivity;
import java.util.ArrayList;

/* renamed from: X.Amn, reason: case insensitive filesystem */
/* loaded from: Amn.class */
public final class C1606Amn extends 1RM {
    public final int A00;
    public final Object A01;

    public C1606Amn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:275:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0927  */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Object, X.BR7] */
    /* JADX WARN: Type inference failed for: r0v489, types: [X.KTN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v549, types: [androidx.fragment.app.Fragment, java.lang.Object, com.facebook.messaging.users.displayname.ChangeDisplayNameSettingsFragment] */
    /* JADX WARN: Type inference failed for: r0v578, types: [X.Akx, androidx.fragment.app.Fragment, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1606Amn.A02(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void A03(Throwable th) {
        C01s A09;
        String str;
        String str2;
        F8q A0k;
        FEd fEd;
        boolean z;
        switch (this.A00) {
            case 0:
                0fH.A0r("sa_last_seen_timestamp_mutation", "Error in updating last seen time for SA: %s", th);
                return;
            case 1:
                A09 = 1BK.A09(((C4w) this.A01).A01);
                str = "MessengerAdsSendMessageUtil";
                str2 = "Messenger CTA Ads send failed";
                A09.D0v(str, str2);
                return;
            case 2:
                C4w c4w = (C4w) this.A01;
                BkK bkK = (BkK) c4w.A03.get();
                4YV.A0Z(bkK.A01).flowEndFail(bkK.A00, "graphql_failure", th.toString());
                A09 = 1BK.A09(c4w.A01);
                str = "MessengerAdsSendMessageUtil";
                str2 = "Messenger Inbox Ads send failed";
                A09.D0v(str, str2);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 12:
            default:
                return;
            case 9:
                CHh.A00(((Biq) this.A01).A00, "Compare OBID GraphQL failed");
                return;
            case 10:
                BeI beI = ((C4e) this.A01).A00;
                if (beI != null) {
                    AmK amK = beI.A00;
                    AmK.A07(amK.mView, amK, 7zO.A0D(amK).getString(2131957335), amK.getContext().getColor(2132214339));
                    return;
                }
                return;
            case 11:
                0fH.A0s("MontageAudiencePickerController", "Failed to fetch audience from GraphQL", th);
                ((CNW) this.A01).A02();
                return;
            case 13:
                0fH.A0g(th.toString(), "com.facebook.messaging.neo.threadviewbannerentrypoint.KidThreadBannerNotificationsManager", "Error with getManagingKidBannerViewModel future %s");
                return;
            case 14:
                1Iw r0 = (1Iw) this.A01;
                ArrayList A0s = AnonymousClass001.A0s();
                if (r0.A02 != null) {
                    r0.A0G(7zQ.A0V(A0s, 1), "updateState:Rooms2LiveFriendsPickerComponent.onUpdateUserList");
                    return;
                }
                return;
            case 15:
                ChangeDisplayNameSettingsFragment changeDisplayNameSettingsFragment = (ChangeDisplayNameSettingsFragment) this.A01;
                changeDisplayNameSettingsFragment.A06.A02("edit_name_preview_failed", th);
                ChangeDisplayNameSettingsFragment.A06(changeDisplayNameSettingsFragment, th);
                return;
            case 16:
                C1544Akx c1544Akx = (C1544Akx) this.A01;
                DMV dmv = c1544Akx.A01;
                if (dmv != null) {
                    dmv.dismiss();
                }
                A0k = AbJ.A0k(c1544Akx.A08);
                fEd = new FEd(2131957335);
                z = true;
                F8q.A00(fEd, A0k, z);
                return;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                RejectAppointmentActivity rejectAppointmentActivity = (RejectAppointmentActivity) this.A01;
                A0k = AbJ.A0k(rejectAppointmentActivity.A0C);
                fEd = new FEd(rejectAppointmentActivity.getResources().getString(2131957335));
                z = false;
                F8q.A00(fEd, A0k, z);
                return;
            case 22:
                ((Cc1) this.A01).A01.C47((Object) null, th);
                return;
            case 23:
                AfQ afQ = (AfQ) this.A01;
                afQ.A06 = null;
                afQ.postValue(new D1p(th));
                return;
        }
    }
}
