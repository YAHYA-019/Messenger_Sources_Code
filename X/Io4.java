package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* loaded from: Io4.class */
public final class Io4 implements Cloneable {
    public int A00;
    public byte[] A01;

    public Io4(int i, String str) {
        if (str == null) {
            throw AnonymousClass001.A0Q("EncodedStringValue: Text-string is null");
        }
        this.A00 = i;
        try {
            String str2 = (String) HOF.A00.get(i);
            if (str2 == null) {
                throw new UnsupportedEncodingException();
            }
            this.A01 = str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            0fH.A0r("EncodedStringValue", 0Pz.A0d("Input encoding ", " must be supported.", i), e);
            this.A01 = str.getBytes();
        }
    }

    public Io4(int i, byte[] bArr) {
        if (bArr == null) {
            throw AnonymousClass001.A0Q("EncodedStringValue: Text-string is null.");
        }
        this.A00 = i;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.A01 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public String A00() {
        int i = this.A00;
        if (i == 0) {
            return GOn.A1D(this.A01);
        }
        try {
            String str = (String) HOF.A00.get(i);
            if (str != null) {
                return new String(this.A01, str);
            }
            throw new UnsupportedEncodingException();
        } catch (UnsupportedEncodingException unused) {
            try {
                return new String(this.A01, "iso-8859-1");
            } catch (UnsupportedEncodingException unused2) {
                return GOn.A1D(this.A01);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, java.io.OutputStream, java.io.ByteArrayOutputStream] */
    public void A01(byte[] bArr) {
        if (bArr == null) {
            throw AnonymousClass001.A0Q("Text-string is null.");
        }
        if (this.A01 == null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.A01 = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.A01);
            byteArrayOutputStream.write(bArr);
            this.A01 = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            byteArrayOutputStream.printStackTrace();
            throw AnonymousClass001.A0Q("appendTextString: failed when write a new Text-string");
        }
    }

    public Object clone() {
        super.clone();
        byte[] bArr = this.A01;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        try {
            return new Io4(this.A00, bArr2);
        } catch (Exception e) {
            0fH.A0k("EncodedStringValue", AnonymousClass001.A0Z(this, "failed to clone an EncodedStringValue: ", AnonymousClass001.A0k()));
            e.printStackTrace();
            throw new CloneNotSupportedException(e.getMessage());
        }
    }
}
