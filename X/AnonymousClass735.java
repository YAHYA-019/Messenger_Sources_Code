package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.735, reason: invalid class name */
/* loaded from: 735.class */
public final class AnonymousClass735 implements AnonymousClass738 {
    public final Context A00;
    public final 1Br A01;
    public final ThreadKey A02;
    public final C01i A03;
    public final boolean A04;

    public AnonymousClass735(Context context, ThreadKey threadKey, boolean z) {
        11T.A0F(context, 1);
        11T.A0F(threadKey, 2);
        this.A00 = context;
        this.A02 = threadKey;
        this.A04 = z;
        this.A01 = 1Bu.A00(66783);
        this.A03 = C01g.A00(C03i.A03, new AnonymousClass831(this, 15));
    }

    @Override // X.AnonymousClass738
    public C6qy AWw(5vW r302) {
        return ((7I3) this.A03.getValue()).AWw(r302);
    }

    @Override // X.AnonymousClass738
    public C6qy BBS(5vW r302) {
        return ((7I3) this.A03.getValue()).BBS(r302);
    }
}
