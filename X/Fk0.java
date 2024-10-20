package X;

import android.view.View;

/* loaded from: Fk0.class */
public final class Fk0 implements C5ww {
    public final /* synthetic */ Edv A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public Fk0(Edv edv, String str, boolean z) {
        this.A01 = str;
        this.A00 = edv;
        this.A02 = z;
    }

    @Override // X.C5ww
    public final void onClick(View view) {
        String str = this.A01;
        String str2 = "STORY";
        if (!11T.A0O(str, str2)) {
            str2 = "POST";
            if (!11T.A0O(str, str2)) {
                return;
            }
        }
        E1T.A0A(this.A00.A00, null, str2, !this.A02);
    }
}
