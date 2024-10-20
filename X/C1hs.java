package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1hs, reason: invalid class name */
/* loaded from: 1hs.class */
public final class C1hs extends C1hq {
    public final 1Br A00 = 1Bq.A00(16385);
    public final int[] A01 = {5505076, 5520807};

    private final 1CO A00() {
        return (1CO) this.A00.A00.get();
    }

    @Override // X.C1hq
    public List A03() {
        ArrayList arrayList = new ArrayList();
        if (A00().AZk(36324853409796243L)) {
            arrayList.add(new 1iA(5520807, (int) A00().Auy(36606328387149217L)));
            arrayList.add(new 1iA(5505076, (int) A00().Auy(36606328387149217L)));
        }
        if (A00().AZk(36324853409861780L)) {
            arrayList.add(new 1iA(936447229, (int) A00().Auy(36606328387149217L)));
        }
        return arrayList;
    }

    @Override // X.C1hq
    public List A04() {
        ArrayList arrayList = new ArrayList();
        if (A00().AZk(36324853410058391L)) {
            AnonymousClass001.A1J(arrayList, 5505076);
            AnonymousClass001.A1J(arrayList, 5520807);
        }
        if (A00().AZk(36324853410123928L)) {
            AnonymousClass001.A1J(arrayList, 936447229);
        }
        return arrayList;
    }

    @Override // X.C1hq
    public List A05() {
        ArrayList arrayList = new ArrayList();
        if (A00().AZk(36324853410189465L)) {
            AnonymousClass001.A1J(arrayList, 5505076);
            AnonymousClass001.A1J(arrayList, 5520807);
        }
        return arrayList;
    }

    @Override // X.C1hq
    public List A08() {
        ArrayList arrayList = new ArrayList();
        if (A00().AZk(36324853410713755L)) {
            for (int i : this.A01) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @Override // X.C1hq
    public List A09() {
        ArrayList arrayList = new ArrayList();
        if (A00().AZk(36324853409665169L)) {
            arrayList.add(5505076);
        }
        if (A00().AZk(36324853410975902L)) {
            arrayList.add(5520807);
        }
        if (A00().AZk(36324853409730706L)) {
            AnonymousClass001.A1J(arrayList, 936447229);
        }
        return arrayList;
    }

    @Override // X.C1hq
    public List A0A() {
        ArrayList arrayList = new ArrayList();
        if (A00().AZk(36324853410582682L)) {
            int Auy = (int) A00().Auy(36606328387345827L);
            for (int i : this.A01) {
                arrayList.add(new 1iA(i, Auy));
            }
        }
        return arrayList;
    }

    @Override // X.C1hq
    public List A0B() {
        ArrayList arrayList = new ArrayList();
        if (A00().AZk(36324853409927317L)) {
            C1hq.A01(A00(), arrayList, 5520807, 36606328387214754L);
            C1hq.A01(A00(), arrayList, 5505076, 36606328387214754L);
        }
        if (A00().AZk(36324853409992854L)) {
            C1hq.A01(A00(), arrayList, 936447229, 36606328387214754L);
        }
        return arrayList;
    }

    @Override // X.C1hq
    public List A0C() {
        ArrayList arrayList = new ArrayList();
        if (A00().AZk(36324853410779292L)) {
            for (int i : this.A01) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @Override // X.C1hq
    public List A0D() {
        ArrayList arrayList = new ArrayList();
        if (A00().AZk(36324853410844829L)) {
            int Auy = (int) A00().Auy(36606328387607972L);
            for (int i : this.A01) {
                arrayList.add(new 1iA(i, Auy));
            }
        }
        return arrayList;
    }
}
