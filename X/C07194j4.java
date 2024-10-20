package X;

import java.io.InputStream;

/* renamed from: X.4j4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4j4.class */
public final class C07194j4 implements C4j5 {
    public final /* synthetic */ 4iZ A00;
    public final /* synthetic */ 2DV A01;
    public final /* synthetic */ InterfaceC06954if A02;
    public final /* synthetic */ boolean A03;

    public C07194j4(4iZ r302, 2DV r303, InterfaceC06954if interfaceC06954if, boolean z) {
        this.A00 = r302;
        this.A01 = r303;
        this.A03 = z;
        this.A02 = interfaceC06954if;
    }

    public static void A00(3xY r301, C07194j4 c07194j4, InputStream inputStream, Integer num, long j) {
        11T.A0F(inputStream, 0);
        4iZ r0 = c07194j4.A00;
        r0.A03 = num;
        r0.A00 = ((C0dr) c07194j4.A01.A08.A00.get()).now();
        r0.A02 = r301;
        if (r301 != null || c07194j4.A03) {
            r0.A00 = 8;
        }
        c07194j4.A02.CHK(inputStream, (int) j);
    }

    @Override // X.C4j5
    public /* bridge */ /* synthetic */ Object BMZ(InputStream inputStream, Integer num, long j) {
        11T.A0F(inputStream, 0);
        11T.A0F(num, 2);
        A00(null, this, inputStream, num, j);
        return 04S.A00;
    }
}
