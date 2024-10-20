package X;

import android.net.Uri;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.743, reason: invalid class name */
/* loaded from: 743.class */
public final class AnonymousClass743 implements 6xM {
    public HashSet A00 = null;
    public boolean A01;
    public final 6wV A02;

    public AnonymousClass743(6wV r302) {
        this.A02 = r302;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7Aa.class, 7CT.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "PowerUpsPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        C6xq c78a;
        if (r305 instanceof 7CT) {
            if (!this.A01) {
                this.A01 = true;
            }
            6wV r0 = this.A02;
            C77v c77v = (C77v) c77n.AUP(C77v.class);
            7CT r02 = (7CT) r305;
            1BL.A11(0, r304, c77v, r02);
            9Xd r03 = r02.A00;
            5aU A00 = r03.A00();
            C92u c92u = r03 instanceof C92u ? (C92u) r03 : null;
            5vF r04 = new 5vF((82Z) null, A00);
            if (c92u == null) {
                C98d c98d = C98d.A02;
                ImmutableMap immutableMap = RegularImmutableMap.A03;
                11T.A0A(immutableMap);
                7FI.A02(r304, new 7C0(A00, c98d, immutableMap));
                c77n.ClL(new C78a(r04, null));
                HashSet A0v = AnonymousClass001.A0v();
                7FI.A02(r304, new 7Af((CharSequence) null, "power_up", (List) null, (java.util.Map) null, 4YV.A0z("messageSendTrigger", A0v, A0v), AwakeTimeSinceBootClock.INSTANCE.nowNanos()));
                return;
            }
            String A0s = 4YU.A0s();
            7Gc r05 = new 7Gc();
            r05.A02("image");
            r05.A03("power_up");
            7AQ.A00(r304, r05, A0s);
            Uri uri = c92u.A03;
            C5fo c5fo = c92u.A06;
            82Z r06 = new 82Z(uri, c5fo);
            5aU r07 = r04.A01;
            11T.A0F(r07, 0);
            c77n.ClL(new C78a(new 5vF(r06, r07), 0CU.A06(r0.getText())));
            5wW r08 = new 5wW();
            r08.A0H = false;
            r08.A03(uri.toString());
            r08.A02(c5fo.value);
            Photo photo = new Photo(r08);
            C5fp c5fp = new C5fp();
            c5fp.A0B = A0s;
            ImmutableList of = ImmutableList.of((Object) photo);
            11T.A0A(of);
            c5fp.A00 = of;
            7FI.A02(r304, new 7Ad(c5fp, "unknown", (String) null));
            r0.CvI("");
            r0.CuQ(0, 0);
            C79s c79s = new C79s(c77v);
            c79s.A00("");
            c78a = new C77v(c79s);
        } else {
            if (!(r305 instanceof 7Aa)) {
                return;
            }
            if (!this.A01) {
                this.A01 = true;
            }
            11T.A0F(c77n, 0);
            c78a = new C78a(null, null);
        }
        c77n.ClL(c78a);
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
