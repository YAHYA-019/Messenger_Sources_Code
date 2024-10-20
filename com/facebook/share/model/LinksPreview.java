package com.facebook.share.model;

import X.0fH;
import X.1BL;
import X.24X;
import X.2LD;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass243;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: LinksPreview.class */
public class LinksPreview implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(12);
    public final String caption;
    public final String description;
    public final String href;
    public final List media;
    public final MisinformationData misinformationData;
    public final String name;
    public final Map properties;
    public final String shareScrapeData;

    /* loaded from: LinksPreview$Media.class */
    public class Media implements Parcelable {
        public static final Parcelable.Creator CREATOR = new FKe(13);
        public final String artist;
        public final int height;
        public final String previewImage;
        public final String src;
        public final String type;
        public final int width;

        public Media() {
            this.type = null;
            this.src = null;
            this.previewImage = null;
            this.artist = null;
            this.width = 0;
            this.height = 0;
        }

        public Media(Parcel parcel) {
            this.type = parcel.readString();
            this.src = parcel.readString();
            this.previewImage = parcel.readString();
            this.artist = parcel.readString();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
        }

        public Media(String str) {
            this.type = "image";
            this.src = str;
            this.previewImage = null;
            this.artist = null;
            this.width = 0;
            this.height = 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return this.src;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.src);
            parcel.writeString(this.previewImage);
            parcel.writeString(this.artist);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    /* loaded from: LinksPreview$MisinformationAction.class */
    public class MisinformationAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = new FKe(14);
        public final String actionType;
        public final String subtitle;
        public final String title;
        public final String uri;

        public MisinformationAction() {
            this.actionType = null;
            this.uri = null;
            this.title = null;
            this.subtitle = null;
        }

        public MisinformationAction(Parcel parcel) {
            this.actionType = parcel.readString();
            this.uri = parcel.readString();
            this.title = parcel.readString();
            this.subtitle = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.actionType);
            parcel.writeString(this.uri);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
    }

    /* loaded from: LinksPreview$MisinformationData.class */
    public class MisinformationData implements Parcelable {
        public static final Parcelable.Creator CREATOR = new FKe(15);
        public final ImmutableList actions;
        public final String alertDescription;
        public final String ctaText;
        public final String disputeFormUri;
        public final String disputeText;
        public final String linkType;
        public final String reshareAlertTitle;
        public final String subtitle;
        public final String title;
        public final String url;

        public MisinformationData() {
            this.title = null;
            this.url = null;
            this.linkType = null;
            this.subtitle = null;
            this.ctaText = null;
            this.alertDescription = null;
            this.reshareAlertTitle = null;
            this.disputeText = null;
            this.disputeFormUri = null;
            this.actions = ImmutableList.of();
        }

        public MisinformationData(Parcel parcel) {
            this.title = parcel.readString();
            this.url = parcel.readString();
            this.linkType = parcel.readString();
            this.subtitle = parcel.readString();
            this.ctaText = parcel.readString();
            this.alertDescription = parcel.readString();
            this.reshareAlertTitle = parcel.readString();
            this.disputeText = parcel.readString();
            this.disputeFormUri = parcel.readString();
            Parcelable.Creator creator = MisinformationAction.CREATOR;
            ArrayList A0s = AnonymousClass001.A0s();
            parcel.readTypedList(A0s, creator);
            this.actions = ImmutableList.copyOf((Collection) A0s);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.url);
            parcel.writeString(this.linkType);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.ctaText);
            parcel.writeString(this.alertDescription);
            parcel.writeString(this.reshareAlertTitle);
            parcel.writeString(this.disputeText);
            parcel.writeString(this.disputeFormUri);
            parcel.writeTypedList(this.actions);
        }
    }

    public LinksPreview() {
        this.href = null;
        this.name = null;
        this.caption = null;
        this.description = null;
        this.media = Collections.emptyList();
        this.misinformationData = null;
        this.properties = Collections.emptyMap();
        this.shareScrapeData = null;
    }

    public LinksPreview(Parcel parcel) {
        this.href = parcel.readString();
        this.name = parcel.readString();
        this.caption = parcel.readString();
        this.description = parcel.readString();
        this.media = 4YV.A0y(parcel, Media.class);
        this.misinformationData = (MisinformationData) 1BL.A0C(parcel, MisinformationData.class);
        this.properties = parcel.readHashMap(String.class.getClassLoader());
        this.shareScrapeData = parcel.readString();
    }

    public LinksPreview(String str, String str2, String str3, String str4, List list, Map map) {
        this.href = str;
        this.name = str2;
        this.caption = str3;
        this.description = str4;
        this.media = list;
        this.misinformationData = null;
        this.properties = map;
        this.shareScrapeData = null;
    }

    public String A00() {
        List list = this.media;
        String str = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Media media = (Media) it.next();
                String str2 = media.type;
                if ("image".equals(str2)) {
                    str = media.src;
                    break;
                }
                if ("song".equals(str2)) {
                    String str3 = media.previewImage;
                    if (!Platform.stringIsNullOrEmpty(str3)) {
                        return str3;
                    }
                }
            }
        }
        return str;
    }

    public String A01() {
        String str;
        if (this.shareScrapeData != null) {
            AnonymousClass243 A00 = AnonymousClass243.A00();
            try {
                24X A0D = A00.A0I(this.shareScrapeData).A0D("share_params");
                if (A0D == null) {
                    return A00();
                }
                24X A0D2 = A0D.A0D("external_img");
                if (A0D2 == null) {
                    return A00();
                }
                24X A0D3 = A00.A0I(A0D2.A0H()).A0D("src");
                if (A0D3 != null) {
                    return A0D3.A0H();
                }
            } catch (2LD e) {
                e = e;
                str = "Unexpected error when processing json object: %s";
                0fH.A0s("LinksPreview", str, e);
                return A00();
            } catch (IOException e2) {
                e = e2;
                str = "Unexpected IO error: %s";
                0fH.A0s("LinksPreview", str, e);
                return A00();
            }
        }
        return A00();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.href);
        parcel.writeString(this.name);
        parcel.writeString(this.caption);
        parcel.writeString(this.description);
        parcel.writeList(this.media);
        parcel.writeParcelable(this.misinformationData, i);
        parcel.writeMap(this.properties);
        parcel.writeString(this.shareScrapeData);
    }
}
