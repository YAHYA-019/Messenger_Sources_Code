package com.facebook.cameracore.ardelivery.model;

import X.0Pz;
import X.0S2;
import X.1BL;
import X.1JF;
import X.7zU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKC;
import X.DKf;
import X.EMT;
import X.EMi;
import X.FH3;
import X.HC6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: ARRequestAsset.class */
public final class ARRequestAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(75);
    public final long A00;
    public final long A01;
    public final FH3 A02;
    public final SparkVisionCapability A03;
    public final ImmutableList A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final String A0D;

    /* loaded from: ARRequestAsset$CompressionMethod.class */
    public enum CompressionMethod {
        NONE("NONE"),
        ZIP("ZIP"),
        TAR_BROTLI("TAR_BROTLI");

        public String mMethod;

        CompressionMethod(String str) {
            this.mMethod = str;
        }

        public static CompressionMethod fromCompressionType(EMT emt) {
            int ordinal = emt.ordinal();
            if (ordinal == 0) {
                return NONE;
            }
            if (ordinal == 1) {
                return ZIP;
            }
            if (ordinal == 2) {
                return TAR_BROTLI;
            }
            throw 0Pz.A05("unsupported compression method for CompressionType : ", emt.name());
        }

        public static CompressionMethod fromCompressionTypeCppValue(int i) {
            EMT[] values = EMT.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    throw 0Pz.A04("Unsupported compression type : ", i);
                }
                EMT emt = values[i3];
                if (emt.mCppValue == i) {
                    return fromCompressionType(emt);
                }
                i2 = i3 + 1;
            }
        }

        public static CompressionMethod fromJson(String str) {
            return valueOf(DKC.A18(str));
        }

        public static CompressionMethod fromString(String str) {
            return valueOf(DKC.A18(str));
        }

        public static String toJson(CompressionMethod compressionMethod) {
            return compressionMethod.getCompressionMethod();
        }

        public static EMT toXplatCompressionType(CompressionMethod compressionMethod) {
            int ordinal = compressionMethod.ordinal();
            if (ordinal == 0) {
                return EMT.A01;
            }
            if (ordinal == 1) {
                return EMT.A03;
            }
            if (ordinal == 2) {
                return EMT.A02;
            }
            throw AnonymousClass002.A0C(compressionMethod, "Unsupported compression method : ", AnonymousClass001.A0k());
        }

        public String getCompressionMethod() {
            return this.mMethod;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARRequestAsset(Parcel parcel) {
        try {
            this.A02 = new FH3(ByteBuffer.wrap(parcel.createByteArray()));
            this.A07 = parcel.readString();
            this.A09 = parcel.readString();
            this.A0D = parcel.readString();
            boolean z = true;
            this.A0B = AnonymousClass001.A1N(parcel.readByte());
            this.A06 = parcel.readString();
            this.A00 = parcel.readLong();
            this.A01 = parcel.readLong();
            this.A0A = parcel.createTypedArrayList(ARCapabilityMinVersionModeling.CREATOR);
            this.A08 = parcel.readString();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AREffectAsyncAsset.CREATOR);
            this.A04 = createTypedArrayList == null ? null : ImmutableList.copyOf((Collection) createTypedArrayList);
            this.A0C = parcel.readByte() == 0 ? false : z;
            this.A03 = (SparkVisionCapability) 1BL.A0C(parcel, SparkVisionCapability.class);
            this.A05 = 7zU.A0e(parcel, 2);
        } catch (IOException unused) {
            throw AnonymousClass001.A0U(this);
        }
    }

    public ARRequestAsset(ARAssetType aRAssetType, CompressionMethod compressionMethod, EffectAssetType effectAssetType, EMi eMi, HC6 hc6, SparkVisionCapability sparkVisionCapability, VersionedCapability versionedCapability, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        if (compressionMethod == null) {
            throw 0Pz.A05("Compression method must not be null: id=", str);
        }
        ImmutableList immutableList = null;
        this.A02 = new FH3(aRAssetType, compressionMethod, effectAssetType, eMi, hc6, versionedCapability, Boolean.valueOf(z), Boolean.valueOf(z2), str, str2, str3, str7, str8, aRAssetType == ARAssetType.SPARKVISION ? str : null, i);
        this.A09 = str5;
        this.A07 = str4;
        this.A06 = str6;
        this.A0B = z;
        this.A0D = str;
        this.A00 = j;
        this.A01 = j2;
        this.A0A = list;
        this.A08 = str9;
        this.A04 = list2 != null ? ImmutableList.copyOf((Collection) list2) : immutableList;
        this.A03 = sparkVisionCapability;
        this.A0C = z3;
        this.A05 = num;
    }

    public static ARRequestAsset A00(CompressionMethod compressionMethod, SparkVisionCapability sparkVisionCapability, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str10 = str;
        if (str4 != null) {
            str10 = str4;
        }
        String str11 = str10;
        if (str5 != null) {
            str11 = str5;
        }
        return new ARRequestAsset(ARAssetType.EFFECT, compressionMethod, z2 ? EffectAssetType.PINNED_EFFECT : EffectAssetType.NORMAL_EFFECT, null, null, sparkVisionCapability, null, 0S2.A00, str10, str11, str, str2, str3, str6, str7, str8, str9, list, list2, -1, j, j2, z, z3, z4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        SparkVisionCapability sparkVisionCapability;
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof ARRequestAsset)) {
                return false;
            }
            ARRequestAsset aRRequestAsset = (ARRequestAsset) obj;
            SparkVisionCapability sparkVisionCapability2 = this.A03;
            boolean equals = (sparkVisionCapability2 == null && aRRequestAsset.A03 == null) ? true : (sparkVisionCapability2 == null || (sparkVisionCapability = aRRequestAsset.A03) == null) ? false : sparkVisionCapability2.equals(sparkVisionCapability);
            if (this.A02.A09.equals(aRRequestAsset.A02.A09) && 1JF.A0C(this.A07, aRRequestAsset.A07) && 1JF.A0C(this.A09, aRRequestAsset.A09) && 1JF.A0C(this.A0D, aRRequestAsset.A0D) && this.A0B == aRRequestAsset.A0B && 1JF.A0C(this.A06, aRRequestAsset.A06) && this.A05 == aRRequestAsset.A05 && this.A00 == aRRequestAsset.A00) {
                List list = this.A0A;
                List list2 = aRRequestAsset.A0A;
                if (list != null ? list.equals(list2) : list2 == null) {
                    if (1JF.A0C(this.A08, aRRequestAsset.A08)) {
                        ImmutableList immutableList = this.A04;
                        ImmutableList immutableList2 = aRRequestAsset.A04;
                        if (immutableList != null ? immutableList.equals(immutableList2) : immutableList2 == null) {
                            if (this.A0C == aRRequestAsset.A0C && equals) {
                                return true;
                            }
                        }
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.A02.A09.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("id: ");
        FH3 fh3 = this.A02;
        A0k.append(fh3.A09);
        A0k.append(", name: ");
        A0k.append(fh3.A0B);
        A0k.append(", instance id: ");
        A0k.append(fh3.A0A);
        A0k.append(", cache key: ");
        A0k.append(fh3.A08);
        A0k.append(", asset type: ");
        ARAssetType aRAssetType = fh3.A02;
        A0k.append(aRAssetType);
        A0k.append(", sub asset type: ");
        A0k.append(fh3.A02());
        A0k.append(", compression method: ");
        A0k.append(fh3.A03);
        A0k.append(", uri: ");
        A0k.append(this.A09);
        A0k.append(", file size bytes: ");
        A0k.append(this.A00);
        A0k.append(", hash value: ");
        A0k.append(this.A06);
        A0k.append(", hash type: ");
        Integer num = this.A05;
        A0k.append(num == null ? "null" : 1 - num.intValue() != 0 ? "MD5" : "SHA256");
        A0k.append(", is logging disabled: ");
        A0k.append(this.A0B);
        A0k.append(", is asset encrypted: ");
        A0k.append(fh3.A06.booleanValue());
        A0k.append(", uses flm capability: ");
        A0k.append(this.A0C);
        if (aRAssetType == ARAssetType.EFFECT) {
            A0k.append(", model capability minVersion: ");
            A0k.append(this.A0A);
        }
        return A0k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        FH3 fh3 = this.A02;
        ByteBuffer allocate = ByteBuffer.allocate(RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
        allocate.putLong(7310021016723351138L);
        FH3.A01(allocate, fh3.A09);
        FH3.A01(allocate, fh3.A0A);
        FH3.A01(allocate, fh3.A0B);
        FH3.A01(allocate, fh3.A02.name());
        FH3.A01(allocate, fh3.A02());
        FH3.A01(allocate, fh3.A0C);
        FH3.A01(allocate, fh3.A03.name());
        allocate.putInt(fh3.A01);
        FH3.A01(allocate, fh3.A08);
        FH3.A01(allocate, fh3.A07.toString());
        HC6 hc6 = fh3.A05;
        FH3.A01(allocate, hc6 == null ? null : hc6.toString());
        FH3.A01(allocate, fh3.A06.toString());
        FH3.A01(allocate, fh3.A0D);
        parcel.writeByteArray(Arrays.copyOf(allocate.array(), allocate.position()));
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeTypedList(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeTypedList(this.A04);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        int i2 = 0;
        parcel.writeParcelable(this.A03, 0);
        Integer num = this.A05;
        if (num != null) {
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }
}
