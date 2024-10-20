package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: H8q.class */
public final class H8q extends FilterInputStream {
    public final OutputStream A00;

    public H8q(InputStream inputStream, OutputStream outputStream) {
        super(inputStream);
        this.A00 = outputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0005: THROW (r0 I:java.lang.Throwable), block:B:7:0x0005 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, int] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int available() {
        /*
            r301 = this;
            r0 = r301
            int r0 = super.available()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8q.available():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0019: THROW (r0 I:java.lang.Throwable) A[SYNTHETIC], block:B:19:? */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, java.io.InputStream] */
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            r301 = this;
            r0 = r301
            java.io.InputStream r0 = r0.in     // Catch: java.lang.Throwable -> L19
            r302 = r0
            java.lang.ThreadLocal r0 = X.KcR.A00     // Catch: java.lang.Throwable -> L19
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L18
            r0 = r302
            r0.close()     // Catch: java.io.IOException -> L14 java.lang.Throwable -> L19
            goto L17
        L14:
            r303 = move-exception
            r0 = r303
            throw r0     // Catch: java.lang.Throwable -> L19
        L17:
            return
        L18:
            return
        L19:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8q.close():void");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            ((FilterInputStream) this).in.mark(i);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x001d: THROW (r0 I:java.lang.Throwable), block:B:12:0x001d */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, int] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read() {
        /*
            r301 = this;
            r0 = r301
            java.io.InputStream r0 = r0.in     // Catch: java.io.IOException -> L1d
            r302 = r0
            r0 = r302
            int r0 = r0.read()     // Catch: java.io.IOException -> L1d
            r303 = r0
            r0 = -1
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L1b
            r0 = r301
            java.io.OutputStream r0 = r0.A00
            r302 = r0
            r0 = r302
            r1 = r303
            r0.write(r1)
        L1b:
            r0 = r303
            return r0
        L1d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8q.read():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x002d: THROW (r0 I:java.lang.Throwable), block:B:14:0x002d */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, int] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r302) {
        /*
            r301 = this;
            java.lang.ThreadLocal r0 = X.KcR.A00     // Catch: java.io.IOException -> L2d
            r303 = r0
            r0 = r301
            java.io.InputStream r0 = r0.in     // Catch: java.io.IOException -> L2d
            r303 = r0
            r0 = r303
            r1 = r302
            int r0 = r0.read(r1)     // Catch: java.io.IOException -> L2d
            r304 = r0
            r0 = -1
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L2b
            r0 = r301
            java.io.OutputStream r0 = r0.A00
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r306
            r1 = r302
            r2 = 0
            r3 = r304
            r0.write(r1, r2, r3)
        L2b:
            r0 = r304
            return r0
        L2d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8q.read(byte[]):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x002c: THROW (r0 I:java.lang.Throwable), block:B:13:0x002c */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, int] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r302, int r303, int r304) {
        /*
            r301 = this;
            r0 = r301
            java.io.InputStream r0 = r0.in     // Catch: java.io.IOException -> L2c
            r305 = r0
            r0 = r305
            r1 = r302
            r2 = r303
            r3 = r304
            int r0 = r0.read(r1, r2, r3)     // Catch: java.io.IOException -> L2c
            r306 = r0
            r0 = -1
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L29
            r0 = r301
            java.io.OutputStream r0 = r0.A00
            r305 = r0
            r0 = r305
            r1 = r302
            r2 = r303
            r3 = r306
            r0.write(r1, r2, r3)
        L29:
            r0 = r306
            return r0
        L2c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8q.read(byte[], int, int):int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        synchronized (this) {
            try {
                ((FilterInputStream) this).in.reset();
            } catch (IOException e) {
                throw e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x000b: THROW (r0 I:java.lang.Throwable), block:B:9:0x000b */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, long] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long skip(long r302) {
        /*
            r301 = this;
            r0 = r301
            java.io.InputStream r0 = r0.in     // Catch: java.io.IOException -> Lb
            r304 = r0
            r0 = r304
            r1 = r302
            long r0 = r0.skip(r1)     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8q.skip(long):long");
    }
}
