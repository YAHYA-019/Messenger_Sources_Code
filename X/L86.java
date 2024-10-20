package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: L86.class */
public final class L86 {
    public static final L86 A03 = new L86(true);
    public boolean A00;
    public boolean A01;
    public final LyG A02;

    public L86() {
        this.A00 = false;
        this.A02 = new LyG(16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Iterable] */
    public L86(boolean z) {
        this.A00 = false;
        LyG lyG = new LyG(0);
        this.A02 = lyG;
        if (this.A01) {
            return;
        }
        if (!lyG.A02) {
            if (0 < lyG.A00.size()) {
                ((Map.Entry) lyG.A00.get(0)).getKey();
                throw AnonymousClass001.A0Q("isRepeated");
            }
            Iterator it = (lyG.A01.isEmpty() ? KcJ.A00 : lyG.A01.entrySet()).iterator();
            if (it.hasNext()) {
                AnonymousClass001.A0z(it).getKey();
                throw AnonymousClass001.A0Q("isRepeated");
            }
        }
        if (!lyG.A02) {
            lyG.A01 = lyG.A01.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(lyG.A01);
            lyG.A02 = true;
        }
        this.A01 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Iterable] */
    public /* bridge */ /* synthetic */ Object clone() {
        Map.Entry A0z;
        L86 l86 = new L86();
        LyG lyG = this.A02;
        if (0 < lyG.A00.size()) {
            A0z = (Map.Entry) lyG.A00.get(0);
        } else {
            Iterator it = (lyG.A01.isEmpty() ? KcJ.A00 : lyG.A01.entrySet()).iterator();
            if (!it.hasNext()) {
                l86.A00 = this.A00;
                return l86;
            }
            A0z = AnonymousClass001.A0z(it);
        }
        A0z.getKey();
        A0z.getValue();
        throw AnonymousClass001.A0Q("isRepeated");
    }
}
