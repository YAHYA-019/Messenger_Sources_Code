package X;

import android.view.View;

/* loaded from: Cey.class */
public final class Cey implements DJl {
    public final View.OnClickListener A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public Cey(View.OnClickListener onClickListener, String str, String str2) {
        this.A03 = str;
        this.A02 = null;
        this.A01 = str2;
        this.A00 = onClickListener;
    }

    public Cey(String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = null;
        this.A00 = null;
    }

    @Override // X.DEa
    public Object A3g(DIw dIw, Object obj) {
        return dIw.D9E(this, obj);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("header: ");
        A0k.append(this.A03);
        String str = this.A02;
        if (str != null) {
            A0k.append(", key: ");
            A0k.append(str);
        }
        return A0k.toString();
    }
}
