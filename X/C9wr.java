package X;

import android.text.Editable;
import android.view.View;
import com.facebook.user.model.User;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9wr, reason: invalid class name */
/* loaded from: 9wr.class */
public final class C9wr implements AZT {
    public C00m A00;
    public final C00m A01;
    public final C00m A02;
    public final C00m A03;
    public final Function1 A04;

    public C9wr(6wV r302) {
        AKO ako = new AKO(r302, 4);
        AKO ako2 = new AKO(r302, 5);
        AKO ako3 = new AKO(r302, 6);
        AnonymousClass843 A00 = AnonymousClass843.A00(r302, 17);
        this.A01 = ako;
        this.A03 = ako2;
        this.A02 = ako3;
        this.A04 = A00;
        this.A00 = ANC.A00;
    }

    @Override // X.AZT
    public void BLZ(View view, User user, String str, boolean z) {
        11T.A0F(str, 0);
        if (z) {
            Editable editable = (Editable) this.A01.invoke();
            int A03 = 7zU.A03(this.A03);
            int A032 = 7zU.A03(this.A02);
            if (A03 <= A032) {
                editable.replace(A03, A032, str);
                this.A04.invoke(editable);
            }
        } else {
            this.A04.invoke(str);
        }
        this.A00.invoke();
    }

    @Override // X.AZT
    public void Crt(C00m c00m) {
        this.A00 = c00m;
    }
}
