package X;

/* loaded from: H46.class */
public final class H46 extends HGE {
    public void A06(int i) {
        HDe hDe;
        if (i == 16) {
            hDe = Gri.A00;
        } else if (i != 17) {
            return;
        } else {
            hDe = Grh.A00;
        }
        for (HXg hXg : ((HWE) 1Br.A0B(HMc.A00)).A00) {
            if (hDe instanceof Gri) {
                4zI.A03.A05("CallAudioCallLifecycle", "SN donned. Attempting to switch to Bluetooth.", new Object[0]);
                GOq.A0r(hXg.A00.A05).AEW(HBP.A02);
            }
        }
    }
}
