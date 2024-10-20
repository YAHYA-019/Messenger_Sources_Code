package X;

import android.net.Uri;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.user.profilepic.PicSquare;
import com.google.common.collect.ImmutableList;

/* loaded from: D1i.class */
public final class D1i implements C2fr {
    public final C2fe A00;
    public final ImmutableList A01;
    public final Uri A02;

    public D1i(Uri uri, C2fe c2fe, ImmutableList immutableList) {
        this.A00 = c2fe;
        this.A01 = immutableList;
        this.A02 = uri;
    }

    @Override // X.C2fs
    public String Ai0() {
        return null;
    }

    @Override // X.C2fs
    public ImmutableList Ai1() {
        throw new UnsupportedOperationException();
    }

    @Override // X.C2fr
    public Uri Alb(int i, int i2, int i3) {
        Uri uri = null;
        if (i >= 0) {
            ImmutableList immutableList = this.A01;
            if (i < immutableList.size() && this.A00 != null) {
                UserKey userKey = (UserKey) immutableList.get(i);
                if (userKey == null || !User.A01(userKey.type)) {
                    return null;
                }
                uri = C2fe.A01();
            }
        }
        return uri;
    }

    @Override // X.C2fs
    public int Azi() {
        if (this.A02 != null) {
            return 1;
        }
        return this.A01.size();
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
        return C2fd.A0T;
    }

    @Override // X.C2fs
    public Integer BFi() {
        return 0S2.A00;
    }

    @Override // X.C2fs
    public int BFz() {
        return 0;
    }

    @Override // X.C2fr
    public ImmutableList BIP(int i, int i2) {
        ImmutableList A0r;
        Uri uri = this.A02;
        if (uri != null) {
            A0r = ImmutableList.of((Object) uri);
        } else {
            A0r = AbJ.A0r(new D2n(this, i, i2), this.A01);
        }
        11T.A0D(A0r);
        return A0r;
    }

    @Override // X.C2fs
    public ImmutableList BIe() {
        return this.A01;
    }

    @Override // X.C2fs
    public boolean BWd() {
        return AnonymousClass001.A1T(this.A02);
    }

    @Override // X.C2fs
    public boolean CzC() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            D1i d1i = (D1i) obj;
            if (!11T.A0O(this.A00, d1i.A00) || !11T.A0O(this.A01, d1i.A01) || !11T.A0O(this.A02, d1i.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(this.A00, this.A01, this.A02);
    }
}
