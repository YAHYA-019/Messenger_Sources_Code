package X;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: H8x.class */
public class H8x extends InputStream implements DataInput {
    public int A00;
    public int A01;
    public ByteOrder A02;
    public byte[] A03;
    public final DataInputStream A04;

    public H8x(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A04 = dataInputStream;
        dataInputStream.mark(0);
        this.A01 = 0;
        this.A02 = byteOrder;
        this.A00 = inputStream instanceof H8x ? ((H8x) inputStream).A00 : -1;
    }

    public H8x(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.A00 = bArr.length;
    }

    public void A00(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                this.A01 += i3;
                return;
            }
            DataInputStream dataInputStream = this.A04;
            int i4 = i - i3;
            int skip = (int) dataInputStream.skip(i4);
            if (skip <= 0) {
                byte[] bArr = this.A03;
                if (bArr == null) {
                    bArr = new byte[8192];
                    this.A03 = bArr;
                }
                skip = dataInputStream.read(bArr, 0, Math.min(8192, i4));
                if (skip == -1) {
                    throw new EOFException(0Pz.A0d("Reached EOF while skipping ", " bytes.", i));
                }
            }
            i2 = i3 + skip;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.A04.available();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        throw AnonymousClass001.A0q("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public int read() {
        this.A01++;
        return this.A04.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.A04.read(bArr, i, i2);
        this.A01 += read;
        return read;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        this.A01++;
        return this.A04.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        this.A01++;
        int read = this.A04.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() {
        this.A01 += 2;
        return this.A04.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        this.A01 += bArr.length;
        this.A04.readFully(bArr);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) {
        this.A01 += i2;
        this.A04.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public int readInt() {
        this.A01 += 4;
        DataInputStream dataInputStream = this.A04;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.A02;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw AbstractC2326GOr.A0b(byteOrder);
    }

    @Override // java.io.DataInput
    public String readLine() {
        android.util.Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public long readLong() {
        long j;
        long j2;
        this.A01 += 8;
        DataInputStream dataInputStream = this.A04;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.A02;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j2 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw AbstractC2326GOr.A0b(byteOrder);
            }
            j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j2 = read8;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public short readShort() {
        int i;
        this.A01 += 2;
        DataInputStream dataInputStream = this.A04;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.A02;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            i = (read2 << 8) + read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw AbstractC2326GOr.A0b(byteOrder);
            }
            i = (read << 8) + read2;
        }
        return (short) i;
    }

    @Override // java.io.DataInput
    public String readUTF() {
        this.A01 += 2;
        return this.A04.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        this.A01++;
        return this.A04.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        this.A01 += 2;
        DataInputStream dataInputStream = this.A04;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.A02;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw AbstractC2326GOr.A0b(byteOrder);
    }

    @Override // java.io.InputStream
    public void reset() {
        throw AnonymousClass001.A0q("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) {
        throw AnonymousClass001.A0q("skipBytes is currently unsupported");
    }
}
