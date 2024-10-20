package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: AKg.class */
public final class AKg extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKg(Object obj, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                6SS r0 = (6SS) this.A01;
                String A0K = 0Pz.A0K(this.A02, '@');
                Integer num = 0S2.A0j;
                String str = this.A03;
                6SC r02 = r0.A01;
                String str2 = r02.A06.A01().A00;
                str2.getClass();
                int A0D = r02.A0D(str2);
                boolean A0H = r02.A0H(num, A0K, ConstantsKt.CAMERA_ID_FRONT, A0D, r02.A0C(A0D, A0K, str, str2));
                String A0K2 = 0Pz.A0K(str, '/');
                Integer num2 = 0S2.A0u;
                if (A0H) {
                    int selectionStart = r02.A06.A02.getSelectionStart();
                    r02.A0F(A0K2, ConstantsKt.CAMERA_ID_FRONT, selectionStart, selectionStart, num2);
                } else {
                    r0.A02(A0K2, num2);
                }
                r02.A08.A00.A1h();
                break;
            case 1:
                9fJ r03 = (9fJ) this.A01;
                4YV.A0Z(r03.A01).flowMarkPoint(r03.A00, this.A03, this.A02);
                break;
            default:
                C6ns c6ns = (C6ns) this.A01;
                c6ns.A01.flowEndFail(c6ns.A00, this.A03, this.A02);
                c6ns.A00 = 0L;
                break;
        }
        return 04S.A00;
    }
}
