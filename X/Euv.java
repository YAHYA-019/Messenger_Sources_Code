package X;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function1;

/* loaded from: Euv.class */
public final class Euv {
    public int A00;
    public AnonymousClass088 A01;
    public Function1 A02;
    public final ComponentActivity A03;
    public final String A04;

    public Euv(ComponentActivity componentActivity, String str) {
        1BL.A1F(str, componentActivity);
        this.A04 = str;
        this.A03 = componentActivity;
        this.A02 = null;
        this.A00 = F1o.A00(componentActivity, str);
    }

    public final void A00() {
        Function1 function1;
        int A00 = F1o.A00(this.A03, this.A04);
        boolean z = !AnonymousClass001.A1Q(this.A00, A00);
        this.A00 = A00;
        if (!z || (function1 = this.A02) == null) {
            return;
        }
        function1.invoke(new Exf(A00));
    }
}
