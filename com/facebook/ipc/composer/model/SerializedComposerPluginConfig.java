package com.facebook.ipc.composer.model;

import X.11T;
import X.1BK;
import X.AbM;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SerializedComposerPluginConfig.class */
public final class SerializedComposerPluginConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(13);
    public final String data;
    public final String persistenceKey;

    public SerializedComposerPluginConfig() {
        this.persistenceKey = "ComposerPluginConfig_from_json";
        this.data = null;
    }

    public SerializedComposerPluginConfig(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw 1BK.A0h();
        }
        this.persistenceKey = readString;
        this.data = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SerializedComposerPluginConfig)) {
                return false;
            }
            SerializedComposerPluginConfig serializedComposerPluginConfig = (SerializedComposerPluginConfig) obj;
            if (!11T.A0O(this.persistenceKey, serializedComposerPluginConfig.persistenceKey) || !11T.A0O(this.data, serializedComposerPluginConfig.data)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.persistenceKey, this.data);
    }

    public String toString() {
        return this.persistenceKey;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.persistenceKey);
        parcel.writeString(this.data);
    }
}
