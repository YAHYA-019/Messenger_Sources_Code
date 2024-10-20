package X;

import android.content.Context;
import com.facebook.graphql.enums.GraphQLPagesPlatformMessageBubbleTypeEnum;

/* renamed from: X.809, reason: invalid class name */
/* loaded from: 809.class */
public final class AnonymousClass809 implements InterfaceC12197zl {
    public 1BY A00;
    public final Context A01 = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);

    public AnonymousClass809(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    @Override // X.InterfaceC12197zl
    public String AKz(C12167zi c12167zi) {
        ArE BEO;
        GraphQLPagesPlatformMessageBubbleTypeEnum graphQLPagesPlatformMessageBubbleTypeEnum;
        String str;
        Context context;
        int i;
        int i2;
        6Ay BCm = c12167zi.A01.BCm();
        String str2 = "";
        if (BCm != null && (BEO = BCm.BEO()) != null && (graphQLPagesPlatformMessageBubbleTypeEnum = (GraphQLPagesPlatformMessageBubbleTypeEnum) BEO.A0g(GraphQLPagesPlatformMessageBubbleTypeEnum.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, -1084549419)) != null) {
            int ordinal = graphQLPagesPlatformMessageBubbleTypeEnum.ordinal();
            if (ordinal == 6) {
                str = c12167zi.A02;
                context = this.A01;
                if (str != null) {
                    i = 2131962804;
                    return 1BK.A0v(context, str, i);
                }
                i2 = 2131968221;
                str2 = context.getString(i2);
            } else if (ordinal == 7) {
                str = c12167zi.A02;
                context = this.A01;
                if (str != null) {
                    i = 2131962797;
                    return 1BK.A0v(context, str, i);
                }
                i2 = 2131968209;
                str2 = context.getString(i2);
            } else if (ordinal == 3) {
                str = c12167zi.A02;
                context = this.A01;
                if (str != null) {
                    i = 2131962792;
                    return 1BK.A0v(context, str, i);
                }
                i2 = 2131968205;
                str2 = context.getString(i2);
            } else if (ordinal == 2) {
                str = c12167zi.A02;
                context = this.A01;
                if (str != null) {
                    i = 2131962791;
                    return 1BK.A0v(context, str, i);
                }
                i2 = 2131968204;
                str2 = context.getString(i2);
            }
        }
        return str2;
    }

    @Override // X.InterfaceC12197zl
    public boolean Cx8() {
        return false;
    }
}
