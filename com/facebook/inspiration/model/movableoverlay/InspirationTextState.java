package com.facebook.inspiration.model.movableoverlay;

import X.0Q8;
import X.11T;
import X.1BM;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbJ;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FKc;
import X.N2X;
import X.QoE;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationTextState.class */
public final class InspirationTextState implements Parcelable {
    public static volatile QoE A0A;
    public static final Parcelable.Creator CREATOR = new FKc(54);
    public final InspirationPollInfo A00;
    public final TextToolActiveState A01;
    public final QoE A02;
    public final Set A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    /* loaded from: InspirationTextState$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            N2X n2x = new N2X();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1741863256:
                                if (A1C.equals("inspiration_poll_info_backup")) {
                                    n2x.A00 = (InspirationPollInfo) AbstractC11224vw.A02(abstractC01033pi, c27t, InspirationPollInfo.class);
                                    break;
                                }
                                break;
                            case -1384549254:
                                if (A1C.equals("has_entered_text")) {
                                    n2x.A05 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -1055757798:
                                if (A1C.equals("is_mention_drop_down_shown")) {
                                    n2x.A09 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -812628197:
                                if (A1C.equals("has_entered_non_white_space_text")) {
                                    n2x.A04 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -87973415:
                                if (A1C.equals("open_reason")) {
                                    n2x.A00((QoE) AbstractC11224vw.A02(abstractC01033pi, c27t, QoE.class));
                                    break;
                                }
                                break;
                            case 672268369:
                                if (A1C.equals("has_hashtag_or_mention_symbol")) {
                                    n2x.A06 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 722550477:
                                if (A1C.equals("text_tool_active_state")) {
                                    n2x.A01 = (TextToolActiveState) AbstractC11224vw.A02(abstractC01033pi, c27t, TextToolActiveState.class);
                                    break;
                                }
                                break;
                            case 911888717:
                                if (A1C.equals("is_keyboard_open")) {
                                    n2x.A08 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 2038325047:
                                if (A1C.equals("is_creating_text_before_pause")) {
                                    n2x.A07 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationTextState.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationTextState(n2x);
        }
    }

    /* loaded from: InspirationTextState$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationTextState inspirationTextState = (InspirationTextState) obj;
            r302.A0b();
            boolean z = inspirationTextState.A04;
            r302.A0o("has_entered_non_white_space_text");
            r302.A0v(z);
            boolean z2 = inspirationTextState.A05;
            r302.A0o("has_entered_text");
            r302.A0v(z2);
            boolean z3 = inspirationTextState.A06;
            r302.A0o("has_hashtag_or_mention_symbol");
            r302.A0v(z3);
            AbstractC11224vw.A05(r302, c26c, inspirationTextState.A00, "inspiration_poll_info_backup");
            boolean z4 = inspirationTextState.A07;
            r302.A0o("is_creating_text_before_pause");
            r302.A0v(z4);
            boolean z5 = inspirationTextState.A08;
            r302.A0o("is_keyboard_open");
            r302.A0v(z5);
            boolean z6 = inspirationTextState.A09;
            r302.A0o("is_mention_drop_down_shown");
            r302.A0v(z6);
            AbstractC11224vw.A05(r302, c26c, inspirationTextState.A00(), "open_reason");
            AbstractC11224vw.A05(r302, c26c, inspirationTextState.A01, "text_tool_active_state");
            r302.A0Y();
        }
    }

    public InspirationTextState(N2X n2x) {
        this.A04 = n2x.A04;
        this.A05 = n2x.A05;
        this.A06 = n2x.A06;
        this.A00 = n2x.A00;
        this.A07 = n2x.A07;
        this.A08 = n2x.A08;
        this.A09 = n2x.A09;
        this.A02 = n2x.A02;
        this.A01 = n2x.A01;
        this.A03 = Collections.unmodifiableSet(n2x.A03);
    }

    public InspirationTextState(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A04 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A05 = 1BM.A07(parcel);
        this.A06 = 1BM.A07(parcel);
        TextToolActiveState textToolActiveState = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (InspirationPollInfo) parcel.readParcelable(A0e);
        }
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A09 = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = QoE.values()[parcel.readInt()];
        }
        this.A01 = parcel.readInt() != 0 ? (TextToolActiveState) parcel.readParcelable(A0e) : textToolActiveState;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public QoE A00() {
        if (this.A03.contains("openReason")) {
            return this.A02;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = QoE.A03;
                }
            }
        }
        return A0A;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationTextState)) {
                return false;
            }
            InspirationTextState inspirationTextState = (InspirationTextState) obj;
            if (this.A04 != inspirationTextState.A04 || this.A05 != inspirationTextState.A05 || this.A06 != inspirationTextState.A06 || !11T.A0O(this.A00, inspirationTextState.A00) || this.A07 != inspirationTextState.A07 || this.A08 != inspirationTextState.A08 || this.A09 != inspirationTextState.A09 || A00() != inspirationTextState.A00() || !11T.A0O(this.A01, inspirationTextState.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A00, C1pq.A02(C1pq.A02(C1pq.A05(this.A04), this.A05), this.A06)), this.A07), this.A08), this.A09);
        return C1pq.A04(this.A01, (A02 * 31) + C3o5.A03(A00()));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationTextState{hasEnteredNonWhiteSpaceText=");
        A0k.append(this.A04);
        A0k.append(", hasEnteredText=");
        A0k.append(this.A05);
        A0k.append(", hasHashtagOrMentionSymbol=");
        A0k.append(this.A06);
        A0k.append(", inspirationPollInfoBackup=");
        A0k.append(this.A00);
        A0k.append(", isCreatingTextBeforePause=");
        A0k.append(this.A07);
        A0k.append(", isKeyboardOpen=");
        A0k.append(this.A08);
        A0k.append(", isMentionDropDownShown=");
        A0k.append(this.A09);
        A0k.append(", openReason=");
        A0k.append(A00());
        A0k.append(", textToolActiveState=");
        return AbstractC2327GOs.A0U(this.A01, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        C3o5.A0d(parcel, this.A00, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        C3o5.A0e(parcel, this.A02);
        C3o5.A0d(parcel, this.A01, i);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
