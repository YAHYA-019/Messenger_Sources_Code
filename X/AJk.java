package X;

import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;

/* loaded from: AJk.class */
public final class AJk extends 0DO implements C0Bd {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJk(Object obj, 0DR r303, int i) {
        super(3, r303);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A00;
        0DR r0 = (0DR) obj3;
        Object obj4 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            default:
                i = 5;
                break;
        }
        return new AJk(obj4, r0, i).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A00;
        0Dt.A00(obj);
        switch (i) {
            case 0:
                0Xs r0 = ((9Vb) this.A01).A07;
                do {
                } while (!r0.AGt(r0.getValue(), new C87p(false, 1)));
            case 1:
                ((8Cw) this.A01).A02.set("isLoading", 1BK.A0d());
                break;
            case 2:
                9Vr r02 = (9Vr) this.A01;
                int i2 = r02.A00 - 1;
                r02.A00 = i2;
                if (i2 == 0) {
                    IDO.A00.A03("SessionAudioLevelsProvider", "No more collectors. Stopping audio level updates.", (Throwable) null);
                    C2a2 c2a2 = r02.A04;
                    if (c2a2 != null) {
                        c2a2.AE0(null);
                    }
                    r02.A04 = null;
                    break;
                }
                break;
            case 3:
                EpA epA = (EpA) this.A01;
                Egu egu = epA.A00;
                if (egu != null) {
                    epA.A02.A00.remove(egu);
                }
                epA.A00 = null;
                break;
            default:
                FIg fIg = ((WriteSuggestionsRepository) this.A01).A03;
                FIg.A03(fIg, "query_end");
                FIg.A02(fIg, "query_end");
                break;
        }
        return 04S.A00;
    }
}
