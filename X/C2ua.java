package X;

import android.app.Activity;
import java.util.List;
import java.util.Set;

/* renamed from: X.2ua, reason: invalid class name */
/* loaded from: 2ua.class */
public final class C2ua implements 2uP {
    public final 2uP A00;
    public final 2uP A01;
    public final 2uP A02;

    public C2ua(2uP r302, 2uP r303, 2uP r304) {
        this.A00 = r302;
        this.A01 = r303;
        this.A02 = r304;
    }

    public final /* bridge */ /* synthetic */ Object DCA() {
        final 2uS r0 = this.A00;
        final 2uS r02 = this.A01;
        final 2uS r03 = this.A02;
        return new 2uI(r0, r02, r03) { // from class: X.2uc
            public final 2uS A00;
            public final 2uS A01;
            public final 2uS A02;

            {
                this.A00 = r0;
                this.A01 = r02;
                this.A02 = r03;
            }

            private final 2uI A00() {
                return (2uI) (this.A02.DCA() != null ? this.A01 : this.A00).DCA();
            }

            public final C4Ez AEB(int i) {
                return A00().AEB(i);
            }

            public final C4Ez AMW(List list) {
                return A00().AMW(list);
            }

            public final C4Ez AMX(List list) {
                return A00().AMX(list);
            }

            public final Set ArQ() {
                return A00().ArQ();
            }

            public final C4Ez BAF() {
                return A00().BAF();
            }

            public final void CcP(C2ue c2ue) {
                A00().CcP(c2ue);
            }

            public final boolean D1V(Activity activity, 3NT r303, int i) {
                return A00().D1V(activity, r303, 100);
            }

            public final C4Ez D1m(KpZ kpZ) {
                return A00().D1m(kpZ);
            }
        };
    }
}
