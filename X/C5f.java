package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: C5f.class */
public final class C5f {
    public int A00;
    public final 1De A01;
    public final 1Br A02;
    public final RFi A03;
    public final ImmutableList A04;
    public final CopyOnWriteArraySet A05;
    public final Message A06;

    public C5f(1De r302, RFi rFi, Message message) {
        ImmutableList reverse;
        11T.A0F(message, 2);
        this.A01 = r302;
        this.A06 = message;
        this.A03 = rFi;
        this.A02 = 7zM.A0h(r302, 16428);
        this.A05 = new CopyOnWriteArraySet();
        C00i c00i = this.A02.A00;
        FbUserSession A06 = 1Fw.A06(c00i.get());
        1BY r0 = this.A01.A00;
        7V1 r02 = (7V1) 1Lm.A07(A06, r0, 50208);
        r02.mMediaMessageListeners.add(new CoE(this));
        ImmutableList immutableList = r02.A01;
        if (immutableList == null) {
            reverse = ImmutableList.of();
        } else {
            ImmutableList.Builder A0h = 4YU.A0h();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                MediaMessageItem mediaMessageItem = (MediaMessageItem) it.next();
                Message Ax8 = mediaMessageItem.Ax8();
                if (Ax8 != null && !((60P) 1Lm.A07(1Fw.A06(c00i.get()), r0, 49926)).A00(Ax8)) {
                    A0h.m11011add((Object) new RO3(mediaMessageItem, message.A05));
                }
            }
            reverse = A0h.build().reverse();
        }
        11T.A0A(reverse);
        this.A04 = reverse;
        this.A00 = 0;
    }

    public final RO3 A00() {
        return (RO3) 4YU.A0q(this.A04, this.A00);
    }
}
