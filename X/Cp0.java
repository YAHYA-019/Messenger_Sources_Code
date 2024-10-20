package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.google.common.collect.ImmutableMap;

/* loaded from: Cp0.class */
public final class Cp0 implements DFa {
    public final MutableLiveData A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Context A06;

    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public Cp0(FbUserSession fbUserSession, Context context) {
        11T.A0G(fbUserSession, 1, context);
        this.A01 = fbUserSession;
        this.A06 = context;
        this.A03 = 1Bu.A01(context, 114982);
        this.A02 = 1Lm.A00(context, fbUserSession, 99475);
        this.A04 = 1Bq.A00(115034);
        1Br A00 = 1Lm.A00(context, fbUserSession, 17016);
        this.A05 = A00;
        this.A00 = new LiveData(new C1798At7(true, AbJ.A0X(A00).A0A()));
    }

    public static final void A00(Context context, View view, QAd qAd, Cp0 cp0) {
        VideoChatLink videoChatLink;
        2Qb A0X = AbJ.A0X(cp0.A05);
        if (!A0X.A0N() || (videoChatLink = A0X.A06) == null || !videoChatLink.A0Z) {
            ((JOS) 1Br.A0B(cp0.A02)).D0D(6);
            return;
        }
        Integer num = qAd.A0A ? 0S2.A00 : 0S2.A01;
        1Bn.A0A(147728);
        new CIG(cp0.A01, context).A01(view, (ImmutableMap) null, num, "messenger_lobby", "rooms_lobby_invite");
    }

    @Override // X.DFa
    public void Cx1(Context context, View view, QAd qAd) {
        11T.A0F(context, 1);
        1Br.A0C(this.A04);
        C00i c00i = this.A03.A00;
        if (((HuL) c00i.get()).A03()) {
            ((HuL) c00i.get()).A02(new D0A(context, view, qAd, this));
        } else {
            A00(context, view, qAd, this);
        }
    }
}
