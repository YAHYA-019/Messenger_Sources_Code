package X;

import android.content.Context;
import android.view.View;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import java.util.BitSet;

/* renamed from: X.8vo, reason: invalid class name */
/* loaded from: 8vo.class */
public final class C8vo extends C63h implements AYD, C6eR {
    public 06Z A00;
    public 1BY A01;
    public ThreadKey A02;
    public 7Wh A03;
    public final C4r A04;

    public C8vo(1BO r302) {
        super((Context) 1Bn.A0B(83719));
        this.A01 = 7zL.A0Q(r302);
        this.A04 = ((AbR) 1Bn.A0B(450)).A0t((Context) 1Bn.A0B(83719));
    }

    @Override // X.C63h
    public 1LI A05(1Iw r302, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        C00663oZ c00663oZ = (C00663oZ) 1Bi.A03(32770);
        6JM r0 = (6JM) 1Bn.A0E((Context) null, this.A01, 67632);
        Message message = anonymousClass622.A03;
        this.A02 = message.A0V;
        ThreadViewColorScheme A00 = r0.A00(r303);
        this.A03 = r306;
        8SX r02 = new 8SX(r302, new 8oU());
        boolean A05 = c00663oZ.A05(message);
        8oU r03 = r02.A01;
        r03.A04 = A05;
        BitSet bitSet = r02.A02;
        bitSet.set(3);
        r03.A00 = r304;
        bitSet.set(4);
        r03.A02 = this;
        bitSet.set(0);
        r03.A03 = A00;
        bitSet.set(1);
        r03.A01 = message;
        bitSet.set(2);
        return r02.A2W();
    }

    public void BMf(View view, 6Az r303, Message message) {
        7Wh r0 = this.A03;
        if (r0 != null) {
            r0.CXA(view, new C7sh(null, null, 4YT.A00(80)));
        }
        this.A04.A00(view, this.A00, r303, message, this.A02);
    }

    @Override // X.C6eR
    public void Cp5(06Z r302) {
        this.A00 = r302;
    }
}
