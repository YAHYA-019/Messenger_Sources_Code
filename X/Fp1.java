package X;

import com.facebook.graphql.enums.GraphQLPrivacyFlowTriggerBehavior;

/* loaded from: Fp1.class */
public final class Fp1 implements C7z6 {
    public final /* synthetic */ C06524h5 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public Fp1(C06524h5 c06524h5, String str, String str2, String str3) {
        this.A00 = c06524h5;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // X.C7z6
    public String Amp() {
        return this.A01;
    }

    @Override // X.C7z6
    public String Axx() {
        return this.A02;
    }

    @Override // X.C7z6
    public String Axz() {
        return this.A03;
    }

    @Override // X.C7z6
    public GraphQLPrivacyFlowTriggerBehavior BH7() {
        return GraphQLPrivacyFlowTriggerBehavior.DEFAULT_LAUNCH;
    }

    @Override // X.C7z6
    public int BHH() {
        return 0;
    }

    @Override // X.C7z6
    public boolean BNg() {
        return false;
    }
}
