package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountlogin.ui.AutoIdentificationAccountSelectDialogFragment;
import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment;
import com.facebook.messaging.reactions.plugins.reactions.reactionsreactorsv2datahandler.ReactionsReactorsV2DataHandlerImplementation;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.InviteLinkShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.model.ContactShareModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cvk.class */
public final class Cvk implements C5ww {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public Cvk(FbUserSession fbUserSession, CMJ cmj, String str, int i) {
        this.A00 = i;
        switch (i) {
            case 2:
                this.A03 = str;
                this.A01 = fbUserSession;
                this.A02 = cmj;
                break;
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
                this.A02 = cmj;
                this.A03 = str;
                this.A01 = fbUserSession;
                break;
            case 6:
            default:
                this.A02 = cmj;
                this.A01 = fbUserSession;
                this.A03 = str;
                break;
        }
    }

    public Cvk(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.facebook.messaging.reactions.M4MessageReactionsReactorsFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v404, types: [X.B2q, androidx.fragment.app.Fragment] */
    @Override // X.C5ww
    public void onClick(View view) {
        Integer num;
        HGA hga;
        int andIncrement;
        String A00;
        String str;
        IFc iFc;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                AutoIdentificationAccountSelectDialogFragment autoIdentificationAccountSelectDialogFragment = (AutoIdentificationAccountSelectDialogFragment) this.A01;
                autoIdentificationAccountSelectDialogFragment.A0o();
                if (autoIdentificationAccountSelectDialogFragment.A01 != null) {
                    String str4 = this.A03;
                    if (!str4.endsWith("@gmail.com")) {
                        ((C6Z) autoIdentificationAccountSelectDialogFragment.A06.get()).A00(0S2.A1G);
                        autoIdentificationAccountSelectDialogFragment.A01.A00(str4);
                        return;
                    }
                    autoIdentificationAccountSelectDialogFragment.A05.get();
                    ((C6Z) autoIdentificationAccountSelectDialogFragment.A06.get()).A00(0S2.A0u);
                    ?? r0 = autoIdentificationAccountSelectDialogFragment.A01.A00;
                    FragmentActivity activity = r0.getActivity();
                    if (activity != null) {
                        1G2 r02 = B2q.A0x;
                        ((AbR) r0.A0g.get()).A0A(activity, r0.A0n, 0S2.A0j, str4, "", "auto_identification_account_selection_dialog_oauth_login_").A06(false, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                BmU bmU = (BmU) this.A02;
                String str5 = this.A03;
                ?? r03 = bmU.A00;
                String str6 = "reaction";
                if (M4MessageReactionsReactorsFragment.A0F(r03)) {
                    num = 0S2.A0C;
                    if (((5lO) r03.A0X.get()).A01(r03.A0B.A0V)) {
                        str6 = GOm.A00(77);
                    }
                } else {
                    num = null;
                }
                if (1Br.A07(((C5a8) r03.A08.get()).A02).AZl(36313347192396007L, false)) {
                    Capabilities capabilities = bmU.A01;
                    Context context = r03.getContext();
                    r03.A07.get();
                    DR6 A01 = C5ic.A01(context, r03.A0I);
                    A01.A03(context.getString(2131959715));
                    A01.A0J(" ");
                    A01.A0H(new CSH((Object) r03, 2));
                    A01.A0G(new CRE((M4MessageReactionsReactorsFragment) r03, capabilities, num, str5, str6), context.getString(2131959714));
                    CSG.A04(A01, (Object) r03, ActionId.PREV_ACTIVITY_PAUSE, 2131959711);
                    CQx.A00(A01, (Object) r03, 6);
                    A01.A0K(true);
                    A01.A05();
                    6KV r04 = r03.A05;
                    if (r04 != null) {
                        r04.A02();
                    }
                    r03.A02.setAlpha(1.0f);
                    return;
                }
                HtJ htJ = r03.A0G;
                if (htJ != null && (hga = r03.A0H) != null) {
                    IAJ iaj = htJ.A00.A00;
                    AtomicInteger atomicInteger = C1Y6.A04;
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    1YC r05 = iaj.A08;
                    String A002 = GOm.A00(223);
                    String A003 = GOm.A00(283);
                    r05.A08(A002, A003, "removeReactor", andIncrement2);
                    try {
                        IAJ.A00(iaj);
                        if (IAJ.A02(iaj)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            String A004 = GOm.A00(226);
                            A00 = GOm.A00(285);
                            try {
                                r05.A0A(A004, A00, A002, andIncrement, A003, 4YT.A00(301), "removeReactor");
                                try {
                                    ReactionsReactorsV2DataHandlerImplementation reactionsReactorsV2DataHandlerImplementation = iaj.A02;
                                    11T.A0F(str5, 1);
                                    HgE hgE = reactionsReactorsV2DataHandlerImplementation.A02;
                                    ArrayListMultimap arrayListMultimap = new ArrayListMultimap(hgE.A02);
                                    ArrayListMultimap arrayListMultimap2 = new ArrayListMultimap(hgE.A01);
                                    List AUe = arrayListMultimap2.AUe(str5);
                                    Iterator it = AUe.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            HGA hga2 = (HGA) it.next();
                                            if (11T.A0O(hga2.A01(), hga.A01())) {
                                                AUe.remove(hga2);
                                            }
                                        }
                                    }
                                    hgE.A01 = arrayListMultimap2;
                                    arrayListMultimap.remove(str5, hga.A00());
                                    hgE.A02 = arrayListMultimap;
                                    if (!arrayListMultimap2.A01.containsKey(str5)) {
                                        ImmutableList immutableList = reactionsReactorsV2DataHandlerImplementation.A00;
                                        ArrayList A0s = AnonymousClass001.A0s();
                                        Iterator it2 = immutableList.iterator();
                                        while (it2.hasNext()) {
                                            Object next = it2.next();
                                            if (((String) next).equals(str5)) {
                                                A0s.add(next);
                                            }
                                        }
                                        reactionsReactorsV2DataHandlerImplementation.A00 = 1BL.A0a(A0s);
                                    }
                                } catch (Exception e) {
                                    throw e;
                                }
                            } catch (Throwable th) {
                                r05.A04((Exception) null, A00, A003, "removeReactor", andIncrement);
                                throw th;
                            }
                        } else {
                            if (IAJ.A01(iaj)) {
                                andIncrement = atomicInteger.getAndIncrement();
                                String A005 = GOm.A00(225);
                                A00 = GOm.A00(284);
                                r05.A0A(A005, A00, A002, andIncrement, A003, 4YT.A00(301), "removeReactor");
                            }
                            r05.A02((Exception) null, A003, "removeReactor", andIncrement2);
                        }
                        int i = andIncrement;
                        r05.A09(A00, A003, "removeReactor", andIncrement);
                        r05.A02((Exception) null, A003, "removeReactor", andIncrement2);
                    } catch (Throwable th2) {
                        r05.A02((Exception) null, A003, "removeReactor", andIncrement2);
                        throw th2;
                    }
                }
                M4MessageReactionsReactorsFragment.A0E(r03, bmU.A01, num, str5, str6);
                return;
            case 2:
                String str7 = this.A03;
                if (str7 != null) {
                    FbUserSession fbUserSession = (FbUserSession) this.A01;
                    CPV cpv = (CPV) 1Lm.A06(fbUserSession, 84148);
                    Bxd bxd = new Bxd();
                    bxd.A06 = "copy_link";
                    bxd.A01 = BOd.A05;
                    bxd.A04 = str7;
                    cpv.A05(new RUQ(bxd));
                    CJC cjc = (CJC) ((CMJ) this.A02).A03.get();
                    11T.A0D("vcl_meetups_scrim");
                    cjc.A05(fbUserSession, str7, "vcl_meetups_scrim");
                    BRG brg = cjc.A01;
                    if (brg != null) {
                        Toast toast = brg.A00;
                        if (toast.getView() != null && toast.getView().getWindowVisibility() == 0) {
                            cjc.A01.A00.cancel();
                        }
                    }
                    cjc.A01 = F8q.A00(new FEd(2131964890), AbF.A0v(cjc.A03), false);
                    return;
                }
                return;
            case 3:
                CMJ cmj = (CMJ) this.A02;
                String str8 = this.A03;
                FbUserSession fbUserSession2 = (FbUserSession) this.A01;
                CMJ.A01(fbUserSession2, "native_share", str8);
                CH3 ch3 = cmj.A04;
                11T.A0D("vcl_meetups_scrim");
                ch3.A04.get();
                if (1JF.A0B(str8)) {
                    return;
                }
                C00i c00i = ch3.A03;
                String A04 = ((CJC) c00i.get()).A04(str8);
                CJC cjc2 = (CJC) c00i.get();
                String A006 = CJC.A00(str8);
                C00i c00i2 = cjc2.A02;
                Resources A0B = 1BL.A0B(c00i2);
                cjc2.A04.get();
                String A14 = AbI.A14(A0B, 1BL.A0B(c00i2).getString(2131952789), A006, 2131964190);
                Bundle A05 = 1BK.A05();
                A05.putString("link", str8);
                A05.putString("share_text", A04);
                A05.putString("messenger_share_text", A14);
                0D2 r06 = new 2Ov();
                r06.setArguments(A05);
                r06.A01 = new ElY(AbF.A0B(fbUserSession2, ch3.A00, 67965), ch3, str8);
                ((HuL) ch3.A02.get()).A01(r06, "sharesheet");
                return;
            case 4:
                CMJ cmj2 = (CMJ) this.A02;
                str = this.A03;
                FbUserSession fbUserSession3 = (FbUserSession) this.A01;
                CMJ.A01(fbUserSession3, "email", str);
                CH3 ch32 = cmj2.A04;
                11T.A0D("vcl_meetups_scrim");
                if (!1JF.A0B(str)) {
                    Context context2 = ch32.A01;
                    ch32.A04.get();
                    Intent A007 = CH3.A00(ch32, "android.intent.action.SENDTO", str);
                    AbH.A1H(A007, 4YT.A00(ActionId.FILE_SYSTEM_FAIL));
                    09X.A00().A05().A0A(context2, Intent.createChooser(A007, null));
                    iFc = (IFc) 1Lo.A04((Context) null, fbUserSession3, ch32.A00, 67965);
                    str2 = "email_share";
                    break;
                } else {
                    return;
                }
            case 5:
                CMJ cmj3 = (CMJ) this.A02;
                str = this.A03;
                FbUserSession fbUserSession4 = (FbUserSession) this.A01;
                CMJ.A01(fbUserSession4, "instagram", str);
                CH3 ch33 = cmj3.A04;
                11T.A0D("vcl_meetups_scrim");
                if (ch33.A01(str)) {
                    str.getClass();
                    0Eh A06 = 09X.A00().A06();
                    Intent A008 = CH3.A00(ch33, "android.intent.action.SEND", str);
                    A008.setPackage("com.instagram.android");
                    if (A06.A0A(ch33.A01, A008)) {
                        iFc = (IFc) 1Lo.A04((Context) null, fbUserSession4, ch33.A00, 67965);
                        str2 = "com.instagram.android";
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                CH3 ch34 = ((CMJ) this.A02).A04;
                FbUserSession fbUserSession5 = (FbUserSession) this.A01;
                str = this.A03;
                11T.A0D("vcl_meetups_scrim");
                if (!1JF.A0B(str)) {
                    Context context3 = ch34.A01;
                    ch34.A04.get();
                    Bundle A052 = 1BK.A05();
                    CJC cjc3 = (CJC) ch34.A03.get();
                    String A009 = CJC.A00(str);
                    C00i c00i3 = cjc3.A02;
                    Resources A0B2 = 1BL.A0B(c00i3);
                    cjc3.A04.get();
                    A052.putString("android.intent.extra.TEXT", AbI.A14(A0B2, 1BL.A0B(c00i3).getString(2131952789), A009, 2131964190));
                    A052.putParcelable("trigger2", NavigationTrigger.A03("vcl_home_scrim"));
                    AbM.A0k(A052, "com.facebook.orca.notify.SECURE_VIEW", 0).BXk(context3, 4YU.A0F("fb-messenger://share"));
                    iFc = (IFc) 1Lo.A04((Context) null, fbUserSession5, ch34.A00, 67965);
                    str2 = "com.facebook.orca";
                    break;
                } else {
                    return;
                }
            case 7:
                CMJ cmj4 = (CMJ) this.A02;
                str = this.A03;
                FbUserSession fbUserSession6 = (FbUserSession) this.A01;
                CMJ.A01(fbUserSession6, "sms", str);
                CH3 ch35 = cmj4.A04;
                11T.A0D("vcl_meetups_scrim");
                if (!1JF.A0B(str)) {
                    Context context4 = ch35.A01;
                    ch35.A04.get();
                    R0k.A00(context4, "", ((CJC) ch35.A03.get()).A04(str));
                    iFc = (IFc) 1Lo.A04((Context) null, fbUserSession6, ch35.A00, 67965);
                    str2 = "com.android.mms";
                    break;
                } else {
                    ch35.A04.get();
                    return;
                }
            case 8:
                CMJ cmj5 = (CMJ) this.A02;
                String str9 = this.A03;
                FbUserSession fbUserSession7 = (FbUserSession) this.A01;
                CMJ.A01(fbUserSession7, "whatsapp", str9);
                CH3 ch36 = cmj5.A04;
                11T.A0D("vcl_meetups_scrim");
                if (1JF.A0B(str9)) {
                    return;
                }
                Context context5 = ch36.A01;
                try {
                    PackageManager packageManager = context5.getPackageManager();
                    if (packageManager != null) {
                        if (packageManager.getApplicationInfo("com.whatsapp", 0).enabled) {
                            Intent A0010 = CH3.A00(ch36, "android.intent.action.SEND", str9);
                            A0010.setPackage("com.whatsapp");
                            09X.A00().A05().A0A(context5, A0010);
                            ((IFc) 1Lo.A04((Context) null, fbUserSession7, ch36.A00, 67965)).A0K(str9, "com.whatsapp");
                            return;
                        }
                        return;
                    }
                    return;
                } catch (PackageManager.NameNotFoundException unused) {
                    return;
                }
            case 9:
                COg cOg = (COg) this.A01;
                BzA bzA = (BzA) this.A02;
                String str10 = this.A03;
                C1567Alm c1567Alm = cOg.A0I.A00;
                BroadcastFlowIntentModel broadcastFlowIntentModel = c1567Alm.A0E;
                if (broadcastFlowIntentModel != null && (broadcastFlowIntentModel instanceof InviteLinkShareIntentModel)) {
                    GroupInviteLinkData groupInviteLinkData = ((InviteLinkShareIntentModel) broadcastFlowIntentModel).A00;
                    ThreadKey threadKey = groupInviteLinkData.A05;
                    Long A0l = threadKey == null ? null : 4YU.A0l(threadKey);
                    C96j c96j = groupInviteLinkData.A04;
                    if (c96j == C96j.A06) {
                        C1306Adj.A04((C1306Adj) 1Bi.A03(82310), A0l, 23, 16, 3);
                    } else if (c96j == C96j.A05) {
                        CQo.A0A(BOn.A0L, (CQo) 1Bi.A03(82689), A0l);
                    }
                }
                C1567Alm.A0C(c1567Alm, 0S2.A0C);
                ContactShareModel contactShareModel = bzA.A0C;
                1Iw r07 = cOg.A0C;
                if (contactShareModel == null) {
                    Context context6 = r07.A0D;
                    MigColorScheme migColorScheme = cOg.A0R;
                    if (str10 == null) {
                        str10 = "";
                    }
                    CQN.A03(context6, view, migColorScheme, str10);
                    return;
                }
                Context context7 = r07.A0D;
                MigColorScheme migColorScheme2 = cOg.A0R;
                String str11 = contactShareModel.A03;
                if (str11 != null) {
                    if (str10 == null) {
                        str10 = "";
                    }
                    str10 = 0Pz.A0W(str11, str10);
                } else if (str10 == null) {
                    str10 = "";
                }
                11T.A0F(context7, 0);
                1BL.A1H(view, migColorScheme2, str10);
                C0dv.A02(context7, str10);
                7zQ.A17(context7, view, migColorScheme2, AbN.A0U(context7), 2131953510);
                return;
            case 10:
                COg cOg2 = (COg) this.A01;
                BzA bzA2 = (BzA) this.A02;
                String str12 = this.A03;
                C1567Alm c1567Alm2 = cOg2.A0I.A00;
                BroadcastFlowIntentModel broadcastFlowIntentModel2 = c1567Alm2.A0E;
                if (broadcastFlowIntentModel2 != null && (broadcastFlowIntentModel2 instanceof InviteLinkShareIntentModel)) {
                    GroupInviteLinkData groupInviteLinkData2 = ((InviteLinkShareIntentModel) broadcastFlowIntentModel2).A00;
                    ThreadKey threadKey2 = groupInviteLinkData2.A05;
                    Long A0l2 = threadKey2 == null ? null : 4YU.A0l(threadKey2);
                    C96j c96j2 = groupInviteLinkData2.A04;
                    if (c96j2 == C96j.A06) {
                        C1306Adj.A04((C1306Adj) 1Bi.A03(82310), A0l2, 28, 48, 3);
                    } else if (c96j2 == C96j.A05) {
                        CQo.A0B(BOn.A0L, (CQo) 1Bi.A03(82689), A0l2);
                    }
                }
                C1567Alm.A0C(c1567Alm2, 0S2.A01);
                ContactShareModel contactShareModel2 = bzA2.A0C;
                1Iw r08 = cOg2.A0C;
                if (contactShareModel2 == null) {
                    CQN.A04(r08.A0D, str12);
                    return;
                }
                Context context8 = r08.A0D;
                String str13 = contactShareModel2.A03;
                if (str13 != null) {
                    if (str12 == null) {
                        str12 = "";
                    }
                    str12 = 0Pz.A0W(str13, str12);
                } else if (str12 == null) {
                    str12 = "";
                }
                11T.A0H(context8, str12);
                AbO.A0J(context8, str12);
                return;
            default:
                COg cOg3 = (COg) this.A01;
                BzA bzA3 = (BzA) this.A02;
                String str14 = this.A03;
                ContactShareModel contactShareModel3 = bzA3.A0C;
                if (contactShareModel3 == null || !contactShareModel3.A07 || contactShareModel3.A05 == null) {
                    C1306Adj c1306Adj = (C1306Adj) cOg3.A06.get();
                    String str15 = bzA3.A0Y;
                    C1306Adj.A04(c1306Adj, str15 != null ? 0CW.A0e(str15) : null, 93, 51, 18);
                } else {
                    ((CNm) cOg3.A09.get()).A07(0S2.A00, contactShareModel3.A00, contactShareModel3.A08);
                }
                Context context9 = cOg3.A02;
                EU9.A00(context9);
                FxJ fxJ = new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, (FHf) null, (DLQ) null, (DLQ) null, (FZt) null, (Integer) null, (Integer) null, (String) null, 0, false);
                HashMap A0u = AnonymousClass001.A0u();
                HashMap A0u2 = AnonymousClass001.A0u();
                HashMap A0u3 = AnonymousClass001.A0u();
                new BitSet(0);
                String str16 = bzA3.A0Y;
                String str17 = "";
                if (str16 == null) {
                    str16 = str17;
                }
                A0u.put("thread_id", str16);
                if (contactShareModel3 != null && (str3 = contactShareModel3.A03) != null) {
                    str17 = 0Pz.A0W("prefill_text:", str3);
                }
                A0u.put("extra_data", str17);
                A0u.put("link_url", str14);
                AbM.A19(context9, fxJ, C3o5.A0L(7zK.A00(281), C4O5.A02(A0u), A0u2), A0u3);
                return;
        }
        iFc.A0K(str, str2);
    }
}
