package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.lists.item.aiagent.contextmenu.AiSearchSnippetContextMenuFragment;
import com.facebook.messaging.search.messages.bottomsheet.SyncingChatHistoryBottomsheetFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: Cr4.class */
public final class Cr4 implements DJ0 {
    public final /* synthetic */ AcQ A00;

    public Cr4(AcQ acQ) {
        this.A00 = acQ;
    }

    public static void A00(AcQ acQ) {
        if (AcQ.A07(acQ) != null) {
            C00i c00i = acQ.A0A;
            c00i.getClass();
            ((AcP) c00i.get()).A0C(acQ.A1Y(), AcQ.A07(acQ), AcQ.A08(acQ), acQ.A0f);
        }
    }

    public static void A01(AcQ acQ) {
        C1531Akk c1531Akk;
        Fragment fragment = acQ.mParentFragment;
        if (fragment == null || (c1531Akk = (C1531Akk) fragment.getChildFragmentManager().A0b(1BJ.A00(1095))) == null) {
            return;
        }
        ((Executor) acQ.A0C.get()).execute(new D6K(c1531Akk));
    }

    @Override // X.DJ0
    public void Bid(DK4 dk4, String str, String str2, int i, int i2, int i3, boolean z) {
        AcQ acQ = this.A00;
        BP5 A1Y = acQ.A1Y();
        ((FH9) 1Bi.A03(84362)).A03();
        ImmutableList A07 = AcQ.A07(acQ);
        if (A07 != null) {
            ((AcP) 4YU.A0p(acQ.A0A)).A0B(acQ.A1Y(), dk4, A07, AcQ.A08(acQ), acQ.A0f, str2);
        }
        AcP acP = (AcP) 4YU.A0p(acQ.A0A);
        Context context = acQ.getContext();
        53N r0 = 53N.A01;
        String str3 = acQ.A0f;
        BP3.A00(A1Y);
        int A01 = AbO.A01(acQ);
        C1gb c1gb = acP.A0I;
        acP.A06(context, (RankingLoggingItem) null, (ThreadKey) null, (ThreadSummary) null, ClientDataSourceIdentifier.A0L, r0, A1Y, dk4, BP2.FIRST, (1Kn) null, (ImmutableList) null, false, (Integer) null, (Long) null, c1gb.A05() == null ? null : c1gb.A05().toString(), str3, str2, (String) null, (String) null, i3, i2, -1, A01, i, false, false);
        acQ.A09.get();
        if (acQ.getContext() == null || acQ.A0Q == null || acQ.A1Z() == null || !1qI.A02(acQ.A0F).AZk(36322796135729124L) || !z) {
            acQ.A18.CVc(acQ.A0f.isEmpty() ? 5SW.A1d : 5SW.A1e, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null);
            return;
        }
        C1320Ady c1320Ady = acQ.A1Z().A01;
        c1320Ady.A08 = true;
        c1320Ady.A04 = "typeahead";
        if (1JF.A0C(acQ.A0f, str.trim())) {
            AcQ.A0P(acQ, str, false, false, true);
        } else {
            acQ.A0Q.A0L.A01(str);
        }
        C1320Ady c1320Ady2 = acQ.A1Z().A01;
        c1320Ady2.A08 = false;
        c1320Ady2.A04 = "";
        acQ.A0T.A02 = true;
        AcQ.A0K(acQ);
    }

    @Override // X.DJ0
    public void Big(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, boolean z) {
        AcQ acQ = this.A00;
        if (1qI.A02(acQ.A0F).AZk(36322796135991271L) || !z) {
            return;
        }
        AcQ.A0M(acQ, 53N.A0N, str3, -1, i);
        acQ.A18.CVc(5SW.A1l, str, str4, str3, str2, (String) null, str7, str5, str6, list, list2);
    }

