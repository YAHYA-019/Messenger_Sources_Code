package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.user.profilepic.PicSquare;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3cn, reason: invalid class name */
/* loaded from: 3cn.class */
public final class C3cn implements C2fr {
    public final 1Br A00;
    public final 1De A01;
    public final C2fq A02;
    public final 3xU A03;

    public C3cn(1De r302, C2fq c2fq) {
        this.A01 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 98527);
        this.A02 = c2fq;
        this.A03 = new FsX(1Fw.A06(1Bn.A0E((Context) null, r0, 16428)), this);
    }

    @Override // X.C2fs
    public String Ai0() {
        return this.A02.Ai0();
    }

    @Override // X.C2fs
    public ImmutableList Ai1() {
        return this.A02.A05;
    }

    @Override // X.C2fr
    public Uri Alb(int i, int i2, int i3) {
        return this.A02.Alb(i, i2, i3);
    }

    @Override // X.C2fs
    public int Azi() {
        return this.A02.Azi();
    }

    @Override // X.C2fs
    public PicSquare B2q() {
        return null;
    }

    @Override // X.C2fs
    public 3xU B56() {
        return this.A03;
    }

    @Override // X.C2fs
    public C2fd BFg() {
        return this.A02.A04;
    }

    @Override // X.C2fs
    public Integer BFi() {
        return 0S2.A00;
    }

    @Override // X.C2fs
    public int BFz() {
        return this.A02.A00;
    }

    @Override // X.C2fr
    public ImmutableList BIP(int i, int i2) {
        return this.A02.BIP(i, i2);
    }

    @Override // X.C2fs
    public ImmutableList BIe() {
        return this.A02.A07;
    }

    @Override // X.C2fs
    public boolean BWd() {
        boolean z = false;
        if (this.A02.A01 != null) {
            z = true;
        }
        return z;
    }

    @Override // X.C2fs
    public boolean CzC() {
        return this.A02.A0A;
    }
}
