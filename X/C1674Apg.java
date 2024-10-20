package X;

import com.facebook.contacts.server.FetchContactsParams;
import com.facebook.contacts.server.FetchContactsResult;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Apg, reason: case insensitive filesystem */
/* loaded from: Apg.class */
public final class C1674Apg extends C4r3 {
    public static final String __redex_internal_original_name = "FetchContactsMethod";
    public final CGn A00;
    public final COi A01;

    public C1674Apg() {
        super(AbI.A0G(), AbI.A0s());
        this.A01 = AbJ.A0F();
        this.A00 = (CGn) 1Bn.A0A(84597);
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(8);
        CGn.A00(this.A00, A0H);
        A0H.A07("contact_ids", ((FetchContactsParams) obj).A00.asList());
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            2JX A0X = 7zL.A0P(it).A0X(2JX.class, 535888496, -1678787584, 599211397);
            if (A0X == null) {
                throw AnonymousClass001.A0L("Contact unconvertable to ContactFragment");
            }
            String A0k = A0X.A0k();
            try {
                COi.A02(this.A01, A0X, builder);
            } catch (Exception e) {
                0fH.A0N(C1674Apg.class, "Couldn't deserialize contact. ID = %s", e, new Object[]{A0k});
                throw e;
            }
        }
        ImmutableList build = builder.build();
        0fH.A0A(C1674Apg.class, AnonymousClass001.A0Z(build, "Got result: ", AnonymousClass001.A0k()));
        return new FetchContactsResult(EnumC08284mf.A06, build, null, System.currentTimeMillis());
    }
}
