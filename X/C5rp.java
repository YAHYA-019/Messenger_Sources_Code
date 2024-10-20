package X;

import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;

/* renamed from: X.5rp, reason: invalid class name */
/* loaded from: 5rp.class */
public final class C5rp {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C5rp(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 66207);
        this.A01 = 1Bu.A03(r0, 66208);
    }

    public static final int A00(Context context, ThreadThemeInfo threadThemeInfo) {
        int i;
        11T.A0F(context, 0);
        return (threadThemeInfo == null || (i = threadThemeInfo.A08) == 0) ? 0NA.A01(context, 2130969141, context.getColor(2132214411)) : i;
    }

    public final int A01(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 0);
        if (threadSummary == null) {
            return 0NA.A01(context, 2130969141, context.getColor(2132214411));
        }
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979);
        C5rq c5rq = (C5rq) 1Br.A0B(this.A01);
        CompositeThreadThemeInfo AdX = threadSummary.AdX();
        11T.A0A(AdX);
        return A00(context, c5rq.A00(migColorScheme, AdX, threadSummary.A1S));
    }

    public final int A02(ThreadSummary threadSummary) {
        if (threadSummary == null) {
            return 0;
        }
        MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E((Context) null, this.A02.A00, 16979);
        C5rq c5rq = (C5rq) this.A01.A00.get();
        CompositeThreadThemeInfo AdX = threadSummary.AdX();
        11T.A0A(AdX);
        ThreadThemeInfo A00 = c5rq.A00(migColorScheme, AdX, threadSummary.A1S);
        if (A00 != null) {
            return A00.A08;
        }
        return 0;
    }
}
