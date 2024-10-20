package X;

import android.net.Uri;
import com.facebook.user.profilepic.PicSquare;
import com.google.common.collect.ImmutableList;

/* renamed from: X.48i, reason: invalid class name */
/* loaded from: 48i.class */
public final class C48i implements C2fr {
    public final Uri A00;
    public final C2fr A01;

    public C48i(Uri uri, C2fr c2fr) {
        this.A00 = uri;
        this.A01 = c2fr;
    }

    @Override // X.C2fs
    public String Ai0() {
        return this.A01.Ai0();
    }

    @Override // X.C2fs
    public ImmutableList Ai1() {
        ImmutableList Ai1 = this.A01.Ai1();
        11T.A0A(Ai1);
        return Ai1;
    }

    @Override // X.C2fr
    public Uri Alb(int i, int i2, int i3) {
        return this.A01.Alb(i, i2, i3);
    }

    @Override // X.C2fs
    public int Azi() {
        return this.A01.Azi();
    }

    @Override // X.C2fs
    public PicSquare B2q() {
        return null;
    }

    @Override // X.C2fs
    public 3xU B56() {
        return null;
    }

    @Override // X.C2fs
    public C2fd BFg() {
        C2fd BFg = this.A01.BFg();
        11T.A0A(BFg);
        return BFg;
    }

    @Override // X.C2fs
    public Integer BFi() {
        Integer BFi = this.A01.BFi();
        11T.A0A(BFi);
        return BFi;
    }

    @Override // X.C2fs
    public int BFz() {
        return this.A01.BFz();
    }

    @Override // X.C2fr
    public ImmutableList BIP(int i, int i2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11011add((Object) this.A00);
        builder.addAll(this.A01.BIP(i, i2));
        ImmutableList build = builder.build();
        11T.A0A(build);
        return build;
    }

    @Override // X.C2fs
    public ImmutableList BIe() {
        ImmutableList of = ImmutableList.of();
        11T.A0A(of);
        return of;
    }

    @Override // X.C2fs
    public boolean BWd() {
        return false;
    }

    @Override // X.C2fs
    public boolean CzC() {
        return this.A01.CzC();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof C48i)) {
                return false;
            }
            C48i c48i = (C48i) obj;
            if (11T.A0O(this.A01, c48i.A01) && 11T.A0O(this.A00, c48i.A00)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 0J6.A00(this.A01, this.A00);
    }
}
