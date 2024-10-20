package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.3Oh, reason: invalid class name */
/* loaded from: 3Oh.class */
public final class C3Oh {
    public static volatile 2QW A0B;
    public static volatile Optional A0C;
    public static volatile Optional A0D;
    public final 2QW A00;
    public final Optional A01;
    public final Optional A02;
    public final String A03;
    public final String A04;
    public final Set A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C3Oh(2QW r302, Optional optional, Optional optional2, String str, String str2, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = z;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        this.A03 = str;
        this.A00 = r302;
        this.A07 = z2;
        this.A01 = optional;
        this.A04 = str2;
        this.A08 = z3;
        this.A09 = z4;
        this.A0A = z5;
        this.A02 = optional2;
        this.A05 = Collections.unmodifiableSet(set);
    }

    private Optional A01() {
        if (this.A05.contains("screenVideoSsrc")) {
            return this.A01;
        }
        if (A0C == null) {
            synchronized (this) {
                if (A0C == null) {
                    A0C = Absent.INSTANCE;
                }
            }
        }
        return A0C;
    }

    public 2QW A00() {
        if (this.A05.contains("participantState")) {
            return this.A00;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = 2QW.A0G;
                }
            }
        }
        return A0B;
    }

    public Optional A02() {
        if (this.A05.contains("videoSsrc")) {
            return this.A02;
        }
        if (A0D == null) {
            synchronized (this) {
                if (A0D == null) {
                    A0D = Absent.INSTANCE;
                }
            }
        }
        return A0D;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3Oh)) {
                return false;
            }
            C3Oh c3Oh = (C3Oh) obj;
            if (this.A06 != c3Oh.A06 || !11T.A0O(this.A03, c3Oh.A03) || A00() != c3Oh.A00() || this.A07 != c3Oh.A07 || !11T.A0O(A01(), c3Oh.A01()) || !11T.A0O(this.A04, c3Oh.A04) || this.A08 != c3Oh.A08 || this.A09 != c3Oh.A09 || this.A0A != c3Oh.A0A || !11T.A0O(A02(), c3Oh.A02())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A05(this.A06));
        2QW A00 = A00();
        return C1pq.A04(A02(), C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A04, C1pq.A04(A01(), C1pq.A02((A04 * 31) + (A00 == null ? -1 : A00.ordinal()), this.A07))), this.A08), this.A09), this.A0A));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FbWebrtcParticipantInfo{audioOn=");
        A0k.append(this.A06);
        A0k.append(", id=");
        A0k.append(this.A03);
        A0k.append(", participantState=");
        A0k.append(A00());
        A0k.append(", screenVideoOn=");
        A0k.append(this.A07);
        A0k.append(", screenVideoSsrc=");
        A0k.append(A01());
        A0k.append(", videoCname=");
        A0k.append(this.A04);
        A0k.append(", videoOn=");
        A0k.append(this.A08);
        A0k.append(", videoPausedDownlink=");
        A0k.append(this.A09);
        A0k.append(", videoPausedUplink=");
        A0k.append(this.A0A);
        A0k.append(", videoSsrc=");
        A0k.append(A02());
        return 1BL.A0v(A0k);
    }
}
