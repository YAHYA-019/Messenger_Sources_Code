package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zN;
import X.AnonymousClass001;
import X.C04v;
import X.DKB;
import com.facebook.acra.constants.ActionId;

/* loaded from: ImagineRawData.class */
public final class ImagineRawData extends C04v {
    public final String mediaType;
    public final String prompt;
    public final String requestId;
    public final String responseId;
    public final String temporaryHandle;
    public final String uri;

    public ImagineRawData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.mediaType = str;
        this.prompt = str2;
        this.uri = str3;
        this.temporaryHandle = str4;
        this.requestId = str5;
        this.responseId = str6;
    }

    public static /* synthetic */ ImagineRawData copy$default(ImagineRawData imagineRawData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str6;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        if ((i & 1) != 0) {
            str12 = imagineRawData.mediaType;
        }
        if ((i & 2) != 0) {
            str11 = imagineRawData.prompt;
        }
        if ((i & 4) != 0) {
            str10 = imagineRawData.uri;
        }
        if ((i & 8) != 0) {
            str9 = imagineRawData.temporaryHandle;
        }
        if ((i & 16) != 0) {
            str8 = imagineRawData.requestId;
        }
        if ((i & 32) != 0) {
            str7 = imagineRawData.responseId;
        }
        return new ImagineRawData(str12, str11, str10, str9, str8, str7);
    }

    public final String component1() {
        return this.mediaType;
    }

    public final String component2() {
        return this.prompt;
    }

    public final String component3() {
        return this.uri;
    }

    public final String component4() {
        return this.temporaryHandle;
    }

    public final String component5() {
        return this.requestId;
    }

    public final String component6() {
        return this.responseId;
    }

    public final ImagineRawData copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ImagineRawData(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ImagineRawData)) {
                return false;
            }
            ImagineRawData imagineRawData = (ImagineRawData) obj;
            if (!11T.A0O(this.mediaType, imagineRawData.mediaType) || !11T.A0O(this.prompt, imagineRawData.prompt) || !11T.A0O(this.uri, imagineRawData.uri) || !11T.A0O(this.temporaryHandle, imagineRawData.temporaryHandle) || !11T.A0O(this.requestId, imagineRawData.requestId) || !11T.A0O(this.responseId, imagineRawData.responseId)) {
                return false;
            }
        }
        return true;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getResponseId() {
        return this.responseId;
    }

    public final String getTemporaryHandle() {
        return this.temporaryHandle;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((((1BL.A05(this.mediaType) * 31) + 1BL.A05(this.prompt)) * 31) + 1BL.A05(this.uri)) * 31) + 1BL.A05(this.temporaryHandle)) * 31) + 1BL.A05(this.requestId)) * 31) + 7zN.A05(this.responseId);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImagineRawData(mediaType=");
        A0k.append(this.mediaType);
        A0k.append(", prompt=");
        A0k.append(this.prompt);
        A0k.append(", uri=");
        A0k.append(this.uri);
        A0k.append(", temporaryHandle=");
        A0k.append(this.temporaryHandle);
        A0k.append(DKB.A00(11));
        A0k.append(this.requestId);
        A0k.append(DKB.A00(ActionId.ON_ATTACH_FRAGMENT));
        A0k.append(this.responseId);
        return 4YV.A0x(A0k);
    }
}
