package com.google.android.play.core.splitinstall;

import X.0FI;
import X.3NT;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: zzbe.class */
public final class zzbe extends zzbh {
    @Override // com.google.android.play.core.splitinstall.zzbh, com.google.android.play.core.splitinstall.internal.zzbq
    public final void DD7(List list) {
        int A03 = 0FI.A03(2119863800);
        super.DD7(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(3NT.A00((Bundle) it.next()));
        }
        this.A00.A03(arrayList);
        0FI.A09(357027513, A03);
    }
}
