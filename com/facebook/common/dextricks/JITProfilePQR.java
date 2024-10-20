package com.facebook.common.dextricks;

import X.0Pz;
import X.AnonymousClass001;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: JITProfilePQR.class */
public class JITProfilePQR extends JITProfile {
    public static final int HEADER_COMPRESSED_SIZE_OFFSET = 13;
    public static final int MEGA_ZIP_NAME_PREFIX_LEN = 46;
    public static final String TAG = "JITProfilePQR";
    public static final byte[] mVersion = {48, 49, 48, 0};
    public boolean mValid;
    public final byte[] mFileHeader = new byte[17];
    public byte[] mDecompressedContent = null;

    public JITProfilePQR(InputStream inputStream) {
        this.mValid = false;
        if (readFileHeader(inputStream) && extractCompressedContent(inputStream)) {
            this.mValid = true;
        }
    }

    public static long calcBitMapStorageSize(long j) {
        long j2 = 8;
        return (((j * 2) + j2) - 1) / j2;
    }

    private byte[] createContentForOreo26() {
        byte[] bArr;
        byte[] bArr2 = this.mDecompressedContent;
        if (bArr2 == null) {
            bArr = new byte[0];
        } else {
            int i = this.mFileHeader[8];
            int[] iArr = new int[i];
            short[] sArr = new short[i];
            long[] jArr = new long[i];
            long[] jArr2 = new long[i];
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                short readShortFromContent = JITProfile.readShortFromContent(bArr2, i2);
                sArr[i4] = readShortFromContent;
                int i5 = readShortFromContent + 16;
                iArr[i4] = i5;
                int i6 = i3 + (i5 - 4);
                short readShortFromContent2 = JITProfile.readShortFromContent(bArr2, i2 + 2);
                long readUnsignedIntFromContent = JITProfile.readUnsignedIntFromContent(bArr2, i2 + 4);
                long calcBitMapStorageSize = calcBitMapStorageSize(JITProfile.readUnsignedIntFromContent(bArr2, i2 + 12));
                long j = readUnsignedIntFromContent + (readShortFromContent2 * 2);
                jArr[i4] = calcBitMapStorageSize + j;
                jArr2[i4] = j;
                i3 = (int) (i6 + j);
                i2 += i5;
            }
            long j2 = i2;
            bArr = new byte[i3];
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i; i9++) {
                System.arraycopy(this.mDecompressedContent, i8, bArr, i7, (iArr[i9] - sArr[i9]) - 4);
                int i10 = iArr[i9];
                short s = sArr[i9];
                int i11 = i10 - s;
                int i12 = i8 + i11;
                int i13 = i7 + (i11 - 4);
                System.arraycopy(this.mDecompressedContent, i12, bArr, i13, s);
                short s2 = sArr[i9];
                i8 = i12 + s2;
                int i14 = i13 + s2;
                System.arraycopy(this.mDecompressedContent, (int) j2, bArr, i14, (int) jArr2[i9]);
                long j3 = jArr2[i9];
                writeMethodIdInContent(bArr, i14, j3);
                i7 = (int) (i14 + j3);
                j2 += jArr[i9];
            }
        }
        return bArr;
    }

    private byte[] createContentForOreo27() {
        byte[] bArr;
        byte[] bArr2 = this.mDecompressedContent;
        if (bArr2 == null) {
            bArr = new byte[0];
        } else {
            bArr = new byte[bArr2.length];
            int i = this.mFileHeader[8];
            int[] iArr = new int[i];
            long[] jArr = new long[i];
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int readShortFromContent = JITProfile.readShortFromContent(bArr2, i2) + 16;
                iArr[i3] = readShortFromContent;
                short readShortFromContent2 = JITProfile.readShortFromContent(bArr2, i2 + 2);
                int i4 = i3;
                jArr[i4] = JITProfile.readUnsignedIntFromContent(bArr2, i2 + 4) + (readShortFromContent2 * 2) + calcBitMapStorageSize(JITProfile.readUnsignedIntFromContent(bArr2, i2 + 12));
                i2 += readShortFromContent;
            }
            long j = i2;
            long j2 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                System.arraycopy(this.mDecompressedContent, i5, bArr, (int) j2, iArr[i6]);
                int i7 = iArr[i6];
                long j3 = j2 + i7;
                i5 += i7;
                System.arraycopy(this.mDecompressedContent, (int) j, bArr, (int) j3, (int) jArr[i6]);
                long j4 = jArr[i6];
                j2 = j3 + j4;
                j += j4;
            }
        }
        return bArr;
    }

    private byte[] createProfileHeaderForOreo26() {
        byte[] bArr = this.mFileHeader;
        int length = bArr.length - 8;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i = 4;
        byte[] bArr3 = {48, 48, 53, 0};
        do {
            bArr2[i] = bArr3[i - 4];
            i++;
        } while (i < 8);
        return bArr2;
    }

    private byte[] createProfileHeaderForOreo27() {
        byte[] bArr = (byte[]) this.mFileHeader.clone();
        int i = 4;
        byte[] bArr2 = {48, 48, 57, 0};
        do {
            bArr[i] = bArr2[i - 4];
            i++;
        } while (i < 8);
        return bArr;
    }

    private int getCompressedSize() {
        return JITProfile.readUnsignedIntFromContent(this.mFileHeader, 13);
    }

    private int getDecompressedSize() {
        return JITProfile.readUnsignedIntFromContent(this.mFileHeader, 9);
    }

    private byte getNumDexes() {
        return this.mFileHeader[8];
    }

    private void setCompressedSize(int i) {
        JITProfile.writeUnsignedIntToContent(this.mFileHeader, 13, i);
    }

    private void setDecompressedSize(int i) {
        JITProfile.writeUnsignedIntToContent(this.mFileHeader, 9, i);
    }

    private boolean writeFileHeader(FileOutputStream fileOutputStream) {
        return writeFileHeader(fileOutputStream, this.mFileHeader);
    }

    private boolean writeFileHeader(FileOutputStream fileOutputStream, byte[] bArr) {
        try {
            fileOutputStream.write(bArr);
            return true;
        } catch (IOException e) {
            Mlog.w(TAG, ":Fail to write profile file header %s", e);
            return false;
        }
    }

    public static void writeMethodIdInContent(byte[] bArr, int i, long j) {
        long j2 = j / 4;
        if (j2 == 0) {
            return;
        }
        int readUInt16FromContent = JITProfile.readUInt16FromContent(bArr, i);
        JITProfile.writeShortToContent(bArr, i, (short) readUInt16FromContent);
        int i2 = i + 4;
        int i3 = 1;
        while (true) {
            int i4 = i3;
            if (i4 >= j2) {
                return;
            }
            readUInt16FromContent += JITProfile.readUInt16FromContent(bArr, i2);
            JITProfile.writeShortToContent(bArr, i2, (short) readUInt16FromContent);
            i2 += 4;
            i3 = i4 + 1;
        }
    }

    private boolean writeProfileInOreo27(FileOutputStream fileOutputStream) {
        byte[] createContentForOreo27 = createContentForOreo27();
        byte[] createProfileHeaderForOreo27 = createProfileHeaderForOreo27();
        int length = createContentForOreo27.length;
        byte[] bArr = new byte[length * 2];
        Deflater deflater = new Deflater(1);
        deflater.setInput(createContentForOreo27);
        deflater.finish();
        int deflate = deflater.deflate(bArr);
        deflater.end();
        JITProfile.writeUnsignedIntToContent(createProfileHeaderForOreo27, 9, length);
        JITProfile.writeUnsignedIntToContent(createProfileHeaderForOreo27, 13, deflate);
        if (!writeFileHeader(fileOutputStream, createProfileHeaderForOreo27)) {
            return false;
        }
        try {
            fileOutputStream.write(bArr, 0, deflate);
            return true;
        } catch (IOException e) {
            System.out.println("Fail to write profile compressed content");
            Mlog.w(e, "writeProfileInOreo27 failed!", new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    @Override // com.facebook.common.dextricks.JITProfile
    public void change2MegaZipDexLocations(String str) {
        byte[] bArr = this.mDecompressedContent;
        if (bArr == null) {
            Mlog.w("JITProfilePQR: depressed content is empty", new Object[0]);
            return;
        }
        short s = this.mFileHeader[8];
        int i = 0;
        for (short s2 = 0; s2 < s; s2++) {
            short readShortFromContent = JITProfile.readShortFromContent(bArr, i);
            int i2 = i + 16;
            StringBuilder A0o = AnonymousClass001.A0o(new String(bArr, i2, readShortFromContent, StandardCharsets.US_ASCII));
            A0o.replace(0, 46, str);
            String obj = A0o.toString();
            bArr = this.mDecompressedContent;
            JITProfile.writeStringToContent(bArr, i2, obj);
            i = i2 + readShortFromContent;
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable, java.util.zip.Inflater] */
    public boolean extractCompressedContent(InputStream inputStream) {
        int compressedSize = getCompressedSize();
        int decompressedSize = getDecompressedSize();
        byte[] bArr = new byte[compressedSize];
        this.mDecompressedContent = new byte[decompressedSize];
        try {
            if (inputStream.read(bArr, 0, compressedSize) != compressedSize) {
                AnonymousClass001.A1B("JITProfilePQR:not enough bytes reading compressed content");
                return false;
            }
            ?? inflater = new Inflater();
            inflater.setInput(bArr);
            try {
                int inflate = inflater.inflate(this.mDecompressedContent);
                if (inflate != decompressedSize) {
                    Mlog.w("JITProfilePQRexpected %d to be decompressed, %d actual \n", Integer.valueOf(decompressedSize), Integer.valueOf(inflate));
                    return false;
                }
                inflater.end();
                return true;
            } catch (DataFormatException unused) {
                inflater.printStackTrace();
                Mlog.w("JITProfilePQRFail to decompressed content", new Object[0]);
                return false;
            }
        } catch (IOException e) {
            Mlog.w("JITProfilePQRIO Exception while reading compressed content", new Object[0]);
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [int] */
    @Override // com.facebook.common.dextricks.JITProfile
    public boolean fixDexChecksums(HashMap hashMap) {
        Object[] objArr;
        String str;
        short s = this.mFileHeader[8];
        if (hashMap.size() >= s) {
            int i = 0;
            for (short s2 = 0; s2 < s; s2++) {
                byte[] bArr = this.mDecompressedContent;
                short readShortFromContent = JITProfile.readShortFromContent(bArr, i);
                String str2 = new String(bArr, i + 16, readShortFromContent, StandardCharsets.US_ASCII);
                String obj = AnonymousClass001.A0n(str2.length() < 47 ? "classes.dex" : str2.substring(47)).toString();
                if (hashMap.containsKey(obj)) {
                    JITProfile.writeUnsignedIntToContent(this.mDecompressedContent, i + 8, AnonymousClass001.A03(hashMap.get(obj)));
                    i += readShortFromContent + 16;
                } else {
                    objArr = new Object[]{obj};
                    str = "JITProfilePQR:%s not having checksum updated, wrong";
                }
            }
            return true;
        }
        objArr = new Object[]{Integer.valueOf(hashMap.size()), Short.valueOf(s)};
        str = "JITProfilePQRonly %d items on checksumMap, should be %d, ";
        Mlog.w(str, objArr);
        return false;
    }

    @Override // com.facebook.common.dextricks.JITProfile
    public byte[] getVersion() {
        return mVersion;
    }

    @Override // com.facebook.common.dextricks.JITProfile
    public boolean isValid() {
        return this.mValid;
    }

    @Override // com.facebook.common.dextricks.JITProfile
    public boolean isVersionRight(byte[] bArr) {
        int i = 4;
        while (bArr[i] == mVersion[i - 4]) {
            i++;
            if (i >= 8) {
                return true;
            }
        }
        Mlog.w("JITProfilePQR: Incorrect version number", new Object[0]);
        return false;
    }

    public String prettyPrintFileHeader() {
        byte b = this.mFileHeader[8];
        int decompressedSize = getDecompressedSize();
        int compressedSize = getCompressedSize();
        StringBuilder A1D = 0Pz.A1D("Android 9 Profile has ", " dex files,  ", b);
        A1D.append(decompressedSize);
        A1D.append(" uncompressed bytes,");
        A1D.append(compressedSize);
        return AnonymousClass001.A0d(" compressed bytes", A1D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [int] */
    public void prettyProfileLineHeaders() {
        short s = this.mFileHeader[8];
        if (this.mDecompressedContent == null) {
            Mlog.w("JITProfilePQR: depressed content is empty", new Object[0]);
            return;
        }
        int i = 0;
        for (short s2 = 0; s2 < s; s2++) {
            short readShortFromContent = JITProfile.readShortFromContent(this.mDecompressedContent, i);
            Mlog.v("JITProfilePQRdexLocationSize is %d ", Short.valueOf(readShortFromContent));
            int i2 = i + 2;
            Mlog.v("JITProfilePQRclassSetSize is %d ", Short.valueOf(JITProfile.readShortFromContent(this.mDecompressedContent, i2)));
            int i3 = i2 + 2;
            Mlog.v("JITProfilePQRmethodRegionSize is %d ", AnonymousClass001.A1a(JITProfile.readUnsignedIntFromContent(this.mDecompressedContent, i3)));
            Mlog.v("JITProfilePQRcheckSum is %d ", Long.valueOf(JITProfile.readUnsignedIntFromContent(this.mDecompressedContent, r0) & 4294967295L));
            int i4 = i3 + 4 + 4;
            Mlog.v("JITProfilePQRnumMethodIDs is %d ", AnonymousClass001.A1a(JITProfile.readUnsignedIntFromContent(this.mDecompressedContent, i4)));
            int i5 = i4 + 4;
            i = i5 + readShortFromContent;
            AnonymousClass001.A1C(0Pz.A0W("JITProfilePQRthe file name is ", new String(this.mDecompressedContent, i5, readShortFromContent, StandardCharsets.US_ASCII)));
        }
    }

    @Override // com.facebook.common.dextricks.JITProfile
    public boolean readFileHeader(InputStream inputStream) {
        boolean z = false;
        try {
            byte[] bArr = this.mFileHeader;
            int read = inputStream.read(bArr, 0, bArr.length);
            byte[] bArr2 = this.mFileHeader;
            if (read != bArr2.length) {
                AnonymousClass001.A1B("JITProfilePQR: not enough bytes reading profile header");
                return false;
            }
            if (JITProfile.isMagicRight(bArr2) && isVersionRight(this.mFileHeader)) {
                z = true;
            }
            return z;
        } catch (IOException e) {
            Mlog.w("JITProfilePQR:IO Exception while reading profile header", new Object[0]);
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.facebook.common.dextricks.JITProfile
    public boolean writeProfile(FileOutputStream fileOutputStream) {
        byte[] bArr = this.mDecompressedContent;
        if (bArr == null) {
            Mlog.w("JITProfilePQR: depressed content is empty", new Object[0]);
            return false;
        }
        setDecompressedSize(bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream((OutputStream) byteArrayOutputStream, new Deflater(1), true);
        try {
            try {
                deflaterOutputStream.write(this.mDecompressedContent);
                deflaterOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                setCompressedSize(byteArray.length);
                if (!writeFileHeader(fileOutputStream, this.mFileHeader)) {
                    return false;
                }
                try {
                    fileOutputStream.write(byteArray);
                    return true;
                } catch (IOException e) {
                    Mlog.w("JITProfilePQR:Fail to write profile compressed content", new Object[0]);
                    e.printStackTrace();
                    return false;
                }
            } catch (IOException e2) {
                Mlog.w("JITProfilePQR:Fail to compress content ", e2);
                deflaterOutputStream.close();
                byteArrayOutputStream.close();
                return false;
            }
        } catch (Throwable th) {
            deflaterOutputStream.close();
            byteArrayOutputStream.close();
            throw th;
        }
    }

    public boolean writeProfileInOreo26(FileOutputStream fileOutputStream) {
        if (!writeFileHeader(fileOutputStream, createProfileHeaderForOreo26())) {
            return false;
        }
        try {
            byte[] createContentForOreo26 = createContentForOreo26();
            fileOutputStream.write(createContentForOreo26, 0, createContentForOreo26.length);
            return true;
        } catch (IOException e) {
            System.out.println("Fail to write profile compressed content");
            e.printStackTrace();
            return false;
        }
    }
}
