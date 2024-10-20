package X;

/* renamed from: X.30q, reason: invalid class name */
/* loaded from: 30q.class */
public final class C30q implements 1Vf {
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.messaging.analytics.ttrc.surface.threadview.event.ShowThread")) {
            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
        }
        11T.A0F(r302, 0);
        0fH.A0j("ThreadViewNavigationTTRCEventHandler", r302.toString());
    }
}
