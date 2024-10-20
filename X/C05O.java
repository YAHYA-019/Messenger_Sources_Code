package X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.05O, reason: invalid class name */
/* loaded from: 05O.class */
public abstract class C05O implements AnonymousClass025 {
    public boolean A00;
    public final 05P A01;
    public final AnonymousClass074 A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.074] */
    public C05O(05P r302) {
        11T.A0F(r302, 1);
        this.A02 = new Object();
        0eC.A00();
        this.A01 = r302;
    }

    public static String A02(C05O c05o) {
        Context applicationContext = c05o.A01.getApplicationContext();
        11T.A0A(applicationContext);
        return applicationContext.getPackageName();
    }

    public abstract int A0C(Intent intent, int i, int i2);

    public void A0D() {
        this.A01.A03();
    }

    public final void A0E() {
        synchronized (this) {
            if (!this.A00) {
                this.A00 = true;
                this.A01.A02();
            }
        }
    }

    public void A0F(Intent intent, int i) {
        this.A01.A06(intent, i);
    }

    public void A0G(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        11T.A0H(fileDescriptor, printWriter);
        this.A01.A07(fileDescriptor, printWriter, strArr);
    }

    public abstract IBinder A0H(Intent intent);

    public void A0I() {
        A0E();
    }

    public void A0J(Intent intent) {
        this.A01.A05(intent);
    }

    public boolean A0K(Intent intent) {
        return this.A01.A08(intent);
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        return this.A02.A00(obj);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0H(obj, obj2);
        this.A02.A01(obj, obj2);
    }
}
