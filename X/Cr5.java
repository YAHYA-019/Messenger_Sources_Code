package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.analytics.ttrc.surface.search.event.OnSearchItemClicked;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: Cr5.class */
public final class Cr5 implements DJ0 {
    public 1BY A00;
    public final Context A02;
    public final 06Z A03;
    public final C00i A05;
    public final AcP A07;
    public final DIT A08;
    public final CnY A09;
    public final C1T A0A;
    public final Bgz A0B;
    public final FbUserSession A0C;
    public String A01 = "";
    public final C00i A04 = 1BV.A01((1BY) null, 84471);
    public final C00i A06 = 1BV.A01((1BY) null, 147682);

    public Cr5(Context context, 06Z r303, FbUserSession fbUserSession, 1BO r305, AcP acP, DIT dit, CnY cnY, C1T c1t, Bgz bgz) {
        this.A00 = 7zL.A0Q(r305);
        this.A05 = 1Lo.A00(context, fbUserSession, 49481);
        this.A02 = context;
        this.A03 = r303;
        this.A07 = acP;
        this.A0B = bgz;
        this.A0C = fbUserSession;
        this.A09 = cnY;
        this.A0A = c1t;
        this.A08 = dit;
    }

    public static void A00(ThreadSummary threadSummary, Cr5 cr5, BP5 bp5, DK4 dk4, AcX acX, ImmutableList immutableList, int i, int i2, int i3, int i4, int i5) {
        A01(cr5, bp5, dk4, acX, immutableList, i, i2, i3, i4);
        if (threadSummary != null) {
            ((2Zf) 1Bi.A03(68775)).A00(threadSummary, 3);
            Context context = cr5.A02;
            FbUserSession fbUserSession = cr5.A0C;
            if (C5nn.A00(context, fbUserSession, threadSummary)) {
                ((C9xm) 1Bn.A0E((Context) null, cr5.A00, 68776)).A02(context, cr5.A03, fbUserSession, threadSummary, 3);
                return;
            }
            return;
        }
        1BY r0 = cr5.A00;
        1Bn.A0E((Context) null, r0, 50205);
        ListenableFuture listenableFuture = (ListenableFuture) acX.A07((Crs) 1Hv.A02(AbI.A03(r0), 83519));
        if (listenableFuture == null) {
            0fH.A0o("SearchListItemClickCallbacksFactory", "Unexpected threadKeyFuture is null");
            return;
        }
        CmK cmK = new CmK(new OnSearchItemClicked(), cr5, acX, i, i5);
        listenableFuture.addListener(new D9H(cmK, cr5, listenableFuture), (Executor) 1Bi.A03(16456));
    }

    public static void A01(Cr5 cr5, BP5 bp5, DK4 dk4, AcX acX, ImmutableList immutableList, int i, int i2, int i3, int i4) {
        ImmutableList A06 = AlH.A06(cr5.A0B.A00);
        1BY r0 = cr5.A00;
        C1315Adt c1315Adt = (C1315Adt) 1Bn.A0E((Context) null, r0, 83509);
        if (A06 != null) {
            cr5.A07.A0C((BP5) null, A06, (ImmutableList) null, cr5.A01);
        }
        String A05 = AcX.A05(acX);
        if (A05 != null) {
            1Bn.A0E((Context) null, r0, 83510);
            Crp crp = new Crp(cr5.A0C, cr5.A02);
            ListenableFuture listenableFuture = (ListenableFuture) acX.A07((Crs) 1Hv.A02(AbI.A03(r0), 83519));
            if (listenableFuture == null) {
                0fH.A18("SearchListItemClickCallbacksFactory", "Unexpected threadKeyFuture is null, user id: %s", new Object[]{A05});
            } else {
                listenableFuture.addListener(new D9H(new CmO(cr5, bp5, dk4, acX, c1315Adt, crp, immutableList, A05, i, i2, i3, i4), cr5, listenableFuture), (Executor) 1Bi.A03(16456));
            }
        }
    }

    @Override // X.DJ0
    public void Bid(DK4 dk4, String str, String str2, int i, int i2, int i3, boolean z) {
    }

    @Override // X.DJ0
    public void Big(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, boolean z) {
    }

    @Override // X.DJ0
    public void Bih(String str, String str2, int i, int i2) {
    }

    @Override // X.DJ0
    public void Bii(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, int i, int i2) {
    }

    @Override // X.DJ0
    public void Bzv(BP5 bp5, DK4 dk4, AcX acX, int i, int i2, int i3, int i4) {
    }

