package X;

import android.os.Bundle;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.nativepagereply.orders.threadsettings.model.BusinessInboxPlacedOrder;
import com.facebook.messaging.threadview.summary.bottomsheet.MetaAiThreadSummaryBottomSheet;

/* loaded from: AKl.class */
public final class AKl extends C00q implements C00m {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKl(int i, long j, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = j;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return F63.A04.A03((C23d) this.A04, (DLQ) this.A02, ((FHF) this.A03).A03, this.A01);
            case 1:
                DeA deA = (FH1) this.A04;
                ((FH1) deA).A06 = false;
                ((ETY) 1Br.A0B(deA.A00)).A00(((8JN) this.A02).A06, C0zc.A03(0zY.A05, F8g.A01.A00(this.A01)), true);
                7zL.A1R(this.A03);
                return 04S.A00;
            case 2:
                AZy aZy = (AZy) ((C00i) this.A02).get();
                long j = ((0Pn) this.A04).element;
                long j2 = this.A01;
                String str = ((BusinessInboxPlacedOrder) this.A03).A03;
                11T.A0A(str);
                aZy.Bbl(j, j2, Long.parseLong(str));
                return 04S.A00;
            case 3:
                long j3 = this.A01;
                8fB r0 = (8fB) this.A04;
                return new DNa(C83d.A00(this.A02, r0, this.A03, 48), j3, AnonymousClass001.A1W(r0.A01.A01, C95v.A03));
            default:
                06Z r02 = (06Z) this.A02;
                ThreadKey threadKey = (ThreadKey) this.A04;
                double d = this.A01;
                11T.A0H(r02, threadKey);
                2Ov metaAiThreadSummaryBottomSheet = new MetaAiThreadSummaryBottomSheet();
                Bundle A05 = 1BK.A05();
                A05.putLong("THREAD_ID_ARG", threadKey.A04);
                A05.putDouble("START_TIMESTAMP_MS_ARG", d);
                A05.putLong("ENTRY_POINT_TYPE_ARG", 2);
                A05.putLong("THREAD_TYPE_ARG", 9Ec.A00(threadKey));
                metaAiThreadSummaryBottomSheet.setArguments(A05);
                metaAiThreadSummaryBottomSheet.A0m(r02, 1BJ.A00(807));
                return 04S.A00;
        }
    }
}
