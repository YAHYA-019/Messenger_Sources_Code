package com.facebook.rsys.cowatchad.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchAdModel.class */
public class CowatchAdModel {
    public static 2JQ CONVERTER = IR0.A00(90);
    public static long sMcfTypeId;
    public final CowatchAdBreak adBreak;
    public final boolean canPlayAds;
    public final CowatchAd currentAd;
    public final ArrayList insertionPoints;
    public final String mediaID;

    public CowatchAdModel(boolean z, String str, ArrayList arrayList, CowatchAdBreak cowatchAdBreak, CowatchAd cowatchAd) {
        arrayList.getClass();
        this.canPlayAds = z;
        this.mediaID = str;
        this.insertionPoints = arrayList;
        this.adBreak = cowatchAdBreak;
        this.currentAd = cowatchAd;
    }

    public static native CowatchAdModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAdModel)) {
                return false;
            }
            CowatchAdModel cowatchAdModel = (CowatchAdModel) obj;
            if (this.canPlayAds != cowatchAdModel.canPlayAds) {
                return false;
            }
            String str = this.mediaID;
            String str2 = cowatchAdModel.mediaID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.insertionPoints.equals(cowatchAdModel.insertionPoints)) {
                return false;
            }
            CowatchAdBreak cowatchAdBreak = this.adBreak;
            CowatchAdBreak cowatchAdBreak2 = cowatchAdModel.adBreak;
            if (cowatchAdBreak == null) {
                if (cowatchAdBreak2 != null) {
                    return false;
                }
            } else if (!cowatchAdBreak.equals(cowatchAdBreak2)) {
                return false;
            }
            CowatchAd cowatchAd = this.currentAd;
            CowatchAd cowatchAd2 = cowatchAdModel.currentAd;
            if (cowatchAd == null) {
                if (cowatchAd2 != null) {
                    return false;
                }
            } else if (!cowatchAd.equals(cowatchAd2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.insertionPoints, (AbstractC2326GOr.A03(this.canPlayAds ? 1 : 0) + 1BL.A05(this.mediaID)) * 31) + AnonymousClass001.A02(this.adBreak)) * 31) + 4YU.A03(this.currentAd);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAdModel{canPlayAds=");
        A0k.append(this.canPlayAds);
        A0k.append(",mediaID=");
        A0k.append(this.mediaID);
        A0k.append(",insertionPoints=");
        A0k.append(this.insertionPoints);
        A0k.append(",adBreak=");
        A0k.append(this.adBreak);
        A0k.append(",currentAd=");
        return AbstractC2327GOs.A0U(this.currentAd, A0k);
    }
}
