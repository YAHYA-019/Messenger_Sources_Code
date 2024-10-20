package com.facebook.libyuv;

import X.1Bq;
import X.1Br;
import X.C06w;
import X.C06z;
import X.R02;
import com.facebook.soloader.NativeLibrary;
import java.nio.ByteBuffer;

/* loaded from: YUVColorConverter.class */
public final class YUVColorConverter {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(YUVColorConverter.class, "yuvLib", "getYuvLib()Lcom/facebook/libyuv/YuvLib;", 0)};
    public static final R02 Companion = new Object();
    public final 1Br yuvLib$delegate;

    public YUVColorConverter() {
        1Br A00 = 1Bq.A00(116356);
        this.yuvLib$delegate = A00;
        ((NativeLibrary) 1Br.A0B(A00)).A00();
    }

    public static final native int nativeConvertARGBToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static final native int nativeConvertARGBToNV21(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5);

    public static final native int nativeConvertAndroid420ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, ByteBuffer byteBuffer5, int i6, ByteBuffer byteBuffer6, int i7, int i8, int i9);

    public static final native int nativeConvertI420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static final native int nativeConvertI420ToARGB(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static final native int nativeConvertI420ToI444(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static final native int nativeConvertI420ToNV21(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static final native int nativeConvertJ420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static final native int nativeConvertJ420ToARGB(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    public static final native int nativeConvertNV12ToARGB(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5);

    public static final native int nativeConvertNV21ToARGB(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5);

    public static final native int nativeConvertNV21ToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);
}
