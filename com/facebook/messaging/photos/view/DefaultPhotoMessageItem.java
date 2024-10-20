package com.facebook.messaging.photos.view;

import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Bu;
import X.AG6;
import X.AnonymousClass001;
import X.AnonymousClass472;
import X.C1z1;
import X.C5g1;
import X.C7t8;
import X.CSS;
import X.HnS;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.concurrent.Executor;

/* loaded from: DefaultPhotoMessageItem.class */
public final class DefaultPhotoMessageItem implements MediaMessageItem, Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(11);
    public boolean A00;
    public final ImageAttachmentData A01;
    public final Message A02;
    public final MediaResource A03;

    public DefaultPhotoMessageItem(Parcel parcel) {
        this.A00 = true;
        Parcelable A0C = 1BL.A0C(parcel, ImageAttachmentData.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = (ImageAttachmentData) A0C;
        Parcelable A0C2 = 1BL.A0C(parcel, MediaResource.class);
        if (A0C2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = (MediaResource) A0C2;
        Parcelable A0C3 = 1BL.A0C(parcel, Message.class);
        if (A0C3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = (Message) A0C3;
    }

    public DefaultPhotoMessageItem(ImageAttachmentData imageAttachmentData, Message message) {
        11T.A0G(imageAttachmentData, 1, message);
        this.A00 = true;
        this.A01 = imageAttachmentData;
        this.A02 = message;
        this.A03 = C7t8.A00(imageAttachmentData, message);
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public void AEz(Context context, HnS hnS) {
        11T.A0F(context, 0);
        ((Executor) 1Bq.A00(16457).get()).execute(new AG6(1Bu.A01(context, 67579), hnS, this));
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public Uri AqA() {
        Uri uri = this.A03.A0E;
        11T.A09(uri);
        return uri;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public String Aw7() {
        return this.A03.A02();
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public MediaResource AwL() {
        return this.A03;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public String Awv() {
        return this.A02.A1V;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public Message Ax8() {
        return this.A02;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public int B0a() {
        return this.A01.A02;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public int B0d() {
        return this.A01.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r302 == null) goto L8;
     */
    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String BAM() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.model.messages.Message r0 = r0.A02
            com.facebook.messaging.model.messages.ParticipantInfo r0 = r0.A0K
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            com.facebook.secure.secrettypes.SecretString r0 = r0.A09
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            r0 = r302
            java.lang.String r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L21
        L1e:
            java.lang.String r0 = ""
            r302 = r0
        L21:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.photos.view.DefaultPhotoMessageItem.BAM():java.lang.String");
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public UserKey BAN() {
        UserKey userKey;
        ParticipantInfo participantInfo = this.A02.A0K;
        if (participantInfo == null || (userKey = participantInfo.A0F) == null) {
            throw 1BK.A0h();
        }
        return userKey;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public Uri BFd() {
        return this.A03.A0D;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public MediaResource BIJ() {
        return this.A01.A09;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BQR() {
        return C5g1.A01(this.A02);
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BSu() {
        return this.A00;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BTC() {
        return false;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BUo() {
        return true;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BW5(Context context) {
        11T.A0F(context, 0);
        boolean z = false;
        try {
            User user = (User) ((AnonymousClass472) 1Bn.A0E(context, (1BY) null, 67579)).A00(BAN()).A00().get();
            if (user == null) {
                return false;
            }
            if (user.A02() != C1z1.NOT_BLOCKED) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            0fH.A0s("DefaultPhotoMessageItem", "Failed OpFetchUserByKey", e);
            return false;
        }
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public void Cp4(boolean z) {
        this.A00 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
    }
}
