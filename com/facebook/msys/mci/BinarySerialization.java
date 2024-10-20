package com.facebook.msys.mci;

import X.0fH;
import X.1SL;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* loaded from: BinarySerialization.class */
public class BinarySerialization {
    static {
        1SL.A00();
    }

    public static HashMap decode(byte[] bArr) {
        try {
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
        } catch (IOException | ClassNotFoundException e) {
            0fH.A0r("BinarySerialization", "Decode failed.", e);
            return null;
        }
    }

    public static byte[] encode(HashMap hashMap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(hashMap);
                objectOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                objectOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            0fH.A0r("BinarySerialization", "Encode failed.", e);
            return null;
        }
    }

    public static native void nativeInitialize();
}
