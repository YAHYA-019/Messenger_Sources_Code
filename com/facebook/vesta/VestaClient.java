package com.facebook.vesta;

import X.C0il;
import X.KQr;
import X.Khn;
import X.KjA;
import X.RKD;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: VestaClient.class */
public final class VestaClient {
    public static final VestaClient $redex_init_class = null;

    static {
        C0il.A0B("vesta_client_jni");
    }

    public static Khn beginLogin(byte[] bArr) {
        byte[] bArr2 = new byte[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
        int beginLoginNative = beginLoginNative(bArr, bArr2);
        if (beginLoginNative != 0) {
            throw new KQr(beginLoginNative);
        }
        byte[][] parseNativeResults = parseNativeResults(bArr2);
        return new Khn(parseNativeResults[0], parseNativeResults[1]);
    }

    public static native int beginLoginNative(byte[] bArr, byte[] bArr2);

    public static RKD beginRegister(byte[] bArr) {
        byte[] bArr2 = new byte[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
        int beginRegisterNative = beginRegisterNative(bArr, bArr2);
        if (beginRegisterNative != 0) {
            throw new KQr(beginRegisterNative);
        }
        byte[][] parseNativeResults = parseNativeResults(bArr2);
        return new RKD(parseNativeResults[0], parseNativeResults[1]);
    }

    public static native int beginRegisterNative(byte[] bArr, byte[] bArr2);

    public static KjA finishLogin(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
        int finishLoginNative = finishLoginNative(bArr, bArr2, bArr3, bArr4, bArr5);
        if (finishLoginNative != 0) {
            throw new KQr(finishLoginNative);
        }
        byte[][] parseNativeResults = parseNativeResults(bArr5);
        return new KjA(parseNativeResults[0], parseNativeResults[1], parseNativeResults[2]);
    }

    public static native int finishLoginNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public static native int finishRegisterNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte b, byte[] bArr9);

    public static native int finishRegisterProtoNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte b, byte[] bArr9);

    public static native int getApiVersionNative();

    /* JADX WARN: Type inference failed for: r0v8, types: [byte[], byte[][]] */
    public static byte[][] parseNativeResults(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        int i = wrap.get();
        ?? r0 = new byte[i];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return r0;
            }
            byte[] bArr2 = new byte[wrap.getInt()];
            r0[i3] = bArr2;
            wrap.get(bArr2);
            i2 = i3 + 1;
        }
    }

    public static native int unpackLoginPayloadNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native int unpackLoginPayloadProtoNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static boolean validateHsmKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[RequestDefragmentingOutputStream.BODY_BUFFER_SIZE];
        int validateHsmKeyNative = validateHsmKeyNative(bArr, bArr2, bArr3);
        if (validateHsmKeyNative != 0) {
            throw new KQr(validateHsmKeyNative);
        }
        boolean z = false;
        if (parseNativeResults(bArr3)[0][0] != 0) {
            z = true;
        }
        return z;
    }

    public static native int validateHsmKeyNative(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native int verifyRestoreHistoryNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8);
}
