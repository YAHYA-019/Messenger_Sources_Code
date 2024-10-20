package X;

import java.util.concurrent.Callable;

/* loaded from: G71.class */
public final class G71 implements Callable {
    public final int A00;
    public final String A01;

    public G71(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public Boolean A00() {
        1Bq r0 = 1Bq.A00;
        return Boolean.valueOf(((JOt) 1Bq.A01(180236)).AEF(this.A01));
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        if (this.A00 == 0) {
            return A00();
        }
        try {
            return EYJ.A00(new Qme(this.A01).A00());
        } catch (Exception e) {
            return new KjJ((EnumC08284mf) null, (Object) null, e);
        }
    }
}
