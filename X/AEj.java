package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment.GeneratedThemeCreationFragment;

/* loaded from: AEj.class */
public final class AEj implements Runnable {
    public static final String __redex_internal_original_name = "GeneratedThemeCreationFragment$maybeGenerateTheme$1";
    public final /* synthetic */ GeneratedThemeCreationFragment A00;
    public final /* synthetic */ String A01;

    public AEj(GeneratedThemeCreationFragment generatedThemeCreationFragment, String str) {
        this.A00 = generatedThemeCreationFragment;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2FT A02;
        GeneratedThemeCreationFragment generatedThemeCreationFragment = this.A00;
        GeneratedThemeCreationFragment.A0K(generatedThemeCreationFragment);
        9kV r0 = (9kV) 1Br.A0B(generatedThemeCreationFragment.A0c);
        if (generatedThemeCreationFragment.A04 == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        String str = this.A01;
        int i = generatedThemeCreationFragment.A01;
        boolean AZk = 7zU.A0Y(generatedThemeCreationFragment).AZk(36325278612542000L);
        11T.A0F(str, 1);
        int i2 = 416690446;
        C03z c03z = GraphQlCallInput.A02;
        if (AZk) {
            07S A0J = 4YU.A0J(c03z, str, "prompt");
            07S.A00(A0J, "MESSENGER", "caller");
            07S.A00(A0J, 1, "num_themes");
            07S.A00(A0J, 0, "max_retries");
            GraphQlQueryParamSet A0N = 4YU.A0N(A0J, Integer.valueOf(i), "variant_index");
            4YV.A1A(A0J, A0N, "input");
            C3sa A0L = 7zM.A0L(A0N, new 2Jf(2JX.class, (Class) null, "GenerateAIThemeImagesFromPromptQuery", (String) null, "fbandroid", 527049584, 0, 1183966701L, 1183966701L, false, true));
            7zP.A0e(r0.A02).markerStart(416690446, str.hashCode());
            A02 = 2FP.A02(new ABe(r0, 1), ((DKN) 1De.A00(r0.A00, 68643)).A01().A09(A0L), 4YV.A11(r0.A03));
        } else {
            07S A0J2 = 4YU.A0J(c03z, str, "prompt");
            07S.A00(A0J2, "MESSENGER", "caller");
            07S.A00(A0J2, 1, "num_themes");
            07S.A00(A0J2, 0, "max_retries");
            GraphQlQueryParamSet A0N2 = 4YU.A0N(A0J2, Integer.valueOf(i), "variant_index");
            4YV.A1A(A0J2, A0N2, "input");
            5Dh A00 = 5Dh.A00(A0N2, new C01643sd(Q7s.class, "GenerateAIThemesFromPromptMutation", null, null, "fbandroid", -816922161, 0, 3645700592L, 3645700592L, false, true));
            7zP.A0e(r0.A02).markerStart(416682160, str.hashCode());
            A02 = 2FP.A02(new ABe(r0, 2), ((DKN) 1De.A00(r0.A00, 68643)).A01().A09(A00), 4YV.A11(r0.A03));
            i2 = 416682160;
        }
        1Kd.A0E(new ABl(r0, str, i2), A02);
        generatedThemeCreationFragment.A0N = A02;
        8HG r02 = generatedThemeCreationFragment.A0B;
        if (r02 == null) {
            throw 1BK.A0h();
        }
        1Br.A0D(generatedThemeCreationFragment.A0i, r02, A02);
    }
}
