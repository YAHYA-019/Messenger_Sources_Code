package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.45c, reason: invalid class name */
/* loaded from: 45c.class */
public final class C45c {
    public final 1Br A02;
    public final 1De A05;
    public final 1Br A03 = 1Bq.A00(83779);
    public final 1Br A00 = 1Bq.A00(83834);
    public final 1Br A01 = 1Bq.A00(83820);
    public final 1BP A04 = FbInjector.A00;

    public C45c(1De r302) {
        this.A05 = r302;
        this.A02 = 1Bu.A03(r302.A00, 83821);
    }

    public final C7x A00(Bitmap bitmap, ThreadKey threadKey, String str, String str2) {
        C9H c9h = (C9H) 1Br.A0B(this.A01);
        Context context = FbInjector.A03;
        11T.A0A(context);
        C7x A01 = c9h.A01(context, bitmap, threadKey, str, str2);
        if (A01 != null) {
            C00i c00i = this.A02.A00;
            c00i.get();
            if (!C5sb.A00(A01, str, str2)) {
                C5sb c5sb = (C5sb) c00i.get();
                Context context2 = FbInjector.A03;
                11T.A0A(context2);
                return c5sb.A02(context2, bitmap, threadKey, str, str2);
            }
        }
        return A01;
    }
}
