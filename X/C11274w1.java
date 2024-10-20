package X;

import java.io.OutputStream;

/* renamed from: X.4w1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4w1.class */
public final class C11274w1 extends AbstractC11284w2 {
    public final String A00;
    public final /* synthetic */ 2Jr A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11274w1(2Jr r302, OutputStream outputStream, String str) {
        super(outputStream);
        this.A01 = r302;
        this.A00 = str;
    }

    @Override // X.AbstractC11284w2, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.A00.close();
        String str = this.A00;
        if (str != null) {
            this.A01.A01.add(str);
        }
    }
}
