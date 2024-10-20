package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.LogcatReader;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: Cq8.class */
public final class Cq8 implements DFf {
    public Context A00;
    public FbUserSession A01;
    public Boolean A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Number] */
    @Override // X.DFf
    public ImmutableList Ben(ImmutableList immutableList) {
        Number A0o;
        FbUserSession fbUserSession;
        if (!immutableList.isEmpty() && this.A02.booleanValue() && 2yD.A03(1qI.A02((1qI) 1Bi.A03(66409)), 36322796134221781L)) {
            Integer valueOf = Integer.valueOf(LogcatReader.DEFAULT_WAIT_TIME);
            HashMap A0u = AnonymousClass001.A0u();
            Context context = this.A00;
            if (context != null && (fbUserSession = this.A01) != null) {
                A0u = ((CQU) 1Lo.A04(context, fbUserSession, (1BY) null, 84330)).A0C;
                if (A0u != null && A0u.get("meta_ai_snippet") != null) {
                    valueOf = 1BK.A0o("meta_ai_snippet", A0u);
                }
            }
            ArrayList A0s = AnonymousClass001.A0s();
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                C1301Ade c1301Ade = (C1301Ade) immutableList.get(i);
                if (c1301Ade != null) {
                    if (c1301Ade.A01 == null || !c1301Ade.A01.loggingName.equals("meta_ai_snippet")) {
                        builder.m11011add((Object) c1301Ade);
                    } else {
                        A0s.add(c1301Ade);
                    }
                }
            }
            ImmutableList build = builder.build();
            ImmutableList.Builder builder2 = ImmutableList.builder();
            boolean z = false;
            for (int i2 = 0; i2 < build.size(); i2++) {
                C1301Ade c1301Ade2 = (C1301Ade) build.get(i2);
                if (c1301Ade2 != null) {
                    if (c1301Ade2.A01 != null && (A0o = 1BK.A0o(c1301Ade2.A01.loggingName, A0u)) != null && A0o.intValue() >= valueOf.intValue() && !z) {
                        builder2.addAll(A0s);
                        z = true;
                    }
                    if (c1301Ade2.A01 == null || !c1301Ade2.A01.loggingName.equals("meta_ai_typeahead")) {
                        builder2.m11011add((Object) c1301Ade2);
                    }
                }
            }
            if (!z) {
                builder2.addAll(A0s);
            }
            immutableList = builder2.build();
        }
        return immutableList;
    }
}
