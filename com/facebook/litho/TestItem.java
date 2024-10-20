package com.facebook.litho;

import X.0QD;
import X.0QU;
import X.11T;
import X.AnonymousClass001;
import X.C2ku;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: TestItem.class */
public final class TestItem {
    public ComponentHost A00;
    public Object A01;
    public String A02;
    public final Rect A03 = new Rect();
    public final AcquireKey A04 = new Object();

    public final AcquireKey getAcquireKey() {
        return this.A04;
    }

    public final Rect getBounds() {
        return this.A03;
    }

    public final ComponentHost getHost() {
        return this.A00;
    }

    public final String getTestKey() {
        return this.A02;
    }

    public final String getTextContent() {
        List A03 = 11T.A03(this.A01);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : A03) {
            if (obj instanceof TextContent) {
                A0s.add(obj);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            0QU.A0t(C2ku.A02(it.next()), A0s2);
        }
        return 0QD.A0K(", ", "", "", A0s2, (Function1) null, -1);
    }
}
