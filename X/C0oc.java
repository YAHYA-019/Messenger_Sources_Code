package X;

import android.app.job.JobParameters;
import android.content.Intent;

/* renamed from: X.0oc, reason: invalid class name */
/* loaded from: 0oc.class */
public abstract class C0oc implements AnonymousClass025 {
    public boolean A00;
    public final AnonymousClass074 A01;
    public final C0ob A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.074] */
    public C0oc(C0ob c0ob) {
        11T.A0F(c0ob, 1);
        this.A01 = new Object();
        0eC.A00();
        this.A02 = c0ob;
    }

    public abstract int A00(Intent intent, int i, int i2);

    public void A01() {
        this.A02.A02();
    }

    public abstract void A02();

    public abstract boolean A03(JobParameters jobParameters);

    public abstract boolean A04(JobParameters jobParameters);

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        return this.A01.A00(obj);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0H(obj, obj2);
        this.A01.A01(obj, obj2);
    }
}
