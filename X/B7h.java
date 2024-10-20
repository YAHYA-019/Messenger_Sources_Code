package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: B7h.class */
public final class B7h extends GS2 {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final Context A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7h(FbUserSession fbUserSession, Context context) {
        super("IgMediaSharePickerPresenter");
        1BL.A1F(fbUserSession, context);
        this.A00 = fbUserSession;
        this.A05 = context;
        this.A02 = 1Bu.A01(context, 115390);
        this.A04 = 1Bu.A01(context, 84945);
        this.A01 = 1Lm.A00(context, fbUserSession, 99475);
        this.A03 = AbG.A0M();
    }

    public static final QAe A00(B7h b7h) {
        if (b7h.A0V().isPresent()) {
            Object obj = b7h.A0V().get();
            11T.A0D(obj);
            return (QAe) obj;
        }
        List A14 = C0s8.A14(QqX.A02, QqX.A03, QqX.A04);
        JOL B3j = ((JOS) 1Br.A0B(b7h.A01)).B3j(7);
        boolean z = true;
        if (B3j == null || !B3j.BT9()) {
            z = false;
        }
        return new QAe((QqX) A14.get(0), (String) null, A14, !z);
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        11T.A0F(jFq, 0);
        A0Z(A00(this));
    }
}
