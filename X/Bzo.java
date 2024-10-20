package X;

/* loaded from: Bzo.class */
public final class Bzo {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(Integer num, String str) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 1BJ.A00(544));
        if (A08.isSampled()) {
            A08.A7R("call_surface", "Thread");
            A08.A7R(AnonymousClass000.A00(175), 7 - num.intValue() != 0 ? "titlebar_video_call" : "titlebar_call");
            A08.A7R("entry_to_call_surface", str);
            A08.A7R("local_call_id", (String) null);
            A08.BZL();
        }
    }
}
