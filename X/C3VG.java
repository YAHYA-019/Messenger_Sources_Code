package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.3VG, reason: invalid class name */
/* loaded from: 3VG.class */
public final class C3VG implements C4EE {
    public 1BY A00;
    public final C15h A06 = new J5u(this, 70);
    public final C15h A04 = new J5u(this, 71);
    public final C15h A05 = new J5u(this, 72);
    public final C15h A07 = new J5u(this, 73);
    public final C15h A08 = new J5u(this, 74);
    public final C00i A01 = 1BQ.A02(49363);
    public final C00i A02 = 1BV.A01((1BY) null, 68483);
    public final C00i A03 = 1BQ.A02(83539);

    public C3VG(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    @Override // X.C4EE
    public ImmutableMap AlO() {
        1BY r0 = this.A00;
        FbUserSession A05 = 1Fw.A05(r0);
        2kO r02 = (2kO) 1Lo.A04((Context) null, A05, r0, 17090);
        FbK fbK = (FbK) 1Lo.A04((Context) null, A05, r0, 99744);
        4oH r03 = (4oH) 1Lo.A04((Context) null, A05, r0, 49265);
        ImmutableMap.Builder A0c = 1BK.A0c();
        A0c.put("isMessengerSyncEnabled", Boolean.toString(1BL.A1a(this.A06)));
        A0c.put("isChatHeadsEnabled", Boolean.toString(1BL.A1a(this.A04)));
        A0c.put("isMessengerOnlyUser", this.A05.get().toString());
        A0c.put("messagesSyncVersion", this.A08.get().toString());
        A0c.put("isDeactivatedOnFacebookNotOnMessenger", this.A07.get().toString());
        A0c.putAll(((C11064vf) this.A01.get()).Agf());
        A0c.putAll(((3VE) this.A02.get()).Agf());
        A0c.putAll(((C7uz) this.A03.get()).Agf());
        A0c.putAll(fbK.Agf());
        A0c.putAll(r03.Agf());
        A0c.putAll(r02.Agf());
        return A0c.build();
    }

    @Override // X.C4EE
    public ImmutableMap AlP() {
        return null;
    }

    @Override // X.C4EE
    public String getName() {
        return "MessengerAppBugReport";
    }
}
