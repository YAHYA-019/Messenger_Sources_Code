package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchReelsMediaHashtagModel.class */
public class CowatchReelsMediaHashtagModel {
    public static 2JQ CONVERTER = IR0.A00(83);
    public static long sMcfTypeId;
    public final String hashtagId;
    public final int length;
    public final String name;
    public final int offset;

    public CowatchReelsMediaHashtagModel(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.hashtagId = str;
        this.name = str2;
        this.offset = i;
        this.length = i2;
    }

    public static native CowatchReelsMediaHashtagModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CowatchReelsMediaHashtagModel)) {
                return false;
            }
            CowatchReelsMediaHashtagModel cowatchReelsMediaHashtagModel = (CowatchReelsMediaHashtagModel) obj;
            if (this.hashtagId.equals(cowatchReelsMediaHashtagModel.hashtagId) && this.name.equals(cowatchReelsMediaHashtagModel.name) && this.offset == cowatchReelsMediaHashtagModel.offset && this.length == cowatchReelsMediaHashtagModel.length) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.name, AbstractC2326GOr.A07(this.hashtagId)) + this.offset) * 31) + this.length;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchReelsMediaHashtagModel{hashtagId=");
        A0k.append(this.hashtagId);
        A0k.append(",name=");
        A0k.append(this.name);
        A0k.append(",offset=");
        A0k.append(this.offset);
        A0k.append(",length=");
        return AbstractC2327GOs.A0W(A0k, this.length);
    }
}
