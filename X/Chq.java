package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* loaded from: Chq.class */
public final class Chq implements C1ps {
    public final int A00;
    public final int A01;
    public final int A02;
    public final ImmutableList A03;
    public final ImmutableMap A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public Chq(ImmutableList immutableList, ImmutableMap immutableMap, Long l, String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2) {
        this.A06 = str;
        this.A05 = l;
        this.A08 = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = str3;
        this.A04 = immutableMap;
        this.A09 = z;
        this.A03 = immutableList;
        this.A02 = i3;
        this.A0A = z2;
    }

    @Override // X.C1ps
    public long AsR() {
        return this.A06.hashCode();
    }
}
