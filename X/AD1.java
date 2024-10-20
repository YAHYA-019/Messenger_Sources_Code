package X;

import android.widget.EditText;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment.GeneratedThemeCreationFragment;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: AD1.class */
public final class AD1 implements Runnable {
    public static final String __redex_internal_original_name = "GeneratedThemeCreationFragment$maybeOpenThemePreview$1";
    public final /* synthetic */ GeneratedThemeCreationFragment A00;

    public AD1(GeneratedThemeCreationFragment generatedThemeCreationFragment) {
        this.A00 = generatedThemeCreationFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GeneratedThemeCreationFragment generatedThemeCreationFragment = this.A00;
        CfG cfG = generatedThemeCreationFragment.A05;
        if (cfG != null) {
            cfG.ABm();
        }
        9kV r0 = (9kV) 1Br.A0B(generatedThemeCreationFragment.A0c);
        Object obj = null;
        if (generatedThemeCreationFragment.A04 == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        EditText editText = generatedThemeCreationFragment.A03;
        String valueOf = String.valueOf(editText != null ? editText.getText() : null);
        9ZZ r02 = generatedThemeCreationFragment.A0M;
        if (r02 != null) {
            obj = r02.A02;
        }
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.xapp.messaging.threadview.customtheme.model.GenerativeAiThemePreImage");
        9Us r03 = (9Us) obj;
        11T.A0G(valueOf, 1, r03);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, r03.A03, "image_handle");
        07S.A00(A0J, String.valueOf(r03.A00), "image_url");
        07S.A00(A0J, r03.A04, TraceFieldType.RequestID);
        07S.A00(A0J, r03.A05, "response_id");
        GraphQlCallInput graphQlCallInput = new 2Jd(3);
        graphQlCallInput.A09("prompt", valueOf);
        graphQlCallInput.A09("caller", "MESSENGER");
        7zN.A17(A0J, graphQlCallInput, "imagine_result");
        graphQlCallInput.A09("color", r03.A02);
        graphQlCallInput.A0A("intermediates", r03.A01);
        graphQlCallInput.A06("skip_post_processing", false);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A01(graphQlCallInput, "input");
        5Dh A00 = 5Dh.A00(A0M, new C01643sd(8Ia.class, "GenerateAIThemeWithPostProcessingMutation", null, null, "fbandroid", 305455277, 0, 938825301L, 938825301L, false, true));
        7zP.A0e(r0.A02).markerStart(416679455, valueOf.hashCode());
        2FT A02 = 2FP.A02(new ABe(r0, 3), ((DKN) 1De.A00(r0.A00, 68643)).A01().A09(A00), 4YV.A11(r0.A03));
        11T.A0D(A02);
        1Kd.A0E(new ABl(r0, valueOf, 416679455), A02);
        generatedThemeCreationFragment.A0N = A02;
        8HG r04 = generatedThemeCreationFragment.A0B;
        if (r04 == null) {
            throw 1BK.A0h();
        }
        1Br.A0D(generatedThemeCreationFragment.A0i, r04, A02);
    }
}
