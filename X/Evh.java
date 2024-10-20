package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: Evh.class */
public final class Evh {
    public FG6 A00;
    public F3b A01;
    public final Eta A02;
    public final Emk A03;
    public final Emk A04;
    public final F3d A05;
    public final java.util.Map A0A;
    public final java.util.Map A0B;
    public final Set A0D;
    public final GHD A0E;
    public final String A0F;
    public final List A07 = AnonymousClass001.A0s();
    public final java.util.Map A09 = AnonymousClass001.A0u();
    public final HashMap A06 = AnonymousClass001.A0u();
    public final java.util.Map A0C = AnonymousClass001.A0u();
    public final List A08 = AnonymousClass001.A0s();

    public Evh(FG6 fg6, Eta eta, Eqa eqa, F3b f3b, F3d f3d, GHD ghd, String str, java.util.Map map) {
        this.A0E = ghd;
        this.A0A = map;
        this.A01 = f3b;
        this.A0F = str;
        this.A00 = fg6;
        this.A02 = eta;
        this.A05 = f3d;
        if (eqa == null) {
            this.A04 = new Emk(null);
            this.A03 = new Emk(null);
            this.A0B = Collections.emptyMap();
            return;
        }
        Emk emk = eqa.A00;
        this.A04 = new Emk(emk);
        this.A03 = emk;
        this.A0B = eqa.A07;
        this.A0D = AnonymousClass001.A0v();
        Iterator A0y = AnonymousClass001.A0y(eqa.A06);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            if (!EYO.A00(A0z.getValue(), fg6.A08.get(key))) {
                this.A0D.add(key);
            }
        }
    }

    public FHh A00(DLQ dlq, GJ5 gj5, GJj gJj) {
        List list = dlq.A0A;
        java.util.Map map = this.A09;
        FG6 fg6 = this.A00;
        java.util.Map map2 = this.A0C;
        GHD ghd = this.A0E;
        return new FHh((GJy) null, (FyG) null, (FyG) null, fg6, gj5, this.A01, gJj, ghd, 0S2.A00, this.A0F, (String) null, list, map, map2);
    }
}
