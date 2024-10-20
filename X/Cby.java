package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Cby.class */
public final class Cby implements 2TV {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ CnX A01;
    public final /* synthetic */ Bwo A02;
    public final /* synthetic */ ImmutableList A03;
    public final /* synthetic */ ImmutableList A04;

    public Cby(FbUserSession fbUserSession, CnX cnX, Bwo bwo, ImmutableList immutableList, ImmutableList immutableList2) {
        this.A01 = cnX;
        this.A02 = bwo;
        this.A04 = immutableList;
        this.A03 = immutableList2;
        this.A00 = fbUserSession;
    }

    public /* bridge */ /* synthetic */ void C47(Object obj, Object obj2) {
        CnX cnX = this.A01;
        1BK.A09(cnX.A09).softReport("PhoneAndNotOnMessengerLoader", "Loading sms and not on messenger friends failed", (Throwable) obj2);
        CnX.A03(this.A00, cnX, this.A02, ImmutableList.of(), ImmutableList.of());
    }

    public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
        2TS r0 = (2TS) obj2;
        CnX cnX = this.A01;
        ImmutableList immutableList = r0.A08;
        if (immutableList == null || immutableList.isEmpty()) {
            immutableList = ImmutableList.of();
        }
        ImmutableList immutableList2 = r0.A07;
        if (immutableList2 == null || immutableList2.isEmpty()) {
            immutableList2 = ImmutableList.of();
        }
        Bwo bwo = this.A02;
        ImmutableList immutableList3 = this.A04;
        if (immutableList3 != null && !immutableList3.isEmpty()) {
            immutableList = immutableList3;
        }
        ImmutableList immutableList4 = this.A03;
        if (immutableList4 != null && !immutableList4.isEmpty()) {
            immutableList2 = immutableList4;
        }
        CnX.A03(this.A00, cnX, bwo, immutableList, immutableList2);
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
    }

    public /* bridge */ /* synthetic */ void C9D(Object obj, Object obj2) {
    }
}
