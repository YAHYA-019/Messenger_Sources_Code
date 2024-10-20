package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: E3c.class */
public final class E3c extends FIJ {
    public final GL7 A00;

    public E3c(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A00 = gl7;
    }

    public void A08(FyG fyG) {
        GL7 gl7 = this.A00;
        String BCx = gl7.BCx(108, "");
        String string = gl7.getString(ActionId.TIMEOUT);
        if (DKC.A0Y(fyG).A02(fyG, BCx, string) != null) {
            int i = (-1) >>> 1;
            int i2 = gl7.getInt(ActionId.QUERY_READY, i);
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != i) {
                String string2 = gl7.getString(ActionId.RTMP_CONNECTION_REQUESTED);
                DKC.A0Y(fyG).A09(fyG, new SEm(this, fyG, valueOf, string2 != null ? gl7.BI5(string2.charAt(0)) : null, BCx, string));
            }
        }
    }
}