    @Override // X.DJ0
    public void Bih(String str, String str2, int i, int i2) {
        AcQ acQ = this.A00;
        AbK.A0S(acQ).A0E(BLf.A0A, 1BK.A0l(str.length()));
        06Z parentFragmentManager = acQ.getParentFragmentManager();
        11T.A0F(str2, 1);
        2Ov aiSearchSnippetContextMenuFragment = new AiSearchSnippetContextMenuFragment();
        aiSearchSnippetContextMenuFragment.setArguments(0PK.A00(new 03Y[]{1BK.A1G(7zK.A00(55), Integer.valueOf(i)), 1BK.A1G(7zK.A00(56), Integer.valueOf(i2)), 1BK.A1G(7zK.A00(ActionId.ACTIVITY_RESUME), str), 1BK.A1G(7zK.A00(ActionId.PREV_ACTIVITY_PAUSE), str2)}));
        aiSearchSnippetContextMenuFragment.A0m(parentFragmentManager, "ai_search_snippet_context_menu_tag");
    }

    @Override // X.DJ0
    public void Bii(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, int i, int i2) {
        AcQ acQ = this.A00;
        AcQ.A0M(acQ, 53N.A0O, str4, i, i2);
        acQ.A18.CVc(5SW.A1m, str, str5, str4, str2, str3, str8, str6, str7, list, list2);
    }

    @Override // X.DJ0
    public void Bzv(BP5 bp5, DK4 dk4, AcX acX, int i, int i2, int i3, int i4) {
        AcQ acQ = this.A00;
        if (acQ.getContext() == null || acQ.mView == null) {
            return;
        }
        1G9 r0 = CCy.A02;
        Context context = acQ.getContext();
        FbUserSession fbUserSession = acQ.A05;
        User user = (User) acX.A07(Cs1.A00);
        if (user != null) {
            06Z parentFragmentManager = acQ.getParentFragmentManager();
            View view = acQ.mView;
            MigColorScheme A0h = AbK.A0h(acQ);
            CNl cNl = (CNl) 1Bn.A0E(context, (1BY) null, 83065);
            FbSharedPreferences A0W = 1BL.A0W();
            53N r02 = acX.A0A;
            53N r03 = 53N.A0T;
            String str = r02 == r03 ? "pymk_messenger_universal_search" : "pymk_messenger_universal_search_query";
            C4Ll c4Ll = new C4Ll();
            int i5 = 13;
            if (r02 == r03) {
                i5 = 5;
            }
            1Kn r325 = 1Kn.A03;
            1Kn r04 = user.A0a;
            if (r325 != r04) {
                if (1Kn.A05 == r04) {
                    11T.A0F(context, 0);
                    CO3.A02(context, user, i5);
                    if (acQ.A0f != null) {
                        AbN.A1I(acQ);
                        A01(acQ);
                    }
                    AbN.A0U(context).A03(view, A0h, context.getString(2131954922));
                    C00683ob c00683ob = (C00683ob) 1Lo.A04(context, fbUserSession, (1BY) null, 67629);
                    String str2 = user.A13;
                    c00683ob.A01(4, Long.parseLong(str2));
                    1Ql edit = A0W.edit();
                    edit.CaE(CCy.A02.A0F(str2), 4);
                    edit.commit();
                    if (acQ.A0f != null) {
                        AbN.A1I(acQ);
                        A01(acQ);
                    }
                    parentFragmentManager.A1R("request_key_cancel_friend_request_click", new Bundle(0));
                }
                AcQ.A0B(acQ.requireContext(), acQ, bp5, dk4, acX, r04, ImmutableList.of((Object) user), (Long) null, AcX.A05(acX), i, i2, i3, i4, false);
            }
            String str3 = user.A13;
            c4Ll.A01(Long.parseLong(str3), str, null);
            11T.A0F(context, 0);
            CO3.A03(context, user, i5);
            C00683ob c00683ob2 = (C00683ob) 1Lo.A04(context, fbUserSession, (1BY) null, 67629);
            long parseLong = Long.parseLong(str3);
            r325 = 1Kn.A05;
            c00683ob2.A01(3, parseLong);
            1Ql edit2 = A0W.edit();
            edit2.CaE(CCy.A02.A0F(str3), 3);
            edit2.commit();
            if (acQ.A0f != null) {
                AbN.A1I(acQ);
                A01(acQ);
            }
            AbN.A0U(context).A03(view, A0h, context.getString(2131954946));
            ((Bga) 1Br.A0B(cNl.A00)).A00 = r325;
            AcQ.A0B(acQ.requireContext(), acQ, bp5, dk4, acX, r04, ImmutableList.of((Object) user), (Long) null, AcX.A05(acX), i, i2, i3, i4, false);
        }
    }

