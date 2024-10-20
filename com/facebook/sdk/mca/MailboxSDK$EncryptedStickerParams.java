package com.facebook.sdk.mca;

/* loaded from: MailboxSDK$EncryptedStickerParams.class */
public class MailboxSDK$EncryptedStickerParams {
    public final String contentHash;
    public final String downloadURL;
    public final Number height;
    public final String mimeType;
    public final String providerId;
    public final String stickerId;
    public String stickerMustacheText;
    public final Number width;

    public MailboxSDK$EncryptedStickerParams(String str, String str2, String str3, String str4, String str5, Number number, Number number2) {
        this.stickerId = str;
        this.providerId = str2;
        this.downloadURL = str3;
        this.contentHash = str4;
        this.mimeType = str5;
        this.height = number;
        this.width = number2;
    }
}
