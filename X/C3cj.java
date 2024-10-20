package X;

import com.facebook.inspiration.messenger.editor.appjob.MessengerInspirationAppJob;

/* renamed from: X.3cj, reason: invalid class name */
/* loaded from: 3cj.class */
public final class C3cj implements 0EE {
    public final /* synthetic */ MessengerInspirationAppJob A00;

    public C3cj(MessengerInspirationAppJob messengerInspirationAppJob) {
        this.A00 = messengerInspirationAppJob;
    }

    public void Buo(String str, Integer num) {
        11T.A0H(str, num);
        if (str.equals("fb4a_stories_editor")) {
            if (num == 0S2.A01 || num == 0S2.A0N || (num == 0S2.A0C && ((EyT) 1Br.A0B(this.A00.A00)).A01(1000L))) {
                00Y.A00().A04(this);
            }
        }
    }

    public void C4k(String str) {
        11T.A0F(str, 0);
        if (str.equals("fb4a_stories_editor")) {
            ((EyT) 1Br.A0B(this.A00.A00)).A01(1000L);
            00Y.A00().A04(this);
        }
    }
}
