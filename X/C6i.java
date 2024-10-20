package X;

/* loaded from: C6i.class */
public final class C6i {
    public final C00i A00 = AbH.A0M();

    public void A00(String str) {
        C00i c00i = this.A00;
        if (1BK.A0U(c00i).isMarkerOn(5505176)) {
            return;
        }
        1BK.A0U(c00i).markerStart(5505176);
        1BK.A0U(c00i).markerAnnotate(5505176, "entry", str);
    }

    public void A01(short s) {
        C00i c00i = this.A00;
        if (1BK.A0U(c00i).isMarkerOn(5505176)) {
            1BK.A0U(c00i).markerAnnotate(5505176, "result_id", (int) s);
            1BK.A0U(c00i).markerEnd(5505176, s);
        }
    }
}
