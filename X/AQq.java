package X;

import android.app.Application;
import android.content.Context;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.messengerprefs.advancedcrypto.securityalerts.SecurityAlertsActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.plugins.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow;
import com.facebook.messaging.notify.plugins.mutexapp.threadsettingsrow.threadlevelcustomizingdisabled.ThreadSettingsThreadLevelCustomizingDisabledNotificationsRow;
import com.facebook.messaging.notify.plugins.mutexapp.threadsettingsrow.threadlevelcustomizingenabled.ThreadSettingsThreadLevelCustomizingEnabledNotificationsRow;
import com.facebook.messaging.qrcode.fragments.fullscreenfragment.QrCodeFragment;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.List;

/* loaded from: AQq.class */
public final class AQq extends C00q implements C00m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQq(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AQq A00(Object obj, int i) {
        return new AQq(obj, i);
    }

    public static boolean A01(C00i c00i) {
        return ((FbSharedPreferences) c00i.get()).AZn(C9wz.A00().A0F("enable_all_chats_drawer"), false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        String str;
        String str2;
        C00m c00m;
        B9F b9f;
        String str3;
        switch (this.A00) {
            case 0:
                return 4YV.A0F(((B3y) this.A01).A01);
            case 1:
                return new A1u(this.A01, 2);
            case 2:
                return Float.valueOf(7zL.A03() * 7zQ.A0J(((C2k5) this.A01).A05).getDisplayMetrics().density * 4.0f);
            case 3:
                return 7zQ.A12(((C2k5) this.A01).A05, 83659);
            case 4:
                return Float.valueOf(C4Fk.A00(7zQ.A0J(((C2k5) this.A01).A05)));
            case 5:
                return Float.valueOf(C4Fk.A00.A01(7zQ.A0J(((C2k5) this.A01).A05)));
            case 6:
                return Boolean.valueOf(C2rY.A00(7zU.A0A(this.A01)));
            case 7:
                return Integer.valueOf(((int) TypedValue.applyDimension(1, 0.8f, 7zQ.A0L(((C2k5) this.A01).A05))) * 2);
            case 8:
                C00i c00i = ((C9wz) this.A01).A00.A00;
                boolean A1b = 7zM.A1b(1BK.A0S(c00i).BIb(C9wz.A00()));
                boolean AZn = 1BK.A0S(c00i).AZn(C9wz.A00().A0F("enable_all_chats_drawer"), false);
                boolean A01 = A01(c00i);
                boolean A012 = A01(c00i);
                boolean A013 = A01(c00i);
                1BK.A0S(c00i).AZn(C9wz.A00().A0F("enable_all_chats_drawer"), false);
                return new 8JL(A1b, AZn, A01, A012, A013, A01(c00i), A01(c00i));
            case 9:
            case 10:
                return 0Zi.A01(7zL.A09());
            case 11:
                2MX r0 = (2MX) this.A01;
                if (r0 != null) {
                    r0.CVh(0S2.A00);
                }
                return 04S.A00;
            case 12:
                ThreadSettingsNotificationsRow threadSettingsNotificationsRow = (ThreadSettingsNotificationsRow) this.A01;
                1Br.A0C(threadSettingsNotificationsRow.A02);
                return new CHf(threadSettingsNotificationsRow.A00, threadSettingsNotificationsRow.A01, threadSettingsNotificationsRow.A03, threadSettingsNotificationsRow.A04, threadSettingsNotificationsRow.A05, threadSettingsNotificationsRow.A06);
            case 13:
                ThreadSettingsThreadLevelCustomizingDisabledNotificationsRow threadSettingsThreadLevelCustomizingDisabledNotificationsRow = (ThreadSettingsThreadLevelCustomizingDisabledNotificationsRow) this.A01;
                1Br.A0C(threadSettingsThreadLevelCustomizingDisabledNotificationsRow.A02);
                return new CHf(threadSettingsThreadLevelCustomizingDisabledNotificationsRow.A00, threadSettingsThreadLevelCustomizingDisabledNotificationsRow.A01, threadSettingsThreadLevelCustomizingDisabledNotificationsRow.A03, threadSettingsThreadLevelCustomizingDisabledNotificationsRow.A04, threadSettingsThreadLevelCustomizingDisabledNotificationsRow.A05, threadSettingsThreadLevelCustomizingDisabledNotificationsRow.A06);
            case 14:
                ThreadSettingsThreadLevelCustomizingEnabledNotificationsRow threadSettingsThreadLevelCustomizingEnabledNotificationsRow = (ThreadSettingsThreadLevelCustomizingEnabledNotificationsRow) this.A01;
                1Br.A0C(threadSettingsThreadLevelCustomizingEnabledNotificationsRow.A02);
                return new CHf(threadSettingsThreadLevelCustomizingEnabledNotificationsRow.A00, threadSettingsThreadLevelCustomizingEnabledNotificationsRow.A01, threadSettingsThreadLevelCustomizingEnabledNotificationsRow.A03, threadSettingsThreadLevelCustomizingEnabledNotificationsRow.A04, threadSettingsThreadLevelCustomizingEnabledNotificationsRow.A05, threadSettingsThreadLevelCustomizingEnabledNotificationsRow.A06);
            case 15:
                return 2yD.A01(C1gb.A02((C1gb) 1Br.A0B(((CGk) this.A01).A00)), 36316684382185914L);
            case 16:
                return 7zQ.A12(((C2k5) this.A01).A05, 16979);
            case 17:
                return Integer.valueOf(0Zi.A01(7zL.A09()).A0u);
            case 18:
                return Integer.valueOf(0Zi.A01(7zL.A09()).A0v);
            case 19:
                return Integer.valueOf(0Zi.A01(7zL.A09()).A0w);
            case 20:
                return Integer.valueOf(0Zi.A01(7zL.A09()).A0x);
            case 21:
                return new A8Y((C2lh) this.A01, 0);
            case 22:
                return 7zQ.A10(1Br.A07(((C2iV) this.A01).A02), 36599868761379601L);
            case 23:
                b9f = (B9F) this.A01;
                str3 = "two_factor";
                B9F.A03(b9f, str3);
                return 04S.A00;
            case 24:
                Fragment fragment = (Fragment) this.A01;
                1BK.A0W().A0A(fragment.getContext(), C3o5.A0D(fragment.getContext(), SecurityAlertsActivity.class));
                return 04S.A00;
            case 25:
                b9f = (B9F) this.A01;
                str3 = "password_change";
                B9F.A03(b9f, str3);
                return 04S.A00;
            case 26:
                return 7zO.A0l((Fragment) this.A01, 16979);
            case 27:
            case 37:
                return this.A01;
            case 28:
            case 38:
                return 7zM.A1A(this.A01);
            case 29:
            case 39:
            default:
                return 7zS.A0D(this.A01);
            case 30:
                return ((82O) 1Bn.A0A(65571)).A00((Context) this.A01);
            case 31:
                AmJ amJ = (AmJ) this.A01;
                C5v c5v = amJ.A04;
                if (c5v != null) {
                    c5v.A00(amJ.A00);
                    return 04S.A00;
                }
                str2 = "membersViewData";
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            case 32:
                return new A92((8Vt) this.A01);
            case 33:
                return new C88x((5zC) this.A01);
            case 34:
                8hJ r02 = (8hJ) this.A01;
                int i = 8hJ.A09;
                c00m = r02.A05;
                c00m.invoke();
                return 04S.A00;
            case 35:
                8hJ r03 = (8hJ) this.A01;
                int i2 = 8hJ.A09;
                c00m = r03.A04;
                c00m.invoke();
                return 04S.A00;
            case 36:
                C1u3 c1u3 = C1u3.A4D;
                C2k5 c2k5 = (C2k5) this.A01;
                return C0s8.A14(new 0Oa(c1u3, 3yH.A09(c2k5, 2131967805), 3yH.A09(c2k5, 2131967804)), new 0Oa(C1u3.A2c, 3yH.A09(c2k5, 2131967803), 3yH.A09(c2k5, 2131967802)), new 0Oa(C1u3.A4l, 3yH.A09(c2k5, 2131967801), 3yH.A09(c2k5, 2131967800)));
            case 40:
                QrCodeFragment.A06((QrCodeFragment) this.A01);
                return 04S.A00;
            case 41:
                Application A09 = 7zU.A09((Fragment) this.A01);
                11T.A0A(A09);
                return new 8DQ(A09);
            case 42:
                return 7zO.A0U(new AR2(this.A01, 26));
            case 43:
                ((C8g2) this.A01).A00.CHA();
                return 04S.A00;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                return 83S.A00(this.A01, 4);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return Integer.valueOf(((C4s1) 7zO.A0p(this.A01)).A06());
            case 46:
                8H6 r04 = (8H6) this.A01;
                Context requireContext = r04.requireContext();
                ThreadKey threadKey = 8H6.A03(r04).A00;
                String str4 = 8H6.A03(r04).A01;
                FbUserSession fbUserSession = r04.A00;
                if (fbUserSession == null) {
                    str2 = "fbUserSession";
                    11T.A0L(str2);
                    throw 0Q8.createAndThrow();
                }
                1BL.A1F(threadKey, str4);
                8yC r05 = (8yC) 1Br.A0B(((C9kf) 1Lo.A04(requireContext, fbUserSession, (1BY) null, 68527)).A02);
                long j = threadKey.A04;
                long parseLong = Long.parseLong(str4);
                1Um AQV = r05.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0P = 1BK.A0P(AQV);
                1Um.A02(AQV, new A1W(A0P, r05, 4, j, parseLong), A0P, false);
                return 04S.A00;
            case ActionId.ON_START_END /* 47 */:
                C8ea c8ea = (C8ea) this.A01;
                9Aj r06 = c8ea.A01;
                String str5 = c8ea.A05;
                C8ub c8ub = (C8ub) r06;
                11T.A0F(str5, 0);
                C9l3 c9l3 = c8ub.A03;
                06Z r07 = c8ub.A02;
                List list = (List) c9l3.A0C.A08.A03.getValue();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (11T.A0O(((8KM) obj).A08, str5)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    8KM r08 = (8KM) obj;
                    if (r08 != null && (str = r08.A09) != null) {
                        ((9hP) 1Br.A0B(c9l3.A07)).A01(r07, c9l3.A0B.A00, str5, str);
                    }
                }
                return 04S.A00;
            case ActionId.QUEUED /* 48 */:
                C8ea c8ea2 = (C8ea) this.A01;
                Integer num = c8ea2.A03;
                Integer num2 = 0S2.A0C;
                9Aj r09 = c8ea2.A01;
                String str6 = c8ea2.A05;
                if (num == num2) {
                    C8ub c8ub2 = (C8ub) r09;
                    11T.A0F(str6, 0);
                    c8ub2.A03.A02(c8ub2.A02, num2, str6, false);
                } else {
                    boolean z = c8ea2.A07;
                    C8ub c8ub3 = (C8ub) r09;
                    11T.A0F(str6, 0);
                    c8ub3.A03.A02(c8ub3.A02, 0S2.A01, str6, z);
                }
                return 04S.A00;
            case ActionId.IN_PROGRESS /* 49 */:
                C9l3 c9l32 = ((C8ub) ((C8ea) this.A01).A01).A03;
                MutableLiveData mutableLiveData = c9l32.A04;
                8LS A00 = C9l3.A00(c9l32);
                8LS.A00(mutableLiveData, A00.A00, A00.A02, A00.A03, false);
                return 04S.A00;
        }
    }
}
