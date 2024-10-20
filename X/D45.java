package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.accountswitch.protocol.GetUnseenCountsNotificationResult;
import com.facebook.messaging.accountswitch.protocol.SwitchAccountFetchResult;
import com.facebook.messaging.model.business.MessageSuggestedReply;
import com.facebook.messaging.model.threads.RelatedPageThreadData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.notify.MultipleAccountsNewMessagesNotification;
import com.facebook.messaging.xma.template.plugins.core.cta.botfeedback.SendBotFeedbackCtaHandler;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.rtc.launch.CallStartOutcome;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: D45.class */
public final class D45 implements 1K9 {
    public final int A00;
    public final Object A01;

    public D45(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onFailure(Throwable th) {
        Context context;
        int i;
        switch (this.A00) {
            case 0:
                ((4sS) this.A01).A00 = null;
                return;
            case 1:
                11T.A0F(th, 0);
                0fH.A0r("AdvancedCryptoSessionRepository", "Failed to inject SecureMessageOverWAMailbox", th);
                return;
            case 2:
            case 4:
            case 8:
            default:
                return;
            case 3:
                context = ((Cax) this.A01).A01;
                i = 2131956565;
                break;
            case 5:
                11T.A0F(th, 0);
                0fH.A0s(4YT.A00(236), "Failed to fetch the logged-in user's Montage thread FBID.", th);
                ((53H) this.A01).A00 = false;
                return;
            case 6:
                context = ((SendBotFeedbackCtaHandler) this.A01).A00;
                i = 2131968200;
                break;
            case 7:
                50O r0 = (50O) this.A01;
                1G2 r02 = 50O.A0M;
                r0.A0H.set(false);
                return;
            case 9:
                11T.A0F(th, 0);
                BvM bvM = (BvM) this.A01;
                InAppPurchaseControllerCoro.A0F(bvM.A00, bvM.A01, C0ty.A00);
                return;
            case 10:
                11T.A0F(th, 0);
                ((JMR) this.A01).ARr(th.getMessage());
                return;
        }
        Toast.makeText(context, i, 1).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v214, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r327v0 */
    /* JADX WARN: Type inference failed for: r327v1 */
    /* JADX WARN: Type inference failed for: r327v2, types: [java.util.AbstractCollection] */
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        SwitchAccountFetchResult switchAccountFetchResult;
        ArrayList arrayList;
        2JY r0;
        2JY A0C;
        TreeJNI A0L;
        List list;
        ArrayList arrayList2;
        C1790AsO c1790AsO;
        String str;
        C1790AsO c1790AsO2;
        String str2;
        2JY r02;
        ImmutableList A0c;
        C87v c87v;
        2JY r03;
        2JY A0B;
        2JY A0N;
        2JY A0B2;
        TreeJNI A0L2;
        Integer valueOf;
        1Ql putBoolean;
        2JY r04;
        TreeJNI A0L3;
        Object obj2;
        MessageSuggestedReply messageSuggestedReply;
        switch (this.A00) {
            case 0:
                OperationResult operationResult = (OperationResult) obj;
                4sS r05 = (4sS) this.A01;
                if (r05.A09) {
                    if ((!AbL.A1b(r05.A05) || 1BK.A0N(r05.A04.A00).AZk(36310834637636845L)) && operationResult != null && (switchAccountFetchResult = (SwitchAccountFetchResult) operationResult.A08()) != null && (arrayList = switchAccountFetchResult.A01) != null && !arrayList.isEmpty()) {
                        ViewerContext viewerContext = (ViewerContext) r05.A06.get();
                        String str3 = viewerContext != null ? viewerContext.mUserId : null;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            GetUnseenCountsNotificationResult getUnseenCountsNotificationResult = (GetUnseenCountsNotificationResult) it.next();
                            String str4 = getUnseenCountsNotificationResult.A02;
                            if (!11T.A0O(str4, str3)) {
                                ((AnonymousClass208) 1Bn.A0A(17006)).BgP(new MultipleAccountsNewMessagesNotification(str4, getUnseenCountsNotificationResult.A01, getUnseenCountsNotificationResult.A00));
                            }
                        }
                        if (!((C09314po) 1Br.A0B(r05.A01)).A00()) {
                            r05.A03.A02(arrayList.size());
                        }
                    }
                } else if (!((C09314po) 1Br.A0B(r05.A01)).A00()) {
                    r05.A03.A01();
                }
                r05.A00 = null;
                return;
            case 1:
                C25e c25e = (C25e) obj;
                if (c25e != null) {
                    5dQ r06 = (5dQ) this.A01;
                    1Br.A0D(r06.A04, D4q.A00(r06, 11), c25e.A06(AbN.A06(r06.A05.A00, AbN.A04(), 1Br.A00(r06.A02))));
                    return;
                }
                return;
            case 2:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                if (abstractC08294mh != null && (r0 = (2JY) abstractC08294mh.A03) != null && (A0C = AbG.A0C(r0, 2JX.class, -772698958)) != null && (A0L = A0C.A0L(-2054018237, 2JX.class, 1717631201)) != null) {
                    C04614bh c04614bh = (C04614bh) this.A01;
                    if (A0L.hasFieldValue(1223073049)) {
                        C04614bh.A00(c04614bh, A0L.getBooleanValue(1223073049));
                    }
                }
                ((C04614bh) this.A01).A05 = true;
                return;
            case 3:
                return;
            case 4:
                AbstractC08294mh abstractC08294mh2 = (AbstractC08294mh) obj;
                if (abstractC08294mh2 == null || (r03 = (2JY) abstractC08294mh2.A03) == null || (A0B = 1BK.A0B(r03, 2JX.class, -1001679007, -2142093439)) == null || (A0N = 7zL.A0N(A0B, 2JX.class, -2047482802, 690628418)) == null || (A0B2 = 1BK.A0B(A0N, 2JX.class, -1503905936, 1319421505)) == null || (A0L2 = A0B2.A0L(3076010, 2JX.class, 361671146)) == null || (valueOf = Integer.valueOf(A0L2.getIntValue(98662759))) == null) {
                    return;
                }
                BPl.A00 = valueOf.toString();
                6IV r07 = (6IV) this.A01;
                if (r07 != null) {
                    r07.D71();
                    return;
                }
                return;
            case 5:
                Number number = (Number) obj;
                53H r08 = (53H) this.A01;
                r08.A00 = false;
                if (number != null) {
                    String A00 = 4YT.A00(236);
                    0fH.A0g(number, A00, "Fetch successful. Montage thread FBID = %d.");
                    long longValue = number.longValue();
                    if (longValue != 0) {
                        User Auc = r08.A01.Auc();
                        if (longValue != (Auc != null ? Auc.A0O : 0L)) {
                            0fH.A0k(A00, "Fetch failed. Montage thread FBID has changed");
                            return;
                        }
                    }
                    if (longValue == 0 || r08.A00(longValue)) {
                        53I r09 = r08.A05;
                        putBoolean = 53I.A00(r09).edit().putBoolean(((1LF) 1Br.A0B(((4LQ) 1Br.A0B(r09.A00)).A00)).A03(4LQ.A0Y, "has_performed_my_montage_fbid_fetch", true), true);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                AbstractC08294mh abstractC08294mh3 = (AbstractC08294mh) obj;
                if (abstractC08294mh3 == null || (r04 = (2JY) abstractC08294mh3.A03) == null || (A0L3 = r04.A0L(-1498032778, 2JX.class, -1000285403)) == null || !A0L3.getBooleanValue(-1867169789)) {
                    return;
                }
                Toast.makeText(((SendBotFeedbackCtaHandler) this.A01).A00, 2131968201, 1).show();
                return;
            case 7:
                AbstractC08294mh abstractC08294mh4 = (AbstractC08294mh) obj;
                50O r010 = (50O) this.A01;
                1G2 r011 = 50O.A0M;
                r010.A0H.set(false);
                if (abstractC08294mh4 == null || (obj2 = abstractC08294mh4.A03) == null) {
                    return;
                }
                50S r012 = (50S) obj2;
                if (r012.ApW() != null) {
                    C52o ApW = r012.ApW();
                    if (ApW.Aoa()) {
                        50O.A00(r010, r010.A08, ApW.Adz());
                    }
                    50O.A01(r010, r010.A00, ApW.AYF());
                    50O.A01(r010, r010.A02, ApW.As0());
                    boolean AsF = ApW.AsF();
                    C00i c00i = r010.A0F;
                    FbSharedPreferences A0R = 1BK.A0R(c00i);
                    1G2 r013 = r010.A0B;
                    if (A0R.AZn(r013, false) != AsF) {
                        50O.A01(r010, r013, AsF);
                    }
                    int B1w = ApW.B1w();
                    FbSharedPreferences A0R2 = 1BK.A0R(c00i);
                    1G2 r014 = r010.A0A;
                    if (A0R2.ArU(r014, 0) != B1w) {
                        50O.A00(r010, r014, B1w);
                    }
                    boolean As6 = ApW.As6();
                    FbSharedPreferences A0R3 = 1BK.A0R(c00i);
                    1G2 r015 = r010.A07;
                    if (A0R3.AZn(r015, false) != As6) {
                        50O.A01(r010, r015, As6);
                    }
                    String obj3 = ApW.AYE() == null ? "CONTROL" : ApW.AYE().toString();
                    FbSharedPreferences A0R4 = 1BK.A0R(c00i);
                    1G2 r016 = r010.A01;
                    if (!A0R4.A3a(r016, "CONTROL").equals(obj3)) {
                        1Ql A0V = 1BL.A0V(c00i);
                        A0V.CaL(r016, obj3);
                        A0V.commit();
                    }
                    boolean As5 = ApW.As5();
                    FbSharedPreferences A0R5 = 1BK.A0R(c00i);
                    1G2 r017 = r010.A06;
                    if (A0R5.AZn(r017, false) != As5) {
                        50O.A01(r010, r017, As5);
                    }
                    long AYC = ApW.AYC() * 1000;
                    FbSharedPreferences A0R6 = 1BK.A0R(c00i);
                    1G2 r018 = r010.A05;
                    if (1BL.A0A(A0R6, r018) != AYC) {
                        1Ql A0V2 = 1BL.A0V(c00i);
                        A0V2.CaH(r018, AYC);
                        A0V2.commit();
                    }
                    ImmutableList AYG = ApW.AYG();
                    int i = -1;
                    if (!AYG.isEmpty()) {
                        1Du it2 = AYG.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C52r c52r = (C52r) it2.next();
                                if (c52r.B5Z() == 8) {
                                    i = c52r.B5a();
                                }
                            }
                        }
                    }
                    if (i == -1) {
                        i = 15;
                    }
                    FbSharedPreferences A0R7 = 1BK.A0R(c00i);
                    1G2 r019 = r010.A04;
                    if (A0R7.ArU(r019, 15) != i) {
                        50O.A00(r010, r019, i);
                    }
                    ImmutableList AYG2 = ApW.AYG();
                    HashSet A0v = AnonymousClass001.A0v();
                    1Du it3 = AYG2.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (next != null) {
                            1BK.A1N(next, A0v);
                        }
                    }
                    String A002 = A0v.isEmpty() ? "" : C4Bn.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0v);
                    FbSharedPreferences A0R8 = 1BK.A0R(c00i);
                    1G2 r020 = r010.A03;
                    if (!A0R8.A3a(r020, "").equals(A002)) {
                        putBoolean = 1BL.A0V(c00i);
                        putBoolean.CaL(r020, A002);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 8:
                ThreadSummary threadSummary = (ThreadSummary) obj;
                if (threadSummary == null || (messageSuggestedReply = threadSummary.A0f) == null) {
                    return;
                }
                6IM r021 = (6IM) this.A01;
                RelatedPageThreadData relatedPageThreadData = threadSummary.A0y;
                r021.A0A = relatedPageThreadData != null ? relatedPageThreadData.A01 : null;
                if (!r021.A0L.contains(messageSuggestedReply) && !TextUtils.isEmpty(messageSuggestedReply.A00)) {
                    r021.A0K.add(messageSuggestedReply);
                }
                6IM.A02(r021);
                return;
            case 9:
                AbstractC08294mh abstractC08294mh5 = (AbstractC08294mh) obj;
                if (abstractC08294mh5 == null || (r02 = (2JY) abstractC08294mh5.A03) == null || (A0c = r02.A0c(966576963, 2JX.class, -1946893740)) == null) {
                    list = C0ty.A00;
                } else {
                    list = C1A3.A1E(A0c);
                    Iterator it4 = A0c.iterator();
                    while (it4.hasNext()) {
                        2JY A0P = 7zL.A0P(it4);
                        String A0r = A0P.A0r(1753008747);
                        if (A0r == null) {
                            A0r = "";
                        }
                        String A0r2 = A0P.A0r(756285279);
                        if (A0r2 == null) {
                            A0r2 = "";
                        }
                        2JY A0B3 = 1BK.A0B(A0P, 2JX.class, -1019793001, 1213492691);
                        if (A0B3 != null) {
                            ImmutableList A0c2 = A0B3.A0c(-257111303, 2JX.class, -918096008);
                            11T.A0A(A0c2);
                            ArrayList A1E = C1A3.A1E(A0c2);
                            Iterator it5 = A0c2.iterator();
                            while (it5.hasNext()) {
                                2JY A0P2 = 7zL.A0P(it5);
                                String A0r3 = A0P2.A0r(-768546338);
                                if (A0r3 == null) {
                                    A0r3 = "";
                                }
                                String A0r4 = A0P2.A0r(960023506);
                                if (A0r4 == null) {
                                    A0r4 = "";
                                }
                                A1E.add(new C84j(A0r3, A0r4, 6));
                            }
                            c87v = new C87v((List) A1E, 14);
                        } else {
                            c87v = null;
                        }
                        list.add(new C1790AsO(c87v, A0r, A0r2));
                    }
                }
                if (list.isEmpty()) {
                    onFailure(AbF.A1D(7zK.A00(58)));
                    return;
                }
                BvM bvM = (BvM) this.A01;
                List list2 = bvM.A02;
                List list3 = bvM.A03;
                ArrayList arrayList3 = null;
                if (list2 != null) {
                    arrayList2 = AnonymousClass001.A0s();
                    for (Object obj4 : list2) {
                        Iterator it6 = list.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                c1790AsO2 = it6.next();
                                if (11T.A0O(c1790AsO2.A02, obj4)) {
                                }
                            } else {
                                c1790AsO2 = null;
                            }
                        }
                        C1790AsO c1790AsO3 = c1790AsO2;
                        if (c1790AsO3 != null && (str2 = c1790AsO3.A01) != null) {
                            arrayList2.add(str2);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (list3 != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (Object obj5 : list3) {
                        Iterator it7 = list.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                c1790AsO = it7.next();
                                if (11T.A0O(c1790AsO.A02, obj5)) {
                                }
                            } else {
                                c1790AsO = null;
                            }
                        }
                        C1790AsO c1790AsO4 = c1790AsO;
                        if (c1790AsO4 != null && (str = c1790AsO4.A01) != null) {
                            A0s.add(str);
                        }
                    }
                    arrayList3 = A0s;
                }
                if ((arrayList2 == null || arrayList2.isEmpty()) && (arrayList3 == null || arrayList3.isEmpty())) {
                    InAppPurchaseControllerCoro.A0F(bvM.A00, bvM.A01, list);
                    return;
                } else {
                    InAppPurchaseControllerCoro.A0G(bvM.A00, bvM.A01, arrayList2, arrayList3, list, bvM.A04);
                    return;
                }
            default:
                CallStartOutcome callStartOutcome = (CallStartOutcome) obj;
                11T.A0F(callStartOutcome, 0);
                if (callStartOutcome.A00()) {
                    return;
                }
                ((JMR) this.A01).ARr(callStartOutcome.A01);
                return;
        }
        putBoolean.commit();
    }
}
