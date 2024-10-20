package X;

import android.net.Uri;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: Hz6.class */
public final class Hz6 {
    public 1BY A00;
    public final 1GU A02 = AbI.A0A();
    public final C01s A01 = 1BL.A0I();
    public final 5HV A03 = GOp.A0z();
    public final Hom A04 = (Hom) 1Bn.A0B(116351);

    public Hz6(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static MediaResource A00(Uri uri, Hz6 hz6, Hk8 hk8, String str) {
        C5en A00 = C5en.A00();
        A00.A0E = uri;
        A00.A0P = 5HP.A0F;
        A00.A0N = hk8.A04;
        A00.A0V = hk8.A07;
        A00.A0a = Integer.valueOf(hk8.A00);
        A00.A0o = hk8.A0A;
        A00.A0n = hk8.A09;
        A00.A0U = hk8.A06;
        A00.A0M = hk8.A03;
        A00.A0h = hk8.A08;
        String valueOf = String.valueOf(false);
        String A002 = DKB.A00(428);
        java.util.Map map = A00.A0v;
        if (map == null) {
            map = AnonymousClass001.A0u();
            A00.A0v = map;
        }
        map.put(A002, valueOf);
        String str2 = hk8.A0B;
        java.util.Map map2 = A00.A0v;
        if (map2 == null) {
            map2 = AnonymousClass001.A0u();
            A00.A0v = map2;
        }
        map2.put("device_orientation", str2);
        A00.A0q = str;
        A00.A0O = hk8.A05;
        hz6.A03.A0B(A00);
        return 4YU.A0Y(A00);
    }
}
