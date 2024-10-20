package X;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.aibot.plugins.core.threadsettings.groupbutton.ThreadSettingsAiBotAssocFbGroupButton;
import com.facebook.messaging.communitymessaging.adminassist.adminassistupsell.AdminAssistUpsellBottomSheet;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment.EbEmployeeRecoveryCodeMigrationFragment;
import com.facebook.messaging.encryptedbackups.recoverycodemigration.fragment.EbProdRecoveryCodeMigrationFragment;
import com.facebook.messaging.model.messages.GroupPollingInfoProperties;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.platformmetadata.types.quickreply.QuickReplyItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.aibot.nullstate.cardstack.layoutmanager.AiBotGroupedCardStackLayoutManager;
import com.facebook.messaging.navigation.home.drawer.model.FolderNameDrawerFolderKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.note.ui.creation.NotesCreationFragment;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.reactions.customreactions.fragment.CustomReactionFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.9pw, reason: invalid class name */
/* loaded from: 9pw.class */
public final class C9pw implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9pw(8BQ r302, 8Ch r303, int i) {
        this.A00 = i;
        if (42 - i != 0) {
            this.A01 = r302;
            this.A02 = r303;
        } else {
            this.A02 = r303;
            this.A01 = r302;
        }
    }

    public C9pw(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C9pw A00(Object obj, Object obj2, int i) {
        return new C9pw(obj, obj2, i);
    }

    public static void A01(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C9pw(obj, obj2, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        AX5 ax5;
        int A052;
        int i2;
        String str;
        String str2;
        A1n a1n;
        switch (this.A00) {
            case 0:
                A052 = 0FI.A05(-101921690);
                11T.A0D(view);
                1vD.A00(view).Czy(new 8Gj(), "TrendingChannelsSeeMoreFragment");
                ((COv) 1Lm.A05(7zN.A06(this.A01), (FbUserSession) this.A02, 83648)).A03(63);
                i2 = 721052106;
                0FI.A0B(i2, A052);
                return;
            case 1:
                A052 = 0FI.A05(1479321655);
                11T.A0D(view);
                1vD.A00(view).Czy(new 8Gl(), "TrendingCommunitiesSeeMoreFragment");
                ((COv) 1Lm.A05(7zN.A06(this.A01), (FbUserSession) this.A02, 83648)).A03(64);
                i2 = 891760004;
                0FI.A0B(i2, A052);
                return;
            case 2:
                A052 = 0FI.A05(-885652367);
                8Cx r0 = ((8Yr) this.A02).A00;
                Object obj = this.A01;
                11T.A0F(obj, 0);
                2aK.A03((Integer) null, 2Zo.A00(), new AJW(obj, r0, null, 6), ViewModelKt.getViewModelScope(r0), 2);
                i2 = 1684359916;
                0FI.A0B(i2, A052);
                return;
            case 3:
                A052 = 0FI.A05(914447367);
                C5ty c5ty = (C5ty) this.A01;
                if (c5ty != null && (str = c5ty.A06) != null) {
                    Context context = ((ThreadSettingsAiBotAssocFbGroupButton) this.A02).A00;
                    C67Q c67q = (C67Q) 1Bu.A06(context, 49963);
                    1G1 A0F = 4YV.A0F(context);
                    Integer num = 0S2.A1G;
                    try {
                        Uri A03 = C0A2.A03(str);
                        if (A03 != null) {
                            c67q.A02(context, 4YU.A09(A03), A03, null, A0F, num, A0F.A02);
                        }
                    } catch (SecurityException unused) {
                    }
                    IllegalStateException A0h = 1BK.A0h();
                    0FI.A0B(2036582571, A052);
                    throw A0h;
                }
                i2 = -487882565;
                0FI.A0B(i2, A052);
                return;
            case 4:
                A052 = 0FI.A05(530612596);
                AaO aaO = (AaO) this.A01;
                AnonymousClass690 anonymousClass690 = (AnonymousClass690) this.A02;
                int i3 = anonymousClass690.A01;
                HeterogeneousMap A00 = anonymousClass690.A00();
                11T.A0A(A00);
                aaO.Bkq(A00, i3);
                i2 = 2041686296;
                0FI.A0B(i2, A052);
                return;
            case 5:
                A052 = 0FI.A05(570811140);
                AdminAssistUpsellBottomSheet adminAssistUpsellBottomSheet = (AdminAssistUpsellBottomSheet) this.A02;
                Context A06 = 7zN.A06(this.A01);
                94S r02 = MigBottomSheetDialogFragment.A01;
                1Bn.A0A(68203);
                7zR.A0W().A04(new CommunityMessagingLoggerModel(null, null, adminAssistUpsellBottomSheet.A00, adminAssistUpsellBottomSheet.A01, null, null, "setup_in_fb_button", AbE.A00(379), "transition_admin_assist_setup_to_fb", "channel_list", null, null));
                String str3 = adminAssistUpsellBottomSheet.A01;
                if (str3 == null) {
                    throw 1BK.A0h();
                }
                CAD.A00(A06, str3);
                i2 = 1695963018;
                0FI.A0B(i2, A052);
                return;
            case 6:
                A052 = 0FI.A05(845296859);
                ((8iG) this.A02).A02.A05.invoke();
                7zL.A1S(this.A01);
                i2 = -1063775986;
                0FI.A0B(i2, A052);
                return;
            case 7:
                A052 = 0FI.A05(897668906);
                ((8iG) this.A02).A02.A02.invoke();
                7zL.A1S(this.A01);
                i2 = -819118757;
                0FI.A0B(i2, A052);
                return;
            case 8:
                A052 = 0FI.A05(-982545211);
                ((C8hs) this.A02).A01.A05.invoke();
                7zL.A1S(this.A01);
                i2 = -1387002767;
                0FI.A0B(i2, A052);
                return;
            case 9:
                A052 = 0FI.A05(-920370981);
                ((C8hs) this.A02).A01.A02.invoke();
                7zL.A1S(this.A01);
                i2 = 1570548024;
                0FI.A0B(i2, A052);
                return;
            case 10:
                A052 = 0FI.A05(1338469762);
                C9kp c9kp = (C9kp) 1Bn.A0A(67678);
                11T.A0D(view);
                C8hs c8hs = (C8hs) this.A02;
                MigColorScheme migColorScheme = c8hs.A03;
                8Ca A01 = c9kp.A01(view, migColorScheme);
                MenuItem add = ((7QJ) A01).A04.add(2131958445);
                add.setIcon(7zO.A0F(C1u3.A1N, (C1u2) this.A01, migColorScheme));
                add.setOnMenuItemClickListener(new 9pM(c8hs, 1));
                A01.A00();
                i2 = 769784688;
                0FI.A0B(i2, A052);
                return;
            case 11:
                A052 = 0FI.A05(1358014862);
                1Bn.A0A(82368);
                String A0s = 7zR.A0s();
                C8bo c8bo = (C8bo) this.A02;
                long j = c8bo.A00;
                ThreadKey A07 = ThreadKey.A07(j);
                C1296Ad8 c1296Ad8 = (C1296Ad8) this.A01;
                String valueOf = String.valueOf(j);
                String str4 = c8bo.A04;
                String valueOf2 = String.valueOf(str4);
                String A002 = AbE.A00(383);
                String A003 = AbE.A00(692);
                LinkedHashMap A0A = 04R.A0A(7zQ.A1b("num_community_member", String.valueOf(c8bo.A02.A00)));
                if (A0s != null) {
                    A0A.put(1BJ.A00(2015), A0s);
                }
                c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, valueOf, valueOf2, null, null, null, "channel_list", A003, A002, null, A0A));
                AbT.A03(c8bo.A01, BME.A03, A07, str4, A0s);
                i2 = 1766729667;
                0FI.A0B(i2, A052);
                return;
            case 12:
                A052 = 0FI.A05(393113698);
                C9gm c9gm = C9gm.A00;
                7zL.A1L(((C2k6) this.A01).AeS());
                8aZ r03 = (8aZ) this.A02;
                c9gm.A00(r03.A01, r03.A02, r03.A00);
                i2 = 1268735234;
                0FI.A0B(i2, A052);
                return;
            case 13:
                A052 = 0FI.A05(1282959463);
                QI5 qi5 = (QI5) this.A02;
                CallerContext callerContext = QI5.A07;
                C00m c00m = qi5.A01;
                if (c00m != null) {
                    c00m.invoke();
                }
                7zL.A1R(this.A01);
                i2 = 1221409385;
                0FI.A0B(i2, A052);
                return;
            case 14:
                A052 = 0FI.A05(608038987);
                8E3 r04 = (8E3) this.A02;
                List list = C2lb.A0J;
                QuickReplyItem quickReplyItem = r04.A00;
                if (quickReplyItem != null && r04.A01 != null) {
                    8An r05 = (8An) this.A01;
                    11T.A0D(quickReplyItem);
                    ThreadKey threadKey = r04.A01;
                    11T.A0D(threadKey);
                    boolean A1W = 1BL.A1W(quickReplyItem, threadKey);
                    C6m8 c6m8 = r05.A00;
                    C6m8.A02(c6m8, new AEe(c6m8, new AFs(c6m8, quickReplyItem, threadKey)), A1W);
                }
                i2 = -2021120693;
                0FI.A0B(i2, A052);
                return;
            case 15:
                9Z6 r06 = (9Z6) this.A01;
                1Iw r07 = (1Iw) this.A02;
                int i4 = 9GJ.A00;
                C9bf c9bf = r06.A00.A09;
                if (c9bf != null) {
                    c9bf.A02.A0p();
                }
                1BK.A0W().A0A(r07.A0D, 4YU.A09(Uri.parse("fb-messenger://account_theme_picker?entrypoint=msgr_theme_picker")));
                return;
            case 16:
                A052 = 0FI.A05(440508032);
                BTg.A00(4YU.A08((View) this.A02), "passkey", AM0.A00);
                i2 = 84269994;
                0FI.A0B(i2, A052);
                return;
            case 17:
                A052 = 0FI.A05(-950361767);
                EbEmployeeRecoveryCodeMigrationFragment ebEmployeeRecoveryCodeMigrationFragment = ((8Z7) this.A02).A00.A00;
                7zU.A0P(ebEmployeeRecoveryCodeMigrationFragment.A03).A08("CREATE_PIN_TAP");
                9Z8 r08 = ebEmployeeRecoveryCodeMigrationFragment.A00;
                if (r08 != null) {
                    r08.A00();
                    i2 = 1681813362;
                    0FI.A0B(i2, A052);
                    return;
                }
                str2 = "viewData";
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            case 18:
                A052 = 0FI.A05(1979278808);
                EbProdRecoveryCodeMigrationFragment ebProdRecoveryCodeMigrationFragment = ((8VR) this.A02).A00.A00;
                7zU.A0P(ebProdRecoveryCodeMigrationFragment.A01).A08("CREATE_PIN_TAP");
                7zU.A1O(C97j.A0b, ebProdRecoveryCodeMigrationFragment);
                i2 = 2063451792;
                0FI.A0B(i2, A052);
                return;
            case 19:
                A052 = 0FI.A05(2141382150);
                EbProdRecoveryCodeMigrationFragment ebProdRecoveryCodeMigrationFragment2 = ((8VR) this.A02).A00.A00;
                7zU.A0P(ebProdRecoveryCodeMigrationFragment2.A01).A08("ENTER_40C_TAP");
                7zU.A1O(C97j.A0d, ebProdRecoveryCodeMigrationFragment2);
                i2 = 1781589829;
                0FI.A0B(i2, A052);
                return;
            case 20:
                A052 = 0FI.A05(-1421083886);
                0LS.A0A((Context) this.A01, 4iH.A00());
                1UG A08 = 1BK.A08(1Br.A02(((C9Iv) 7zO.A0p(this.A02)).A00), "yp_messenger_time_limit_client_event");
                if (A08.isSampled()) {
                    A08.A5c(AnonymousClass987.INTERACTION, "event_type");
                    A08.A5c(98F.A04, "event_name");
                    A08.A5c(BOb.A03, "module");
                    A08.BZL();
                }
                i2 = -150521161;
                0FI.A0B(i2, A052);
                return;
            case 21:
                A052 = 0FI.A05(1737429983);
                8eF r09 = (8eF) this.A02;
                Context A0L = 7zP.A0L((C2k6) this.A01);
                C3Ss.A01(98G.A05, 98A.A01, r09.A02);
                C0dv.A02(A0L, C65h.A04.A06(r09.A00, r09.A08));
                i2 = -213352392;
                0FI.A0B(i2, A052);
                return;
            case 22:
                A052 = 0FI.A05(311052732);
                Context A0L2 = 7zP.A0L((C2k6) this.A01);
                7zQ.A0d(A0L2).A09(A0L2, C0A2.A03("https://www.facebook.com/help/583011145134913/?ref=learn_more"), C5id.A0Z);
                i2 = 1131021800;
                0FI.A0B(i2, A052);
                return;
            case 23:
                A052 = 0FI.A05(1629874492);
                C9lG.A00((FbUserSession) this.A02, (C9lG) this.A01);
                i2 = -1983469066;
                0FI.A0B(i2, A052);
                return;
            case 24:
                A052 = 0FI.A05(1977528443);
                8Gb r010 = (8Gb) this.A02;
                7zR.A0z((Context) this.A01, 7zN.A0s(r010, 2131959417));
                8Gb.A03(r010);
                8Gb.A06(r010, true);
                i2 = 1999467152;
                0FI.A0B(i2, A052);
                return;
            case 25:
                A052 = 0FI.A05(-361983730);
                8Gb r011 = (8Gb) this.A02;
                Toast.makeText((Context) this.A01, 7zN.A0s(r011, 2131959414), 0).show();
                8Gb.A03(r011);
                8Gb.A06(r011, false);
                i2 = 255637216;
                0FI.A0B(i2, A052);
                return;
            case 26:
                A052 = 0FI.A05(1691658495);
                ((FIu) this.A02).A09((Context) this.A01, C0A2.A03("https://m.facebook.com/policies/other-policies/ais-terms?theme=light"), C5id.A0A);
                i2 = 100597820;
                0FI.A0B(i2, A052);
                return;
            case 27:
                A052 = 0FI.A05(395491197);
                ((FIu) this.A02).A09(((1Iw) this.A01).A0D, C0A2.A03(1BJ.A00(1410)), C5id.A0A);
                i2 = -552863218;
                0FI.A0B(i2, A052);
                return;
            case 28:
                A052 = 0FI.A05(-800059569);
                C8uR c8uR = (C8uR) this.A02;
                List list2 = C2lb.A0J;
                AiBotGroupedCardStackLayoutManager aiBotGroupedCardStackLayoutManager = c8uR.A03;
                if (aiBotGroupedCardStackLayoutManager != null && aiBotGroupedCardStackLayoutManager.A00) {
                    c8uR.A04.Bie(C9ls.A01(null, (8KO) this.A01, null, null, null, "stacked_cards"));
                    c8uR.A06.invoke();
                }
                i2 = 2107863473;
                0FI.A0B(i2, A052);
                return;
            case 29:
                A052 = 0FI.A05(1490582369);
                11T.A0D(view);
                C4N3 c4n3 = (C4N3) this.A02;
                11T.A0F(view, 0);
                FolderNameDrawerFolderKey folderNameDrawerFolderKey = C4Fm.A0U;
                View.OnClickListener onClickListener = c4n3.A00;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                i2 = 1130690022;
                0FI.A0B(i2, A052);
                return;
            case 30:
                A052 = 0FI.A05(1745902388);
                ((C62y) this.A01).CCj((GroupPollingInfoProperties) this.A02);
                i2 = -1505545492;
                0FI.A0B(i2, A052);
                return;
            case 31:
                A052 = 0FI.A05(1018013570);
                8Kh r012 = (8Kh) this.A02;
                Aa6 aa6 = (Aa6) this.A01;
                7zR.A0a().A0Q(5SW.A0V, r012.A00);
                aa6.CJn();
                i2 = -814959343;
                0FI.A0B(i2, A052);
                return;
            case 32:
                A052 = 0FI.A05(242028899);
                Uri uri = (Uri) this.A01;
                if (uri != null) {
                    Q4T q4t = (Q4T) this.A02;
                    4YV.A11(q4t.A03).execute(new SBN(uri, q4t));
                }
                i2 = 1398517860;
                0FI.A0B(i2, A052);
                return;
            case 33:
                A052 = 0FI.A05(-1600661413);
                C9hr c9hr = ((8GL) this.A01).A00;
                if (c9hr != null) {
                    c9hr.A02(7zL.A19(this.A02, 22));
                    i2 = 733893347;
                    0FI.A0B(i2, A052);
                    return;
                }
                str2 = "viewData";
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            case 34:
                A052 = 0FI.A05(1705704752);
                8fQ r013 = (8fQ) this.A02;
                long j2 = 8fQ.A04;
                r013.A01.invoke(Long.valueOf(((C1768As2) this.A01).A00));
                i2 = -851999610;
                0FI.A0B(i2, A052);
                return;
            case 35:
                A05 = 0FI.A05(1358006611);
                View.OnClickListener onClickListener2 = (View.OnClickListener) this.A02;
                if (onClickListener2 == null) {
                    ((6Kq) this.A01).A00();
                } else {
                    onClickListener2.onClick(view);
                }
                i = 2084756916;
                0FI.A0B(i, A05);
                return;
            case 36:
                A052 = 0FI.A05(-1904722679);
                RYj rYj = ((C9kW) this.A02).A00;
                if (rYj == null) {
                    str2 = "safetyInterventionInteractionLogger";
                    11T.A0L(str2);
                    throw 0Q8.createAndThrow();
                }
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("secondary_button_clicked", "true");
                RYj.A00(rYj, A0u, SGe.A00);
                ((View.OnClickListener) this.A01).onClick(view);
                i2 = -949660782;
                0FI.A0B(i2, A052);
                return;
            case 37:
                A052 = 0FI.A05(-386339502);
                AaO aaO2 = (AaO) this.A01;
                AnonymousClass690 anonymousClass6902 = (AnonymousClass690) this.A02;
                int i5 = anonymousClass6902.A01;
                String str5 = anonymousClass6902.A0H;
                11T.A0A(str5);
                Long l = anonymousClass6902.A0C;
                HeterogeneousMap A004 = anonymousClass6902.A00();
                11T.A0A(A004);
                aaO2.ANo(A004, l, str5, i5);
                i2 = 50318356;
                0FI.A0B(i2, A052);
                return;
            case 38:
                A052 = 0FI.A05(-845530732);
                AaO aaO3 = (AaO) this.A01;
                AnonymousClass690 anonymousClass6903 = (AnonymousClass690) this.A02;
                int i6 = anonymousClass6903.A01;
                HeterogeneousMap A005 = anonymousClass6903.A00();
                11T.A0A(A005);
                aaO3.Bkt(A005, i6);
                i2 = 869679700;
                0FI.A0B(i2, A052);
                return;
            case 39:
                A052 = 0FI.A05(-239933760);
                Message message = (Message) this.A02;
                if (message != null) {
                    ((7Lt) 1Bi.A03(66393)).A0K((Context) this.A01, message, 6Pq.A0H.toString());
                }
                i2 = -1387653334;
                0FI.A0B(i2, A052);
                return;
            case 40:
                A052 = 0FI.A05(-1505372154);
                C9fp.A00(7zU.A0Z(((8Cg) this.A02).A01), 0S2.A0Y, 0S2.A00, 0S2.A0C, Arrays.copyOf(new 03Y[0], 0));
                ((Dialog) this.A01).dismiss();
                i2 = 421651245;
                0FI.A0B(i2, A052);
                return;
            case 41:
                A05 = 0FI.A05(-897335318);
                C01i c01i = ((8Cg) this.A02).A01;
                Object value = 7zU.A0Z(c01i).A07.getValue();
                Object obj2 = value instanceof Ab4 ? (AX3) value : null;
                Integer num2 = 0S2.A01;
                Integer num3 = 0S2.A00;
                boolean z = true;
                if (obj2 == null) {
                    z = false;
                }
                03Y[] A1b = 7zQ.A1b("isCancelable", String.valueOf(z));
                C9fp.A00(7zU.A0Z(c01i), num2, num3, 0S2.A0C, Arrays.copyOf(A1b, A1b.length));
                if (obj2 != null) {
                    C9by c9by = ((A1n) obj2).A00;
                    c9by.A03.A00(new S8t(c9by));
                }
                ((Dialog) this.A01).dismiss();
                i = 1274304140;
                0FI.A0B(i, A05);
                return;
            case 42:
                A052 = 0FI.A05(-1642149846);
                8Ch r014 = (8Ch) this.A02;
                Integer num4 = 0S2.A0N;
                Integer num5 = 0S2.A00;
                C01i c01i2 = r014.A01;
                8Cz A0Z = 7zU.A0Z(c01i2);
                2aK.A03((Integer) null, (0DE) null, new AJX(new C9fp(num4, num5, num4, (03Y[]) Arrays.copyOf(new 03Y[0], 0)), A0Z, (0DR) null, 13), ViewModelKt.getViewModelScope(A0Z), 3);
                Object value2 = 7zU.A0Z(c01i2).A07.getValue();
                if ((value2 instanceof C90h) && (a1n = (A1n) value2) != null) {
                    final C9by c9by2 = a1n.A00;
                    c9by2.A03.A00(new Runnable() { // from class: X.ADn
                        public static final String __redex_internal_original_name = "InstallSession$$ExternalSyntheticLambda3";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C9by c9by3 = C9by.this;
                            if (c9by3.A02.A00 instanceof C90h) {
                                RLj rLj = c9by3.A01;
                                rLj.A00 = null;
                                rLj.A01 = true;
                                c9by3.A01(null);
                                c9by3.A00();
                            }
                        }
                    });
                }
                ((Dialog) this.A01).dismiss();
                i2 = -1265366955;
                0FI.A0B(i2, A052);
                return;
            case 43:
                A052 = 0FI.A05(551792414);
                ((Dialog) this.A01).dismiss();
                ((Fragment) this.A02).requireActivity().finish();
                i2 = 1663587764;
                0FI.A0B(i2, A052);
                return;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                A05 = 0FI.A05(1037366238);
                8Cj r015 = (8Cj) this.A02;
                CompoundButton compoundButton = (CompoundButton) this.A01;
                boolean z2 = true;
                if (compoundButton.getVisibility() != 0 || !compoundButton.isChecked()) {
                    z2 = false;
                }
                Integer num6 = 0S2.A00;
                8Cj.A01(r015, num6, num6, 7zQ.A1b("allowMobileData", String.valueOf(z2)));
                8Cz A0Z2 = 7zU.A0Z(r015.A01);
                Object value3 = A0Z2.A07.getValue();
                if ((value3 instanceof Ab5) && (ax5 = (Ab5) value3) != null) {
                    A0Z2.A01 = Boolean.valueOf(z2);
                    C9kc c9kc = A0Z2.A00;
                    C9by c9by3 = ((A1n) ax5).A00;
                    c9by3.A03.A00(new SDU(c9kc, c9by3, z2));
                }
                i = 527760655;
                0FI.A0B(i, A05);
                return;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                A052 = 0FI.A05(853959864);
                C8i3 c8i3 = (C8i3) this.A02;
                NotesCreationFragment notesCreationFragment = c8i3.A06.A01;
                List list3 = notesCreationFragment.A0E;
                if (list3 != null) {
                    boolean z3 = true;
                    boolean A1O = AnonymousClass001.A1O(notesCreationFragment.A01);
                    String str6 = notesCreationFragment.A0D;
                    if (str6 != null && str6.length() != 0) {
                        z3 = false;
                    }
                    if ((A1O && !z3) || NotesCreationFragment.A0C(notesCreationFragment)) {
                        notesCreationFragment.A0M.getValue();
                        LithoView lithoView = notesCreationFragment.A07;
                        if (lithoView == null) {
                            str2 = "lithoView";
                        } else {
                            Context A082 = 4YU.A08(lithoView);
                            Context context2 = notesCreationFragment.A02;
                            if (context2 == null) {
                                str2 = "context";
                            } else {
                                DR6 A012 = C5ic.A01(A082, (MigColorScheme) 1Bn.A0E(context2, (1BY) null, 16979));
                                A012.A00(2131964376);
                                A012.A06(2131964375);
                                C9oG.A01(A012, notesCreationFragment, 67, 2131964373);
                                A012.A0D(new C9ni(list3, notesCreationFragment, 10), 2131964374);
                                7zN.A13(A012);
                            }
                        }
                        11T.A0L(str2);
                        throw 0Q8.createAndThrow();
                    }
                    NotesCreationFragment.A0B(notesCreationFragment, list3);
                }
                C03513yC.A02(c8i3.A03, ((0PI) this.A01).element);
                i2 = -261320789;
                0FI.A0B(i2, A052);
                return;
            default:
                A052 = 0FI.A05(-321482630);
                if (!((CustomReactionFragment) this.A02).A1C().A09) {
                    BottomSheetBehavior A02 = BottomSheetBehavior.A02((View) this.A01);
                    11T.A0A(A02);
                    A02.A0B(5);
                }
                i2 = 1067090188;
                0FI.A0B(i2, A052);
                return;
        }
    }
}
