package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.BitSet;
import java.util.TimeZone;

/* loaded from: B05.class */
public final class B05 extends C1rj {
    public static final CallerContext A08 = CallerContext.A0B("AppointmentDetailBodyComponentSpec");
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public TimeZone A06;
    public boolean A07;

    public B05() {
        super("AppointmentDetailBodyComponent");
    }

    public final Object[] A0k() {
        String str = this.A02;
        String str2 = this.A03;
        Long valueOf = Long.valueOf(this.A00);
        Boolean A0d = 1BK.A0d();
        return new Object[]{str, null, null, null, null, null, str2, valueOf, A0d, null, null, null, null, null, this.A06, this.A04, null, this.A05, Boolean.valueOf(this.A07), A0d, A0d, Long.valueOf(this.A01)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        long j = this.A01;
        long j2 = this.A00;
        boolean z = this.A07;
        TimeZone timeZone = this.A06;
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A05;
        String str4 = this.A02;
        11T.A0F(r302, 0);
        11T.A0F(timeZone, 4);
        2cM A00 = 2cK.A00(r302);
        A00.A0a();
        if (j > 0 && j2 > 0) {
            AwA awA = new AwA(r302, new AyZ());
            1LI r0 = awA.A01;
            ((AyZ) r0).A01 = j;
            BitSet bitSet = awA.A02;
            bitSet.set(2);
            ((AyZ) r0).A00 = j2;
            bitSet.set(0);
            ((AyZ) r0).A02 = timeZone;
            bitSet.set(1);
            C1rs.A03(bitSet, awA.A03);
            awA.A0J();
            A00.A2X(r0);
        }
        if (str3 != null && str3.length() != 0) {
            A00.A2W(7zM.A0v(r302, str3, 2132608191));
        }
        if (z) {
            AbstractC2178Dg6 abstractC2178Dg6 = new AbstractC2178Dg6(r302);
            abstractC2178Dg6.A0a(C26z.VERTICAL, 2132279327);
            A00.A2X(abstractC2178Dg6.A0O(A08));
            C1907Aw8 c1907Aw8 = new C1907Aw8(r302, new B07());
            BitSet bitSet2 = c1907Aw8.A02;
            bitSet2.set(8);
            B07 b07 = c1907Aw8.A01;
            b07.A01 = str;
            bitSet2.set(1);
            b07.A02 = str2;
            bitSet2.set(6);
            b07.A00 = str4;
            bitSet2.set(0);
            bitSet2.set(7);
            bitSet2.set(5);
            bitSet2.set(4);
            bitSet2.set(3);
            bitSet2.set(2);
            A00.A2W(c1907Aw8);
        }
        AbstractC2178Dg6 abstractC2178Dg62 = new AbstractC2178Dg6(r302);
        abstractC2178Dg62.A0a(C26z.VERTICAL, 2132279327);
        A00.A2X(abstractC2178Dg62.A0O(A08));
        2cL r02 = A00.A00;
        11T.A0A(r02);
        return r02;
    }
}
