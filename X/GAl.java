package X;

import androidx.lifecycle.ViewModelKt;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;
import kotlin.jvm.functions.Function1;

/* loaded from: GAl.class */
public final class GAl extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAl(Object obj, String str, String str2, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            11T.A0F(obj, 0);
            EKK ekk = (EKK) this.A01;
            ekk.A0H.invoke(obj);
            if (obj instanceof EKC) {
                DSA dsa = ekk.A00;
                if (dsa == null) {
                    11T.A0L("viewModel");
                    throw 0Q8.createAndThrow();
                }
                String str = this.A03;
                String str2 = this.A02;
                boolean z = this.A04;
                EJi eJi = EJi.A00;
                DSA.A03(dsa, eJi);
                ImagineGenerationImageRepository imagineGenerationImageRepository = dsa.A0G;
                imagineGenerationImageRepository.A00 = true;
                if (z) {
                    DSA.A03(dsa, eJi);
                }
                if (dsa.A0I.A0D) {
                    imagineGenerationImageRepository.A0A.clear();
                    imagineGenerationImageRepository.A09.clear();
                }
                if (str != null) {
                    if (!DSA.A08(dsa, str)) {
                        str = 0Pz.A0W("me ", str);
                    }
                    DSA.A05(dsa, (FA6) null, str, str2);
                } else {
                    if (!1BK.A1Y(imagineGenerationImageRepository.A0A)) {
                        G95.A04(dsa, ViewModelKt.getViewModelScope(dsa), 9);
                    }
                    DSA.A02(dsa, new EJX(dsa.A05, false), false);
                }
            }
            ekk.A0A.A03();
        } else {
            C1ru c1ru = (C1ru) obj;
            11T.A0F(c1ru, 0);
            c1ru.D73((6CS) this.A01, this.A03, this.A02, this.A04);
        }
        return 04S.A00;
    }
}
