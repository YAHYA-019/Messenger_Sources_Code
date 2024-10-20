package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: L4k.class */
public final class L4k {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public Rect A05;
    public C00p A06;
    public 0AE A07;
    public List A08;
    public List A09;
    public java.util.Map A0A;
    public java.util.Map A0B;
    public java.util.Map A0C;
    public final Kii A0D = new Kii();
    public final HashSet A0E = AnonymousClass001.A0v();
    public int A04 = 0;

    public static float A00(L4k l4k) {
        return ((l4k.A00 - l4k.A03) / l4k.A01) * 1000.0f;
    }

    public java.util.Map A01() {
        float f = DKD.A08().density;
        if (f != this.A02) {
            Iterator A0y = AnonymousClass001.A0y(this.A0B);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                java.util.Map map = this.A0B;
                Object key = A0z.getKey();
                KlL klL = (KlL) A0z.getValue();
                float f2 = this.A02 / f;
                KlL klL2 = new KlL(klL.A05, (int) (klL.A02 * f2), klL.A04, (int) (klL.A01 * f2), klL.A03);
                Bitmap bitmap = klL.A00;
                if (bitmap != null) {
                    int i = klL2.A02;
                    int i2 = klL2.A01;
                    0gF.A00(bitmap);
                    klL2.A00 = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(key, klL2);
            }
        }
        this.A02 = f;
        return this.A0B;
    }

    public void A02(String str) {
        Hv6.A00(str);
        this.A0E.add(str);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("LottieComposition:\n");
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            A0o.append(((Ks8) it.next()).A00("\t"));
        }
        return A0o.toString();
    }
}
