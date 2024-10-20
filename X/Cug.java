package X;

import android.text.TextUtils;
import android.view.View;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Collections;
import java.util.Set;

/* loaded from: Cug.class */
public final class Cug implements DG9 {
    public static volatile HeterogeneousMap A0F;
    public static volatile Boolean A0G;
    public final long A00;
    public final View.OnClickListener A01;
    public final BNV A02;
    public final C6t A03;
    public final CHv A04;
    public final CII A05;
    public final C6u A06;
    public final C7J A07;
    public final EL0 A08;
    public final CharSequence A09;
    public final CharSequence A0A;
    public final boolean A0B;
    public final HeterogeneousMap A0C;
    public final Boolean A0D;
    public final Set A0E;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v82, types: [int] */
    /* JADX WARN: Type inference failed for: r0v84, types: [int] */
    /* JADX WARN: Type inference failed for: r0v86, types: [int] */
    public Cug(CQg cQg) {
        this.A01 = cQg.A01;
        this.A03 = cQg.A03;
        this.A00 = cQg.A00;
        this.A0D = cQg.A0A;
        this.A0C = cQg.A09;
        this.A04 = cQg.A04;
        this.A05 = cQg.A05;
        this.A06 = cQg.A06;
        this.A0B = cQg.A0E;
        this.A09 = cQg.A0B;
        CharSequence charSequence = cQg.A0C;
        AbF.A1V(charSequence);
        this.A0A = charSequence;
        this.A08 = cQg.A08;
        this.A07 = cQg.A07;
        BNV bnv = cQg.A02;
        C1pq.A08("viewType", bnv);
        this.A02 = bnv;
        this.A0E = Collections.unmodifiableSet(cQg.A0D);
        02W.A05(AnonymousClass001.A1N((this.A00 > 0L ? 1 : (this.A00 == 0L ? 0 : -1))));
        02W.A05(!TextUtils.isEmpty(this.A0A));
        this.A02.getClass();
        boolean z = false;
        boolean A1T = AnonymousClass001.A1T(this.A03);
        A1T = this.A07 != null ? (A1T ? 1 : 0) + 1 : A1T;
        A1T = this.A04 != null ? (A1T ? 1 : 0) + 1 : A1T;
        02W.A06((this.A06 != null ? (A1T ? 1 : 0) + 1 : A1T) <= 1 ? true : z, "We only support one type of accessory for the view model");
    }

    public HeterogeneousMap A00() {
        if (this.A0E.contains("metadataMap")) {
            return this.A0C;
        }
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = AbF.A0z();
                }
            }
        }
        return A0F;
    }

    public Boolean A01() {
        if (this.A0E.contains("isEnabled")) {
            return this.A0D;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = AnonymousClass001.A0K();
                }
            }
        }
        return A0G;
    }

    @Override // X.DG9
    public BNV BKB() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Cug)) {
                return false;
            }
            Cug cug = (Cug) obj;
            if (!11T.A0O(this.A01, cug.A01) || !11T.A0O(this.A03, cug.A03) || this.A00 != cug.A00 || !11T.A0O(A01(), cug.A01()) || !11T.A0O(A00(), cug.A00()) || !11T.A0O(this.A04, cug.A04) || !11T.A0O(this.A05, cug.A05) || !11T.A0O(this.A06, cug.A06) || this.A0B != cug.A0B || !11T.A0O(this.A09, cug.A09) || !11T.A0O(this.A0A, cug.A0A) || this.A08 != cug.A08 || !11T.A0O(this.A07, cug.A07) || this.A02 != cug.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A07, (C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A02(C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(A00(), C1pq.A04(A01(), C1pq.A01(C1pq.A04(this.A03, C1pq.A03(this.A01)), this.A00)))) * 31 * 31)), this.A0B))) * 31) + C3o5.A03(this.A08));
        BNV bnv = this.A02;
        if (bnv != null) {
            i = bnv.ordinal();
        }
        return (A04 * 31) + i;
    }
}
