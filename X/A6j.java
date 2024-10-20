package X;

import com.facebook.stickers.model.Sticker;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: A6j.class */
public final class A6j implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final C6xN A02 = new C6xN();
    public final C6wv A03;
    public final C6xc A04;

    public A6j(C6wv c6wv, C6xc c6xc) {
        c6xc.getClass();
        this.A04 = c6xc;
        c6wv.getClass();
        this.A03 = c6wv;
        this.A00 = null;
    }

    private void A00() {
        if (this.A01) {
            return;
        }
        C6xN c6xN = this.A02;
        C6wv c6wv = this.A03;
        11T.A0F(c6xN, 0);
        c6xN.A00 = new 7FK(c6wv, (ExecutorService) 1Bi.A03(16456), 7HR.A00);
        this.A01 = true;
    }

    public static final boolean A01(C77n c77n, 6RU r302, A5F a5f) {
        11T.A0F(r302, 0);
        11T.A0F(a5f, 3);
        if (!a5f.A01) {
            return false;
        }
        C98g c98g = C98g.A04;
        ImmutableMap of = ImmutableMap.of((Object) "composer_surface", (Object) "row_selector");
        11T.A0A(of);
        7FI.A02(r302, new 7C6(c98g, of));
        c77n.ClL(new A5F("", false));
        return true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{C7B3.class, 7B6.class, A4g.class, C6zq.class, 7Bc.class, 7BA.class, 7An.class});
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "StickerSearchPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        ImmutableList immutableList;
        A5u a5u;
        if (r305 instanceof 7An) {
            A00();
            A5F AUP = c77n.AUP(A5F.class);
            1BK.A1J(r304, 0, AUP);
            if (A01(c77n, r304, AUP)) {
                7FI.A00(r304);
                return;
            }
            return;
        }
        if (r305 instanceof A4g) {
            A00();
            A4g a4g = (A4g) r305;
            A5F AUP2 = c77n.AUP(A5F.class);
            7zS.A16(0, r304, a4g, AUP2);
            if (AUP2.A01) {
                return;
            }
            String str = a4g.A00;
            C1pq.A08("initialSearchQuery", str);
            c77n.ClL(new A5F(str, true));
            C98g c98g = C98g.A08;
            A6H a6h = C7yw.A00;
            11T.A0B(a6h);
            ImmutableMap immutableMap = RegularImmutableMap.A03;
            11T.A0A(immutableMap);
            a5u = new A5u(c98g, a6h, immutableMap);
        } else {
            if (r305 instanceof C6zq) {
                A00();
                A01(c77n, r304, c77n.AUP(A5F.class));
                return;
            }
            if (r305 instanceof 7Bc) {
                A00();
                7Bc r0 = (7Bc) r305;
                C6wv c6wv = (C6wv) this.A02.A00;
                11T.A0H(r304, r0);
                11T.A0F(c6wv, 3);
                Sticker sticker = r0.A00;
                c6wv.add(sticker);
                7FI.A02(r304, new 7BV(0S2.A01));
                C5w5 c5w5 = new C5w5();
                String str2 = sticker.A0F;
                c5w5.A06(str2);
                c5w5.A00 = sticker;
                7FI.A02(r304, new 7Ad(c5w5, "unknown", (String) null));
                immutableList = 1BK.A0b();
                11T.A0F(str2, 2);
            } else {
                if (r305 instanceof C7B3) {
                    A00();
                    11T.A0F(r305, 0);
                    return;
                }
                if (r305 instanceof 7B6) {
                    A00();
                    7B6 r02 = (7B6) r305;
                    11T.A0H(r304, r02);
                    if (r02.A00 != 0S2.A00) {
                        return;
                    }
                    C98g c98g2 = C98g.A0D;
                    ImmutableMap immutableMap2 = RegularImmutableMap.A03;
                    11T.A0A(immutableMap2);
                    a5u = new 7C6(c98g2, immutableMap2);
                } else {
                    if (!(r305 instanceof 7BA)) {
                        return;
                    }
                    A00();
                    7BA r03 = (7BA) r305;
                    11T.A0H(r304, r03);
                    if (r03.A01 != 0S2.A00) {
                        return;
                    }
                    immutableList = r03.A00;
                    if (immutableList == null) {
                        immutableList = ImmutableList.of();
                    }
                    11T.A0D(immutableList);
                    11T.A0F(immutableList, 3);
                }
            }
            a5u = new S44(immutableList);
        }
        7FI.A02(r304, a5u);
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00();
    }
}
