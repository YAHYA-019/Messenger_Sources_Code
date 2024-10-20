package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.contacts.server.FetchPaymentEligibleContactsParams;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: Cbk.class */
public final class Cbk implements CallerContextable, DJk {
    public static final String __redex_internal_original_name = "NeueContactPickerPaymentEligibleContactsLoader";
    public 2TV A00;
    public ListenableFuture A01;
    public final C01s A02;
    public final BlueServiceOperationFactory A03;
    public final C00i A04;
    public final Executor A05;
    public final Context A06;

    public Cbk(Context context) {
        this.A06 = context;
        this.A04 = 7zL.A0R(context, 84364);
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0E(context, (1BY) null, 33031);
        Executor A1D = AbJ.A1D();
        C01s A0I = 1BL.A0I();
        this.A03 = blueServiceOperationFactory;
        this.A05 = A1D;
        this.A02 = A0I;
    }

    public void AEC() {
        ListenableFuture listenableFuture = this.A01;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            this.A01 = null;
        }
    }

    public void CmR(2TV r302) {
        r302.getClass();
        this.A00 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        ListenableFuture listenableFuture = this.A01;
        if (listenableFuture == null || listenableFuture.isDone()) {
            Bundle A05 = 1BK.A05();
            A05.putParcelable("fetchPaymentEligibleContactsParams", new FetchPaymentEligibleContactsParams(""));
            1IB A0H = AbK.A0H(A05, AbH.A0B(this), this.A03, 1BJ.A00(414));
            this.A01 = A0H;
            this.A00.C4n(A0H, obj);
            1Kd.A0F(D4p.A00(obj, this, 51), this.A01, this.A05);
        }
    }
}
