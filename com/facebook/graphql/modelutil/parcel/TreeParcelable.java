package com.facebook.graphql.modelutil.parcel;

import X.0Pz;
import X.1BJ;
import X.2tS;
import X.7kF;
import X.AnonymousClass001;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.Tree;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: TreeParcelable.class */
public final class TreeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(86);
    public Tree A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public TreeParcelable(byte[] bArr, int i, String str) {
        this.A02 = str;
        this.A01 = i;
        this.A03 = bArr;
    }

    public static TreeParcelable A00(Parcel parcel) {
        if (parcel == null) {
            return null;
        }
        String readString = parcel.readString();
        if ("default".equals(readString)) {
            readString = parcel.readString();
        }
        if (readString == null) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return new TreeParcelable(bArr, readInt, readString);
    }

    public static byte[] A01(Tree tree) {
        try {
            ByteBuffer serializeTreeToByteBuffer = 2tS.A04(GraphServiceAsset.getDefaultConfigName()).serializeTreeToByteBuffer(tree);
            byte[] bArr = new byte[serializeTreeToByteBuffer.limit()];
            serializeTreeToByteBuffer.get(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            throw AnonymousClass001.A0L(1BJ.A00(724));
        }
    }

    public Tree A02() {
        Tree tree = this.A00;
        if (tree == null) {
            String str = this.A02;
            Class<?> cls = Class.forName(str);
            if (!Tree.class.isAssignableFrom(cls)) {
                throw AnonymousClass001.A0L(0Pz.A0v("Parcel does not contain valid GraphQL Tree ", str, " ", cls.getSimpleName()));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.A03);
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = gZIPInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        tree = 2tS.A04(GraphServiceAsset.getDefaultConfigName()).deserializeTreeFromByteBuffer(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()), cls, this.A01);
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        byteArrayOutputStream.close();
                        this.A00 = tree;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } finally {
                    7kF.A00(th, th);
                }
            }
        }
        return tree;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw r302;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0038: THROW (r0 I:java.lang.Throwable), block:B:18:0x0038 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A02     // Catch: java.lang.RuntimeException -> L38
            r304 = r0
            r0 = r301
            int r0 = r0.A01     // Catch: java.lang.RuntimeException -> L38
            r305 = r0
            r0 = r301
            byte[] r0 = r0.A03     // Catch: java.lang.RuntimeException -> L38
            r306 = r0
            java.lang.String r0 = "default"
            r307 = r0
            r0 = r302
            r1 = r307
            r0.writeString(r1)     // Catch: java.lang.RuntimeException -> L38
            r0 = r302
            r1 = r304
            r0.writeString(r1)     // Catch: java.lang.RuntimeException -> L38
            r0 = r302
            r1 = r305
            r0.writeInt(r1)     // Catch: java.lang.RuntimeException -> L38
            r0 = r306
            int r0 = r0.length     // Catch: java.lang.RuntimeException -> L38
            r308 = r0
            r0 = r302
            r1 = r308
            r0.writeInt(r1)     // Catch: java.lang.RuntimeException -> L38
            r0 = r302
            r1 = r306
            r0.writeByteArray(r1)     // Catch: java.lang.RuntimeException -> L38
            return
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.modelutil.parcel.TreeParcelable.writeToParcel(android.os.Parcel, int):void");
    }
}
