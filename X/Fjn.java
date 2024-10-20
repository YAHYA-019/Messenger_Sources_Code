package X;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.List;

/* loaded from: Fjn.class */
public final class Fjn implements JFd {
    public final /* synthetic */ FAS A00;

    public Fjn(FAS fas) {
        this.A00 = fas;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.google.common.collect.ImmutableSet] */
    @Override // X.JFd
    public final void CNA(D11 d11) {
        FAS fas = this.A00;
        List list = d11.eligibleParticipants;
        RegularImmutableSet A07 = list != null ? ImmutableSet.A07(list) : RegularImmutableSet.A05;
        boolean z = !11T.A0O(A07, fas.A06);
        11T.A0D(A07);
        fas.A06 = A07;
        if (z) {
            FAS.A00(fas);
            if (((FFo) 1Br.A0B(fas.A0D)).A0K) {
                7zP.A0N(fas.A0C).Ciz(new G0I(fas));
            }
        }
    }
}
