package X;

/* loaded from: F86.class */
public final class F86 {
    public final 1Br A02 = 1BK.A0C();
    public final 1Br A00 = 7zM.A0N();
    public final 1Br A04 = AbG.A0M();
    public final 1Br A01 = 1Bu.A00(98598);
    public final 1Br A03 = 1Bu.A00(98597);

    public static final 1CO A00(F86 f86) {
        return 1Br.A06(f86.A00);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0026. Please report as an issue. */
    public final QpG A01(boolean z) {
        String BCy = 1Br.A06(this.A00).BCy(z ? 72902242308194353L : 72902242308259890L);
        switch (BCy.hashCode()) {
            case 461675386:
                if (BCy.equals("travel_distance")) {
                    return QpG.A04;
                }
                return QpG.A02;
            case 1414813204:
                if (BCy.equals("travel_or_velocity")) {
                    return QpG.A05;
                }
                return QpG.A02;
            case 1499847498:
                if (BCy.equals("travel_and_velocity")) {
                    return QpG.A03;
                }
                return QpG.A02;
            case 2134260957:
                if (BCy.equals("velocity")) {
                    return QpG.A06;
                }
                return QpG.A02;
            default:
                return QpG.A02;
        }
    }
}
