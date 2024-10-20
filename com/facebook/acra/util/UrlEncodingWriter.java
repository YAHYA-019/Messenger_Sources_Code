package com.facebook.acra.util;

import X.AnonymousClass001;
import java.io.FilterWriter;
import java.io.Writer;

/* loaded from: UrlEncodingWriter.class */
public class UrlEncodingWriter extends FilterWriter {
    public static final boolean THROW_ON_INVALID_INPUT = false;
    public static final int U16_SURROGATE_OFFSET = 56613888;
    public static final byte[] UPPER_CASE_DIGITS = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
    public static final byte UTF16_REPLACEMENT_BYTE = 63;
    public char mUtf16State;

    public UrlEncodingWriter(Writer writer) {
        super(writer);
        this.mUtf16State = (char) 0;
    }

    private void resetState() {
        this.mUtf16State = (char) 0;
    }

    public static int utf16GetSupplementary(char c, char c2) {
        return ((c << '\n') + c2) - U16_SURROGATE_OFFSET;
    }

    public static boolean utf16IsSurrogate(char c) {
        return AnonymousClass001.A1Q(c & 63488, 55296);
    }

    public static boolean utf16IsSurrogateLead(char c) {
        return AnonymousClass001.A1O(c & 1024);
    }

    public static boolean utf16IsSurrogateTrail(char c) {
        return AnonymousClass001.A1N(c & 1024);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r302 != 95) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r302 > 122) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeByte(byte r302) {
        /*
            r301 = this;
            r0 = 97
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto L16
            r0 = 122(0x7a, float:1.71E-43)
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 <= r1) goto L2e
        L10:
            r0 = r301
            r1 = r302
            r0.writeHexByte(r1)
            return
        L16:
            r0 = 65
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto L37
            r0 = 90
            r303 = r0
        L21:
            r0 = r302
            r1 = r303
            if (r0 <= r1) goto L2e
            r0 = 95
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L10
        L2e:
            r0 = r301
            java.io.Writer r0 = r0.out
            r1 = r302
            r0.write(r1)
            return
        L37:
            r0 = 48
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto L45
            r0 = 57
            r303 = r0
            goto L21
        L45:
            r0 = 46
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2e
            r0 = 45
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2e
            r0 = 42
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L2e
            r0 = 32
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L10
            r0 = r301
            java.io.Writer r0 = r0.out
            r1 = 43
            r0.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.util.UrlEncodingWriter.writeByte(byte):void");
    }

    private void writeHexByte(byte b) {
        ((FilterWriter) this).out.write(37);
        Writer writer = ((FilterWriter) this).out;
        byte[] bArr = UPPER_CASE_DIGITS;
        writer.write(bArr[(b >> 4) & 15]);
        ((FilterWriter) this).out.write(bArr[b & 15]);
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
    }

    public void enforceCodepointBoundary() {
        if (this.mUtf16State != 0) {
            writeHexByte((byte) 63);
            this.mUtf16State = (char) 0;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() {
        enforceCodepointBoundary();
        super.flush();
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) {
        int i2;
        char c = (char) i;
        char c2 = this.mUtf16State;
        if (c2 != 0) {
            if (!utf16IsSurrogate(c) || !AnonymousClass001.A1N(c & 1024)) {
                writeHexByte((byte) 63);
                this.mUtf16State = (char) 0;
                write(c);
                return;
            } else {
                int i3 = ((c2 << '\n') + c) - U16_SURROGATE_OFFSET;
                writeHexByte((byte) ((i3 >> 18) | 240));
                writeHexByte((byte) (((i3 >> 12) & 63) | 128));
                writeHexByte((byte) (((i3 >> 6) & 63) | 128));
                writeHexByte((byte) ((i3 & 63) | 128));
                this.mUtf16State = (char) 0;
                return;
            }
        }
        int i4 = ((char) (-1)) & c;
        if (i4 < 128) {
            writeByte((byte) c);
            return;
        }
        if (i4 < 2048) {
            i2 = (c >> 6) | 192;
        } else {
            if (utf16IsSurrogate(c)) {
                if (AnonymousClass001.A1O(c & 1024)) {
                    this.mUtf16State = c;
                    return;
                } else {
                    writeHexByte((byte) 63);
                    return;
                }
            }
            writeHexByte((byte) ((c >> '\f') | 224));
            i2 = ((c >> 6) & 63) | 128;
        }
        writeHexByte((byte) i2);
        writeHexByte((byte) ((c & '?') | 128));
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) {
        synchronized (((Writer) this).lock) {
            int i3 = i;
            while (true) {
                int i4 = i3;
                if (i4 < i + i2) {
                    write(str.charAt(i4));
                    i3 = i4 + 1;
                }
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        synchronized (((Writer) this).lock) {
            int i3 = i;
            while (true) {
                int i4 = i3;
                if (i4 < i + i2) {
                    write(cArr[i4]);
                    i3 = i4 + 1;
                }
            }
        }
    }
}
