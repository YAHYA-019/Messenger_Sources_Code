package com.facebook.quicksilver.common.sharing;

import X.0S2;
import X.0fH;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.IOException;

/* loaded from: GameShareExtras.class */
public abstract class GameShareExtras implements Parcelable {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public GameShareExtras(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        A01(parcel);
    }

    public GameShareExtras(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public Integer A00() {
        return this instanceof GameEntityShareExtras ? 0S2.A0C : 0S2.A00;
    }

    public void A01(Parcel parcel) {
        if (this instanceof GameEntityShareExtras) {
            GameEntityShareExtras gameEntityShareExtras = (GameEntityShareExtras) this;
            gameEntityShareExtras.A02 = parcel.readString();
            gameEntityShareExtras.A01 = parcel.readString();
            gameEntityShareExtras.A00 = parcel.readString();
            return;
        }
        GameAsyncShareExtras gameAsyncShareExtras = (GameAsyncShareExtras) this;
        gameAsyncShareExtras.A05 = parcel.readString();
        gameAsyncShareExtras.A02 = parcel.readString();
        gameAsyncShareExtras.A03 = parcel.readString();
        gameAsyncShareExtras.A04 = parcel.readString();
        gameAsyncShareExtras.A01 = parcel.readString();
        int dataPosition = parcel.dataPosition();
        String readString = parcel.readString();
        if (readString != null) {
            File file = new File(readString);
            gameAsyncShareExtras.A00 = file;
            if (file.exists()) {
                return;
            }
            gameAsyncShareExtras.A00 = null;
            parcel.setDataPosition(dataPosition);
        }
    }

    public void A02(Parcel parcel, int i) {
        String str;
        if (this instanceof GameEntityShareExtras) {
            GameEntityShareExtras gameEntityShareExtras = (GameEntityShareExtras) this;
            parcel.writeString(gameEntityShareExtras.A02);
            parcel.writeString(gameEntityShareExtras.A01);
            str = gameEntityShareExtras.A00;
        } else {
            GameAsyncShareExtras gameAsyncShareExtras = (GameAsyncShareExtras) this;
            parcel.writeString(gameAsyncShareExtras.A05);
            parcel.writeString(gameAsyncShareExtras.A02);
            parcel.writeString(gameAsyncShareExtras.A03);
            parcel.writeString(gameAsyncShareExtras.A04);
            parcel.writeString(gameAsyncShareExtras.A01);
            File file = gameAsyncShareExtras.A00;
            str = null;
            if (file != null) {
                try {
                    parcel.writeString(file.getCanonicalPath());
                    return;
                } catch (IOException e) {
                    0fH.A0s("GameAsyncShareExtras", "Failed to determine canonical path of media file", e);
                    parcel.writeString(null);
                    return;
                }
            }
        }
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        A02(parcel, i);
    }
}
