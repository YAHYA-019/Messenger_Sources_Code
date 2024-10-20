package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.MessengerCallLogProperties;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.8vi, reason: invalid class name */
/* loaded from: 8vi.class */
public final class C8vi extends C63h {
    public 1BY A00;
    public final C00i A01;

    public C8vi(1BO r302) {
        super(FbInjector.A00());
        this.A01 = 7zN.A0D(16979);
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.C63h
    public 1LI A05(1Iw r302, 5zD r303, 6Az r304, AnonymousClass622 anonymousClass622, 7Wh r306) {
        String A0i;
        1Du it = r304.AXb().iterator();
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        ImmutableList immutableList = null;
        while (it.hasNext()) {
            8IR r0 = (8IR) it.next();
            8IE A0u = r0.A0u();
            if (A0u != null && (A0i = A0u.A0i()) != null) {
                String A0r = r0.A0r(106079);
                if (1JF.A0C(A0r, "event")) {
                    str = A0i;
                } else if (1JF.A0C(A0r, "callee_id")) {
                    str3 = A0i;
                } else if (1JF.A0C(A0r, "caller_id")) {
                    str2 = A0i;
                } else if (1JF.A0C(A0r, AbE.A00(ActionId.APPLY_FINISHED_LIST))) {
                    str4 = A0i;
                } else if (1JF.A0C(A0r, "timestamp")) {
                    j = Long.parseLong(A0i);
                } else if (1JF.A0C(A0r, AbE.A00(87))) {
                    str5 = A0i;
                } else if (1JF.A0C(A0r, "video")) {
                    z = Boolean.valueOf(A0i).booleanValue();
                } else if (1JF.A0C(A0r, AbE.A00(422))) {
                    j2 = Long.parseLong(A0i);
                } else if (1JF.A0C(A0r, AbE.A00(610))) {
                    immutableList = MessengerCallLogProperties.A02(A0i);
                }
            }
        }
        str.getClass();
        MessengerCallLogProperties A00 = MessengerCallLogProperties.A00(null, immutableList, null, str, str2, str3, str4, str5, j2, z);
        A00.getClass();
        C9On c9On = new C9On(A00, j);
        8Pd r02 = new 8Pd(r302, new C8m8());
        MigColorScheme Axg = r303 != null ? r303.Axg() : (MigColorScheme) this.A01.get();
        C8m8 c8m8 = r02.A01;
        c8m8.A03 = Axg;
        BitSet bitSet = r02.A02;
        bitSet.set(0);
        c8m8.A00 = r304;
        bitSet.set(3);
        c8m8.A02 = c9On;
        bitSet.set(2);
        c8m8.A01 = anonymousClass622.A03;
        bitSet.set(1);
        C1rs.A02(bitSet, r02.A03);
        r02.A0J();
        return c8m8;
    }
}
