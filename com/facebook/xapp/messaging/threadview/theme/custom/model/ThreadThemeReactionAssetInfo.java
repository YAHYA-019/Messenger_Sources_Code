package com.facebook.xapp.messaging.threadview.theme.custom.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.FKb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: ThreadThemeReactionAssetInfo.class */
public final class ThreadThemeReactionAssetInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(74);
    public final Uri A00;
    public final Uri A01;
    public final Uri A02;
    public final String A03;
    public final String A04;

    public ThreadThemeReactionAssetInfo(Uri uri, Uri uri2, Uri uri3, String str, String str2) {
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        this.A03 = str;
        this.A00 = uri;
        this.A01 = uri2;
        C1pq.A08("reactionEmoji", str2);
        this.A04 = str2;
        this.A02 = uri3;
    }

    public ThreadThemeReactionAssetInfo(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A03 = parcel.readString();
        Uri uri = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) parcel.readParcelable(classLoader);
        }
        this.A04 = parcel.readString();
        this.A02 = parcel.readInt() != 0 ? (Uri) parcel.readParcelable(classLoader) : uri;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadThemeReactionAssetInfo)) {
                return false;
            }
            ThreadThemeReactionAssetInfo threadThemeReactionAssetInfo = (ThreadThemeReactionAssetInfo) obj;
            if (!11T.A0O(this.A03, threadThemeReactionAssetInfo.A03) || !11T.A0O(this.A00, threadThemeReactionAssetInfo.A00) || !11T.A0O(this.A01, threadThemeReactionAssetInfo.A01) || !11T.A0O(this.A04, threadThemeReactionAssetInfo.A04) || !11T.A0O(this.A02, threadThemeReactionAssetInfo.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(this.A03)))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ThreadThemeReactionAssetInfo{id=");
        A0k.append(this.A03);
        A0k.append(", keyframeAssetUri=");
        A0k.append(this.A00);
        A0k.append(", largeStaticAssetUri=");
        A0k.append(this.A01);
        A0k.append(", reactionEmoji=");
        A0k.append(this.A04);
        A0k.append(", smallStaticAssetUri=");
        A0k.append(this.A02);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        Uri uri = this.A00;
        if (uri == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri, i);
        }
        Uri uri2 = this.A01;
        if (uri2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri2, i);
        }
        parcel.writeString(this.A04);
        Uri uri3 = this.A02;
        if (uri3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri3, i);
        }
    }
}
