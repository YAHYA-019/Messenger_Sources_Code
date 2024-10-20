package X;

import android.net.Uri;
import com.facebook.messaging.montage.model.art.ArtItem;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Gec, reason: case insensitive filesystem */
/* loaded from: Gec.class */
public final class C2481Gec extends 1RM {
    public final HTI A00;
    public final /* synthetic */ IQQ A01;

    public C2481Gec(HTI hti, IQQ iqq) {
        this.A01 = iqq;
        this.A00 = hti;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v93, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.net.Uri] */
    public /* bridge */ /* synthetic */ void A02(Object obj) {
        Object obj2;
        GhT A0u;
        String A0l;
        String A0l2;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null) {
            A03(new Throwable());
            return;
        }
        2JY r0 = (JP4) obj2;
        String A0k = r0.A0k();
        ArtItem artItem = null;
        if (A0k != null) {
            2JY BFa = r0.BFa();
            if (BFa != null && (A0l2 = BFa.A0l()) != null) {
                try {
                    artItem = C0A2.A03(A0l2);
                } catch (SecurityException unused) {
                }
            }
            ImmutableList.Builder builder = ImmutableList.builder();
            C2567Ghg BCX = r0.BCX();
            11T.A0I(BCX, "null cannot be cast to non-null type com.facebook.messaging.montage.graphql.FetchMontageArtPickerQueryInterfaces.MessengerMontageArtPickerMontageSticker.StickerStyles");
            ImmutableList A0u2 = BCX.A0u();
            if (A0u2 != null) {
                1Du it = A0u2.iterator();
                while (it.hasNext()) {
                    C2565Ghe A0u3 = ((C2566Ghf) it.next()).A0u();
                    if (A0u3 != null && (A0u = A0u3.A0u()) != null && (A0l = A0u.A0l()) != null) {
                        11T.A0I(A0u3, "null cannot be cast to non-null type com.facebook.messaging.montage.graphql.FetchMontageArtPickerQueryInterfaces.MessengerMontageArtPickerMontageSticker.StickerStyles.Edges.Node");
                        try {
                            Uri A03 = C0A2.A03(A0l);
                            if (A03 != null) {
                                String A0r = A0u.A0r(-196041627);
                                boolean z = true;
                                if (!"image/gif".equalsIgnoreCase(A0r) && !"image/webp".equalsIgnoreCase(A0r)) {
                                    z = false;
                                }
                                builder.m11011add((Object) new Hg3(A03, AbH.A01(A0u), GOo.A05(A0u), z));
                            }
                        } catch (SecurityException unused2) {
                        }
                    }
                }
            }
            Hav hav = new Hav(artItem, builder.build());
            HkK hkK = new HkK();
            hkK.A0E = A0k;
            hkK.A04 = hav;
            artItem = new ArtItem(hkK);
        }
        IQQ iqq = this.A01;
        4YV.A11(iqq.A04).execute(new J0R(this, iqq, artItem));
    }

    public void A03(Throwable th) {
        11T.A0F(th, 0);
        IQQ iqq = this.A01;
        4YV.A11(iqq.A04).execute(new J0Q(this, iqq, th));
    }
}
