package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchAddMediaDialogPrefetchModel.class */
public class CowatchAddMediaDialogPrefetchModel {
    public static 2JQ CONVERTER = IR0.A00(59);
    public static long sMcfTypeId;
    public final ArrayList logs;
    public final int pageToPrefetch;

    public CowatchAddMediaDialogPrefetchModel(ArrayList arrayList, int i) {
        arrayList.getClass();
        this.logs = arrayList;
        this.pageToPrefetch = i;
    }

    public static native CowatchAddMediaDialogPrefetchModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CowatchAddMediaDialogPrefetchModel)) {
                return false;
            }
            CowatchAddMediaDialogPrefetchModel cowatchAddMediaDialogPrefetchModel = (CowatchAddMediaDialogPrefetchModel) obj;
            if (this.logs.equals(cowatchAddMediaDialogPrefetchModel.logs) && this.pageToPrefetch == cowatchAddMediaDialogPrefetchModel.pageToPrefetch) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2327GOs.A08(this.logs) + this.pageToPrefetch;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchAddMediaDialogPrefetchModel{logs=");
        A0k.append(this.logs);
        A0k.append(",pageToPrefetch=");
        return AbstractC2327GOs.A0W(A0k, this.pageToPrefetch);
    }
}
