package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.integrity.frx.model.FRXPage;
import com.facebook.messaging.integrity.frx.model.FRXParams;
import com.facebook.messaging.integrity.frx.model.FeedbackPage;
import com.facebook.messaging.integrity.frx.model.MarketplaceFeedbackPage;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.MarketplaceThreadData;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;

/* loaded from: Cbv.class */
public final class Cbv implements 2TV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cbv(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        Throwable th;
        2TV r306;
        switch (this.A00) {
            case 0:
                FeedbackReportFragment feedbackReportFragment = ((CQ2) this.A01).A00;
                if (feedbackReportFragment != null) {
                    feedbackReportFragment.A1G();
                    return;
                }
                return;
            case 1:
                Throwable th2 = (Throwable) obj2;
                CnR cnR = (CnR) this.A01;
                Object obj3 = this.A02;
                1BK.A09(cnR.A03).softReport("NeueContactPickerActiveNowLoader", "Fetching Active Now recipients from server failed.", th2);
                2TV r0 = cnR.A00;
                if (r0 != null) {
                    r0.C47(obj3, th2);
                    return;
                }
                return;
            case 2:
                th = (Throwable) obj2;
                CnT cnT = (CnT) this.A01;
                1BK.A09(cnT.A03).softReport("NeueContactPickerChatCreateLoader", "Load failed", th);
                r306 = cnT.A00;
                break;
            case 3:
                th = (Throwable) obj2;
                CnU cnU = (CnU) this.A01;
                1BK.A09(cnU.A03).softReport("TopFriendsLoader failure", "", th);
                r306 = cnU.A00;
                break;
            case 4:
                th = (Throwable) obj2;
                Rqs rqs = (Rqs) this.A01;
                1BK.A09(rqs.A03).softReport("TopFriendsAndTopSmsContactsLoader failure", "", th);
                r306 = rqs.A00;
                break;
            case 5:
                th = (Throwable) obj2;
                CnS cnS = (CnS) this.A01;
                1BK.A09(cnS.A03).softReport("TopFriendsLoader failure", "", th);
                r306 = cnS.A00;
                break;
            case 6:
                0fH.A0B(B9p.class, "onLoadFailed");
                ((1FX) this.A02).setException((Throwable) obj2);
                return;
            case 7:
                CHi cHi = (CHi) obj;
                C3F c3f = (C3F) obj2;
                11T.A0H(cHi, c3f);
                6iS r02 = (6iS) this.A01;
                String str = cHi.A08;
                boolean A1W = AnonymousClass001.A1W(cHi.A06, BKp.A01);
                boolean z = cHi.A0B;
                ServiceException serviceException = c3f.A00;
                11T.A09(serviceException);
                r02.A00(serviceException, str, A1W, z, c3f.A01);
                return;
            default:
                11T.A0F(obj2, 1);
                4zI.A03.A06(7zK.A00(19), AnonymousClass001.A0Z(obj2, "Failed to load thread list ", AnonymousClass001.A0k()), AnonymousClass001.A1Z());
                ((C2s8) this.A01).CiL(DDi.A00, C0ty.A00);
                return;
        }
        r306.C47(this.A02, th);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v340, types: [java.util.List] */
    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        MarketplaceFeedbackPage marketplaceFeedbackPage;
        MarketplaceThreadData marketplaceThreadData;
        String string;
        String str;
        Bwo bwo;
        ImmutableList A01;
        2TV r310;
        ImmutableList copyOf;
        2TV r305;
        Object obj3;
        LinkedList A1F;
        ImmutableList immutableList;
        ParticipantInfo participantInfo;
        String A00;
        switch (this.A00) {
            case 0:
                Object obj4 = ((0NB) obj2).A00;
                CQ2 cq2 = (CQ2) this.A01;
                if (obj4 == null) {
                    FeedbackReportFragment feedbackReportFragment = cq2.A00;
                    if (feedbackReportFragment != null) {
                        feedbackReportFragment.A1G();
                        return;
                    }
                    return;
                }
                C8D c8d = (C8D) obj4;
                String str2 = c8d.A02;
                cq2.A02 = str2;
                FeedbackReportFragment feedbackReportFragment2 = cq2.A00;
                if (feedbackReportFragment2 != null) {
                    feedbackReportFragment2.A0U = str2;
                }
                if (str2 != null) {
                    C8U c8u = cq2.A07;
                    FbUserSession fbUserSession = (FbUserSession) this.A02;
                    C1687Apt c1687Apt = new C1687Apt();
                    4YV.A1A(4YU.A0J(GraphQlCallInput.A02, str2, "rapid_reporting_prompt_node_token"), ((2Jf) c1687Apt).A00, "input");
                    5Dh r0 = new 5Dh(c1687Apt);
                    AbstractC05414dq A03 = 1VX.A03(AbJ.A05(c8u.A02), fbUserSession);
                    4YU.A1J(r0, 876431843082365L);
                    A03.A06(r0);
                }
                String A002 = CQ2.A00(cq2);
                FRXParams fRXParams = cq2.A06;
                Integer A003 = fRXParams.A00();
                String str3 = A003 != 0S2.A00 ? null : c8d.A01;
                FeedbackReportFragment feedbackReportFragment3 = cq2.A00;
                if (feedbackReportFragment3 != null) {
                    int intValue = A003.intValue();
                    if (intValue != 1) {
                        if (intValue != 4) {
                            if (intValue != 2) {
                                str = null;
                                if (intValue != 5) {
                                    if (intValue != 0) {
                                        feedbackReportFragment3.A1M(c8d, A002, str3, null, null);
                                        return;
                                    }
                                    C5yq c5yq = C5yq.A0M;
                                    C5yq c5yq2 = fRXParams.A00;
                                    String string2 = c5yq.equals(c5yq2) ? cq2.A0E.getString(2131960042) : c8d.A03;
                                    if (C5yq.A0O.equals(c5yq2) || C5yq.A0Y.equals(c5yq2)) {
                                        str = C5yr.A00(cq2.A0B).BCz(36876657924178661L, "");
                                        11T.A0A(str);
                                    }
                                    cq2.A00.A1M(c8d, A002, str3, string2, str);
                                    return;
                                }
                                if (C5yl.A0A.equals(fRXParams.A09)) {
                                    str = C5yr.A00(cq2.A0B).BCz(36876657924375270L, "");
                                    11T.A0A(str);
                                }
                                feedbackReportFragment3 = cq2.A00;
                                string = c8d.A03;
                            } else {
                                string = cq2.A0E.getString(2131960075);
                                str = null;
                            }
                            feedbackReportFragment3.A1M(c8d, A002, str3, string, str);
                            return;
                        }
                        ThreadSummary threadSummary = feedbackReportFragment3.A0N;
                        if (threadSummary != null && (marketplaceThreadData = threadSummary.A0r) != null && marketplaceThreadData.A01 != null && marketplaceThreadData.A05 != null) {
                            feedbackReportFragment3.A0E.getClass();
                            MarketplaceThreadData marketplaceThreadData2 = feedbackReportFragment3.A0N.A0r;
                            String str4 = marketplaceThreadData2.A01.A07;
                            String str5 = marketplaceThreadData2.A05;
                            HashSet A0v = AnonymousClass001.A0v();
                            ImmutableList.of();
                            String str6 = c8d.A05;
                            String str7 = c8d.A04;
                            ImmutableList immutableList2 = c8d.A00;
                            C1pq.A08("feedbackTags", immutableList2);
                            marketplaceFeedbackPage = new MarketplaceFeedbackPage(immutableList2, null, null, A002, str5, str4, str7, str6, A0v, false, false, true);
                            FRXPage fRXPage = new FRXPage(marketplaceFeedbackPage.A00(), marketplaceFeedbackPage.A03);
                            fRXPage.A06 = marketplaceFeedbackPage;
                            FeedbackReportFragment.A08(fRXPage, feedbackReportFragment3);
                            return;
                        }
                    }
                    feedbackReportFragment3.A0E.getClass();
                    HashSet A0v2 = AnonymousClass001.A0v();
                    ImmutableList.of();
                    String str8 = c8d.A05;
                    String str9 = c8d.A04;
                    ImmutableList immutableList3 = c8d.A00;
                    C1pq.A08("feedbackTags", immutableList3);
                    marketplaceFeedbackPage = new MarketplaceFeedbackPage(immutableList3, null, null, A002, null, null, str9, str8, A0v2, false, false, false);
                    FRXPage fRXPage2 = new FRXPage(marketplaceFeedbackPage.A00(), marketplaceFeedbackPage.A03);
                    fRXPage2.A06 = marketplaceFeedbackPage;
                    FeedbackReportFragment.A08(fRXPage2, feedbackReportFragment3);
                    return;
                }
                return;
            case 1:
                2TS r02 = (2TS) obj2;
                if (r02 == null) {
                    CnR cnR = (CnR) this.A01;
                    Throwable A1D = AbF.A1D("Null results from Fetching Active Now recipients");
                    Object obj5 = this.A02;
                    1BK.A09(cnR.A03).softReport("NeueContactPickerActiveNowLoader", "Null results from Fetching Active Now recipients", A1D);
                    2TV r03 = cnR.A00;
                    if (r03 != null) {
                        r03.C47(obj5, A1D);
                        return;
                    }
                    return;
                }
                CnR cnR2 = (CnR) this.A01;
                if (cnR2.A00 != null) {
                    CN7 cn7 = cnR2.A04;
                    ImmutableList A0r = AbJ.A0r(new D3I(21), r02.A00.A00);
                    BP6 bp6 = BP6.A0X;
                    bwo = (Bwo) this.A02;
                    A01 = CN7.A01(cn7, bp6, A0r, bwo.A06);
                    r310 = cnR2.A00;
                    CCC.A00(r310, A01, bwo);
                    return;
                }
                return;
            case 2:
                2TS r04 = (2TS) obj2;
                2TS r05 = 2TS.A0O;
                CnT cnT = (CnT) this.A01;
                if (r04 == r05) {
                    r305 = cnT.A00;
                    obj3 = this.A02;
                    copyOf = ImmutableList.of();
                    CCC.A00(r305, copyOf, obj3);
                    return;
                }
                ImmutableList immutableList4 = r04.A09;
                copyOf = immutableList4 != null ? ImmutableList.copyOf((Iterable) 2Ri.A02(cnT.A06, immutableList4)) : ImmutableList.of();
                r305 = cnT.A00;
                obj3 = this.A02;
                CCC.A00(r305, copyOf, obj3);
                return;
            case 3:
                2TS r06 = (2TS) obj2;
                2TS r07 = 2TS.A0O;
                CnU cnU = (CnU) this.A01;
                if (r06 == r07) {
                    r305 = cnU.A00;
                    obj3 = this.A02;
                    copyOf = ImmutableList.of();
                    CCC.A00(r305, copyOf, obj3);
                    return;
                }
                copyOf = ImmutableList.copyOf((Iterable) 2Ri.A02(cnU.A05, r06.A0C));
                r305 = cnU.A00;
                obj3 = this.A02;
                CCC.A00(r305, copyOf, obj3);
                return;
            case 4:
                2TS r08 = (2TS) obj2;
                2TS r09 = 2TS.A0O;
                Rqs rqs = (Rqs) this.A01;
                if (r08 == r09) {
                    r305 = rqs.A00;
                    obj3 = this.A02;
                    copyOf = ImmutableList.of();
                    CCC.A00(r305, copyOf, obj3);
                    return;
                }
                if (rqs.A02) {
                    A1F = Rqs.A00(r08.A0D);
                } else {
                    A1F = AbF.A1F();
                    ImmutableList immutableList5 = r08.A0A;
                    if (immutableList5 != null) {
                        A1F.addAll(Rqs.A00(immutableList5));
                    }
                    A1F.addAll(Rqs.A00(r08.A0D));
                }
                copyOf = CN7.A01((CN7) rqs.A04.get(), BP6.A0X, A1F, false);
                r305 = rqs.A00;
                obj3 = this.A02;
                CCC.A00(r305, copyOf, obj3);
                return;
            case 5:
                2TS r010 = (2TS) obj2;
                if (r010 == 2TS.A0O) {
                    r305 = ((CnS) this.A01).A00;
                    obj3 = this.A02;
                    copyOf = ImmutableList.of();
                    CCC.A00(r305, copyOf, obj3);
                    return;
                }
                LinkedList linkedList = new LinkedList(r010.A0C);
                CnS cnS = (CnS) this.A01;
                CN7 cn72 = (CN7) cnS.A04.get();
                BP6 bp62 = BP6.A0X;
                bwo = (Bwo) this.A02;
                A01 = CN7.A01(cn72, bp62, linkedList, bwo.A06);
                r310 = cnS.A00;
                CCC.A00(r310, A01, bwo);
                return;
            case 6:
                2TS r011 = (2TS) obj2;
                if (r011 == null || (immutableList = r011.A04) == null) {
                    0fH.A0B(B9p.class, "Received null result or null contacts list");
                    ((1FX) this.A02).setException(new Exception("Received null result or null contacts list"));
                    return;
                } else {
                    0fH.A07(B9p.class, 1BK.A0k(immutableList), "onLoadSucceeded %d");
                    AbF.A1W(this.A02, immutableList);
                    return;
                }
            case 7:
                CHi cHi = (CHi) obj;
                11T.A0F(cHi, 0);
                6iS r012 = (6iS) this.A01;
                11T.A09(cHi.A05);
                5St r013 = r012.A00.A08;
                if (r013 != null) {
                    2OZ r014 = r013.A00;
                    2SB r015 = r014.A0F;
                    String A004 = 1BJ.A00(397);
                    C4Dv c4Dv = r015.A04.A00;
                    if (c4Dv != null) {
                        c4Dv.A01(false, A004);
                    }
                    if (r014.A0s) {
                        r014.A0s = false;
                        r014.A1b(true);
                    }
                    6F2 r016 = r014.A0c;
                    5Sl A08 = 6F2.A08(r016);
                    Bundle A05 = 1BK.A05();
                    if (A08 != null && A08.A01 != null) {
                        Iterator it = 2Ri.A02(new D2l(r016, 17), 6F2.A08(r016).A01.A01).iterator();
                        ArrayList<String> A0s = AnonymousClass001.A0s();
                        C1Jp.A02(A0s, it);
                        A05.putStringArrayList("loaded_message_ids", A0s);
                        Activity A1P = r016.A1P();
                        if (A1P != null && A1P.getIntent() != null) {
                            A05.putParcelable(4YT.A00(822), A1P.getIntent().getExtras());
                        }
                    }
                    r016.A3K.get();
                    r016.A2u.get();
                    return;
                }
                return;
            default:
                2Un r017 = (2Un) obj2;
                11T.A0F(r017, 1);
                C2s8 c2s8 = (C2s8) this.A01;
                long j = C9g3.A06;
                ImmutableList immutableList6 = r017.A02.A01;
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it2 = immutableList6.iterator();
                while (it2.hasNext()) {
                    ThreadSummary threadSummary2 = (ThreadSummary) it2.next();
                    11T.A0D(threadSummary2);
                    String str10 = threadSummary2.A20;
                    if (str10 == null) {
                        ArrayList A0s3 = AnonymousClass001.A0s();
                        ImmutableList immutableList7 = threadSummary2.A1L;
                        11T.A0A(immutableList7);
                        Iterator it3 = immutableList7.iterator();
                        while (it3.hasNext()) {
                            ThreadParticipant A0W = 4YU.A0W(it3);
                            if (A0W != null) {
                                1BK.A1N(A0W.A05.A09, A0s3);
                            }
                        }
                        if (7zM.A1b(A0s3)) {
                            str10 = 4YV.A0t(", ", A0s3, (Function1) null);
                        }
                    }
                    if (str10 != null) {
                        ImmutableList immutableList8 = threadSummary2.A1L;
                        if (immutableList8.size() > 1) {
                            ArrayList A0s4 = AnonymousClass001.A0s();
                            Iterator it4 = immutableList8.iterator();
                            while (it4.hasNext()) {
                                ThreadParticipant A0W2 = 4YU.A0W(it4);
                                if (A0W2 != null && (participantInfo = A0W2.A05) != null && (A00 = participantInfo.A00()) != null) {
                                    A0s4.add(A00);
                                }
                            }
                            A0s2.add(new 8Lg(threadSummary2, str10, 0QD.A0U(A0s4), 4));
                        }
                    }
                }
                c2s8.CiL(DDj.A00, 0QD.A0R(A0s2));
                return;
        }
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
        2TV r308;
        switch (this.A00) {
            case 0:
                CQ2 cq2 = (CQ2) this.A01;
                FeedbackReportFragment feedbackReportFragment = cq2.A00;
                if (feedbackReportFragment != null) {
                    String A00 = CQ2.A00(cq2);
                    feedbackReportFragment.A0E.getClass();
                    FeedbackPage feedbackPage = new FeedbackPage(ImmutableList.of(), null, null, A00, null, null, null, null, AnonymousClass001.A0v(), true, false);
                    FRXPage fRXPage = new FRXPage(feedbackPage.A00(), feedbackPage.A03);
                    fRXPage.A04 = feedbackPage;
                    CC7 cc7 = feedbackReportFragment.A0I;
                    cc7.getClass();
                    CC7.A00(fRXPage, cc7, false);
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                r308 = ((CnT) this.A01).A00;
                break;
            case 3:
                r308 = ((CnU) this.A01).A00;
                break;
            case 4:
                r308 = ((Rqs) this.A01).A00;
                break;
            case 5:
                r308 = ((CnS) this.A01).A00;
                break;
            case 6:
                0fH.A0A(B9p.class, "onLoadingAsync");
                return;
            case 7:
                CHi cHi = (CHi) obj;
                11T.A0H(cHi, listenableFuture);
                if (cHi.A0C) {
                    ((6iS) this.A01).A02(listenableFuture, AnonymousClass001.A1W(cHi.A06, BKp.A01), cHi.A0B);
                    return;
                }
                return;
        }
        r308.C4n(listenableFuture, this.A02);
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
        ImmutableList immutableList;
        switch (this.A00) {
            case 6:
                2TS r0 = (2TS) obj2;
                if (r0 == null || (immutableList = r0.A04) == null) {
                    0fH.A0B(B9p.class, "Received null result or null contacts list");
                    return;
                } else {
                    0fH.A07(B9p.class, 1BK.A0k(immutableList), "onNewResult %d");
                    return;
                }
            case 7:
                CHN chn = (CHN) obj2;
                11T.A0F(chn, 1);
                Cux cux = (Cux) this.A02;
                boolean z = cux.A01;
                boolean z2 = chn.A07;
                if (z) {
                    if (z2) {
                        0fH.A0j("SyncPrimaryDataSource", "Skipping partial result because we already delivered a full result");
                        return;
                    }
                } else if (!z2) {
                    cux.A01 = true;
                }
                6iS r02 = (6iS) this.A01;
                DataFetchDisposition dataFetchDisposition = chn.A00;
                ThreadSummary threadSummary = chn.A02;
                MessagesCollection messagesCollection = chn.A01;
                User user = chn.A04;
                ImmutableList immutableList2 = chn.A05;
                5Sc r03 = 5Sc.A07;
                11T.A0D(dataFetchDisposition);
                r02.A01(new 5Sc(dataFetchDisposition, messagesCollection, threadSummary, 5Sd.A03, user, immutableList2, z2));
                return;
            default:
                return;
        }
    }
}
