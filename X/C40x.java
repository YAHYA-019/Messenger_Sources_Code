package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.40x, reason: invalid class name */
/* loaded from: 40x.class */
public final class C40x extends InputStream {
    public Throwable A00;
    public int A01;
    public int A02;
    public long A03;
    public final C21u A04;
    public final ArrayList A05;
    public final Condition A06;
    public final ReentrantLock A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public C40x(C21u c21u, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A07 = reentrantLock;
        this.A06 = reentrantLock.newCondition();
        this.A05 = new ArrayList();
        this.A09 = false;
        this.A00 = null;
        this.A0A = false;
        this.A08 = false;
        this.A04 = c21u;
        this.A02 = i;
        if (android.util.Log.isLoggable("TigonBodyBuffer", 2)) {
            android.util.Log.v("TigonBodyBuffer", 0Pz.A0j("TigonBodyBuffer::TigonBodyBuffer(", String.valueOf(this.A02), ")"));
        }
    }

    private void A00() {
        ArrayList arrayList = this.A05;
        02W.A05(!arrayList.isEmpty());
        if (((Buffer) arrayList.get(0)).hasRemaining()) {
            return;
        }
        this.A04.releaseBodyBuffer((ByteBuffer) arrayList.remove(0));
    }

    private void A01() {
        while (!this.A09 && this.A05.isEmpty()) {
            if (android.util.Log.isLoggable("TigonBodyBuffer", 2)) {
                android.util.Log.v("TigonBodyBuffer", 0Pz.A0j("TigonBodyBuffer::waitForDataLocked(", String.valueOf(this.A02), ")"));
            }
            this.A0A = true;
            try {
                this.A06.awaitUninterruptibly();
            } finally {
                this.A0A = false;
            }
        }
    }

    private void A02(Throwable th) {
        if (android.util.Log.isLoggable("TigonBodyBuffer", 2)) {
            android.util.Log.v("TigonBodyBuffer", 0Pz.A0j("TigonBodyBuffer::closeOutput(", String.valueOf(this.A02), ")"));
        }
        this.A09 = true;
        Throwable th2 = this.A00;
        if (th2 != null) {
            th = th2;
        }
        this.A00 = th;
        this.A06.signalAll();
    }

    public void A03() {
        try {
            ReentrantLock reentrantLock = this.A07;
            reentrantLock.lock();
            A02(null);
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.A07.unlock();
            throw th;
        }
    }

    public void A04(Throwable th) {
        try {
            ReentrantLock reentrantLock = this.A07;
            reentrantLock.lock();
            A02(th);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            this.A07.unlock();
            throw th2;
        }
    }

    public void A05(ByteBuffer byteBuffer) {
        try {
            ReentrantLock reentrantLock = this.A07;
            reentrantLock.lock();
            if (this.A09) {
                throw AnonymousClass001.A0N("Writing to closed buffer");
            }
            if (this.A08) {
                this.A04.releaseBodyBuffer(byteBuffer);
            } else {
                boolean z = false;
                if (byteBuffer.remaining() == byteBuffer.capacity()) {
                    z = true;
                }
                02W.A04(z);
                if (byteBuffer.hasRemaining()) {
                    this.A05.add(byteBuffer);
                    this.A03 += byteBuffer.remaining();
                    this.A01 = Math.max(this.A01, available());
                    this.A06.signalAll();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.A07.unlock();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            ReentrantLock reentrantLock = this.A07;
            reentrantLock.lock();
            int i = 0;
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                i += ((ByteBuffer) it.next()).remaining();
            }
            reentrantLock.unlock();
            return i;
        } catch (Throwable th) {
            this.A07.unlock();
            throw th;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ReentrantLock reentrantLock = this.A07;
            reentrantLock.lock();
            ArrayList arrayList = this.A05;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.A04.releaseBodyBuffer((ByteBuffer) it.next());
            }
            arrayList.clear();
            Throwable th = this.A00;
            if (th != null) {
                throw new IOException(th);
            }
            this.A08 = true;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            this.A08 = true;
            this.A07.unlock();
            throw th2;
        }
    }

    public void finalize() {
        int A03 = 0FI.A03(1912152921);
        A03();
        ArrayList arrayList = this.A05;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.A04.releaseBodyBuffer((ByteBuffer) it.next());
        }
        arrayList.clear();
        0FI.A09(-843910672, A03);
    }

    @Override // java.io.InputStream
    public int read() {
        byte b;
        try {
            ReentrantLock reentrantLock = this.A07;
            reentrantLock.lock();
            A01();
            if (this.A09 && this.A05.isEmpty()) {
                Throwable th = this.A00;
                if (th != null) {
                    throw new IOException(th);
                }
                b = -1;
            } else {
                ArrayList arrayList = this.A05;
                02W.A05(!arrayList.isEmpty());
                ByteBuffer byteBuffer = (ByteBuffer) arrayList.get(0);
                02W.A05(byteBuffer.hasRemaining());
                b = byteBuffer.get();
                A00();
            }
            reentrantLock.unlock();
            return b;
        } catch (Throwable th2) {
            this.A07.unlock();
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        try {
            ReentrantLock reentrantLock = this.A07;
            reentrantLock.lock();
            A01();
            if (this.A09 && this.A05.isEmpty()) {
                Throwable th = this.A00;
                if (th != null) {
                    throw new IOException(th);
                }
                i3 = -1;
            } else {
                i3 = 0;
                if (i2 > 0) {
                    int i4 = i2;
                    do {
                        ArrayList arrayList = this.A05;
                        if (!arrayList.isEmpty()) {
                            ByteBuffer byteBuffer = (ByteBuffer) arrayList.get(0);
                            if (byteBuffer == null) {
                                break;
                            }
                            int min = Math.min(byteBuffer.remaining(), i4);
                            byteBuffer.get(bArr, i, min);
                            i4 -= min;
                            i += min;
                            A00();
                        } else {
                            break;
                        }
                    } while (i4 > 0);
                    i3 = i2 - i4;
                }
            }
            reentrantLock.unlock();
            return i3;
        } catch (Throwable th2) {
            this.A07.unlock();
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            ReentrantLock reentrantLock = this.A07;
            reentrantLock.lock();
            if (j <= 0) {
                reentrantLock.unlock();
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                ArrayList arrayList = this.A05;
                if (!arrayList.isEmpty()) {
                    ByteBuffer byteBuffer = (ByteBuffer) arrayList.get(0);
                    if (byteBuffer == null) {
                        break;
                    }
                    int min = (int) Math.min(byteBuffer.remaining(), j2);
                    byteBuffer.position(byteBuffer.position() + min);
                    j2 -= min;
                    A00();
                } else {
                    break;
                }
            }
            if (j == j2) {
                Throwable th = this.A00;
                if (th != null) {
                    throw new IOException(th);
                }
            }
            long j3 = j - j2;
            reentrantLock.unlock();
            return j3;
        } catch (Throwable th2) {
            this.A07.unlock();
            throw th2;
        }
    }
}
