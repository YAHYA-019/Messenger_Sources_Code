package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;

/* loaded from: Ivl.class */
public final class Ivl implements Runnable {
    public static final String __redex_internal_original_name = "EffectAvailabilitySharedStateImpl$refreshAvailableInteractiveEffectIdsForCall$1";
    public final /* synthetic */ I2x A00;
    public final /* synthetic */ ImmutableList A01;

    public Ivl(I2x i2x, ImmutableList immutableList) {
        this.A00 = i2x;
        this.A01 = immutableList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I2x i2x = this.A00;
        ImmutableList Aar = GOp.A0t(i2x.A09).Aar();
        boolean z = false;
        0WH r0 = new 0WH(0);
        1Du it = Aar.iterator();
        while (it.hasNext()) {
            I9O A13 = GOn.A13(it);
            if (!I6L.A02(A13)) {
                C3Oh c3Oh = A13.A03;
                if (c3Oh.A00() != 2QW.A04) {
                    C04r c04r = i2x.A04;
                    synchronized (c04r) {
                        c04r.remove(c3Oh.A03);
                    }
                }
            }
            Collection collection = (Collection) i2x.A04.get(A13.A03.A03);
            if (collection == null) {
                1Br.A0C(i2x.A0A);
                z |= I6L.A01(HBQ.A08, A13);
            } else {
                r0.addAll(collection);
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableSet A01 = ((IMH) 1Br.A0B(i2x.A0E)).A01();
        if (z) {
            builder.addAll(A01);
        } else {
            1Du it2 = A01.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (r0.contains(next)) {
                    builder.m11011add(next);
                }
            }
        }
        ImmutableList build = builder.build();
        if (11T.A0O(build, this.A01)) {
            return;
        }
        i2x.A01 = build;
        4YV.A11(i2x.A0H).execute(new IpK(i2x));
    }
}
