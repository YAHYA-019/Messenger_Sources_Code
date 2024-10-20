package X;

import android.content.Context;

/* renamed from: X.7zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 7zq.class */
public abstract class AbstractC12247zq implements InterfaceC12197zl {
    public final Context A00;

    public AbstractC12247zq(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        String A0v;
        6Ay BCm;
        String A0r;
        if (this instanceof 80J) {
            return (c12167zi == null || (BCm = c12167zi.A01.BCm()) == null || (A0r = BCm.A0r(-2061635299)) == null) ? "" : A0r;
        }
        11T.A0F(c12167zi, 0);
        String str = c12167zi.A02;
        Context context = this.A00;
        boolean z = this instanceof 80K;
        if (str == null) {
            A0v = context.getString(z ? 2131968222 : ((this instanceof C12277zt) || (this instanceof C12257zr)) ? 2131968225 : this instanceof C12267zs ? 2131968224 : this instanceof 80A ? 2131968229 : this instanceof AnonymousClass808 ? 2131968228 : this instanceof 80I ? 2131968231 : this instanceof AnonymousClass805 ? 2131968227 : this instanceof 80H ? 2131968226 : this instanceof AnonymousClass804 ? 2131965721 : this instanceof C12237zp ? 2131968218 : this instanceof AnonymousClass803 ? 2131958257 : this instanceof 80F ? 2131957669 : this instanceof AnonymousClass801 ? 2131954402 : 2131968223);
        } else {
            A0v = 1BK.A0v(context, str, z ? 2131962805 : ((this instanceof C12277zt) || (this instanceof C12257zr)) ? 2131962808 : this instanceof C12267zs ? 2131962807 : this instanceof 80A ? 2131962812 : this instanceof AnonymousClass808 ? 2131962811 : this instanceof 80I ? 2131962815 : this instanceof AnonymousClass805 ? 2131962810 : this instanceof 80H ? 2131962809 : this instanceof AnonymousClass804 ? 2131964204 : this instanceof C12237zp ? 2131962801 : this instanceof AnonymousClass803 ? 2131958256 : this instanceof 80F ? 2131957668 : this instanceof AnonymousClass801 ? 2131954401 : 2131962806);
        }
        11T.A0D(A0v);
        return A0v;
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return false;
    }
}
