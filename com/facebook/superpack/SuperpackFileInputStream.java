package com.facebook.superpack;

import X.0Ug;
import X.0fH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: SuperpackFileInputStream.class */
public class SuperpackFileInputStream extends InputStream {
    public int A00;
    public int A01;
    public int A02;
    public Boolean A03;
    public byte[] A04;
    public final SuperpackFile A05;

    public SuperpackFileInputStream(SuperpackFile superpackFile) {
        int i;
        superpackFile.getClass();
        this.A05 = superpackFile;
        this.A02 = 0;
        synchronized (superpackFile) {
            if (superpackFile.mPtr == 0) {
                throw new IllegalStateException();
            }
            i = superpackFile.mLength;
        }
        this.A00 = i;
        this.A01 = 0;
        this.A04 = null;
        this.A03 = false;
    }

    public SuperpackFileInputStream(SuperpackFile superpackFile, Boolean bool) {
        this(superpackFile);
        this.A03 = bool;
    }

    public static SuperpackFileInputStream createFromSingletonArchiveFile(File file, String str) {
        return createFromSingletonArchiveFile(file, str, AnonymousClass002.A06(str));
    }

    public static SuperpackFileInputStream createFromSingletonArchiveFile(File file, String str, int i) {
        SuperpackArchive A0A;
        Throwable th;
        file.getClass();
        String str2 = SuperpackArchive.TAG;
        try {
            try {
                new SuperpackArchive(SuperpackArchive.readNative(file.getPath(), str, !str.matches("spo") ? 0L : SuperpackArchive.getThreadNumOption(i)), null);
            } catch (RuntimeException e) {
                0fH.A0r("SuperpackArchive", "Failed to read superpack file, retrying.", e);
                FileInputStream A0F = AnonymousClass001.A0F(file);
                try {
                    A0A = AnonymousClass002.A0A(A0F, str);
                } finally {
                    A0F.close();
                }
            }
            try {
                if (A0A.hasNext()) {
                    SuperpackFile next = A0A.next();
                    if (!A0A.hasNext()) {
                        SuperpackFileInputStream superpackFileInputStream = new SuperpackFileInputStream(next, AnonymousClass001.A0K());
                        A0A.close();
                        return superpackFileInputStream;
                    }
                    new IllegalArgumentException();
                } else {
                    new IllegalArgumentException();
                }
                throw th;
            } catch (Throwable th2) {
                A0A.close();
                throw th2;
            }
        } catch (Throwable th3) {
            0Ug.A00("SuperpackArchive", th3);
            throw "SuperpackArchive";
        }
    }

    public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream inputStream, String str) {
        return createFromSingletonArchiveInputStream(inputStream, str, AnonymousClass002.A06(str));
    }

    public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream inputStream, String str, int i) {
        Throwable th;
        inputStream.getClass();
        String str2 = SuperpackArchive.TAG;
        SuperpackArchive superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, str, !str.matches("spo") ? 0L : SuperpackArchive.getThreadNumOption(i)), null);
        try {
            if (superpackArchive.hasNext()) {
                SuperpackFile next = superpackArchive.next();
                if (!superpackArchive.hasNext()) {
                    SuperpackFileInputStream superpackFileInputStream = new SuperpackFileInputStream(next, AnonymousClass001.A0K());
                    superpackArchive.close();
                    return superpackFileInputStream;
                }
                new IllegalArgumentException();
            } else {
                new IllegalArgumentException();
            }
            throw th;
        } catch (Throwable th2) {
            try {
                superpackArchive.close();
                throw th2;
            } catch (Throwable th3) {
                0Ug.A00(th2, th3);
                throw th2;
            }
        }
    }

    public static int getDefaultThreadNum(String str) {
        return AnonymousClass002.A06(str);
    }

    @Override // java.io.InputStream
    public int available() {
        int i;
        synchronized (this) {
            i = this.A00 - this.A02;
        }
        return i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.A03.booleanValue()) {
            this.A05.close();
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            this.A01 = this.A02;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        int i;
        synchronized (this) {
            byte[] bArr = this.A04;
            if (bArr == null) {
                bArr = new byte[1];
                this.A04 = bArr;
            }
            int read = read(bArr);
            i = -1;
            if (read != -1) {
                if (read != 1) {
                    throw AnonymousClass001.A0N("Unexpected number of bytes read");
                }
                i = this.A04[0];
                if (i < 0) {
                    i += 256;
                }
            }
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        Throwable th;
        Throwable th2;
        int i3 = i2;
        synchronized (this) {
            if (bArr != null) {
                if (i >= 0 && i2 >= 0) {
                    int i4 = i2 + i;
                    int length = bArr.length;
                    if (i4 <= length) {
                        int i5 = this.A02;
                        int i6 = this.A00;
                        if (i5 == i6) {
                            return -1;
                        }
                        if (i2 + i5 > i6) {
                            i3 = i6 - i5;
                        }
                        SuperpackFile superpackFile = this.A05;
                        synchronized (superpackFile) {
                            try {
                                long j = superpackFile.mPtr;
                                if (j == 0) {
                                    new IllegalStateException();
                                } else if (i5 < 0 || i3 < 0) {
                                    new IndexOutOfBoundsException();
                                } else if (i + i3 > length) {
                                    new IndexOutOfBoundsException();
                                } else if (i5 + i3 <= superpackFile.mLength) {
                                    SuperpackFile.readBytesNative(j, i5, i3, bArr, i);
                                } else {
                                    new IndexOutOfBoundsException();
                                }
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        this.A02 += i3;
                        return i3;
                    }
                }
                new IndexOutOfBoundsException();
            } else {
                new NullPointerException();
            }
            throw th;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        synchronized (this) {
            this.A02 = this.A01;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        synchronized (this) {
            if (j < 0) {
                return 0L;
            }
            int i = this.A02;
            long j2 = i;
            long j3 = j2 + j;
            int i2 = this.A00;
            if (j3 > i2) {
                j = i2 - i;
            }
            this.A02 = (int) (j2 + j);
            return j;
        }
    }
}
