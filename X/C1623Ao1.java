package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.contacts.picker.SingleTapActionConfig;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.Ao1, reason: case insensitive filesystem */
/* loaded from: Ao1.class */
public final class C1623Ao1 extends 2UV implements DJk {
    public Context A00;
    public 1BY A01;
    public ListenableFuture A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final Executor A08;

    public C1623Ao1(1BO r302) {
        super((Executor) 1Bi.A03(16432));
        this.A04 = AbH.A0E();
        this.A07 = 1BQ.A02(17029);
        this.A03 = 1BV.A01((1BY) null, 17055);
        this.A05 = 1BV.A01((1BY) null, 84364);
        Context A03 = AbI.A03((1BY) null);
        this.A00 = A03;
        this.A06 = AbF.A0Q(A03, 67720);
        this.A01 = 7zL.A0Q(r302);
        this.A08 = (Executor) 1Bi.A03(16432);
    }

    public /* bridge */ /* synthetic */ 2UW A02(Object obj) {
        2UW r0 = 2UV.A03;
        11T.A0I(r0, 4YT.A00(26));
        return r0;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A03(2UW r302, Object obj) {
        Bwo bwo = (Bwo) obj;
        1BY r0 = this.A01;
        FbUserSession A05 = 1Fw.A05(r0);
        2fE r02 = (2fE) 1Lo.A04((Context) null, A05, r0, 17064);
        boolean z = bwo.A06;
        SingleTapActionConfig singleTapActionConfig = bwo.A02;
        B68 b68 = new B68(singleTapActionConfig, r02, this, z);
        ImmutableList immutableList = bwo.A05;
        2FT A02 = 2FP.A02(new D2g(bwo), 1Kd.A02(new ListenableFuture[]{b68.A00(immutableList), new B69(A05, singleTapActionConfig, this, z).A00(immutableList)}), this.A08);
        this.A02 = A02;
        return A02;
    }

    public void AEC() {
        7zO.A1X(this.A02);
    }
}
