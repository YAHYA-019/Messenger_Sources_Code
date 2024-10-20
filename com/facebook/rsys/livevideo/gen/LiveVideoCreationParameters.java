package com.facebook.rsys.livevideo.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: LiveVideoCreationParameters.class */
public class LiveVideoCreationParameters {
    public static 2JQ CONVERTER = LVi.A00(21);
    public static long sMcfTypeId;
    public final int audience;
    public final boolean autoStart;
    public final ArrayList friendsList;
    public final String funnelSessionId;
    public final ArrayList shareSurfaces;
    public final int target;
    public final String targetId;
    public final String title;

    public LiveVideoCreationParameters(int i, int i2, String str, ArrayList arrayList, String str2, String str3, boolean z, ArrayList arrayList2) {
        str.getClass();
        str3.getClass();
        this.audience = i;
        this.target = i2;
        this.targetId = str;
        this.friendsList = arrayList;
        this.title = str2;
        this.funnelSessionId = str3;
        this.autoStart = z;
        this.shareSurfaces = arrayList2;
    }

    public static native LiveVideoCreationParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveVideoCreationParameters)) {
                return false;
            }
            LiveVideoCreationParameters liveVideoCreationParameters = (LiveVideoCreationParameters) obj;
            if (this.audience != liveVideoCreationParameters.audience || this.target != liveVideoCreationParameters.target || !this.targetId.equals(liveVideoCreationParameters.targetId)) {
                return false;
            }
            ArrayList arrayList = this.friendsList;
            ArrayList arrayList2 = liveVideoCreationParameters.friendsList;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            String str = this.title;
            String str2 = liveVideoCreationParameters.title;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.funnelSessionId.equals(liveVideoCreationParameters.funnelSessionId) || this.autoStart != liveVideoCreationParameters.autoStart) {
                return false;
            }
            ArrayList arrayList3 = this.shareSurfaces;
            ArrayList arrayList4 = liveVideoCreationParameters.shareSurfaces;
            if (arrayList3 == null) {
                if (arrayList4 != null) {
                    return false;
                }
            } else if (!arrayList3.equals(arrayList4)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.funnelSessionId, (((AnonymousClass002.A07(this.targetId, (AbstractC2326GOr.A03(this.audience) + this.target) * 31) + AnonymousClass001.A02(this.friendsList)) * 31) + 1BL.A05(this.title)) * 31) + (this.autoStart ? 1 : 0)) * 31) + 4YU.A03(this.shareSurfaces);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LiveVideoCreationParameters{audience=");
        A0k.append(this.audience);
        A0k.append(",target=");
        A0k.append(this.target);
        A0k.append(",targetId=");
        A0k.append(this.targetId);
        A0k.append(",friendsList=");
        A0k.append(this.friendsList);
        A0k.append(",title=");
        A0k.append(this.title);
        A0k.append(",funnelSessionId=");
        A0k.append(this.funnelSessionId);
        A0k.append(",autoStart=");
        A0k.append(this.autoStart);
        A0k.append(",shareSurfaces=");
        return AbstractC2327GOs.A0U(this.shareSurfaces, A0k);
    }
}
