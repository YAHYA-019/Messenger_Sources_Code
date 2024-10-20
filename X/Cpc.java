package X;

import com.facebook.user.model.Name;
import com.google.common.collect.ImmutableList;

/* loaded from: Cpc.class */
public final class Cpc implements DIA {
    public 1BY A00;
    public final Cro A01 = new Cro(this);
    public final C3A A02 = (C3A) 1Bi.A03(67523);

    public Cpc(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static ImmutableList A00(Cpc cpc, Name name) {
        String str = name.firstName;
        if (str == null) {
            str = "";
        }
        String str2 = name.lastName;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = name.displayName;
        if (str3 == null) {
            str3 = "";
        }
        return cpc.A02.A00(0Pz.A0z(str, " ", str2, " ", str3));
    }

    public /* bridge */ /* synthetic */ String Aab(Object obj) {
        return (String) ((AcX) obj).A07(Crv.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r303 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableList AzT(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            X.AcX r0 = (X.AcX) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1b
            r0 = r301
            X.Cro r0 = r0.A01
            r303 = r0
            r0 = r302
            r1 = r303
            java.lang.Object r0 = r0.A07(r1)
            com.google.common.collect.ImmutableList r0 = (com.google.common.collect.ImmutableList) r0
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1f
        L1b:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            r303 = r0
        L1f:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cpc.AzT(java.lang.Object):com.google.common.collect.ImmutableList");
    }

    public /* bridge */ /* synthetic */ Object BK8(Object obj) {
        return obj;
    }
}
