package X;

import android.os.Bundle;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.fb.messenger.executors.text_suggestion.TextSuggestionExecutorFactory;

/* renamed from: X.5gu, reason: invalid class name */
/* loaded from: 5gu.class */
public final class C5gu implements C5gr {
    public final 1CO A00 = (1CO) 1Bi.A03(16387);

    @Override // X.C5gr
    public Bundle Akz() {
        return null;
    }

    @Override // X.C5gr
    public Class Al0() {
        return TextSuggestionExecutorFactory.class;
    }

    @Override // X.C5gr
    public PapayaRestrictions Al2() {
        1CO r0 = this.A00;
        boolean AZk = r0.AZk(2378183014531271423L);
        boolean AZk2 = r0.AZk(2378183014531402497L);
        boolean AZk3 = r0.AZk(2378183014531336960L);
        C5h4 c5h4 = new C5h4();
        long j = 1;
        c5h4.A01(C5h5.A02, 4YV.A03(AZk ? 1 : 0));
        c5h4.A01(C5h5.A03, 4YV.A03(AZk2 ? 1 : 0));
        C5h5 c5h5 = C5h5.A0A;
        if (!AZk3) {
            j = 0;
        }
        c5h4.A01(c5h5, j);
        return c5h4.A00();
    }

    @Override // X.C5gr
    public boolean BSI() {
        return this.A00.AZk(72340005317511934L);
    }

    @Override // X.C5gr
    public String getName() {
        return 2yD.A02(this.A00, 72902955271192733L);
    }
}