    @Override // X.DJ0
    public void C0l() {
        DIT dit = this.A08;
        if (dit != null) {
            dit.CVt(this.A01);
        }
    }

    @Override // X.DJ0
    public void C70(BP5 bp5, int i) {
        AcP acP = this.A07;
        AeG aeG = acP.A0G;
        Long l = aeG.A02;
        ImmutableList A06 = AlH.A06(this.A0B.A00);
        BP3.A00(BP5.A0f);
        if (A06 != null) {
            acP.A0C((BP5) null, A06, (ImmutableList) null, this.A01);
        }
        if (aeG.A02 != null) {
            aeG.A03 = AcP.A05(acP, -1);
        }
        this.A04.get();
        CB7.A00(this.A02, (ThreadSummary) null, this.A01, "universal_search", (String) null, String.valueOf(l));
    }

    @Override // X.DJ0
    public void CJP(BP5 bp5, DK4 dk4, Integer num, Integer num2, String str) {
        DIT dit;
        String str2;
        BP5 bp52;
        int intValue = num2 != null ? num2.intValue() : -1;
        switch (num.intValue()) {
            case 0:
                AcP acP = this.A07;
                BP3.A00(bp5);
                AeG aeG = acP.A0G;
                if (aeG.A02 != null) {
                    aeG.A03 = AcP.A05(acP, intValue);
                }
                this.A04.get();
                CB7.A00(this.A02, (ThreadSummary) null, this.A01, "integrated_message_search_server", "see_all", String.valueOf(aeG.A02));
                return;
            case 1:
                AlH alH = this.A0B.A00;
                if (AlH.A06(alH) != null) {
                    this.A07.A0C((BP5) null, AlH.A06(alH), (ImmutableList) null, this.A01);
                }
                dit = this.A08;
                if (dit != null) {
                    str2 = this.A01;
                    bp52 = BP5.A09;
                    break;
                } else {
                    return;
                }
            case 2:
                dit = this.A08;
                if (dit != null) {
                    str2 = this.A01;
                    bp52 = BP5.A05;
                    break;
                } else {
                    return;
                }
            case 3:
                AlH alH2 = this.A0B.A00;
                if (AlH.A06(alH2) != null) {
                    this.A07.A0C((BP5) null, AlH.A06(alH2), (ImmutableList) null, this.A01);
                }
                dit = this.A08;
                if (dit != null) {
                    str2 = this.A01;
                    bp52 = BP5.A0J;
                    break;
                } else {
                    return;
                }
            case 4:
                AlH alH3 = this.A0B.A00;
                if (AlH.A06(alH3) != null) {
                    this.A07.A0C((BP5) null, AlH.A06(alH3), (ImmutableList) null, this.A01);
                }
                dit = this.A08;
                if (dit != null) {
                    str2 = this.A01;
                    bp52 = BP5.A0V;
                    break;
                } else {
                    return;
                }
            case 5:
                AlH alH4 = this.A0B.A00;
                if (AlH.A06(alH4) != null) {
                    this.A07.A0C((BP5) null, AlH.A06(alH4), (ImmutableList) null, this.A01);
                }
                dit = this.A08;
                if (dit != null) {
                    str2 = this.A01;
                    bp52 = BP5.A0L;
                    break;
                } else {
                    return;
                }
            case 6:
                AlH alH5 = this.A0B.A00;
                if (AlH.A06(alH5) != null) {
                    this.A07.A0C((BP5) null, AlH.A06(alH5), (ImmutableList) null, this.A01);
                }
                dit = this.A08;
                if (dit != null) {
                    str2 = this.A01;
                    bp52 = BP5.A0M;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        dit.CWC(bp52, Integer.valueOf(intValue), str2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    @Override // X.DJ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CJW(X.BP5 r302, X.DK4 r303, X.AcX r304, int r305, int r306, int r307, int r308, int r309) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cr5.CJW(X.BP5, X.DK4, X.AcX, int, int, int, int, int):void");
    }

    @Override // X.DJ0
    public void CJX(View view, BP5 bp5, DK4 dk4, AcX acX, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.DJ0
    public void CJm() {
    }

    @Override // X.DJ0
    public void CNx(BP5 bp5, DK4 dk4, AcX acX, int i, int i2, int i3, int i4, int i5, long j) {
    }

    @Override // X.DJ0
    public void Ctb(String str) {
        this.A01 = str;
    }

    @Override // X.DJ0
    public void D0O() {
    }
}
