package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: C95.class */
public final class C95 {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;

    public C95(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A04 = 1Bu.A01(context, 82763);
        this.A05 = 1Bq.A00(68332);
        this.A06 = 1HG.A00(context, 68009);
        this.A03 = 1Bu.A01(context, 67784);
        this.A01 = 7zM.A0f(context);
        this.A02 = 1Bu.A01(context, 82650);
    }

    public final BdS A00() {
        CHy cHy = (CHy) 1Br.A0B(this.A02);
        Context context = this.A00;
        C1668ApB c1668ApB = new C1668ApB(context, context.getResources().getString(2131957324));
        CHy.A00(c1668ApB, cHy);
        return new BdS(c1668ApB);
    }

    public final void A01(Context context, View view) {
        ((6LF) 1Br.A0B(this.A03)).A03(view, 7zQ.A0m(this.A01), 4YU.A0t(context.getResources(), 2131957317));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.0CL] */
    public final void A02(FbUserSession fbUserSession, DGn dGn, ThreadKey threadKey) {
        11T.A0F(fbUserSession, 0);
        ThreadSummary A00 = ((C6n6) 1Br.A0B(this.A06)).A00(threadKey);
        if (A00 != null) {
            dGn.C4c(A00);
            return;
        }
        ?? obj = new Object();
        Object obj2 = new Object();
        Context context = this.A00;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) AnonymousClass016.A00(context, LifecycleOwner.class);
        C2aj A03 = 2aK.A03((Integer) null, 2Zo.A00(), new AnonymousClass851(this, (Object) obj, obj2, dGn, (0DR) null, 16), lifecycleOwner != null ? 7zO.A16(lifecycleOwner) : 7zN.A0y(), 2);
        ((0CL) obj).element = ((1xC) 1Lm.A05(context, fbUserSession, 33148)).A01(new CyC(2, dGn, threadKey, obj2, this, A03), Integer.valueOf(ThreadKey.A00(threadKey.A06)), threadKey.A0s());
    }
}
