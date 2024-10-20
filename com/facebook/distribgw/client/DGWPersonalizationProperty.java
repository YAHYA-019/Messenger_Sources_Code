package com.facebook.distribgw.client;

import X.1BL;
import X.AnonymousClass001;

/* loaded from: DGWPersonalizationProperty.class */
public class DGWPersonalizationProperty {
    public final int DEFAULT;
    public final int HIGH;
    public final int LOW;
    public final int MID;

    public DGWPersonalizationProperty(int i, int i2, int i3, int i4) {
        this.HIGH = i;
        this.MID = i2;
        this.LOW = i3;
        this.DEFAULT = i4;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{");
        A0k.append("HIGH:");
        A0k.append(this.HIGH);
        A0k.append(",MID:");
        A0k.append(this.MID);
        A0k.append(",LOW:");
        A0k.append(this.LOW);
        A0k.append(",DEFAULT:");
        A0k.append(this.DEFAULT);
        return 1BL.A0v(A0k);
    }
}
