package X;

import java.io.Serializable;

/* loaded from: D54.class */
public final class D54 implements Serializable {
    public final java.util.Map mApiParams;
    public final String mAttachmentCaption;
    public final String mExpectedResponseDataKey;
    public final String mNamespace;
    public final boolean mSendMessageByServer;
    public final boolean mUploadOriginalMedia;
    public final H9I mUploadType;

    public D54(H9I h9i, String str, String str2, String str3, boolean z, boolean z2) {
        this.mUploadType = h9i;
        this.mNamespace = str;
        this.mExpectedResponseDataKey = str2;
        this.mSendMessageByServer = z;
        this.mAttachmentCaption = str3;
        this.mUploadOriginalMedia = z2;
        this.mApiParams = AnonymousClass001.A0u();
    }

    public D54(H9I h9i, String str, String str2, boolean z) {
        this(h9i, str, "media_id", str2, z, false);
    }
}
