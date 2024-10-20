package com.facebook.messaging.photos.view;

import X.0fH;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Bu;
import X.AG7;
import X.AnonymousClass472;
import X.C1z1;
import X.C5g1;
import X.CSS;
import X.HnS;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.concurrent.Executor;

/* loaded from: VideoMessageItem.class */
public final class VideoMessageItem implements MediaMessageItem {
    public static final Parcelable.Creator CREATOR = new CSS(12);
    public MediaResource A00;
    public boolean A01;
    public final VideoAttachmentData A02;
    public final Message A03;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r306 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public VideoMessageItem(com.facebook.messaging.attachments.VideoAttachmentData r302, com.facebook.messaging.model.messages.Message r303) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.photos.view.VideoMessageItem.<init>(com.facebook.messaging.attachments.VideoAttachmentData, com.facebook.messaging.model.messages.Message):void");
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public void AEz(Context context, HnS hnS) {
        11T.A0F(context, 0);
        ((Executor) 1Bq.A00(16457).get()).execute(new AG7(1Bu.A01(context, 67579), hnS, this));
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public Uri AqA() {
        Uri uri = this.A00.A0E;
        11T.A09(uri);
        return uri;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public String Aw7() {
        return this.A00.A02();
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public MediaResource AwL() {
        return this.A00;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public String Awv() {
        return this.A03.A1V;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public Message Ax8() {
        return this.A03;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public int B0a() {
        return this.A02.A08;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public int B0d() {
        return this.A02.A0C;
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
            com.facebook.messaging.model.messages.Message r0 = r0.A03
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.photos.view.VideoMessageItem.BAM():java.lang.String");
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public UserKey BAN() {
        UserKey userKey;
        ParticipantInfo participantInfo = this.A03.A0K;
        if (participantInfo == null || (userKey = participantInfo.A0F) == null) {
            throw 1BK.A0h();
        }
        return userKey;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public Uri BFd() {
        return this.A02.A0F;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public MediaResource BIJ() {
        return this.A02.A0I;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BQR() {
        return C5g1.A01(this.A03);
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BSu() {
        return this.A01;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BTC() {
        return false;
    }

    @Override // com.facebook.messaging.photos.service.MediaMessageItem
    public boolean BUo() {
        return false;
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
        this.A01 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A00, i);
    }
}
