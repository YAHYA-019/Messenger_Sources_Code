package androidx.work.multiprocess.parcelable;

import X.0Pz;
import X.1BJ;
import X.4YV;
import X.7zM;
import X.7zU;
import X.AbI;
import X.AbN;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C4Kc;
import X.DKC;
import X.DKG;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: ParcelableData.class */
public final class ParcelableData implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(31);
    public final C4Kc A00;

    public ParcelableData(C4Kc c4Kc) {
        this.A00 = c4Kc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.4Kc] */
    /* JADX WARN: Type inference failed for: r307v0 */
    /* JADX WARN: Type inference failed for: r307v1 */
    /* JADX WARN: Type inference failed for: r307v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r307v11 */
    /* JADX WARN: Type inference failed for: r307v12 */
    /* JADX WARN: Type inference failed for: r307v13 */
    /* JADX WARN: Type inference failed for: r307v14 */
    /* JADX WARN: Type inference failed for: r307v15 */
    /* JADX WARN: Type inference failed for: r307v2 */
    /* JADX WARN: Type inference failed for: r307v3 */
    /* JADX WARN: Type inference failed for: r307v4 */
    /* JADX WARN: Type inference failed for: r307v5 */
    /* JADX WARN: Type inference failed for: r307v6 */
    /* JADX WARN: Type inference failed for: r307v7 */
    /* JADX WARN: Type inference failed for: r307v8 */
    /* JADX WARN: Type inference failed for: r307v9 */
    public ParcelableData(Parcel parcel) {
        boolean valueOf;
        HashMap A0u = AnonymousClass001.A0u();
        int readInt = parcel.readInt();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                ?? obj = new Object();
                obj.A00 = DKC.A1C(A0u);
                this.A00 = obj;
                return;
            }
            byte readByte = parcel.readByte();
            switch (readByte) {
                case 0:
                    valueOf = 0;
                    break;
                case 1:
                    valueOf = Boolean.valueOf(AbN.A1U(parcel));
                    break;
                case 2:
                    valueOf = Byte.valueOf(parcel.readByte());
                    break;
                case 3:
                    valueOf = AbI.A0z(parcel);
                    break;
                case 4:
                    valueOf = Long.valueOf(parcel.readLong());
                    break;
                case 5:
                    valueOf = Float.valueOf(parcel.readFloat());
                    break;
                case 6:
                    valueOf = DKG.A0x(parcel);
                    break;
                case 7:
                    valueOf = parcel.readString();
                    break;
                case 8:
                    boolean[] createBooleanArray = parcel.createBooleanArray();
                    C4Kc c4Kc = C4Kc.A01;
                    int length = createBooleanArray.length;
                    valueOf = new Boolean[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        valueOf[i3] = Boolean.valueOf(createBooleanArray[i3]);
                    }
                    break;
                case 9:
                    byte[] createByteArray = parcel.createByteArray();
                    C4Kc c4Kc2 = C4Kc.A01;
                    int length2 = createByteArray.length;
                    valueOf = new Byte[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        valueOf[i4] = Byte.valueOf(createByteArray[i4]);
                    }
                    break;
                case 10:
                    int[] createIntArray = parcel.createIntArray();
                    C4Kc c4Kc3 = C4Kc.A01;
                    int length3 = createIntArray.length;
                    valueOf = new Integer[length3];
                    for (int i5 = 0; i5 < length3; i5++) {
                        7zU.A1Z((Object[]) valueOf, createIntArray[i5], i5);
                    }
                    break;
                case 11:
                    long[] createLongArray = parcel.createLongArray();
                    C4Kc c4Kc4 = C4Kc.A01;
                    int length4 = createLongArray.length;
                    valueOf = new Long[length4];
                    int i6 = 0;
                    while (true) {
                        int i7 = i6;
                        if (i7 < length4) {
                            valueOf[i7] = Long.valueOf(createLongArray[i7]);
                            i6 = i7 + 1;
                        }
                    }
                    break;
                case 12:
                    float[] createFloatArray = parcel.createFloatArray();
                    C4Kc c4Kc5 = C4Kc.A01;
                    int length5 = createFloatArray.length;
                    valueOf = new Float[length5];
                    for (int i8 = 0; i8 < length5; i8++) {
                        valueOf[i8] = Float.valueOf(createFloatArray[i8]);
                    }
                    break;
                case 13:
                    double[] createDoubleArray = parcel.createDoubleArray();
                    C4Kc c4Kc6 = C4Kc.A01;
                    int length6 = createDoubleArray.length;
                    valueOf = new Double[length6];
                    int i9 = 0;
                    while (true) {
                        int i10 = i9;
                        if (i10 < length6) {
                            valueOf[i10] = Double.valueOf(createDoubleArray[i10]);
                            i9 = i10 + 1;
                        }
                    }
                    break;
                case 14:
                    valueOf = parcel.createStringArray();
                    break;
                default:
                    throw 4YV.A0h(AnonymousClass000.A00(ActionId.ASNYC_FAILED), readByte);
            }
            A0u.put(parcel.readString(), valueOf);
            i = i2 + 1;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A03;
        byte byteValue;
        Map unmodifiableMap = Collections.unmodifiableMap(this.A00.A00);
        parcel.writeInt(unmodifiableMap.size());
        Iterator A0y = AnonymousClass001.A0y(unmodifiableMap);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            String A0j = AnonymousClass001.A0j(A0z);
            Object value = A0z.getValue();
            if (value == null) {
                byteValue = 0;
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class) {
                    parcel.writeByte((byte) 1);
                    A03 = AnonymousClass001.A1V(value) ? 1 : 0;
                } else if (cls == Byte.class) {
                    parcel.writeByte((byte) 2);
                    byteValue = ((Number) value).byteValue();
                } else if (cls == Integer.class) {
                    parcel.writeByte((byte) 3);
                    A03 = AnonymousClass001.A03(value);
                } else {
                    if (cls == Long.class) {
                        parcel.writeByte((byte) 4);
                        parcel.writeLong(AnonymousClass001.A05(value));
                    } else if (cls == Float.class) {
                        parcel.writeByte((byte) 5);
                        parcel.writeFloat(7zM.A00(value));
                    } else if (cls == Double.class) {
                        parcel.writeByte((byte) 6);
                        parcel.writeDouble(DKC.A00(value));
                    } else if (cls == String.class) {
                        parcel.writeByte((byte) 7);
                        parcel.writeString((String) value);
                    } else if (cls == Boolean[].class) {
                        parcel.writeByte((byte) 8);
                        Boolean[] boolArr = (Boolean[]) value;
                        int length = boolArr.length;
                        boolean[] zArr = new boolean[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            zArr[i2] = boolArr[i2].booleanValue();
                        }
                        parcel.writeBooleanArray(zArr);
                    } else if (cls == Byte[].class) {
                        parcel.writeByte((byte) 9);
                        Byte[] bArr = (Byte[]) value;
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        for (int i3 = 0; i3 < length2; i3++) {
                            bArr2[i3] = bArr[i3].byteValue();
                        }
                        parcel.writeByteArray(bArr2);
                    } else if (cls == Integer[].class) {
                        parcel.writeByte((byte) 10);
                        Integer[] numArr = (Integer[]) value;
                        int length3 = numArr.length;
                        int[] iArr = new int[length3];
                        for (int i4 = 0; i4 < length3; i4++) {
                            iArr[i4] = numArr[i4].intValue();
                        }
                        parcel.writeIntArray(iArr);
                    } else if (cls == Long[].class) {
                        parcel.writeByte((byte) 11);
                        Long[] lArr = (Long[]) value;
                        int length4 = lArr.length;
                        long[] jArr = new long[length4];
                        for (int i5 = 0; i5 < length4; i5++) {
                            jArr[i5] = lArr[i5].longValue();
                        }
                        parcel.writeLongArray(jArr);
                    } else if (cls == Float[].class) {
                        parcel.writeByte((byte) 12);
                        Float[] fArr = (Float[]) value;
                        int length5 = fArr.length;
                        float[] fArr2 = new float[length5];
                        for (int i6 = 0; i6 < length5; i6++) {
                            fArr2[i6] = fArr[i6].floatValue();
                        }
                        parcel.writeFloatArray(fArr2);
                    } else if (cls == Double[].class) {
                        parcel.writeByte((byte) 13);
                        Double[] dArr = (Double[]) value;
                        int length6 = dArr.length;
                        double[] dArr2 = new double[length6];
                        for (int i7 = 0; i7 < length6; i7++) {
                            dArr2[i7] = dArr[i7].doubleValue();
                        }
                        parcel.writeDoubleArray(dArr2);
                    } else {
                        if (cls != String[].class) {
                            throw 0Pz.A05(1BJ.A00(899), cls.getName());
                        }
                        parcel.writeByte((byte) 14);
                        parcel.writeStringArray((String[]) value);
                    }
                    parcel.writeString(A0j);
                }
                parcel.writeInt(A03);
                parcel.writeString(A0j);
            }
            parcel.writeByte(byteValue);
            parcel.writeString(A0j);
        }
    }
}
