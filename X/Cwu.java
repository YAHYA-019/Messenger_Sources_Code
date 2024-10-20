package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.communityprofile.CommunityEditingProfileFragment;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.plugins.memberlistitem.bannedmemberscountlistitem.BannedMembersCountListItemImplementation;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Cwu.class */
public final class Cwu implements AnonymousClass553 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public Cwu(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = obj3;
    }

    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        String str;
        UserKey userKey;
        switch (this.A00) {
            case 0:
                11T.A0F(view, 0);
                CMt cMt = (CMt) 7zP.A0h((FbUserSession) this.A03, (1Iw) this.A01, 83067);
                1pI A00 = 1vD.A00(view);
                Parcelable A002 = ParcelableSecondaryData.A00((ParcelableSecondaryData) this.A02, Community.class, null);
                if (A002 == null) {
                    throw 1BK.A0h();
                }
                Community community = (Community) A002;
                1BK.A1M(community, A00);
                2Ov communityEditingProfileFragment = new CommunityEditingProfileFragment();
                communityEditingProfileFragment.setArguments(AbH.A05(community, "community"));
                A00.Czy(communityEditingProfileFragment, 7zK.A00(ActionId.APPLY_OPTIMISTICS));
                CMt.A00(cMt, (String) null, (String) null, 2, 0, 7zU.A07(community), 7zQ.A0C(community), 7zQ.A0H((User) this.A04));
                return;
            case 1:
                1pI r0 = (1pI) this.A02;
                if (r0 != null) {
                    ThreadKey threadKey = (ThreadKey) this.A04;
                    ParcelableSecondaryData parcelableSecondaryData = (ParcelableSecondaryData) this.A03;
                    1Iw r02 = (1Iw) this.A01;
                    if (threadKey != null) {
                        DJ4 dj4 = (DJ4) 1Bn.A0A(82367);
                        String str2 = null;
                        Community community2 = parcelableSecondaryData != null ? (Community) ParcelableSecondaryData.A00(parcelableSecondaryData, Community.class, null) : null;
                        11T.A0A(r02.A0D);
                        if (community2 != null) {
                            str2 = community2.A0U;
                            str = community2.A0T;
                        } else {
                            str = null;
                        }
                        Cil cil = (Cil) dj4;
                        String A0s = 7zR.A0s();
                        C00i A0R = AbF.A0R(cil.A00);
                        AbT.A02(EnumC3499Mfu.A0v, threadKey, str2, str, A0s, "community_settings", "community_member_list", "invite_button", "render_community_direct_invite_sheet");
                        A0R.get();
                        AbT.A03(r0, BME.A08, threadKey, str, A0s);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                11T.A0F(view, 0);
                BannedMembersCountListItemImplementation bannedMembersCountListItemImplementation = (BannedMembersCountListItemImplementation) this.A04;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                AdC adC = (AdC) 7zO.A0p(this.A01);
                D55 d55 = bannedMembersCountListItemImplementation.A05;
                if (d55 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                User user = d55.A04;
                String str3 = user.A13;
                long A03 = AbG.A03(str3);
                ThreadSummary threadSummary = bannedMembersCountListItemImplementation.A04;
                if (threadSummary == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                ThreadKey threadKey2 = threadSummary.A0n;
                long j = threadKey2.A04;
                Fragment fragment = (Fragment) this.A03;
                C1296Ad8 A0O = AbJ.A0O(bannedMembersCountListItemImplementation.A02);
                ThreadKey threadKey3 = threadSummary.A0l;
                String A0w = threadKey3 != null ? 1BK.A0w(threadKey3) : null;
                String valueOf = String.valueOf(AbF.A15(threadSummary));
                String A0w2 = 1BK.A0w(threadKey2);
                Context context = bannedMembersCountListItemImplementation.A00;
                A0O.A04(new CommunityMessagingLoggerModel(null, null, A0w, valueOf, A0w2, str3, "unban_button", "chat_member_list", "unban_chat_member_initiated", null, null, BSa.A00(context, fbUserSession, threadSummary)));
                1Bn.A0A(67527);
                DR6 A01 = C5ic.A01(fragment.requireActivity(), bannedMembersCountListItemImplementation.A06);
                A01.A03(AbI.A14(context.getResources(), user.A0X, threadSummary.A20, 2131953198));
                AbM.A1A(context.getResources(), A01, 2131953196);
                A01.A0D(new CRL(view, fragment, fbUserSession, adC, bannedMembersCountListItemImplementation, A03, j), 2131953195);
                A01.A0B(CRw.A00, 2131953197);
                7zN.A13(A01);
                return;
            case 3:
                long A003 = ((3oR) this.A01).A00();
                int i = (int) ((A003 >>> 48) & 63);
                if (i == 1) {
                    C3TJ c3tj = (C3TJ) this.A03;
                    boolean parseBoolean = Boolean.parseBoolean(((AxQ) this.A04).A01);
                    C00o c00o = c3tj.A00;
                    if (c00o != null) {
                        c00o.updateOverrideForParam(A003, parseBoolean);
                    }
                } else if (i != 2) {
                    C3TJ c3tj2 = (C3TJ) this.A03;
                    String str4 = ((AxQ) this.A04).A01;
                    if (i != 4) {
                        C00o c00o2 = c3tj2.A00;
                        if (c00o2 != null) {
                            c00o2.updateOverrideForParam(A003, str4);
                        }
                    } else {
                        double parseDouble = Double.parseDouble(str4);
                        C00o c00o3 = c3tj2.A00;
                        if (c00o3 != null) {
                            c00o3.updateOverrideForParam(A003, parseDouble);
                        }
                    }
                } else {
                    C3TJ c3tj3 = (C3TJ) this.A03;
                    long parseLong = Long.parseLong(((AxQ) this.A04).A01);
                    C00o c00o4 = c3tj3.A00;
                    if (c00o4 != null) {
                        c00o4.updateOverrideForParam(A003, parseLong);
                    }
                }
                C2lh c2lh = (C2lh) this.A02;
                c2lh.A02(7zU.A0d(c2lh.A02));
                return;
            case 4:
                COr cOr = (COr) this.A01;
                FbUserSession fbUserSession2 = (FbUserSession) this.A02;
                User user2 = (User) this.A03;
                BM9 bm9 = (BM9) this.A04;
                String str5 = user2.A13;
                cOr.A00.getClass();
                COr.A00(fbUserSession2, cOr, bm9, str5);
                String str6 = cOr.A00.A0V;
                if (str6 == null || (userKey = cOr.A02) == null) {
                    return;
                }
                6Io r03 = cOr.A03;
                ThreadKey threadKey4 = cOr.A01;
                FRXParams fRXParams = cOr.A05;
                C5yq c5yq = fRXParams.A00;
                String str7 = userKey.id;
                C5yl c5yl = fRXParams.A09;
                11T.A0H(fbUserSession2, str5);
                7zP.A1L(c5yq, 4, c5yl);
                1UG A08 = 1BK.A08(r03.A00, 1BJ.A00(1340));
                if (A08.isSampled()) {
                    A08.A7R("evidence_source", str6);
                    A08.A7R("impersonated_user_id", str5);
                    CPB.A03(A08, fbUserSession2, r03, c5yq, threadKey4);
                    A08.A5H("is_other_user_mo", 6Io.A00(fbUserSession2, r03, threadKey4, str7));
                    6Io.A03(A08, r03);
                    AbM.A1H(A08, c5yl);
                    A08.A6H("other_user_id", CPB.A02(threadKey4, str7));
                    A08.BZL();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
