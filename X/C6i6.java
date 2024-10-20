package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible;

/* renamed from: X.6i6, reason: invalid class name */
/* loaded from: 6i6.class */
public final class C6i6 implements 1Vf {
    public final Context A00;
    public final 1Br A01;
    public final 6Fz A02;

    public C6i6(Context context, 6Fz r303) {
        11T.A0F(r303, 2);
        this.A00 = context;
        this.A02 = r303;
        this.A01 = 1Bq.A00(66351);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible")) {
            throw 4YV.A0f(str);
        }
        OnThreadVisible onThreadVisible = (OnThreadVisible) r302;
        11T.A0F(onThreadVisible, 0);
        ThreadKey threadKey = onThreadVisible.A00;
        if (threadKey.A1A()) {
            FbUserSession A04 = ((1Fv) this.A01.A00.get()).A04();
            Context context = this.A00;
            89L r0 = (89L) 1Lm.A05(context, A04, 67757);
            06Z AcP = this.A02.AcP();
            LiveData ASY = ((C5xl) 1Bi.A03(67528)).ASY(threadKey);
            11T.A0A(ASY);
            ASY.observeForever(new 89F(context, AcP, ASY, r0, threadKey));
        }
    }
}
