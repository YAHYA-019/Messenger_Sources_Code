package X;

import android.R;
import android.content.Context;
import android.view.View;
import com.facebook.forker.Process;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.wellbeing.harmfulcontent.forward.ratelimit.common.data.ForwardRateLimitInfo;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Cwt.class */
public final /* synthetic */ class Cwt implements AnonymousClass553 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ Bqv A02;
    public final /* synthetic */ ForwardRateLimitInfo A03;
    public final /* synthetic */ MigColorScheme A04;

    public /* synthetic */ Cwt(Context context, ThreadKey threadKey, Bqv bqv, ForwardRateLimitInfo forwardRateLimitInfo, MigColorScheme migColorScheme) {
        this.A03 = forwardRateLimitInfo;
        this.A01 = threadKey;
        this.A02 = bqv;
        this.A00 = context;
        this.A04 = migColorScheme;
    }

    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        ForwardRateLimitInfo forwardRateLimitInfo = this.A03;
        ThreadKey threadKey = this.A01;
        Bqv bqv = this.A02;
        Context context = this.A00;
        MigColorScheme migColorScheme = this.A04;
        C21 c21 = (C21) 1Bn.A0A(83630);
        long j = forwardRateLimitInfo.A00;
        11T.A0F(threadKey, 2);
        1UD A02 = 1Br.A02(c21.A00);
        String A00 = 1BJ.A00(1820);
        1UD r0 = A02;
        1ZG r02 = 1ZG.A01;
        AbO.A0U(AbF.A08(1UD.A00(r0, r02, A00), Process.SD_PIPE), threadKey, j);
        11T.A0F(migColorScheme, 1);
        String A0u = 1BK.A0u(context, 2131957006);
        String str = forwardRateLimitInfo.A01;
        String str2 = forwardRateLimitInfo.A02;
        1Br.A0C(bqv.A02);
        DR6 dr6 = new DR6(context, migColorScheme);
        dr6.A03(A0u);
        dr6.A0J(str);
        dr6.A0G(new CR8(2, j, bqv, threadKey), context.getString(R.string.ok));
        dr6.A0E(new Ric(context, threadKey, bqv, str2, j), context.getString(2131968131));
        dr6.A05();
        AbO.A0U(AbF.A08(AbG.A0A(r02, 1Br.A02(((C21) 1Br.A0B(bqv.A00)).A00), 1BJ.A00(1819)), Process.SD_STDOUT), threadKey, j);
    }
}
