package X;

import com.facebook.messaging.sup.plugins.videocalling.impl.SUPVideoCallingImpl;
import kotlin.jvm.functions.Function1;

/* loaded from: JBa.class */
public final class JBa extends C00q implements Function1 {
    public static final JBa A00 = new JBa();

    public JBa() {
        super(1);
    }

    public static final void A00(HG8 hg8) {
        11T.A0F(hg8, 0);
        JNL jnl = SUPVideoCallingImpl.A06;
        if (jnl != null) {
            hg8.A03(jnl.BDa());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((HG8) obj);
        return 04S.A00;
    }
}
