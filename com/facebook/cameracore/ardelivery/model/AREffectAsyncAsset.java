package com.facebook.cameracore.ardelivery.model;

import X.4YV;
import X.4YW;
import X.AbM;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0By;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: AREffectAsyncAsset.class */
public class AREffectAsyncAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(74);
    public final String mCacheKey;
    public final ARRequestAsset.CompressionMethod mCompressionMethod;
    public final String mId;
    public final boolean mIsLoggingDisabled;
    public final List mStringIdentifiers;
    public final String mUri;

    public AREffectAsyncAsset(Parcel parcel) {
        this.mId = AbM.A0t(parcel);
        this.mCacheKey = AbM.A0t(parcel);
        ArrayList A0s = AnonymousClass001.A0s();
        this.mStringIdentifiers = A0s;
        parcel.readStringList(A0s);
        this.mUri = AbM.A0t(parcel);
        Serializable readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        this.mCompressionMethod = (ARRequestAsset.CompressionMethod) readSerializable;
        this.mIsLoggingDisabled = 4YW.A0K(parcel);
    }

    public AREffectAsyncAsset(String str, String str2, List list, String str3, ARRequestAsset.CompressionMethod compressionMethod, boolean z) {
        C0By.A03(str, "async asset id cannot be null");
        this.mId = str;
        C0By.A03(str2, "async asset cache key cannot be null");
        this.mCacheKey = str2;
        this.mStringIdentifiers = list;
        this.mUri = str3;
        this.mCompressionMethod = compressionMethod;
        this.mIsLoggingDisabled = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AREffectAsyncAsset) {
                AREffectAsyncAsset aREffectAsyncAsset = (AREffectAsyncAsset) obj;
                if (this.mId.equals(aREffectAsyncAsset.mId) && this.mCacheKey.equals(aREffectAsyncAsset.mCacheKey) && this.mStringIdentifiers.equals(aREffectAsyncAsset.mStringIdentifiers) && this.mUri.equals(aREffectAsyncAsset.mUri) && this.mCompressionMethod == aREffectAsyncAsset.mCompressionMethod && this.mIsLoggingDisabled == aREffectAsyncAsset.mIsLoggingDisabled) {
                    z = true;
                }
            }
        }
        return z;
    }

    public String getCacheKey() {
        return this.mCacheKey;
    }

    public ARRequestAsset.CompressionMethod getCompressionMethod() {
        return this.mCompressionMethod;
    }

    public int getCompressionMethodForNative() {
        return ARRequestAsset.CompressionMethod.toXplatCompressionType(this.mCompressionMethod).mCppValue;
    }

    public String[] getFileNamesForNative() {
        return C3o5.A0n(this.mStringIdentifiers);
    }

    public String getId() {
        return this.mId;
    }

    public ImmutableList getStringIdentifiers() {
        return ImmutableList.copyOf((Collection) this.mStringIdentifiers);
    }

    public String getUri() {
        return this.mUri;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.mCompressionMethod, AnonymousClass002.A07(this.mUri, (AnonymousClass002.A07(this.mCacheKey, 4YV.A02(this.mId)) + this.mStringIdentifiers.hashCode()) * 31)) + (this.mIsLoggingDisabled ? 1 : 0);
    }

    public boolean isLoggingDisabled() {
        return this.mIsLoggingDisabled;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mCacheKey);
        parcel.writeStringList(this.mStringIdentifiers);
        parcel.writeString(this.mUri);
        parcel.writeSerializable(this.mCompressionMethod);
        parcel.writeByte(this.mIsLoggingDisabled ? (byte) 1 : (byte) 0);
    }
}
