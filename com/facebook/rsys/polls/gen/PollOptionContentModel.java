package com.facebook.rsys.polls.gen;

import X.0Pz;
import X.1BL;
import X.2JQ;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: PollOptionContentModel.class */
public class PollOptionContentModel {
    public static 2JQ CONVERTER = LVi.A00(42);
    public static long sMcfTypeId;
    public final String text;

    public PollOptionContentModel(String str) {
        this.text = str;
    }

    public static native PollOptionContentModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollOptionContentModel)) {
                return false;
            }
            String str = this.text;
            String str2 = ((PollOptionContentModel) obj).text;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 527 + 1BL.A05(this.text);
    }

    public String toString() {
        return 0Pz.A0j("PollOptionContentModel{text=", this.text, "}");
    }
}
