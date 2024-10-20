package X;

import android.content.Context;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.72a, reason: invalid class name */
/* loaded from: 72a.class */
public final class C72a implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final 72U A02;
    public final 72G A03;
    public final 72H A04;

    public C72a(72Z r302) {
        72G r0 = r302.A01;
        r0.getClass();
        this.A03 = r0;
        this.A02 = r302.A00;
        72H r02 = r302.A02;
        r02.getClass();
        this.A04 = r02;
        this.A00 = r302.A03;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7Bu.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "BumpPlugin";
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [X.5fq, X.5qu] */
    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        if (r305 instanceof 7Bu) {
            if (!this.A01) {
                this.A01 = true;
            }
            7Bu r0 = (7Bu) r305;
            72G r02 = this.A03;
            72H r03 = this.A04;
            72U r04 = this.A02;
            boolean A1W = 1BL.A1W(r304, r0);
            String str = null;
            String A0s = 4YU.A0s();
            11T.A0F(A0s, 2);
            7Gc r05 = new 7Gc();
            r05.A02("text");
            r05.A03("bump");
            r05.A01(r0.A00);
            int hashCode = A0s.hashCode();
            r05.A00(hashCode);
            7FI.A02(r304, new 7AT(r05));
            7Gc r06 = new 7Gc();
            r06.A00(hashCode);
            7FI.A02(r304, new 7AQ(r06));
            ?? c5fq = new C5fq();
            Context context = r304.A00;
            c5fq.A02 = context.getString(2131953605);
            c5fq.A02(C5m3.A00, new 7Gr("", r0.A01, A1W));
            c5fq.A0B = A0s;
            c5fq.A0A = null;
            r03.A00((C5fq) c5fq);
            5gC r07 = new 5gC((C5qu) c5fq);
            if (r04 != null) {
                str = r04.A00(context, (AnonymousClass539) null, r07);
            }
            r02.Ckr((AnonymousClass539) null, r07, "bump", str);
        }
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z || this.A01) {
            return;
        }
        this.A01 = true;
    }
}
