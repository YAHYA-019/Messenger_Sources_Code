package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: CowatchLoggingModel.class */
public class CowatchLoggingModel {
    public static 2JQ CONVERTER = IR0.A00(73);
    public static long sMcfTypeId;
    public final int action;
    public final Map extraInfo;
    public final String source;
    public final String trace;
    public final String videoId;

    public CowatchLoggingModel(int i, String str, String str2, String str3, Map map) {
        this.action = i;
        this.source = str;
        this.trace = str2;
        this.videoId = str3;
        this.extraInfo = map;
    }

    public static native CowatchLoggingModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchLoggingModel)) {
                return false;
            }
            CowatchLoggingModel cowatchLoggingModel = (CowatchLoggingModel) obj;
            if (this.action != cowatchLoggingModel.action) {
                return false;
            }
            String str = this.source;
            String str2 = cowatchLoggingModel.source;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.trace;
            String str4 = cowatchLoggingModel.trace;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.videoId;
            String str6 = cowatchLoggingModel.videoId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            Map map = this.extraInfo;
            Map map2 = cowatchLoggingModel.extraInfo;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A03 = (((((AbstractC2326GOr.A03(this.action) + 1BL.A05(this.source)) * 31) + 1BL.A05(this.trace)) * 31) + 1BL.A05(this.videoId)) * 31;
        Map map = this.extraInfo;
        if (map != null) {
            i = map.hashCode();
        }
        return A03 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchLoggingModel{action=");
        A0k.append(this.action);
        A0k.append(",source=");
        A0k.append(this.source);
        A0k.append(",trace=");
        A0k.append(this.trace);
        A0k.append(",videoId=");
        A0k.append(this.videoId);
        A0k.append(",extraInfo=");
        return AbstractC2327GOs.A0U(this.extraInfo, A0k);
    }
}
