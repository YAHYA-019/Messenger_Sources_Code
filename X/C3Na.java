package X;

import com.facebook.privacy.acs.falco.FalcoACSProvider;

/* renamed from: X.3Na, reason: invalid class name */
/* loaded from: 3Na.class */
public final class C3Na {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(Object obj, String str, Throwable th, java.util.Map map) {
        1UG A08 = 1BK.A08(1Br.A02(this.A00), "thread_list_loader_failure");
        if (A08.isSampled()) {
            A08.A7R("error", 0G8.A01(th));
            A08.A6J("extra", map);
            A08.A7R("params", obj.toString());
            A08.A7R(FalcoACSProvider.TAG, str);
            A08.BZL();
        }
    }
}
