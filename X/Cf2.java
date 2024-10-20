package X;

import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;

/* loaded from: Cf2.class */
public final class Cf2 implements DK5 {
    public final DK5 A00;
    public final C1325Ae3 A01;
    public final DHt A02;
    public final DFe A03;

    public Cf2(DK5 dk5, DHt dHt) {
        Cpq cpq = new Cpq(this, 1);
        this.A03 = cpq;
        this.A01 = new C1325Ae3();
        this.A00 = dk5;
        this.A02 = dHt;
        dk5.A5L(cpq);
    }

    public void A5L(DFe dFe) {
        this.A01.A00(dFe);
    }

    public void ASQ(CharSequence charSequence) {
        this.A00.ASS(this.A02, charSequence);
    }

    public void ASS(DHt dHt, CharSequence charSequence) {
        this.A00.ASS(new S3j(this, dHt), charSequence);
    }

    public DataSourceIdentifier AgX() {
        return this.A00.AgX();
    }

    public Qo5 BCA() {
        return this.A00.BCA();
    }

    @Override // X.DK5
    public void BOl(DEZ dez) {
        this.A00.BOl(dez);
    }

    @Override // X.DK5
    public void BPx() {
        this.A00.BPx();
    }

    @Override // X.DK5
    public void Clc(ImmutableList immutableList) {
        this.A00.Clc(immutableList);
    }

    public /* bridge */ /* synthetic */ C1323Ae1 Cpm(ByH byH, Object obj) {
        return this.A00.Cpm(byH, obj);
    }

    @Override // X.DK5
    public void CuB(DEY dey) {
        this.A00.CuB(dey);
    }

    @Override // X.DK5
    public void CuT(String str) {
        this.A00.CuT(str);
    }

    public String getFriendlyName() {
        return 0Pz.A0j("WrapperFilter wrapping {", this.A00.getFriendlyName(), "}");
    }
}
