package X;

import android.content.Context;

/* renamed from: X.4fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fj.class */
public final class C06004fj {
    public final C15h A00;
    public final C15h A01;
    public final C15h A02;
    public final C15h A03;
    public final C15h A04;
    public final C15h A05;
    public final C15h A06;
    public final C15h A07;
    public final C15h A08;
    public final C15h A09;
    public final C15h A0A;
    public final C15h A0B;
    public final C15h A0C;
    public final C15h A0D;
    public final C15h A0E;
    public final C15h A0F;
    public final C15h A0G;
    public final Context A0H;
    public final C15h A0I;

    public C06004fj(Context context, C15h c15h, C15h c15h2, C15h c15h3, C15h c15h4, C15h c15h5, C15h c15h6, C15h c15h7, C15h c15h8, C15h c15h9, C15h c15h10, C15h c15h11, C15h c15h12, C15h c15h13, C15h c15h14, C15h c15h15, C15h c15h16, C15h c15h17, C15h c15h18) {
        this.A0H = context;
        this.A01 = c15h;
        this.A09 = c15h2;
        this.A06 = c15h3;
        this.A0E = c15h4;
        this.A04 = c15h5;
        this.A0A = c15h6;
        this.A0D = c15h7;
        this.A0B = c15h8;
        this.A05 = c15h9;
        this.A07 = c15h10;
        this.A00 = c15h11;
        this.A08 = c15h12;
        this.A0C = c15h13;
        this.A0G = c15h14;
        this.A0F = c15h15;
        this.A03 = c15h16;
        this.A02 = c15h17;
        this.A0I = c15h18;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            z = false;
            if (obj instanceof C06004fj) {
                C06004fj c06004fj = (C06004fj) obj;
                if (c06004fj.A0H == this.A0H && this.A01.equals(c06004fj.A01) && this.A09.equals(c06004fj.A09)) {
                    this.A06.equals(c06004fj.A06);
                }
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A0I, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A03, AnonymousClass002.A05(this.A0F, AnonymousClass002.A05(this.A0G, AnonymousClass002.A05(this.A0C, AnonymousClass002.A05(this.A08, AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A07, AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A0B, AnonymousClass002.A05(this.A0D, AnonymousClass002.A05(this.A0A, AnonymousClass002.A05(this.A04, AnonymousClass002.A05(this.A0E, AnonymousClass002.A05(this.A06, AnonymousClass002.A05(this.A09, AnonymousClass002.A05(this.A01, (217 + this.A0H.hashCode()) * 31))) * 31 * 31))))))))))) * 31) * 31))) * 31;
    }
}
