package X;

import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.5oF, reason: invalid class name */
/* loaded from: 5oF.class */
public final class C5oF implements 5oG {
    public static volatile Capabilities A0D;
    public static volatile HeterogeneousMap A0E;
    public static volatile 5nV A0F;
    public static volatile C5o9 A0G;
    public static volatile C5o7 A0H;
    public final int A00;
    public final long A01;
    public final long A02;
    public final ThreadKey A03;
    public final C07684ke A04;
    public final Capabilities A05;
    public final HeterogeneousMap A06;
    public final 5nV A07;
    public final C5o9 A08;
    public final C5o7 A09;
    public final Throwable A0A;
    public final List A0B;
    public final Set A0C;

    public C5oF(C5o6 c5o6) {
        this.A09 = c5o6.A09;
        this.A05 = c5o6.A05;
        this.A0A = c5o6.A0A;
        this.A01 = c5o6.A01;
        this.A02 = c5o6.A02;
        this.A07 = c5o6.A07;
        this.A00 = c5o6.A00;
        this.A06 = c5o6.A06;
        this.A0B = c5o6.A0B;
        this.A04 = c5o6.A04;
        this.A03 = c5o6.A03;
        this.A08 = c5o6.A08;
        this.A0C = Collections.unmodifiableSet(c5o6.A0C);
    }

    public C5o7 AWk() {
        if (this.A0C.contains("anchoredMessageParams")) {
            return this.A09;
        }
        if (A0H == null) {
            synchronized (this) {
                if (A0H == null) {
                    A0H = C5o7.A02;
                }
            }
        }
        return A0H;
    }

    public Capabilities Abd() {
        if (this.A0C.contains("capabilities")) {
            return this.A05;
        }
        if (A0D == null) {
            synchronized (this) {
                if (A0D == null) {
                    int[] iArr = new int[0];
                    1M7 r0 = Capabilities.A01;
                    11T.A0F(iArr, 0);
                    A0D = Capabilities.A02;
                }
            }
        }
        return A0D;
    }

    public Throwable AkL() {
        return this.A0A;
    }

    public long AtN() {
        return this.A02;
    }

    public 5nV AuM() {
        if (this.A0C.contains("loadMoreData")) {
            return this.A07;
        }
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = 7TD.A00;
                }
            }
        }
        return A0F;
    }

    public int AuO() {
        return this.A00;
    }

    public HeterogeneousMap AxS() {
        if (this.A0C.contains("metadata")) {
            return this.A06;
        }
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    Parcelable.Creator creator = HeterogeneousMap.CREATOR;
                    A0E = C1zz.A02();
                }
            }
        }
        return A0E;
    }

    public List B70() {
        return this.A0B;
    }

    public C07684ke B7A() {
        return this.A04;
    }

    public ThreadKey BF7() {
        return this.A03;
    }

    public C5o9 BFF() {
        if (this.A0C.contains("threadReadState")) {
            return this.A08;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = C5o8.A00;
                }
            }
        }
        return A0G;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5oF)) {
                return false;
            }
            C5oF c5oF = (C5oF) obj;
            if (!11T.A0O(AWk(), c5oF.AWk()) || !11T.A0O(Abd(), c5oF.Abd()) || !11T.A0O(this.A0A, c5oF.A0A) || this.A01 != c5oF.A01 || this.A02 != c5oF.A02 || !11T.A0O(AuM(), c5oF.AuM()) || this.A00 != c5oF.A00 || !11T.A0O(AxS(), c5oF.AxS()) || !11T.A0O(this.A0B, c5oF.A0B) || !11T.A0O(this.A04, c5oF.A04) || !11T.A0O(this.A03, c5oF.A03) || !11T.A0O(BFF(), c5oF.BFF())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(BFF(), C1pq.A04(this.A03, C1pq.A04(this.A04, C1pq.A04(this.A0B, C1pq.A04(AxS(), (C1pq.A04(AuM(), C1pq.A01(C1pq.A01(C1pq.A04(this.A0A, C1pq.A04(Abd(), C1pq.A03(AWk()))), this.A01), this.A02)) * 31) + this.A00)))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ProcessedMessagesStreamImpl{anchoredMessageParams=");
        A0k.append(AWk());
        A0k.append(", capabilities=");
        A0k.append(Abd());
        A0k.append(", error=");
        A0k.append(this.A0A);
        A0k.append(", initialLastReadWatermarkTimeStampMs=");
        A0k.append(this.A01);
        A0k.append(", latestLastReadWatermarkTimeStampMs=");
        A0k.append(this.A02);
        A0k.append(", loadMoreData=");
        A0k.append(AuM());
        A0k.append(", loadingState=");
        A0k.append(this.A00);
        A0k.append(GOm.A00(13));
        A0k.append(AxS());
        A0k.append(", renderableMessages=");
        A0k.append(this.A0B);
        A0k.append(", renderingConfigurationParams=");
        A0k.append(this.A04);
        A0k.append(AbE.A00(16));
        A0k.append(this.A03);
        A0k.append(", threadReadState=");
        A0k.append(BFF());
        return 1BL.A0v(A0k);
    }
}
