package X;

import android.net.Uri;
import com.facebook.user.profilepic.PicSquare;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2fc, reason: invalid class name */
/* loaded from: 2fc.class */
public final class C2fc {
    public int A00;
    public Uri A01;
    public Uri A02;
    public PicSquare A03;
    public C2fe A04;
    public C2fd A05;
    public ImmutableList A06;
    public ImmutableList A07;
    public ImmutableList A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B;

    public C2fc() {
        ImmutableList of = ImmutableList.of();
        11T.A0A(of);
        this.A07 = of;
        this.A05 = C2fd.A0T;
        this.A09 = 0S2.A00;
        ImmutableList of2 = ImmutableList.of();
        11T.A0A(of2);
        this.A06 = of2;
    }

    public final C2fq A00() {
        C2fe c2fe = this.A04;
        Uri uri = this.A02;
        Uri uri2 = this.A01;
        PicSquare picSquare = this.A03;
        ImmutableList immutableList = this.A07;
        boolean z = this.A0A;
        ImmutableList immutableList2 = this.A08;
        if (immutableList2 == null) {
            immutableList2 = ImmutableList.of();
            11T.A0A(immutableList2);
        }
        return new C2fq(uri, uri2, picSquare, c2fe, this.A05, immutableList, immutableList2, this.A06, this.A09, this.A00, z, this.A0B);
    }

    public final void A01(C2fd c2fd) {
        11T.A0F(c2fd, 0);
        this.A05 = c2fd;
    }

    public final void A02(String str) {
        ImmutableList of = str == null ? ImmutableList.of() : ImmutableList.of((Object) str);
        11T.A0C(of);
        this.A06 = of;
    }
}
