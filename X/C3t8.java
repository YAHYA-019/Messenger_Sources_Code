package X;

import com.facebook.endtoend.EndToEnd;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SingletonImmutableSet;

/* renamed from: X.3t8, reason: invalid class name */
/* loaded from: 3t8.class */
public final class C3t8 implements C3sz {
    public static final double A03 = Double.parseDouble(AbstractC01653se.A01().toString());
    public static final ImmutableSet A04 = new SingletonImmutableSet("nt_context");
    public final C01873t9 A02 = (C01873t9) 1Bi.A03(66305);
    public final C00i A01 = new 1BQ(32818);
    public final C00i A00 = FbInjector.A00;

    public 2Jd A00() {
        2Jd A00 = C3tA.A00();
        A00.A09("styles_id", "7ad8ec94377d7d1c913d0eeccdae8db7");
        A00.A07("pixel_ratio", Double.valueOf(A03));
        A00.A09("bloks_version", "40b0f96392018752e34eddda70b9dbbedc74a35ad481678c9bd0b140a59ae407");
        this.A01.get();
        if (EndToEnd.isRunningEndToEndTest()) {
            A00.A06("is_e2e_test", true);
        }
        A00.A06("using_white_navbar", true);
        this.A00.get();
        1G2 r0 = AbstractC01913tH.A00;
        A00.A06("is_push_on", Boolean.valueOf(((FbSharedPreferences) 1Bi.A03(33013)).AZn(AbstractC01913tH.A00, true)));
        return A00;
    }

    @Override // X.C3sz
    public ImmutableSet B1E() {
        return A04;
    }

    @Override // X.C3sz
    public Object B1F(2Jg r302, String str) {
        return A00();
    }
}
