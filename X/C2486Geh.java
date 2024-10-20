package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;

/* renamed from: X.Geh, reason: case insensitive filesystem */
/* loaded from: Geh.class */
public final class C2486Geh extends 1RM {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ I09 A01;
    public final /* synthetic */ 7oP A02;
    public final /* synthetic */ 65V A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C2486Geh(Context context, I09 i09, 7oP r304, 65V r305, String str, String str2) {
        this.A01 = i09;
        this.A05 = str;
        this.A00 = context;
        this.A03 = r305;
        this.A02 = r304;
        this.A04 = str2;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        I09 i09 = this.A01;
        i09.A04.get();
        1BK.A05().putString("message_reaction_type", this.A05);
        i09.A07.get();
    }

    public void A03(Throwable th) {
        GraphQLError graphQLErrorFromException = GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(th);
        if (graphQLErrorFromException != null) {
            I09 i09 = this.A01;
            Context context = this.A00;
            if (graphQLErrorFromException.code == 1545100) {
                1BK.A1E(i09.A08).execute(new J1x(context, i09, graphQLErrorFromException.summary, graphQLErrorFromException.A03()));
            }
            this.A03.A05(this.A02, this.A04);
            return;
        }
        65V r0 = this.A03;
        7oP r02 = this.A02;
        String str = this.A04;
        if (!r0.A05(r02, str)) {
            r0.A03(str);
        }
        I09 i092 = this.A01;
        i092.A04.get();
        Bundle A05 = 1BK.A05();
        A05.putString("message_id", str);
        A05.putSerializable("exception", th);
        i092.A07.get();
    }
}
