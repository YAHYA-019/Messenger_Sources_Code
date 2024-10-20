package com.facebook.messaging.sharedimage;

import X.1BK;
import X.2JX;
import X.2JY;
import X.5HP;
import X.AnonymousClass001;
import X.C0A2;
import X.C5ew;
import X.CSU;
import X.HnS;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.UserKey;

/* loaded from: SharedMedia.class */
public class SharedMedia implements MediaMessageItem, Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(43);
    public boolean A00;
    public final Message A01;
    public final MediaResource A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public SharedMedia(Message message, MediaResource mediaResource, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = true;
        this.A02 = mediaResource;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A01 = message;
        this.A07 = z;
    }

    public SharedMedia(MediaResource mediaResource, String str, String str2, String str3) {
        this(null, mediaResource, str, str2, str3, "", false);
    }

    public static Uri A00(2JX r301) {
        Uri uri;
        String A0l;
        String A0l2;
        2JY A0B = 1BK.A0B(r301, 2JX.class, -1421463617, -1365349382);
        Uri uri2 = null;
        if (A0B == null || (A0l2 = A0B.A0l()) == null) {
            uri = null;
        } else {
            try {
                uri = C0A2.A03(A0l2);
            } catch (SecurityException unused) {
                uri = null;
            }
        }
        2JY A0B2 = 1BK.A0B(r301, 2JX.class, 1048796968, 1806971141);
        if (A0B2 != null && (A0l = A0B2.A0l()) != null) {
            try {
                uri2 = C0A2.A03(A0l);
            } catch (SecurityException unused2) {
            }
        }
        if (uri != null) {
            return uri;
        }
        if (uri2 != null) {
            return uri2;
        }
        throw new RuntimeException("Animated URL from this gif is missing");
    }

    public static Uri A01(2JX r301) {
        String A0r = r301.A0r(-900783381);
        if (A0r != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(A0r);
            } catch (SecurityException unused) {
            }
            if (uri != null) {
                return uri;
            }
        }
        throw new RuntimeException("Media url is missing or invalid");
    }

    public static Uri A02(2JX r301) {
        String A0l;
        2JY A0B = 1BK.A0B(r301, 2JX.class, 734993873, -113123542);
        if (A0B != null && (A0l = A0B.A0l()) != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(A0l);
            } catch (SecurityException unused) {
            }
            if (uri != null) {
                return uri;
            }
        }
        throw new RuntimeException("Thumbnail from this media URL is missing or invalid");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x049d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.messaging.sharedimage.SharedMedia A03(com.facebook.messaging.model.threadkey.ThreadKey r301, X.C5fv r302, int r303) {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharedimage.SharedMedia.A03(com.facebook.messaging.model.threadkey.ThreadKey, X.5fv, int):com.facebook.messaging.sharedimage.SharedMedia");
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public void AEz(Context context, HnS hnS) {
        hnS.A00(this.A07);
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public Uri AqA() {
        return this.A02.A0E;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public String Aw7() {
        return this.A02.A02();
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public MediaResource AwL() {
        return this.A02;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public String Awv() {
        return this.A05;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public Message Ax8() {
        return this.A01;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public int B0a() {
        return this.A02.A00;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public int B0d() {
        return this.A02.A04;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public String BAM() {
        return this.A04;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public UserKey BAN() {
        ParticipantInfo participantInfo;
        Message message = this.A01;
        if (message != null && (participantInfo = message.A0K) != null) {
            return participantInfo.A0F;
        }
        String str = this.A03;
        if (str == null) {
            return null;
        }
        return 1BK.A0X(str);
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public Uri BFd() {
        return this.A02.A0D;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public MediaResource BIJ() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.C5g1.A01(r0) == false) goto L6;
     */
    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BQR() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.model.messages.Message r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r302
            boolean r0 = X.C5g1.A01(r0)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharedimage.SharedMedia.BQR():boolean");
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BSu() {
        return this.A00;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BTC() {
        return AnonymousClass001.A1W(this.A02.A0P, C5ew.HD);
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BUo() {
        return AnonymousClass001.A1W(this.A02.A0Q, 5HP.A0F);
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BW5(Context context) {
        return this.A07;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public void Cp4(boolean z) {
        this.A00 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String A02;
        if (!(obj instanceof SharedMedia)) {
            return false;
        }
        MediaResource mediaResource = ((SharedMedia) obj).A02;
        String A022 = mediaResource.A02();
        return (A022 == null || (A02 = this.A02.A02()) == null) ? mediaResource.A0E.equals(this.A02.A0E) : A022.equals(A02);
    }

    public int hashCode() {
        return this.A02.A02().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A07 ? 1 : 0);
    }
}
