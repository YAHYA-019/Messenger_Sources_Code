package X;

import android.os.Bundle;
import com.facebook.payments.p2p.messenger.core.prefs.transactions.MessengerPayHistoryLoaderResult;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.facebook.payments.p2p.service.model.transactions.FetchMoreTransactionsParams;
import com.facebook.payments.p2p.service.model.transactions.FetchTransactionListParams;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: Fcu.class */
public final class Fcu implements 2SQ {
    public 2eS A00;
    public 2eS A01;
    public 2TV A02;
    public MessengerPayHistoryLoaderResult A03;
    public boolean A04 = false;
    public final C1kw A05;
    public final C0dp A06;
    public final Fch A07;
    public final Executor A08;

    public Fcu() {
        Fch A0b = DKD.A0b();
        C1kw A0F = DKD.A0F();
        C0dp A0B = AbI.A0B();
        Executor A1D = AbJ.A1D();
        this.A07 = A0b;
        this.A05 = A0F;
        this.A06 = A0B;
        this.A08 = A1D;
    }

    public static void A00(RQu rQu, Fcu fcu, String str, long j) {
        MessengerPayHistoryLoaderResult messengerPayHistoryLoaderResult = fcu.A03;
        if (messengerPayHistoryLoaderResult != null) {
            ImmutableList immutableList = messengerPayHistoryLoaderResult.A01;
            if (immutableList == null) {
                immutableList = messengerPayHistoryLoaderResult.A00;
            }
            int size = immutableList.size();
            MessengerPayHistoryLoaderResult messengerPayHistoryLoaderResult2 = fcu.A03;
            ImmutableList immutableList2 = messengerPayHistoryLoaderResult2.A01;
            if (immutableList2 == null) {
                immutableList2 = messengerPayHistoryLoaderResult2.A00;
            }
            PaymentTransaction paymentTransaction = (PaymentTransaction) immutableList2.get(size - 1);
            EOe eOe = rQu.A01;
            if (eOe != null) {
                DU5 A00 = DU5.A00(fcu.A05);
                DUD A04 = DUD.A04(eOe, str);
                A04.A0D(TraceFieldType.RequestID, String.valueOf(j));
                A04.A0D("last_transaction_id", paymentTransaction.A0E);
                A00.A03(A04);
            }
        }
    }

    public void A01(RQu rQu) {
        ListenableFuture A04;
        DeQ deQ;
        String str;
        0fH.A07(Fcu.class, rQu, "startLoad called with %s");
        if (rQu.A00.ordinal() != 0) {
            MessengerPayHistoryLoaderResult messengerPayHistoryLoaderResult = this.A03;
            if (messengerPayHistoryLoaderResult == null) {
                str = "Initial fetch of messenger pay history items not done. Params %s";
            } else if (messengerPayHistoryLoaderResult.A02) {
                str = "No more messenger pay history items to fetch. Params %s";
            } else {
                EOe eOe = rQu.A01;
                Preconditions.checkArgument(AnonymousClass001.A1T(eOe));
                if (this.A00 == null) {
                    if (this.A01 == null) {
                        0fH.A0A(Fcu.class, "doLoadMoreHistory - Starting more history items fetch");
                        MessengerPayHistoryLoaderResult messengerPayHistoryLoaderResult2 = this.A03;
                        ImmutableList immutableList = messengerPayHistoryLoaderResult2.A01;
                        if (immutableList == null) {
                            immutableList = messengerPayHistoryLoaderResult2.A00;
                        }
                        int size = immutableList.size();
                        MessengerPayHistoryLoaderResult messengerPayHistoryLoaderResult3 = this.A03;
                        ImmutableList immutableList2 = messengerPayHistoryLoaderResult3.A01;
                        if (immutableList2 == null) {
                            immutableList2 = messengerPayHistoryLoaderResult3.A00;
                        }
                        PaymentTransaction paymentTransaction = (PaymentTransaction) immutableList2.get(size - 1);
                        Fch fch = this.A07;
                        FetchMoreTransactionsParams fetchMoreTransactionsParams = new FetchMoreTransactionsParams(eOe, Long.parseLong(paymentTransaction.A0A));
                        Bundle A05 = 1BK.A05();
                        A05.putParcelable("fetchMoreTransactionsParams", fetchMoreTransactionsParams);
                        A04 = Fvf.A00(Fch.A01(A05, fch, 1BJ.A00(1307)), fch, 33);
                        this.A02.C4n(A04, rQu);
                        long now = this.A06.now();
                        A00(rQu, this, "p2p_history_get_more_request", now);
                        deQ = new DeQ(rQu, this, 2, now);
                        this.A01 = new 2eS(deQ, A04);
                        1Kd.A0F(deQ, A04, this.A08);
                        return;
                    }
                    str = "Load of more history items already in progress. Params %s";
                }
                str = "Load already in progress. Params %s";
            }
        } else if (this.A03 != null) {
            this.A04 = true;
            str = "Initial fetch of messenger pay history items already done. Params %s";
        } else {
            2eS r0 = this.A01;
            if (r0 != null) {
                r0.A00(false);
                this.A01 = null;
            }
            if (this.A00 == null) {
                0fH.A0A(Fcu.class, "Starting messenger pay history items list fetch");
                EOe eOe2 = rQu.A01;
                if (eOe2 != null) {
                    Fch fch2 = this.A07;
                    FetchTransactionListParams fetchTransactionListParams = new FetchTransactionListParams(eOe2, 50);
                    Bundle A052 = 1BK.A05();
                    A052.putParcelable("fetchTransactionListParams", fetchTransactionListParams);
                    A04 = Fvf.A00(Fch.A01(A052, fch2, 1BJ.A00(420)), fch2, 32);
                    this.A02.C4n(A04, rQu);
                    long now2 = this.A06.now();
                    DKE.A1K(DU5.A00(this.A05), DUD.A04(eOe2, AbstractC00603o4.A00(77)), now2);
                    deQ = new DeQ(rQu, this, 0, now2);
                } else {
                    EKm eKm = rQu.A02;
                    if (eKm == null) {
                        return;
                    }
                    A04 = this.A07.A04(eKm);
                    this.A02.C4n(A04, rQu);
                    long now3 = this.A06.now();
                    DKE.A1K(DU5.A00(this.A05), DUD.A04(eKm, AbstractC00603o4.A00(77)), now3);
                    deQ = new DeQ(rQu, this, 1, now3);
                }
                this.A00 = new 2eS(deQ, A04);
                1Kd.A0F(deQ, A04, this.A08);
                return;
            }
            str = "Load already in progress. Params %s";
        }
        0fH.A07(Fcu.class, rQu, str);
    }

    public void AEC() {
        2eS r0 = this.A00;
        if (r0 != null) {
            r0.A00(false);
            this.A00 = null;
        }
        2eS r02 = this.A01;
        if (r02 != null) {
            r02.A00(false);
            this.A01 = null;
        }
        this.A03 = null;
    }

    public void CmR(2TV r302) {
        this.A02 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        throw 0Q8.createAndThrow();
    }
}
