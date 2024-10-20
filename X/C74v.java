package X;

import android.net.Uri;
import com.facebook.fbavatar.config.AvatarConfigRepository;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.74v, reason: invalid class name */
/* loaded from: 74v.class */
public final class C74v implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final AnonymousClass749 A02;
    public final C74t A03;
    public final ThreadKey A04;
    public final C6xN A05;
    public final C6xN A06;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.6xN] */
    public C74v(AnonymousClass747 anonymousClass747) {
        ?? obj = new Object();
        obj.A00 = 0;
        this.A05 = obj;
        this.A06 = new C6xN();
        C74t c74t = anonymousClass747.A01;
        c74t.getClass();
        this.A03 = c74t;
        ThreadKey threadKey = anonymousClass747.A02;
        threadKey.getClass();
        this.A04 = threadKey;
        AnonymousClass749 anonymousClass749 = anonymousClass747.A00;
        anonymousClass749.getClass();
        this.A02 = anonymousClass749;
        this.A00 = anonymousClass747.A03;
    }

    private void A00(C77n c77n, 6RU r303) {
        if (this.A01) {
            return;
        }
        C74t c74t = this.A03;
        ThreadKey threadKey = this.A04;
        C6xN c6xN = this.A06;
        C6xN c6xN2 = this.A05;
        11T.A0F(r303, 0);
        11T.A0F(c77n, 3);
        11T.A0F(c6xN, 4);
        11T.A0F(c6xN2, 5);
        c6xN.A00 = null;
        7Iv r0 = new 7Iv(r303);
        AvatarConfigRepository avatarConfigRepository = (AvatarConfigRepository) c74t.A00.A00.get();
        7Ix r02 = new 7Ix(r0);
        List list = avatarConfigRepository.A02;
        synchronized (list) {
            list.add(r02);
        }
        c6xN2.A00 = 10;
        78Y r03 = (78Y) 7Iy.A00.get(threadKey);
        if (r03 != null) {
            c77n.ClL(r03);
        }
        this.A01 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7AO.class, 7CU.class, 7CV.class, 7CW.class, 7CX.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AvatarHotLikeButtonPlugin";
    }

    /* JADX WARN: Type inference failed for: r0v81, types: [X.6Sh, java.lang.Object] */
    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        int intValue;
        if (r305 instanceof 7CU) {
            A00(c77n, r304);
            ((C05) 1Br.A0B(this.A03.A01)).A00(0S2.A0Y, null, null, "", "");
            return;
        }
        if (r305 instanceof 7CV) {
            A00(c77n, r304);
            C6xN c6xN = this.A05;
            11T.A0H(r304, c6xN);
            Number number = (Number) c6xN.A00;
            if (number == null || (intValue = number.intValue()) <= 0) {
                return;
            }
            2aK.A03((Integer) null, (0DE) null, new AJI(c6xN, r304, (0DR) null, intValue, 2), 2Zy.A01(2Zo.A00()), 3);
            return;
        }
        if (r305 instanceof 7CW) {
            A00(c77n, r304);
            7CW r0 = (7CW) r305;
            ThreadKey threadKey = this.A04;
            C6xN c6xN2 = this.A05;
            11T.A0F(r304, 0);
            11T.A0F(r0, 1);
            11T.A0F(c77n, 3);
            11T.A0F(c6xN2, 4);
            78Y AUP = c77n.AUP(78Y.class);
            Sticker sticker = r0.A00;
            Uri uri = sticker.A09;
            Sticker sticker2 = AUP.A00;
            if (11T.A0O(uri, sticker2 != null ? sticker2.A09 : null)) {
                if (11T.A0O(7Iy.A00.get(threadKey), AUP)) {
                    return;
                }
                7FI.A02(r304, (6Sh) new Object());
                return;
            } else {
                c6xN2.A00 = 10;
                78Y r02 = new 78Y(sticker, r0.A02, r0.A01.A07());
                7Iy.A00.put(threadKey, r02);
                c77n.ClL(r02);
                return;
            }
        }
        if (r305 instanceof 7CX) {
            A00(c77n, r304);
            AnonymousClass749 anonymousClass749 = this.A02;
            ThreadKey threadKey2 = this.A04;
            7EI r03 = (7EI) this.A06.A00;
            11T.A0F(r304, 0);
            11T.A0F(c77n, 3);
            7Iy.A00(anonymousClass749, threadKey2, c77n, r304, r03);
            return;
        }
        if (r305 instanceof 7AO) {
            Object obj = ((7AO) r305).A00;
            if (obj instanceof 7EI) {
                A00(c77n, r304);
                7EI r04 = (7EI) obj;
                AnonymousClass749 anonymousClass7492 = this.A02;
                ThreadKey threadKey3 = this.A04;
                C6xN c6xN3 = this.A06;
                11T.A0F(r304, 0);
                11T.A0F(r04, 1);
                11T.A0F(c77n, 4);
                11T.A0F(c6xN3, 5);
                c6xN3.A00 = r04;
                7Iy.A00(anonymousClass7492, threadKey3, c77n, r304, r04);
            }
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(c77n, r303);
    }
}
