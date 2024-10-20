package X;

/* loaded from: HlL.class */
public final class HlL {
    public final HBL A00(HCA hca) {
        try {
            return HBL.valueOf(hca.name());
        } catch (IllegalArgumentException | NullPointerException e) {
            0fH.A0y("VideoError", "Cannot convert videoErrorCode %s", e, new Object[]{hca});
            return hca == HCA.A1A ? HBL.A0R : hca == HCA.A1C ? HBL.A09 : (hca == HCA.A1Y || hca == HCA.A0C || hca == HCA.A0D) ? HBL.A0A : (hca == HCA.A1W || hca == HCA.A1V || hca == HCA.A1U) ? HBL.A0J : (hca == HCA.A1L || hca == HCA.A1M) ? HBL.A0N : HBL.A0P;
        }
    }
}
