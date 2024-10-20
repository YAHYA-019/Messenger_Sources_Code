package X;

import com.facebook.inject.FbInjector;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9ka, reason: invalid class name */
/* loaded from: 9ka.class */
public final class C9ka {
    public final 1BP A06 = FbInjector.A00;
    public final 1Br A01 = 7zM.A0g(FbInjector.A03, 84478);
    public final 1Br A02 = 1Bq.A00(65723);
    public final 1Br A03 = 7zM.A0g(FbInjector.A03, 33135);
    public 95Z A00 = 95Z.A03;
    public final 2TO A05 = new C90p(this, 2);
    public final 2TW A04 = new C9w6(this, 2);

    public static final void A00(C9ka c9ka) {
        0fH.A0j("HighlightsClassicActiveNowLoader", "::maybeLoadActiveNow");
        ((2UV) 1Br.A0B(c9ka.A01)).D1t(1BK.A0d());
    }

    public static final void A01(C9ka c9ka, C9fj c9fj, Function1 function1) {
        0fH.A0j("HighlightsClassicActiveNowLoader", AnonymousClass001.A0Z(c9fj, "::updateResult result:", AnonymousClass001.A0k()));
        if (!((1XZ) 1Br.A0B(c9ka.A02)).BUJ()) {
            c9ka.A00 = 95Z.A04;
            c9fj = C9fj.A03;
            11T.A0B(c9fj);
        }
        function1.invoke(new 8Mz(c9ka.A00, c9fj));
    }
}
