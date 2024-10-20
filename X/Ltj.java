package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.util.concurrent.Callable;

/* loaded from: Ltj.class */
public final class Ltj implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Ltj(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A04 = str;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        switch (this.A00) {
            case 0:
                return Kym.A00((Context) this.A02, (KqD) this.A03, this.A04, this.A01);
            case 1:
                try {
                    return Kym.A00((Context) this.A02, (KqD) this.A03, this.A04, this.A01);
                } catch (Throwable unused) {
                    return new Kze(-3);
                }
            default:
                Reference reference = (Reference) this.A02;
                Context context = (Context) this.A03;
                int i = this.A01;
                String str = this.A04;
                Context context2 = (Context) reference.get();
                if (context2 != null) {
                    context = context2;
                }
                return LDc.A00(context, str, i);
        }
    }
}
