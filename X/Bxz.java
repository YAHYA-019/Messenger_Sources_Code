package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import java.util.Collection;

/* loaded from: Bxz.class */
public final class Bxz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final ImmutableList A07;
    public final ImmutableListMultimap A08;

    public Bxz(3NI r302) {
        this.A06 = r302.A07;
        this.A02 = r302.A03;
        this.A05 = r302.A06;
        this.A00 = r302.A00;
        this.A04 = r302.A05;
        this.A01 = r302.A01;
        this.A03 = r302.A04;
        this.A08 = ImmutableListMultimap.A02(r302.A08);
        this.A07 = ImmutableList.copyOf((Collection) r302.A09);
    }
}
