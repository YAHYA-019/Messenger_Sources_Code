package X;

import android.content.Context;

/* renamed from: X.7zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 7zk.class */
public final class C12187zk implements InterfaceC12197zl {
    public final Context A00;
    public final 1De A01;

    public C12187zk(1De r302) {
        this.A01 = r302;
        this.A00 = (Context) 1Bn.A0E((Context) null, r302.A00, 83719);
    }

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        11T.A0F(c12167zi, 0);
        String str = c12167zi.A02;
        String string = str == null ? this.A00.getString(2131968202) : this.A00.getString(2131968198, str);
        11T.A0D(string);
        return string;
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return false;
    }
}
