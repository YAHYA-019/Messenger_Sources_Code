package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import kotlin.jvm.functions.Function1;

/* loaded from: Ilo.class */
public final class Ilo implements 74V {
    public final long A00;
    public final long A01;
    public final ThreadKey A02;
    public final Function1 A03;
    public final /* synthetic */ 9fZ A04;

    public Ilo(9fZ r302, ThreadKey threadKey, Function1 function1, long j, long j2) {
        this.A04 = r302;
        this.A02 = threadKey;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = function1;
    }

    public void A7C(Capabilities capabilities, Long l, Long l2, String str, String str2) {
        11T.A0H(str, str2);
        9fZ r0 = this.A04;
        9fZ.A00(1Br.A03(r0.A01), r0, this.A02, str, str2, this.A03, this.A00, this.A01);
    }

    public void Cf4(Capabilities capabilities, Long l, String str, String str2) {
        11T.A0F(str, 0);
        9fZ r0 = this.A04;
        9fZ.A00(1Br.A03(r0.A01), r0, this.A02, str, (String) null, this.A03, this.A00, this.A01);
    }
}
