package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import java.util.BitSet;

/* loaded from: ABx.class */
public final class ABx implements 1K9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ 06Z A02;
    public final /* synthetic */ 7UA A03;
    public final /* synthetic */ C3Ng A04;
    public final /* synthetic */ ThreadSummary A05;

    public ABx(Context context, 06Z r303, 7UA r304, C3Ng c3Ng, ThreadSummary threadSummary, int i) {
        this.A03 = r304;
        this.A01 = context;
        this.A02 = r303;
        this.A05 = threadSummary;
        this.A04 = c3Ng;
        this.A00 = i;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        0fH.A0q("WarningOnReportedThreadDialogLauncher", "Failed to fetch user.", th);
        this.A04.A00();
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        User user = (User) obj;
        if (user == null) {
            this.A04.A00();
            return;
        }
        7UA r0 = this.A03;
        Context context = this.A01;
        06Z r02 = this.A02;
        ThreadSummary threadSummary = this.A05;
        C3Ng c3Ng = this.A04;
        int i2 = this.A00;
        MigColorScheme migColorScheme = (MigColorScheme) 1Bu.A06(context, 16979);
        String A13 = 7zL.A13(user);
        boolean A1W = AnonymousClass001.A1W(user.A02(), C1z1.NOT_BLOCKED);
        8P7 r03 = new 8P7(7zL.A0W(context), new C8kh());
        C8kh c8kh = r03.A01;
        c8kh.A03 = migColorScheme;
        BitSet bitSet = r03.A02;
        bitSet.set(1);
        c8kh.A04 = user.A0k;
        if (i2 == 1) {
            i = 2131968015;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw AnonymousClass001.A0N(0Pz.A0T("This dialog type does not have a title: ", i2));
            }
            i = 2131968018;
        }
        C1qo c1qo = r03.A02;
        c8kh.A06 = c1qo.A0D(i);
        bitSet.set(4);
        int i3 = 2131968016;
        if (i2 != 1) {
            i3 = 2131968019;
        }
        c8kh.A07 = c1qo.A0E(i3, A13);
        bitSet.set(5);
        int i4 = i2 != 1 ? 2131968017 : 2131968014;
        if (!A1W) {
            i4 = 2131968006;
        }
        c8kh.A05 = c1qo.A0E(i4, A13);
        bitSet.set(3);
        c8kh.A00 = C9py.A03(r0, ActionId.APP_DID_ENTER_BACKGROUND);
        bitSet.set(0);
        int i5 = 2131968012;
        if (A1W) {
            i5 = 2131968007;
        }
        String A0u = 1BK.A0u(context, i5);
        int i6 = 2131968013;
        if (A1W) {
            i6 = 2131968008;
        }
        String A0v = 1BK.A0v(context, A13, i6);
        11T.A0A(A0v);
        c8kh.A01 = new 9Qu(new C9pc(1, r02, r0, threadSummary, user), A0u, A0v);
        bitSet.set(2);
        if (i2 != 3) {
            c8kh.A02 = new 9Qu(new 9pV(r0, c3Ng, threadSummary, i2), 1BK.A0u(context, 2131968010), 1BK.A0u(context, 2131968011));
        }
        EAX eax = new EAX(context, 0);
        7zP.A15(r03, bitSet, r03.A03);
        eax.setContentView(LithoView.A00(context, c8kh));
        eax.setOnCancelListener(new C9nf(r0, 1));
        eax.show();
        r0.A00 = eax;
        ThreadKey threadKey = threadSummary.A0n;
        11T.A0A(threadKey);
        Context A00 = 1Bf.A00((C1F6) 1Br.A0B(r0.A03));
        try {
            9gJ r04 = new 9gJ(threadKey);
            1Bn.A0K();
            FbInjector.A04(A00);
            r0.A01 = r04;
            9gJ.A00(i2 != 1 ? i2 != 2 ? C98R.A0C : C98R.A0E : C98R.A0D, r04);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }
}
