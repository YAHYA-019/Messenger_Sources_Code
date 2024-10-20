package X;

import com.facebook.acra.constants.ActionId;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: I9O.class */
public final class I9O {
    public static volatile Integer A0E;
    public static volatile Integer A0F;
    public final long A00;
    public final long A01;
    public final long A02;
    public final C3Oh A03;
    public final ImmutableMap A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final Set A0C;
    public final byte[] A0D;

    public I9O(I4y i4y) {
        ImmutableMap immutableMap = i4y.A04;
        C1pq.A08("capabilities", immutableMap);
        this.A04 = immutableMap;
        this.A05 = i4y.A05;
        this.A07 = i4y.A07;
        C3Oh c3Oh = i4y.A03;
        C1pq.A08("endpointInfo", c3Oh);
        this.A03 = c3Oh;
        this.A08 = i4y.A08;
        this.A09 = i4y.A09;
        this.A00 = i4y.A00;
        this.A01 = i4y.A01;
        this.A02 = i4y.A02;
        this.A0D = i4y.A0D;
        this.A06 = i4y.A06;
        this.A0A = i4y.A0A;
        this.A0B = i4y.A0B;
        this.A0C = Collections.unmodifiableSet(i4y.A0C);
    }

    public static String A00(I9O i9o) {
        String str = i9o.A03.A03;
        11T.A0A(str);
        return str;
    }

    public static String A01(Iterator it) {
        return ((I9O) it.next()).A03.A03;
    }

    private Integer A02() {
        if (this.A0C.contains("coworkerStatus")) {
            return this.A05;
        }
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    A0E = 0S2.A00;
                }
            }
        }
        return A0E;
    }

    public Integer A03() {
        if (this.A0C.contains("participantSource")) {
            return this.A06;
        }
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = 0S2.A00;
                }
            }
        }
        return A0F;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof I9O)) {
                return false;
            }
            I9O i9o = (I9O) obj;
            if (!11T.A0O(this.A04, i9o.A04) || A02() != i9o.A02() || !11T.A0O(this.A07, i9o.A07) || !11T.A0O(this.A03, i9o.A03) || !11T.A0O(this.A08, i9o.A08) || !11T.A0O(this.A09, i9o.A09) || this.A00 != i9o.A00 || this.A01 != i9o.A01 || this.A02 != i9o.A02 || !11T.A0O(this.A0D, i9o.A0D) || A03() != i9o.A03() || !11T.A0O(this.A0A, i9o.A0A) || !11T.A0O(this.A0B, i9o.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A0D, C1pq.A01(C1pq.A01(C1pq.A01(C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A03, C1pq.A04(this.A07, (C1pq.A03(this.A04) * 31) + C3o5.A04(A02()))))), this.A00), this.A01), this.A02));
        Integer A03 = A03();
        if (A03 != null) {
            i = A03.intValue();
        }
        return C1pq.A04(this.A0B, C1pq.A04(this.A0A, (A04 * 31) + i));
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FbWebrtcConferenceParticipantInfo{capabilities=");
        A0k.append(this.A04);
        A0k.append(", coworkerStatus=");
        Integer A02 = A02();
        if (A02 != null) {
            switch (A02.intValue()) {
                case 1:
                    str = "COWORKER";
                    break;
                case 2:
                    str = "FOREIGN_USER";
                    break;
                case 3:
                    str = "LIMITED_USER";
                    break;
                case 4:
                    str = "LIMITED_OR_VC_ONLY";
                    break;
                default:
                    str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                    break;
            }
        } else {
            str = "null";
        }
        A0k.append(str);
        A0k.append(DKB.A00(ActionId.PRIVACY_VIOLATION));
        A0k.append(this.A07);
        A0k.append(", endpointInfo=");
        A0k.append(this.A03);
        A0k.append(AbE.A00(98));
        A0k.append(this.A08);
        A0k.append(", fullName=");
        A0k.append(this.A09);
        A0k.append(", lastConnectedTime=");
        A0k.append(this.A00);
        A0k.append(", lastDominantSpeakerTime=");
        A0k.append(this.A01);
        A0k.append(", lastUpdateTime=");
        A0k.append(this.A02);
        A0k.append(", participantIdentityKey=");
        A0k.append(Arrays.toString(this.A0D));
        A0k.append(", participantSource=");
        A0k.append(3HI.A00(A03()));
        A0k.append(", profilePictureUri=");
        A0k.append(this.A0A);
        A0k.append(", workCompanyName=");
        return GOq.A12(this.A0B, A0k);
    }
}
