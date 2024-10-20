package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.model.GraphQLMedia;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;

/* loaded from: J42.class */
public final class J42 implements Runnable {
    public static final String __redex_internal_original_name = "SubtitlesRequestAPI$requestLanguage$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ GraphQLMedia A02;
    public final /* synthetic */ C6dn A03;
    public final /* synthetic */ Hpd A04;
    public final /* synthetic */ C6dl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public J42(Context context, FbUserSession fbUserSession, GraphQLMedia graphQLMedia, C6dn c6dn, Hpd hpd, C6dl c6dl, String str, String str2) {
        this.A06 = str;
        this.A07 = str2;
        this.A03 = c6dn;
        this.A01 = fbUserSession;
        this.A04 = hpd;
        this.A05 = c6dl;
        this.A02 = graphQLMedia;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FbUserSession fbUserSession;
        Executor A11;
        IuV iz7;
        String str = this.A06;
        if (str == null) {
            str = "";
        }
        String str2 = this.A07;
        if (str2 != null && (fbUserSession = this.A01) != null) {
            if (str.equals("off")) {
                Hpd hpd = this.A04;
                C6dl c6dl = this.A05;
                A11 = 4YV.A11(hpd.A04);
                iz7 = new IuV(c6dl);
            } else {
                if (!str.equals("asr")) {
                    GraphQlQueryParamSet A0M = 7zL.A0M();
                    A0M.A05(TraceFieldType.VideoId, str2);
                    A0M.A06("locales", ImmutableList.of((Object) str));
                    C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "FetchVideoCaptionsGraphQL", (String) null, "fbandroid", -1237255291, 0, 3079731125L, 3079731125L, false, true));
                    A0L.A0A(600L);
                    A0L.A09(600L);
                    A0L.A0C(0Pz.A0W("video_id=", str2));
                    AbstractC05414dq A0A = 1VX.A0A(this.A00, fbUserSession);
                    4YU.A1J(A0L, 2444622522461689L);
                    C03713yu A03 = A0A.A03(A0L);
                    11T.A0A(A03);
                    Hpd hpd2 = this.A04;
                    1Br.A0D(hpd2.A01, new Ind(this.A05, A03, hpd2, this.A02, str2, 3), A03);
                    this.A03.CMm(A03);
                    return;
                }
                Hpd hpd3 = this.A04;
                C6dl c6dl2 = this.A05;
                Hgo hgo = new Hgo(str2, null, null, true);
                A11 = 4YV.A11(hpd3.A04);
                iz7 = new Iz7(hgo, c6dl2);
            }
            A11.execute(iz7);
        }
        this.A03.CMk();
    }
}