    @Override // X.DJ0
    public void C0l() {
        AcQ acQ = this.A00;
        AcQ.A0K(acQ);
        DIT dit = acQ.A0J;
        if (dit != null) {
            dit.CVt(acQ.A0f);
        }
        AbK.A0S(acQ).A0D.get();
    }

    @Override // X.DJ0
    public void C70(BP5 bp5, int i) {
        AcQ acQ = this.A00;
        Long l = AbK.A0S(acQ).A0G.A02;
        ImmutableList A07 = AcQ.A07(acQ);
        BP3.A00(acQ.A1Y());
        if (A07 != null) {
            AbK.A0S(acQ).A0C((BP5) null, A07, AcQ.A08(acQ), acQ.A0f);
        }
        AcP acP = (AcP) 4YU.A0p(acQ.A0A);
        AeG aeG = acP.A0G;
        if (aeG.A02 != null) {
            aeG.A03 = AcP.A05(acP, -1);
        }
        acQ.A0z.get();
        CB7.A00(acQ.getContext(), (ThreadSummary) null, acQ.A0f, "universal_search", (String) null, String.valueOf(l));
    }

    @Override // X.DJ0
    public void CJP(BP5 bp5, DK4 dk4, Integer num, Integer num2, String str) {
        DIT dit;
        String str2;
        BP5 bp52;
        AcQ acQ = this.A00;
        acQ.A0e = num2;
        switch (num.intValue()) {
            case 0:
                AcP acP = (AcP) 4YU.A0p(acQ.A0A);
                int intValue = num2.intValue();
                BP3.A00(bp5);
                AeG aeG = acP.A0G;
                if (aeG.A02 != null) {
                    aeG.A03 = AcP.A05(acP, intValue);
                }
                AcQ.A0J((ThreadSummary) null, acQ, 0S2.A00, 0S2.A0C);
                acQ.A0z.get();
                CB7.A00(acQ.getContext(), (ThreadSummary) null, acQ.A0f, "integrated_message_search_server", "see_all", AcP.A04(AbK.A0S(acQ)));
                return;
            case 1:
                A00(acQ);
                dit = acQ.A0J;
                if (dit != null) {
                    str2 = acQ.A0f;
                    bp52 = BP5.A09;
                    break;
                } else {
                    return;
                }
            case 2:
                dit = acQ.A0J;
                if (dit != null) {
                    str2 = acQ.A0f;
                    bp52 = BP5.A05;
                    break;
                } else {
                    return;
                }
            case 3:
                A00(acQ);
                dit = acQ.A0J;
                if (dit != null) {
                    str2 = acQ.A0f;
                    bp52 = BP5.A0J;
                    break;
                } else {
                    return;
                }
            case 4:
                A00(acQ);
                dit = acQ.A0J;
                if (dit != null) {
                    str2 = acQ.A0f;
                    bp52 = BP5.A0V;
                    break;
                } else {
                    return;
                }
            case 5:
                A00(acQ);
                dit = acQ.A0J;
                if (dit != null) {
                    str2 = acQ.A0f;
                    bp52 = BP5.A0L;
                    break;
                } else {
                    return;
                }
            case 6:
                A00(acQ);
                dit = acQ.A0J;
                if (dit != null) {
                    str2 = acQ.A0f;
                    bp52 = BP5.A0M;
                    break;
                } else {
                    return;
                }
            case 7:
                DIT dit2 = acQ.A0J;
                if (dit2 != null) {
                    dit2.CWC(BP5.A02, 7zN.A0h(), acQ.A0f, str);
                    return;
                }
                return;
            case 8:
                dit = acQ.A0J;
                if (dit != null) {
                    str2 = acQ.A0f;
                    bp52 = BP5.A0c;
                    break;
                } else {
                    return;
                }
            case 9:
                dit = acQ.A0J;
                if (dit != null) {
                    str2 = acQ.A0f;
                    bp52 = BP5.A0P;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        dit.CWC(bp52, num2, str2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (r0.A2i != false) goto L8;
     */
    @Override // X.DJ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CJW(X.BP5 r302, X.DK4 r303, X.AcX r304, int r305, int r306, int r307, int r308, int r309) {
        /*
            r301 = this;
            r0 = r301
            X.AcQ r0 = r0.A00
            r310 = r0
            r0 = r310
            android.content.Context r0 = r0.requireContext()
            r311 = r0
            X.Cs0 r0 = X.Cs0.A00
            r312 = r0
            r0 = r304
            r1 = r312
            java.lang.Object r0 = r0.A07(r1)
            com.facebook.messaging.model.threads.ThreadSummary r0 = (com.facebook.messaging.model.threads.ThreadSummary) r0
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L3d
            r0 = r313
            boolean r0 = X.2oI.A03(r0)
            r314 = r0
            r0 = r314
            if (r0 == 0) goto L3d
            r0 = r313
            boolean r0 = r0.A2i
            r314 = r0
            r0 = 1
            r315 = r0
            r0 = r314
            if (r0 == 0) goto L43
        L3d:
            r0 = 0
            r315 = r0
            r0 = 0
            r313 = r0
        L43:
            X.Ada r0 = X.EnumC1297Ada.A0c
            r312 = r0
            r0 = r303
            r1 = r312
            if (r0 == r1) goto L67
            X.Ada r0 = X.EnumC1297Ada.A0p
            r312 = r0
            r0 = r303
            r1 = r312
            if (r0 == r1) goto L67
            r0 = r315
            if (r0 != 0) goto L67
            r0 = r311
            r1 = r310
            r2 = r303
            r3 = r304
            X.AcQ.A0C(r0, r1, r2, r3)
        L67:
            X.Cs7 r0 = new X.Cs7
            r310 = r0
            r0 = r310
            r1 = r311
            r2 = r301
            r3 = r302
            r4 = r303
            r5 = r304
            r6 = r305
            r7 = r306
            r8 = r307
            r9 = r308
            r10 = r309
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r304
            r1 = r310
            r0.A08(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cr4.CJW(X.BP5, X.DK4, X.AcX, int, int, int, int, int):void");
    }

    @Override // X.DJ0
    public void CJX(View view, BP5 bp5, DK4 dk4, AcX acX, int i, int i2, int i3, int i4, int i5) {
        acX.A08(new Cs5(view, this, bp5, dk4, acX, i, i2, i3, i4));
    }

    @Override // X.DJ0
    public void CJm() {
        AcQ acQ = this.A00;
        AcQ.A0O(acQ, acQ.A0f, false);
        AcQ.A0N(acQ, BL2.A03, false);
        AcQ.A0K(acQ);
    }

    @Override // X.DJ0
    public void CNx(BP5 bp5, DK4 dk4, AcX acX, int i, int i2, int i3, int i4, int i5, long j) {
        Object A07 = acX.A07(Cs1.A00);
        AcQ acQ = this.A00;
        AcQ.A0B(acQ.requireContext(), acQ, bp5, dk4, acX, (1Kn) null, A07 != null ? ImmutableList.of(A07) : null, (Long) null, AcX.A05(acX), i, i2, i3, i4, true);
        IAa A02 = ((6uV) acQ.A11.get()).A02(acQ.A05, 7Mg.A0Q);
        A02.A0F = ImmutableList.of((Object) String.valueOf(j));
        A02.A05 = acQ.A17;
        A02.A03(acQ.getChildFragmentManager());
    }

    @Override // X.DJ0
    public void Ctb(String str) {
    }

    @Override // X.DJ0
    public void D0O() {
        new SyncingChatHistoryBottomsheetFragment().A0m(this.A00.getParentFragmentManager(), "SyncingChatHistoryBottomsheetFragment");
    }
}
