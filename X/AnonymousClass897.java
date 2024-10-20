package X;

import android.content.Context;
import java.util.BitSet;

/* renamed from: X.897, reason: invalid class name */
/* loaded from: 897.class */
public final class AnonymousClass897 extends C1rs {
    public 1Iw A00;
    public 7XC A01;
    public final BitSet A02;
    public final String[] A03;

    public AnonymousClass897(1Iw r302, 7XC r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"color", "outline", "widthProp"};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = r303;
        this.A00 = r302;
        A18.clear();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.66T, java.lang.Object] */
    public static int A06(Context context, 2cM r302, 1Iw r303, 2dD r304, boolean z) {
        r304.A1H(context.getColor(2132214491));
        r302.A2e(r304.A2W());
        AnonymousClass897 anonymousClass897 = new AnonymousClass897(r303, new 7XC());
        anonymousClass897.A01.A00 = context.getColor(2132214493);
        BitSet bitSet = anonymousClass897.A02;
        bitSet.set(0);
        ?? obj = new Object();
        obj.A00(context.getResources().getDimensionPixelSize(2132279311));
        anonymousClass897.A01.A02 = new 7XD(new 66S((66T) obj), z, z);
        bitSet.set(z ? 1 : 0);
        anonymousClass897.A2X(3.0f);
        anonymousClass897.A0c();
        anonymousClass897.A0b();
        r302.A2e(anonymousClass897.A2V());
        return 2132279311;
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public 7XC A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2X(float f) {
        this.A01.A01 = 7zL.A04(this, f);
        this.A02.set(2);
    }
}
