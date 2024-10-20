package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* renamed from: X.3tK, reason: invalid class name */
/* loaded from: 3tK.class */
public abstract class C3tK {
    public static final void A00(C3s4 c3s4, boolean z, boolean z2) {
        boolean hasAcsToken = c3s4.hasAcsToken();
        boolean hasOhaiConfig = c3s4.hasOhaiConfig();
        boolean z3 = false;
        boolean z4 = false;
        if (z == hasAcsToken) {
            z4 = true;
        }
        if (z2 == hasOhaiConfig) {
            z3 = true;
        }
        if (z4 && z3) {
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (!z4) {
            if (hasAcsToken) {
                A0s2.add("ACS token");
            } else {
                A0s.add("ACS token");
            }
        }
        if (!z3) {
            if (c3s4.hasOhaiConfig()) {
                A0s2.add("OHAI config");
            } else {
                A0s.add("OHAI config");
            }
        }
        if (!A0s.isEmpty()) {
            throw 0Pz.A07("Request was marked with @deidentified, but no ", 0QD.A0K(" or ", "", "", A0s, (Function1) null, -1), " was provided.");
        }
        if (!A0s2.isEmpty()) {
            throw 0Pz.A07("Unexpected ", 0QD.A0K(" and ", "", "", A0s2, (Function1) null, -1), " was provided to the request.");
        }
    }
}
