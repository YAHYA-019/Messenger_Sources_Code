package X;

/* renamed from: X.2xs, reason: invalid class name */
/* loaded from: 2xs.class */
public final class C2xs extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xs(int i, Object obj, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((2EB) this.A01).A0G = this.A02;
                break;
            case 1:
                ((2EB) this.A01).A05 = this.A02;
                break;
            case 2:
                ((2EB) this.A01).A06 = this.A02;
                break;
            case 3:
                ((2EB) this.A01).A07 = this.A02;
                break;
            case 4:
                ((2EB) this.A01).A08 = this.A02;
                break;
            case 5:
                ((2EB) this.A01).A09 = this.A02;
                break;
            case 6:
                ((2EB) this.A01).A0D = this.A02;
                break;
            case 7:
                ((2EB) this.A01).A0B = this.A02;
                break;
            case 8:
                ((2EB) this.A01).A0A = this.A02;
                break;
            case 9:
                ((2EB) this.A01).A0C = this.A02;
                break;
            case 10:
                ((2EB) this.A01).A0F = this.A02;
                break;
            case 11:
                ((2EB) this.A01).A0E = this.A02;
                break;
            default:
                1hD r0 = (1hD) this.A01;
                int i = r0.A03;
                if (i <= 5) {
                    r0.A0D.markerAnnotate(729355407, 0Pz.A0T("mws_send_message_result_", i), this.A02);
                    break;
                }
                break;
        }
        return 04S.A00;
    }
}
