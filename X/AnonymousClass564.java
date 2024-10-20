package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.564, reason: invalid class name */
/* loaded from: 564.class */
public final class AnonymousClass564 implements 55Q {
    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        AnonymousClass565 anonymousClass565 = (AnonymousClass565) anonymousClass544;
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList immutableList = anonymousClass565.A04;
        if (immutableList != null) {
            builder.m11011add((Object) 9DZ.A00(r302, (ThreadKey) null, anonymousClass565.A01, immutableList));
        }
        ImmutableList immutableList2 = anonymousClass565.A03;
        if (!immutableList2.isEmpty()) {
            builder.m11011add((Object) 9DY.A00(r302, anonymousClass565.A01, immutableList2));
        }
        8QS r0 = new 8QS(r302, new C8ml());
        MigColorScheme migColorScheme = anonymousClass565.A01;
        C8ml c8ml = r0.A01;
        c8ml.A04 = migColorScheme;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        c8ml.A03 = anonymousClass565.A00;
        bitSet.set(3);
        c8ml.A05 = anonymousClass565.A02;
        bitSet.set(2);
        c8ml.A00 = null;
        c8ml.A01 = null;
        c8ml.A08 = false;
        bitSet.set(1);
        c8ml.A06 = builder.build();
        C1rs.A02(bitSet, r0.A03);
        r0.A0J();
        return c8ml;
    }

    public Class BDi() {
        return AnonymousClass565.class;
    }
}
