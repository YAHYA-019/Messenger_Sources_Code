package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.messengerprefs.notif.NotifSettingsUpdateHandler;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: D93.class */
public final class D93 implements Runnable {
    public static final String __redex_internal_original_name = "NotifSettingsUpdateHandler$updateSettings$1$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ NotifSettingsUpdateHandler A01;
    public final /* synthetic */ MailboxNullable A02;

    public D93(FbUserSession fbUserSession, NotifSettingsUpdateHandler notifSettingsUpdateHandler, MailboxNullable mailboxNullable) {
        this.A02 = mailboxNullable;
        this.A01 = notifSettingsUpdateHandler;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BET bet = (BET) this.A02.value;
        if (bet != null) {
            NotifSettingsUpdateHandler notifSettingsUpdateHandler = this.A01;
            FbUserSession fbUserSession = this.A00;
            CmF cmF = (C3mH) 1Br.A0B(notifSettingsUpdateHandler.A02);
            if (AbL.A0O(cmF.A01).AZk(36324771805810735L)) {
                long j = ((1qX) bet).mResultSet.getLong(0, 1);
                if (CmF.A00(cmF) != j) {
                    1G2 r0 = 1NK.A06;
                    1G2 r311 = AbL.A1b(cmF.A03) ? 1NK.A2i : 1NK.A2c;
                    1Ql A08 = 1Br.A08(cmF.A00);
                    A08.CaH(r311, j);
                    A08.commit();
                    ((CNH) 1Br.A0B(cmF.A02)).A03(CmF.A00(cmF));
                }
            }
            Bsd bsd = (Bsd) 1Br.A0B(notifSettingsUpdateHandler.A05);
            if (((21W) 1Br.A0B(bsd.A02)).A05()) {
                boolean z = ((1qX) bet).mResultSet.getBoolean(0, 4);
                C00i c00i = bsd.A01.A00;
                FbSharedPreferences A0S = 1BK.A0S(c00i);
                1G2 r02 = 1NK.A2n;
                if (AbH.A1b(A0S, r02) != z) {
                    1Ql.A03(r02, c00i.get(), z);
                    CNH cnh = (CNH) 1Br.A0B(bsd.A03);
                    if (CNH.A01(cnh)) {
                        1UG A00 = CNH.A00(cnh);
                        if (A00.isSampled()) {
                            AbF.A1L(A00, "show_previews_client_synced");
                            A00.A5H("toggle_enabled", Boolean.valueOf(z));
                            A00.BZL();
                        }
                    }
                }
            }
            C5N c5n = (C5N) 1Br.A0B(notifSettingsUpdateHandler.A04);
            if (((C3Np) 1Br.A0B(c5n.A02)).A00()) {
                boolean z2 = ((1qX) bet).mResultSet.getBoolean(0, 25);
                C00i c00i2 = c5n.A00.A00;
                FbSharedPreferences A0S2 = 1BK.A0S(c00i2);
                1G2 r03 = 1NK.A2g;
                if (z2 != AbH.A1b(A0S2, r03)) {
                    1Ql.A03(r03, c00i2.get(), z2);
                    0fH.A0j("NotesNotificationController", "Notes Notification setting is synced to server");
                }
            }
            C5h c5h = (C5h) 1Br.A0B(notifSettingsUpdateHandler.A00);
            if (c5h.A00()) {
                boolean z3 = ((1qX) bet).mResultSet.getBoolean(0, 28);
                C00i c00i3 = c5h.A01.A00;
                FbSharedPreferences A0S3 = 1BK.A0S(c00i3);
                1G9 r04 = c5h.A05;
                if (z3 != AbH.A1b(A0S3, r04)) {
                    1Ql.A03(r04, c00i3.get(), z3);
                    0fH.A0j("BackgroundAccountNotificationController", "Background Account Notification setting is synced to server");
                }
            }
            CIg cIg = (CIg) 1Br.A0B(notifSettingsUpdateHandler.A01);
            if (cIg.A03()) {
                boolean z4 = ((1qX) bet).mResultSet.getBoolean(0, 22);
                C00i c00i4 = cIg.A00.A00;
                FbSharedPreferences A0S4 = 1BK.A0S(c00i4);
                1G2 r05 = 1NK.A2d;
                if (A0S4.AZn(r05, true) != z4) {
                    1Ql.A03(r05, c00i4.get(), z4);
                    0fH.A0j("CommunityMessengerNotificationController", "New and Popular channel selector synced to server");
                }
                boolean z5 = ((1qX) bet).mResultSet.getBoolean(0, cIg.A02() ? 31 : 23);
                FbSharedPreferences A0S5 = 1BK.A0S(c00i4);
                1G2 r06 = 1NK.A2Q;
                if (A0S5.AZn(r06, true) != z5) {
                    1Ql.A03(r06, c00i4.get(), z5);
                    0fH.A0j("CommunityMessengerNotificationController", "Channel Invitation selector synced to server");
                }
                boolean z6 = ((1qX) bet).mResultSet.getBoolean(0, 27);
                FbSharedPreferences A0S6 = 1BK.A0S(c00i4);
                1G2 r07 = 1NK.A2T;
                if (A0S6.AZn(r07, true) != z6) {
                    1Ql.A03(r07, c00i4.get(), z6);
                    0fH.A0j("CommunityMessengerNotificationController", "Community chat selector synced to server");
                }
                boolean z7 = ((1qX) bet).mResultSet.getBoolean(0, 30);
                FbSharedPreferences A0S7 = 1BK.A0S(c00i4);
                1G2 r08 = 1NK.A2M;
                if (A0S7.AZn(r08, true) != z7) {
                    1Ql.A03(r08, c00i4.get(), z7);
                    0fH.A0j("CommunityMessengerNotificationController", "Community chat selector synced to server");
                }
            }
            CHJ chj = (CHJ) 1Lm.A06(fbUserSession, 83260);
            C00i c00i5 = chj.A04.A00;
            if (((21W) c00i5.get()).A08() || ((21W) c00i5.get()).A06()) {
                chj.A01 = true;
                chj.A00 = ((1qX) bet).mResultSet.getInteger(0, 17);
                CHJ.A00(chj, bet);
                CNH cnh2 = (CNH) 1Br.A0B(chj.A06);
                int i = chj.A00;
                1UG A002 = CNH.A00(cnh2);
                String str = i == 1 ? "mib" : "messenger";
                if (A002.isSampled()) {
                    AbF.A1L(A002, "app_selector_client_synced");
                    A002.A7R("app_selected", str);
                    A002.BZL();
                }
            }
            BfD bfD = (BfD) 1Br.A0B(notifSettingsUpdateHandler.A03);
            boolean z8 = ((1qX) bet).mResultSet.getBoolean(0, 32);
            C00i c00i6 = bfD.A00.A00;
            FbSharedPreferences A0S8 = 1BK.A0S(c00i6);
            1G2 r09 = 1NK.A2f;
            if (AbH.A1b(A0S8, r09) != z8) {
                1Ql.A03(r09, c00i6.get(), z8);
            }
        }
    }
}
