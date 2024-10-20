package X;

import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.familycenter.scheduledbreaks.ScheduledBreaksMailboxLifecycleListener;
import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.familycenter.supervision.SupervisionEdgeMailboxLifecycleListener;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.3aj, reason: invalid class name */
/* loaded from: 3aj.class */
public final class C3aj implements C1qM {
    public final int A00;
    public final Object A01;

    public C3aj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1qM
    public final void CNu(Set set) {
        1Um AQV;
        MailboxFutureImpl A0Q;
        A1f a1u;
        switch (this.A00) {
            case 0:
                if (set.contains("fetch_encrypted_backups_status_trigger")) {
                    ((C00m) this.A01).invoke();
                    return;
                }
                return;
            case 1:
                if (set.contains("fetch_linked_accounts")) {
                    C21k.A00((C21k) this.A01);
                    return;
                }
                return;
            case 2:
                if (set.contains("get_all_community_folders")) {
                    0fH.A0j("CommunityCapabilitiesStore", "GetCommunityFolders SP updated!");
                    C22G c22g = (C22G) this.A01;
                    c22g.A00(c22g.A00);
                    return;
                }
                return;
            case 3:
                if (set.contains("encrypted_backups_banners_list")) {
                    2bW.A00((2bW) this.A01);
                    return;
                }
                return;
            case 4:
                11T.A0F(set, 0);
                if (set.contains(AbstractC00603o4.A00(25))) {
                    2SU.A00((2SU) this.A01);
                    return;
                }
                return;
            case 5:
                if (set.contains("message_expiration_banners_list")) {
                    C2c7.A00((C2c7) this.A01);
                    return;
                }
                return;
            case 6:
                if (set.contains("message_expiration_banners_list")) {
                    C2c4.A00((C2c4) this.A01);
                    return;
                }
                return;
            case 7:
                if (set.contains("copresent_users_in_thread")) {
                    try {
                        21X r0 = (21X) this.A01;
                        long parseLong = Long.parseLong(((5SR) 1Br.A0B(r0.A03)).A01);
                        if (Long.valueOf(parseLong) != null) {
                            MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(r0.A01);
                            A09 a09 = new A09(r0, parseLong, 1);
                            AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
                            A0Q = 1BK.A0Q(AQV, a09);
                            a1u = new A1U(9, parseLong, mailboxFeature, A0Q);
                            break;
                        } else {
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        4zI.A03.A06("MsysCopresenceUsersNotificationHandler", "Formatting error %s", new Object[]{((5SR) 1Br.A0B(((21X) this.A01).A03)).A01});
                        return;
                    }
                } else {
                    return;
                }
            case 8:
                22D r02 = (22D) this.A01;
                if (set.contains("OrcaUserVisibleErrorNotifications")) {
                    22E r03 = r02.A04;
                    A1d a1d = new A1d(r02, 85);
                    AQV = r03.mMailboxApiHandleMetaProvider.AQV(0);
                    A0Q = 1BK.A0Q(AQV, a1d);
                    a1u = new A1f(r03, A0Q, 75);
                    break;
                } else {
                    return;
                }
            case 9:
                if (set.contains("queryAllQuietTimes") || set.contains("getGuardianID")) {
                    ScheduledBreaksMailboxLifecycleListener.A00((ScheduledBreaksMailboxLifecycleListener) this.A01, false);
                    return;
                }
                return;
            case 10:
                if (set.contains("getSupervisionEdge")) {
                    SupervisionEdgeMailboxLifecycleListener.A00((SupervisionEdgeMailboxLifecycleListener) this.A01);
                    return;
                }
                return;
            case 11:
                if (set.contains("AllRtcThreadOngoingCalls")) {
                    21H.A01((21H) this.A01);
                }
                if (set.contains("AllRtcRoomsOnThreads")) {
                    21H.A00((21H) this.A01);
                    return;
                }
                return;
            case 12:
                if (set.contains("RtcCallEventsHandleNew")) {
                    21U r04 = (21U) this.A01;
                    if (!2yD.A03(21T.A00((21T) 1Br.A0B(r04.A06)), 36315297108992707L)) {
                        21U.A00(r04);
                        return;
                    }
                    1QB r05 = (1QB) 1De.A00(r04.A00, 65841);
                    r05.A01 = new 3fG(r04);
                    r05.A04("CheckForNewRtcCallEvents");
                    ((1Qc) 1Br.A0B(r04.A01)).A03(1QB.A00(r05, "ForUiThread"), "None");
                    return;
                }
                return;
            case 13:
                if (set.contains("user_prefs_int")) {
                    21Z r06 = (21Z) this.A01;
                    MailboxFeature mailboxFeature2 = (MailboxFeature) 1Br.A0B(r06.A08);
                    PrivacyContext A00 = ((AnonymousClass224) 1Br.A0B(r06.A09)).A00("3172025686357200");
                    1Um AQV2 = mailboxFeature2.mMailboxApiHandleMetaProvider.AQV(0);
                    MailboxFutureImpl A0P = 1BK.A0P(AQV2);
                    1Um.A02(AQV2, new A0I(mailboxFeature2, A0P, A00, "avatar_effect_id", 5), A0P, false);
                    A0P.A00((Executor) 1Br.A0B(r06.A0A)).Cu4(new Iby(r06, 30));
                    return;
                }
                return;
            case 14:
                if (set.contains("rich_status_for_all_users") || (((2TI) 1Br.A0B(((2Tj) this.A01).A03)).A04(false) && set.contains("note_mentions_all"))) {
                    2Tj r07 = (2Tj) this.A01;
                    ReentrantReadWriteLock.ReadLock readLock = r07.A09.readLock();
                    readLock.lock();
                    try {
                        Iterator it = r07.A07.iterator();
                        while (it.hasNext()) {
                            ((2Ti) it.next()).CND();
                        }
                        return;
                    } finally {
                        readLock.unlock();
                    }
                }
                return;
            default:
                if (set.contains("user_prefs_string")) {
                    ((AnonymousClass228) 1Br.A0B(((C1zc) this.A01).A02)).A00();
                }
                if (set.contains("user_prefs_int")) {
                    ((AnonymousClass222) 1Br.A0B(((C1zc) this.A01).A01)).A00();
                }
                if (set.contains("user_prefs_bool")) {
                    ((AnonymousClass225) 1Br.A0B(((C1zc) this.A01).A00)).A00();
                    return;
                }
                return;
        }
        1Um.A02(AQV, a1u, A0Q, false);
    }
}
