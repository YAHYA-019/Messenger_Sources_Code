package X;

import android.graphics.drawable.RippleDrawable;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.8l8, reason: invalid class name */
/* loaded from: 8l8.class */
public final class C8l8 extends C1rj {
    public 56K A00;

    public C8l8() {
        super("MigSwipeableListItemLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C8p5 c8p5 = (C8p5) 4YU.A0P(r302);
        56K r0 = this.A00;
        String str = c8p5.A00;
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = r0.A04.iterator();
        while (it.hasNext()) {
            AnonymousClass556 anonymousClass556 = (AnonymousClass556) it.next();
            8Sp A00 = 59U.A00(r302);
            A00.A2X(anonymousClass556);
            builder.m11011add((Object) A00.A2W());
        }
        ImmutableList.Builder builder2 = ImmutableList.builder();
        1Du it2 = r0.A05.iterator();
        while (it2.hasNext()) {
            AnonymousClass556 anonymousClass5562 = (AnonymousClass556) it2.next();
            8Sp A002 = 59U.A00(r302);
            A002.A2X(anonymousClass5562);
            builder2.m11011add((Object) A002.A2W());
        }
        RippleDrawable A003 = C2cn.A00(0.0f, 0, r0.A03.B9e());
        55M A10 = 7zM.A10(r0.A01, 55M.A00(r302));
        8Qc r02 = new 8Qc(r302, new C8nv());
        C8nv c8nv = r02.A01;
        c8nv.A01 = A10.A0l();
        BitSet bitSet = r02.A02;
        bitSet.set(0);
        c8nv.A00 = A003;
        c8nv.A05 = builder.build();
        c8nv.A06 = builder2.build();
        c8nv.A04 = str;
        c8nv.A03 = new 9PI(r0, str);
        9YE r03 = r0.A02;
        if (r03 != null) {
            c8nv.A02 = r03;
        }
        C1rs.A01(bitSet, r02.A03);
        r02.A0J();
        return c8nv;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((C8p5) r303).A00 = 1BK.A0t();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
