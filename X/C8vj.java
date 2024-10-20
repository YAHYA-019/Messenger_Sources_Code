package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import java.util.BitSet;

/* renamed from: X.8vj, reason: invalid class name */
/* loaded from: 8vj.class */
public final class C8vj extends C63h {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02;

    public C8vj(1BO r302) {
        super(FbInjector.A00());
        this.A02 = 1BV.A01((1BY) null, 83436);
        this.A01 = 1BV.A01((1BY) null, 16979);
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.9Aa] */
    @Override // X.C63h
    public 1LI A05(1Iw r302, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        UserKey userKey = (UserKey) this.A02.get();
        ?? obj = new Object();
        ((9Aa) obj).A00 = userKey;
        obj.A00(r304.AXb());
        9Zt r0 = new 9Zt((9Aa) obj);
        8Pe r02 = new 8Pe(r302, new C8me());
        FbUserSession fbUserSession = this.A03;
        C8me c8me = r02.A01;
        c8me.A00 = fbUserSession;
        BitSet bitSet = r02.A02;
        bitSet.set(1);
        c8me.A04 = r303 != null ? r303.Axg() : (MigColorScheme) this.A01.get();
        bitSet.set(0);
        c8me.A01 = r304;
        bitSet.set(3);
        c8me.A03 = r0;
        bitSet.set(2);
        c8me.A02 = anonymousClass622.A03.A0V;
        bitSet.set(4);
        C1rs.A04(bitSet, r02.A03);
        r02.A0J();
        return c8me;
    }
}
