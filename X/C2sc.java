package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* renamed from: X.2sc, reason: invalid class name */
/* loaded from: 2sc.class */
public final class C2sc implements C2sd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 2eW A01;
    public final /* synthetic */ 2sZ A02;

    public C2sc(Context context, 2eW r303, 2sZ r304) {
        this.A02 = r304;
        this.A01 = r303;
        this.A00 = context;
    }

    @Override // X.C2sd
    public ListenableFuture ARv(ImmutableList immutableList) {
        2eW A01;
        6BT r303;
        2FT A06;
        11T.A0F(immutableList, 0);
        if (immutableList.isEmpty()) {
            r303 = (6BT) 1Br.A0B(this.A02.A00);
            A01 = this.A01;
        } else {
            A01 = this.A01.A01();
            11T.A0A(A01);
            A01.A06 = immutableList;
            r303 = (6BT) this.A02.A00.A00.get();
        }
        Context context = this.A00;
        FbUserSession fbUserSession = r303.A00;
        1Br A012 = 1Lm.A01(fbUserSession, 33133);
        C2eo c2eo = (C2eo) 1Lm.A05(context, fbUserSession, 33132);
        String str = A01.A03;
        if (str == null || str.length() == 0) {
            A06 = c2eo.A06(((C2eq) A012.A00.get()).A00(A01));
        } else {
            Collection collection = A01.A05;
            if (collection == null) {
                collection = C0ty.A00;
            }
            A06 = c2eo.A05(str, A01.A02, collection);
        }
        11T.A0D(A06);
        return A06;
    }
}
