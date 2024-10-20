package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.11T;
import X.1BK;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.HWc;
import X.HdE;
import X.HrM;
import X.HwB;
import X.JQw;
import com.facebook.acra.constants.ActionId;
import com.facebook.jni.HybridData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: ServiceMessageDataSourceHybrid.class */
public final class ServiceMessageDataSourceHybrid {
    public final HdE dataSource;
    public final HybridData mHybridData;

    public ServiceMessageDataSourceHybrid(HdE hdE) {
        11T.A0F(hdE, 1);
        this.dataSource = hdE;
        this.mHybridData = initHybrid();
    }

    public static void A00(char[] cArr, byte b, byte b2, byte b3, byte b4, int i) {
        if (b2 > -65 || (((b << 28) + (b2 + ActionId.MISSED_EVENT)) >> 30) != 0 || b3 > -65 || b4 > -65) {
            throw AnonymousClass001.A0L("Invalid UTF-8");
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static void A01(char[] cArr, byte b, byte b2, byte b3, int i) {
        if (b2 > -65 || (b != -32 ? !(b != -19 || b2 < -96) : b2 < -96) || b3 > -65) {
            throw AnonymousClass001.A0L("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    private final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v348, types: [X.HwB, java.lang.Object] */
    public final void didReceiveFromXplat(int i, byte[] bArr) {
        String str;
        short A0o;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        HdE hdE = this.dataSource;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        HWc hWc = hdE.A02;
        if (hWc != null) {
            if (HwB.A00 == null) {
                HwB.A00 = new Object();
            }
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            int i2 = wrap.getInt(wrap.position()) + wrap.position();
            int A08 = AbstractC2326GOr.A08(wrap, i2);
            short s = wrap.getShort(A08);
            HrM hrM = hWc.A00;
            if (4 >= s || (A0o = AbstractC2326GOr.A0o(wrap, A08)) == 0) {
                str = null;
            } else {
                int A09 = AbstractC2326GOr.A09(wrap, A0o, i2);
                int i3 = wrap.getInt(A09);
                int i4 = A09 + 4;
                if (wrap.hasArray()) {
                    byte[] array = wrap.array();
                    int arrayOffset = wrap.arrayOffset() + i4;
                    int i5 = arrayOffset | i3;
                    int length = array.length;
                    if ((i5 | ((length - arrayOffset) - i3)) < 0) {
                        throw new ArrayIndexOutOfBoundsException(String.format(JQw.A00(237), 1BK.A1a(Integer.valueOf(length), Integer.valueOf(arrayOffset), i3)));
                    }
                    int i6 = arrayOffset + i3;
                    char[] cArr = new char[i3];
                    int i7 = 0;
                    while (arrayOffset < i6 && (b4 = array[arrayOffset]) >= 0) {
                        arrayOffset++;
                        cArr[i7] = (char) b4;
                        i7++;
                    }
                    while (true) {
                        int i8 = i7;
                        if (arrayOffset >= i6) {
                            str = new String(cArr, 0, i7);
                            break;
                        }
                        int i9 = arrayOffset + 1;
                        byte b5 = array[arrayOffset];
                        if (b5 >= 0) {
                            i7++;
                            cArr[i8] = (char) b5;
                            while (i9 < i6 && (b3 = array[i9]) >= 0) {
                                i9++;
                                cArr[i7] = (char) b3;
                                i7++;
                            }
                            arrayOffset = i9;
                        } else if (AnonymousClass001.A1R(b5, -32)) {
                            if (i9 >= i6) {
                                throw AnonymousClass001.A0L("Invalid UTF-8");
                            }
                            arrayOffset = i9 + 1;
                            byte b6 = array[i9];
                            i7++;
                            if (b5 < -62) {
                                throw AnonymousClass001.A0L("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
                            }
                            if (b6 > -65) {
                                throw AnonymousClass001.A0L("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
                            }
                            cArr[i8] = (char) (((b5 & 31) << 6) | (b6 & 63));
                        } else if (b5 < -16) {
                            if (i9 >= i6 - 1) {
                                throw AnonymousClass001.A0L("Invalid UTF-8");
                            }
                            int i10 = i9 + 1;
                            arrayOffset = i10 + 1;
                            i7++;
                            A01(cArr, b5, array[i9], array[i10], i8);
                        } else {
                            if (i9 >= i6 - 2) {
                                throw AnonymousClass001.A0L("Invalid UTF-8");
                            }
                            int i11 = i9 + 1;
                            byte b7 = array[i9];
                            int i12 = i11 + 1;
                            arrayOffset = i12 + 1;
                            A00(cArr, b5, b7, array[i11], array[i12], i7);
                            i7 = i7 + 1 + 1;
                        }
                    }
                } else {
                    if ((i4 | i3 | ((wrap.limit() - i4) - i3)) < 0) {
                        throw new ArrayIndexOutOfBoundsException(String.format(JQw.A00(238), 1BK.A1a(Integer.valueOf(wrap.limit()), Integer.valueOf(i4), i3)));
                    }
                    int i13 = i4 + i3;
                    char[] cArr2 = new char[i3];
                    int i14 = 0;
                    while (i4 < i13 && (b2 = wrap.get(i4)) >= 0) {
                        i4++;
                        cArr2[i14] = (char) b2;
                        i14++;
                    }
                    while (true) {
                        int i15 = i14;
                        if (i4 >= i13) {
                            str = new String(cArr2, 0, i14);
                            break;
                        }
                        int i16 = i4 + 1;
                        byte b8 = wrap.get(i4);
                        if (b8 >= 0) {
                            i14++;
                            cArr2[i15] = (char) b8;
                            while (i16 < i13 && (b = wrap.get(i16)) >= 0) {
                                i16++;
                                cArr2[i14] = (char) b;
                                i14++;
                            }
                            i4 = i16;
                        } else if (AnonymousClass001.A1R(b8, -32)) {
                            if (i16 >= i13) {
                                throw AnonymousClass001.A0L("Invalid UTF-8");
                            }
                            i4 = i16 + 1;
                            byte b9 = wrap.get(i16);
                            i14++;
                            if (b8 < -62) {
                                throw AnonymousClass001.A0L("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
                            }
                            if (b9 > -65) {
                                throw AnonymousClass001.A0L("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
                            }
                            cArr2[i15] = (char) (((b8 & 31) << 6) | (b9 & 63));
                        } else if (b8 < -16) {
                            if (i16 >= i13 - 1) {
                                throw AnonymousClass001.A0L("Invalid UTF-8");
                            }
                            int i17 = i16 + 1;
                            i4 = i17 + 1;
                            i14++;
                            A01(cArr2, b8, wrap.get(i16), wrap.get(i17), i15);
                        } else {
                            if (i16 >= i13 - 2) {
                                throw AnonymousClass001.A0L("Invalid UTF-8");
                            }
                            int i18 = i16 + 1;
                            byte b10 = wrap.get(i16);
                            int i19 = i18 + 1;
                            i4 = i19 + 1;
                            A00(cArr2, b8, b10, wrap.get(i18), wrap.get(i19), i14);
                            i14 = i14 + 1 + 1;
                        }
                    }
                }
            }
            IOException A0G = AnonymousClass001.A0G(str);
            short A0p = 6 < s ? AbstractC2326GOr.A0p(wrap, A08) : (short) 0;
            boolean z = false;
            if (A0p != 0 && wrap.get(A0p + i2) != 0) {
                z = true;
            }
            hrM.A00(Boolean.valueOf(z), A0G);
        }
    }

    public native void didReceiveMessageFromPlatform(int i, ByteBuffer byteBuffer, int i2);

    public native void setConfiguration(int i, ByteBuffer byteBuffer, int i2);
}
