package X;

import android.content.Context;
import com.facebook.graphql.enums.GraphQLMontageShareIntent;
import com.facebook.inject.FbInjector;

/* renamed from: X.806, reason: invalid class name */
/* loaded from: 806.class */
public final class AnonymousClass806 implements InterfaceC12197zl {
    public final C00i A00 = FbInjector.A00;

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        ArE BEO;
        Enum A0g;
        String A0r;
        6Ay BCm = c12167zi.A01.BCm();
        if (BCm != null && (BEO = BCm.BEO()) != null && (A0g = BEO.A0g(GraphQLMontageShareIntent.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, -558163204)) != null && A0g.equals(GraphQLMontageShareIntent.TAG) && (A0r = BCm.A0r(-2061635299)) != null) {
            return A0r;
        }
        String str = c12167zi.A02;
        Context context = (Context) this.A00.get();
        return str == null ? context.getString(2131960467) : 1BK.A0v(context, str, 2131960468);
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return true;
    }
}
