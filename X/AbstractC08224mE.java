package X;

import java.io.OutputStream;
import java.io.Writer;

/* renamed from: X.4mE, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mE.class */
public abstract class AbstractC08224mE {
    public int A00;
    public final 4CR A01;
    public final 4mH A02;
    public final Writer A03;
    public final /* synthetic */ 1lP A04;

    public AbstractC08224mE(4CR r302, 1lP r303, OutputStream outputStream) {
        this.A04 = r303;
        this.A01 = r302;
        final 4mF r0 = new 4mF(outputStream, r303.A07);
        final char[] cArr = r303.A0A;
        Writer writer = new Writer(r0, cArr) { // from class: X.4mG
            public int A00;
            public Writer A01;
            public char[] A02;

            {
                super(r0);
                this.A01 = r0;
                this.A02 = cArr;
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                Writer writer2 = this.A01;
                if (writer2 != null) {
                    try {
                        int i = this.A00;
                        if (i > 0) {
                            writer2.write(this.A02, 0, i);
                        }
                        this.A00 = 0;
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    this.A02 = null;
                    try {
                        writer2.close();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    this.A01 = null;
                    if (th != null) {
                        throw th;
                    }
                }
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() {
                Writer writer2 = this.A01;
                if (writer2 == null) {
                    throw AnonymousClass001.A0G("BufferedWriter is closed");
                }
                int i = this.A00;
                if (i > 0) {
                    writer2.write(this.A02, 0, i);
                }
                this.A00 = 0;
                writer2.flush();
            }

            @Override // java.io.Writer
            public void write(int i) {
                Writer writer2 = this.A01;
                if (writer2 == null) {
                    throw AnonymousClass001.A0G("BufferedWriter is closed");
                }
                char[] cArr2 = this.A02;
                int i2 = this.A00;
                int length = cArr2.length;
                if (i2 >= length) {
                    writer2.write(cArr2, 0, length);
                    this.A00 = 0;
                    i2 = 0;
                }
                this.A00 = i2 + 1;
                cArr2[i2] = (char) i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
            
                if (r311 > 0) goto L19;
             */
            @Override // java.io.Writer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void write(java.lang.String r302, int r303, int r304) {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C08234mG.write(java.lang.String, int, int):void");
            }

            @Override // java.io.Writer
            public void write(char[] cArr2, int i, int i2) {
                Writer writer2 = this.A01;
                if (writer2 == null) {
                    throw AnonymousClass001.A0G("BufferedWriter is closed");
                }
                if (cArr2 == null) {
                    throw AnonymousClass001.A0Q("buffer == null");
                }
                4CU.A01(cArr2.length, i, i2);
                char[] cArr3 = this.A02;
                int i3 = this.A00;
                if (i3 != 0 || i2 < cArr3.length) {
                    int length = cArr3.length - i3;
                    if (i2 < length) {
                        length = i2;
                    }
                    if (length > 0) {
                        System.arraycopy(cArr2, i, cArr3, i3, length);
                        i3 = this.A00 + length;
                        this.A00 = i3;
                    }
                    char[] cArr4 = this.A02;
                    int length2 = cArr4.length;
                    if (i3 != length2) {
                        return;
                    }
                    writer2.write(cArr4, 0, length2);
                    this.A00 = 0;
                    if (i2 <= length) {
                        return;
                    }
                    i += length;
                    i2 -= length;
                    char[] cArr5 = this.A02;
                    if (i2 < cArr5.length) {
                        System.arraycopy(cArr2, i, cArr5, 0, i2);
                        this.A00 += i2;
                        return;
                    }
                }
                writer2.write(cArr2, i, i2);
            }
        };
        this.A03 = writer;
        this.A02 = new 4mH(writer);
    }
}
