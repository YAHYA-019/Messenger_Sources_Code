package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;

/* renamed from: X.Jmu, reason: case insensitive filesystem */
/* loaded from: Jmu.class */
public final class C3217Jmu extends L2Z {
    public 2JX A00;
    public LithoView A01;
    public View A02;
    public final 1Br A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3217Jmu(View view, LET let, C11474wl c11474wl, C3243Jnf c3243Jnf, 50L r306) {
        super(let, c11474wl, c3243Jnf);
        7zS.A17(3, view, let, c11474wl);
        1Br A01 = 1Bu.A01(4YU.A08(view), 16428);
        this.A03 = A01;
        this.A02 = view;
        LXT lxt = new LXT(this);
        FbUserSession A03 = 1Br.A03(A01);
        if (r306 != null) {
            50M r0 = r306.A02;
            GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
            graphQlQueryParamSet.A01(((C3t8) r0.A04.get()).A00(), "nt_context");
            LfP.A00(JR2.A0N(A03, graphQlQueryParamSet, new 2Jf(2JX.class, (Class) null, "FBIABAutofillBloksGraphQLRootQuery", (String) null, "fbandroid", -1477252608, 0, 3067395366L, 3067395366L, false, true), r0), lxt, r0, 9);
        }
    }

    public void A02() {
        C3243Jnf c3243Jnf;
        LET let;
        KqR kqR;
        if (this.A00 != null) {
            if (this.A01 == null) {
                this.A01 = (LithoView) this.A02.findViewById(2131364513);
                ((L2Z) this).A04.put("on_accept_payment_autofill", new FEV(new GAa(this, 0)));
            }
            if (!((L2Z) this).A00 || (let = (c3243Jnf = ((L2Z) this).A03).A03) == null || (kqR = let.A06) == null) {
                return;
            }
            Observer A00 = LR8.A00(this, 8);
            LifecycleOwner lifecycleOwner = ((L5Y) c3243Jnf).A04;
            if (!(lifecycleOwner instanceof LifecycleOwner)) {
                LEA.A07(c3243Jnf.A06(), c3243Jnf.A0c, L8t.A00(c3243Jnf.A0b, "NULL_LIFE_CYCLE_OWNER").A01());
            } else if (lifecycleOwner != null) {
                kqR.A00().observe(lifecycleOwner, A00);
            }
        }
    }
}
